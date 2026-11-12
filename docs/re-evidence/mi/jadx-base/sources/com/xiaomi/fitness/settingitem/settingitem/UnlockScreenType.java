package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class UnlockScreenType {

    @SerializedName(DeviceSettingConfigKey.KEY_UNLOCK_SCREEN_TYPE)
    @Expose
    private int unlockScreenType;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UnlockScreenType) && this.unlockScreenType == ((UnlockScreenType) obj).unlockScreenType;
    }

    public int getUnlockScreenType() {
        return this.unlockScreenType;
    }

    public int hashCode() {
        return 31 + this.unlockScreenType;
    }

    public void setUnlockScreenType(int i) {
        this.unlockScreenType = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UnlockScreenType.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(DeviceSettingConfigKey.KEY_UNLOCK_SCREEN_TYPE);
        sb.append('=');
        sb.append(this.unlockScreenType);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
