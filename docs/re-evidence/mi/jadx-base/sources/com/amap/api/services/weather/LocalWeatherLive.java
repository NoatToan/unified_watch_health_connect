package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class LocalWeatherLive implements Parcelable {
    public static final Parcelable.Creator<LocalWeatherLive> CREATOR = new Parcelable.Creator<LocalWeatherLive>() { // from class: com.amap.api.services.weather.LocalWeatherLive.1
        private static LocalWeatherLive a(Parcel parcel) {
            return new LocalWeatherLive(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocalWeatherLive createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocalWeatherLive[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6808b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    public LocalWeatherLive() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.c;
    }

    public String getCity() {
        return this.f6808b;
    }

    public String getHumidity() {
        return this.h;
    }

    public String getProvince() {
        return this.f6807a;
    }

    public String getReportTime() {
        return this.i;
    }

    public String getTemperature() {
        return this.e;
    }

    public String getWeather() {
        return this.d;
    }

    public String getWindDirection() {
        return this.f;
    }

    public String getWindPower() {
        return this.g;
    }

    public void setAdCode(String str) {
        this.c = str;
    }

    public void setCity(String str) {
        this.f6808b = str;
    }

    public void setHumidity(String str) {
        this.h = str;
    }

    public void setProvince(String str) {
        this.f6807a = str;
    }

    public void setReportTime(String str) {
        this.i = str;
    }

    public void setTemperature(String str) {
        this.e = str;
    }

    public void setWeather(String str) {
        this.d = str;
    }

    public void setWindDirection(String str) {
        this.f = str;
    }

    public void setWindPower(String str) {
        this.g = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6807a);
        parcel.writeString(this.f6808b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }

    public LocalWeatherLive(Parcel parcel) {
        this.f6807a = parcel.readString();
        this.f6808b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
    }
}
