package com.xiaomi.hm.health.devicelib;

/* JADX INFO: loaded from: classes21.dex */
public class HeartRateStatus {
    public static final int HR_DETECT_OFF = 7;
    public static final int STATUS_BATTERY_LOW = 3;
    public static final int STATUS_BLE_OFF = 6;
    public static final int STATUS_EMPTY_DATA = 4;
    public static final int STATUS_HINT = 0;
    public static final int STATUS_NORMAL_SHOW = 1;
    public static final int STATUS_NOT_CONNECT = 2;
    public static final int STATUS_NO_BIND = 5;

    public static class State {
        public static final int STATE_DISCONNECTED = 2;
        public static final int STATE_LOW_BATTERY = 3;
        public static final int STATE_SUCCESS = 1;
        public static final int STATE_TIMEOUT = 4;
    }

    public static boolean isDisconnected(int i) {
        return i == 2;
    }

    public static boolean isLowBattery(int i) {
        return i == 3;
    }

    public static boolean isSuccess(int i) {
        return i == 1;
    }

    public static boolean isTimeout(int i) {
        return i == 4;
    }
}
