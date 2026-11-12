package com.huawei.datatype;

import defpackage.lst;

/* JADX INFO: loaded from: classes4.dex */
public class DataDeviceAvoidDisturbInfo {
    private int deviceAvoidDisturbIndex = 1;
    private int deviceAvoidDisturbSwitch = 0;
    private int deviceAvoidDisturbTimeSwitch = 0;
    private int deviceAvoidDisturbType = 0;
    private int deviceAvoidDisturbStartTime = 2300;
    private int deviceAvoidDisturbEndTime = 700;
    private int deviceAvoidDisturbCycle = 127;

    public int getDeviceAvoidDisturbIndex() {
        return ((Integer) lst.d(Integer.valueOf(this.deviceAvoidDisturbIndex))).intValue();
    }

    public void setDeviceAvoidDisturbIndex(int i) {
        this.deviceAvoidDisturbIndex = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDeviceAvoidDisturbSwitch() {
        return ((Integer) lst.d(Integer.valueOf(this.deviceAvoidDisturbSwitch))).intValue();
    }

    public void setDeviceAvoidDisturbSwitch(int i) {
        this.deviceAvoidDisturbSwitch = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDeviceAvoidDisturbType() {
        return ((Integer) lst.d(Integer.valueOf(this.deviceAvoidDisturbType))).intValue();
    }

    public void setDeviceAvoidDisturbType(int i) {
        this.deviceAvoidDisturbType = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDeviceAvoidDisturbStartTime() {
        return ((Integer) lst.d(Integer.valueOf(this.deviceAvoidDisturbStartTime))).intValue();
    }

    public void setDeviceAvoidDisturbStartTime(int i) {
        this.deviceAvoidDisturbStartTime = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDeviceAvoidDisturbEndTime() {
        return ((Integer) lst.d(Integer.valueOf(this.deviceAvoidDisturbEndTime))).intValue();
    }

    public void setDeviceAvoidDisturbEndTime(int i) {
        this.deviceAvoidDisturbEndTime = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDeviceAvoidDisturbCycle() {
        return ((Integer) lst.d(Integer.valueOf(this.deviceAvoidDisturbCycle))).intValue();
    }

    public void setDeviceAvoidDisturbCycle(int i) {
        this.deviceAvoidDisturbCycle = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDeviceAvoidDisturbTimeSwitch() {
        return ((Integer) lst.d(Integer.valueOf(this.deviceAvoidDisturbTimeSwitch))).intValue();
    }

    public void setDeviceAvoidDisturbTimeSwitch(int i) {
        this.deviceAvoidDisturbTimeSwitch = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String toString() {
        return "[勿扰信息列表：index = " + this.deviceAvoidDisturbIndex + ", switch = " + this.deviceAvoidDisturbSwitch + ", time_switch = " + this.deviceAvoidDisturbTimeSwitch + ", type = " + this.deviceAvoidDisturbType + ", start_time = " + this.deviceAvoidDisturbStartTime + ", end_time = " + this.deviceAvoidDisturbEndTime + ", cycle = " + this.deviceAvoidDisturbCycle + "]";
    }
}
