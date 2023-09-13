package com.cibertec.semana04_12_09_2023.service;

import com.cibertec.semana04_12_09_2023.entity.Editorial;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ServiceEditorial {


    @POST("editorial")
    public abstract Call<Editorial> insertaEditorial(@Body Editorial objEditorial);


}
