-- Criação da tabela PRODUTOS
CREATE TABLE dbo.PRODUTOS (
                              ID BIGINT IDENTITY(1,1) PRIMARY KEY,          -- ID único e auto incrementado
                              NOME NVARCHAR(100) NOT NULL,                 -- Nome do produto (obrigatório)
                              PRECO DECIMAL(10,2) NOT NULL,                -- Preço do produto (obrigatório)
                              QUANTIDADE INT NOT NULL DEFAULT 0            -- Quantidade em estoque (obrigatório, com padrão 0)
);