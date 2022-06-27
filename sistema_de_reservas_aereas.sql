create database sistema_de_reservas_aereas;

use sistema_de_reservas_aereas;

create table usuario (
    id_usuario int primary key auto_increment,
    nome_usuario varchar(45),
    email_usuario varchar(45),
    senha_usuario varchar(45)
);