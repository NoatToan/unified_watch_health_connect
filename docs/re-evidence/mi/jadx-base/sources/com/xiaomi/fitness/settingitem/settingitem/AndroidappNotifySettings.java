package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class AndroidappNotifySettings {

    @SerializedName("AllNotifiOn")
    @Expose
    private boolean allNotifiOn;

    @SerializedName("Apps")
    @Expose
    private String apps;

    @SerializedName("NotifiOn")
    @Expose
    private boolean notifiOn;

    @SerializedName("screenOnByNewNotificationSwitch")
    @Expose
    private boolean screenOnByNewNotificationSwitch;

    @SerializedName("ScreenSleepOn")
    @Expose
    private boolean screenSleepOn;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidappNotifySettings)) {
            return false;
        }
        AndroidappNotifySettings androidappNotifySettings = (AndroidappNotifySettings) obj;
        return this.screenOnByNewNotificationSwitch == androidappNotifySettings.screenOnByNewNotificationSwitch && this.screenSleepOn == androidappNotifySettings.screenSleepOn && this.notifiOn == androidappNotifySettings.notifiOn && this.allNotifiOn == androidappNotifySettings.allNotifiOn && Objects.equals(this.apps, androidappNotifySettings.apps);
    }

    public String getApps() {
        return this.apps;
    }

    public int hashCode() {
        int i = ((((((((this.screenOnByNewNotificationSwitch ? 1 : 0) + 31) * 31) + (this.screenSleepOn ? 1 : 0)) * 31) + (this.notifiOn ? 1 : 0)) * 31) + (this.allNotifiOn ? 1 : 0)) * 31;
        String str = this.apps;
        return i + (str == null ? 0 : str.hashCode());
    }

    public boolean isAllNotifiOn() {
        return this.allNotifiOn;
    }

    public boolean isNotifiOn() {
        return this.notifiOn;
    }

    public boolean isScreenOnByNewNotificationSwitch() {
        return this.screenOnByNewNotificationSwitch;
    }

    public boolean isScreenSleepOn() {
        return this.screenSleepOn;
    }

    public void setAllNotifiOn(boolean z) {
        this.allNotifiOn = z;
    }

    public void setApps(String str) {
        this.apps = str;
    }

    public void setNotifiOn(boolean z) {
        this.notifiOn = z;
    }

    public void setScreenOnByNewNotificationSwitch(boolean z) {
        this.screenOnByNewNotificationSwitch = z;
    }

    public void setScreenSleepOn(boolean z) {
        this.screenSleepOn = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AndroidappNotifySettings.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("notifiOn");
        sb.append('=');
        sb.append(this.notifiOn);
        sb.append(',');
        sb.append("allNotifiOn");
        sb.append('=');
        sb.append(this.allNotifiOn);
        sb.append(',');
        sb.append("screenSleepOn");
        sb.append('=');
        sb.append(this.screenSleepOn);
        sb.append(',');
        sb.append("screenOnByNewNotificationSwitch");
        sb.append('=');
        sb.append(this.screenOnByNewNotificationSwitch);
        sb.append(',');
        sb.append("apps");
        sb.append('=');
        String str = this.apps;
        if (str == null) {
            str = "<null>";
        }
        sb.append(str);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
