package com.facebook.react.modules.debug;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.sk1;
import defpackage.tv6;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.facebook.react.modules.core.a.AbstractC0164a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.facebook.react.modules.core.a f7401b;
    public final ReactContext c;
    public final UIManagerModule d;
    public TreeMap<Long, b> n;
    public boolean f = false;
    public long g = -1;
    public long h = -1;
    public int i = 0;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7402k = 0;
    public int l = 0;
    public boolean m = false;
    public final tv6 e = new tv6();

    /* JADX INFO: renamed from: com.facebook.react.modules.debug.a$a, reason: collision with other inner class name */
    public class RunnableC0166a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f7403a;

        public RunnableC0166a(a aVar) {
            this.f7403a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f7401b = com.facebook.react.modules.core.a.d();
            a.this.f7401b.e(this.f7403a);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7406b;
        public final int c;
        public final int d;
        public final double e;
        public final double f;
        public final int g;

        public b(int i, int i2, int i3, int i4, double d, double d2, int i5) {
            this.f7405a = i;
            this.f7406b = i2;
            this.c = i3;
            this.d = i4;
            this.e = d;
            this.f = d2;
            this.g = i5;
        }
    }

    public a(ReactContext reactContext) {
        this.c = reactContext;
        this.d = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0164a
    public void a(long j) {
        if (this.f) {
            return;
        }
        if (this.g == -1) {
            this.g = j;
        }
        long j2 = this.h;
        this.h = j;
        if (this.e.e(j2, j)) {
            this.l++;
        }
        this.i++;
        int iF = f();
        if ((iF - this.j) - 1 >= 4) {
            this.f7402k++;
        }
        if (this.m) {
            sk1.c(this.n);
            this.n.put(Long.valueOf(System.currentTimeMillis()), new b(j(), k(), iF, this.f7402k, g(), i(), l()));
        }
        this.j = iF;
        com.facebook.react.modules.core.a aVar = this.f7401b;
        if (aVar != null) {
            aVar.e(this);
        }
    }

    public int e() {
        return this.f7402k;
    }

    public int f() {
        return (int) ((((double) l()) / 16.9d) + 1.0d);
    }

    public double g() {
        if (this.h == this.g) {
            return 0.0d;
        }
        return (((double) j()) * 1.0E9d) / (this.h - this.g);
    }

    public b h(long j) {
        sk1.d(this.n, "FPS was not recorded at each frame!");
        Map.Entry<Long, b> entryFloorEntry = this.n.floorEntry(Long.valueOf(j));
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    public double i() {
        if (this.h == this.g) {
            return 0.0d;
        }
        return (((double) k()) * 1.0E9d) / (this.h - this.g);
    }

    public int j() {
        return this.i - 1;
    }

    public int k() {
        return this.l - 1;
    }

    public int l() {
        return ((int) (this.h - this.g)) / 1000000;
    }

    public void m() {
        this.g = -1L;
        this.h = -1L;
        this.i = 0;
        this.f7402k = 0;
        this.l = 0;
        this.m = false;
        this.n = null;
    }

    public void n() {
        this.f = false;
        this.c.getCatalystInstance().addBridgeIdleDebugListener(this.e);
        this.d.setViewHierarchyUpdateDebugListener(this.e);
        UiThreadUtil.runOnUiThread(new RunnableC0166a(this));
    }

    public void o() {
        this.n = new TreeMap<>();
        this.m = true;
        n();
    }

    public void p() {
        this.f = true;
        this.c.getCatalystInstance().removeBridgeIdleDebugListener(this.e);
        this.d.setViewHierarchyUpdateDebugListener(null);
    }
}
