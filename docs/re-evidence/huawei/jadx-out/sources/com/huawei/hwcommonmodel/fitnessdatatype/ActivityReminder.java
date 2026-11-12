package com.huawei.hwcommonmodel.fitnessdatatype;

import defpackage.lst;

/* JADX INFO: loaded from: classes10.dex */
public class ActivityReminder {
    private boolean isEnable = true;
    private int startTime = 2048;
    private int endTime = 5376;
    private int interval = 60;
    private int cycle = 127;

    public boolean isEnabled() {
        return ((Boolean) lst.d(Boolean.valueOf(this.isEnable))).booleanValue();
    }

    public void setEnabled(boolean z) {
        this.isEnable = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public int getInterval() {
        return ((Integer) lst.d(Integer.valueOf(this.interval))).intValue();
    }

    public void setInterval(int i) {
        this.interval = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getStartTime() {
        return ((Integer) lst.d(Integer.valueOf(this.startTime))).intValue();
    }

    public void setStartTime(int i) {
        this.startTime = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getEndTime() {
        return ((Integer) lst.d(Integer.valueOf(this.endTime))).intValue();
    }

    public void setEndTime(int i) {
        this.endTime = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getCycle() {
        return ((Integer) lst.d(Integer.valueOf(this.cycle))).intValue();
    }

    public void setCycle(int i) {
        this.cycle = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String toString() {
        return "ActivityReminder{enable=" + this.isEnable + ", interval=" + this.interval + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", cycle=" + this.cycle + '}';
    }
}
