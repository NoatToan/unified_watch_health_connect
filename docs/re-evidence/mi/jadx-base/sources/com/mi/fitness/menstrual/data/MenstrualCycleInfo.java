package com.mi.fitness.menstrual.data;

/* JADX INFO: loaded from: classes5.dex */
public class MenstrualCycleInfo {
    public MenstrualCycleElement currentCycle;
    public long currentDate;
    public int mcycle;
    public MenstrualCycleElement nextCycle;
    public MenstrualCycleElement secondCycle;
    public int status;
    public int tcycle;

    public String toString() {
        return "MenstrualCycleInfo(currentDate=" + this.currentDate + ", currentCycle=" + this.currentCycle + ", nextCycle=" + this.nextCycle + ", secondCycle=" + this.secondCycle + ", mcycle=" + this.mcycle + ", tcycle=" + this.tcycle + ", status=" + this.status + ")";
    }
}
