package com.example.sportsin.MainScreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.sportsin.R;

public class ScanTicketFragment extends Fragment {


    private Button delivered;
    private TextView order_delivere;
    private TextView no_order_text;
    private ImageView no_order_image;

    private TextView one;
    private TextView two;
    private TextView three;
    private TextView four;
    private TextView five;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_help, container, false);
        delivered = view.findViewById(R.id.delivered);
        order_delivere = view.findViewById(R.id.order_delivered);
        no_order_image = view.findViewById(R.id.no_order_image);
        no_order_text = view.findViewById(R.id.no_order_text);
        one = view.findViewById(R.id.textView36);
        two = view.findViewById(R.id.textView37);
        three = view.findViewById(R.id.textView38);
        four = view.findViewById(R.id.textView41);
        five = view.findViewById(R.id.textView42);
        delivered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delivered.setClickable(false);
                delivered.setVisibility(View.INVISIBLE);
                order_delivere.setText("Order Delivered: 1");
                no_order_image.setVisibility(View.VISIBLE);
                no_order_text.setVisibility(View.VISIBLE);
                one.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                four.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
            }
        });

        return view;
    }
}