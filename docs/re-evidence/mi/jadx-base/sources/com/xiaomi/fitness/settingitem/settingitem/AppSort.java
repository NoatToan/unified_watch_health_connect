package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class AppSort {

    @SerializedName(DeviceSettingConfigKey.KEY_APPSORT)
    @Expose
    private List<AppSortItem> appsort = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppSort)) {
            return false;
        }
        List<AppSortItem> list = this.appsort;
        List<AppSortItem> list2 = ((AppSort) obj).appsort;
        if (list != list2) {
            return list != null && list.equals(list2);
        }
        return true;
    }

    public List<AppSortItem> getAppsort() {
        return this.appsort;
    }

    public int hashCode() {
        List<AppSortItem> list = this.appsort;
        return 31 + (list == null ? 0 : list.hashCode());
    }

    public void setAppsort(List<AppSortItem> list) {
        this.appsort = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AppSort.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(DeviceSettingConfigKey.KEY_APPSORT);
        sb.append('=');
        Object obj = this.appsort;
        if (obj == null) {
            obj = "<null>";
        }
        sb.append(obj);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
