# _Api

All URIs are relative to *http://otrs.zdrav.netrika.ru/otrs/nph-genericinterface.pl/Webservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ticketGet**](_Api.md#ticketGet) | **GET** /MIAC/TicketGet/{TicketID} | Принимает номер тикета
[**ticketSearch**](_Api.md#ticketSearch) | **GET** /MIAC/TicketSearch | Принимает номер тикета и очередь
[**ticketUpdate**](_Api.md#ticketUpdate) | **POST** /MIAC/TicketUpdate | Принимает номер тикета и параметры


<a name="ticketGet"></a>
# **ticketGet**
> ticketGet(ticketID, userLogin, password)

Принимает номер тикета

Возвращает JSON объект из 38 полей с информацией о заявке

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api._Api;


_Api apiInstance = new _Api();
String ticketID = "ticketID_example"; // String | номер тикета
String userLogin = "d.parkhimovich@netrika.ru"; // String | логин
String password = "router1966"; // String | пароль
try {
    apiInstance.ticketGet(ticketID, userLogin, password);
} catch (ApiException e) {
    System.err.println("Exception when calling _Api#ticketGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketID** | **String**| номер тикета |
 **userLogin** | **String**| логин | [default to d.parkhimovich@netrika.ru]
 **password** | **String**| пароль | [default to router1966]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ticketSearch"></a>
# **ticketSearch**
> ticketSearch(userLogin, password, queues, ticketNumber)

Принимает номер тикета и очередь

Возвращает JSON объект с массивом тикетов

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api._Api;


_Api apiInstance = new _Api();
String userLogin = "d.parkhimovich@netrika.ru"; // String | логин
String password = "router1966"; // String | пароль
String queues = "Санкт-Петербург::BI_СПб"; // String | очередь
String ticketNumber = "98068%"; // String | номер заявки (% маска)
try {
    apiInstance.ticketSearch(userLogin, password, queues, ticketNumber);
} catch (ApiException e) {
    System.err.println("Exception when calling _Api#ticketSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLogin** | **String**| логин | [default to d.parkhimovich@netrika.ru]
 **password** | **String**| пароль | [default to router1966]
 **queues** | **String**| очередь | [optional] [default to Санкт-Петербург::BI_СПб]
 **ticketNumber** | **String**| номер заявки (% маска) | [optional] [default to 98068%]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ticketUpdate"></a>
# **ticketUpdate**
> ticketUpdate(json)

Принимает номер тикета и параметры

Возвращает JSON объект из 2 полей с номером тикета при успехе

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api._Api;


_Api apiInstance = new _Api();
UpdateTicket json = new UpdateTicket(); // UpdateTicket | данные тикета, которые нужно изменить
try {
    apiInstance.ticketUpdate(json);
} catch (ApiException e) {
    System.err.println("Exception when calling _Api#ticketUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json** | [**UpdateTicket**](UpdateTicket.md)| данные тикета, которые нужно изменить |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

