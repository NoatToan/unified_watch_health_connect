package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class LocalWeatherLive implements Parcelable {
    public static final Parcelable.Creator<LocalWeatherLive> CREATOR = new Parcelable.Creator<LocalWeatherLive>() { // from class: com.amap.api.services.weather.LocalWeatherLive.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocalWeatherLive[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocalWeatherLive createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static LocalWeatherLive a(Parcel parcel) {
            return new LocalWeatherLive(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3889c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocalWeatherLive() {
    }

    public LocalWeatherLive(Parcel parcel) {
        this.f3887a = parcel.readString();
        this.f3888b = parcel.readString();
        this.f3889c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
    }

    public String getProvince() {
        return this.f3887a;
    }

    public String getCity() {
        return this.f3888b;
    }

    public String getAdCode() {
        return this.f3889c;
    }

    public String getWeather() {
        return this.d;
    }

    public String getTemperature() {
        return this.e;
    }

    public String getWindDirection() {
        return this.f;
    }

    public String getWindPower() {
        return this.g;
    }

    public String getHumidity() {
        return this.h;
    }

    public String getReportTime() {
        return this.i;
    }

    public void setProvince(String str) {
        this.f3887a = str;
    }

    public void setCity(String str) {
        this.f3888b = str;
    }

    public void setAdCode(String str) {
        this.f3889c = str;
    }

    public void setWeather(String str) {
        this.d = str;
    }

    public void setTemperature(String str) {
        this.e = str;
    }

    public void setWindDirection(String str) {
        this.f = str;
    }

    public void setWindPower(String str) {
        this.g = str;
    }

    public void setHumidity(String str) {
        this.h = str;
    }

    public void setReportTime(String str) {
        this.i = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3887a);
        parcel.writeString(this.f3888b);
        parcel.writeString(this.f3889c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
