/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.loja;

/**
 *
 * @author Aluno
 */
public class Processador extends Produto {
    
        private int modo_operacao;
        private String socket;
        private int frequencia;
        private int cache;

    /**
     * @return the modo_operacao
     */
    public int getModo_operacao() {
        return modo_operacao;
    }

    /**
     * @param modo_operacao the modo_operacao to set
     */
    public void setModo_operacao(int modo_operacao) {
        this.modo_operacao = modo_operacao;
    }

    /**
     * @return the socket
     */
    public String getSocket() {
        return socket;
    }

    /**
     * @param socket the socket to set
     */
    public void setSocket(String socket) {
        this.socket = socket;
    }

    /**
     * @return the frequencia
     */
    public int getFrequencia() {
        return frequencia;
    }

    /**
     * @param frequencia the frequencia to set
     */
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    /**
     * @return the cache
     */
    public int getCache() {
        return cache;
    }

    /**
     * @param cache the cache to set
     */
    public void setCache(int cache) {
        this.cache = cache;
    }
}
