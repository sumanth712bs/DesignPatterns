package io.badadal.sumanth.designpatterns.creational.singleton.eager;

/**
 * @author sbadadal
 */
public class EagerPatientDetailsService {

    private static EagerPatientDetailsService
            eagerPatientDetailsService = new EagerPatientDetailsService();

    @Override
    public String toString() {
        return "EagerPatientDetailsService{}";
    }

    /**
     *
     * @return
     */
    public static EagerPatientDetailsService getInstance() {
        System.out.println("Providing insatnce reference of EagerPatientDetailsService");
        return eagerPatientDetailsService;
    }

    /**
     * Private constructor so that object cannot be created outside of this class
     */
    private EagerPatientDetailsService() {
    }

    /**
     * Method which provides patient details
     */
    public String providePatientDetailsService() {
        return "Call the source service which provides patient details";
    }
}
