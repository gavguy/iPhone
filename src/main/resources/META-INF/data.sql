insert into users (id, login_name, password_hash, role_name) values (-1, 'user', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'USER')
insert into users (id, login_name, password_hash, role_name) values (-2, 'manager', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'MANAGER')
insert into users (id, login_name, password_hash, role_name) values (-3, 'admin', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'ADMIN')

insert into phones (id, owner, product, version, ios, color, cover, country, serialNr, year, information) values (-1, 'andrey andrey', 'smartfone', '5s', 'ios-12', 'white', 'classic/special Edition', 'chine', '314526734635', 2000,'zarabotaj')
insert into phones (id, owner, product, version, ios, color, cover, country, serialNr, year, information) values (-2, 'artem artem', 'nokia', '5s', 'ios-12', 'white', 'classic/special Edition', 'chine', '98765456', 2000, 'ti uze')
insert into phones (id, owner, product, version, ios, color, cover, country, serialNr, year, information) values (-3, 'igorj igorj', 'ipod', '5s', 'ios-12', 'white', 'classic/special Edition', 'chine', '12345678', 1998,'nakonech')
insert into phones (id, owner, product, version, ios, color, cover, country, serialNr, year, information) values (-4, 'ivan ivan', 'wirelees moyse', '5s', 'ios-12', 'white', 'classic/special Edition', 'chine', '98764300', 1999,'v konce to koncov')

insert into reservations (id, user_id, book_id, status, created) values (-1, -1, -1, 'TAKEN', '2019-02-16')