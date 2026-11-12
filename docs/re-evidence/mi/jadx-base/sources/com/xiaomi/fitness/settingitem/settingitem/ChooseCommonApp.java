package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class ChooseCommonApp {

    @SerializedName(DeviceSettingConfigKey.KEY_CHOOSE_COMMON_APP)
    @Expose
    private int chooseCommonApp;

    @SerializedName(DeviceSettingConfigKey.KEY_CHOISE_LAST_UPDATE_TIME)
    @Expose
    private long lastUpdateTime;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChooseCommonApp)) {
            return false;
        }
        ChooseCommonApp chooseCommonApp = (ChooseCommonApp) obj;
        return this.chooseCommonApp == chooseCommonApp.chooseCommonApp && this.lastUpdateTime == chooseCommonApp.lastUpdateTime;
    }

    public int getChooseCommonApp() {
        return this.chooseCommonApp;
    }

    public long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public int hashCode() {
        int i = (this.chooseCommonApp + 31) * 31;
        long j = this.lastUpdateTime;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public void setChooseCommonApp(int i) {
        this.chooseCommonApp = i;
    }

    public void setLastUpdateTime(long j) {
        this.lastUpdateTime = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChooseCommonApp.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(DeviceSettingConfigKey.KEY_CHOOSE_COMMON_APP);
        sb.append('=');
        sb.append(this.chooseCommonApp);
        sb.append(',');
        sb.append(DeviceSettingConfigKey.KEY_CHOISE_LAST_UPDATE_TIME);
        sb.append('=');
        sb.append(this.lastUpdateTime);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
