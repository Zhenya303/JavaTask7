package org.example;

import ru.netology.services.CalculateRestService;

public class Main {
    public static void main(String[] args) {

        CalculateRestService service = new CalculateRestService();

        int count = service.calcRestService(100000, 60000, 150000);
        System.out.println("При таких затратах и расходах, у вас будет " + count + " месяца(ев) отдыха за год");
    }
}
