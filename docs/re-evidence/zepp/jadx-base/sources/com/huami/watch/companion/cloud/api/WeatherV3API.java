package com.huami.watch.companion.cloud.api;

import android.content.Context;
import com.google.gson.Gson;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.cloud.bean.CloudWeatherAQIRealtime;
import com.huami.watch.companion.cloud.bean.CloudWeatherAlerts;
import com.huami.watch.companion.cloud.bean.CloudWeatherCity;
import com.huami.watch.companion.cloud.bean.CloudWeatherCurrent;
import com.huami.watch.companion.cloud.bean.CloudWeatherForecast;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.location.Location;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Response;

/* JADX INFO: loaded from: classes16.dex */
public class WeatherV3API {
    private static final String a = "API-WeatherV3";
    private static final String b = "latitude";
    private static final String c = "longitude";
    private static final String d = "countryCode";
    private static final String e = "adminArea";
    private static final String f = "locality";
    private static final String g = "subLocality";
    private static final String h = "thoroughfare";
    private static final String i = "locale";
    private static final String j = "locationKey";
    private static final String k = "isGlobal";
    private static final String l = "days";
    private static final String m = "name";
    private static final String n = "deviceSource";

    private static Map<String, String> a(Context context, Location location) {
        HashMap map = new HashMap();
        map.put("latitude", String.valueOf(location.getLatitude()));
        map.put("longitude", String.valueOf(location.getLongitude()));
        if (location.getAddress() != null) {
            Location.Address address = location.getAddress();
            map.put("countryCode", address.getCountryCode());
            map.put(e, address.getAdmin());
            map.put(f, address.getLocality());
            map.put(g, address.getSubLocality());
            map.put(h, address.getThoroughfare());
        }
        map.put("locale", I18nUtil.getLocaleStr(context));
        map.put("deviceSource", String.valueOf(DeviceSource.getCurrentDeviceSource(context)));
        return map;
    }

    private static Map<String, String> b(Context context, String str) {
        HashMap map = new HashMap();
        map.put("name", str);
        map.put("locale", I18nUtil.getLocaleStr(context));
        map.put("deviceSource", String.valueOf(DeviceSource.getCurrentDeviceSource(context)));
        return map;
    }

    private static Map<String, String> c(Context context, String str) {
        HashMap map = new HashMap();
        map.put(j, str);
        map.put("locale", I18nUtil.getLocaleStr(context));
        map.put("deviceSource", String.valueOf(DeviceSource.getCurrentDeviceSource(context)));
        return map;
    }

    public static CloudWeatherAQIRealtime getAQIRealtime(Context context, String str) {
        Map<String, String> mapC = c(context, str);
        mapC.put("days", String.valueOf(5));
        CloudWeatherAQIRealtime cloudWeatherAQIRealtime = null;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlWeatherAQIRealtime(), mapC));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                try {
                    cloudWeatherAQIRealtime = (CloudWeatherAQIRealtime) new Gson().fromJson(strResponseBodyString, CloudWeatherAQIRealtime.class);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    Log.e(a, "Get AQI Realtime Parse Err!!", e2, new Object[0]);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            Log.e(a, "Get AQI Realtime Err!!", e3, new Object[0]);
        }
        Log.d(a, "Get AQI Realtime : " + cloudWeatherAQIRealtime, new Object[0]);
        return cloudWeatherAQIRealtime;
    }

    public static List<CloudWeatherAlerts.Alert> getAlerts(Context context, String str) {
        CloudWeatherAlerts cloudWeatherAlerts;
        List<CloudWeatherAlerts.Alert> listAsList = null;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlWeatherAlerts(), c(context, str)));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                try {
                    cloudWeatherAlerts = (CloudWeatherAlerts) new Gson().fromJson(strResponseBodyString, CloudWeatherAlerts.class);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    Log.e(a, "Get Alerts Parse Err!!", e2, new Object[0]);
                    cloudWeatherAlerts = null;
                }
                if (cloudWeatherAlerts != null && cloudWeatherAlerts.getAlerts() != null) {
                    listAsList = Arrays.asList(cloudWeatherAlerts.getAlerts());
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            Log.e(a, "Get Alerts Err!!", e3, new Object[0]);
        }
        Log.d(a, "Get Alerts : " + listAsList, new Object[0]);
        return listAsList;
    }

    public static List<CloudWeatherCity> getCitiesByName(Context context, String str) {
        CloudWeatherCity[] cloudWeatherCityArr;
        List<CloudWeatherCity> listAsList = null;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlWeatherSearchCities(), b(context, str)));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                try {
                    cloudWeatherCityArr = (CloudWeatherCity[]) new Gson().fromJson(strResponseBodyString, CloudWeatherCity[].class);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    Log.e(a, "Get CitiesByName Parse Err!!", e2, new Object[0]);
                    cloudWeatherCityArr = null;
                }
                if (cloudWeatherCityArr != null) {
                    listAsList = Arrays.asList(cloudWeatherCityArr);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            Log.e(a, "Get CitiesByName Err!!", e3, new Object[0]);
        }
        Log.d(a, "Get CitiesByName : " + listAsList, new Object[0]);
        return listAsList;
    }

    public static CloudWeatherCity getCity(Context context, Location location) {
        CloudWeatherCity[] cloudWeatherCityArr;
        CloudWeatherCity cloudWeatherCity = null;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlWeatherCity(), a(context, location)));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                try {
                    cloudWeatherCityArr = (CloudWeatherCity[]) new Gson().fromJson(strResponseBodyString, CloudWeatherCity[].class);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    Log.e(a, "Get City Parse Err!!", e2, new Object[0]);
                    cloudWeatherCityArr = null;
                }
                if (cloudWeatherCityArr != null && cloudWeatherCityArr.length > 0) {
                    cloudWeatherCity = cloudWeatherCityArr[0];
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            Log.e(a, "Get City Err!!", e3, new Object[0]);
        }
        Log.d(a, "Get City : " + cloudWeatherCity, new Object[0]);
        return cloudWeatherCity;
    }

    public static CloudWeatherForecast getWeatherForecast(Context context, String str, int i2) {
        Map<String, String> mapC = c(context, str);
        mapC.put("days", String.valueOf(i2));
        CloudWeatherForecast cloudWeatherForecast = null;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlWeatherForecast(), mapC));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                try {
                    cloudWeatherForecast = (CloudWeatherForecast) new Gson().fromJson(strResponseBodyString, CloudWeatherForecast.class);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    Log.e(a, "Get Weather Forecast Parse Err!!", e2, new Object[0]);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            Log.e(a, "Get Weather Forecast Err!!", e3, new Object[0]);
        }
        Log.d(a, "Get Weather Forecast : " + cloudWeatherForecast, new Object[0]);
        return cloudWeatherForecast;
    }

    public static CloudWeatherCurrent getWeatherRealtime(Context context, String str) {
        CloudWeatherCurrent cloudWeatherCurrent = null;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlWeatherRealtime(), c(context, str)));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                try {
                    cloudWeatherCurrent = (CloudWeatherCurrent) new Gson().fromJson(strResponseBodyString, CloudWeatherCurrent.class);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    Log.e(a, "Get Weather Realtime Parse Err!!", e2, new Object[0]);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            Log.e(a, "Get Weather Realtime Err!!", e3, new Object[0]);
        }
        Log.d(a, "Get Weather Realtime : " + cloudWeatherCurrent, new Object[0]);
        return cloudWeatherCurrent;
    }
}
