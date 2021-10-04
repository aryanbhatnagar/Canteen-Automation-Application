package com.example.language.retrofit;

import com.example.language.model.FoodData;

import retrofit2.http.GET;
import retrofit2.Call;
import java.util.List;

public interface ApiInterface {
    @GET("fooddata.json")
    Call<List<FoodData>>getAllData();


}
