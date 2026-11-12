package com.sogou.map.loc;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
final class r1 extends h0 {
    private static final Method A = j0.y(WifiManager.class, "getWifiApState");
    private static final int B = j0.p(WifiManager.class, "WIFI_AP_STATE_ENABLED");
    private static final int C = j0.p(WifiManager.class, "WIFI_AP_STATE_ENABLING");
    public final WifiManager b;
    private boolean c;
    private int d;
    private int e;
    private boolean f;
    private long g;
    private long h;
    private long i;
    private List j;
    private final z k;
    private final z l;
    private z m;
    private final z n;
    private final Object o;
    private z p;
    private boolean q;
    private int r;
    private Set s;
    private final Runnable t;
    private final u u;
    private final u v;
    private final u w;
    private int x;
    private long y;
    private final BroadcastReceiver z;

    public r1(l0 l0Var) {
        super(l0Var);
        this.c = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = -1L;
        this.j = null;
        this.k = new z().b(Boolean.TRUE);
        this.l = new z().b(Boolean.FALSE);
        this.m = null;
        this.n = new z().b(null);
        this.o = new Object();
        this.p = null;
        this.q = false;
        this.r = 0;
        this.s = new HashSet();
        this.t = new s1(this);
        this.u = new t1(this);
        this.v = new u1(this);
        this.w = new c0(this);
        this.x = 1;
        this.y = -1L;
        this.z = new d0(this);
        this.b = j0.B(d());
    }

    public static /* synthetic */ void B(r1 r1Var) {
        try {
            if (r1Var.p != null) {
                r0.b("scan resolve");
                r1Var.p.b(q0.e(r1Var.j, r1Var.i));
            }
        } catch (Throwable unused) {
        }
    }

    private boolean C() {
        Method method = A;
        if (method == null) {
            return false;
        }
        try {
            int iIntValue = ((Integer) method.invoke(this.b, new Object[0])).intValue();
            return iIntValue == B || iIntValue == C;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(boolean z) {
        try {
            r0.a(4, "locate", "force wifi: " + z);
            return this.b.setWifiEnabled(z);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean A() {
        return this.f;
    }

    public final z f(long j, boolean z) {
        r0.a(4, "locate", "tryScan(" + j + ", false)");
        if (j0.q() - this.h < j && this.j != null) {
            r0.b("tryScan use cache");
            return new z().b(q0.e(this.j, this.i));
        }
        if (C()) {
            r0.b("tryScan fail: ap enabled");
            return this.n;
        }
        if (this.d != 3) {
            r0.b("tryScan fail: force disable");
            return this.n;
        }
        synchronized (this.o) {
            if (this.p != null) {
                r0.b("tryScan use running def");
                return this.p;
            }
            this.g = Long.MAX_VALUE;
            z zVarA = new z().a(this.u);
            this.p = zVarA;
            b(this.t, 8000L);
            r0.b("set 8k");
            r0.b("force: " + this.d + ", false");
            int i = this.d;
            ((i == 3 || i == 2) ? this.k : this.l).a(this.w);
            return zVarA;
        }
    }

    public final synchronized r1 g() {
        WifiManager wifiManager = this.b;
        if (wifiManager != null && !this.c) {
            this.c = true;
            this.d = wifiManager.getWifiState();
            r0.b("init wifistate: " + this.d);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            d().registerReceiver(this.z, intentFilter);
            return this;
        }
        return this;
    }

    public final synchronized r1 p() {
        if (this.b != null && this.c) {
            this.c = false;
            d().unregisterReceiver(this.z);
            return this;
        }
        return this;
    }

    public final int u() {
        return this.x;
    }
}
