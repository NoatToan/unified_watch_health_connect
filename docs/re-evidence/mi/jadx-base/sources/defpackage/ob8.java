package defpackage;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class ob8 implements rb8, fpf.a, ub8.a {
    public static final boolean i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mrd f28955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tb8 f28956b;
    public final fpf c;
    public final b d;
    public final erk e;
    public final c f;
    public final a g;
    public final qf0 h;

    @VisibleForTesting
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bs5.e f28957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Pools.Pool<bs5<?>> f28958b = u69.d(150, new C1060a());
        public int c;

        /* JADX INFO: renamed from: ob8$a$a, reason: collision with other inner class name */
        public class C1060a implements u69.d<bs5<?>> {
            public C1060a() {
            }

            @Override // u69.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public bs5<?> create() {
                a aVar = a.this;
                return new bs5<>(aVar.f28957a, aVar.f28958b);
            }
        }

        public a(bs5.e eVar) {
            this.f28957a = eVar;
        }

        public <R> bs5<R> a(com.bumptech.glide.c cVar, Object obj, sb8 sb8Var, pzd pzdVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, jy6 jy6Var, Map<Class<?>, lyp<?>> map, boolean z, boolean z2, boolean z3, cch cchVar, bs5.b<R> bVar) {
            bs5 bs5Var = (bs5) a6i.d(this.f28958b.acquire());
            int i3 = this.c;
            this.c = i3 + 1;
            return bs5Var.r(cVar, obj, sb8Var, pzdVar, i, i2, cls, cls2, priority, jy6Var, map, z, z2, z3, cchVar, bVar, i3);
        }
    }

    @VisibleForTesting
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0b f28960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0b f28961b;
        public final a0b c;
        public final a0b d;
        public final rb8 e;
        public final ub8.a f;
        public final Pools.Pool<qb8<?>> g = u69.d(150, new a());

        public class a implements u69.d<qb8<?>> {
            public a() {
            }

            @Override // u69.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public qb8<?> create() {
                b bVar = b.this;
                return new qb8<>(bVar.f28960a, bVar.f28961b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(a0b a0bVar, a0b a0bVar2, a0b a0bVar3, a0b a0bVar4, rb8 rb8Var, ub8.a aVar) {
            this.f28960a = a0bVar;
            this.f28961b = a0bVar2;
            this.c = a0bVar3;
            this.d = a0bVar4;
            this.e = rb8Var;
            this.f = aVar;
        }

        public <R> qb8<R> a(pzd pzdVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((qb8) a6i.d(this.g.acquire())).l(pzdVar, z, z2, z3, z4);
        }
    }

    public static class c implements bs5.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fy6.a f28963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile fy6 f28964b;

        public c(fy6.a aVar) {
            this.f28963a = aVar;
        }

        @Override // bs5.e
        public fy6 getDiskCache() {
            if (this.f28964b == null) {
                synchronized (this) {
                    try {
                        if (this.f28964b == null) {
                            this.f28964b = this.f28963a.build();
                        }
                        if (this.f28964b == null) {
                            this.f28964b = new gy6();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f28964b;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qb8<?> f28965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rqk f28966b;

        public d(rqk rqkVar, qb8<?> qb8Var) {
            this.f28966b = rqkVar;
            this.f28965a = qb8Var;
        }

        public void a() {
            synchronized (ob8.this) {
                this.f28965a.r(this.f28966b);
            }
        }
    }

    @VisibleForTesting
    public ob8(fpf fpfVar, fy6.a aVar, a0b a0bVar, a0b a0bVar2, a0b a0bVar3, a0b a0bVar4, mrd mrdVar, tb8 tb8Var, qf0 qf0Var, b bVar, a aVar2, erk erkVar, boolean z) {
        this.c = fpfVar;
        c cVar = new c(aVar);
        this.f = cVar;
        qf0 qf0Var2 = qf0Var == null ? new qf0(z) : qf0Var;
        this.h = qf0Var2;
        qf0Var2.f(this);
        this.f28956b = tb8Var == null ? new tb8() : tb8Var;
        this.f28955a = mrdVar == null ? new mrd() : mrdVar;
        this.d = bVar == null ? new b(a0bVar, a0bVar2, a0bVar3, a0bVar4, this, this) : bVar;
        this.g = aVar2 == null ? new a(cVar) : aVar2;
        this.e = erkVar == null ? new erk() : erkVar;
        fpfVar.c(this);
    }

    public static void k(String str, long j, pzd pzdVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(epe.a(j));
        sb.append("ms, key: ");
        sb.append(pzdVar);
    }

    @Override // ub8.a
    public void a(pzd pzdVar, ub8<?> ub8Var) {
        this.h.d(pzdVar);
        if (ub8Var.d()) {
            this.c.b(pzdVar, ub8Var);
        } else {
            this.e.a(ub8Var, false);
        }
    }

    @Override // defpackage.rb8
    public synchronized void b(qb8<?> qb8Var, pzd pzdVar, ub8<?> ub8Var) {
        if (ub8Var != null) {
            try {
                if (ub8Var.d()) {
                    this.h.a(pzdVar, ub8Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f28955a.d(pzdVar, qb8Var);
    }

    @Override // defpackage.rb8
    public synchronized void c(qb8<?> qb8Var, pzd pzdVar) {
        this.f28955a.d(pzdVar, qb8Var);
    }

    @Override // fpf.a
    public void d(kqk<?> kqkVar) {
        this.e.a(kqkVar, true);
    }

    public void e() {
        this.f.getDiskCache().clear();
    }

    public final ub8<?> f(pzd pzdVar) {
        kqk<?> kqkVarA = this.c.a(pzdVar);
        if (kqkVarA == null) {
            return null;
        }
        return kqkVarA instanceof ub8 ? (ub8) kqkVarA : new ub8<>(kqkVarA, true, true, pzdVar, this);
    }

    public <R> d g(com.bumptech.glide.c cVar, Object obj, pzd pzdVar, int i2, int i3, Class<?> cls, Class<R> cls2, Priority priority, jy6 jy6Var, Map<Class<?>, lyp<?>> map, boolean z, boolean z2, cch cchVar, boolean z3, boolean z4, boolean z5, boolean z6, rqk rqkVar, Executor executor) {
        long jB = i ? epe.b() : 0L;
        sb8 sb8VarA = this.f28956b.a(obj, pzdVar, i2, i3, map, cls, cls2, cchVar);
        synchronized (this) {
            try {
                ub8<?> ub8VarJ = j(sb8VarA, z3, jB);
                if (ub8VarJ == null) {
                    return m(cVar, obj, pzdVar, i2, i3, cls, cls2, priority, jy6Var, map, z, z2, cchVar, z3, z4, z5, z6, rqkVar, executor, sb8VarA, jB);
                }
                rqkVar.c(ub8VarJ, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ub8<?> h(pzd pzdVar) {
        ub8<?> ub8VarE = this.h.e(pzdVar);
        if (ub8VarE != null) {
            ub8VarE.b();
        }
        return ub8VarE;
    }

    public final ub8<?> i(pzd pzdVar) {
        ub8<?> ub8VarF = f(pzdVar);
        if (ub8VarF != null) {
            ub8VarF.b();
            this.h.a(pzdVar, ub8VarF);
        }
        return ub8VarF;
    }

    public final ub8<?> j(sb8 sb8Var, boolean z, long j) {
        if (!z) {
            return null;
        }
        ub8<?> ub8VarH = h(sb8Var);
        if (ub8VarH != null) {
            if (i) {
                k("Loaded resource from active resources", j, sb8Var);
            }
            return ub8VarH;
        }
        ub8<?> ub8VarI = i(sb8Var);
        if (ub8VarI == null) {
            return null;
        }
        if (i) {
            k("Loaded resource from cache", j, sb8Var);
        }
        return ub8VarI;
    }

    public void l(kqk<?> kqkVar) {
        if (!(kqkVar instanceof ub8)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((ub8) kqkVar).e();
    }

    public final <R> d m(com.bumptech.glide.c cVar, Object obj, pzd pzdVar, int i2, int i3, Class<?> cls, Class<R> cls2, Priority priority, jy6 jy6Var, Map<Class<?>, lyp<?>> map, boolean z, boolean z2, cch cchVar, boolean z3, boolean z4, boolean z5, boolean z6, rqk rqkVar, Executor executor, sb8 sb8Var, long j) {
        qb8<?> qb8VarA = this.f28955a.a(sb8Var, z6);
        if (qb8VarA != null) {
            qb8VarA.a(rqkVar, executor);
            if (i) {
                k("Added to existing load", j, sb8Var);
            }
            return new d(rqkVar, qb8VarA);
        }
        qb8<R> qb8VarA2 = this.d.a(sb8Var, z3, z4, z5, z6);
        bs5<R> bs5VarA = this.g.a(cVar, obj, sb8Var, pzdVar, i2, i3, cls, cls2, priority, jy6Var, map, z, z2, z6, cchVar, qb8VarA2);
        this.f28955a.c(sb8Var, qb8VarA2);
        qb8VarA2.a(rqkVar, executor);
        qb8VarA2.s(bs5VarA);
        if (i) {
            k("Started new load", j, sb8Var);
        }
        return new d(rqkVar, qb8VarA2);
    }

    public ob8(fpf fpfVar, fy6.a aVar, a0b a0bVar, a0b a0bVar2, a0b a0bVar3, a0b a0bVar4, boolean z) {
        this(fpfVar, aVar, a0bVar, a0bVar2, a0bVar3, a0bVar4, null, null, null, null, null, null, z);
    }
}
