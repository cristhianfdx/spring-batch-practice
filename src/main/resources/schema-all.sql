DROP TABLE persona IF EXISTS;

CREATE TABLE persona(
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    nombre VARCHAR(40),
    apellido VARCHAR(40),
    telefono VARCHAR (15)
);