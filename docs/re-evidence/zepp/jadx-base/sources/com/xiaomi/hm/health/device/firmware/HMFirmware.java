package com.xiaomi.hm.health.device.firmware;

/* JADX INFO: loaded from: classes20.dex */
public class HMFirmware {
    public String a;
    public String b;

    public HMFirmware(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String getFwName() {
        return this.a;
    }

    public String getFwVersion() {
        return this.b;
    }

    public void setFwName(String str) {
        this.a = str;
    }

    public void setFwVersion(String str) {
        this.b = str;
    }

    public String toString() {
        return "HMFirmware{fwName='" + this.a + "', fwVersion='" + this.b + "'}";
    }
}
