package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kyh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f39618c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kyi f39619b;

    private kyh() {
        this.f39619b = new kyi();
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kyh f39620c = new kyh();
    }

    public static kyh d(Context context) {
        if (context != null) {
            f39618c = context.getApplicationContext();
        }
        return b.f39620c;
    }

    public HiDeviceInfo d(int i) {
        if (i <= 0) {
            return null;
        }
        Object objD = this.f39619b.d(i);
        if (objD != null && (objD instanceof HiDeviceInfo)) {
            return (HiDeviceInfo) objD;
        }
        int iC = kwt.b().c(i);
        if (iC <= 0) {
            LogUtil.j("Debug_DeviceInfoCache", "getDeviceInfo deviceID <= 0, clientID = ", Integer.valueOf(i));
            return null;
        }
        HiDeviceInfo hiDeviceInfoB = kwy.b(f39618c).b(iC);
        if (hiDeviceInfoB == null) {
            LogUtil.j("Debug_DeviceInfoCache", "getDeviceInfo deviceInfo == null, clientID = ", Integer.valueOf(i));
            return null;
        }
        hiDeviceInfoB.setPriority(kwc.b(hiDeviceInfoB.getDeviceType()).intValue());
        LogUtil.a("Debug_DeviceInfoCache", "getDeviceInfo clientID = ", Integer.valueOf(i), ", deviceInfo = ", hiDeviceInfoB);
        this.f39619b.b(i, hiDeviceInfoB);
        return hiDeviceInfoB;
    }

    public int b(int i) {
        HiDeviceInfo hiDeviceInfoD = d(i);
        if (hiDeviceInfoD != null) {
            return hiDeviceInfoD.getDeviceType();
        }
        return 0;
    }

    public String e(HiDeviceInfo hiDeviceInfo) {
        if (hiDeviceInfo != null) {
            return hiDeviceInfo.getModel();
        }
        return "";
    }

    public String a(HiDeviceInfo hiDeviceInfo) {
        if (hiDeviceInfo != null) {
            return hiDeviceInfo.getDeviceUniqueCode();
        }
        return "";
    }

    public String c(HiDeviceInfo hiDeviceInfo) {
        if (hiDeviceInfo != null) {
            return hiDeviceInfo.getProdId();
        }
        return "";
    }

    public String d(HiDeviceInfo hiDeviceInfo) {
        if (hiDeviceInfo != null) {
            return hiDeviceInfo.getSubProdId();
        }
        return "";
    }

    public String b(HiDeviceInfo hiDeviceInfo) {
        if (hiDeviceInfo != null) {
            return hiDeviceInfo.getDeviceName();
        }
        return "";
    }

    public void c() {
        this.f39619b.a();
    }
}
