package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.weather.LocalWeatherLive;
import com.amap.api.services.weather.WeatherSearchQuery;

/* JADX INFO: loaded from: classes21.dex */
public final class hj extends hk<WeatherSearchQuery, LocalWeatherLive> {
    private LocalWeatherLive k;

    @Override // com.amap.api.col.p0003sl.hk, com.amap.api.col.p0003sl.la
    public final /* bridge */ /* synthetic */ String getURL() {
        return super.getURL();
    }

    public hj(Context context, WeatherSearchQuery weatherSearchQuery) {
        super(context, weatherSearchQuery);
        this.k = new LocalWeatherLive();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("output=json");
        String city = ((WeatherSearchQuery) this.f2534b).getCity();
        if (!gc.i(city)) {
            stringBuffer.append("&city=").append(b(city));
        }
        stringBuffer.append("&extensions=base");
        stringBuffer.append("&key=" + il.f(this.i));
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LocalWeatherLive a(String str) throws AMapException {
        LocalWeatherLive localWeatherLiveG = gc.g(str);
        this.k = localWeatherLiveG;
        return localWeatherLiveG;
    }
}
