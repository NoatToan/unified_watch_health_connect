package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class AppSortItem {

    @SerializedName("enable")
    @Expose
    private boolean enable;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("index")
    @Expose
    private int index;

    @SerializedName("parentType")
    @Expose
    private int parentType = -1;

    @SerializedName("type")
    @Expose
    private int type;

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppSortItem)) {
            return false;
        }
        AppSortItem appSortItem = (AppSortItem) obj;
        return this.enable == appSortItem.enable && this.index == appSortItem.index && ((str = this.id) == (str2 = appSortItem.id) || (str != null && str.equals(str2))) && this.type == appSortItem.type && this.parentType == appSortItem.parentType;
    }

    public boolean getEnable() {
        return this.enable;
    }

    public String getId() {
        return this.id;
    }

    public int getIndex() {
        return this.index;
    }

    public int getParentType() {
        return this.parentType;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int i = ((((this.enable ? 1 : 0) + 31) * 31) + this.index) * 31;
        String str = this.id;
        return ((((i + (str == null ? 0 : str.hashCode())) * 31) + this.type) * 31) + this.parentType;
    }

    public boolean isAlwaysShown(int i) {
        return i == 18 || i == 7 || i == 19;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setParentType(int i) {
        this.parentType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AppSortItem.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("id");
        sb.append('=');
        String str = this.id;
        if (str == null) {
            str = "<null>";
        }
        sb.append(str);
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(this.type);
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(this.index);
        sb.append(',');
        sb.append("enable");
        sb.append('=');
        sb.append(this.enable);
        sb.append(',');
        sb.append("parentType");
        sb.append('=');
        sb.append(this.parentType);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
