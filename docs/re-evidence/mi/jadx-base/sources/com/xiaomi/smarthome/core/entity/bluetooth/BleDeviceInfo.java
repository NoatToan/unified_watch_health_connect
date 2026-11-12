package com.xiaomi.smarthome.core.entity.bluetooth;

/* JADX INFO: loaded from: classes10.dex */
public class BleDeviceInfo {
    public String devSN;
    public String did;
    public String fwVersion;
    public String hardwareVersion;
    public String latitude;
    public String longitude;
    public String mcuVersion;

    public BleDeviceInfo(String str, String str2) {
        this.did = str;
        this.fwVersion = str2;
    }

    public BleDeviceInfo(String str, String str2, String str3, String str4) {
        this.did = str;
        this.fwVersion = str2;
        this.mcuVersion = str3;
        this.devSN = str4;
    }

    public BleDeviceInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.did = str;
        this.mcuVersion = str2;
        this.devSN = str3;
        this.hardwareVersion = str4;
        this.latitude = str5;
        this.longitude = str6;
    }
}
