package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import defpackage.fxp;
import defpackage.r61;
import defpackage.rk1;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends com.google.android.exoplayer2.source.c<e> {
    public static final com.google.android.exoplayer2.m v = new com.google.android.exoplayer2.m.c().m(Uri.EMPTY).a();

    @GuardedBy("this")
    public final List<e> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("this")
    public final Set<C0189d> f8090k;

    @GuardedBy("this")
    public Handler l;
    public final List<e> m;
    public final IdentityHashMap<j, e> n;
    public final Map<Object, e> o;
    public final Set<e> p;
    public final boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f8091r;
    public boolean s;
    public Set<C0189d> t;
    public t u;

    public static final class b extends com.google.android.exoplayer2.a {
        public final int f;
        public final int g;
        public final int[] h;
        public final int[] i;
        public final com.google.android.exoplayer2.v[] j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Object[] f8092k;
        public final HashMap<Object, Integer> l;

        public b(Collection<e> collection, t tVar, boolean z) {
            super(z, tVar);
            int size = collection.size();
            this.h = new int[size];
            this.i = new int[size];
            this.j = new com.google.android.exoplayer2.v[size];
            this.f8092k = new Object[size];
            this.l = new HashMap<>();
            int iP = 0;
            int i = 0;
            int i2 = 0;
            for (e eVar : collection) {
                this.j[i2] = eVar.f8095a.S();
                this.i[i2] = iP;
                this.h[i2] = i;
                iP += this.j[i2].p();
                i += this.j[i2].i();
                Object[] objArr = this.f8092k;
                Object obj = eVar.f8096b;
                objArr[i2] = obj;
                this.l.put(obj, Integer.valueOf(i2));
                i2++;
            }
            this.f = iP;
            this.g = i;
        }

        @Override // com.google.android.exoplayer2.a
        public int A(int i) {
            return this.i[i];
        }

        @Override // com.google.android.exoplayer2.a
        public com.google.android.exoplayer2.v D(int i) {
            return this.j[i];
        }

        @Override // com.google.android.exoplayer2.v
        public int i() {
            return this.g;
        }

        @Override // com.google.android.exoplayer2.v
        public int p() {
            return this.f;
        }

        @Override // com.google.android.exoplayer2.a
        public int s(Object obj) {
            Integer num = this.l.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.google.android.exoplayer2.a
        public int t(int i) {
            return wlq.h(this.h, i + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.a
        public int u(int i) {
            return wlq.h(this.i, i + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.a
        public Object x(int i) {
            return this.f8092k[i];
        }

        @Override // com.google.android.exoplayer2.a
        public int z(int i) {
            return this.h[i];
        }
    }

    public static final class c extends com.google.android.exoplayer2.source.a {
        public c() {
        }

        @Override // com.google.android.exoplayer2.source.a
        public void B(fxp fxpVar) {
        }

        @Override // com.google.android.exoplayer2.source.a
        public void D() {
        }

        @Override // com.google.android.exoplayer2.source.k
        public com.google.android.exoplayer2.m c() {
            return d.v;
        }

        @Override // com.google.android.exoplayer2.source.k
        public j d(k.a aVar, r61 r61Var, long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.k
        public void f() {
        }

        @Override // com.google.android.exoplayer2.source.k
        public void j(j jVar) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.d$d, reason: collision with other inner class name */
    public static final class C0189d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f8093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f8094b;

        public C0189d(Handler handler, Runnable runnable) {
            this.f8093a = handler;
            this.f8094b = runnable;
        }

        public void a() {
            this.f8093a.post(this.f8094b);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f8095a;
        public int d;
        public int e;
        public boolean f;
        public final List<k.a> c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f8096b = new Object();

        public e(k kVar, boolean z) {
            this.f8095a = new i(kVar, z);
        }

        public void a(int i, int i2) {
            this.d = i;
            this.e = i2;
            this.f = false;
            this.c.clear();
        }
    }

    public static final class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f8098b;
        public final C0189d c;

        public f(int i, T t, C0189d c0189d) {
            this.f8097a = i;
            this.f8098b = t;
            this.c = c0189d;
        }
    }

    public d(k... kVarArr) {
        this(false, kVarArr);
    }

    public static Object Z(Object obj) {
        return com.google.android.exoplayer2.a.v(obj);
    }

    public static Object b0(Object obj) {
        return com.google.android.exoplayer2.a.w(obj);
    }

    public static Object c0(e eVar, Object obj) {
        return com.google.android.exoplayer2.a.y(eVar.f8096b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean f0(Message message) {
        int i = message.what;
        if (i == 0) {
            f fVar = (f) wlq.j(message.obj);
            this.u = this.u.g(fVar.f8097a, ((Collection) fVar.f8098b).size());
            S(fVar.f8097a, (Collection) fVar.f8098b);
            l0(fVar.c);
        } else if (i == 1) {
            f fVar2 = (f) wlq.j(message.obj);
            int i2 = fVar2.f8097a;
            int iIntValue = ((Integer) fVar2.f8098b).intValue();
            if (i2 == 0 && iIntValue == this.u.getLength()) {
                this.u = this.u.d();
            } else {
                this.u = this.u.f(i2, iIntValue);
            }
            for (int i3 = iIntValue - 1; i3 >= i2; i3--) {
                j0(i3);
            }
            l0(fVar2.c);
        } else if (i == 2) {
            f fVar3 = (f) wlq.j(message.obj);
            t tVar = this.u;
            int i4 = fVar3.f8097a;
            t tVarF = tVar.f(i4, i4 + 1);
            this.u = tVarF;
            this.u = tVarF.g(((Integer) fVar3.f8098b).intValue(), 1);
            h0(fVar3.f8097a, ((Integer) fVar3.f8098b).intValue());
            l0(fVar3.c);
        } else if (i == 3) {
            f fVar4 = (f) wlq.j(message.obj);
            this.u = (t) fVar4.f8098b;
            l0(fVar4.c);
        } else if (i == 4) {
            n0();
        } else {
            if (i != 5) {
                throw new IllegalStateException();
            }
            X((Set) wlq.j(message.obj));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public synchronized void B(fxp fxpVar) {
        try {
            super.B(fxpVar);
            this.l = new Handler(new Handler.Callback() { // from class: db4
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f15334a.f0(message);
                }
            });
            if (this.j.isEmpty()) {
                n0();
            } else {
                this.u = this.u.g(0, this.j.size());
                S(0, this.j);
                k0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public synchronized void D() {
        try {
            super.D();
            this.m.clear();
            this.p.clear();
            this.o.clear();
            this.u = this.u.d();
            Handler handler = this.l;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.l = null;
            }
            this.s = false;
            this.t.clear();
            X(this.f8090k);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void Q(int i, e eVar) {
        if (i > 0) {
            e eVar2 = this.m.get(i - 1);
            eVar.a(i, eVar2.e + eVar2.f8095a.S().p());
        } else {
            eVar.a(i, 0);
        }
        U(i, 1, eVar.f8095a.S().p());
        this.m.add(i, eVar);
        this.o.put(eVar.f8096b, eVar);
        M(eVar, eVar.f8095a);
        if (A() && this.n.isEmpty()) {
            this.p.add(eVar);
        } else {
            F(eVar);
        }
    }

    public synchronized void R(Collection<k> collection) {
        T(this.j.size(), collection, null, null);
    }

    public final void S(int i, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            Q(i, it.next());
            i++;
        }
    }

    @GuardedBy("this")
    public final void T(int i, Collection<k> collection, Handler handler, Runnable runnable) {
        rk1.a((handler == null) == (runnable == null));
        Handler handler2 = this.l;
        Iterator<k> it = collection.iterator();
        while (it.hasNext()) {
            rk1.e(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<k> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next(), this.f8091r));
        }
        this.j.addAll(i, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new f(i, arrayList, V(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    public final void U(int i, int i2, int i3) {
        while (i < this.m.size()) {
            e eVar = this.m.get(i);
            eVar.d += i2;
            eVar.e += i3;
            i++;
        }
    }

    @GuardedBy("this")
    public final C0189d V(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C0189d c0189d = new C0189d(handler, runnable);
        this.f8090k.add(c0189d);
        return c0189d;
    }

    public final void W() {
        Iterator<e> it = this.p.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.c.isEmpty()) {
                F(next);
                it.remove();
            }
        }
    }

    public final synchronized void X(Set<C0189d> set) {
        try {
            Iterator<C0189d> it = set.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f8090k.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void Y(e eVar) {
        this.p.add(eVar);
        G(eVar);
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public k.a H(e eVar, k.a aVar) {
        for (int i = 0; i < eVar.c.size(); i++) {
            if (eVar.c.get(i).d == aVar.d) {
                return aVar.c(c0(eVar, aVar.f27977a));
            }
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.k
    public com.google.android.exoplayer2.m c() {
        return v;
    }

    @Override // com.google.android.exoplayer2.source.k
    public j d(k.a aVar, r61 r61Var, long j) {
        Object objB0 = b0(aVar.f27977a);
        k.a aVarC = aVar.c(Z(aVar.f27977a));
        e eVar = this.o.get(objB0);
        if (eVar == null) {
            eVar = new e(new c(), this.f8091r);
            eVar.f = true;
            M(eVar, eVar.f8095a);
        }
        Y(eVar);
        eVar.c.add(aVarC);
        h hVarD = eVar.f8095a.d(aVarC, r61Var, j);
        this.n.put(hVarD, eVar);
        W();
        return hVarD;
    }

    public final Handler d0() {
        return (Handler) rk1.e(this.l);
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int J(e eVar, int i) {
        return i + eVar.e;
    }

    @Override // com.google.android.exoplayer2.source.k
    public synchronized com.google.android.exoplayer2.v g() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new b(this.j, this.u.getLength() != this.j.size() ? this.u.d().g(0, this.j.size()) : this.u, this.q);
    }

    public final void g0(e eVar) {
        if (eVar.f && eVar.c.isEmpty()) {
            this.p.remove(eVar);
            N(eVar);
        }
    }

    public final void h0(int i, int i2) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int iP = this.m.get(iMin).e;
        List<e> list = this.m;
        list.add(i2, list.remove(i));
        while (iMin <= iMax) {
            e eVar = this.m.get(iMin);
            eVar.d = iMin;
            eVar.e = iP;
            iP += eVar.f8095a.S().p();
            iMin++;
        }
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void K(e eVar, k kVar, com.google.android.exoplayer2.v vVar) {
        m0(eVar, vVar);
    }

    @Override // com.google.android.exoplayer2.source.k
    public void j(j jVar) {
        e eVar = (e) rk1.e(this.n.remove(jVar));
        eVar.f8095a.j(jVar);
        eVar.c.remove(((h) jVar).f8134a);
        if (!this.n.isEmpty()) {
            W();
        }
        g0(eVar);
    }

    public final void j0(int i) {
        e eVarRemove = this.m.remove(i);
        this.o.remove(eVarRemove.f8096b);
        U(i, -1, -eVarRemove.f8095a.S().p());
        eVarRemove.f = true;
        g0(eVarRemove);
    }

    public final void k0() {
        l0(null);
    }

    public final void l0(C0189d c0189d) {
        if (!this.s) {
            d0().obtainMessage(4).sendToTarget();
            this.s = true;
        }
        if (c0189d != null) {
            this.t.add(c0189d);
        }
    }

    public final void m0(e eVar, com.google.android.exoplayer2.v vVar) {
        if (eVar.d + 1 < this.m.size()) {
            int iP = vVar.p() - (this.m.get(eVar.d + 1).e - eVar.e);
            if (iP != 0) {
                U(eVar.d + 1, 0, iP);
            }
        }
        k0();
    }

    public final void n0() {
        this.s = false;
        Set<C0189d> set = this.t;
        this.t = new HashSet();
        C(new b(this.m, this.u, this.q));
        d0().obtainMessage(5, set).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.k
    public boolean r() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void y() {
        super.y();
        this.p.clear();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void z() {
    }

    public d(boolean z, k... kVarArr) {
        this(z, new t.a(0), kVarArr);
    }

    public d(boolean z, t tVar, k... kVarArr) {
        this(z, false, tVar, kVarArr);
    }

    public d(boolean z, boolean z2, t tVar, k... kVarArr) {
        for (k kVar : kVarArr) {
            rk1.e(kVar);
        }
        this.u = tVar.getLength() > 0 ? tVar.d() : tVar;
        this.n = new IdentityHashMap<>();
        this.o = new HashMap();
        this.j = new ArrayList();
        this.m = new ArrayList();
        this.t = new HashSet();
        this.f8090k = new HashSet();
        this.p = new HashSet();
        this.q = z;
        this.f8091r = z2;
        R(Arrays.asList(kVarArr));
    }
}
