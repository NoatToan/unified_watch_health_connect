package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SimpleDataHead;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class ckm extends HandshakeSimpleCommandBase {
    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d("EncryptNegotiationCommand", "get device command error. device is null");
            return constructDefaultCommandMessage();
        }
        LogUtil.b("EncryptNegotiationCommand", "get device command, device: ", cpl.a(deviceInfo.getDeviceMac()));
        cjz cjzVar = new cjz();
        byte[] bArrE = cjzVar.e(cjzVar.c(deviceInfo.getDeviceMac()), deviceInfo.getDeviceMac());
        if (bArrE.length == 0) {
            LogUtil.d("EncryptNegotiationCommand", "encrypt work key error");
            return constructDefaultCommandMessage();
        }
        cpl.d("EncryptNegotiationCommand", bArrE, "generate work key finish. workKey=");
        return constructCommandMessage("a3d330f8-b84f-4f48-a78c-f8d1e33b597a", SimpleDataHead.DC, bArrE);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!checkInputParam(deviceInfo, cmmVar)) {
            cmhVar.e(13);
            cmhVar.d(40103);
            return cmhVar;
        }
        byte[] bArrD = cmmVar.d();
        if (bArrD.length == 0) {
            LogUtil.d("EncryptNegotiationCommand", "[processReceivedData]receive data is invalid.");
            cmhVar.e(13);
            cmhVar.d(40103);
            return cmhVar;
        }
        if (bArrD[0] == 0) {
            LogUtil.b("EncryptNegotiationCommand", "encrypt negotiation success.");
            if (cnk.c().i(deviceInfo.getDeviceMac())) {
                LogUtil.b("EncryptNegotiationCommand", "start expand device capability.");
                this.mNextCommand = new ckj();
            }
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        cpl.d("EncryptNegotiationCommand", bArrD, "encrypt negotiation error. code: ");
        cmhVar.e(13);
        cmhVar.d(40103);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return String.valueOf(40103);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase
    public cmg prepare(DeviceInfo deviceInfo) {
        return constructCharacterNotification(CharacterOperationType.ENABLE, "a3d330f8-b84f-4f48-a78c-f8d1e33b597a");
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase
    public cmg end(DeviceInfo deviceInfo) {
        return constructCharacterNotification(CharacterOperationType.DISABLE, "a3d330f8-b84f-4f48-a78c-f8d1e33b597a");
    }
}
