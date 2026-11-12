package x0;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.a1;
import androidx.lifecycle.b0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import b0.q;
import b0.s0;
import com.google.auto.value.AutoValue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import k7.h;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f188221f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static e f188222g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f188223a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f188224b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f188225c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<n0> f188226d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c0.a f188227e;

    @AutoValue
    public static abstract class a {
        public abstract q a();

        public abstract int b();
    }

    public static class b implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f188228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n0 f188229b;

        public b(n0 n0Var, e eVar) {
            this.f188229b = n0Var;
            this.f188228a = eVar;
        }

        @a1(b0.a.ON_DESTROY)
        public void onDestroy(n0 n0Var) {
            this.f188228a.l(n0Var);
        }

        @a1(b0.a.ON_START)
        public void onStart(n0 n0Var) {
            this.f188228a.f(n0Var);
        }

        @a1(b0.a.ON_STOP)
        public void onStop(n0 n0Var) {
            this.f188228a.g(n0Var);
        }
    }

    public final void a(x0.b bVar, s0 s0Var, c0.a aVar) {
        boolean z14;
        synchronized (this.f188223a) {
            try {
                h.a(!s0Var.f14129f.isEmpty());
                this.f188227e = aVar;
                n0 n0VarK = bVar.k();
                b bVarC = c(n0VarK);
                if (bVarC == null) {
                    return;
                }
                Set set = (Set) this.f188225c.get(bVarC);
                c0.a aVar2 = this.f188227e;
                if (aVar2 == null || ((z.a) aVar2).b() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        x0.b bVar2 = (x0.b) this.f188224b.get((a) it.next());
                        bVar2.getClass();
                        if (!bVar2.equals(bVar) && !bVar2.l().isEmpty()) {
                            synchronized (bVar2.f188205a) {
                                s0 s0Var2 = bVar2.f188209e;
                                z14 = s0Var2 == null ? false : s0Var2.f14047i;
                            }
                            if (z14 || s0Var.f14047i) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            bVar2.r();
                        }
                    }
                }
                try {
                    bVar.d(s0Var);
                    if (n0VarK.getF158016a().getF7973d().a(b0.b.STARTED)) {
                        f(n0VarK);
                    }
                } catch (CameraUseCaseAdapter.CameraException e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final x0.b b(n0 n0Var, CameraUseCaseAdapter cameraUseCaseAdapter) {
        synchronized (this.f188223a) {
            try {
                h.b(this.f188224b.get(new x0.a(System.identityHashCode(n0Var), cameraUseCaseAdapter.f5886d)) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                x0.b bVar = new x0.b(n0Var, cameraUseCaseAdapter);
                if (((ArrayList) cameraUseCaseAdapter.w()).isEmpty()) {
                    bVar.m();
                }
                if (n0Var.getF158016a().getF7973d() == b0.b.DESTROYED) {
                    return bVar;
                }
                e(bVar);
                return bVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final b c(n0 n0Var) {
        synchronized (this.f188223a) {
            try {
                for (b bVar : this.f188225c.keySet()) {
                    if (n0Var.equals(bVar.f188229b)) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean d(n0 n0Var) {
        synchronized (this.f188223a) {
            try {
                b bVarC = c(n0Var);
                if (bVarC == null) {
                    return false;
                }
                Iterator it = ((Set) this.f188225c.get(bVarC)).iterator();
                while (it.hasNext()) {
                    x0.b bVar = (x0.b) this.f188224b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.l().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e(x0.b bVar) {
        synchronized (this.f188223a) {
            try {
                n0 n0VarK = bVar.k();
                x0.a aVar = new x0.a(System.identityHashCode(n0VarK), bVar.f188207c.f5886d);
                b bVarC = c(n0VarK);
                Set hashSet = bVarC != null ? (Set) this.f188225c.get(bVarC) : new HashSet();
                hashSet.add(aVar);
                this.f188224b.put(aVar, bVar);
                if (bVarC == null) {
                    b bVar2 = new b(n0VarK, this);
                    this.f188225c.put(bVar2, hashSet);
                    n0VarK.getF158016a().a(bVar2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void f(n0 n0Var) {
        synchronized (this.f188223a) {
            try {
                if (d(n0Var)) {
                    if (this.f188226d.isEmpty()) {
                        this.f188226d.push(n0Var);
                    } else {
                        c0.a aVar = this.f188227e;
                        if (aVar == null || ((z.a) aVar).b() != 2) {
                            n0 n0VarPeek = this.f188226d.peek();
                            if (!n0Var.equals(n0VarPeek)) {
                                h(n0VarPeek);
                                this.f188226d.remove(n0Var);
                                this.f188226d.push(n0Var);
                            }
                        }
                    }
                    m(n0Var);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g(n0 n0Var) {
        synchronized (this.f188223a) {
            try {
                this.f188226d.remove(n0Var);
                h(n0Var);
                if (!this.f188226d.isEmpty()) {
                    m(this.f188226d.peek());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void h(n0 n0Var) {
        synchronized (this.f188223a) {
            try {
                b bVarC = c(n0Var);
                if (bVarC == null) {
                    return;
                }
                Iterator it = ((Set) this.f188225c.get(bVarC)).iterator();
                while (it.hasNext()) {
                    x0.b bVar = (x0.b) this.f188224b.get((a) it.next());
                    bVar.getClass();
                    bVar.m();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void i(s0 s0Var, HashSet hashSet) {
        Set<a> setKeySet = hashSet;
        synchronized (this.f188223a) {
            if (hashSet == null) {
                try {
                    setKeySet = this.f188224b.keySet();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            for (a aVar : setKeySet) {
                if (this.f188224b.containsKey(aVar)) {
                    x0.b bVar = (x0.b) this.f188224b.get(aVar);
                    boolean zIsEmpty = bVar.l().isEmpty();
                    bVar.q(s0Var);
                    if (!zIsEmpty && bVar.l().isEmpty()) {
                        g(bVar.k());
                    }
                }
            }
        }
    }

    public final void j(HashSet hashSet) {
        Set setKeySet = hashSet;
        synchronized (this.f188223a) {
            if (hashSet == null) {
                try {
                    setKeySet = this.f188224b.keySet();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                x0.b bVar = (x0.b) this.f188224b.get((a) it.next());
                if (bVar != null) {
                    bVar.r();
                    g(bVar.k());
                }
            }
        }
    }

    public final void k(x0.b bVar) {
        synchronized (this.f188223a) {
            try {
                n0 n0VarK = bVar.k();
                x0.a aVar = new x0.a(System.identityHashCode(n0VarK), bVar.f188207c.f5886d);
                this.f188224b.remove(aVar);
                HashSet hashSet = new HashSet();
                for (b bVar2 : this.f188225c.keySet()) {
                    if (n0VarK.equals(bVar2.f188229b)) {
                        Set set = (Set) this.f188225c.get(bVar2);
                        set.remove(aVar);
                        if (set.isEmpty()) {
                            hashSet.add(bVar2.f188229b);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l((n0) it.next());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l(n0 n0Var) {
        synchronized (this.f188223a) {
            try {
                b bVarC = c(n0Var);
                if (bVarC == null) {
                    return;
                }
                g(n0Var);
                Iterator it = ((Set) this.f188225c.get(bVarC)).iterator();
                while (it.hasNext()) {
                    this.f188224b.remove((a) it.next());
                }
                this.f188225c.remove(bVarC);
                bVarC.f188229b.getF158016a().d(bVarC);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void m(n0 n0Var) {
        synchronized (this.f188223a) {
            try {
                Iterator it = ((Set) this.f188225c.get(c(n0Var))).iterator();
                while (it.hasNext()) {
                    x0.b bVar = (x0.b) this.f188224b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.l().isEmpty()) {
                        bVar.s();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
