package com.huami.devicex.injection.data;

import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\n\u001a\u00020\tH&J\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH'J\b\u0010\u0011\u001a\u00020\tH'J\b\u0010\u0012\u001a\u00020\tH'J\b\u0010\u0013\u001a\u00020\tH'J\b\u0010\u0014\u001a\u00020\tH&J\b\u0010\u0015\u001a\u00020\tH&¨\u0006\u0016"}, d2 = {"Lcom/huami/devicex/injection/data/WeatherApi;", "", "", "getLocationCode", "getLocationCity", "getLocationProvince", "Lcom/xiaomi/hm/health/locweather/model/WeatherInfos;", "getWeatherInfoForDevice", "getWeatherInfo", "", "updateAlert", "name", "", "source", "", "Lcom/xiaomi/hm/health/locweather/model/CityInfo;", "searchCities", "requestLocation", "requestLocationOnly", "requestLocationLimited", "cancelLocation", "clearData", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface WeatherApi {
    void cancelLocation();

    void clearData();

    @NotNull
    String getLocationCity();

    @NotNull
    String getLocationCode();

    @NotNull
    String getLocationProvince();

    @Nullable
    WeatherInfos getWeatherInfo();

    @Nullable
    WeatherInfos getWeatherInfoForDevice();

    @MainThread
    void requestLocation();

    @MainThread
    void requestLocationLimited();

    @MainThread
    void requestLocationOnly();

    @WorkerThread
    @Nullable
    List<CityInfo> searchCities(@Nullable String name, int source);

    void updateAlert();
}
