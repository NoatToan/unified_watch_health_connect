package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class City implements Parcelable {
    public static final Parcelable.Creator<City> CREATOR = new Parcelable.Creator<City>() { // from class: com.amap.api.maps.offlinemap.City.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ City createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ City[] newArray(int i) {
            return a(i);
        }

        private static City a(Parcel parcel) {
            return new City(parcel);
        }

        private static City[] a(int i) {
            return new City[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3445c;
    private String d;
    private String e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public City() {
        this.f3443a = "";
        this.f3444b = "";
        this.f3445c = "";
        this.d = "";
        this.e = "";
    }

    public void setCity(String str) {
        this.f3443a = str;
    }

    public String getCity() {
        return this.f3443a;
    }

    public void setCode(String str) {
        if (str == null || "[]".equals(str)) {
            return;
        }
        this.f3444b = str;
    }

    public String getCode() {
        return this.f3444b;
    }

    public String getJianpin() {
        return this.f3445c;
    }

    public void setJianpin(String str) {
        this.f3445c = str;
    }

    public String getPinyin() {
        return this.d;
    }

    public void setPinyin(String str) {
        this.d = str;
    }

    public String getAdcode() {
        return this.e;
    }

    public void setAdcode(String str) {
        this.e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3443a);
        parcel.writeString(this.f3444b);
        parcel.writeString(this.f3445c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public City(Parcel parcel) {
        this.f3443a = "";
        this.f3444b = "";
        this.f3445c = "";
        this.d = "";
        this.e = "";
        this.f3443a = parcel.readString();
        this.f3444b = parcel.readString();
        this.f3445c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }
}
