package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class LocalWeatherForecast implements Parcelable {
    public static final Parcelable.Creator<LocalWeatherForecast> CREATOR = new Parcelable.Creator<LocalWeatherForecast>() { // from class: com.amap.api.services.weather.LocalWeatherForecast.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocalWeatherForecast[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocalWeatherForecast createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static LocalWeatherForecast a(Parcel parcel) {
            return new LocalWeatherForecast(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3884c;
    private String d;
    private List<LocalDayWeatherForecast> e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocalWeatherForecast() {
        this.e = new ArrayList();
    }

    public String getProvince() {
        return this.f3882a;
    }

    public void setProvince(String str) {
        this.f3882a = str;
    }

    public String getCity() {
        return this.f3883b;
    }

    public void setCity(String str) {
        this.f3883b = str;
    }

    public String getAdCode() {
        return this.f3884c;
    }

    public void setAdCode(String str) {
        this.f3884c = str;
    }

    public String getReportTime() {
        return this.d;
    }

    public void setReportTime(String str) {
        this.d = str;
    }

    public List<LocalDayWeatherForecast> getWeatherForecast() {
        return this.e;
    }

    public void setWeatherForecast(List<LocalDayWeatherForecast> list) {
        this.e = list;
    }

    public LocalWeatherForecast(Parcel parcel) {
        this.e = new ArrayList();
        this.f3882a = parcel.readString();
        this.f3883b = parcel.readString();
        this.f3884c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readArrayList(LocalWeatherForecast.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3882a);
        parcel.writeString(this.f3883b);
        parcel.writeString(this.f3884c);
        parcel.writeString(this.d);
        parcel.writeList(this.e);
    }
}
