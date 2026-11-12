package defpackage;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.weather.LocalWeatherLive;
import com.amap.api.services.weather.WeatherSearchQuery;

/* JADX INFO: loaded from: classes4.dex */
public final class kys extends mys<WeatherSearchQuery, LocalWeatherLive> {
    public LocalWeatherLive y;

    public kys(Context context, WeatherSearchQuery weatherSearchQuery) {
        super(context, weatherSearchQuery);
        this.y = new LocalWeatherLive();
    }

    @Override // defpackage.mys, com.amap.api.col.p0003sl.la
    public final /* bridge */ /* synthetic */ String getURL() {
        return super.getURL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json");
        String city = ((WeatherSearchQuery) this.s).getCity();
        if (!fvs.s0(city)) {
            String strB = kts.b(city);
            stringBuffer.append("&city=");
            stringBuffer.append(strB);
        }
        stringBuffer.append("&extensions=base");
        stringBuffer.append("&key=" + e0t.k(this.v));
        return stringBuffer.toString();
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final LocalWeatherLive e(String str) throws AMapException {
        LocalWeatherLive localWeatherLiveL0 = fvs.l0(str);
        this.y = localWeatherLiveL0;
        return localWeatherLiveL0;
    }
}
