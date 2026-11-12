package com.huawei.hms.findnetwork.comm.request.bean;

import com.huawei.hms.findnetwork.comm.util.MaskUtil;

/* JADX INFO: loaded from: classes33.dex */
public class DisconnectNotificationParams extends SnRequestBean {
    public static final int DEFAULT_NORMAL_ADV_DURATION = 1800;
    public static final int DEFAULT_NORMAL_INTERVAL = 800;
    private static final int DEFAULT_RING_DURATION = 0;
    public static final int DEFAULT_TURBO_NEAR_DURATION = 15;
    public static final int DEFAULT_TURBO_NEAR_INTERVAL = 16;
    public static final int DEFAULT_TURBO_SEPARATE_DURATION = 0;
    public static final int DEFAULT_TURBO_SEPARATE_INTERVAL = 0;
    private int mode;
    private int duration = 0;
    private int nearbyInterval = 800;
    private int nearbyDuration = 1800;
    private int ringDuration = 0;
    private int separateInterval = 800;
    private int separateDuration = 1800;

    public String toString() {
        return "DisconnectNotificationParams{mode=" + this.mode + ", duration=" + this.duration + ", nearbyInterval=" + this.nearbyInterval + ", nearbyDuration=" + this.nearbyDuration + ", ringDuration=" + this.ringDuration + ", separateInterval=" + this.separateInterval + ", separateDuration=" + this.separateDuration + ", connectTagSn='" + MaskUtil.maskSn(this.connectTagSn) + "'}";
    }

    public void setSeparateInterval(int i) {
        this.separateInterval = i;
    }

    public void setSeparateDuration(int i) {
        this.separateDuration = i;
    }

    public void setRingDuration(int i) {
        this.ringDuration = i;
    }

    public void setNearbyInterval(int i) {
        this.nearbyInterval = i;
    }

    public void setNearbyDuration(int i) {
        this.nearbyDuration = i;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public int getSeparateInterval() {
        return this.separateInterval;
    }

    public int getSeparateDuration() {
        return this.separateDuration;
    }

    public int getRingDuration() {
        return this.ringDuration;
    }

    public int getNearbyInterval() {
        return this.nearbyInterval;
    }

    public int getNearbyDuration() {
        return this.nearbyDuration;
    }

    public int getMode() {
        return this.mode;
    }

    public int getDuration() {
        return this.duration;
    }
}
