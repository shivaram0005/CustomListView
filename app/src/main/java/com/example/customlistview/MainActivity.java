package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int images[]={R.drawable.ic_baseline_settings_24,R.drawable.ic_baseline_account_circle_24,R.drawable.ic_baseline_flight_24};
String names[]={"Settings","AccountInfo","FlightMode"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.listview);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);

    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {


            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater=getLayoutInflater();
           view=layoutInflater.inflate(R.layout.customlistview,(ViewGroup)findViewById(R.id.c));
            ImageView imageView=(ImageView)view.findViewById(R.id.image);
            TextView textView=(TextView)view.findViewById(R.id.text);
            imageView.setImageResource(images[i]);
            textView.setText(names[i]);
            return view;
        }
    }
}