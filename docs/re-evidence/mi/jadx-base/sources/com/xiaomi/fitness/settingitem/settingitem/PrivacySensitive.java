package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class PrivacySensitive {

    @SerializedName("agree_sensitive")
    @Expose
    private boolean agreeSensitive;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PrivacySensitive) && this.agreeSensitive == ((PrivacySensitive) obj).agreeSensitive;
    }

    public int hashCode() {
        return 31 + (this.agreeSensitive ? 1 : 0);
    }

    public boolean isAgreeSensitive() {
        return this.agreeSensitive;
    }

    public void setAgreeSensitive(boolean z) {
        this.agreeSensitive = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PrivacySensitive.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("agreeSensitive");
        sb.append('=');
        sb.append(this.agreeSensitive);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
