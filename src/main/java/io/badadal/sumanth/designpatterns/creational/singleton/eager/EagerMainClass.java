package io.badadal.sumanth.designpatterns.creational.singleton.eager;

import static io.badadal.sumanth.designpatterns.creational.singleton.eager.EagerPatientDetailsService.getInstance;

/**
 * @author sbadadal
 */
public class EagerMainClass {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        EagerPatientDetailsService eagerPatientDetailsService = getInstance();
        System.out.println(eagerPatientDetailsService);
        System.out.println(eagerPatientDetailsService.providePatientDetailsService());
    }
}
