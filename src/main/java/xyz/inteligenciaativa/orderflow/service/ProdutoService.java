package xyz.inteligenciaativa.orderflow.service;

import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.seuprojeto.jooq.tables.Produtos.PRODUTOS;

@Service
public class ProdutoService {

    private final DSLContext dsl;

    public ProdutoService(DSLContext dsl) {
        this.dsl = dsl;
    }

    public List<String> obterNomesProdutos() {
        return dsl.select(PRODUTOS.NOME)
                .from(PRODUTOS)
                .fetchInto(String.class);
    }
}
