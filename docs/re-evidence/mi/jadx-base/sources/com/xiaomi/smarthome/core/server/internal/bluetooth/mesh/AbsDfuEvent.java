package com.xiaomi.smarthome.core.server.internal.bluetooth.mesh;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbsDfuEvent {
    public static final int EVENT_COMMAND_COMPLETE = 1;
    public static final int EVENT_TRANSFER_COMPLETE = 2;
    public static final int STATUS_AUTHENTICATION_FAILURE = 2;
    public static final int STATUS_DEVICE_BUSY = 5;
    public static final int STATUS_DEVICE_LOW_BATTERY = 8;
    public static final int STATUS_INVALID_PARAMETERS = 3;
    public static final int STATUS_INVALID_SIGN = 6;
    public static final int STATUS_MEMORY_CAPACITY_EXCEEDED = 4;
    public static final int STATUS_RECEIVE_FIRMWARE_FRAGMENT_FAIL = 7;
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_UNKNOWN_COMMAND = 1;
    public static final int STATUS_UNSPECIFIED_ERROR = 255;
    private int mEvent;
    protected byte[] mParams;

    public AbsDfuEvent(byte[] bArr) {
        int iMin;
        this.mParams = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.mEvent = bArr[0];
        if (bArr.length <= 1 || (iMin = Math.min((int) bArr[1], bArr.length - 2)) <= 0) {
            return;
        }
        byte[] bArr2 = new byte[iMin];
        this.mParams = bArr2;
        System.arraycopy(bArr, 2, bArr2, 0, iMin);
    }

    public int getEvent() {
        return this.mEvent;
    }

    public abstract int getStatus();
}
