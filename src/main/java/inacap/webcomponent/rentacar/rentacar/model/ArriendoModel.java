/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.rentacar.rentacar.model;

import java.sql.Time;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */

@Entity
@Table(name = "arriendo")
public class ArriendoModel {

    public ArriendoModel(int idArriendo, Date fechaArriendo, Time horaArriendo) {
        this.idArriendo = idArriendo;
        this.fechaArriendo = fechaArriendo;
        this.horaArriendo = horaArriendo;
    }
    
    private int idArriendo;
    private Date fechaArriendo;
    private Time horaArriendo;
    private PersonaModel vendedorArriendo;
    private PersonaModel clienteArriendo;
    private VehiculoModel veiculoArriendo;
    private MedioPagoModel medioPagoArriendo;

    public int getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(int idArriendo) {
        this.idArriendo = idArriendo;
    }

    public Date getFechaArriendo() {
        return fechaArriendo;
    }

    public void setFechaArriendo(Date fechaArriendo) {
        this.fechaArriendo = fechaArriendo;
    }

    public Time getHoraArriendo() {
        return horaArriendo;
    }

    public void setHoraArriendo(Time horaArriendo) {
        this.horaArriendo = horaArriendo;
    }

    public PersonaModel getVendedorArriendo() {
        return vendedorArriendo;
    }

    public void setVendedorArriendo(PersonaModel vendedorArriendo) {
        this.vendedorArriendo = vendedorArriendo;
    }

    public PersonaModel getClienteArriendo() {
        return clienteArriendo;
    }

    public void setClienteArriendo(PersonaModel clienteArriendo) {
        this.clienteArriendo = clienteArriendo;
    }

    public VehiculoModel getVeiculoArriendo() {
        return veiculoArriendo;
    }

    public void setVeiculoArriendo(VehiculoModel veiculoArriendo) {
        this.veiculoArriendo = veiculoArriendo;
    }

    public MedioPagoModel getMedioPagoArriendo() {
        return medioPagoArriendo;
    }

    public void setMedioPagoArriendo(MedioPagoModel medioPagoArriendo) {
        this.medioPagoArriendo = medioPagoArriendo;
    }

    public ArriendoModel(Date fechaArriendo, Time horaArriendo, PersonaModel vendedorArriendo, PersonaModel clienteArriendo, VehiculoModel veiculoArriendo, MedioPagoModel medioPagoArriendo) {
        this.fechaArriendo = fechaArriendo;
        this.horaArriendo = horaArriendo;
        this.vendedorArriendo = vendedorArriendo;
        this.clienteArriendo = clienteArriendo;
        this.veiculoArriendo = veiculoArriendo;
        this.medioPagoArriendo = medioPagoArriendo;
    }

    private ArriendoModel(int idArriendo, Date fechaArriendo, Time horaArriendo, PersonaModel vendedorArriendo, PersonaModel clienteArriendo, VehiculoModel veiculoArriendo, MedioPagoModel medioPagoArriendo) {
        this.idArriendo = idArriendo;
        this.fechaArriendo = fechaArriendo;
        this.horaArriendo = horaArriendo;
        this.vendedorArriendo = vendedorArriendo;
        this.clienteArriendo = clienteArriendo;
        this.veiculoArriendo = veiculoArriendo;
        this.medioPagoArriendo = medioPagoArriendo;
    }

    
}
