package defpackage;

import android.content.Context;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mes f41526a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f41527b = BaseApplication.getContext();

    private mes() {
    }

    public static mes b() {
        mes mesVar;
        synchronized (d) {
            if (f41526a == null) {
                f41526a = new mes();
            }
            mesVar = f41526a;
        }
        return mesVar;
    }

    public void e(DeviceInfo deviceInfo) {
        LogUtil.a("DeviceNotifySettingManager", " getDefaultSwitch");
        if (b(deviceInfo)) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(1);
            deviceCommand.setCommandID(33);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.put((byte) 0);
            ReleaseLogUtil.d("DEVMGR_DeviceNotifySettingManager", "getDefaultSwitch send command");
            a(deviceCommand, byteBufferAllocate, 33, (IBaseResponseCallback) null, false);
        }
        SharedPreferenceManager.e(this.f41527b, String.valueOf(PrebakedEffectId.RT_COIN_DROP), "new_run_course", "1", new StorageParams(0));
    }

    private boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("DeviceNotifySettingManager", "isSupportDefaultSwitch deviceInfo is null");
            return false;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceInfo.getDeviceIdentify(), "DeviceNotifySettingManager");
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.j("DeviceNotifySettingManager", "isSupportDefaultSwitch deviceCapabilityhMap is null or empty");
            return false;
        }
        DeviceCapability deviceCapability = mapD.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability != null && deviceCapability.isSupportDefaultSwitch()) {
            return true;
        }
        LogUtil.j("DeviceNotifySettingManager", "isSupportDefaultSwitch device not support default switch");
        return false;
    }

    public void e(mfj mfjVar, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceNotifySettingManager", "Enter sendFAQMessageToDevice !");
        if (mfjVar == null) {
            LogUtil.e("DeviceNotifySettingManager", "faqMessageInfo is null");
        } else {
            a(mfjVar, iBaseResponseCallback);
        }
    }

    private void a(mfj mfjVar, IBaseResponseCallback iBaseResponseCallback) {
        String strE;
        mfi.a(2, iBaseResponseCallback);
        String strA = mfjVar.a();
        int i = mfjVar.i();
        long jE = mfjVar.e();
        int iH = mfjVar.h();
        String strC = mfjVar.c();
        String strD = mfjVar.d();
        byte[] bArrB = mfjVar.b();
        String strA2 = eeq.a(strA);
        String strB = eeq.b(strA2.length() / 2);
        String strD2 = eeq.d(1);
        String strD3 = eeq.d(i);
        String strB2 = eeq.b(strD3.length() / 2);
        String strD4 = eeq.d(2);
        String strC2 = eeq.c(jE);
        String strB3 = eeq.b(strC2.length() / 2);
        String strD5 = eeq.d(3);
        String strD6 = eeq.d(iH);
        String strB4 = eeq.b(strD6.length() / 2);
        String strD7 = eeq.d(4);
        String strA3 = eeq.a(strC);
        String strB5 = eeq.b(strA3.length() / 2);
        String strD8 = eeq.d(5);
        String strA4 = eeq.a(strD);
        String strB6 = eeq.b(strA4.length() / 2);
        String strD9 = eeq.d(6);
        if (bArrB == null) {
            strE = "";
        } else {
            strE = eeq.e(bArrB);
        }
        String strB7 = eeq.b(strE.length() / 2);
        String strD10 = eeq.d(7);
        int length = strD2.length() / 2;
        int length2 = strB.length() / 2;
        int length3 = strA2.length() / 2;
        int length4 = strD4.length() / 2;
        int length5 = strB2.length() / 2;
        int length6 = strD3.length() / 2;
        int length7 = strD5.length() / 2;
        int length8 = strB3.length() / 2;
        int length9 = strC2.length() / 2;
        int length10 = strD7.length() / 2;
        int length11 = strB4.length() / 2;
        int length12 = strD6.length() / 2;
        int length13 = strD8.length() / 2;
        int length14 = strB5.length() / 2;
        int length15 = strA3.length() / 2;
        int length16 = strD9.length() / 2;
        int length17 = strB6.length() / 2;
        int length18 = strA4.length() / 2;
        int length19 = strD10.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + length19 + (strB7.length() / 2) + (strE.length() / 2));
        b(strA2, strB, strD2, byteBufferAllocate);
        g(strD3, strB2, strD4, byteBufferAllocate);
        a(strC2, strB3, strD5, byteBufferAllocate);
        e(strD6, strB4, strD7, byteBufferAllocate);
        c(strA3, strB5, strD8, byteBufferAllocate);
        d(strA4, strB6, strD9, byteBufferAllocate);
        a(bArrB, strE, strB7, strD10, byteBufferAllocate);
        b(byteBufferAllocate);
    }

    private void b(ByteBuffer byteBuffer) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(7);
        deviceCommand.setDataLen(byteBuffer.array().length);
        deviceCommand.setDataContent(byteBuffer.array());
        e(deviceCommand);
    }

    private void a(byte[] bArr, String str, String str2, String str3, ByteBuffer byteBuffer) {
        byteBuffer.put(eeq.c(str3));
        byteBuffer.put(eeq.c(str2));
        if (bArr != null) {
            byteBuffer.put(bArr);
        } else {
            byteBuffer.put(eeq.c(str));
        }
    }

    private void d(String str, String str2, String str3, ByteBuffer byteBuffer) {
        byteBuffer.put(eeq.c(str3));
        byteBuffer.put(eeq.c(str2));
        byteBuffer.put(eeq.c(str));
    }

    private void c(String str, String str2, String str3, ByteBuffer byteBuffer) {
        byteBuffer.put(eeq.c(str3));
        byteBuffer.put(eeq.c(str2));
        byteBuffer.put(eeq.c(str));
    }

    private void e(String str, String str2, String str3, ByteBuffer byteBuffer) {
        byteBuffer.put(eeq.c(str3));
        byteBuffer.put(eeq.c(str2));
        byteBuffer.put(eeq.c(str));
    }

    private void a(String str, String str2, String str3, ByteBuffer byteBuffer) {
        byteBuffer.put(eeq.c(str3));
        byteBuffer.put(eeq.c(str2));
        byteBuffer.put(eeq.c(str));
    }

    private void g(String str, String str2, String str3, ByteBuffer byteBuffer) {
        byteBuffer.put(eeq.c(str3));
        byteBuffer.put(eeq.c(str2));
        byteBuffer.put(eeq.c(str));
    }

    private void b(String str, String str2, String str3, ByteBuffer byteBuffer) {
        byteBuffer.put(eeq.c(str3));
        byteBuffer.put(eeq.c(str2));
        byteBuffer.put(eeq.c(str));
    }

    public void d(String str, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(25);
        String strA = eeq.a(str);
        String strB = eeq.b(strA.length() / 2);
        String strD = eeq.d(1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((strD.length() / 2) + (strB.length() / 2) + (strA.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        byteBufferAllocate.put(eeq.c(strA));
        a(deviceCommand, byteBufferAllocate, 25, iBaseResponseCallback, true);
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(24);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        a(deviceCommand, byteBufferAllocate, 24, iBaseResponseCallback, true);
    }

    private void a(DeviceCommand deviceCommand, ByteBuffer byteBuffer, int i, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        if (iBaseResponseCallback != null && z) {
            luh.a(i, iBaseResponseCallback);
        }
        deviceCommand.setDataLen(byteBuffer.array().length);
        deviceCommand.setDataContent(byteBuffer.array());
        e(deviceCommand);
    }

    private void e(DeviceCommand deviceCommand) {
        lvb.e().c(deviceCommand);
    }

    public void a(DeviceInfo deviceInfo) {
        e(deviceInfo);
    }
}
