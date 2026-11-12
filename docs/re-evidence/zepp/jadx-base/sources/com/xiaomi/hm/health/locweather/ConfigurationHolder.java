package com.xiaomi.hm.health.locweather;

import android.annotation.SuppressLint;
import android.content.Context;
import com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback;
import com.xiaomi.hm.health.locweather.proxy.WeatherSettingProxy;

/* JADX INFO: loaded from: classes21.dex */
public class ConfigurationHolder {

    @SuppressLint({"StaticFieldLeak"})
    private static Context a = null;
    private static boolean b = false;
    private static WeatherSettingProxy c;

    public static boolean a() {
        return b;
    }

    public static Context getContext() {
        return a;
    }

    public static WeatherSettingProxy getWeatherSettingProxy() {
        return c;
    }

    public static void setContext(Context context) {
        a = context;
    }

    public static void setGlobal(boolean z) {
        b = z;
    }

    public static void setWeatherSettingProxy(IWeatherSettingCallback iWeatherSettingCallback) {
        c = new WeatherSettingProxy(iWeatherSettingCallback);
    }
}
