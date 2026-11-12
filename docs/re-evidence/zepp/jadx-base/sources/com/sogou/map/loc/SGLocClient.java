package com.sogou.map.loc;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;
import java.util.LinkedHashSet;
import java.util.Set;
import org.cybergarage.upnp.control.ControlResponse;

/* JADX INFO: loaded from: classes18.dex */
public class SGLocClient {
    public static final int Extra_Region = 1;
    public static final int GPS_FIRST = 2;
    public static final long GPS_INTERVAL = 1000;
    public static final int GPS_ONLY = 1;
    public static final int NETWORK_FIRST = 4;
    public static final int NETWORK_ONLY = 8;
    public String a;
    public String b;
    private final LocationManager f;
    private t2 g;
    public d c = d.SG;
    public int d = 0;
    private byte e = 8;
    private Handler h = new Handler();
    private int i = 120000;
    private int j = 120000;
    private boolean k = false;
    public Set l = new LinkedHashSet();
    public Set m = new LinkedHashSet();
    private int n = -1;
    private boolean o = false;
    private boolean p = false;
    private long q = -1;
    private final Runnable r = new j2(this);
    private final Runnable s = new l2(this);
    private final Runnable t = new m2(this);
    private k2 u = null;
    private boolean v = false;
    private final LocationListener w = new p2(this);

    public SGLocClient(Context context) {
        this.f = j0.s(context);
        this.g = new t2(context, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(SGLocation sGLocation) {
        this.h.post(new s2(this, sGLocation));
    }

    public void addErrorListener(SGErrorListener sGErrorListener) {
        r0.b("addErrorListener");
        this.m.add(sGErrorListener);
    }

    public void addLocListener(SGLocListener sGLocListener) {
        r0.b("addLocListener");
        this.l.add(sGLocListener);
    }

    public void clearErrorListener() {
        r0.b("clearErrorListener");
        this.m.clear();
    }

    public void clearLocListener() {
        r0.b("clearLocListener");
        this.l.clear();
    }

    public synchronized void clearWatch() {
        this.n = -1;
        this.k = false;
        r0.b(this + ".clearWatch()");
        this.h.post(this.s);
    }

    public synchronized void destroy() {
        try {
            pause();
            this.k = false;
            r0.b(this + ".destroy()");
            this.g.e();
        } catch (Throwable unused) {
        }
    }

    public String getVersion() {
        return a2.k;
    }

    public synchronized void pause() {
        try {
            r0.b(this + ".pause()");
            this.o = true;
            this.h.post(this.s);
        } catch (Throwable unused) {
        }
    }

    public void removeErrorListener(SGErrorListener sGErrorListener) {
        r0.b("removeErrorListener");
        this.m.remove(sGErrorListener);
    }

    public void removeLocListener(SGLocListener sGLocListener) {
        r0.b("removeLocListener");
        this.l.remove(sGLocListener);
    }

    public synchronized void requestLocation() {
        r0.b(this + ".requestLocation()");
        this.g.a().a(new r2(this, new q2(this)));
    }

    public synchronized void resume() {
        try {
            r0.b(this + ".resume()");
            this.o = false;
            this.h.post(this.r);
        } catch (Throwable unused) {
        }
    }

    public synchronized int s() {
        return this.n;
    }

    public void setExtra(int i) {
        this.d = i;
    }

    public void setKey(String str) {
        this.a = str;
    }

    public void setProp(String str, String str2) {
        v1.e(this, str, str2);
    }

    public void setStrategy(int i) {
        this.e = (byte) i;
    }

    public byte t() {
        return this.e;
    }

    public String toString() {
        String str = this.b;
        return str == null ? ControlResponse.FAULT_CODE : str;
    }

    public synchronized void tryAddGpsKeeper() {
        if (!this.v) {
            try {
                this.f.requestLocationUpdates("gps", this.n, 100.0f, this.w);
            } catch (Exception unused) {
            }
            this.v = true;
        }
    }

    public synchronized void tryRmvGpsKeeper() {
        if (this.v) {
            try {
                this.f.removeUpdates(this.w);
                this.v = false;
            } catch (Exception unused) {
            }
        }
    }

    public void v(String str) {
        this.b = str;
    }

    public synchronized void watchLocation(int i) {
        try {
            int iMax = Math.max(0, i);
            if (iMax <= 0) {
                iMax = 1000;
            }
            this.n = iMax;
            r0.b(this + ".watchLocation(" + this.n + ")");
            this.h.post(this.r);
        } catch (Throwable unused) {
        }
    }
}
