INSERT INTO users(username, password, enabled) values
('user', 'password', true),
('banny', 'banny', true),
('jon', 'jon', false),
('admin', 'admin', true);

INSERT INTO authorities (username, authority) values
('user', 'ROLE_USER'),
('banny', 'ROLE_USER'),
('admin', 'ROLE_ADMIN');