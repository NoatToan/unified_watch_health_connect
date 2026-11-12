package com.xiaomi.hm.health.device.amazfit_watch.model;

/* JADX INFO: loaded from: classes20.dex */
public class DevicePreLaunch {
    private boolean a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public String getDeviceName() {
        return this.b;
    }

    public String getDevicePicUrl() {
        return this.c;
    }

    public String getOpenSportDevicePicUrl() {
        return this.e;
    }

    public String getSportDetailDevicePicUrl() {
        return this.d;
    }

    public String getWatchFacePicBgUrl() {
        return this.f;
    }

    public boolean isBindFlag() {
        return this.a;
    }

    public void setBindFlag(boolean z) {
        this.a = z;
    }

    public void setDeviceName(String str) {
        this.b = str;
    }

    public void setDevicePicUrl(String str) {
        this.c = str;
    }

    public void setOpenSportDevicePicUrl(String str) {
        this.e = str;
    }

    public void setSportDetailDevicePicUrl(String str) {
        this.d = str;
    }

    public void setWatchFacePicgUrl(String str) {
        this.f = str;
    }
}
