package defpackage;

import android.content.Context;
import com.huawei.hihealthservice.hihealthkit.hmsauth.HmsCpAuthUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ldd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f39940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f39941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f39942c = "HMSAuth_HmsAuthUtil";
    private static Context d;
    private static final Object e;
    private HmsCpAuthUtil f;
    private ldi h;

    static {
        String str = "HiH_" + f39942c;
        f39941b = str;
        f39940a = "R_" + str;
        e = new Object();
    }

    private ldd(String str) {
        if ("JS".equals(str)) {
            this.h = new ldi();
        }
        if ("CP".equals(str)) {
            this.f = new HmsCpAuthUtil(d);
        }
    }

    public static ldd e(Context context) {
        ldd lddVar;
        synchronized (e) {
            if (context != null) {
                d = context.getApplicationContext();
                lddVar = b.f39943b;
            } else {
                lddVar = b.f39943b;
            }
            throw th;
        }
        return lddVar;
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ldd f39943b = new ldd("JS");
    }

    public int c(String str, String str2, int i, boolean z) {
        ldi ldiVar = this.h;
        if (ldiVar == null) {
            ReleaseLogUtil.a(f39940a, "HMSJsAuthUtil hasn't been instanced");
            return 4;
        }
        int iA = ldiVar.a(str, str2, i, z, d);
        ReleaseLogUtil.d(f39940a, "jsAuth result is " + iA);
        return iA;
    }

    public static ldd b(Context context) {
        ldd lddVar;
        synchronized (e) {
            if (context != null) {
                d = context.getApplicationContext();
                lddVar = c.f39944c;
            } else {
                lddVar = c.f39944c;
            }
            throw th;
        }
        return lddVar;
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ldd f39944c = new ldd("CP");
    }

    public int e(int i, String str, boolean z) {
        HmsCpAuthUtil hmsCpAuthUtil = this.f;
        if (hmsCpAuthUtil == null) {
            ReleaseLogUtil.a(f39940a, "HmsCpAuthUtil hasn't been instanced");
            return 4;
        }
        int iE = hmsCpAuthUtil.e(i, str, z);
        ReleaseLogUtil.d(f39940a, "cpAuth result is " + iE);
        return iE;
    }

    public int e(String str, int i, boolean z) {
        return this.f.a(str, i, z);
    }
}
