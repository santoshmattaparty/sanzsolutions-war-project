CREATE DATABASE IF NOT EXISTS sanzsolutions;

USE sanzsolutions;

CREATE TABLE inquiry (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    message TEXT
);