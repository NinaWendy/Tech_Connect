CREATE DATABASE tech_connect;
\c tech_connect;

CREATE TABLE IF NOT EXISTS services(
id SERIAL PRIMARY KEY,
 service VARCHAR,
 hours VARCHAR,
 hourly_price VARCHAR,
 user_id INTEGER
);

CREATE TABLE IF NOT EXISTS clients(
id SERIAL PRIMARY KEY,
name VARCHAR,
email VARCHAR,
contact VARCHAR
);

CREATE DATABASE tech_connect_test WITH TEMPLATE tech_connect;