package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f8009k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.b<z0<? super T>, s0<T>.d> f8011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f8014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f8015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f8019j;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (s0.this.f8010a) {
                obj = s0.this.f8015f;
                s0.this.f8015f = s0.f8009k;
            }
            s0.this.m(obj);
        }
    }

    public class b extends s0<T>.d {
        public b(s0 s0Var, z0<? super T> z0Var) {
            super(z0Var);
        }

        @Override // androidx.lifecycle.s0.d
        public final boolean d() {
            return true;
        }
    }

    public class c extends s0<T>.d implements k0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n0 f8021e;

        public c(n0 n0Var, z0<? super T> z0Var) {
            super(z0Var);
            this.f8021e = n0Var;
        }

        @Override // androidx.lifecycle.s0.d
        public final void b() {
            this.f8021e.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.s0.d
        public final boolean c(n0 n0Var) {
            return this.f8021e == n0Var;
        }

        @Override // androidx.lifecycle.s0.d
        public final boolean d() {
            return this.f8021e.getLifecycle().b().a(b0.b.STARTED);
        }

        @Override // androidx.lifecycle.k0
        public final void onStateChanged(n0 n0Var, b0.a aVar) {
            n0 n0Var2 = this.f8021e;
            b0.b bVarB = n0Var2.getLifecycle().b();
            if (bVarB == b0.b.DESTROYED) {
                s0.this.k(this.f8023a);
                return;
            }
            b0.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = n0Var2.getLifecycle().b();
            }
        }
    }

    public abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z0<? super T> f8023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8025c = -1;

        public d(z0<? super T> z0Var) {
            this.f8023a = z0Var;
        }

        public final void a(boolean z14) {
            if (z14 == this.f8024b) {
                return;
            }
            this.f8024b = z14;
            int i14 = z14 ? 1 : -1;
            s0 s0Var = s0.this;
            int i15 = s0Var.f8012c;
            s0Var.f8012c = i14 + i15;
            if (!s0Var.f8013d) {
                s0Var.f8013d = true;
                while (true) {
                    try {
                        int i16 = s0Var.f8012c;
                        if (i15 == i16) {
                            break;
                        }
                        boolean z15 = i15 == 0 && i16 > 0;
                        boolean z16 = i15 > 0 && i16 == 0;
                        if (z15) {
                            s0Var.h();
                        } else if (z16) {
                            s0Var.i();
                        }
                        i15 = i16;
                    } catch (Throwable th3) {
                        s0Var.f8013d = false;
                        throw th3;
                    }
                }
                s0Var.f8013d = false;
            }
            if (this.f8024b) {
                s0Var.c(this);
            }
        }

        public void b() {
        }

        public boolean c(n0 n0Var) {
            return false;
        }

        public abstract boolean d();
    }

    public s0() {
        this.f8010a = new Object();
        this.f8011b = new o.b<>();
        this.f8012c = 0;
        Object obj = f8009k;
        this.f8015f = obj;
        this.f8019j = new a();
        this.f8014e = obj;
        this.f8016g = -1;
    }

    public static void a(String str) {
        if (n.a.a().f122013a.a()) {
            return;
        }
        vb.h.z(am.j.m("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(s0<T>.d dVar) {
        if (dVar.f8024b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i14 = dVar.f8025c;
            int i15 = this.f8016g;
            if (i14 >= i15) {
                return;
            }
            dVar.f8025c = i15;
            dVar.f8023a.onChanged((Object) this.f8014e);
        }
    }

    public final void c(s0<T>.d dVar) {
        if (this.f8017h) {
            this.f8018i = true;
            return;
        }
        this.f8017h = true;
        do {
            this.f8018i = false;
            if (dVar != null) {
                b(dVar);
                dVar = null;
            } else {
                o.b<z0<? super T>, s0<T>.d> bVar = this.f8011b;
                bVar.getClass();
                o.b.d dVar2 = new o.b.d();
                bVar.f128469c.put(dVar2, Boolean.FALSE);
                while (dVar2.hasNext()) {
                    b((d) ((Map.Entry) dVar2.next()).getValue());
                    if (this.f8018i) {
                        break;
                    }
                }
            }
        } while (this.f8018i);
        this.f8017h = false;
    }

    public T d() {
        T t7 = (T) this.f8014e;
        if (t7 != f8009k) {
            return t7;
        }
        return null;
    }

    public final boolean e() {
        return this.f8012c > 0;
    }

    public void f(n0 n0Var, z0<? super T> z0Var) {
        s0<T>.d dVar;
        a("observe");
        if (n0Var.getLifecycle().b() == b0.b.DESTROYED) {
            return;
        }
        c cVar = new c(n0Var, z0Var);
        o.b<z0<? super T>, s0<T>.d> bVar = this.f8011b;
        o.b.c<z0<? super T>, s0<T>.d> cVarA = bVar.a(z0Var);
        if (cVarA != null) {
            dVar = cVarA.f128472b;
        } else {
            o.b.c<K, V> cVar2 = new o.b.c<>(z0Var, cVar);
            bVar.f128470d++;
            o.b.c<z0<? super T>, s0<T>.d> cVar3 = bVar.f128468b;
            if (cVar3 == 0) {
                bVar.f128467a = cVar2;
                bVar.f128468b = cVar2;
            } else {
                cVar3.f128473c = cVar2;
                cVar2.f128474d = cVar3;
                bVar.f128468b = cVar2;
            }
            dVar = null;
        }
        s0<T>.d dVar2 = dVar;
        if (dVar2 != null && !dVar2.c(n0Var)) {
            vb.h.s("Cannot add the same observer with different lifecycles");
        } else {
            if (dVar2 != null) {
                return;
            }
            n0Var.getLifecycle().a(cVar);
        }
    }

    public void g(z0<? super T> z0Var) {
        s0<T>.d dVar;
        a("observeForever");
        b bVar = new b(this, z0Var);
        o.b<z0<? super T>, s0<T>.d> bVar2 = this.f8011b;
        o.b.c<z0<? super T>, s0<T>.d> cVarA = bVar2.a(z0Var);
        if (cVarA != null) {
            dVar = cVarA.f128472b;
        } else {
            o.b.c<K, V> cVar = new o.b.c<>(z0Var, bVar);
            bVar2.f128470d++;
            o.b.c<z0<? super T>, s0<T>.d> cVar2 = bVar2.f128468b;
            if (cVar2 == 0) {
                bVar2.f128467a = cVar;
                bVar2.f128468b = cVar;
            } else {
                cVar2.f128473c = cVar;
                cVar.f128474d = cVar2;
                bVar2.f128468b = cVar;
            }
            dVar = null;
        }
        s0<T>.d dVar2 = dVar;
        if (dVar2 instanceof c) {
            vb.h.s("Cannot add the same observer with different lifecycles");
        } else {
            if (dVar2 != null) {
                return;
            }
            bVar.a(true);
        }
    }

    public void h() {
    }

    public void i() {
    }

    public void j(T t7) {
        boolean z14;
        synchronized (this.f8010a) {
            z14 = this.f8015f == f8009k;
            this.f8015f = t7;
        }
        if (z14) {
            n.a.a().b(this.f8019j);
        }
    }

    public void k(z0<? super T> z0Var) {
        a("removeObserver");
        s0<T>.d dVarB = this.f8011b.b(z0Var);
        if (dVarB == null) {
            return;
        }
        dVarB.b();
        dVarB.a(false);
    }

    public void l(n0 n0Var) {
        a("removeObservers");
        Iterator<Map.Entry<z0<? super T>, s0<T>.d>> it = this.f8011b.iterator();
        while (true) {
            o.b.e eVar = (o.b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            if (((d) entry.getValue()).c(n0Var)) {
                k((z0) entry.getKey());
            }
        }
    }

    public void m(T t7) {
        a("setValue");
        this.f8016g++;
        this.f8014e = t7;
        c(null);
    }

    public s0(T t7) {
        this.f8010a = new Object();
        this.f8011b = new o.b<>();
        this.f8012c = 0;
        this.f8015f = f8009k;
        this.f8019j = new a();
        this.f8014e = t7;
        this.f8016g = 0;
    }
}
