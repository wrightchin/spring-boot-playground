# Spring Boot with PostgresDB
### Usage

Docker run the PostgresDB image
```agsl
docker run --name postgres-spring -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine

docker exec -it [contsiner_id] bin/bash
```
Connect to the PostgresDB server
```agsl
psql -U [db_username]
```
List the list of database
```agsl
\l
```
Create database "demodb"
```agsl
CREATE DATABASE demodb
```
Check the relations
```agsl
\dt
```
Check the table
```agsl
\d person
```

