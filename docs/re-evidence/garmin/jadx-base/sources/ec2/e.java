package ec2;

import android.content.Context;
import android.content.pm.PackageInfo;
import cc2.g;
import ch.qos.logback.classic.Logger;
import com.github.mikephil.chartingv2.BuildConfig;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import wb2.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lec2/e;", "", "<init>", "()V", "connect-device-sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f63793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f63794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f63795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static il2.e f63796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static g f63797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static xb2.a f63798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static gc2.a f63799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static bc2.a f63800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f63801i;

    static {
        new e();
        int i14 = gt2.c.f79010a;
        f63793a = gt2.b.f79005a.i("SyncInitializer");
        f63794b = new byte[0];
    }

    private e() {
    }

    public static final String a() {
        String str;
        String str2 = f63801i;
        if (str2 != null && str2.length() != 0) {
            String str3 = f63801i;
            str3.getClass();
            return str3;
        }
        Context contextM = ((il2.e) b()).m();
        try {
            PackageInfo packageInfo = contextM.getPackageManager().getPackageInfo(contextM.getPackageName(), 0);
            packageInfo.getClass();
            str = packageInfo.versionName;
            if (str == null) {
                str = "";
            }
        } catch (Exception unused) {
            f63793a.error("Cannot get app version from package manager! Returning default [1.0] from getAppVersion()");
            str = BuildConfig.VERSION_NAME;
        }
        f63801i = str;
        return str;
    }

    public static final d b() {
        il2.e eVar = f63796d;
        if (eVar != null) {
            return eVar;
        }
        s.m("dataCallback");
        throw null;
    }

    public static final fc2.b c() {
        g gVar = f63797e;
        if (gVar != null) {
            return gVar;
        }
        s.m("syncServerDelegate");
        throw null;
    }

    public static final void d(il2.e eVar, g gVar, xb2.a aVar, gc2.a aVar2, bc2.a aVar3) {
        synchronized (f63794b) {
            try {
                if (f63795c) {
                    f63793a.warn("SyncInitializer was already initialized");
                } else {
                    f63796d = eVar;
                    f63798f = aVar;
                    f63799g = aVar2;
                    f63800h = aVar3;
                    l.d(eVar.m());
                    f63797e = gVar;
                    f63795c = true;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static final boolean e() {
        boolean z14;
        synchronized (f63794b) {
            z14 = f63795c;
        }
        return z14;
    }
}
