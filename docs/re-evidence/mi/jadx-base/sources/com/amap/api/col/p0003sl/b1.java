package com.amap.api.col.p0003sl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import defpackage.v5t;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f5970a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f5971b = "";
    public static HashMap<String, String> c;
    public static HashMap<String, String> d;
    public static HashMap<String, String> e;
    public static b1 f;

    public interface a {
    }

    public b1() {
        x0.O();
    }

    public static int a(la laVar, long j) {
        try {
            k(laVar);
            long jElapsedRealtime = 0;
            if (j != 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            }
            int conntectionTimeout = laVar.getConntectionTimeout();
            if (laVar.getDegradeAbility() != la.a.FIX && laVar.getDegradeAbility() != la.a.SINGLE) {
                long j2 = conntectionTimeout;
                if (jElapsedRealtime < j2) {
                    long j3 = j2 - jElapsedRealtime;
                    if (j3 >= 1000) {
                        return (int) j3;
                    }
                }
                return Math.min(1000, laVar.getConntectionTimeout());
            }
            return conntectionTimeout;
        } catch (Throwable unused) {
            return 5000;
        }
    }

    public static b1 b() {
        if (f == null) {
            f = new b1();
        }
        return f;
    }

    public static la.b c(la laVar, boolean z) {
        if (laVar.getDegradeAbility() == la.a.FIX) {
            return la.b.FIX_NONDEGRADE;
        }
        if (laVar.getDegradeAbility() != la.a.SINGLE && z) {
            return la.b.FIRST_NONDEGRADE;
        }
        return la.b.NEVER_GRADE;
    }

    public static v5t d(la laVar) throws ik {
        return j(laVar, laVar.isHttps());
    }

    public static v5t e(la laVar, la.b bVar, int i) throws ik {
        try {
            k(laVar);
            laVar.setDegradeType(bVar);
            laVar.setReal_max_timeout(i);
            return new d1().x(laVar);
        } catch (ik e2) {
            throw e2;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new ik(AMapException.ERROR_UNKNOWN);
        }
    }

    public static la.b f(la laVar, boolean z) {
        if (laVar.getDegradeAbility() == la.a.FIX) {
            return z ? la.b.FIX_DEGRADE_BYERROR : la.b.FIX_DEGRADE_ONLY;
        }
        return z ? la.b.DEGRADE_BYERROR : la.b.DEGRADE_ONLY;
    }

    public static boolean g(la laVar) throws ik {
        k(laVar);
        try {
            String ipv6url = laVar.getIPV6URL();
            if (TextUtils.isEmpty(ipv6url)) {
                return false;
            }
            String host = new URL(ipv6url).getHost();
            if (!TextUtils.isEmpty(laVar.getIPDNSName())) {
                host = laVar.getIPDNSName();
            }
            return x0.U(host);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static int h(la laVar, boolean z) {
        try {
            k(laVar);
            int conntectionTimeout = laVar.getConntectionTimeout();
            int i = x0.s;
            return (laVar.getDegradeAbility() == la.a.FIX || laVar.getDegradeAbility() == la.a.SINGLE || conntectionTimeout < i || !z) ? conntectionTimeout : i;
        } catch (Throwable unused) {
            return 5000;
        }
    }

    public static boolean i(la laVar) throws ik {
        k(laVar);
        try {
            if (!g(laVar)) {
                return true;
            }
            if (laVar.getURL().equals(laVar.getIPV6URL()) || laVar.getDegradeAbility() == la.a.SINGLE || !x0.w) {
                return false;
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    @Deprecated
    public static v5t j(la laVar, boolean z) throws ik {
        byte[] bArr;
        k(laVar);
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        v5t v5tVarE = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (g(laVar)) {
            boolean zI = i(laVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                v5tVarE = e(laVar, c(laVar, zI), h(laVar, zI));
            } catch (ik e2) {
                if ((e2.f() == 21 && laVar.getDegradeAbility() == la.a.INTERRUPT_IO) || !zI) {
                    throw e2;
                }
                z2 = true;
            }
        }
        return (v5tVarE == null || (bArr = v5tVarE.f36513a) == null || bArr.length <= 0) ? e(laVar, f(laVar, z2), a(laVar, jElapsedRealtime)) : v5tVarE;
    }

    public static void k(la laVar) throws ik {
        if (laVar == null) {
            throw new ik("requeust is null");
        }
        if (laVar.getURL() == null || "".equals(laVar.getURL())) {
            throw new ik("request url is empty");
        }
    }
}
