package com.xiaomi.hm.health.bt.sdk.data;

/* JADX INFO: loaded from: classes11.dex */
public enum GpsState {
    GPS_STATE_LOCATE_ED(1),
    GPS_STATE_LOCATE_ING(2),
    GPS_STATE_NO_PERMISSION(3),
    GPS_STATE_GPS_SERVICE_CLOSED(4);

    private int value;

    GpsState(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
