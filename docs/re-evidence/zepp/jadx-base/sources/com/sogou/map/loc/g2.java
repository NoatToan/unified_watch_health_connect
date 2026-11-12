package com.sogou.map.loc;

import android.os.SystemClock;
import com.huami.snore.ui.fragment.SnoreListFragment;

/* JADX INFO: loaded from: classes18.dex */
final class g2 implements Runnable {
    private final k2 a;
    private /* synthetic */ d2 f;
    private volatile boolean b = false;
    private volatile i2 c = null;
    private final u e = new h2(this);
    private long d = SystemClock.elapsedRealtime();

    public g2(d2 d2Var, k2 k2Var) {
        this.f = d2Var;
        this.a = k2Var;
    }

    public static /* synthetic */ void b(g2 g2Var, c1 c1Var) {
        try {
            StringBuilder sb = new StringBuilder("callNetTask");
            sb.append(c1Var == null ? " with no scan result" : "");
            r0.b(sb.toString());
            b2 b2Var = new b2();
            b2Var.c(c1Var);
            g2Var.f.a.a().execute(new i2(g2Var.f, g2Var, b2Var, (byte) 0));
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void c(g2 g2Var, b2 b2Var, SGLocation sGLocation) {
        r0.a(4, SnoreListFragment.TYPE_UPLOAD, "&mid=8&cost=" + (SystemClock.elapsedRealtime() - g2Var.d));
        SGLocation sGLocationA = g2Var.f.f.a(sGLocation);
        r0.b("&mid=8&cost=" + (SystemClock.elapsedRealtime() - g2Var.d));
        r0.b("submitResult()+result haserror=" + sGLocationA.g());
        boolean zG = sGLocationA.g();
        k2 k2Var = g2Var.a;
        if (zG) {
            k2Var.f(sGLocationA);
        } else {
            k2Var.c(sGLocationA);
        }
    }

    public final void a() {
        this.b = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.b) {
                r0.b("aborted: A");
            } else {
                this.f.b.f(500L, false).a(this.e);
            }
        } catch (Throwable unused) {
        }
    }
}
