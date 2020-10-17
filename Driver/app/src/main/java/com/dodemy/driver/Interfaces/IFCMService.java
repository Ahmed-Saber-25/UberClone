package com.dodemy.driver.Interfaces;

import com.dodemy.driver.Model.FCMResponse;
import com.dodemy.driver.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
        "Authorization:key=AAAAD038GiQ:APA91bHioSxKOfxXazizlawjl1h6W6OUbxHHKO9wDYOk4qyWHC8kREjeAU0U3v8BeDgTUO5Kark--tEKT4mrFMQxpg7urRPXAbJIUrmC1WxmlP-eFhmd2s5aoP_7oHzwQ7LY0ZVV1dgQ"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
