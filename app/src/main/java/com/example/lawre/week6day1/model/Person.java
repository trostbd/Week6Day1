package com.example.lawre.week6day1.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable
{
    public String name, book, movie;

    public Person(String name, String book, String movie) {
        this.name = name;
        this.book = book;
        this.movie = movie;
    }

    protected Person(Parcel in) {
        name = in.readString();
        book = in.readString();
        movie = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(book);
        dest.writeString(movie);
    }
}
