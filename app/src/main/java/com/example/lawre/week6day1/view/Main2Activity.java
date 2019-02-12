package com.example.lawre.week6day1.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.lawre.week6day1.R;
import com.example.lawre.week6day1.databinding.ActivityMain2Binding;
import com.example.lawre.week6day1.model.Person;
import com.example.lawre.week6day1.viewmodel.PersonViewModel;

public class Main2Activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ActivityMain2Binding activityMain2Binding = DataBindingUtil.setContentView(this,R.layout.activity_main2);
        Person person = getIntent().getParcelableExtra("person");
        PersonViewModel personViewModel = new PersonViewModel();
        activityMain2Binding.setViewModel(personViewModel);
        activityMain2Binding.setPerson(person);
    }
}
