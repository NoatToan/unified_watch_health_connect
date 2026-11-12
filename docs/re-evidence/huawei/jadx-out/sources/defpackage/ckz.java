package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ckz extends HandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1696c = false;

    public ckz(boolean z) {
        this.f1695b = z;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        return d(deviceInfo);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (a(deviceInfo, cmmVar)) {
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        cmhVar.e(13);
        cmhVar.d(50105);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0105";
    }

    private cmg d(DeviceInfo deviceInfo) throws Throwable {
        byte[] bArrC;
        cml cmlVarC = cnk.c().c(deviceInfo.getDeviceMac());
        cmg deviceCommand = super.getDeviceCommand(deviceInfo);
        if (cmlVarC == null) {
            ReleaseLogUtil.c("DEVMGR_SetDeviceDateAndTimeCommand", "constructSetDateCommandMessage parameter is null");
            return deviceCommand;
        }
        if (cmlVarC.f() == 1) {
            bArrC = cku.b();
        } else {
            bArrC = cku.c();
        }
        if (bArrC == null) {
            ReleaseLogUtil.c("DEVMGR_SetDeviceDateAndTimeCommand", "get timeInfo is null");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrC.length + 2);
            byteBufferAllocate.put((byte) 1).put((byte) 5).put(bArrC);
            deviceCommand.a(byteBufferAllocate.array());
        }
        ReleaseLogUtil.c("DEVMGR_SetDeviceDateAndTimeCommand", cku.d("0105"));
        return deviceCommand;
    }

    private boolean a(DeviceInfo deviceInfo, cmm cmmVar) {
        if (!cku.d(deviceInfo, cmmVar)) {
            LogUtil.b("SetDeviceDateAndTimeCommand", "ParameterCheck Failed");
            return false;
        }
        byte[] bArrD = cmmVar.d();
        if (!cku.d(bArrD)) {
            LogUtil.b("SetDeviceDateAndTimeCommand", "SetDeviceDateAndTime checkResponseCode Failed.");
            return false;
        }
        LogUtil.b("SetDeviceDateAndTimeCommand", "SetDeviceDateAndTime checkResponseCode Success.");
        if (!c(bArrD)) {
            LogUtil.b("SetDeviceDateAndTimeCommand", "parseSetDateAndTimeDataResult Failed");
            return false;
        }
        if (this.f1696c) {
            LogUtil.b("SetDeviceDateAndTimeCommand", "parseSetDateAndTimeDataResult Resend Cmd");
            this.mNextCommand = new ckz(true);
            return true;
        }
        this.mNextCommand = new ckn();
        return true;
    }

    private boolean c(byte[] bArr) {
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.e("SetDeviceDateAndTimeCommand", "parseSetDateAndTimeDataResult tlvFather is null");
            return false;
        }
        e(cqbVarE);
        return true;
    }

    private void e(cqb cqbVar) {
        LogUtil.b("SetDeviceDateAndTimeCommand", "parseTimeData");
        for (cqa cqaVar : cqbVar.b()) {
            if (cpb.a(cqaVar.b()) == 1) {
                int iA = cpb.a(cqaVar.c());
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                int iAbs = Math.abs(iCurrentTimeMillis - iA);
                LogUtil.b("SetDeviceDateAndTimeCommand", "parseTimeData currentTime:", Integer.valueOf(iCurrentTimeMillis), ",replyTime:", Integer.valueOf(iA), "parseTimeData offset:", Integer.valueOf(iAbs));
                if (iAbs >= 1 && !this.f1695b) {
                    LogUtil.b("SetDeviceDateAndTimeCommand", "parseTimeData offset: set isNeedResendCmd true");
                    this.f1696c = true;
                }
            }
        }
    }
}
