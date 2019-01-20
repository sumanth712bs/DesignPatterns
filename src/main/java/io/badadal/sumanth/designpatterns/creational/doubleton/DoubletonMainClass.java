package io.badadal.sumanth.designpatterns.creational.doubleton;

import java.util.stream.Stream;

/**
 * @author sbadadal
 */
public class DoubletonMainClass {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        DoubletonEmployeeService doubletonEmployeeService1 = DoubletonEmployeeService.getInstance();
        DoubletonEmployeeService doubletonEmployeeService2 = DoubletonEmployeeService.getInstance();
        DoubletonEmployeeService doubletonEmployeeService3 = DoubletonEmployeeService.getInstance();
        DoubletonEmployeeService doubletonEmployeeService4 = DoubletonEmployeeService.getInstance();

        Stream.of(
                doubletonEmployeeService1,
                doubletonEmployeeService2,
                doubletonEmployeeService3,
                doubletonEmployeeService4)
                .forEach(empInstance -> System.out.println(empInstance));

    }
}
