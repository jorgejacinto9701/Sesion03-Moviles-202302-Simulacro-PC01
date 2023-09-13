package com.cibertec.semana04_12_09_2023.service;

import com.cibertec.semana04_12_09_2023.entity.Pais;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServicePais {

    @GET("util/listaPais")
    public abstract Call<List<Pais>> listaPais();
}
