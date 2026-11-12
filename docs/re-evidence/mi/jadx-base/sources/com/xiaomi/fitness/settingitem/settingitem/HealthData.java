package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class HealthData {

    @SerializedName("enable")
    @Expose
    private boolean enable;

    @SerializedName("type")
    @Expose
    private String type;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HealthData)) {
            return false;
        }
        HealthData healthData = (HealthData) obj;
        String str = this.type;
        String str2 = healthData.type;
        return (str == str2 || (str != null && str.equals(str2))) && this.enable == healthData.enable;
    }

    public Boolean getEnable() {
        return Boolean.valueOf(this.enable);
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (!this.enable ? 1 : 0);
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HealthData.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("type");
        sb.append('=');
        String str = this.type;
        if (str == null) {
            str = "<null>";
        }
        sb.append(str);
        sb.append(',');
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
