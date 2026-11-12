package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class WorldclockSetting {

    @SerializedName("cityIds")
    @Expose
    private List<String> cityIds = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WorldclockSetting)) {
            return false;
        }
        List<String> list = this.cityIds;
        List<String> list2 = ((WorldclockSetting) obj).cityIds;
        if (list != list2) {
            return list != null && list.equals(list2);
        }
        return true;
    }

    public List<String> getCityIds() {
        return this.cityIds;
    }

    public int hashCode() {
        List<String> list = this.cityIds;
        return 31 + (list == null ? 0 : list.hashCode());
    }

    public void setCityIds(List<String> list) {
        this.cityIds = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WorldclockSetting.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("cityIds");
        sb.append('=');
        Object obj = this.cityIds;
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
