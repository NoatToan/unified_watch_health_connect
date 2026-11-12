package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hwcloudmodel.model.userprofile.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kyk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f39623a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kyc f39624c;

    private kyk() {
        this.f39624c = new kyc();
    }

    static class c {
        private static final kyk d = new kyk();
    }

    public static kyk e(Context context) {
        if (context != null) {
            f39623a = context.getApplicationContext();
        }
        return c.d;
    }

    public kym b(int i, int i2, long j) throws lif {
        return b(i, i2, j, false);
    }

    public kym e(int i, int i2, long j, boolean z) throws lif {
        return b(i, i2, j, z);
    }

    public kym c(int i, int i2, int i3) {
        kym kymVar = new kym();
        kymVar.d(i);
        kymVar.b(i3);
        kymVar.h(0);
        kymVar.g(i2);
        kymVar.a(kwt.b().d(kymVar));
        return kymVar;
    }

    private HiAppInfo a(long j) throws lif {
        DeviceInfo deviceInfoD;
        String string = Long.toString(j);
        HiAppInfo hiAppInfoC = kxz.c(string);
        if (hiAppInfoC != null || (deviceInfoD = liq.d(f39623a, j)) == null) {
            return hiAppInfoC;
        }
        HiAppInfo hiAppInfo = new HiAppInfo();
        String packageName = deviceInfoD.getPackageName();
        String thirdAppInfo = deviceInfoD.getThirdAppInfo();
        hiAppInfo.setPackageName(packageName);
        hiAppInfo.setAppName(thirdAppInfo);
        kxz.a(string, hiAppInfo);
        return hiAppInfo;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    private kym b(int i, int i2, long j, boolean z) throws Throwable {
        boolean zB;
        if (!d(i, i2, j)) {
            LogUtil.j("Debug_SynClientCache", "syncHiHealthContext checkInput  = false");
            return null;
        }
        String strA = kyf.a(Integer.toString(i), Integer.toString(i2), Long.toString(j));
        kym kymVarB = this.f39624c.b(strA);
        if (kymVarB != null) {
            return kymVarB;
        }
        if (this.f39624c.e(strA)) {
            return null;
        }
        try {
            zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
            try {
                try {
                    kymVarB = a(i, i2, j, z, strA);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return kymVarB;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.e("Debug_SynClientCache", "getSyncContext exception: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return kymVarB;
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    private kym a(int i, int i2, long j, boolean z, String str) throws Throwable {
        int iD;
        HiAppInfo hiAppInfoA = z ? a(j) : null;
        if (hiAppInfoA != null && !TextUtils.isEmpty(hiAppInfoA.getPackageName())) {
            iD = e(hiAppInfoA.getPackageName(), hiAppInfoA.getAppName());
        } else {
            iD = d(i, j);
        }
        int i3 = iD;
        if (i3 <= 0) {
            this.f39624c.d(str);
            LogUtil.j("Debug_SynClientCache", "syncHiHealthContext appID <= 0 key =  ", str);
            return null;
        }
        int iB = b(i3, j, i2);
        if (iB <= 0) {
            this.f39624c.d(str);
            ReleaseLogUtil.e("Debug_SynClientCache", "syncHiHealthContext deviceID is ", Integer.valueOf(iB), " key ", str);
            return null;
        }
        kym kymVarD = d(i3, i2, iB, j);
        if (kymVarD.c() <= 0) {
            LogUtil.j("Debug_SynClientCache", "syncHiHealthContext clientID <= 0  key = ", str);
            return null;
        }
        this.f39624c.b(str, kymVarD);
        kyj.c().b(i2, iB);
        return kymVarD;
    }

    private int d(int i, long j) throws lif {
        int iB = kwi.b().b(ljp.d(i));
        if (iB > 0) {
            return iB;
        }
        HiAppInfo hiAppInfoA = a(j);
        if (hiAppInfoA == null) {
            return 0;
        }
        return (int) kwi.b().d(hiAppInfoA, 0);
    }

    private int e(String str, String str2) {
        int iB = kwi.b().b(str);
        if (iB > 0) {
            return iB;
        }
        HiAppInfo hiAppInfo = new HiAppInfo();
        hiAppInfo.setPackageName(str);
        if (!TextUtils.isEmpty(str2)) {
            hiAppInfo.setAppName(str2);
        } else {
            hiAppInfo.setAppName(ljp.d(str));
        }
        return (int) kwi.b().d(hiAppInfo, 0);
    }

    private int b(int i, long j, int i2) throws Throwable {
        int iE = kwt.b().e(j, i);
        if (iE <= 0 && Utils.h()) {
            HiDeviceInfo hiDeviceInfoE = liq.e(f39623a, j);
            LogUtil.d("Debug_SynClientCache", "syncOneDeviceByVersion hiDeviceInfo is", hiDeviceInfoE);
            if (hiDeviceInfoE != null) {
                hiDeviceInfoE.setSyncStatus(1);
                kwy.b(f39623a).e(hiDeviceInfoE, false);
                iE = kxi.c(f39623a, hiDeviceInfoE.getDeviceUniqueCode());
                if ("-1".equals(hiDeviceInfoE.getDeviceUniqueCode())) {
                    String str = "manual_client_key_" + kyf.a(String.valueOf(i), String.valueOf(i2), String.valueOf(iE));
                    String strB = SharedPreferenceManager.b("HiHealthService", str, "");
                    String strValueOf = String.valueOf(j);
                    if (!strB.contains(strValueOf)) {
                        SharedPreferenceManager.c("HiHealthService", str, strB + strValueOf + ",");
                    }
                }
            }
        }
        return iE;
    }

    private kym d(int i, int i2, int i3, long j) {
        kym kymVar = new kym();
        kymVar.d(i);
        kymVar.d(j);
        kymVar.b(i3);
        kymVar.h(1);
        kymVar.g(i2);
        kymVar.a(kwt.b().d(kymVar));
        return kymVar;
    }

    private boolean d(int i, int i2, long j) {
        if (i >= 0 && i2 > 0 && j > 0) {
            return true;
        }
        LogUtil.j("Debug_SynClientCache", "checkInput no such input appType is ", Integer.valueOf(i), " deviceCode is ", Long.valueOf(j));
        return false;
    }

    public void d() {
        this.f39624c.e();
        kxz.b();
    }
}
