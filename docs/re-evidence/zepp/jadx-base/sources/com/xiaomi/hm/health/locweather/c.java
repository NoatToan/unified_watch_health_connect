package com.xiaomi.hm.health.locweather;

import android.location.Location;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.locweather.bean.AlertInfoBean;
import com.xiaomi.hm.health.locweather.bean.CityInfoBean;
import com.xiaomi.hm.health.locweather.bean.ForecastWeatherInfoBean;
import com.xiaomi.hm.health.locweather.bean.RealtimeAQInfoBean;
import com.xiaomi.hm.health.locweather.bean.RealtimeWeatherInfoBean;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
class c {
    private static final String a = "WeatherWebAPI";
    private static final String b = "https://weatherapi.market.xiaomi.com";
    private static final String c = "/wtr-v3/location/city/geo";
    private static final String d = "/wtr-v3/weather/current";
    private static final String e = "/wtr-v3/weather/forecast/daily";
    private static final String f = "/wtr-v3/weather/aqi/current";
    private static final String g = "/wtr-v3/location/city/search";
    private static final String h = "/wtr-v3/weather/alerts";
    private static final String i = "appKey=watch20161010&sign=j9PMzsOIAw0bN8eE";
    private static final String j = "latitude";
    private static final String k = "longitude";
    private static final String l = "countryCode";
    private static final String m = "adminArea";
    private static final String n = "locality";
    private static final String o = "subLocality";
    private static final String p = "thoroughfare";
    private static final String q = "locale";
    private static final String r = "locationKey";
    private static final String s = "isGlobal";
    private static final String t = "days";
    private static final String u = "name";
    public static final String v = "Weather_Request_Fail";
    public static final int w = 200;

    public class a implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ StringBuilder b;

        public a(String str, StringBuilder sb) {
            this.a = str;
            this.b = sb;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.i(c.a, "get url: " + this.a + " onCancel: " + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.i(c.a, "get url: " + this.a + " completed", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(c.a, "get url: " + this.a + " error: " + th.getMessage(), new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(c.a, "get url: " + this.a + " failed; statusCode: " + hMHttpResponseData.getStatusCode() + "; msg: " + hMHttpResponseData.getError().getMessage(), new Object[0]);
            Analytics.recordEvent(new CountEventBuilder(c.v).setValue(Integer.toString(hMHttpResponseData.getStatusCode())));
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(c.a, "onSuccess, url: " + this.a + ";statusCode: " + hMHttpResponseData.getStatusCode(), new Object[0]);
            if (!hMHttpResponseData.isSuccess()) {
                Analytics.recordEvent(new CountEventBuilder(c.v).setValue(Integer.toString(hMHttpResponseData.getStatusCode())));
            }
            try {
                this.b.append(new String(hMHttpResponseData.getResponseBody()));
            } catch (Exception e) {
                HMLog.i(c.a, "exception: " + e.getMessage(), new Object[0]);
            }
            HMLog.i(c.a, "=========================onSuccess=========================", new Object[0]);
        }
    }

    public static RealtimeAQInfoBean a(String str, boolean z) {
        HashMap map = new HashMap();
        map.put(r, str);
        map.put(s, Boolean.toString(z));
        map.put("locale", c());
        String strD = d(i(), map);
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        try {
            return (RealtimeAQInfoBean) new Gson().fromJson(strD, RealtimeAQInfoBean.class);
        } catch (Exception e2) {
            HMLog.i(a, "getAQIRealtime:" + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public static CityInfoBean b(Location location) {
        HashMap map = new HashMap();
        map.put("latitude", String.valueOf(location.getLatitude()));
        map.put("longitude", String.valueOf(location.getLongitude()));
        map.put("locale", c());
        String strD = d(k(), map);
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        try {
            CityInfoBean[] cityInfoBeanArr = (CityInfoBean[]) new Gson().fromJson(strD, CityInfoBean[].class);
            if (cityInfoBeanArr == null || cityInfoBeanArr.length <= 0) {
                return null;
            }
            return cityInfoBeanArr[0];
        } catch (Exception e2) {
            HMLog.i(a, "getCity:" + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public static String c() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    private static String d(String str, HashMap<String, String> map) {
        StringBuilder sb = new StringBuilder();
        HMLog.i(a, "请求了接口：" + str, new Object[0]);
        HMWebUtil.doRequest(str, new HashMap(map), Support.RequestSupport.GET, true, new a(str, sb));
        if (!TextUtils.equals(k(), str)) {
            HMLog.i(a, "url: " + str + ", response: " + ((Object) sb), new Object[0]);
        }
        return sb.toString();
    }

    public static AlertInfoBean e(String str, boolean z) {
        HashMap map = new HashMap();
        map.put(r, str);
        map.put(s, Boolean.toString(z));
        map.put("locale", c());
        String strD = d(j(), map);
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        try {
            return (AlertInfoBean) new Gson().fromJson(strD, AlertInfoBean.class);
        } catch (Exception e2) {
            HMLog.i(a, "getWeatherAlerts:" + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public static ForecastWeatherInfoBean f(String str, boolean z, int i2) {
        HashMap map = new HashMap();
        map.put(r, str);
        map.put("days", String.valueOf(i2));
        map.put(s, Boolean.toString(z));
        map.put("locale", c());
        String strD = d(l(), map);
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        try {
            return (ForecastWeatherInfoBean) new Gson().fromJson(strD, ForecastWeatherInfoBean.class);
        } catch (Exception e2) {
            HMLog.i(a, "getWeatherForecast:" + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public static RealtimeWeatherInfoBean g(String str, boolean z) {
        HashMap map = new HashMap();
        map.put(r, str);
        map.put(s, Boolean.toString(z));
        map.put("locale", c());
        String strD = d(m(), map);
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        try {
            return (RealtimeWeatherInfoBean) new Gson().fromJson(strD, RealtimeWeatherInfoBean.class);
        } catch (Exception e2) {
            HMLog.i(a, "getWeatherRealtime:" + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public static CityInfoBean[] h(String str) {
        HashMap map = new HashMap();
        map.put("name", str);
        map.put("locale", c());
        try {
            return (CityInfoBean[]) new Gson().fromJson(d(n(), map), CityInfoBean[].class);
        } catch (Exception e2) {
            HMLog.i(a, "searchCities:" + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    private static String i() {
        return "https://weatherapi.market.xiaomi.com/wtr-v3/weather/aqi/current?appKey=watch20161010&sign=j9PMzsOIAw0bN8eE";
    }

    private static String j() {
        return "https://weatherapi.market.xiaomi.com/wtr-v3/weather/alerts?appKey=watch20161010&sign=j9PMzsOIAw0bN8eE";
    }

    private static String k() {
        return "https://weatherapi.market.xiaomi.com/wtr-v3/location/city/geo?appKey=watch20161010&sign=j9PMzsOIAw0bN8eE";
    }

    private static String l() {
        return "https://weatherapi.market.xiaomi.com/wtr-v3/weather/forecast/daily?appKey=watch20161010&sign=j9PMzsOIAw0bN8eE";
    }

    private static String m() {
        return "https://weatherapi.market.xiaomi.com/wtr-v3/weather/current?appKey=watch20161010&sign=j9PMzsOIAw0bN8eE";
    }

    private static String n() {
        return "https://weatherapi.market.xiaomi.com/wtr-v3/location/city/search?appKey=watch20161010&sign=j9PMzsOIAw0bN8eE";
    }
}
