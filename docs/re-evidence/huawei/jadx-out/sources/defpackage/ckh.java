package defpackage;

import com.google.common.base.Ascii;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ckh extends ckt {
    public ckh(cml cmlVar) {
        super(cmlVar);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d("DeviceAvailableNotifyCommand", "deviceInfo is null");
            return getUnencryptedDeviceCommand(deviceInfo);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byte b2 = 1;
        byteBufferAllocate.put((byte) 1).put(Ascii.SYN);
        byteBufferAllocate.put((byte) 2).put((byte) 1);
        cmr cmrVarH = cnk.c().h(deviceInfo.getDeviceMac());
        if (cmrVarH != null && cmrVarH.a()) {
            b2 = 0;
        }
        byteBufferAllocate.put(b2);
        cmg unencryptedDeviceCommand = getUnencryptedDeviceCommand(deviceInfo);
        unencryptedDeviceCommand.a(byteBufferAllocate.array());
        cpl.d("DeviceAvailableNotifyCommand", unencryptedDeviceCommand.b(), "getDeviceCommand:");
        ReleaseLogUtil.c("DEVMGR_DeviceAvailableNotifyCommand", cku.d("0116"));
        return unencryptedDeviceCommand;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (this.f1688b == null) {
            LogUtil.d("DeviceAvailableNotifyCommand", "mDeviceLinkParameter is null");
            cmhVar.e(13);
            cmhVar.d(50122);
            return cmhVar;
        }
        if (deviceInfo == null || cmmVar == null || cmmVar.d() == null) {
            LogUtil.d("DeviceAvailableNotifyCommand", "input param is invalid.");
            cmhVar.e(13);
            cmhVar.d(50122);
            return cmhVar;
        }
        cpl.d("DeviceAvailableNotifyCommand", cmmVar.d(), "processReceivedData notify:");
        if (!cku.d(cmmVar.d())) {
            LogUtil.b("DeviceAvailableNotifyCommand", "processReceivedData error.");
            cmhVar.e(13);
            cmhVar.d(50122);
            return cmhVar;
        }
        LogUtil.b("DeviceAvailableNotifyCommand", "Get QueryAvailableNotify checkResponseCode Success.");
        this.mNextCommand = new ckv(deviceInfo);
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }
}
