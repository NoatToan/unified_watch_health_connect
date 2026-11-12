package j1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.Range;
import android.util.Rational;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.q2;
import androidx.camera.core.impl.w1;
import androidx.lifecycle.s0;
import androidx.lifecycle.y0;
import b0.b0;
import b0.e0;
import b0.g0;
import b0.k1;
import b0.l0;
import b0.l1;
import b0.w0;
import com.google.common.util.concurrent.ListenableFuture;
import i3.e5;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import vn2.t0;
import z0.a0;
import z0.h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final a F = new a();
    public final e<Float> A;
    public final e<Float> B;
    public final HashSet C;
    public final HashMap D;
    public final long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.t f96202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w0 f96204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l0 f96205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Executor f96206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y0.b f96207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g0 f96208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h0<a0> f96209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z0.x f96210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f96211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b0 f96212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Range<Integer> f96213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b0.k f96214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f96215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k1 f96216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w0.c f96217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f96218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j1.a f96219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f96220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f96221t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f96222u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1840b f96223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c<l1> f96224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c<Integer> f96225x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0<x> f96226y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e<Boolean> f96227z;

    public class a implements l0.j {
        @Override // b0.l0.j
        public final void a(long j8, l0.k kVar) {
            kVar.a();
        }

        @Override // b0.l0.j
        public final void clear() {
        }
    }

    /* JADX INFO: renamed from: j1.b$b, reason: collision with other inner class name */
    public static class C1840b implements l0.c<e0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f96229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y0<x> f96230c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f96228a = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f96231d = new Object();

        public C1840b(PointF pointF, y0<x> y0Var) {
            this.f96229b = pointF;
            this.f96230c = y0Var;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            synchronized (this.f96231d) {
                try {
                    if (this.f96228a) {
                        return;
                    }
                    boolean z14 = th3 instanceof CameraControl.OperationCanceledException;
                    y0<x> y0Var = this.f96230c;
                    if (!z14) {
                        y0Var.j(new x(4, this.f96229b));
                        return;
                    }
                    y0Var.j(new x(0, null));
                    synchronized (this.f96231d) {
                        this.f96228a = true;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // l0.c
        public final void onSuccess(e0 e0Var) {
            e0 e0Var2 = e0Var;
            synchronized (this.f96231d) {
                try {
                    if (this.f96228a) {
                        return;
                    }
                    if (e0Var2 == null) {
                        return;
                    }
                    this.f96230c.j(new x(e0Var2.f13875a ? 2 : 3, this.f96229b));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public b(Context context, ListenableFuture<n> listenableFuture) {
        this.f96202a = b0.t.f14049d;
        this.f96203b = 3;
        new HashMap();
        this.f96210i = a0.f200504j0;
        b0 b0Var = b0.f13853c;
        this.f96211j = b0Var;
        this.f96212k = b0Var;
        this.f96213l = q2.f5715a;
        this.f96220s = -1;
        this.f96221t = true;
        this.f96222u = true;
        this.f96224w = new c<>();
        this.f96225x = new c<>();
        y0<x> y0Var = new y0<>(new x(0, null));
        this.f96226y = y0Var;
        j0.n.a(y0Var, new e5(27));
        this.f96227z = new e<>();
        this.A = new e<>();
        this.B = new e<>();
        this.C = new HashSet();
        this.D = new HashMap();
        this.E = 5000000000L;
        Context contextA = j0.f.a(context);
        w0.a aVar = new w0.a();
        c(aVar);
        androidx.camera.core.impl.h hVar = m1.f5634j;
        w1 w1Var = aVar.f14085a;
        w1Var.X(hVar, b0Var);
        d2 d2Var = new d2(a2.T(w1Var));
        n1.s(d2Var);
        this.f96204c = new w0(d2Var);
        this.f96205d = e(null);
        this.f96208g = d(null, null, null);
        this.f96209h = f();
        j1.a aVar2 = new j1.a(this);
        k0.d dVarD = k0.b.d();
        l0.j.a aVar3 = l0.j.f107810a;
        l0.j.j(listenableFuture, new l0.i(aVar2), dVarD);
        this.f96218q = new q(contextA);
        this.f96219r = new j1.a(this);
    }

    @SuppressLint({"MissingPermission", "WrongConstant"})
    public final void a(w0.c cVar, k1 k1Var) {
        j0.u.a();
        if (this.f96217p != cVar) {
            this.f96217p = cVar;
            this.f96204c.G(cVar);
        }
        boolean z14 = true;
        if (this.f96216o != null) {
            int i14 = i(k1Var);
            u0.a aVar = i14 != -1 ? new u0.a(i14, 1) : null;
            int i15 = i(this.f96216o);
            if (aVar == (i15 != -1 ? new u0.a(i15, 1) : null)) {
                z14 = false;
            }
        }
        this.f96216o = k1Var;
        q qVar = this.f96218q;
        k0.d dVarD = k0.b.d();
        j1.a aVar2 = this.f96219r;
        synchronized (qVar.f96298a) {
            try {
                if (qVar.f96299b.canDetectOrientation()) {
                    qVar.f96300c.put(aVar2, new q.c(aVar2, dVarD));
                    qVar.f96299b.enable();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z14) {
            q();
        }
        p(null);
    }

    public final void b() {
        j0.u.a();
        n nVar = this.f96215n;
        if (nVar != null) {
            nVar.a(this.f96204c, this.f96205d, this.f96208g, this.f96209h);
        }
        this.f96204c.G(null);
        this.f96214m = null;
        this.f96217p = null;
        this.f96216o = null;
        q qVar = this.f96218q;
        j1.a aVar = this.f96219r;
        synchronized (qVar.f96298a) {
            try {
                q.c cVar = (q.c) qVar.f96300c.get(aVar);
                if (cVar != null) {
                    cVar.f96305c.set(false);
                    qVar.f96300c.remove(aVar);
                }
                if (qVar.f96300c.isEmpty()) {
                    qVar.f96299b.disable();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c(n1.a aVar) {
        k1 k1Var = this.f96216o;
        if (k1Var != null) {
            int i14 = i(k1Var);
            u0.a aVar2 = i14 != -1 ? new u0.a(i14, 1) : null;
            if (aVar2 != null) {
                u0.c.a aVar3 = new u0.c.a();
                aVar3.f167328a = aVar2;
                aVar.e(aVar3.a());
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    public final g0 d(Integer num, Integer num2, Integer num3) {
        g0.c cVar = new g0.c();
        w1 w1Var = cVar.f13902a;
        if (num != null) {
            w1Var.X(androidx.camera.core.impl.k1.O, num);
        }
        if (num2 != null) {
            w1Var.X(androidx.camera.core.impl.k1.P, num2);
        }
        if (num3 != null) {
            w1Var.X(androidx.camera.core.impl.k1.R, num3);
        }
        c(cVar);
        int i14 = this.f96220s;
        if (i14 != -1) {
            w1Var.X(n1.f5644l, Integer.valueOf(i14));
        }
        androidx.camera.core.impl.k1 k1Var = new androidx.camera.core.impl.k1(a2.T(w1Var));
        n1.s(k1Var);
        return new g0(k1Var);
    }

    @SuppressLint({"WrongConstant"})
    public final l0 e(Integer num) {
        l0.b bVar = new l0.b();
        w1 w1Var = bVar.f14025a;
        if (num != null) {
            w1Var.X(androidx.camera.core.impl.l1.O, num);
        }
        c(bVar);
        int i14 = this.f96220s;
        if (i14 != -1) {
            w1Var.X(n1.f5644l, Integer.valueOf(i14));
        }
        return bVar.f();
    }

    @SuppressLint({"WrongConstant"})
    public final h0<a0> f() {
        int i14;
        a0.g gVar = new a0.g();
        z0.x xVar = this.f96210i;
        k7.h.e(xVar, "The specified quality selector can't be null.");
        z0.f.b bVar = gVar.f200562a;
        z0.l.b bVarF = bVar.b().f();
        bVarF.f200667a = xVar;
        bVar.f200621a = bVarF.a();
        k1 k1Var = this.f96216o;
        if (k1Var != null && xVar == a0.f200504j0 && (i14 = i(k1Var)) != -1) {
            z0.l.b bVarF2 = bVar.b().f();
            bVarF2.b(i14);
            bVar.f200621a = bVarF2.a();
        }
        h0.b bVar2 = new h0.b(new a0(null, bVar.a(), 0, gVar.f200563b, gVar.f200564c, gVar.f200565d, gVar.f200566e));
        Range<Integer> range = this.f96213l;
        androidx.camera.core.impl.h hVar = b3.A;
        w1 w1Var = bVar2.f200640a;
        w1Var.X(hVar, range);
        w1Var.X(n1.f5646n, 0);
        w1Var.X(m1.f5634j, this.f96211j);
        int i15 = this.f96220s;
        if (i15 != -1) {
            w1Var.X(n1.f5644l, Integer.valueOf(i15));
        }
        return new h0<>(new a1.a(a2.T(w1Var)));
    }

    public final ListenableFuture<Void> g(boolean z14) {
        j0.u.a();
        if (j()) {
            return this.f96214m.a().g(z14);
        }
        Boolean boolValueOf = Boolean.valueOf(z14);
        e<Boolean> eVar = this.f96227z;
        eVar.getClass();
        j0.u.a();
        return androidx.concurrent.futures.b.a(new hc0.c(8, eVar, boolValueOf));
    }

    public final l1.a h() {
        l1.a.EnumC2071a enumC2071a = l1.a.EnumC2071a.SCREEN_FLASH_VIEW;
        HashMap map = this.D;
        if (map.get(enumC2071a) != null) {
            return (l1.a) map.get(enumC2071a);
        }
        l1.a.EnumC2071a enumC2071a2 = l1.a.EnumC2071a.PREVIEW_VIEW;
        if (map.get(enumC2071a2) != null) {
            return (l1.a) map.get(enumC2071a2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[RETURN] */
    public final int i(k1 k1Var) {
        int iH;
        boolean z14;
        int iA;
        Rational rational;
        b0.t tVar = this.f96202a;
        int iB = k1Var == null ? 0 : j0.c.b(k1Var.f14001c);
        try {
            n nVar = this.f96215n;
            if (nVar != null) {
                k0 k0Var = nVar.d(tVar).f5574a;
                iH = k0Var.h();
                try {
                    if (k0Var.b() != 1) {
                        z14 = false;
                    }
                } catch (IllegalArgumentException unused) {
                    if (tVar != null) {
                        tVar.b();
                    }
                }
                iA = j0.c.a(iB, iH, z14);
                rational = k1Var.f14000b;
                if (iA != 90 || iA == 270) {
                    rational = new Rational(rational.getDenominator(), rational.getNumerator());
                }
                if (rational.equals(j0.a.f95902a)) {
                    return 0;
                }
                if (rational.equals(j0.a.f95904c)) {
                    return 1;
                }
                return -1;
            }
            iH = 0;
        } catch (IllegalArgumentException unused2) {
            iH = 0;
        }
        z14 = true;
        iA = j0.c.a(iB, iH, z14);
        rational = k1Var.f14000b;
        if (iA != 90) {
            rational = new Rational(rational.getDenominator(), rational.getNumerator());
        } else {
            rational = new Rational(rational.getDenominator(), rational.getNumerator());
        }
        if (rational.equals(j0.a.f95902a)) {
            return 0;
        }
        if (rational.equals(j0.a.f95904c)) {
            return 1;
        }
        return -1;
    }

    public final boolean j() {
        return this.f96214m != null;
    }

    public final boolean k() {
        return this.f96215n != null;
    }

    public final void l(y0.b bVar, y0.b bVar2) {
        if (Objects.equals(bVar == null ? null : bVar.c(), bVar2 == null ? null : bVar2.c())) {
            return;
        }
        Integer num = (Integer) ((androidx.camera.core.impl.k1) this.f96208g.f13969h).f(androidx.camera.core.impl.k1.O, 0);
        num.intValue();
        r(num, Integer.valueOf(this.f96208g.G()), Integer.valueOf(this.f96208g.H()));
        p(null);
    }

    public final void m(int i14) {
        j0.u.a();
        int i15 = this.f96203b;
        if (i14 == i15) {
            return;
        }
        this.f96203b = i14;
        j0.u.a();
        j0.u.a();
        p(new com.mapbox.maps.d((d) this, i15, i14, 2));
    }

    public final ListenableFuture<Void> n(float f14) {
        j0.u.a();
        if (j()) {
            return this.f96214m.a().b(f14);
        }
        Float fValueOf = Float.valueOf(f14);
        e<Float> eVar = this.B;
        eVar.getClass();
        j0.u.a();
        return androidx.concurrent.futures.b.a(new hc0.c(8, eVar, fValueOf));
    }

    public abstract b0.k o();

    public final void p(com.mapbox.maps.d dVar) {
        ListenableFuture<Void> listenableFutureA;
        try {
            this.f96214m = o();
            if (j()) {
                s0 s0VarG = this.f96214m.b().g();
                c<l1> cVar = this.f96224w;
                s0 s0Var = cVar.f96232m;
                if (s0Var != null) {
                    cVar.o(s0Var);
                }
                cVar.f96232m = s0VarG;
                cVar.n(s0VarG, new iz1.g(cVar, 2));
                s0 s0VarM = this.f96214m.b().m();
                c<Integer> cVar2 = this.f96225x;
                s0 s0Var2 = cVar2.f96232m;
                if (s0Var2 != null) {
                    cVar2.o(s0Var2);
                }
                cVar2.f96232m = s0VarM;
                cVar2.n(s0VarM, new iz1.g(cVar2, 2));
                e<Boolean> eVar = this.f96227z;
                eVar.getClass();
                j0.u.a();
                k7.d<androidx.concurrent.futures.b.a<Void>, Boolean> dVar2 = eVar.f96233a;
                if (dVar2 != null) {
                    ListenableFuture<Void> listenableFutureG = g(dVar2.f103263b.booleanValue());
                    androidx.concurrent.futures.b.a<Void> aVar = eVar.f96233a.f103262a;
                    Objects.requireNonNull(aVar);
                    l0.j.g(listenableFutureG, aVar);
                    eVar.f96233a = null;
                }
                e<Float> eVar2 = this.A;
                eVar2.getClass();
                j0.u.a();
                k7.d<androidx.concurrent.futures.b.a<Void>, Float> dVar3 = eVar2.f96233a;
                if (dVar3 != null) {
                    Float f14 = dVar3.f103263b;
                    float fFloatValue = f14.floatValue();
                    j0.u.a();
                    if (j()) {
                        listenableFutureA = this.f96214m.a().a(fFloatValue);
                    } else {
                        j0.u.a();
                        listenableFutureA = androidx.concurrent.futures.b.a(new hc0.c(8, eVar2, f14));
                    }
                    androidx.concurrent.futures.b.a<Void> aVar2 = eVar2.f96233a.f103262a;
                    Objects.requireNonNull(aVar2);
                    l0.j.g(listenableFutureA, aVar2);
                    eVar2.f96233a = null;
                }
                e<Float> eVar3 = this.B;
                eVar3.getClass();
                j0.u.a();
                k7.d<androidx.concurrent.futures.b.a<Void>, Float> dVar4 = eVar3.f96233a;
                if (dVar4 != null) {
                    ListenableFuture<Void> listenableFutureN = n(dVar4.f103263b.floatValue());
                    androidx.concurrent.futures.b.a<Void> aVar3 = eVar3.f96233a.f103262a;
                    Objects.requireNonNull(aVar3);
                    l0.j.g(listenableFutureN, aVar3);
                    eVar3.f96233a = null;
                }
            }
        } catch (RuntimeException e4) {
            if (dVar != null) {
                dVar.run();
            }
            throw e4;
        }
    }

    public final void q() {
        if (k()) {
            this.f96215n.a(this.f96204c);
        }
        w0.a aVar = new w0.a();
        c(aVar);
        b0 b0Var = this.f96212k;
        w1 w1Var = aVar.f14085a;
        w1Var.X(m1.f5634j, b0Var);
        d2 d2Var = new d2(a2.T(w1Var));
        n1.s(d2Var);
        w0 w0Var = new w0(d2Var);
        this.f96204c = w0Var;
        w0.c cVar = this.f96217p;
        if (cVar != null) {
            w0Var.G(cVar);
        }
        j0.u.a();
        Integer numValueOf = Integer.valueOf(this.f96205d.f14015r);
        if (k()) {
            this.f96215n.a(this.f96205d);
        }
        int iH = this.f96205d.H();
        this.f96205d = e(numValueOf);
        j0.u.a();
        if (iH == 3) {
            Integer numB = this.f96202a.b();
            if (numB != null && numB.intValue() != 0) {
                vb.h.s("Not a front camera despite setting FLASH_MODE_SCREEN");
                return;
            }
            l1.a aVarH = h();
            l0 l0Var = this.f96205d;
            if (aVarH == null) {
                a aVar2 = F;
                l0Var.getClass();
                m0.h.f115497e.getClass();
                m0.h hVar = new m0.h(aVar2, null);
                l0Var.f14020w = hVar;
                l0Var.d().k(hVar);
            } else {
                l0.j jVar = aVarH.f108046b;
                l0Var.getClass();
                m0.h.f115497e.getClass();
                m0.h hVar2 = new m0.h(jVar, null);
                l0Var.f14020w = hVar2;
                l0Var.d().k(hVar2);
                aVarH.f108045a.name();
            }
        }
        l0 l0Var2 = this.f96205d;
        l0Var2.getClass();
        if (iH != 0 && iH != 1 && iH != 2) {
            if (iH != 3) {
                vb.h.s(am.j.h(iH, "Invalid flash mode: "));
                return;
            }
            if (l0Var2.f14020w.f115498a == null) {
                vb.h.s("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return;
            } else if (l0Var2.c() != null) {
                androidx.camera.core.impl.l0 l0VarC = l0Var2.c();
                if ((l0VarC != null ? l0VarC.b().b() : -1) != 0) {
                    vb.h.s("Not a front camera despite setting FLASH_MODE_SCREEN");
                    return;
                }
            }
        }
        synchronized (l0Var2.f14016s) {
            l0Var2.f14018u = iH;
            l0Var2.L();
        }
        Integer num = (Integer) ((androidx.camera.core.impl.k1) this.f96208g.f13969h).f(androidx.camera.core.impl.k1.O, 0);
        num.intValue();
        r(num, Integer.valueOf(this.f96208g.G()), Integer.valueOf(this.f96208g.H()));
        if (k()) {
            this.f96215n.a(this.f96209h);
        }
        this.f96209h = f();
    }

    public final void r(Integer num, Integer num2, Integer num3) {
        y0.b bVar;
        j0.u.a();
        if (k()) {
            this.f96215n.a(this.f96208g);
        }
        g0 g0VarD = d(num, num2, num3);
        this.f96208g = g0VarD;
        Executor executor = this.f96206e;
        if (executor == null || (bVar = this.f96207f) == null) {
            return;
        }
        g0VarD.J(executor, bVar);
    }

    public b(Context context) {
        ListenableFuture listenableFutureF;
        x0.f.f188230b.getClass();
        context.getClass();
        x0.d dVar = x0.f.f188231c.f188232a;
        dVar.getClass();
        synchronized (dVar.f188213a) {
            listenableFutureF = dVar.f188214b;
            if (listenableFutureF == null) {
                b0.x xVar = new b0.x(context, null);
                l0.b bVarJ = l0.j.j(l0.d.a(dVar.f188215c), new t0(new vu1.b(xVar, 24), 22), k0.b.a());
                dVar.f188214b = bVarJ;
                l0.j.a(bVarJ, new x0.c(dVar, xVar, context), k0.b.a());
                listenableFutureF = l0.j.f(bVarJ);
            }
        }
        wr.g gVar = new wr.g(new wy2.c(20));
        k0.c cVarA = k0.b.a();
        l0.j.a aVar = l0.j.f107810a;
        l0.b bVarJ2 = l0.j.j(listenableFutureF, new l0.i(gVar), cVarA);
        e5 e5Var = new e5(28);
        this(context, l0.j.j(bVarJ2, new l0.i(e5Var), k0.b.a()));
    }
}
