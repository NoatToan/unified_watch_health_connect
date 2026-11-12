package defpackage;

import android.os.SystemClock;
import com.xiaomi.push.b;
import com.xiaomi.push.fs;
import com.xiaomi.push.ft;
import com.xiaomi.push.fu;
import com.xiaomi.push.i;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes11.dex */
public class gvs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f19379a = fs.PING_RTT.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f19380b = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Hashtable<Integer, Long> f19381a = new Hashtable<>();
    }

    public static void a() {
        if (f19380b == 0 || SystemClock.elapsedRealtime() - f19380b > 7200000) {
            f19380b = SystemClock.elapsedRealtime();
            c(0, f19379a);
        }
    }

    public static void b(int i) {
        ft ftVarA = b.e().a();
        ftVarA.a(fs.CHANNEL_STATS_COUNTER.a());
        ftVarA.c(i);
        b.e().i(ftVarA);
    }

    public static synchronized void c(int i, int i2) {
        try {
            if (i2 < 16777215) {
                a.f19381a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
            } else {
                x9s.D("stats key should less than 16777215");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void d(int i, int i2, int i3, String str, int i4) {
        ft ftVarA = b.e().a();
        ftVarA.a((byte) i);
        ftVarA.a(i2);
        ftVarA.b(i3);
        ftVarA.b(str);
        ftVarA.c(i4);
        b.e().i(ftVarA);
    }

    public static synchronized void e(int i, int i2, String str, int i3) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i4 = (i << 24) | i2;
            if (a.f19381a.containsKey(Integer.valueOf(i4))) {
                ft ftVarA = b.e().a();
                ftVarA.a(i2);
                ftVarA.b((int) (jCurrentTimeMillis - a.f19381a.get(Integer.valueOf(i4)).longValue()));
                ftVarA.b(str);
                if (i3 > -1) {
                    ftVarA.c(i3);
                }
                b.e().i(ftVarA);
                a.f19381a.remove(Integer.valueOf(i2));
            } else {
                x9s.D("stats key not found");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void f(XMPushService xMPushService, bg.b bVar) {
        new zts(xMPushService, bVar).b();
    }

    public static void g(String str, int i, Exception exc) {
        ft ftVarA = b.e().a();
        if (b.f() != null && b.f().f20488a != null) {
            ftVarA.c(obs.w(b.f().f20488a) ? 1 : 0);
        }
        if (i > 0) {
            ftVarA.a(fs.GSLB_REQUEST_SUCCESS.a());
            ftVarA.b(str);
            ftVarA.b(i);
            b.e().i(ftVarA);
            return;
        }
        try {
            fus.a aVarA = fus.a(exc);
            ftVarA.a(aVarA.f18270a.a());
            ftVarA.c(aVarA.f18271b);
            ftVarA.b(str);
            b.e().i(ftVarA);
        } catch (NullPointerException unused) {
        }
    }

    public static void h(String str, Exception exc) {
        try {
            fus.a aVarC = fus.c(exc);
            ft ftVarA = b.e().a();
            ftVarA.a(aVarC.f18270a.a());
            ftVarA.c(aVarC.f18271b);
            ftVarA.b(str);
            if (b.f() != null && b.f().f20488a != null) {
                ftVarA.c(obs.w(b.f().f20488a) ? 1 : 0);
            }
            b.e().i(ftVarA);
        } catch (NullPointerException unused) {
        }
    }

    public static byte[] i() {
        fu fuVarC = b.e().c();
        if (fuVarC != null) {
            return i.e(fuVarC);
        }
        return null;
    }

    public static void j() {
        e(0, f19379a, null, -1);
    }

    public static void k(String str, Exception exc) {
        try {
            fus.a aVarE = fus.e(exc);
            ft ftVarA = b.e().a();
            ftVarA.a(aVarE.f18270a.a());
            ftVarA.c(aVarE.f18271b);
            ftVarA.b(str);
            if (b.f() != null && b.f().f20488a != null) {
                ftVarA.c(obs.w(b.f().f20488a) ? 1 : 0);
            }
            b.e().i(ftVarA);
        } catch (NullPointerException unused) {
        }
    }
}
