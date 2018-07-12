-- liquibase formatted sql

-- changeset action:alter_table_books
ALTER TABLE book ADD description VARCHAR(4000);
