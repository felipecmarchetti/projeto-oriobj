package com.example.androidbarberbooking.Adapter;

import android.view.View;

import com.example.androidbarberbooking.Interface.IRecyclerItemSelectedListener;

interface MyViewHolder {
    void setiRecyclerItemSelectedListener(IRecyclerItemSelectedListener iRecyclerItemSelectedListener);

    void onClick(View view);
}
