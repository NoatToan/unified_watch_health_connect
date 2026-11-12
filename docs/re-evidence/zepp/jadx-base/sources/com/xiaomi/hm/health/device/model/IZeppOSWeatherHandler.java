package com.xiaomi.hm.health.device.model;

import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\r8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/model/IZeppOSWeatherHandler;", "", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "module", "", "fillWeatherCities", "", "supportLocation", "Lcom/xiaomi/hm/health/locweather/model/WeatherInfos;", "weatherInfo", "handleAutoLocate", "clearCache", "handleFailed", "", "getWeatherProtocolVersion", "()Ljava/lang/Integer;", "setWeatherProtocolVersion", "(Ljava/lang/Integer;)V", "weatherProtocolVersion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IZeppOSWeatherHandler {
    void clearCache();

    void fillWeatherCities(@Nullable WeatherModule module);

    @Nullable
    Integer getWeatherProtocolVersion();

    void handleAutoLocate(@NotNull WeatherInfos weatherInfo);

    void handleFailed();

    void setWeatherProtocolVersion(@Nullable Integer num);

    boolean supportLocation();
}
