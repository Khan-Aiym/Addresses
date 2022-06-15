package com.geektech.addresses;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView mAddress;

    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
        mAddress=itemView.findViewById(R.id.address);
    }
    public void bind(String address) {mAddress.setText(address);}
}
