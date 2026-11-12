package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class SecondaryScreenItem {

    @SerializedName("enable")
    @Expose
    private boolean enable;

    @SerializedName("index")
    @Expose
    private int index;

    @SerializedName("type")
    @Expose
    private int type;

    @SerializedName("updated")
    @Expose
    private boolean updated;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SecondaryScreenItem)) {
            return false;
        }
        SecondaryScreenItem secondaryScreenItem = (SecondaryScreenItem) obj;
        return this.index == secondaryScreenItem.index && this.type == secondaryScreenItem.type && this.updated == secondaryScreenItem.updated && this.enable == secondaryScreenItem.enable;
    }

    public int getIndex() {
        return this.index;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((((this.index + 31) * 31) + this.type) * 31) + (this.updated ? 1 : 0)) * 31) + (this.enable ? 1 : 0);
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isUpdated() {
        return this.updated;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUpdated(boolean z) {
        this.updated = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecondaryScreenItem.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("type");
        sb.append('=');
        sb.append(this.type);
        sb.append(',');
        sb.append("enable");
        sb.append('=');
        sb.append(this.enable);
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(this.index);
        sb.append(',');
        sb.append("updated");
        sb.append('=');
        sb.append(this.updated);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
