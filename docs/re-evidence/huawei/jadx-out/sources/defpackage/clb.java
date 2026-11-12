package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class clb extends HandshakeGeneralCommandBase {
    private String d;
    private String e;

    public clb(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        String str;
        if (this.e != null && (str = this.d) != null && deviceInfo != null) {
            byte[] bArrD = cph.d(str);
            byte[] bArrE = cph.e(bArrD.length);
            int length = bArrD.length + 1 + bArrE.length;
            byte[] bArr = new byte[length];
            bArr[0] = 1;
            System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
            System.arraycopy(bArrD, 0, bArr, bArrE.length + 1, bArrD.length);
            byte[] bArrD2 = cph.d(this.e);
            byte[] bArrE2 = cph.e(bArrD2.length);
            int length2 = bArrD2.length + 1 + bArrE2.length;
            byte[] bArr2 = new byte[length2];
            bArr2[0] = 2;
            System.arraycopy(bArrE2, 0, bArr2, 1, bArrE2.length);
            System.arraycopy(bArrD2, 0, bArr2, bArrE2.length + 1, bArrD2.length);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 2 + length2);
            byteBufferAllocate.put((byte) 1).put((byte) 45).put(bArr).put(bArr2);
            cmg unencryptedDeviceCommand = getUnencryptedDeviceCommand(deviceInfo);
            unencryptedDeviceCommand.a(byteBufferAllocate.array());
            cpv.c(deviceInfo.getDeviceMac(), "updateKey");
            LogUtil.b("UpdateDeviceKeyCommand", "getDeviceCommand_UpdateKeySuccessLabel:", cpv.c(deviceInfo.getDeviceMac()));
            ReleaseLogUtil.c("DEVMGR_UpdateDeviceKeyCommand", cku.d("012D"));
            return unencryptedDeviceCommand;
        }
        LogUtil.d("UpdateDeviceKeyCommand", "getDeviceCommand error");
        return super.getDeviceCommand(deviceInfo);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            LogUtil.d("UpdateDeviceKeyCommand", "processReceivedData error. parameters Check fail");
            cmhVar.e(13);
            cmhVar.d(50145);
            return cmhVar;
        }
        if (cni.b(deviceInfo.getDeviceMac())) {
            int iB = b(cmmVar.d());
            String deviceMac = deviceInfo.getDeviceMac();
            if (iB == 100000) {
                cpv.e(deviceMac, 1, cqo.a(cni.c(cpv.a(deviceMac, 2))));
                String strE = cnh.d().e(deviceMac);
                if (!TextUtils.isEmpty(strE)) {
                    cnh.d().b(deviceMac, strE);
                    cpv.e(deviceMac, 2, cqo.a(strE));
                }
                cpv.c(deviceInfo.getDeviceMac(), "");
                LogUtil.b("UpdateDeviceKeyCommand", "processReceivedData_UpdateKeySuccessLabel: ", cpv.c(deviceInfo.getDeviceMac()));
                this.mNextCommand = new ckq(false);
                cmhVar.e(12);
                cmhVar.d(100000);
                return cmhVar;
            }
            cpv.e(deviceMac, 2, "");
            LogUtil.d("UpdateDeviceKeyCommand", "processReceivedData error, updateStatus: ", Integer.valueOf(iB));
            cmhVar.e(13);
            cmhVar.d(50145);
            return cmhVar;
        }
        LogUtil.d("UpdateDeviceKeyCommand", "processReceivedData error, HiChainLite not init");
        cmhVar.e(13);
        cmhVar.d(50145);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "012D";
    }

    private int b(byte[] bArr) {
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.d("UpdateDeviceKeyCommand", "process data error, tlvFather is null");
            return -1;
        }
        List<cqa> listB = cqbVarE.b();
        if (listB == null) {
            LogUtil.d("UpdateDeviceKeyCommand", "resolveWearDeviceKey is not correct");
            return -1;
        }
        for (cqa cqaVar : listB) {
            if (cpb.a(cqaVar.b()) == 127) {
                return cpb.a(cqaVar.c());
            }
        }
        return -1;
    }
}
