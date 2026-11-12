package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class LocalWeatherForecast implements Parcelable {
    public static final Parcelable.Creator<LocalWeatherForecast> CREATOR = new Parcelable.Creator<LocalWeatherForecast>() { // from class: com.amap.api.services.weather.LocalWeatherForecast.1
        private static LocalWeatherForecast a(Parcel parcel) {
            return new LocalWeatherForecast(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocalWeatherForecast createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocalWeatherForecast[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6804b;
    private String c;
    private String d;
    private List<LocalDayWeatherForecast> e;

    public LocalWeatherForecast() {
        this.e = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.c;
    }

    public String getCity() {
        return this.f6804b;
    }

    public String getProvince() {
        return this.f6803a;
    }

    public String getReportTime() {
        return this.d;
    }

    public List<LocalDayWeatherForecast> getWeatherForecast() {
        return this.e;
    }

    public void setAdCode(String str) {
        this.c = str;
    }

    public void setCity(String str) {
        this.f6804b = str;
    }

    public void setProvince(String str) {
        this.f6803a = str;
    }

    public void setReportTime(String str) {
        this.d = str;
    }

    public void setWeatherForecast(List<LocalDayWeatherForecast> list) {
        this.e = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6803a);
        parcel.writeString(this.f6804b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeList(this.e);
    }

    public LocalWeatherForecast(Parcel parcel) {
        this.e = new ArrayList();
        this.f6803a = parcel.readString();
        this.f6804b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readArrayList(LocalWeatherForecast.class.getClassLoader());
    }
}
