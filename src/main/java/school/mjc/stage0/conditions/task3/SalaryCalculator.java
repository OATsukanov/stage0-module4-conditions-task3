package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float floatSalary = (float)salary;
        if (floatSalary <= 0) {
            System.out.println("wrong input!");
        } else {
            if (floatSalary <= 10000) {
               float salaryAfterTaxesAccording = floatSalary - (floatSalary/100*15);
                System.out.println(salaryAfterTaxesAccording);
            } else {
                if (floatSalary > 10000 && floatSalary <= 20000) {
                    float salaryAfterTaxesAccording = floatSalary - (floatSalary/100*18);
                    System.out.println(salaryAfterTaxesAccording);
                } else {
                    if (floatSalary > 20000) {
                        float salaryAfterTaxesAccording = floatSalary - (floatSalary/100*20);
                        System.out.println(salaryAfterTaxesAccording);
                    }
                }
            }
        }

    }
}
