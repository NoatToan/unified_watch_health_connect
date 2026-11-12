package com.xiaomi.smarthome.cache;

import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes4.dex */
public class BleDeviceState {
    private static final String KEY_CONNECT_STATUS = "KEY.CONNECT.STATUS";
    private static final String KEY_CURRENT_VERSION = "KEY.CURRENT.VERSION";
    private static final String KEY_IS_OTA = "KEY.IS_OTA";
    private static final String KEY_LATEST_VERSION = "KEY.LATEST.VERSION";
    private String mMac;

    public BleDeviceState(String str) {
        this.mMac = str;
    }

    public int getConnectStatus() {
        return MMKV.G(this.mMac, 2).f(KEY_CONNECT_STATUS, 0);
    }

    public String getCurrentFirmwareVersion() {
        return MMKV.G(this.mMac, 2).j(KEY_CURRENT_VERSION);
    }

    public String getLatestVersion() {
        return MMKV.G(this.mMac, 2).k(KEY_LATEST_VERSION, "");
    }

    public boolean isOTA() {
        return MMKV.G(this.mMac, 2).d(KEY_IS_OTA, false);
    }

    public void notifyConnected() {
        MMKV.G(this.mMac, 2).r(KEY_CONNECT_STATUS, 3);
    }

    public void notifyConnecting() {
        MMKV.G(this.mMac, 2).r(KEY_CONNECT_STATUS, 1);
    }

    public void notifyDisconnect() {
        MMKV.G(this.mMac, 2).r(KEY_CONNECT_STATUS, 2);
    }

    public void setCurrentFirmwareVersion(String str) {
        MMKV.G(this.mMac, 2).u(KEY_CURRENT_VERSION, str);
    }

    public void setLatestVersion(String str) {
        MMKV.G(this.mMac, 2).u(KEY_LATEST_VERSION, str);
    }

    public void setOTAStatus(boolean z) {
        MMKV.G(this.mMac, 2).w(KEY_IS_OTA, z);
    }

    public String toString() {
        return String.format("BleDeviceState{mac = %s \n,connect status = %d, \n isOTA = %s, \n currentVersion=%s,\n latestVersion=%s", this.mMac, Integer.valueOf(getConnectStatus()), Boolean.valueOf(isOTA()), getCurrentFirmwareVersion(), getLatestVersion());
    }

    public BleDeviceState() {
        this.mMac = "NONE";
    }
}
