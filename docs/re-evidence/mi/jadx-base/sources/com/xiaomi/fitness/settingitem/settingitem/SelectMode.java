package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class SelectMode {

    @SerializedName(DeviceSettingConfigKey.KEY_SELECT_MODE)
    @Expose
    private int selectMode;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SelectMode) && this.selectMode == ((SelectMode) obj).selectMode;
    }

    public int getSelectMode() {
        return this.selectMode;
    }

    public int hashCode() {
        return 31 + this.selectMode;
    }

    public void setSelectMode(int i) {
        this.selectMode = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SelectMode.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(DeviceSettingConfigKey.KEY_SELECT_MODE);
        sb.append('=');
        sb.append(this.selectMode);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
