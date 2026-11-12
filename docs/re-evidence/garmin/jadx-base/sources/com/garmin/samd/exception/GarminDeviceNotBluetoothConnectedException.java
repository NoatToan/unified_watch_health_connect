package com.garmin.samd.exception;

import androidx.room.a0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/samd/exception/GarminDeviceNotBluetoothConnectedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "deviceUnitId", "", "(J)V", "getDeviceUnitId", "()J", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GarminDeviceNotBluetoothConnectedException extends Exception {
    private final long deviceUnitId;

    public GarminDeviceNotBluetoothConnectedException(long j8) {
        super(a0.f(j8, "Garmin device ", " not bluetooth connected."));
        this.deviceUnitId = j8;
    }

    public final long getDeviceUnitId() {
        return this.deviceUnitId;
    }
}
