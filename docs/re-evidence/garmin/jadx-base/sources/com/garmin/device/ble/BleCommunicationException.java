package com.garmin.device.ble;

import android.text.TextUtils;
import i3.e5;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
public final class BleCommunicationException extends IOException {
    public static final int COMMUNICATION_TIMEOUT = -2147483646;
    public static final int DEVICE_DISCONNECTED = Integer.MIN_VALUE;
    public static final int UNSPECIFIED_FAILURE = -2147483647;
    private final int mGattStatus;
    private final String mMessage;

    public BleCommunicationException(String str, Throwable th3) {
        super(th3);
        int iStatusForCause = statusForCause(th3);
        this.mGattStatus = iStatusForCause;
        this.mMessage = messageForStatus(str, iStatusForCause);
    }

    private static String messageForStatus(String str, int i14) {
        String strF;
        switch (i14) {
            case Integer.MIN_VALUE:
                strF = "Device Disconnected";
                break;
            case UNSPECIFIED_FAILURE /* -2147483647 */:
                strF = "Unspecified Failure";
                break;
            case COMMUNICATION_TIMEOUT /* -2147483646 */:
                strF = "Communication Timeout";
                break;
            default:
                strF = e0.f(i14, "Gatt status [", "]");
                break;
        }
        return TextUtils.isEmpty(str) ? "Operation failed: ".concat(strF) : e5.g(str, ": ", strF);
    }

    private static int statusForCause(Throwable th3) {
        return th3 instanceof TimeoutException ? COMMUNICATION_TIMEOUT : UNSPECIFIED_FAILURE;
    }

    public int getGattStatus() {
        return this.mGattStatus;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.mMessage;
    }

    public BleCommunicationException(Throwable th3) {
        this((String) null, th3);
    }

    public BleCommunicationException(String str) {
        this(str, UNSPECIFIED_FAILURE);
    }

    public BleCommunicationException(String str, int i14) {
        this.mGattStatus = i14;
        this.mMessage = messageForStatus(str, i14);
    }

    public BleCommunicationException() {
        this((String) null, UNSPECIFIED_FAILURE);
    }
}
