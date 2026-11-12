package com.amap.api.col.p0003sl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class kt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f2983a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f2984b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashMap<String, String> f2985c;
    public static HashMap<String, String> d;
    public static HashMap<String, String> e;
    private static kt f;

    public interface a {
        URLConnection a();
    }

    public kt() {
        im.e();
    }

    public static kt a() {
        if (f == null) {
            f = new kt();
        }
        return f;
    }

    @Deprecated
    private static lb d(la laVar, boolean z) throws ik {
        d(laVar);
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        lb lbVarA = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (b(laVar)) {
            boolean zC = c(laVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                lbVarA = a(laVar, a(laVar, zC), c(laVar, zC));
            } catch (ik e2) {
                if ((e2.f() == 21 && laVar.getDegradeAbility() == la.a.INTERRUPT_IO) || !zC) {
                    throw e2;
                }
                z2 = true;
            }
        }
        return (lbVarA == null || lbVarA.f3037a == null || lbVarA.f3037a.length <= 0) ? a(laVar, b(laVar, z2), a(laVar, jElapsedRealtime)) : lbVarA;
    }

    public static lb a(la laVar) throws ik {
        return d(laVar, laVar.isHttps());
    }

    private static lb a(la laVar, la.b bVar, int i) throws ik {
        try {
            d(laVar);
            laVar.setDegradeType(bVar);
            laVar.setReal_max_timeout(i);
            return new kx().c(laVar);
        } catch (ik e2) {
            throw e2;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new ik(AMapException.ERROR_UNKNOWN);
        }
    }

    protected static la.b a(la laVar, boolean z) {
        if (laVar.getDegradeAbility() == la.a.FIX) {
            return la.b.FIX_NONDEGRADE;
        }
        if (laVar.getDegradeAbility() == la.a.SINGLE) {
            return la.b.NEVER_GRADE;
        }
        return z ? la.b.FIRST_NONDEGRADE : la.b.NEVER_GRADE;
    }

    protected static la.b b(la laVar, boolean z) {
        if (laVar.getDegradeAbility() == la.a.FIX) {
            return z ? la.b.FIX_DEGRADE_BYERROR : la.b.FIX_DEGRADE_ONLY;
        }
        return z ? la.b.DEGRADE_BYERROR : la.b.DEGRADE_ONLY;
    }

    protected static boolean b(la laVar) throws ik {
        d(laVar);
        try {
            String ipv6url = laVar.getIPV6URL();
            if (TextUtils.isEmpty(ipv6url)) {
                return false;
            }
            String host = new URL(ipv6url).getHost();
            if (!TextUtils.isEmpty(laVar.getIPDNSName())) {
                host = laVar.getIPDNSName();
            }
            return im.g(host);
        } catch (Throwable unused) {
            return true;
        }
    }

    protected static boolean c(la laVar) throws ik {
        d(laVar);
        try {
            if (!b(laVar)) {
                return true;
            }
            if (laVar.getURL().equals(laVar.getIPV6URL()) || laVar.getDegradeAbility() == la.a.SINGLE || !im.h) {
                return false;
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    protected static int c(la laVar, boolean z) {
        try {
            d(laVar);
            int conntectionTimeout = laVar.getConntectionTimeout();
            int i = im.e;
            return (laVar.getDegradeAbility() == la.a.FIX || laVar.getDegradeAbility() == la.a.SINGLE || conntectionTimeout < i || !z) ? conntectionTimeout : i;
        } catch (Throwable unused) {
            return 5000;
        }
    }

    protected static int a(la laVar, long j) {
        try {
            d(laVar);
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

    protected static void d(la laVar) throws ik {
        if (laVar == null) {
            throw new ik("requeust is null");
        }
        if (laVar.getURL() == null || "".equals(laVar.getURL())) {
            throw new ik("request url is empty");
        }
    }
}
