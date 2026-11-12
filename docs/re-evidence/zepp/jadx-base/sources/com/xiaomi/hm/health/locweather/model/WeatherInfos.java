package com.xiaomi.hm.health.locweather.model;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class WeatherInfos {
    private static final String g = "WeatherInfos";
    private CityInfo b;
    private RealtimeWeatherInfo a = null;
    private List<ForecastWeatherInfo> c = null;
    private AqiInfo d = null;
    private List<AlertInfo> e = null;
    private long f = 0;

    public static WeatherInfos fromJsonString(String str) {
        WeatherInfos weatherInfos = new WeatherInfos();
        try {
            JSONObject jSONObject = new JSONObject(str);
            weatherInfos.setCityInfo(CityInfo.fromJsonString(jSONObject.optString("city_info")));
            weatherInfos.setRealtimeWeatherInfo(RealtimeWeatherInfo.fromJsonString(jSONObject.optString("realtime_weather_info")));
            weatherInfos.setAqiInfo(AqiInfo.fromJsonString(jSONObject.optString("aqi_info")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("forecast_weather_infos");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    ForecastWeatherInfo forecastWeatherInfoFromJson = ForecastWeatherInfo.fromJson(jSONArrayOptJSONArray.getJSONObject(i));
                    if (forecastWeatherInfoFromJson != null) {
                        arrayList.add(forecastWeatherInfoFromJson);
                    }
                }
                weatherInfos.setForecastWeatherInfos(arrayList);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("alert_infos");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    AlertInfo alertInfoFromJson = AlertInfo.fromJson(jSONArrayOptJSONArray2.getJSONObject(i2));
                    if (alertInfoFromJson != null) {
                        arrayList2.add(alertInfoFromJson);
                    }
                }
                weatherInfos.setAlertInfos(arrayList2);
            }
            weatherInfos.setLastUpdateTime(jSONObject.optLong("last_update_time", 0L));
        } catch (Exception e) {
            Log.i(g, "Exception:" + e.getMessage());
        }
        return weatherInfos;
    }

    public void checkValidity() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        RealtimeWeatherInfo realtimeWeatherInfo = this.a;
        if (realtimeWeatherInfo != null && (realtimeWeatherInfo.getPubTime() == null || jCurrentTimeMillis - this.a.getPubTime().getTimeInMillis() > GlobalDefine.INTERNAL_ALARM_FOR_WEAR_SERVICE)) {
            this.a = null;
        }
        AqiInfo aqiInfo = this.d;
        if (aqiInfo != null && (aqiInfo.getPubTime() == null || jCurrentTimeMillis - this.d.getPubTime().getTimeInMillis() > GlobalDefine.INTERNAL_ALARM_FOR_WEAR_SERVICE)) {
            this.d = null;
        }
        List<ForecastWeatherInfo> list = this.c;
        if (list != null && list.size() > 0) {
            ForecastWeatherInfo forecastWeatherInfo = this.c.get(0);
            if (forecastWeatherInfo.getPubTime() == null || jCurrentTimeMillis - forecastWeatherInfo.getPubTime().getTimeInMillis() > 86400000) {
                this.c = null;
            }
        }
        List<AlertInfo> list2 = this.e;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        AlertInfo alertInfo = this.e.get(0);
        if (alertInfo.getPubTime() == null || jCurrentTimeMillis - alertInfo.getPubTime().getTimeInMillis() > 3600000) {
            this.e = null;
        }
    }

    @Nullable
    public List<AlertInfo> getAlertInfos() {
        return this.e;
    }

    @Nullable
    public AqiInfo getAqiInfo() {
        return this.d;
    }

    @Nullable
    public CityInfo getCityInfo() {
        return this.b;
    }

    @Nullable
    public List<ForecastWeatherInfo> getForecastWeatherInfos() {
        return this.c;
    }

    public long getLastUpdateTime() {
        return this.f;
    }

    @Nullable
    public RealtimeWeatherInfo getRealtimeWeatherInfo() {
        return this.a;
    }

    public boolean isSuccess() {
        List<ForecastWeatherInfo> list;
        CityInfo cityInfo = this.b;
        return (cityInfo == null || TextUtils.isEmpty(cityInfo.getLocationKey()) || this.a == null || (list = this.c) == null || list.size() == 0) ? false : true;
    }

    public void setAlertInfos(List<AlertInfo> list) {
        this.e = list;
    }

    public void setAqiInfo(AqiInfo aqiInfo) {
        this.d = aqiInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.b = cityInfo;
    }

    public void setForecastWeatherInfos(List<ForecastWeatherInfo> list) {
        this.c = list;
    }

    public void setLastUpdateTime(long j) {
        this.f = j;
    }

    public void setRealtimeWeatherInfo(RealtimeWeatherInfo realtimeWeatherInfo) {
        this.a = realtimeWeatherInfo;
    }

    public boolean shouldUpdate() {
        return System.currentTimeMillis() - this.f > 3600000;
    }

    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            CityInfo cityInfo = this.b;
            if (cityInfo != null) {
                jSONObject.put("city_info", cityInfo.toJsonString());
            }
            RealtimeWeatherInfo realtimeWeatherInfo = this.a;
            if (realtimeWeatherInfo != null) {
                jSONObject.put("realtime_weather_info", realtimeWeatherInfo.toJsonString());
            }
            AqiInfo aqiInfo = this.d;
            if (aqiInfo != null) {
                jSONObject.put("aqi_info", aqiInfo.toJsonString());
            }
            List<ForecastWeatherInfo> list = this.c;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<ForecastWeatherInfo> it2 = this.c.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next().toJson());
                }
                jSONObject.put("forecast_weather_infos", jSONArray);
            }
            List<AlertInfo> list2 = this.e;
            if (list2 != null && list2.size() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<AlertInfo> it3 = this.e.iterator();
                while (it3.hasNext()) {
                    jSONArray2.put(it3.next().toJson());
                }
                jSONObject.put("alert_infos", jSONArray2);
            }
            jSONObject.put("last_update_time", this.f);
        } catch (Exception e) {
            Log.i(g, "Exception:" + e.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return toJsonString();
    }

    public boolean weatherValid() {
        List<ForecastWeatherInfo> list;
        return (this.a == null || (list = this.c) == null || list.size() == 0 || this.d == null) ? false : true;
    }
}
