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
public class PlacaDeVideo extends Produto {
        
        private String interface_plug;
        private String tipo_memoria;
        private int memoria;
        private int interface_memoria;

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
     * @return the tipo_memoria
     */
    public String getTipo_memoria() {
        return tipo_memoria;
    }

    /**
     * @param tipo_memoria the tipo_memoria to set
     */
    public void setTipo_memoria(String tipo_memoria) {
        this.tipo_memoria = tipo_memoria;
    }

    /**
     * @return the memoria
     */
    public int getMemoria() {
        return memoria;
    }

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    /**
     * @return the interface_memoria
     */
    public int getInterface_memoria() {
        return interface_memoria;
    }

    /**
     * @param interface_memoria the interface_memoria to set
     */
    public void setInterface_memoria(int interface_memoria) {
        this.interface_memoria = interface_memoria;
    }
        
        
    
}
