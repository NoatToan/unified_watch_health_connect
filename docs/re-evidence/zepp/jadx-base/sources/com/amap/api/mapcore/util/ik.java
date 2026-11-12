package com.amap.api.mapcore.util;

import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    public static int a = 0;
    public static String b = "";
    private static ik c;

    public interface a {
        URLConnection a();
    }

    public ik() {
        gk.d();
    }

    public static ik a() {
        if (c == null) {
            c = new ik();
        }
        return c;
    }

    public static is b(ir irVar) throws gi {
        return a(irVar, irVar.isHttps());
    }

    public static ir.b c(ir irVar, boolean z) {
        if (irVar.getDegradeAbility() == ir.a.FIX) {
            return z ? ir.b.FIX_DEGRADE_BYERROR : ir.b.FIX_DEGRADE_ONLY;
        }
        return z ? ir.b.DEGRADE_BYERROR : ir.b.DEGRADE_ONLY;
    }

    public static boolean d(ir irVar) throws gi {
        e(irVar);
        try {
            if (!c(irVar)) {
                return true;
            }
            if (irVar.getURL().equals(irVar.getIPV6URL()) || irVar.getDegradeAbility() == ir.a.SINGLE || !gk.h) {
                return false;
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public static void e(ir irVar) throws gi {
        if (irVar == null) {
            throw new gi("requeust is null");
        }
        if (irVar.getURL() == null || "".equals(irVar.getURL())) {
            throw new gi("request url is empty");
        }
    }

    public static ir.b b(ir irVar, boolean z) {
        if (irVar.getDegradeAbility() == ir.a.FIX) {
            return ir.b.FIX_NONDEGRADE;
        }
        if (irVar.getDegradeAbility() == ir.a.SINGLE) {
            return ir.b.NEVER_GRADE;
        }
        return z ? ir.b.FIRST_NONDEGRADE : ir.b.NEVER_GRADE;
    }

    public static boolean c(ir irVar) throws gi {
        e(irVar);
        try {
            String ipv6url = irVar.getIPV6URL();
            if (TextUtils.isEmpty(ipv6url)) {
                return false;
            }
            String host = new URL(ipv6url).getHost();
            if (!TextUtils.isEmpty(irVar.getIPDNSName())) {
                host = irVar.getIPDNSName();
            }
            return gk.d(host);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Deprecated
    public byte[] a(ir irVar) throws gi {
        try {
            is isVarA = a(irVar, false);
            if (isVarA != null) {
                return isVarA.a;
            }
            return null;
        } catch (gi e) {
            throw e;
        } catch (Throwable th) {
            hk.a(th, "bm", com.alipay.sdk.m.o.a.a);
            throw new gi(AMapException.ERROR_UNKNOWN);
        }
    }

    public static int d(ir irVar, boolean z) {
        try {
            e(irVar);
            int conntectionTimeout = irVar.getConntectionTimeout();
            int i = gk.e;
            return (irVar.getDegradeAbility() == ir.a.FIX || irVar.getDegradeAbility() == ir.a.SINGLE || conntectionTimeout < i || !z) ? conntectionTimeout : i;
        } catch (Throwable unused) {
            return 5000;
        }
    }

    @Deprecated
    public static is a(ir irVar, boolean z) throws gi {
        byte[] bArr;
        e(irVar);
        irVar.setHttpProtocol(z ? ir.c.HTTPS : ir.c.HTTP);
        is isVarA = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (c(irVar)) {
            boolean zD = d(irVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                isVarA = a(irVar, b(irVar, zD), d(irVar, zD));
            } catch (gi e) {
                if ((e.f() == 21 && irVar.getDegradeAbility() == ir.a.INTERRUPT_IO) || !zD) {
                    throw e;
                }
                z2 = true;
            }
        }
        if (isVarA != null && (bArr = isVarA.a) != null && bArr.length > 0) {
            return isVarA;
        }
        try {
            return a(irVar, c(irVar, z2), a(irVar, jElapsedRealtime));
        } catch (gi e2) {
            throw e2;
        }
    }

    private static is a(ir irVar, ir.b bVar, int i) throws gi {
        try {
            e(irVar);
            irVar.setDegradeType(bVar);
            irVar.setReal_max_timeout(i);
            return new io().c(irVar);
        } catch (gi e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new gi(AMapException.ERROR_UNKNOWN);
        }
    }

    public static int a(ir irVar, long j) {
        try {
            e(irVar);
            long jElapsedRealtime = 0;
            if (j != 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            }
            int conntectionTimeout = irVar.getConntectionTimeout();
            if (irVar.getDegradeAbility() != ir.a.FIX && irVar.getDegradeAbility() != ir.a.SINGLE) {
                long j2 = conntectionTimeout;
                if (jElapsedRealtime < j2) {
                    long j3 = j2 - jElapsedRealtime;
                    if (j3 >= 1000) {
                        return (int) j3;
                    }
                }
                return Math.min(1000, irVar.getConntectionTimeout());
            }
            return conntectionTimeout;
        } catch (Throwable unused) {
            return 5000;
        }
    }
}
