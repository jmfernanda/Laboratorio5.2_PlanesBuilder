package co.agenciaviajes.clientemain;

import co.agenciaviajes.negocio.CartagenaBuilder;
import co.agenciaviajes.negocio.DirectorPlan;
import co.agenciaviajes.negocio.PlanBuilder;
import co.agenciaviajes.negocio.SanAndresBuilder;
import co.agenciaviajes.negocio.Plan;
import co.agenciaviajes.negocio.SantaMartaBuilder;
/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class ClienteMain {

    /**
     * Simula un objeto cliente que consume los servicios del bulider
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DirectorPlan director = new DirectorPlan();
        //PLAN SAN ANDRES
        PlanBuilder sanAndres = new SanAndresBuilder();
        director.setPlanBuilder(sanAndres);
        director.construirPlan();

        Plan plan = director.getPlan();
        System.out.println("Plan:" + plan);
        
        //PLAN CARTAGENA
        PlanBuilder cartagena = new CartagenaBuilder();
        director.setPlanBuilder(cartagena);
        director.construirPlan();
        
        plan = director.getPlan();
        System.out.println("Plan:" + plan);
        
        //PLAN SANTA MARTA
        PlanBuilder santaMarta = new SantaMartaBuilder();
        director.setPlanBuilder(santaMarta);
        director.construirPlan();
        
        plan = director.getPlan();
        System.out.println("Plan:" + plan);
        
    }
}
