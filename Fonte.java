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
public class Fonte extends Produto{
    
        private int potencia;
        private int chave_voltagem;

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the chave_voltagem
     */
    public int getChave_voltagem() {
        return chave_voltagem;
    }

    /**
     * @param chave_voltagem the chave_voltagem to set
     */
    public void setChave_voltagem(int chave_voltagem) {
        this.chave_voltagem = chave_voltagem;
    }
    
}
