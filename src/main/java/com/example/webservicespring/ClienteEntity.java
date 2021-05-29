package com.example.webservicespring;

import javax.persistence.*;

@Entity
@Table(name ="clientes")
public class ClienteEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idCliente")
    private Integer idCliente;
    private String nombre;
    private String empresa;
    private String cargo;
    private String telefono;
    private String email;

    public ClienteEntity() {
    }

    public ClienteEntity(Integer idCliente, String nombre, String empresa, String cargo, String telefono, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.empresa = empresa;
        this.cargo = cargo;
        this.telefono = telefono;
        this.email = email;
    }

    public ClienteEntity(String nombre, String empresa, String cargo, String telefono, String email) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.cargo = cargo;
        this.telefono = telefono;
        this.email = email;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ClienteEntity{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", empresa='" + empresa + '\'' +
                ", cargo='" + cargo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
