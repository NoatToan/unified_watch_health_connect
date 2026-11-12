package com.huami.watch.companion.battery.bean;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public final class BatteryInfo {
    private int a;
    private long b;
    private int c;
    private boolean d;

    public long getBatteryChargingTime() {
        return this.b;
    }

    public int getBatteryIntervalDay() {
        return this.c;
    }

    public int getBatteryLevel() {
        return this.a;
    }

    public boolean isBatteryCharging() {
        return this.d;
    }

    public void setBatteryCharging(boolean z) {
        this.d = z;
    }

    public void setBatteryChargingTime(long j) {
        this.b = j;
    }

    public void setBatteryIntervalDay(int i) {
        this.c = i;
    }

    public void setBatteryLevel(int i) {
        this.a = i;
    }

    public String toString() {
        return "<BatteryLevel: " + this.a + ", BatteryChargingTime: " + this.b + ", BatteryIntervalDay: " + this.c + ", BatteryCharging: " + this.d + Typography.greater;
    }
}
