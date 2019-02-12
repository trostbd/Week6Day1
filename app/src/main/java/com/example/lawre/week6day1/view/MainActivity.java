package com.example.lawre.week6day1.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.lawre.week6day1.R;
import com.example.lawre.week6day1.databinding.ActivityMainBinding;
import com.example.lawre.week6day1.model.Person;
import com.example.lawre.week6day1.viewmodel.PersonViewModel;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        PersonViewModel personViewModel = new PersonViewModel();
        activityMainBinding.setViewModel(personViewModel);
        activityMainBinding.executePendingBindings();
    }
}
