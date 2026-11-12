package com.huawei.devicesdk.connect.handshake;

import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SendMode;
import defpackage.cmg;
import defpackage.cmh;
import defpackage.cmm;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HandshakeGeneralCommandBase extends HandshakeCommandBase {
    private static final int MAX_RESEND_NUM = 3;
    private static final String TAG = "HandshakeInoperableBase";

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        cmg cmgVar = new cmg();
        if (deviceInfo == null) {
            LogUtil.d(TAG, "device info is empty when getDeviceCommand");
            return cmgVar;
        }
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmg.b bVar = new cmg.b();
        bVar.d(3);
        return bVar.a(cmgVar);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        LogUtil.d(TAG, "subclass 's method should be called");
        cmh cmhVar = new cmh();
        cmhVar.e(13);
        return cmhVar;
    }

    public cmg getUnencryptedDeviceCommand(DeviceInfo deviceInfo) {
        cmg cmgVar = new cmg();
        if (deviceInfo == null) {
            LogUtil.d(TAG, "device info is empty when buildCommandMessage");
            return cmgVar;
        }
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmg.b bVar = new cmg.b();
        bVar.d(3);
        bVar.b(false);
        return bVar.a(cmgVar);
    }
}
