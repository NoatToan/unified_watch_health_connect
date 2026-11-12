package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public class ckw extends HandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1691b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1692c;

    ckw(boolean z) {
        this.f1692c = z;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        return b(deviceInfo);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            LogUtil.e("SetDeviceTimeZoneIdCommand", "processReceivedData parameterCheck Failed.");
            cmhVar.e(13);
            cmhVar.d(50150);
            return cmhVar;
        }
        byte[] bArrD = cmmVar.d();
        if (!cku.d(bArrD)) {
            LogUtil.e("SetDeviceTimeZoneIdCommand", "processReceivedData checkResponseCode Failed.");
            cmhVar.e(13);
            cmhVar.d(50150);
            return cmhVar;
        }
        if (!a(bArrD)) {
            LogUtil.d("SetDeviceTimeZoneIdCommand", "processReceivedData parse timezone result error.");
            cmhVar.e(13);
            cmhVar.d(50150);
            return cmhVar;
        }
        if (this.f1691b) {
            LogUtil.b("SetDeviceTimeZoneIdCommand", "processReceivedData Resend Cmd");
            this.mNextCommand = new ckw(true);
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        if (e(cmhVar, deviceInfo)) {
            return cmhVar;
        }
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }

    private boolean e(cmh cmhVar, DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityD = cnk.c().d(deviceInfo.getDeviceMac());
        if (deviceCapabilityD == null) {
            LogUtil.e("SetDeviceTimeZoneIdCommand", "processReceivedData deviceCapability is null.");
            cmhVar.e(13);
            cmhVar.d(50150);
            return true;
        }
        cms cmsVarC = c(deviceCapabilityD);
        if (!cmsVarC.c()) {
            LogUtil.e("SetDeviceTimeZoneIdCommand", "judgeSupportActivityTypeCapability Failed");
            cmhVar.e(13);
            cmhVar.d(50150);
            return true;
        }
        this.mNextCommand = cmsVarC.e();
        if (this.mNextCommand != null) {
            return false;
        }
        cmhVar.e(53);
        cmhVar.d(100000);
        return true;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0132";
    }

    private boolean a(byte[] bArr) {
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.e("SetDeviceTimeZoneIdCommand", "parseSetDeviceTimeZoneResult tlvFather is null");
            return false;
        }
        d(cqbVarE);
        return true;
    }

    private void d(cqb cqbVar) {
        LogUtil.b("SetDeviceTimeZoneIdCommand", "checkTimeOffset");
        for (cqa cqaVar : cqbVar.b()) {
            if (cpb.a(cqaVar.b()) == 1) {
                int iA = cpb.a(cqaVar.c());
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                int iAbs = Math.abs(iCurrentTimeMillis - iA);
                LogUtil.b("SetDeviceTimeZoneIdCommand", "checkTimeOffset currentTime:", Integer.valueOf(iCurrentTimeMillis), ", replyTime:", Integer.valueOf(iA), "checkTimeOffset offset:", Integer.valueOf(iAbs));
                if (iAbs < 1 || this.f1692c) {
                    return;
                }
                LogUtil.b("SetDeviceTimeZoneIdCommand", "checkTimeOffset offset: set isNeedResendCmd true");
                this.f1691b = true;
                return;
            }
        }
    }

    private cmg b(DeviceInfo deviceInfo) {
        byte[] bArrC = cku.c();
        String id = TimeZone.getDefault().getID();
        int length = cph.d(cph.b(id)).length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrC.length + 4 + length);
        byteBufferAllocate.put((byte) 1).put((byte) 50).put(bArrC).put((byte) 3).put((byte) length).put(cph.d(cph.b(id)));
        cmg deviceCommand = super.getDeviceCommand(deviceInfo);
        deviceCommand.a(byteBufferAllocate.array());
        ReleaseLogUtil.c("DEVMGR_SetDeviceTimeZoneIdCommand", cku.d("0132"));
        return deviceCommand;
    }

    public static cms c(DeviceCapability deviceCapability) {
        if (deviceCapability == null) {
            LogUtil.e("SetDeviceTimeZoneIdCommand", "deviceCapability is null");
            return new cms(false);
        }
        if (deviceCapability.isSupportActivityType()) {
            return new cms(true, new cko());
        }
        return cko.a(deviceCapability);
    }
}
