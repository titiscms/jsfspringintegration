DROP TABLE IF EXISTS pessoa;

CREATE TABLE pessoa (
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(250) NOT NULL,
  cpf VARCHAR(11) NOT NULL
);

INSERT INTO pessoa (nome, cpf) VALUES
  ('Maria Aparecida', '71659556074'),
  ('João Silva', '21608874044'),
  ('Leticia Machado', '36687887076'),
  ('Paulo Oliveira', '17101607055'),
  ('Gustavo Rodrigues', '43823581082');