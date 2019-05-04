package com.wolf.android.thefruitvalestationc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DalyCityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daly_city);








//        final TextView textView = findViewById(R.id.firstTrain);
//        RequestQueue queue = Volley.newRequestQueue(this);
//        String url ="http://api.bart.gov/api/etd.aspx?cmd=etd&orig=ftvl&json=y&key=MW9S-E7SL-26DU-VV8V";
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        try {
//                            JSONObject responseJson = new JSONObject(response);
//                            JSONObject rootJson = responseJson.getJSONObject("root");
//                            JSONArray stationArray = rootJson.getJSONArray("station");
//                            JSONObject fruitvaleObject = stationArray.getJSONObject(0);
//                            JSONArray etdArray = fruitvaleObject.getJSONArray("etd");
//                            JSONObject dalyCityObject = etdArray.getJSONObject(0);
//                            JSONArray estimates = dalyCityObject.getJSONArray("estimates");
//                            JSONObject firstTrain = estimates.getJSONObject(0);
//                            textView.setText(firstTrain.getString("minutes"));
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                textView.setText("That didn't work!");
//            }
//        });
//
//        queue.add(stringRequest);
    }
}
