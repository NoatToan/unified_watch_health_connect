package com.xiaomi.hm.health.weather.other;

import android.text.TextUtils;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/locweather/model/CityInfo;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "toBleModel", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class ZeppOSWeatherHandlerKt {
    @Nullable
    public static final City toBleModel(@Nullable CityInfo cityInfo) {
        if (cityInfo == null || TextUtils.isEmpty(cityInfo.getLocationKey()) || TextUtils.isEmpty(cityInfo.getName())) {
            return null;
        }
        return new City(cityInfo.getLocationKey(), cityInfo.getName());
    }
}
