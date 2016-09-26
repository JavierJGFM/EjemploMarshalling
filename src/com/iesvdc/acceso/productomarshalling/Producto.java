/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvdc.acceso.productomarshalling;

/*
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;.
*/
import javax.xml.bind.annotation.*;

/**
 *
 * @author matinal
 */
@XmlRootElement(name = "producto")
@XmlAccessorType (XmlAccessType.FIELD)
public class Producto {
    @XmlAttribute
    private int id;
    @XmlElement 
    private String nombre;
    @XmlElement 
    private String categoria;
    @XmlElement 
    private String descripcion;
    //Imnagen convertida en caracteres. base64 
    @XmlElement 
    private String imagen;
    @XmlElement 
    private double precio;
    @XmlElement 
    private String unidadesMedidas;
    @XmlElement 
    private double unidadesPrecio;

            //=========================Constructor por defecto================//
    public Producto() {
    }
    
    
    public Producto(int id, String nombre, String categoria, String descripcion, String imagen, double precio, String unidadesMedidas, double unidadesPrecio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
        this.unidadesMedidas = unidadesMedidas;
        this.unidadesPrecio = unidadesPrecio;
    }

    // ======================================GETTERS======================================//
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public String getUnidadesMedidas() {
        return unidadesMedidas;
    }

    public double getUnidadesPrecio() {
        return unidadesPrecio;
    }

    
    // ======================================SETTERS======================================//
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setUnidadesMedidas(String unidadesMedidas) {
        this.unidadesMedidas = unidadesMedidas;
    }

    public void setUnidadesPrecio(double unidadesPrecio) {
        this.unidadesPrecio = unidadesPrecio;
    }

    
    

}


