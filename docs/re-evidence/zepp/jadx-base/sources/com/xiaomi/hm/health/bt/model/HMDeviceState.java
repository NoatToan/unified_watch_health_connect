package com.xiaomi.hm.health.bt.model;

import com.huami.nfc.bus.NoticesEntity;

/* JADX INFO: loaded from: classes19.dex */
public class HMDeviceState {
    public static final int DEVICE_STATE_ALIPAY_BINDING = 1280;
    public static final int DEVICE_STATE_ALIPAY_PAYMENT = 1281;
    public static final int DEVICE_STATE_COMPASS_LOCATION = 1025;
    public static final int DEVICE_STATE_COMPASS_POINT = 1024;
    public static final int DEVICE_STATE_MEASURE_PPG = 256;
    public static final int DEVICE_STATE_NONE = 0;
    public static final int DEVICE_STATE_SELFTEST = 1792;
    public static final int DEVICE_STATE_SPORT_EXERCISE = 516;
    public static final int DEVICE_STATE_SPORT_IDRUN = 513;
    public static final int DEVICE_STATE_SPORT_MIRROR = 517;
    public static final int DEVICE_STATE_SPORT_ODRUN = 512;
    public static final int DEVICE_STATE_SPORT_RIDING = 514;
    public static final int DEVICE_STATE_SPORT_WALKING = 515;
    public static final int DEVICE_STATE_TIMER_COUNTDOWN = 768;
    public static final int DEVICE_STATE_TIMER_STOPWATCH = 769;
    public static final int DEVICE_STATE_UPGRADE_AGPS = 1539;
    public static final int DEVICE_STATE_UPGRADE_FONT = 1538;
    public static final int DEVICE_STATE_UPGRADE_FW = 1536;
    public static final int DEVICE_STATE_UPGRADE_GPS = 1540;
    public static final int DEVICE_STATE_UPGRADE_RES = 1537;
    private int a;

    public HMDeviceState(int state) {
        this.a = -1;
        this.a = state;
    }

    public final int getState() {
        return this.a;
    }

    public String name() {
        int i = this.a;
        if (i == 0) {
            return NoticesEntity.LOOP_TYPE_NONE;
        }
        if (i == 256) {
            return "MEASURE_PPG";
        }
        if (i == 1792) {
            return "SELFTEST";
        }
        if (i == 768) {
            return "TIMER_COUNTDOWN";
        }
        if (i == 769) {
            return "TIMER_STOPWATCH";
        }
        if (i == 1024) {
            return "COMPASS_POINT";
        }
        if (i == 1025) {
            return "COMPASS_LOCATION";
        }
        if (i == 1280) {
            return "ALIPAY_BINDING";
        }
        if (i == 1281) {
            return "ALIPAY_PAYMENT";
        }
        switch (i) {
            case 512:
                return "SPORT_ODRUN";
            case 513:
                return "SPORT_IDRUN";
            case 514:
                return "SPORT_RIDING";
            case 515:
                return "SPORT_WALKING";
            case 516:
                return "SPORT_EXERCISE";
            case 517:
                return "SPORT_MIRROR";
            default:
                switch (i) {
                    case 1536:
                        return "UPGRADE_FW";
                    case DEVICE_STATE_UPGRADE_RES /* 1537 */:
                        return "UPGRADE_RES";
                    case DEVICE_STATE_UPGRADE_FONT /* 1538 */:
                        return "UPGRADE_FONT";
                    case DEVICE_STATE_UPGRADE_AGPS /* 1539 */:
                        return "UPGRADE_AGPS";
                    case DEVICE_STATE_UPGRADE_GPS /* 1540 */:
                        return "UPGRADE_GPS";
                    default:
                        return "UNKNOWN";
                }
        }
    }

    public void setState(int state) {
        this.a = state;
    }

    public String toString() {
        return "HMDeviceState{state=" + this.a + '}';
    }
}
