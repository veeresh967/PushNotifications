package com.veeresh.b36_pushnotifications;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by skillgun on 07/07/2017.
 */

public class Student implements Parcelable{
    private int sno;
    private String sname;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Student(int sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }

    protected Student(Parcel in) {
        sno = in.readInt();
        sname = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(sno);
        parcel.writeString(sname);
    }
}
