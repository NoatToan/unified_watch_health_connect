package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class HealthDataSetting {

    @SerializedName("healthdatalist")
    @Expose
    private List<HealthData> healthdatalist = new ArrayList();

    @SerializedName("healthmanuallist")
    @Expose
    private List<HealthData> healthmanuallist = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HealthDataSetting)) {
            return false;
        }
        HealthDataSetting healthDataSetting = (HealthDataSetting) obj;
        List<HealthData> list = this.healthdatalist;
        List<HealthData> list2 = healthDataSetting.healthdatalist;
        if (list == list2 || (list != null && list.equals(list2))) {
            List<HealthData> list3 = this.healthmanuallist;
            List<HealthData> list4 = healthDataSetting.healthmanuallist;
            if (list3 == list4) {
                return true;
            }
            if (list3 != null && list3.equals(list4)) {
                return true;
            }
        }
        return false;
    }

    public List<HealthData> getHealthdatalist() {
        return this.healthdatalist;
    }

    public List<HealthData> getHealthmanuallist() {
        return this.healthmanuallist;
    }

    public int hashCode() {
        List<HealthData> list = this.healthdatalist;
        int iHashCode = ((list == null ? 0 : list.hashCode()) + 31) * 31;
        List<HealthData> list2 = this.healthmanuallist;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public void setHealthdatalist(List<HealthData> list) {
        this.healthdatalist = list;
    }

    public void setHealthmanuallist(List<HealthData> list) {
        this.healthmanuallist = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HealthDataSetting.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("healthdatalist");
        sb.append('=');
        Object obj = this.healthdatalist;
        if (obj == null) {
            obj = "<null>";
        }
        sb.append(obj);
        sb.append(',');
        sb.append("healthmanuallist");
        sb.append('=');
        List<HealthData> list = this.healthmanuallist;
        sb.append(list != null ? list : "<null>");
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
