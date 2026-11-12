package com.xiaomi.fitness.health.energy;

import com.google.gson.annotations.SerializedName;
import defpackage.bb8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class EnergyValues implements Serializable {
    private static final String ENERGY_ACTIVITY = "act";
    private static final String ENERGY_OTHERS = "others";
    private static final String ENERGY_RECOVERY = "recover";
    private static final String ENERGY_SLEEP = "sleep";
    private static final String ENERGY_STRESS = "stress";
    public Integer energy;

    @SerializedName("max_energy")
    public int maxEnergy;

    @SerializedName("min_energy")
    public int minEnergy;

    @SerializedName("state_duration")
    public Map<String, Integer> stateDuration;

    private int convertToEnergyState(String str) {
        str.hashCode();
        switch (str) {
            case "stress":
                return 0;
            case "sleep":
                return 2;
            case "recover":
                return 1;
            default:
                return 3;
        }
    }

    public List<bb8> stateDuration() {
        ArrayList arrayList = new ArrayList();
        Map<String, Integer> map = this.stateDuration;
        if (map == null) {
            return arrayList;
        }
        for (String str : map.keySet()) {
            arrayList.add(new bb8(convertToEnergyState(str), this.stateDuration.get(str).intValue()));
        }
        return arrayList;
    }
}
