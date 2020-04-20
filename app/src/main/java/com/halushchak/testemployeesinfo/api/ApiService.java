package com.halushchak.testemployeesinfo.api;

import com.halushchak.testemployeesinfo.pojo.EmployeeResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET("testTask.json")
    Observable<EmployeeResponse> getEmployees();
}
