package androidx.camera.core.impl;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements c0.a.InterfaceC0337a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f5739a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0.a f5742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f5743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5744f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l0.a f5745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f5746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f5747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f5748d;

        public a(l0.a aVar, Executor executor, b bVar, c cVar) {
            this.f5745a = aVar;
            this.f5746b = executor;
            this.f5747c = bVar;
            this.f5748d = cVar;
        }
    }

    public interface b {
    }

    public interface c {
    }

    public s0(c0.a aVar, int i14) {
        Object obj = new Object();
        this.f5740b = obj;
        this.f5743e = new HashMap();
        this.f5741c = i14;
        synchronized (obj) {
            this.f5742d = aVar;
            this.f5744f = this.f5741c;
        }
    }

    public static void d(v.s sVar, l0.a aVar) {
        if (ce.a.b()) {
            ce.a.c(aVar.ordinal(), "CX:State[" + sVar + "]");
        }
    }

    @Override // c0.a.InterfaceC0337a
    public final void a(int i14, int i15) {
        synchronized (this.f5740b) {
            boolean z14 = true;
            this.f5741c = i15 == 2 ? 2 : 1;
            boolean z15 = i14 != 2 && i15 == 2;
            if (i14 != 2 || i15 == 2) {
                z14 = false;
            }
            if (z15 || z14) {
                c();
            }
        }
    }

    public final a b(String str) {
        HashMap map = this.f5743e;
        for (b0.k kVar : map.keySet()) {
            if (str.equals(((k0) kVar.b()).q())) {
                return (a) map.get(kVar);
            }
        }
        return null;
    }

    public final void c() {
        boolean zA = b0.t0.a(3, "CameraStateRegistry");
        StringBuilder sb3 = this.f5739a;
        if (zA) {
            sb3.setLength(0);
            sb3.append("Recalculating open cameras:\n");
            sb3.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb3.append("-------------------------------------------------------------------\n");
        }
        int i14 = 0;
        for (Map.Entry entry : this.f5743e.entrySet()) {
            if (b0.t0.a(3, "CameraStateRegistry")) {
                sb3.append(String.format(Locale.US, "%-45s%-22s\n", ((b0.k) entry.getKey()).toString(), ((a) entry.getValue()).f5745a != null ? ((a) entry.getValue()).f5745a.toString() : "UNKNOWN"));
            }
            l0.a aVar = ((a) entry.getValue()).f5745a;
            if (aVar != null && aVar.f5600a) {
                i14++;
            }
        }
        if (b0.t0.a(3, "CameraStateRegistry")) {
            sb3.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb3.append(am.j.g(i14, this.f5741c, "Open count: ", " (Max allowed: ", ")"));
        }
        this.f5744f = Math.max(this.f5741c - i14, 0);
    }

    public final boolean e(v.s sVar) {
        boolean z14;
        synchronized (this.f5740b) {
            try {
                a aVar = (a) this.f5743e.get(sVar);
                k7.h.e(aVar, "Camera must first be registered with registerCamera()");
                z14 = true;
                if (b0.t0.a(3, "CameraStateRegistry")) {
                    this.f5739a.setLength(0);
                    StringBuilder sb3 = this.f5739a;
                    Locale locale = Locale.US;
                    int i14 = this.f5744f;
                    l0.a aVar2 = aVar.f5745a;
                    boolean z15 = aVar2 != null && aVar2.f5600a;
                    sb3.append("tryOpenCamera(" + sVar + ") [Available Cameras: " + i14 + ", Already Open: " + z15 + " (Previous state: " + aVar.f5745a + ")]");
                }
                if (this.f5744f > 0) {
                    l0.a aVar3 = l0.a.OPENING;
                    aVar.f5745a = aVar3;
                    d(sVar, aVar3);
                } else {
                    l0.a aVar4 = aVar.f5745a;
                    if (aVar4 != null && aVar4.f5600a) {
                        l0.a aVar5 = l0.a.OPENING;
                        aVar.f5745a = aVar5;
                        d(sVar, aVar5);
                    } else {
                        z14 = false;
                    }
                }
                if (b0.t0.a(3, "CameraStateRegistry")) {
                    StringBuilder sb4 = this.f5739a;
                    Locale locale2 = Locale.US;
                    sb4.append(" --> ".concat(z14 ? "SUCCESS" : "FAIL"));
                }
                if (z14) {
                    c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    public final boolean f(String str, String str2) {
        synchronized (this.f5740b) {
            try {
                boolean z14 = true;
                if (((z.a) this.f5742d).b() != 2) {
                    return true;
                }
                a aVarB = b(str);
                l0.a aVar = aVarB != null ? aVarB.f5745a : null;
                a aVarB2 = str2 != null ? b(str2) : null;
                l0.a aVar2 = aVarB2 != null ? aVarB2.f5745a : null;
                l0.a aVar3 = l0.a.OPEN;
                boolean z15 = aVar3.equals(aVar) || l0.a.CONFIGURED.equals(aVar);
                boolean z16 = aVar3.equals(aVar2) || l0.a.CONFIGURED.equals(aVar2);
                if (!z15 || !z16) {
                    z14 = false;
                }
                return z14;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
