package com.sogou.map.loc;

import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes18.dex */
final class f1 extends h0 {
    private static final boolean m;
    private final LocationManager b;
    private boolean c;
    private b1 d;
    private b1 e;
    private long f;
    private boolean g;
    private l1 h;
    private Handler i;
    private final GpsStatus.Listener j;
    private final LocationListener k;
    private LocationListener l;

    static {
        m = j0.e(LocationManager.class, "PASSIVE_PROVIDER") != null;
    }

    public f1(l0 l0Var) {
        super(l0Var);
        this.c = false;
        this.f = 0L;
        this.g = false;
        this.i = null;
        this.j = new g1(this);
        this.k = new h1(this);
        this.l = new i1(this);
        this.b = j0.s(d());
    }

    public static /* synthetic */ y0 f(f1 f1Var, Location location) {
        if (location == null) {
            return null;
        }
        y0 y0Var = new y0(location.getLongitude(), location.getLatitude(), location.getAltitude(), location.getAccuracy(), location.getTime(), location.getSpeed(), location.getBearing(), j0.b());
        if (location.getProvider().equals("gps")) {
            y0Var.c("gps");
        } else {
            location.getProvider().equals("network");
            y0Var.c("network");
        }
        return y0Var;
    }

    public final synchronized f1 g() {
        if (this.b != null && !this.c) {
            this.c = true;
            Handler handlerC = j0.c("AsyncApplyThread", 0);
            this.i = handlerC;
            handlerC.post(new j1(this));
            return this;
        }
        return this;
    }

    public final void l(l1 l1Var) {
        this.h = l1Var;
    }

    public final synchronized f1 n() {
        if (this.b != null && this.c) {
            this.c = false;
            Handler handler = this.i;
            this.i = null;
            handler.post(new k1(this, handler));
            return this;
        }
        return this;
    }

    public final boolean q() {
        LocationManager locationManager = this.b;
        if (locationManager == null) {
            return false;
        }
        try {
            return locationManager.isProviderEnabled("gps");
        } catch (Exception unused) {
            return false;
        }
    }

    public final b1 s() {
        return this.d;
    }

    public final b1 u() {
        return this.e;
    }

    public final long v() {
        return this.f;
    }

    public final boolean w() {
        return this.g;
    }
}
