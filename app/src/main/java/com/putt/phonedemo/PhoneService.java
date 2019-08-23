package com.putt.phonedemo;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface PhoneService {
    @GET("shouji/query")
    Observable<LocationRes> getLocation(@Query("appkey") String key, @Query("shouji") String shouji);
}
