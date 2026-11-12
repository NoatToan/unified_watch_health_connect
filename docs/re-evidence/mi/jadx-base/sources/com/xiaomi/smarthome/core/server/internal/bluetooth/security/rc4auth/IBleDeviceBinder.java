package com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth;

import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface IBleDeviceBinder {
    void bindDeviceToServer(BleDeviceBinder.BleBindResponse bleBindResponse);

    int getBindStyle();

    void readBeaconKeyFromDevice(BleReadResponse bleReadResponse);

    void readSNFromDevice(BleReadResponse bleReadResponse);

    void writeSNToDevice(byte[] bArr, BleWriteResponse bleWriteResponse);
}
