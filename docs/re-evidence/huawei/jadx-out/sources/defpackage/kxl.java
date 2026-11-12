package defpackage;

import android.database.Cursor;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiThirdIdentity;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;

/* JADX INFO: loaded from: classes10.dex */
public class kxl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kux f39588c;

    private kxl() {
        this.f39588c = kux.b();
    }

    static class b {
        private static final kxl d = new kxl();
    }

    public static kxl a() {
        return b.d;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    public boolean c(HiThirdIdentity hiThirdIdentity) throws Throwable {
        boolean zB;
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    boolean zB2 = b(hiThirdIdentity);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return zB2;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.b("HiH_ThirdIdentiyManager", "insertOrUpdateThirdIdentity: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return false;
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

    private boolean b(HiThirdIdentity hiThirdIdentity) {
        long jD;
        LogUtil.d("Debug_ThirdIdentiyManager", "insertOrUpdateThirdIdentitySync");
        if (b(hiThirdIdentity.getPackageName())) {
            LogUtil.d("Debug_ThirdIdentiyManager", "insertAccountInfo update thirdIdentiy");
            jD = e(hiThirdIdentity);
        } else {
            LogUtil.d("Debug_ThirdIdentiyManager", "insertAccountInfo insert new thirdIdentiy");
            jD = d(hiThirdIdentity);
        }
        return kwb.b(jD);
    }

    private boolean b(String str) {
        LogUtil.d("Debug_ThirdIdentiyManager", "queryThirdIdentityExist");
        if (HiCommonUtil.a(str)) {
            LogUtil.j("Debug_ThirdIdentiyManager", "queryThirdIdentityExist parameter is wrong");
            return false;
        }
        return kwf.m(a(str));
    }

    public long d(HiThirdIdentity hiThirdIdentity) {
        LogUtil.d("Debug_ThirdIdentiyManager", "insertThirdIdentiyData()");
        return this.f39588c.insert(kvw.a(hiThirdIdentity, true));
    }

    private Cursor a(String str) {
        if (HiCommonUtil.a(str)) {
            return null;
        }
        return this.f39588c.query(d(), d(str), null, null, null);
    }

    public int e(HiThirdIdentity hiThirdIdentity) {
        return this.f39588c.update(kvw.a(hiThirdIdentity, false), d(), d(hiThirdIdentity.getPackageName()));
    }

    private String d() {
        return "package_name =? ";
    }

    private String[] d(String str) {
        return new String[]{str};
    }
}
