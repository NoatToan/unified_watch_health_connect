package com.huawei.devicesdk.connect.handshake;

import com.huawei.devicesdk.entity.DeviceInfo;
import defpackage.cmg;
import defpackage.cmh;
import defpackage.cmm;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HandshakeCommandBase {
    private static final String TAG = "HandshakeCommandBase";
    protected HandshakeCommandBase mNextCommand;

    public abstract cmg getDeviceCommand(DeviceInfo deviceInfo);

    public abstract String getTag();

    public abstract cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar);

    HandshakeCommandBase() {
    }

    public HandshakeCommandBase getNextCommand() {
        return this.mNextCommand;
    }
}
