package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.weather.LocalWeatherForecast;
import com.amap.api.services.weather.WeatherSearchQuery;

/* JADX INFO: loaded from: classes21.dex */
public final class hi extends hk<WeatherSearchQuery, LocalWeatherForecast> {
    private LocalWeatherForecast k;

    @Override // com.amap.api.col.p0003sl.hk, com.amap.api.col.p0003sl.la
    public final /* bridge */ /* synthetic */ String getURL() {
        return super.getURL();
    }

    public hi(Context context, WeatherSearchQuery weatherSearchQuery) {
        super(context, weatherSearchQuery);
        this.k = new LocalWeatherForecast();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("output=json");
        String city = ((WeatherSearchQuery) this.f2534b).getCity();
        if (!gc.i(city)) {
            stringBuffer.append("&city=").append(b(city));
        }
        stringBuffer.append("&extensions=all");
        stringBuffer.append("&key=" + il.f(this.i));
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LocalWeatherForecast a(String str) throws AMapException {
        LocalWeatherForecast localWeatherForecastH = gc.h(str);
        this.k = localWeatherForecastH;
        return localWeatherForecastH;
    }
}
