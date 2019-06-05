package co.agenciaviajes.negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ConcreteBuilder
 *
 * @author Libardo Pantoja, Julio Hurtado, Ricardo Zambrano
 */
public class CartagenaBuilder extends PlanBuilder {

    @Override
    public void buildCliente() {
        try {
            Cliente cli = new Cliente("8855855", "Andrea", "Fernandez", "F", "andreita@gmail.com", new SimpleDateFormat("dd/MM/yyyy").parse("12/04/1998"));
            plan.setCliente(cli);
            plan.setTotalAdultos(2);
            plan.setTotalNinos(0);
        } catch (ParseException ex) {
            Logger.getLogger(SanAndresBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }    }

    @Override
    public void buildTransportes() {
        plan.setTransporte("Cali - Cartagena");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.sumarValor(400000 * (this.plan.getTotalAdultos() + this.plan.getTotalNinos()));

    }

    @Override
    public void buildAlojamiento() {
        plan.setAlojamiento("Hotel Cartagena Premium");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.sumarValor(201000);
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
        plan.sumarValor(56000);
    }

    @Override
    public void buildImpuestoTiquete() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.setImpuestoTiqute(true);
        plan.sumarValor(32000);
    }

    @Override
    public void buildTours() {
        String tours[] = {"Playa blanca con almuerzo"};
        plan.setTours(tours);
    }
}
