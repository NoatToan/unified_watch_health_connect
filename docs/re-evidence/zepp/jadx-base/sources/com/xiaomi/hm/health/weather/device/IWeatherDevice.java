package com.xiaomi.hm.health.weather.device;

import androidx.annotation.WorkerThread;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H'J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H'J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0014\u001a\u00020\u0004H&¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/weather/device/IWeatherDevice;", "", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "city", "", "updateLocateCity", "", "loadProtocolVersion", "addCity", "", "loadCityList", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "loadWeatherSetting", "getTempUnit", "alert", "setAlert", "tempUnit", "setTempUnit", "deleteCity", "setDefaultCity", "supportDefaultCity", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IWeatherDevice {
    @WorkerThread
    boolean addCity(@NotNull City city);

    @WorkerThread
    boolean deleteCity(@NotNull City city);

    int getTempUnit();

    @NotNull
    List<City> loadCityList();

    int loadProtocolVersion();

    @NotNull
    WeatherSetting loadWeatherSetting();

    @WorkerThread
    boolean setAlert(boolean alert);

    @WorkerThread
    boolean setDefaultCity(@NotNull City city);

    @WorkerThread
    boolean setTempUnit(int tempUnit);

    boolean supportDefaultCity();

    @WorkerThread
    boolean updateLocateCity(@Nullable City city);
}
