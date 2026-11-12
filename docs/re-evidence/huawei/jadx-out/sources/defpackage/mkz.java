package defpackage;

import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.utils.StringUtils;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class mkz extends VariableHandshakeGeneralCommandBase {
    private ByteBuffer d;
    private DeviceInfo e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f41851c = new CountDownLatch(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f41849a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41850b = false;

    mkz(DeviceInfo deviceInfo) {
        this.e = deviceInfo;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public int constructCommandMessage(cmg cmgVar) {
        DeviceInfo deviceInfoJ;
        DeviceInfo deviceInfo = this.e;
        if (deviceInfo != null && deviceInfo.getIsDemoWatch() == 1) {
            c(cmgVar);
            return 50;
        }
        if (!b(10000L) && !this.f41850b) {
            LogUtil.j("StartupGuideUserSettingCommand", "oobe ui no created.");
            return 57;
        }
        this.f41850b = false;
        if (!c(600000L)) {
            LogUtil.j("StartupGuideUserSettingCommand", "user confirm timeout.");
            if (this.e == null || (deviceInfoJ = cnk.c().j(this.e.getDeviceMac())) == null || deviceInfoJ.getDeviceConnectState() != 2) {
                return 50;
            }
            LogUtil.j("StartupGuideUserSettingCommand", "user confirm timeout, device is connected return.");
            return 54;
        }
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            LogUtil.j("StartupGuideUserSettingCommand", "mCommandMessage is null.");
            return 51;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity() + 2);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 48);
        byteBufferAllocate.put(this.d);
        cmgVar.a(byteBufferAllocate.array());
        return 50;
    }

    private boolean b(long j) {
        try {
            if (this.f41851c.await(j, TimeUnit.MILLISECONDS)) {
                return true;
            }
            LogUtil.j("StartupGuideUserSettingCommand", "countDownLatch time out");
        } catch (InterruptedException unused) {
            LogUtil.e("StartupGuideUserSettingCommand", "countDownLatch exception");
        }
        return false;
    }

    private boolean c(long j) {
        try {
            if (this.f41849a.await(j, TimeUnit.MILLISECONDS)) {
                return true;
            }
            LogUtil.j("StartupGuideUserSettingCommand", "awaitUserConfirm time out");
        } catch (InterruptedException unused) {
            LogUtil.e("StartupGuideUserSettingCommand", "awaitUserConfirm exception");
        }
        return false;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public int processReceivedData(UniteDevice uniteDevice, String str) {
        if (StringUtils.g(str)) {
            LogUtil.j("StartupGuideUserSettingCommand", "hexString is null.");
            return 51;
        }
        this.mCurrentCommandTag = getCurrentCommandTag();
        if (!mla.c(this.mCurrentCommandTag, str)) {
            LogUtil.j("StartupGuideUserSettingCommand", "is not current command reply, abandon this reply command");
            return 54;
        }
        if (mla.b(str)) {
            return 52;
        }
        LogUtil.j("StartupGuideUserSettingCommand", "processReceivedData checkResponseCode Failed.");
        return 51;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public String getCurrentCommandTag() {
        return "0130";
    }

    public void b(byte[] bArr) {
        LogUtil.a("StartupGuideUserSettingCommand", "notifyUserSelect enter.");
        this.d = ByteBuffer.wrap(bArr);
        this.f41849a.countDown();
    }

    public void c() {
        LogUtil.a("StartupGuideUserSettingCommand", "oobeCreated countDown.");
        this.f41851c.countDown();
    }

    public void c(boolean z) {
        this.f41850b = z;
    }

    private void c(cmg cmgVar) {
        String strValueOf = String.valueOf(new Date().getTime());
        ByteBuffer byteBufferD = d(strValueOf, "user_license_agreement");
        ByteBuffer byteBufferD2 = d(strValueOf, "device_information_management");
        ByteBuffer byteBufferD3 = d(strValueOf, "software_update_service_statement");
        int iCapacity = byteBufferD.capacity() + byteBufferD2.capacity() + byteBufferD3.capacity();
        byte[] bArrE = cph.e(iCapacity);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrE.length + 1 + iCapacity + 2);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 48);
        byteBufferAllocate.put(mkx.e.byteValue());
        byteBufferAllocate.put(bArrE);
        byteBufferAllocate.put(byteBufferD.array());
        byteBufferAllocate.put(byteBufferD2.array());
        byteBufferAllocate.put(byteBufferD3.array());
        cmgVar.a(byteBufferAllocate.array());
    }

    private ByteBuffer d(String str, String str2) {
        int length = str2.length() + 21 + str.length();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 11);
        byteBufferAllocate.put(mkx.f41843c.byteValue()).put((byte) (length + 9)).put((byte) 3).put(cph.e(str2.length())).put(cph.e(str2)).put((byte) 4).put((byte) 1).put((byte) 1).put((byte) 5).put(cph.e(21)).put(cph.e("20230508-20230508-0-0")).put((byte) 6).put(cph.e(str.length())).put(cph.e(str));
        return byteBufferAllocate;
    }
}
