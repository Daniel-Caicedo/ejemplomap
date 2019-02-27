/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author daniel_f.caicedo
 */
public class Cliente {
   
    private String nombre;

    private String idC;

    private String empresa;

    public Cliente() {
    }

    public Cliente(String nombre, String idC, String empresa) {
        this.nombre = nombre;
        this.idC = idC;
        this.empresa = empresa;
    }

    
    
    /**
     * Get the value of empresa
     *
     * @return the value of empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Set the value of empresa
     *
     * @param empresa new value of empresa
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * Get the value of idC
     *
     * @return the value of idC
     */
    public String getIdC() {
        return idC;
    }

    /**
     * Set the value of idC
     *
     * @param idC new value of idC
     */
    public void setIdC(String idC) {
        this.idC = idC;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre+","+idC+","+empresa;
    }
 
}
