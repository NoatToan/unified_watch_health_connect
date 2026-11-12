package com.huawei.hms.hihealth.data;

import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.health.aabq;
import com.huawei.hms.health.aabv;
import com.huawei.hms.health.aabw;
import com.huawei.hms.health.aaby;
import com.huawei.hms.health.aabz;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class PaceSummary extends aabq {
    public static final Parcelable.Creator<PaceSummary> CREATOR = new aabq.aab(PaceSummary.class);
    private static final String TAG = "PaceSummary";

    @aaby(id = 5)
    private Double avgPace;

    @aaby(id = 6)
    private Double bestPace;

    @aaby(id = 2)
    private Map<String, Double> britishPaceMap;

    @aaby(id = 4)
    private Map<String, Double> britishPartTimeMap;

    @aaby(id = 1)
    private Map<String, Double> paceMap;

    @aaby(id = 3)
    private Map<String, Double> partTimeMap;

    @aaby(id = 7)
    private Map<String, Double> sportHealthPaceMap;

    public String toString() {
        StringBuilder sbAab = com.huawei.hms.health.aab.aab("PaceSummary{paceMap = ");
        sbAab.append(this.paceMap);
        sbAab.append(", britishPaceMap = ");
        sbAab.append(this.britishPaceMap);
        sbAab.append(", partTimeMap = ");
        sbAab.append(this.partTimeMap);
        sbAab.append(", britishPartTimeMap = ");
        sbAab.append(this.britishPartTimeMap);
        sbAab.append(", avgPace = ");
        sbAab.append(this.avgPace);
        sbAab.append(", bestPace = ");
        sbAab.append(this.bestPace);
        sbAab.append(", sportHealthPaceMap = ");
        sbAab.append(this.sportHealthPaceMap);
        sbAab.append("}");
        return sbAab.toString();
    }

    @Deprecated
    public void setSportHealthPaceMap(Map<String, Double> map) {
        this.sportHealthPaceMap = map;
    }

    public void setPartTimeMap(Map<String, Double> map) {
        this.partTimeMap = map;
    }

    public void setPaceMap(Map<String, Double> map) {
        this.paceMap = map;
    }

    public void setBritishPartTimeMap(Map<String, Double> map) {
        this.britishPartTimeMap = map;
    }

    public void setBritishPaceMap(Map<String, Double> map) {
        this.britishPaceMap = map;
    }

    public void setBestPace(Double d) {
        this.bestPace = d;
    }

    public void setAvgPace(Double d) {
        this.avgPace = d;
    }

    public int hashCode() {
        return Objects.hashCode(this.paceMap, this.britishPaceMap, this.partTimeMap, this.britishPartTimeMap, this.avgPace, this.bestPace, this.sportHealthPaceMap);
    }

    public Map<String, Double> getSportHealthPaceMap() {
        return this.sportHealthPaceMap;
    }

    public Map<String, Double> getPartTimeMap() {
        return this.partTimeMap;
    }

    public Map<String, Double> getPaceMap() {
        return this.paceMap;
    }

    public Map<String, Double> getBritishPartTimeMap() {
        return this.britishPartTimeMap;
    }

    public Map<String, Double> getBritishPaceMap() {
        return this.britishPaceMap;
    }

    public Double getBestPace() {
        return this.bestPace;
    }

    public Double getAvgPace() {
        return this.avgPace;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaceSummary)) {
            return false;
        }
        PaceSummary paceSummary = (PaceSummary) obj;
        return java.util.Objects.equals(this.paceMap, paceSummary.paceMap) && java.util.Objects.equals(this.britishPaceMap, paceSummary.britishPaceMap) && java.util.Objects.equals(this.partTimeMap, paceSummary.partTimeMap) && java.util.Objects.equals(this.britishPartTimeMap, paceSummary.britishPartTimeMap) && java.util.Objects.equals(this.avgPace, paceSummary.avgPace) && java.util.Objects.equals(this.bestPace, paceSummary.bestPace) && java.util.Objects.equals(this.sportHealthPaceMap, paceSummary.sportHealthPaceMap);
    }

    @aabw
    public PaceSummary(@aabv(id = 1) Map<String, Double> map, @aabv(id = 2) Map<String, Double> map2, @aabv(id = 3) Map<String, Double> map3, @aabv(id = 4) Map<String, Double> map4, @aabv(id = 5) Double d, @aabv(id = 6) Double d2, @aabv(id = 7) Map<String, Double> map5) {
        aabz.aabb(TAG, "PaceSummary() SafePrimary ");
        this.paceMap = map;
        this.britishPaceMap = map2;
        this.partTimeMap = map3;
        this.britishPartTimeMap = map4;
        this.avgPace = d;
        this.bestPace = d2;
        this.sportHealthPaceMap = map5;
    }

    public PaceSummary() {
        this.paceMap = new HashMap();
        this.britishPaceMap = new HashMap();
        this.partTimeMap = new HashMap();
        this.britishPartTimeMap = new HashMap();
        Double dValueOf = Double.valueOf(0.0d);
        this.avgPace = dValueOf;
        this.bestPace = dValueOf;
        this.sportHealthPaceMap = new HashMap();
        aabz.aabb(TAG, "PaceSummary() ");
    }
}
