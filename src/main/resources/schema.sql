DROP TABLE IF EXISTS CAR;

CREATE TABLE CAR (
  id    BIGINT SERIAL PRIMARY KEY NOT NULL,
  model VARCHAR(255)              NOT NULL,
  year  INT                       NOT NULL
);