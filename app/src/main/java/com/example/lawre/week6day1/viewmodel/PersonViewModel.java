package com.example.lawre.week6day1.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.example.lawre.week6day1.R;
import com.example.lawre.week6day1.model.Person;
import com.example.lawre.week6day1.view.Main2Activity;

public class PersonViewModel extends ViewModel
{
    public Person person;
    public PersonViewModel()
    {
        person = new Person("","","");
    }

    public PersonViewModel(Person person)
    {
        this.person = person;
    }

    public String getPersonName()
    {
        return person.getName();
    }

    public String getPersonFavoriteBook()
    {
        return person.getBook();
    }

    public String getPersonFavoriteMovie()
    {
        return person.getMovie();
    }

    public void setPersonName(CharSequence charSequence)
    {
        person.setName(charSequence.toString());
    }

    public void setPersonBook(CharSequence charSequence)
    {
        person.setBook(charSequence.toString());
    }

    public void setPersonMovie(CharSequence charSequence)
    {
        person.setMovie(charSequence.toString());
    }

    public void handleClick(View view)
    {
        if(view.getId() != R.id.btNext)
        {
            return;
        }
        Log.d("TAG_", "handleClick: " + person.getName());
        Intent intent = new Intent(view.getContext(), Main2Activity.class);
        intent.putExtra("person",person);
        view.getContext().startActivity(intent);
    }
}
