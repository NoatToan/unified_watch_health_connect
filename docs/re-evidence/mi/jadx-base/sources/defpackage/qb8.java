package defpackage;

import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class qb8<R> implements bs5.b<R>, u69.f {
    public static final c z = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f31310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ado f31311b;
    public final ub8.a c;
    public final Pools.Pool<qb8<?>> d;
    public final c e;
    public final rb8 f;
    public final a0b g;
    public final a0b h;
    public final a0b i;
    public final a0b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f31312k;
    public pzd l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public kqk<?> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DataSource f31313r;
    public boolean s;
    public GlideException t;
    public boolean u;
    public ub8<?> v;
    public bs5<R> w;
    public volatile boolean x;
    public boolean y;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rqk f31314a;

        public a(rqk rqkVar) {
            this.f31314a = rqkVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f31314a.h()) {
                synchronized (qb8.this) {
                    try {
                        if (qb8.this.f31310a.f(this.f31314a)) {
                            qb8.this.f(this.f31314a);
                        }
                        qb8.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rqk f31316a;

        public b(rqk rqkVar) {
            this.f31316a = rqkVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f31316a.h()) {
                synchronized (qb8.this) {
                    try {
                        if (qb8.this.f31310a.f(this.f31316a)) {
                            qb8.this.v.b();
                            qb8.this.g(this.f31316a);
                            qb8.this.r(this.f31316a);
                        }
                        qb8.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @VisibleForTesting
    public static class c {
        public <R> ub8<R> a(kqk<R> kqkVar, boolean z, pzd pzdVar, ub8.a aVar) {
            return new ub8<>(kqkVar, z, true, pzdVar, aVar);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rqk f31318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f31319b;

        public d(rqk rqkVar, Executor executor) {
            this.f31318a = rqkVar;
            this.f31319b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f31318a.equals(((d) obj).f31318a);
            }
            return false;
        }

        public int hashCode() {
            return this.f31318a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f31320a;

        public e() {
            this(new ArrayList(2));
        }

        public static d h(rqk rqkVar) {
            return new d(rqkVar, cg8.a());
        }

        public void clear() {
            this.f31320a.clear();
        }

        public void e(rqk rqkVar, Executor executor) {
            this.f31320a.add(new d(rqkVar, executor));
        }

        public boolean f(rqk rqkVar) {
            return this.f31320a.contains(h(rqkVar));
        }

        public e g() {
            return new e(new ArrayList(this.f31320a));
        }

        public void i(rqk rqkVar) {
            this.f31320a.remove(h(rqkVar));
        }

        public boolean isEmpty() {
            return this.f31320a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f31320a.iterator();
        }

        public int size() {
            return this.f31320a.size();
        }

        public e(List<d> list) {
            this.f31320a = list;
        }
    }

    public qb8(a0b a0bVar, a0b a0bVar2, a0b a0bVar3, a0b a0bVar4, rb8 rb8Var, ub8.a aVar, Pools.Pool<qb8<?>> pool) {
        this(a0bVar, a0bVar2, a0bVar3, a0bVar4, rb8Var, aVar, pool, z);
    }

    private synchronized void q() {
        if (this.l == null) {
            throw new IllegalArgumentException();
        }
        this.f31310a.clear();
        this.l = null;
        this.v = null;
        this.q = null;
        this.u = false;
        this.x = false;
        this.s = false;
        this.y = false;
        this.w.C(false);
        this.w = null;
        this.t = null;
        this.f31313r = null;
        this.d.release(this);
    }

    public synchronized void a(rqk rqkVar, Executor executor) {
        try {
            this.f31311b.c();
            this.f31310a.e(rqkVar, executor);
            if (this.s) {
                k(1);
                executor.execute(new b(rqkVar));
            } else if (this.u) {
                k(1);
                executor.execute(new a(rqkVar));
            } else {
                a6i.a(!this.x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // bs5.b
    public void b(GlideException glideException) {
        synchronized (this) {
            this.t = glideException;
        }
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bs5.b
    public void c(kqk<R> kqkVar, DataSource dataSource, boolean z2) {
        synchronized (this) {
            this.q = kqkVar;
            this.f31313r = dataSource;
            this.y = z2;
        }
        o();
    }

    @Override // bs5.b
    public void d(bs5<?> bs5Var) {
        j().execute(bs5Var);
    }

    @Override // u69.f
    public ado e() {
        return this.f31311b;
    }

    @GuardedBy("this")
    public void f(rqk rqkVar) {
        try {
            rqkVar.b(this.t);
        } catch (Throwable th) {
            throw new ab3(th);
        }
    }

    @GuardedBy("this")
    public void g(rqk rqkVar) {
        try {
            rqkVar.c(this.v, this.f31313r, this.y);
        } catch (Throwable th) {
            throw new ab3(th);
        }
    }

    public void h() {
        if (m()) {
            return;
        }
        this.x = true;
        this.w.a();
        this.f.c(this, this.l);
    }

    public void i() {
        ub8<?> ub8Var;
        synchronized (this) {
            try {
                this.f31311b.c();
                a6i.a(m(), "Not yet complete!");
                int iDecrementAndGet = this.f31312k.decrementAndGet();
                a6i.a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    ub8Var = this.v;
                    q();
                } else {
                    ub8Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ub8Var != null) {
            ub8Var.e();
        }
    }

    public final a0b j() {
        if (this.n) {
            return this.i;
        }
        return this.o ? this.j : this.h;
    }

    public synchronized void k(int i) {
        ub8<?> ub8Var;
        a6i.a(m(), "Not yet complete!");
        if (this.f31312k.getAndAdd(i) == 0 && (ub8Var = this.v) != null) {
            ub8Var.b();
        }
    }

    @VisibleForTesting
    public synchronized qb8<R> l(pzd pzdVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.l = pzdVar;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        return this;
    }

    public final boolean m() {
        return this.u || this.s || this.x;
    }

    public void n() {
        synchronized (this) {
            try {
                this.f31311b.c();
                if (this.x) {
                    q();
                    return;
                }
                if (this.f31310a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.u = true;
                pzd pzdVar = this.l;
                e eVarG = this.f31310a.g();
                k(eVarG.size() + 1);
                this.f.b(this, pzdVar, null);
                for (d dVar : eVarG) {
                    dVar.f31319b.execute(new a(dVar.f31318a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void o() {
        synchronized (this) {
            try {
                this.f31311b.c();
                if (this.x) {
                    this.q.recycle();
                    q();
                    return;
                }
                if (this.f31310a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.v = this.e.a(this.q, this.m, this.l, this.c);
                this.s = true;
                e eVarG = this.f31310a.g();
                k(eVarG.size() + 1);
                this.f.b(this, this.l, this.v);
                for (d dVar : eVarG) {
                    dVar.f31319b.execute(new b(dVar.f31318a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean p() {
        return this.p;
    }

    public synchronized void r(rqk rqkVar) {
        try {
            this.f31311b.c();
            this.f31310a.i(rqkVar);
            if (this.f31310a.isEmpty()) {
                h();
                if (this.s || this.u) {
                    if (this.f31312k.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(bs5<R> bs5Var) {
        try {
            this.w = bs5Var;
            (bs5Var.J() ? this.g : j()).execute(bs5Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public qb8(a0b a0bVar, a0b a0bVar2, a0b a0bVar3, a0b a0bVar4, rb8 rb8Var, ub8.a aVar, Pools.Pool<qb8<?>> pool, c cVar) {
        this.f31310a = new e();
        this.f31311b = ado.a();
        this.f31312k = new AtomicInteger();
        this.g = a0bVar;
        this.h = a0bVar2;
        this.i = a0bVar3;
        this.j = a0bVar4;
        this.f = rb8Var;
        this.c = aVar;
        this.d = pool;
        this.e = cVar;
    }
}
