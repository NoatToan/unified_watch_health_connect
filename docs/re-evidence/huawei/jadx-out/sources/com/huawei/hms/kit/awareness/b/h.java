package com.huawei.hms.kit.awareness.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.status.WeatherStatus;
import com.huawei.hms.kit.awareness.status.weather.Aqi;
import com.huawei.hms.kit.awareness.status.weather.DailyWeather;
import com.huawei.hms.kit.awareness.status.weather.HourlyWeather;
import com.huawei.hms.kit.awareness.status.weather.LiveInfo;
import com.huawei.hms.kit.awareness.status.weather.WeatherSituation;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class h implements Parcelable, WeatherStatus {
    public static final Parcelable.Creator<h> CREATOR = new Parcelable.Creator<h>() { // from class: com.huawei.hms.kit.awareness.b.h.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i) {
            return new h[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.huawei.hms.kit.awareness.barrier.internal.b.i f13908a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13908a, i);
    }

    @Override // com.huawei.hms.kit.awareness.status.WeatherStatus
    public WeatherSituation getWeatherSituation() {
        return new WeatherSituation(this.f13908a.a(), this.f13908a.e());
    }

    @Override // com.huawei.hms.kit.awareness.status.WeatherStatus
    public List<LiveInfo> getLiveInfo() {
        return this.f13908a.h();
    }

    @Override // com.huawei.hms.kit.awareness.status.WeatherStatus
    public List<HourlyWeather> getHourlyWeather() {
        return this.f13908a.g();
    }

    @Override // com.huawei.hms.kit.awareness.status.WeatherStatus
    public List<DailyWeather> getDailyWeather() {
        return this.f13908a.f();
    }

    @Override // com.huawei.hms.kit.awareness.status.WeatherStatus
    public Aqi getAqi() {
        return this.f13908a.b();
    }

    public h(com.huawei.hms.kit.awareness.barrier.internal.b.i iVar) {
        this.f13908a = iVar;
    }

    private h(Parcel parcel) {
        this.f13908a = (com.huawei.hms.kit.awareness.barrier.internal.b.i) parcel.readParcelable(com.huawei.hms.kit.awareness.barrier.internal.b.i.class.getClassLoader());
    }
}
