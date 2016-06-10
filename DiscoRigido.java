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
public class DiscoRigido extends Produto {
    
    private int capacidade;
    private String interface_plug;
    private int cache;

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * @return the interface_plug
     */
    public String getInterface_plug() {
        return interface_plug;
    }

    /**
     * @param interface_plug the interface_plug to set
     */
    public void setInterface_plug(String interface_plug) {
        this.interface_plug = interface_plug;
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
