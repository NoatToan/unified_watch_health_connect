package defpackage;

import com.google.common.base.Ascii;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ckr extends ckt {
    public ckr(cml cmlVar) {
        super(cmlVar);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put((byte) 1).put(Ascii.SYN);
        byteBufferAllocate.put((byte) 1).put((byte) 0);
        cmg unencryptedDeviceCommand = getUnencryptedDeviceCommand(deviceInfo);
        unencryptedDeviceCommand.a(byteBufferAllocate.array());
        ReleaseLogUtil.c("DEVMGR_QueryAvailableCommand", cku.d("0116"));
        return unencryptedDeviceCommand;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (this.f1688b == null) {
            LogUtil.d("QueryAvailableCommand", "mDeviceLinkParameter is null");
            cmhVar.e(13);
            cmhVar.d(50122);
            return cmhVar;
        }
        if (deviceInfo == null || cmmVar == null || cmmVar.d() == null) {
            LogUtil.d("QueryAvailableCommand", "input param is invalid.");
            cmhVar.e(13);
            cmhVar.d(50122);
            return cmhVar;
        }
        if (!cku.d(cmmVar.d())) {
            LogUtil.b("QueryAvailableCommand", "processReceivedData error. receive error code: 100000");
            cmhVar.e(13);
            cmhVar.d(50122);
            return cmhVar;
        }
        LogUtil.b("QueryAvailableCommand", "Get QueryAvailable checkResponseCode Success.");
        int iC = c(cmmVar.d(), deviceInfo);
        if (iC == -1 || iC == 0 || iC == 1) {
            cke ckeVar = new cke(this.f1688b);
            this.mNextCommand = ckeVar.d(this.mNextCommand, 50122);
            return ckeVar.b();
        }
        if (iC == 2) {
            cmhVar.e(13);
            cmhVar.d(50122);
            return cmhVar;
        }
        if (iC == 3) {
            this.mNextCommand = new ckh(this.f1688b);
            cmhVar.e(3);
            cmhVar.d(100000);
            return cmhVar;
        }
        LogUtil.b("QueryAvailableCommand", "can not deal with status.", Integer.valueOf(iC));
        cmhVar.e(13);
        cmhVar.d(50122);
        return cmhVar;
    }

    private int c(byte[] bArr, DeviceInfo deviceInfo) {
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.e("QueryAvailableCommand", "tlvFather is null");
            return -1;
        }
        for (cqa cqaVar : cqbVarE.b()) {
            int iA = cpb.a(cqaVar.b());
            String strC = cqaVar.c();
            if (iA == 1) {
                int iA2 = cpb.a(strC);
                LogUtil.b("QueryAvailableCommand", "check_available_status: ", Integer.valueOf(iA2), cpl.a(deviceInfo));
                return iA2;
            }
        }
        LogUtil.b("QueryAvailableCommand", "not find check_available_status command type.");
        return -1;
    }
}
