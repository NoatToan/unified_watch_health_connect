package com.xiaomi.hm.health.dataprocess;

import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class StageSteps implements Serializable {
    public int time = 0;
    public int steps = 0;
    public int count = 0;
    public int distance = 0;
    public int cal = 0;

    public void setInfos(int i, int i2, int i3, int i4, int i5) {
        this.time = i;
        this.steps = i2;
        this.count = i3;
        this.distance = i4;
        this.cal = i5;
    }

    public String toString() {
        return "this.time:" + this.time + ",this.steps:" + this.steps + ",this.count:" + this.count + ",this.distance:" + this.distance + " ,this.cal: " + this.cal;
    }
}
