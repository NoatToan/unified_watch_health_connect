package com.xiaomi.hm.health.locweather;

import android.location.Location;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.locweather.WeatherAPI;
import com.xiaomi.hm.health.locweather.bean.AlertInfoBean;
import com.xiaomi.hm.health.locweather.bean.CityInfoBean;
import com.xiaomi.hm.health.locweather.bean.ForecastWeatherInfoBean;
import com.xiaomi.hm.health.locweather.bean.RealtimeAQInfoBean;
import com.xiaomi.hm.health.locweather.bean.RealtimeWeatherInfoBean;
import com.xiaomi.hm.health.locweather.model.AlertInfo;
import com.xiaomi.hm.health.locweather.model.AqiInfo;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.ForecastWeatherInfo;
import com.xiaomi.hm.health.locweather.model.RealtimeWeatherInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class WeatherAPI {
    private static final String a = "WeatherAPI";

    public static CityInfo c(Location location) {
        CityInfoBean cityInfoBeanB = c.b(location);
        if (cityInfoBeanB == null || cityInfoBeanB.getStatus() != 0) {
            return null;
        }
        return toCityInfo(cityInfoBeanB);
    }

    public static List<ForecastWeatherInfo> d(String str, boolean z, int i) {
        ForecastWeatherInfoBean forecastWeatherInfoBeanF = c.f(str, z, i);
        if (forecastWeatherInfoBeanF != null && forecastWeatherInfoBeanF.getStatus() == 0) {
            ArrayList arrayList = new ArrayList();
            Calendar calendar = Calendar.getInstance();
            ForecastWeatherInfoBean.Weather weather = forecastWeatherInfoBeanF.getWeather();
            ForecastWeatherInfoBean.Temperature temperature = forecastWeatherInfoBeanF.getTemperature();
            ForecastWeatherInfoBean.SunriseSunset sunriseSunset = forecastWeatherInfoBeanF.getSunriseSunset();
            if (weather.getStatus() == 0 && temperature.getStatus() == 0) {
                List<ForecastWeatherInfoBean.Change> value = weather.getValue();
                List<ForecastWeatherInfoBean.Change> value2 = temperature.getValue();
                List<ForecastWeatherInfoBean.Change> value3 = sunriseSunset.getValue();
                String unit = temperature.getUnit();
                if (value != null && value.size() != 0 && value2 != null && value2.size() != 0 && value.size() == value2.size()) {
                    int size = value.size();
                    if (size <= i) {
                        i = size;
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        ForecastWeatherInfo forecastWeatherInfo = new ForecastWeatherInfo();
                        forecastWeatherInfo.setPubTime(calendar);
                        if (calendar != null) {
                            Calendar calendar2 = (Calendar) calendar.clone();
                            calendar2.add(5, i2);
                            forecastWeatherInfo.setDate(calendar2);
                        }
                        try {
                            ForecastWeatherInfoBean.Change change = value.get(i2);
                            ForecastWeatherInfoBean.Change change2 = value2.get(i2);
                            ForecastWeatherInfoBean.Change change3 = value3.get(i2);
                            forecastWeatherInfo.setWeatherFrom(Integer.parseInt(change.getFrom()));
                            forecastWeatherInfo.setWeatherTo(Integer.parseInt(change.getTo()));
                            forecastWeatherInfo.setTemperatureFrom(Integer.parseInt(change2.getFrom()));
                            forecastWeatherInfo.setTemperatureTo(Integer.parseInt(change2.getTo()));
                            forecastWeatherInfo.setTemperatureUnit(unit);
                            forecastWeatherInfo.setSunriseTime(parsePubTime(change3.getFrom()));
                            forecastWeatherInfo.setSunsetTime(parsePubTime(change3.getTo()));
                            forecastWeatherInfo.setSuccess(true);
                            forecastWeatherInfo.setLastUpdateTime(System.currentTimeMillis());
                            arrayList.add(forecastWeatherInfo);
                        } catch (Exception e) {
                            e.printStackTrace();
                            HMLog.i(a, "getForecastWeatherInfo exception: " + e.getMessage(), new Object[0]);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static List<AlertInfo> e(String str, boolean z) {
        AlertInfoBean alertInfoBeanE = c.e(str, z);
        if (alertInfoBeanE == null || alertInfoBeanE.getAlerts() == null || alertInfoBeanE.getAlerts().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AlertInfoBean.AlertsBean alertsBean : alertInfoBeanE.getAlerts()) {
            AlertInfo alertInfo = new AlertInfo();
            alertInfo.setPubTime(Calendar.getInstance());
            alertInfo.setAlertId(alertsBean.getAlertId());
            alertInfo.setDetail(alertsBean.getDetail());
            alertInfo.setLevel(alertsBean.getLevel());
            alertInfo.setType(alertsBean.getType());
            alertInfo.setTitle(alertsBean.getTitle());
            alertInfo.setSuccess(true);
            arrayList.add(alertInfo);
        }
        return arrayList;
    }

    public static AqiInfo f(String str, boolean z) {
        RealtimeAQInfoBean realtimeAQInfoBeanA = c.a(str, z);
        int i = (realtimeAQInfoBeanA == null || realtimeAQInfoBeanA.getStatus() != 0) ? -1 : Integer.parseInt(realtimeAQInfoBeanA.getAqi());
        Calendar calendar = Calendar.getInstance();
        AqiInfo aqiInfo = new AqiInfo();
        aqiInfo.setAqi(i);
        aqiInfo.setPubTime(calendar);
        aqiInfo.setSuccess(true);
        return aqiInfo;
    }

    public static RealtimeWeatherInfo g(String str, boolean z) {
        RealtimeWeatherInfoBean realtimeWeatherInfoBeanG = c.g(str, z);
        if (realtimeWeatherInfoBeanG != null && realtimeWeatherInfoBeanG.getTemperature() != null && realtimeWeatherInfoBeanG.getWeather() != null) {
            try {
                String unit = realtimeWeatherInfoBeanG.getTemperature().getUnit();
                int i = Integer.parseInt(realtimeWeatherInfoBeanG.getTemperature().getValue());
                int i2 = Integer.parseInt(realtimeWeatherInfoBeanG.getWeather());
                float f = Float.parseFloat(realtimeWeatherInfoBeanG.getHumidity().getValue());
                float f2 = Float.parseFloat(realtimeWeatherInfoBeanG.getWind().getSpeed().getValue());
                float f3 = Float.parseFloat(realtimeWeatherInfoBeanG.getWind().getDirection().getValue());
                Calendar calendar = Calendar.getInstance();
                RealtimeWeatherInfo realtimeWeatherInfo = new RealtimeWeatherInfo();
                realtimeWeatherInfo.setPubTime(calendar);
                realtimeWeatherInfo.setCurrentWeather(i2);
                realtimeWeatherInfo.setCurrentTemperature(i);
                realtimeWeatherInfo.setCurrentTemperatureUnit(unit);
                realtimeWeatherInfo.setDate(calendar);
                realtimeWeatherInfo.setHumidity(f);
                realtimeWeatherInfo.setWindSpeed(f2);
                realtimeWeatherInfo.setWindDirection(f3);
                realtimeWeatherInfo.setSuccess(true);
                return realtimeWeatherInfo;
            } catch (Exception e) {
                HMLog.i(a, "parse realtime exception: " + e, new Object[0]);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Location location) {
        CityInfo cityInfoC = c(location);
        if (cityInfoC == null) {
            return;
        }
        String locationKey = cityInfoC.getLocationKey();
        HMLog.d(a, "aqiInfo:" + f(locationKey, false), new Object[0]);
        HMLog.d(a, "realtimeWeatherInfo:" + g(locationKey, false), new Object[0]);
        List<ForecastWeatherInfo> listD = d(locationKey, false, 7);
        if (listD != null && listD.size() > 0) {
            Iterator<ForecastWeatherInfo> it2 = listD.iterator();
            while (it2.hasNext()) {
                HMLog.d(a, "ForecastWeatherInfo:" + it2.next(), new Object[0]);
            }
        }
        List<AlertInfo> listE = e(locationKey, false);
        if (listE == null || listE.size() <= 0) {
            return;
        }
        Iterator<AlertInfo> it3 = listE.iterator();
        while (it3.hasNext()) {
            HMLog.d(a, "AlertInfo:" + it3.next(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Location location) {
        CityInfoBean cityInfoBeanB = c.b(location);
        if (cityInfoBeanB == null) {
            return;
        }
        String locationKey = cityInfoBeanB.getLocationKey();
        c.a(locationKey, false);
        c.g(locationKey, false);
        c.f(locationKey, false, 15);
        c.e(locationKey, false);
    }

    public static List<CityInfo> j(String str) {
        CityInfoBean[] cityInfoBeanArrH = c.h(str);
        if (cityInfoBeanArrH == null || cityInfoBeanArrH.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (CityInfoBean cityInfoBean : cityInfoBeanArrH) {
            arrayList.add(toCityInfo(cityInfoBean));
        }
        return arrayList;
    }

    public static Calendar parsePubTime(String str) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault()).parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (Exception e) {
            HMLog.i(a, e.getMessage(), new Object[0]);
            return null;
        }
    }

    public static void testAllAPI(final Location location) {
        new Thread(new Runnable() { // from class: ho8
            @Override // java.lang.Runnable
            public final void run() {
                WeatherAPI.h(location);
            }
        }).start();
    }

    public static void testAllWebAPI(final Location location) {
        new Thread(new Runnable() { // from class: go8
            @Override // java.lang.Runnable
            public final void run() {
                WeatherAPI.i(location);
            }
        }).start();
    }

    public static CityInfo toCityInfo(CityInfoBean cityInfoBean) {
        CityInfo cityInfo = new CityInfo();
        cityInfo.setLocationKey(cityInfoBean.getLocationKey());
        cityInfo.setAffiliation(cityInfoBean.getAffiliation());
        cityInfo.setLatitude(cityInfoBean.getLatitude());
        cityInfo.setLongitude(cityInfoBean.getLongitude());
        cityInfo.setName(cityInfoBean.getName());
        cityInfo.setTimeZoneShift(cityInfoBean.getTimeZoneShift());
        return cityInfo;
    }
}
