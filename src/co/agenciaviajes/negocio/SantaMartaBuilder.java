/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.agenciaviajes.negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernanda
 */
public class SantaMartaBuilder extends PlanBuilder{
    
     @Override
    public void buildCliente() {
        try {
            Cliente cli = new Cliente("987654", "Diana", "Pino", "F", "dianitapinillo@gmail.com", new SimpleDateFormat("dd/MM/yyyy").parse("16/12/1998"));
            plan.setCliente(cli);
            plan.setTotalAdultos(4);
            plan.setTotalNinos(2);
        } catch (ParseException ex) {
            Logger.getLogger(SanAndresBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }    }

    @Override
    public void buildTransportes() {
        plan.setTransporte("Popayan - Santa Marta");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.sumarValor(800000 * (this.plan.getTotalAdultos() + this.plan.getTotalNinos()));

    }

    @Override
    public void buildAlojamiento() {
        plan.setAlojamiento("Hotel Miramar");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.sumarValor(400000);
    }

    @Override
    public void buildAlimentacion() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.setAlimentacion("Desayunos, almuerzos y cenas");
    }

    @Override
    public void buildSeguroHotelero() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.setSeguroHotelero(true);
        plan.sumarValor(45000);
    }

    @Override
    public void buildImpuestoTiquete() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.setSeguroHotelero(true);
        plan.sumarValor(50000);
    }

    @Override
    public void buildTours() {
        String tours[] = {"Playa Cristal","Parque Tayrona","La playa de las siete olas"};
        plan.setTours(tours);
    }
    
}
