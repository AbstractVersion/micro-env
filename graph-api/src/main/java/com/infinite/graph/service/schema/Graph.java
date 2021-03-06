/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinite.graph.service.schema;

import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.logger.LoggerLevel;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.requests.extensions.GraphServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author onelove
 */
@Slf4j
public class Graph {
    
    protected static IGraphServiceClient graphClient = null;
    protected static MicrosoftGraphAuthenticationProvider authProvider = null;

    protected static void ensureGraphClient(String accessToken) {
        // Create the auth providerensureGraphClient
        log.debug("Generating Authentication provider");
        authProvider = new MicrosoftGraphAuthenticationProvider(accessToken);

        // Create default logger to only log errors
        DefaultLogger logger = new DefaultLogger();
        logger.setLoggingLevel(LoggerLevel.ERROR);

        // Build a Graph client
        graphClient = GraphServiceClient.builder()
                .authenticationProvider(authProvider)
                .logger(logger)
                .buildClient();
    }

}
