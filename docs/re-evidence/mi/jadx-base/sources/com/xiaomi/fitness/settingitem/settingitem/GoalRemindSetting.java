package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class GoalRemindSetting {

    @SerializedName("enable")
    @Expose
    private boolean enable;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GoalRemindSetting) && this.enable == ((GoalRemindSetting) obj).enable;
    }

    public int hashCode() {
        return 31 + (this.enable ? 1 : 0);
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GoalRemindSetting.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("enable");
        sb.append('=');
        sb.append(this.enable);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
