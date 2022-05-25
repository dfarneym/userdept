
# Projeto Java Web no Spring Boot
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/dfarneym/userdept/blob/main/LICENCE) 

## Sobre o projeto

Usuários e departamentos é um pequeno sistema (API REST) com os seguintes casos de uso:

- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário

## Modelo conceitual
![Modelo Conceitual](https://user-images.githubusercontent.com/53848638/170318466-31582fb6-b476-4886-bdcc-47cb1b2cffbe.PNG)

-[DevSuperior](https://www.youtube.com/c/DevSuperior

## Modelo relacional -> objeto -> json
![Modelo relacional](https://user-images.githubusercontent.com/53848638/170319921-2596bd01-793a-4eac-9772-9833bc4d4cf7.PNG)

-[DevSuperior](https://www.youtube.com/c/DevSuperior

- A filgura acima temos a tabela de departamento do banco de dados com chave estrangeira sendo covertida do modelo relacional para o modelo de objetos em uma linguagem de programação fazendo a tranformação com o ORM(Mapeamento Objeto relacional), facilitando assim essa convenção.

**Foi construído durante uma vídeo aula da [DevSuperior](https://www.youtube.com/c/DevSuperior  "No canal da DevSuperior")** 

A API(REST) consiste em listar os usuários e seus respectivos departamentos, onde posso fazer uma busca tanto por todos os usuários do sistema como pelo seu Id, também posso adicionar um novo usuários e seu departamentos.

# Tecnologias utilizadas
- Java
- Spring Boot
- JPA 
- Banco de dados H2 em mémoria

# Ferramentas
- Spring Tool Suite 4
- Postman
- Spring Initializr

# Como executar o projeto

Pré-requisitos: Java 11

```bash
# clonar repositório
git clone git@github.com:dfarneym/userdept.git

# entrar na pasta do projeto
cd userdept

# executar o projeto
no Boot Dashdoard startar o projeto "userdept[:8080]"

```
Daniel Farney
https://www.linkedin.com/in/d-farney
