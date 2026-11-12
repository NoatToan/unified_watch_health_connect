package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ckj extends HandshakeGeneralCommandBase {
    ckj() {
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d("DeviceExpandCapabilitySimpleCommand", "deviceInfo is null");
            return super.getDeviceCommand(deviceInfo);
        }
        cqp.a(100045, deviceInfo.getDeviceName(), "", "");
        return d(deviceInfo);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            LogUtil.e("DeviceExpandCapabilitySimpleCommand", "processReceivedData parameterCheck Failed.");
            cmhVar.e(13);
            cmhVar.d(50155);
            return cmhVar;
        }
        byte[] bArrD = cmmVar.d();
        if (!cku.d(bArrD)) {
            LogUtil.e("DeviceExpandCapabilitySimpleCommand", "processReceivedData checkResponseCode Failed.");
            cmhVar.e(13);
            cmhVar.d(50155);
            return cmhVar;
        }
        if (!b(bArrD, deviceInfo)) {
            LogUtil.e("DeviceExpandCapabilitySimpleCommand", "resolveExpandCapabilityCommand Failed.");
            cmhVar.e(13);
            cmhVar.d(50155);
            return cmhVar;
        }
        this.mNextCommand = null;
        cmhVar.e(12);
        cmhVar.d(100000);
        cqp.a(100046, deviceInfo.getDeviceName(), String.valueOf(cmhVar.e()), String.valueOf(cmhVar.b()));
        return cmhVar;
    }

    private boolean b(byte[] bArr, DeviceInfo deviceInfo) {
        String strC;
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.e("DeviceExpandCapabilitySimpleCommand", "tlvFather is null.");
            return false;
        }
        List<cqa> listB = cqbVarE.b();
        if (listB.size() <= 0) {
            LogUtil.e("DeviceExpandCapabilitySimpleCommand", "TLV info is incorrect.");
            return false;
        }
        for (cqa cqaVar : listB) {
            if (((byte) cpb.a(cqaVar.b())) != 1) {
                LogUtil.b("DeviceExpandCapabilitySimpleCommand", "resolveExpandCapability default");
            } else {
                strC = cqaVar.c();
                cnk.c().e(deviceInfo, strC);
                return true;
            }
        }
        strC = "";
        cnk.c().e(deviceInfo, strC);
        return true;
    }

    cmg d(DeviceInfo deviceInfo) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put((byte) 1).put((byte) 55).put((byte) 1).put((byte) 0);
        cmg deviceCommand = super.getDeviceCommand(deviceInfo);
        deviceCommand.a(byteBufferAllocate.array());
        deviceCommand.b(cmj.e.toString());
        deviceCommand.e(cmj.j.toString());
        ReleaseLogUtil.c("DEVMGR_DeviceExpandCapabilitySimpleCommand", cku.d("0137"));
        return deviceCommand;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0137";
    }
}
