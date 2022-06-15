package com.geektech.addresses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList <String> address;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadDate();
        recyclerView=findViewById(R.id.recycle_view);
        AddressAdapter adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);
    }

    private void loadDate() {
        address=new ArrayList<>();
        address.add("Московская 237");
        address.add("Московская 237");
        address.add("Московская 237");
        address.add("Московская 237");
        address.add("Московская 237");
        address.add("Московская 237");
        address.add("Московская 237");
        address.add("Московская 237");
        address.add("Московская 237");
        address.add("Московская 237");
        address.add("Московская 237");
        address.add("Московская 237");
        address.add("Московская 237");

    }
}