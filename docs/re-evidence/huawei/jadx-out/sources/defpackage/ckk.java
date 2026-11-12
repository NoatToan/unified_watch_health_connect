package defpackage;

import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class ckk extends ckj {
    ckk() {
    }

    @Override // defpackage.ckj, com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        return d(deviceInfo);
    }

    @Override // defpackage.ckj, com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVarProcessReceivedData = super.processReceivedData(deviceInfo, cmmVar);
        if (cmhVarProcessReceivedData.b() == 12) {
            DeviceCapability deviceCapabilityD = cnk.c().d(deviceInfo.getDeviceMac());
            if (deviceCapabilityD == null) {
                LogUtil.e("DeviceExpandCapabilityCommand", "processReceivedData deviceCapability is null.");
                cmhVarProcessReceivedData.e(13);
                cmhVarProcessReceivedData.d(50155);
                return cmhVarProcessReceivedData;
            }
            ExternalDeviceCapability externalDeviceCapabilityB = cnk.c().b(deviceInfo.getDeviceMac());
            cms cmsVarC = c(deviceCapabilityD, externalDeviceCapabilityB, deviceInfo.getDeviceMac());
            if (!cmsVarC.c()) {
                LogUtil.e("DeviceExpandCapabilityCommand", "judgeDualChannelCapability Failed");
                cmhVarProcessReceivedData.e(13);
                cmhVarProcessReceivedData.d(50155);
                return cmhVarProcessReceivedData;
            }
            this.mNextCommand = cmsVarC.e();
            if (this.mNextCommand == null) {
                cmhVarProcessReceivedData.e(53);
                cmhVarProcessReceivedData.d(100000);
                return cmhVarProcessReceivedData;
            }
            cmhVarProcessReceivedData.e(12);
            cmhVarProcessReceivedData.d(100000);
            DeviceCapability compatibleCapacity = externalDeviceCapabilityB.getCompatibleCapacity();
            LogUtil.b("DeviceExpandCapabilityCommand", "processReceivedData isSupportAccountSwitch: ", Boolean.valueOf(compatibleCapacity.isSupportAccountSwitch()));
            if (!compatibleCapacity.isSupportAccountSwitch()) {
                cnk.c().c(deviceInfo.getDeviceMac(), externalDeviceCapabilityB);
            }
        }
        return cmhVarProcessReceivedData;
    }

    public static cms c(DeviceCapability deviceCapability, ExternalDeviceCapability externalDeviceCapability, String str) {
        if (deviceCapability == null) {
            LogUtil.e("DeviceExpandCapabilityCommand", "compatibleDeviceCapability is null");
            return new cms(false);
        }
        if (externalDeviceCapability == null) {
            LogUtil.e("DeviceExpandCapabilityCommand", "externalDeviceCapability is null");
            return new cms(false);
        }
        com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo = new com.huawei.health.devicemgr.business.entity.DeviceInfo();
        deviceInfo.setDeviceIdentify(str);
        deviceInfo.setExpandCapability(externalDeviceCapability.getCapacity());
        boolean zC = cqd.c(deviceInfo, 56);
        boolean zC2 = cqd.c(deviceInfo, 142);
        if (zC) {
            LogUtil.e("DeviceExpandCapabilityCommand", "deviceInfo support dual socket.");
            ckl.f1683b.put(str, true);
            if (zC2) {
                LogUtil.b("DeviceExpandCapabilityCommand", "deviceInfo support extend socket deviceIdentify: ", cpl.e(str));
                ckl.j.put(str, true);
            }
            return new cms(true, new ckl());
        }
        return ckl.b(deviceCapability);
    }
}
