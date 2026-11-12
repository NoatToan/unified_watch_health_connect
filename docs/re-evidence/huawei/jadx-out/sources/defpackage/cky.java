package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SimpleDataHead;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cky extends HandshakeSimpleCommandBase {
    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d("RequestAuthenticCommand", "get device command error. device is null");
            return constructDefaultCommandMessage();
        }
        LogUtil.b("RequestAuthenticCommand", "get device command. device: ", cpl.a(deviceInfo.getDeviceMac()));
        return constructCommandMessage("02b2a08e-f8b0-4047-b1fd-f4e0efeee679", SimpleDataHead.DB, new byte[0]);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!checkInputParam(deviceInfo, cmmVar)) {
            cmhVar.e(13);
            cmhVar.d(40101);
            return cmhVar;
        }
        byte[] bArrD = cmmVar.d();
        String deviceMac = deviceInfo.getDeviceMac();
        cnk.c().e(deviceMac, d(bArrD));
        if (bArrD.length <= 1) {
            LogUtil.b("RequestAuthenticCommand", "[processReceivedData]no need to auth. device= ", cpl.a(deviceMac));
            this.mNextCommand = new ckm();
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        if (bArrD.length < 16) {
            cpl.d("RequestAuthenticCommand", bArrD, "[processReceivedData]parse randA error. randA=");
            this.mNextCommand = null;
            cmhVar.e(13);
            cmhVar.d(40101);
            return cmhVar;
        }
        if (bArrD.length > 16) {
            String strD = cph.d(new byte[]{bArrD[16]});
            LogUtil.b("RequestAuthenticCommand", "[processReceivedData] extend hex: ", strD);
            c(strD, deviceMac);
        }
        byte[] bArr = new byte[16];
        System.arraycopy(bArrD, 0, bArr, 0, 16);
        cpl.d("RequestAuthenticCommand", bArr, "[processReceivedData]need to auth. randA=");
        this.mNextCommand = new ckf(bArr);
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }

    private static void c(String str, String str2) {
        LogUtil.b("RequestAuthenticCommand", "saveExtendedBytes extend code: ", cpl.e(str2));
        String strB = cqm.b(str2);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("weightUnit");
        stringBuffer.append(strB);
        cpk.d(stringBuffer.toString(), str);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return String.valueOf(40101);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase
    public cmg prepare(DeviceInfo deviceInfo) {
        return constructCharacterNotification(CharacterOperationType.ENABLE, "02b2a08e-f8b0-4047-b1fd-f4e0efeee679");
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase
    public cmg end(DeviceInfo deviceInfo) {
        return constructCharacterNotification(CharacterOperationType.DISABLE, "02b2a08e-f8b0-4047-b1fd-f4e0efeee679");
    }

    private boolean d(byte[] bArr) {
        byte b2;
        if (bArr.length == 1) {
            b2 = bArr[0];
        } else {
            b2 = bArr.length > 16 ? bArr[16] : (byte) 0;
        }
        return (b2 & 1) == 1;
    }
}
