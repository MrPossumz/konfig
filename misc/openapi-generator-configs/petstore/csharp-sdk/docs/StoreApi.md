# Com.Demo.Api.StoreApi

All URIs are relative to *http://localhost:4010*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteOrder**](StoreApi.md#deleteorder) | **DELETE** /store/order/{orderId} | Delete purchase order by ID
[**GetInventory**](StoreApi.md#getinventory) | **GET** /store/inventory | Returns pet inventories by status
[**GetOrderById**](StoreApi.md#getorderbyid) | **GET** /store/order/{orderId} | Find purchase order by ID



## DeleteOrder

> void DeleteOrder (string orderId)

Delete purchase order by ID

For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Com.Demo.Api;
using Com.Demo.Client;
using Com.Demo.Model;

namespace Example
{
    public class DeleteOrderExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:4010";
            var apiInstance = new StoreApi(Configuration.Default);
            var orderId = "orderId_example";  // string | ID of the order that needs to be deleted

            try
            {
                // Delete purchase order by ID
                apiInstance.DeleteOrder(orderId);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling StoreApi.DeleteOrder: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **string**| ID of the order that needs to be deleted | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid ID supplied |  -  |
| **404** | Order not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetInventory

> Dictionary&lt;string, int&gt; GetInventory ()

Returns pet inventories by status

Returns a map of status codes to quantities

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Com.Demo.Api;
using Com.Demo.Client;
using Com.Demo.Model;

namespace Example
{
    public class GetInventoryExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:4010";
            // Configure API key authorization: api_key
            Configuration.Default.AddApiKey("api_key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api_key", "Bearer");

            var apiInstance = new StoreApi(Configuration.Default);

            try
            {
                // Returns pet inventories by status
                Dictionary<string, int> result = apiInstance.GetInventory();
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling StoreApi.GetInventory: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Dictionary<string, int>**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOrderById

> Order GetOrderById (long orderId)

Find purchase order by ID

For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Com.Demo.Api;
using Com.Demo.Client;
using Com.Demo.Model;

namespace Example
{
    public class GetOrderByIdExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:4010";
            var apiInstance = new StoreApi(Configuration.Default);
            var orderId = 789L;  // long | ID of pet that needs to be fetched

            try
            {
                // Find purchase order by ID
                Order result = apiInstance.GetOrderById(orderId);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling StoreApi.GetOrderById: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **long**| ID of pet that needs to be fetched | 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Order not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

