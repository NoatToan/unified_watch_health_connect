package com.xiaomi.hm.health.locweather;

import android.content.SharedPreferences;
import com.huami.account.UserLegalInfoManager;
import com.xiaomi.hm.health.locweather.location.MyLocation;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import com.xiaomi.hm.health.locweather.proxy.WeatherSettingProxy;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class LocWeatherKeeper {
    private static final String a = "loc_weather";
    private static SharedPreferences b;

    public static class a {
        private static final String a = "KEY_LAST_LOCATION";
        private static final String b = "LastWeatherInfos";
        private static final String c = "LastWeatherInfosForPeyto";
        private static final String d = "LastLocationDetail";
        private static final String e = "LastLocation";
        private static final String f = "language";
        private static final String g = "lastTimerStamp";

        private a() {
        }
    }

    public static WeatherInfos a() {
        e();
        String string = b.getString("LastWeatherInfos", null);
        if (string != null) {
            return WeatherInfos.fromJsonString(string);
        }
        return null;
    }

    public static WeatherInfos b() {
        e();
        String string = b.getString("LastWeatherInfosForPeyto", null);
        if (string != null) {
            return WeatherInfos.fromJsonString(string);
        }
        return null;
    }

    public static void c(String str) {
        e();
        SharedPreferences.Editor editorEdit = b.edit();
        editorEdit.putString("LastWeatherInfos", str);
        editorEdit.apply();
    }

    public static void clear() {
        b.edit().clear().apply();
    }

    public static void d(String str) {
        e();
        SharedPreferences.Editor editorEdit = b.edit();
        editorEdit.putString("LastWeatherInfosForPeyto", str);
        editorEdit.apply();
    }

    private static void e() {
        if (b == null) {
            b = ConfigurationHolder.getContext().getSharedPreferences(a, 0);
        }
    }

    public static void f(String str) {
        e();
        SharedPreferences.Editor editorEdit = b.edit();
        editorEdit.putString("LastLocationDetail", str);
        editorEdit.apply();
    }

    public static void g(String str) {
        e();
        SharedPreferences.Editor editorEdit = b.edit();
        editorEdit.putString("LastLocation", str);
        editorEdit.apply();
    }

    public static String getCurrLanguage() {
        WeatherSettingProxy weatherSettingProxy = ConfigurationHolder.getWeatherSettingProxy();
        Locale deviceLanguageToLocale = Locale.getDefault();
        if (weatherSettingProxy != null) {
            deviceLanguageToLocale = weatherSettingProxy.getDeviceLanguageToLocale();
        }
        return deviceLanguageToLocale.getLanguage() + "_" + deviceLanguageToLocale.getCountry();
    }

    public static String getLanguage() {
        e();
        return b.getString(UserLegalInfoManager.KEY_LANGUAGE, null);
    }

    public static MyLocation getLastLocation() {
        e();
        String string = b.getString("KEY_LAST_LOCATION", null);
        if (string != null) {
            return MyLocation.fromJsonString(string);
        }
        return null;
    }

    public static String getLastLocationDetail() {
        e();
        return b.getString("LastLocationDetail", null);
    }

    public static String getLastLocationStr() {
        e();
        return b.getString("LastLocation", null);
    }

    public static long getLastTimerStamp() {
        e();
        return b.getLong("lastTimerStamp", 0L);
    }

    public static void setLanguage(String str) {
        e();
        SharedPreferences.Editor editorEdit = b.edit();
        editorEdit.putString(UserLegalInfoManager.KEY_LANGUAGE, str);
        editorEdit.apply();
    }

    public static void setLastLocation(String str) {
        e();
        SharedPreferences.Editor editorEdit = b.edit();
        editorEdit.putString("KEY_LAST_LOCATION", str);
        editorEdit.apply();
    }

    public static void setLastTimerStamp(long j) {
        e();
        SharedPreferences.Editor editorEdit = b.edit();
        editorEdit.putLong("lastTimerStamp", j);
        editorEdit.apply();
    }

    public static void updateLocationInfo(MyLocation myLocation) {
        String lastLocationStr = getLastLocationStr();
        String str = myLocation.getAddress().getAdmin() + "," + myLocation.getAddress().getLocality() + "," + myLocation.getAddress().getAdCode();
        f(myLocation.getLatitude() + "," + myLocation.getLongitude() + "," + myLocation.getAddress().getCountry() + "," + myLocation.getAddress().getThoroughfare());
        if (str.equals(lastLocationStr)) {
            return;
        }
        g(str);
    }
}
