package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class UnwearSetting {

    @SerializedName("enable")
    @Expose
    private boolean enable;

    @SerializedName("password")
    @Expose
    private String password;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnwearSetting)) {
            return false;
        }
        UnwearSetting unwearSetting = (UnwearSetting) obj;
        String str = this.password;
        String str2 = unwearSetting.password;
        return (str == str2 || (str != null && str.equals(str2))) && this.enable == unwearSetting.enable;
    }

    public String getPassword() {
        return this.password;
    }

    public int hashCode() {
        String str = this.password;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.enable ? 1 : 0);
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UnwearSetting.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("password");
        sb.append('=');
        String str = this.password;
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
