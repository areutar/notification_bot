--liquibase formatted sql

--changeset anton:delete-column-notifications_number

alter table users
drop column notifications_number;