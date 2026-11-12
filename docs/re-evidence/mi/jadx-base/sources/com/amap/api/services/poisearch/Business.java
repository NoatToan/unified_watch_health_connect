package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class Business implements Parcelable {
    public static final Parcelable.Creator<Business> CREATOR = new Parcelable.Creator<Business>() { // from class: com.amap.api.services.poisearch.Business.1
        private static Business a(Parcel parcel) {
            return new Business(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Business createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Business[] newArray(int i) {
            return a(i);
        }

        private static Business[] a(int i) {
            return new Business[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6597b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    public Business(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f6596a = str;
        this.f6597b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlias() {
        return this.i;
    }

    public String getBusinessArea() {
        return this.f6596a;
    }

    public String getCPID() {
        return this.j;
    }

    public String getCost() {
        return this.g;
    }

    public String getOpentimeToday() {
        return this.f6597b;
    }

    public String getOpentimeWeek() {
        return this.c;
    }

    public String getParkingType() {
        return this.h;
    }

    public String getTag() {
        return this.e;
    }

    public String getTel() {
        return this.d;
    }

    public String getmRating() {
        return this.f;
    }

    public void setCPID(String str) {
        this.j = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6596a);
        parcel.writeString(this.f6597b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }

    public Business(Parcel parcel) {
        this.f6596a = parcel.readString();
        this.f6597b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
    }
}
