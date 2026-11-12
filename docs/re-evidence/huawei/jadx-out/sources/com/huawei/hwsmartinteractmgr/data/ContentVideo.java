package com.huawei.hwsmartinteractmgr.data;

import com.huawei.pluginfitnessadvice.FitWorkout;

/* JADX INFO: loaded from: classes11.dex */
public class ContentVideo {
    private FitWorkout fitWorkout;

    public ContentVideo(FitWorkout fitWorkout) {
        this.fitWorkout = fitWorkout;
    }

    public FitWorkout getFitWorkout() {
        return this.fitWorkout;
    }

    public void setFitWorkout(FitWorkout fitWorkout) {
        this.fitWorkout = fitWorkout;
    }

    public String toString() {
        return "ContentVideo{fitWorkout='" + this.fitWorkout + '}';
    }
}
