package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class WeatherSetting {

    @SerializedName("alerts")
    @Expose
    private boolean alerts;

    @SerializedName("city")
    @Expose
    private String city;

    @SerializedName("locationKey")
    @Expose
    private String locationKey;

    @SerializedName("syncOpen")
    @Expose
    private boolean syncOpen;

    @SerializedName("temp")
    @Expose
    private int temp;

    public WeatherSetting() {
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WeatherSetting)) {
            return false;
        }
        WeatherSetting weatherSetting = (WeatherSetting) obj;
        if (this.alerts == weatherSetting.alerts && (((str = this.locationKey) == (str2 = weatherSetting.locationKey) || (str != null && str.equals(str2))) && this.temp == weatherSetting.temp && this.syncOpen == weatherSetting.syncOpen)) {
            String str3 = this.city;
            String str4 = weatherSetting.city;
            if (str3 == str4) {
                return true;
            }
            if (str3 != null && str3.equals(str4)) {
                return true;
            }
        }
        return false;
    }

    public String getCity() {
        return this.city;
    }

    public String getLocationKey() {
        return this.locationKey;
    }

    public int getTemp() {
        return this.temp;
    }

    public int hashCode() {
        int i = ((this.alerts ? 1 : 0) + 31) * 31;
        String str = this.locationKey;
        int iHashCode = (((((i + (str == null ? 0 : str.hashCode())) * 31) + this.temp) * 31) + (this.syncOpen ? 1 : 0)) * 31;
        String str2 = this.city;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean isAlerts() {
        return this.alerts;
    }

    public boolean isSyncOpen() {
        return this.syncOpen;
    }

    public void setAlerts(boolean z) {
        this.alerts = z;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setLocationKey(String str) {
        this.locationKey = str;
    }

    public void setSyncOpen(boolean z) {
        this.syncOpen = z;
    }

    public void setTemp(int i) {
        this.temp = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WeatherSetting.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("city");
        sb.append('=');
        String str = this.city;
        if (str == null) {
            str = "<null>";
        }
        sb.append(str);
        sb.append(',');
        sb.append("syncOpen");
        sb.append('=');
        sb.append(this.syncOpen);
        sb.append(',');
        sb.append("temp");
        sb.append('=');
        sb.append(this.temp);
        sb.append(',');
        sb.append("alerts");
        sb.append('=');
        sb.append(this.alerts);
        sb.append(',');
        sb.append("locationKey");
        sb.append('=');
        String str2 = this.locationKey;
        sb.append(str2 != null ? str2 : "<null>");
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    public WeatherSetting(String str, boolean z, int i, boolean z2, String str2) {
        this.city = str;
        this.syncOpen = z;
        this.temp = i;
        this.alerts = z2;
        this.locationKey = str2;
    }
}
