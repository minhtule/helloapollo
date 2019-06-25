package com.example.helloapollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.api.Response;

import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.exception.ApolloException;

import org.jetbrains.annotations.NotNull;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "http://10.0.2.2:8080/graphql_v2";
    OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
    ApolloClient apolloClient = ApolloClient
            .builder()
            .serverUrl(BASE_URL)
            .okHttpClient(okHttpClient)
            .build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ShapesQuery shapesQuery = ShapesQuery.builder().build();

        apolloClient.query(shapesQuery).enqueue(new ApolloCall.Callback<ShapesQuery.Data>() {

            @Override public void onResponse(@NotNull Response<ShapesQuery.Data> dataResponse) {
                Log.e("test", "It works!");
            }

            @Override public void onFailure(ApolloException exception) {
                Log.e("test", exception.getMessage());
            }
        });
    }
}
