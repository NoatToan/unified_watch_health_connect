package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cko extends HandshakeGeneralCommandBase {
    cko() {
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        return c(deviceInfo);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            LogUtil.e("DeviceSupportActivityTypeCommand", "processReceivedData parameterCheck Failed.");
            cmhVar.e(13);
            cmhVar.d(50118);
            return cmhVar;
        }
        byte[] bArrD = cmmVar.d();
        if (!cku.d(bArrD)) {
            LogUtil.e("DeviceSupportActivityTypeCommand", "processReceivedData checkResponseCode Failed.");
            cmhVar.e(13);
            cmhVar.d(50118);
            return cmhVar;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        DeviceCapability deviceCapabilityD = cnk.c().d(deviceMac);
        if (deviceCapabilityD == null) {
            LogUtil.e("DeviceSupportActivityTypeCommand", "processReceivedData deviceCapability is null.");
            cmhVar.e(13);
            cmhVar.d(50118);
            return cmhVar;
        }
        if (!d(bArrD, deviceCapabilityD)) {
            LogUtil.e("DeviceSupportActivityTypeCommand", "resolveExpandCapabilityCommand Failed.");
            cmhVar.e(13);
            cmhVar.d(50118);
            return cmhVar;
        }
        cnk.c().b(deviceMac, deviceCapabilityD);
        cms cmsVarA = a(deviceCapabilityD);
        if (!cmsVarA.c()) {
            LogUtil.e("DeviceSupportActivityTypeCommand", "judgeSupportMessagePushCapability Failed");
            cmhVar.e(13);
            cmhVar.d(50118);
            return cmhVar;
        }
        this.mNextCommand = cmsVarA.e();
        if (this.mNextCommand == null) {
            cmhVar.e(53);
            cmhVar.d(100000);
            return cmhVar;
        }
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0112";
    }

    private cmg c(DeviceInfo deviceInfo) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put((byte) 1).put((byte) 18).put((byte) -127).put((byte) 0);
        cmg deviceCommand = super.getDeviceCommand(deviceInfo);
        deviceCommand.a(byteBufferAllocate.array());
        ReleaseLogUtil.c("DEVMGR_DeviceSupportActivityTypeCommand", cku.d("0112"));
        return deviceCommand;
    }

    private boolean d(byte[] bArr, DeviceCapability deviceCapability) {
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.e("DeviceSupportActivityTypeCommand", "tlvFather is null.");
            return false;
        }
        List<cqb> listE = cqbVarE.e();
        if (coq.d(listE)) {
            LogUtil.e("DeviceSupportActivityTypeCommand", "tlvFathers is empty.");
            return true;
        }
        Iterator<cqb> it = listE.iterator();
        while (it.hasNext()) {
            for (cqa cqaVar : it.next().b()) {
                int iA = cpb.a(cqaVar.b());
                if (iA == 2) {
                    c(cpb.a(cqaVar.c()), deviceCapability);
                } else if (iA == 3) {
                    e(cpb.a(cqaVar.c()), deviceCapability);
                }
            }
        }
        return true;
    }

    private void c(int i, DeviceCapability deviceCapability) {
        if (i == 4) {
            deviceCapability.configureWalk(true);
            return;
        }
        switch (i) {
            case 7:
                deviceCapability.configureRun(true);
                break;
            case 8:
                deviceCapability.configureClimb(true);
                break;
            case 9:
                deviceCapability.configureRiding(true);
                break;
            case 10:
                deviceCapability.configureSleep(true);
                deviceCapability.configureSleepShallow(true);
                deviceCapability.configureSleepDeep(true);
                break;
        }
    }

    private void e(int i, DeviceCapability deviceCapability) {
        if (((i >> 5) & 1) == 1) {
            deviceCapability.configureIsSupportHeartRate(true);
        } else {
            deviceCapability.configureIsSupportHeartRate(false);
        }
    }

    public static cms a(DeviceCapability deviceCapability) {
        if (deviceCapability == null) {
            LogUtil.e("DeviceSupportActivityTypeCommand", "deviceCapability is null");
            return new cms(false);
        }
        return new cms(true);
    }
}
