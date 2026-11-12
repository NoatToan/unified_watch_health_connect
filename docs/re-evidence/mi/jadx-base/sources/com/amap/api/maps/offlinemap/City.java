package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public class City implements Parcelable {
    public static final Parcelable.Creator<City> CREATOR = new Parcelable.Creator<City>() { // from class: com.amap.api.maps.offlinemap.City.1
        private static City a(Parcel parcel) {
            return new City(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ City createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ City[] newArray(int i) {
            return a(i);
        }

        private static City[] a(int i) {
            return new City[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6462b;
    private String c;
    private String d;
    private String e;

    public City() {
        this.f6461a = "";
        this.f6462b = "";
        this.c = "";
        this.d = "";
        this.e = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.e;
    }

    public String getCity() {
        return this.f6461a;
    }

    public String getCode() {
        return this.f6462b;
    }

    public String getJianpin() {
        return this.c;
    }

    public String getPinyin() {
        return this.d;
    }

    public void setAdcode(String str) {
        this.e = str;
    }

    public void setCity(String str) {
        this.f6461a = str;
    }

    public void setCode(String str) {
        if (str == null || HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(str)) {
            return;
        }
        this.f6462b = str;
    }

    public void setJianpin(String str) {
        this.c = str;
    }

    public void setPinyin(String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6461a);
        parcel.writeString(this.f6462b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public City(Parcel parcel) {
        this.f6461a = "";
        this.f6462b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f6461a = parcel.readString();
        this.f6462b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }
}
