package com.mi.fitness.menstrual.data;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class MenstrualSettingRequest {
    public List<Integer> histMenstrualEndTimeSeconds;
    public List<Integer> histMenstrualStartTimeSeconds;
    public int userMenstrualCycle;
    public int userMenstrualDuration;

    public String toString() {
        return "MenstrualSettingRequest(userMenstrualCycle=" + this.userMenstrualCycle + ", userMenstrualDuration=" + this.userMenstrualDuration + ", histMenstrualStartTimeSeconds=" + this.histMenstrualStartTimeSeconds + ", histMenstrualEndTimeSeconds=" + this.histMenstrualEndTimeSeconds + ")";
    }
}
