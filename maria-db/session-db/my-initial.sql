
create database sessionDB;

GRANT ALL PRIVILEGES ON sessionDB.* TO 'root'@'%' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON sessionDB.* TO 'root'@'localhost' IDENTIFIED BY 'root';
USE sessionDB


CREATE TABLE `session_info` (
  `id` varchar(36) COLLATE utf8mb4_unicode_ci NOT NULL,
  `username` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token_id` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `access_token` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `expiring` int(11) NOT NULL,
  `date_created` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

