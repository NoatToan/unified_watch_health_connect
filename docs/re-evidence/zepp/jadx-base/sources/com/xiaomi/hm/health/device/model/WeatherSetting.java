package com.xiaomi.hm.health.device.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.utils.WeatherUtils;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class WeatherSetting {
    public static final int TEMP_UNIT_C = 0;
    public static final int TEMP_UNIT_F = 1;
    private static final String h = "WeatherSetting";
    private String a;
    private String b;
    private String c;
    private boolean d;
    private int e;
    private boolean f;
    private boolean g;

    public WeatherSetting() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = true;
        this.f = true;
        this.g = true;
    }

    @NonNull
    public static WeatherSetting fromJsonString(String str) {
        HMLog.d("WeatherSetting", "fromJsonString string:" + str, new Object[0]);
        WeatherSetting weatherSetting = new WeatherSetting();
        if (TextUtils.isEmpty(str)) {
            return weatherSetting;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            weatherSetting.setCity(jSONObject.optString("city"));
            weatherSetting.setAffiliation(jSONObject.optString(FirebaseAnalytics.Param.AFFILIATION));
            weatherSetting.setLocationKey(jSONObject.optString("locationKey"));
            int i = 1;
            weatherSetting.setAutoLocate(jSONObject.optBoolean("autoLocate", true));
            weatherSetting.setIsNeedMigrationWeatherWay(jSONObject.optBoolean("isNeedMigrationWeatherWay", true));
            int iOptInt = jSONObject.optInt("temperature", -1);
            if (iOptInt != -1) {
                i = iOptInt;
            } else if (!Language.isUSA()) {
                i = 0;
            }
            weatherSetting.setTemperatureUnit(i);
            weatherSetting.setAlertEnable(jSONObject.getBoolean("alerts"));
        } catch (Exception e) {
            HMLog.d("WeatherSetting", "Exception:" + e.getMessage(), new Object[0]);
        }
        HMLog.d("WeatherSetting", "fromJsonString setting:" + weatherSetting, new Object[0]);
        return weatherSetting;
    }

    public boolean a() {
        return this.g;
    }

    public String getAffiliation() {
        return this.b;
    }

    public boolean getAutoLocate() {
        return this.d;
    }

    public String getCity() {
        return this.a;
    }

    public String getDisplayCity() {
        if (WeatherUtils.isKoreaUser() && this.d && TextUtils.isEmpty(this.c)) {
            return DeviceXFunctionsKt.getContext().getString(R.string.not_set);
        }
        if (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.a)) {
            return DeviceXFunctionsKt.getContext().getString(R.string.not_set);
        }
        if (TextUtils.isEmpty(this.b)) {
            return this.a;
        }
        String str = this.b.split(", ")[0];
        String str2 = this.b.split(",")[0];
        if (TextUtils.equals(this.a, str)) {
            return this.a;
        }
        if (TextUtils.equals(this.a, str2)) {
            return this.a;
        }
        return this.a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str;
    }

    public String getLocationKey() {
        return this.c;
    }

    public int getTemperatureUnit() {
        return this.e;
    }

    public boolean isAlertEnable() {
        return this.f;
    }

    public void setAffiliation(String str) {
        this.b = str;
    }

    public void setAlertEnable(boolean z) {
        this.f = z;
    }

    public void setAutoLocate(boolean z) {
        this.d = z;
    }

    public void setCity(String str) {
        this.a = str;
    }

    public void setIsNeedMigrationWeatherWay(boolean z) {
        this.g = z;
    }

    public void setLocationKey(String str) {
        this.c = str;
    }

    public void setTemperatureUnit(int i) {
        this.e = i;
    }

    public String toJsonString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("city", this.a);
            jSONObject.put("locationKey", this.c);
            jSONObject.put("autoLocate", this.d);
            jSONObject.put("temperature", this.e);
            jSONObject.put("alerts", this.f);
            jSONObject.put(FirebaseAnalytics.Param.AFFILIATION, this.b);
            jSONObject.put("isNeedMigrationWeatherWay", this.g);
            String string = jSONObject.toString();
            HMLog.d("WeatherSetting", "toJsonString:" + string, new Object[0]);
            return string;
        } catch (Exception e) {
            HMLog.d("WeatherSetting", "Exception:" + e.getMessage(), new Object[0]);
            return null;
        }
    }

    public String toString() {
        return "WeatherSetting{city='" + this.a + "'locationKey='" + this.c + "'autoLocate='" + this.d + "', temperatureUnit=" + this.e + ", alertEnable=" + this.f + ", affiliation=" + this.b + '}';
    }

    public WeatherSetting(String str, String str2, boolean z, int i, boolean z2) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = true;
        this.f = true;
        this.g = true;
        this.a = str;
        this.c = str2;
        this.d = z;
        this.e = i;
        this.f = z2;
    }
}
