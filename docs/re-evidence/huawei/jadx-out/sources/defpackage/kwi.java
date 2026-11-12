package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kun f39553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39554b;

    private kwi() {
        this.f39554b = 0;
        this.f39553a = kun.b();
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kwi f39555c = new kwi();
    }

    public static kwi b() {
        return b.f39555c;
    }

    public long d(HiAppInfo hiAppInfo, int i) {
        LogUtil.d("Debug_AppInfoManager", "insertAppInfoData()");
        return this.f39553a.insert(kvw.d(hiAppInfo, i));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    public long e(HiAppInfo hiAppInfo, int i) throws Throwable {
        boolean zB;
        long jD;
        if (hiAppInfo == null) {
            return 0L;
        }
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    int iB = b(hiAppInfo.getPackageName());
                    if (iB > 0) {
                        jD = iB;
                        if (zB) {
                            ljq.c(BaseApplication.b(), 0);
                        }
                    } else {
                        jD = d(hiAppInfo, i);
                        if (zB) {
                            ljq.g(BaseApplication.b(), 0);
                        }
                        if (zB) {
                            ljq.c(BaseApplication.b(), 0);
                        }
                    }
                    return jD;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("HiH_AppInfoManager", "insertAppInfoDataIfNoExist: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return 0L;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    public HiAppInfo d(String str) {
        if (HiCommonUtil.a(str)) {
            LogUtil.j("Debug_AppInfoManager", "queryAppInfoData packageName is null or empty");
            return null;
        }
        return kwf.d(this.f39553a.query(h(), c(str), null, null, null));
    }

    public HiAppInfo c(int i) {
        return kwf.d(this.f39553a.query("_id =? ", new String[]{Integer.toString(i)}, null, null, null));
    }

    public List<HiAppInfo> c() {
        return kwf.a(this.f39553a.query(null, null, null, null, null));
    }

    public int d(HiAppInfo hiAppInfo) {
        return this.f39553a.update(kvw.d(hiAppInfo, 0), h(), c(hiAppInfo.getPackageName()));
    }

    public int b(String str) {
        if (HuaweiHealth.c().equals(str)) {
            if (this.f39554b <= 0) {
                this.f39554b = e(str);
            }
            return this.f39554b;
        }
        return e(str);
    }

    private int e(String str) {
        LogUtil.d("Debug_AppInfoManager", "getAppIdFromDb() packageName is ", str, " current is ", BaseApplication.d());
        if (HiCommonUtil.a(str)) {
            LogUtil.j("Debug_AppInfoManager", "getAppIdFromDb() packageName is null or empty!");
            return 0;
        }
        return kwf.f(this.f39553a.query(h(), c(str), null, null, null), "_id");
    }

    public List<Integer> d() {
        return kwf.i(this.f39553a.query(e(), a(), null, null, null), "_id");
    }

    private String e() {
        return "package_name !=? and package_name !=? and package_name !=? and package_name !=? and package_name !=? and package_name !=? and package_name !=? and package_name !=? and package_name !=? ";
    }

    private String[] a() {
        return new String[]{"com.huawei.health", "com.huawei.bone", "com.huawei.health.ecg.collection", "com.huawei.ah100", "com.huawei.health.device", com.huawei.hwcommonmodel.application.BaseApplication.APP_PACKAGE_GOOGLE_HEALTH, "com.huawei.ohos.health.device", "hw.health.ecganalysis", "com.huawei.health.h5.sleep-apnea"};
    }

    private String h() {
        return "package_name =? ";
    }

    private String[] c(String str) {
        return new String[]{str};
    }
}
