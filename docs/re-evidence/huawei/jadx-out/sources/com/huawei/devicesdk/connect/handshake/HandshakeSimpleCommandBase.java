package com.huawei.devicesdk.connect.handshake;

import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.devicesdk.entity.SimpleDataHead;
import defpackage.cmg;
import defpackage.cmh;
import defpackage.cmm;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HandshakeSimpleCommandBase extends HandshakeCommandBase {
    private static final int MAX_RETRY_TIMES = 3;
    private static final String TAG = "HandshakeWeightScaleBase";
    private String mServiceUuid = "0000181c-0000-1000-8000-00805f9b34fb";

    public cmg prepare(DeviceInfo deviceInfo) {
        return constructDefaultCommandMessage();
    }

    public cmg end(DeviceInfo deviceInfo) {
        return constructDefaultCommandMessage();
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        LogUtil.d(TAG, "subclass 's method should be called");
        cmh cmhVar = new cmh();
        cmhVar.e(13);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public HandshakeCommandBase getNextCommand() {
        return this.mNextCommand;
    }

    protected cmg constructCommandMessage(String str, SimpleDataHead simpleDataHead, byte[] bArr) {
        cmg cmgVar = new cmg();
        if (simpleDataHead == null) {
            LogUtil.d(TAG, "dataHead is null");
            return cmgVar;
        }
        cmgVar.d(SendMode.PROTOCOL_TYPE_D);
        cmgVar.b(this.mServiceUuid);
        cmgVar.e(str);
        if (bArr == null) {
            bArr = new byte[0];
        }
        cmgVar.a(bArr);
        cmg.b bVar = new cmg.b();
        bVar.a(CharacterOperationType.WRITE).b(SimpleDataHead.isEncryptedDataHead(simpleDataHead.getDataHead())).d(3).a(simpleDataHead.getDataHead());
        return bVar.a(cmgVar);
    }

    protected cmg constructCharacterNotification(CharacterOperationType characterOperationType, String str) {
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_D);
        cmgVar.b(this.mServiceUuid);
        cmgVar.e(str);
        cmgVar.a(new byte[0]);
        cmg.b bVar = new cmg.b();
        bVar.a(characterOperationType).b(false).d(3);
        return bVar.a(cmgVar);
    }

    protected cmg constructDefaultCommandMessage() {
        return new cmg();
    }

    protected boolean checkInputParam(DeviceInfo deviceInfo, cmm cmmVar) {
        if (deviceInfo != null && isDataFrameValid(cmmVar)) {
            return true;
        }
        LogUtil.d(TAG, "[processReceivedData]param is invalid.");
        return false;
    }

    private boolean isDataFrameValid(cmm cmmVar) {
        return (cmmVar == null || cmmVar.d() == null || cmmVar.b() == null) ? false : true;
    }
}
