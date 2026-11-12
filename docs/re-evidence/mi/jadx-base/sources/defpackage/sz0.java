package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.security.Security;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes5.dex */
public class sz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f34112a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f34113b;
    public static yq1 c;
    public static boolean d;
    public static Runnable e;
    public static boolean f;
    public static Runnable g;

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            String strD = b01.d("local_keypair");
            String strD2 = b01.d("local_tv_ids");
            ycm.b("localKeyPair: " + strD + ", localTvIds: " + strD2);
            if (!TextUtils.isEmpty(strD)) {
                yq1 unused = sz0.c = new yq1();
                sz0.c.e(rz0.b(strD));
                sz0.c.c(strD2);
            }
            boolean unused2 = sz0.d = true;
            if (sz0.e != null) {
                pz0.a(sz0.e);
                Runnable unused3 = sz0.e = null;
            }
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            sz0.o();
        }
    }

    public static void f() {
        if (!m()) {
            throw new RuntimeException("AirkanClient not init");
        }
    }

    public static yq1 g() {
        return c;
    }

    public static Context h() {
        f();
        return f34113b;
    }

    public static synchronized void i(Context context) {
        try {
            if (f34112a) {
                return;
            }
            if (context instanceof Activity) {
                context = context.getApplicationContext();
            }
            f34113b = context;
            pz0.b();
            f34112a = true;
            k();
            Security.insertProviderAt(new BouncyCastleProvider(), 1);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static yq1 j() {
        yq1 yq1Var = new yq1();
        c = yq1Var;
        yq1Var.e(oz0.f(1024));
        c.d();
        ycm.b(c.b().g());
        return c;
    }

    public static void k() {
        ycm.b("init Authority Entity!");
        pz0.a(new a());
    }

    public static boolean l() {
        return d;
    }

    public static synchronized boolean m() {
        return f34112a;
    }

    public static boolean n() {
        return e == null;
    }

    public static synchronized void o() {
        f = false;
        Runnable runnable = g;
        if (runnable != null) {
            pz0.d(runnable);
            g = null;
        }
    }

    public static void p(Runnable runnable) {
        e = runnable;
    }

    public static synchronized boolean q() {
        if (f) {
            return false;
        }
        f = true;
        b bVar = new b();
        g = bVar;
        pz0.c(bVar, 120000L);
        return true;
    }
}
