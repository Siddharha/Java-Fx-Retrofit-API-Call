package sample;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import sample.beans.GetDetailsOutput;

public interface ApiInterface {
    @GET("getDetailse.php")
    Call<Object> getDetails();
}
