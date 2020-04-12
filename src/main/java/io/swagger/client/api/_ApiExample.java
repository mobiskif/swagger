package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;

public class _ApiExample {
    public static void main(String[] args) {

        ApiResponse ar;
        _Api apiInstance = new _Api();
        String ticketID = "6040"; // String | номер тикета
        String userLogin = "d.parkhimovich@netrika.ru"; // String | логин
        String password = "router1966"; // String | пароль
        String queue = "Санкт-Петербург::BI_СПб"; // String | пароль
        String ticketNumber = "98068%"; // String | пароль
        try {
            ar = apiInstance.ticketGet(ticketID, userLogin, password);
            System.out.println(ar.getHeaders());
            System.out.println(ar.getData());
            ar = apiInstance.ticketSearch(userLogin, password,queue,ticketNumber);
            System.out.println(ar.getHeaders());
            System.out.println(ar.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling _Api#ticketGet");
            e.printStackTrace();
        }
    }

}
