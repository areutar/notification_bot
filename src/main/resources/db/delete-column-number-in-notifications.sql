--liquibase formatted sql

--changeset anton:delete-column-number

alter table notifications
drop column number;