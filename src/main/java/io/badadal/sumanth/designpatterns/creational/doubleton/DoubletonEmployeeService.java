package io.badadal.sumanth.designpatterns.creational.doubleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sbadadal
 */
public class DoubletonEmployeeService {

    private int employeeId;
    private String employeeName;
    private static DoubletonEmployeeService employeeServiceInstance1;
    private static DoubletonEmployeeService employeeServiceInstance2;
    private static List<DoubletonEmployeeService> employeeServicesList = new ArrayList<>();

    private static final int employee1Id = 100;
    private static final int employee2Id = 200;
    private static final double pivot = 0.5;

    private DoubletonEmployeeService(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    /**
     *
     * @return
     */
    public static DoubletonEmployeeService getInstance() {
        if (employeeServicesList.size() < 2) {
            if (null == employeeServiceInstance1) {
                employeeServiceInstance1 =
                        new DoubletonEmployeeService(employee1Id, "Employee ABC");
                employeeServicesList.add(employeeServiceInstance1);
                return employeeServiceInstance1;
            } else {
                employeeServiceInstance2 =
                        new DoubletonEmployeeService(employee2Id, "Employee XYZ");
                employeeServicesList.add(employeeServiceInstance2);
                return employeeServiceInstance2;
            }
        } else if (Math.random() < pivot) {
            return employeeServicesList.get(0);
        } else {
            return employeeServicesList.get(1);
        }
    }

    @Override
    public String toString() {
        return "DoubletonEmployeeService{"
                + "employeeId=" + employeeId
                + ", employeeName='" + employeeName + '\''
                + '}';
    }
}
