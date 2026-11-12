package com.huawei.hwidauth.utils.globalcfg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class CountryInfoForCFG implements Parcelable {
    public static final Parcelable.Creator<CountryInfoForCFG> CREATOR = new Parcelable.Creator<CountryInfoForCFG>() { // from class: com.huawei.hwidauth.utils.globalcfg.CountryInfoForCFG.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CountryInfoForCFG createFromParcel(Parcel parcel) {
            return new CountryInfoForCFG(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CountryInfoForCFG[] newArray(int i) {
            return new CountryInfoForCFG[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17637c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CountryInfoForCFG() {
    }

    protected CountryInfoForCFG(Parcel parcel) {
        this.f17635a = parcel.readString();
        this.f17636b = parcel.readString();
        this.f17637c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17635a);
        parcel.writeString(this.f17636b);
        parcel.writeString(this.f17637c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    public String a() {
        return this.f17635a;
    }

    public void a(String str) {
        this.f17635a = str;
    }

    public void b(String str) {
        this.f17636b = str;
    }

    public void c(String str) {
        this.f17637c = str;
    }

    public String b() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public void e(String str) {
        this.e = str;
    }

    public String c() {
        return this.f;
    }

    public void f(String str) {
        this.f = str;
    }

    public void g(String str) {
        this.g = str;
    }

    public String d() {
        return this.h;
    }

    public void h(String str) {
        this.h = str;
    }
}
