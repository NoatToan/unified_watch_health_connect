package com.xiaomi.hm.health.bt.sdk.pai;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class PaiGoalData implements Serializable {
    private static final long serialVersionUID = 1;
    private int suggestedHeartRate;
    private int suggestedTime;
    private int targetDisparity;

    public PaiGoalData(int i, int i2, int i3) {
        this.targetDisparity = i;
        this.suggestedHeartRate = i2;
        this.suggestedTime = i3;
    }

    public int getSuggestedHeartRate() {
        return this.suggestedHeartRate;
    }

    public int getSuggestedTime() {
        return this.suggestedTime;
    }

    public int getTargetDisparity() {
        return this.targetDisparity;
    }
}
