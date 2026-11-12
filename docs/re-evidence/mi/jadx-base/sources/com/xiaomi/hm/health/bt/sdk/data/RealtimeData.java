package com.xiaomi.hm.health.bt.sdk.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class RealtimeData implements Serializable {
    private static final long serialVersionUID = 1;
    private int totalStep = 0;
    private int totalDis = 0;
    private int totalCal = 0;
    private boolean isSupportStepExtra = false;

    public int getTotalCal() {
        return this.totalCal;
    }

    public int getTotalDis() {
        return this.totalDis;
    }

    public int getTotalStep() {
        return this.totalStep;
    }

    public boolean isSupportStepExtra() {
        return this.isSupportStepExtra;
    }

    public void setSupportStepExtra(boolean z) {
        this.isSupportStepExtra = z;
    }

    public void setTotalCal(int i) {
        this.totalCal = i;
    }

    public void setTotalDis(int i) {
        this.totalDis = i;
    }

    public void setTotalStep(int i) {
        this.totalStep = i;
    }
}
