package sample;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Controller {

    @FXML
    private TextField tvDisplay;

    @FXML
    public void initialize() {
        tvDisplay.setText("hi This is Display!");
    }

    @FXML
    void clkGetDetails(ActionEvent event) {
        callDetails();
    }

    private void callDetails() {
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<Object> call = apiService.getDetails();
        call.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                tvDisplay.setText(new Gson().toJson(response.body()));

            }

            @Override
            public void onFailure(Call<Object> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });

    }
}
