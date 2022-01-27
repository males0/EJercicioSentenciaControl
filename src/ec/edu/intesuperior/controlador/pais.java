/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intesuperior.controlador;

/**
 *
 * @author males
 */
public class pais {
    private String codigopais;
    private String nombrepais;

    public pais() {
    }

    public pais(String codigopais, String nombrepais) {
        this.codigopais = codigopais;
        this.nombrepais = nombrepais;
    }

    public void setCodigopais(String codigopais) {
        this.codigopais = codigopais;
    }

    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }

    public String getCodigopais() {
        return codigopais;
    }

    public String getNombrepais() {
        return nombrepais;
    }
   
    
}
