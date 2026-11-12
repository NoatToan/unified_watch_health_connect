package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.HEXUtils;
import health.compact.a.KeyValDbManager;

/* JADX INFO: loaded from: classes7.dex */
public class ete {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f33445a = new byte[1];
    private static volatile ete d;
    private String e;

    public static ete d() {
        if (d == null) {
            synchronized (f33445a) {
                if (d == null) {
                    d = new ete();
                }
            }
        }
        return d;
    }

    public void d(String str) {
        this.e = str;
    }

    public void c(String str, String str2, String str3) {
        int i;
        LogUtil.a("EcologyDeviceInfoUtils", "enter setDateTimeByUds");
        if (dmz.r.toString().equalsIgnoreCase(str2)) {
            i = 7;
        } else if (dmz.q.toString().equalsIgnoreCase(str2)) {
            i = 10;
        } else {
            LogUtil.j("EcologyDeviceInfoUtils", "byteSize is 0");
            i = 0;
        }
        byte[] bArrC = etn.c(i);
        cmm cmmVar = new cmm();
        cmmVar.c(str2);
        cmmVar.a(bArrC);
        b(cmmVar, str, str2, str3, CharacterOperationType.WRITE);
    }

    public void b(cmm cmmVar, String str, String str2, String str3, CharacterOperationType characterOperationType) {
        if (cmmVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.j("EcologyDeviceInfoUtils", "data is null || serviceUuid == null || characterUuid == null || mac == null");
            return;
        }
        synchronized (f33445a) {
            UniteDevice uniteDeviceD = d(str3, 2);
            if (uniteDeviceD != null) {
                emk.c().d(uniteDeviceD, emk.c().e(cmmVar, str, str2, characterOperationType));
                LogUtil.a("EcologyDeviceInfoUtils", "setDateTime : data frames:", HEXUtils.a(cmmVar.d()));
            } else {
                LogUtil.j("EcologyDeviceInfoUtils", "uniteDevice is null");
            }
        }
    }

    public UniteDevice d(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        UniteDevice uniteDevice = new UniteDevice();
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceMac(str);
        deviceInfo.setDeviceBtType(i);
        return uniteDevice.build(str, deviceInfo, new ExternalDeviceCapability());
    }

    public void a(cmm cmmVar, String str, String str2, String str3) {
        b(cmmVar, str, str2, str3, CharacterOperationType.READ);
    }

    public boolean b() {
        LogUtil.a("EcologyDeviceInfoUtils", "enter isSupportUds mHealthDeviceKind=", this.e);
        boolean z = Boolean.parseBoolean((HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE.name().equals(this.e) || HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR.name().equals(this.e) || HealthDevice.HealthDeviceKind.HDK_HEART_RATE.name().equals(this.e)) ? KeyValDbManager.d(BaseApplication.getContext()).c("use_unite_device_service_key") : "");
        LogUtil.a("EcologyDeviceInfoUtils", z ? "isSupportUds() now is new mode" : "isSupportUds() now is old mode");
        return z;
    }

    public void b(byte[] bArr, String str) {
        cmm cmmVar = new cmm();
        cmmVar.c(dmz.ak.toString());
        cmmVar.a(bArr);
        b(cmmVar, dmz.ad.toString(), dmz.ak.toString(), str, CharacterOperationType.WRITE);
    }
}
