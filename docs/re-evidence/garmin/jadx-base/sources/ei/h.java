package ei;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.h0;
import r53.a2;
import r53.e2;
import r53.g2;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lei/h;", "Lbi/a;", "Lci/k;", "normalizedCacheFactory", "Lci/c;", "cacheKeyGenerator", "Lci/e;", "cacheResolver", "<init>", "(Lci/k;Lci/c;Lci/e;)V", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class h implements bi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ci.c f64114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci.e f64115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f64116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f64117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f64118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f64119f;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldi/f;", "invoke", "()Ldi/f;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends w implements e23.a<di.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ci.k f64120a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ci.k kVar) {
            super(0);
            this.f64120a = kVar;
        }

        @Override // e23.a
        public final di.f invoke() {
            di.f fVar = new di.f();
            ci.j jVarB = this.f64120a.b();
            ci.j jVar = fVar;
            while (true) {
                ci.j jVar2 = jVar.f27614a;
                if (jVar2 == null) {
                    jVar.f27614a = jVarB;
                    return fVar;
                }
                jVar = jVar2;
            }
        }
    }

    public h(ci.k kVar, ci.c cVar, ci.e eVar) {
        kVar.getClass();
        cVar.getClass();
        eVar.getClass();
        this.f64114a = cVar;
        this.f64115b = eVar;
        e2 e2VarB = g2.b(0, 10, q53.a.DROP_OLDEST, 1);
        this.f64116c = e2VarB;
        this.f64117d = r53.s.c(e2VarB);
        this.f64118e = o13.m.b(new a(kVar));
        this.f64119f = new n();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // bi.a
    public final Object a(ci.a aVar, v13.c cVar, z zVar, n0.a aVar2, n0 n0Var) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f64128c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f64128c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        k kVar2 = kVar;
        Object objG = kVar2.f64126a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar2.f64128c;
        if (i15 == 0) {
            o13.r.b(objG);
            kVar2.f64128c = 1;
            objG = g(aVar, kVar2, zVar, aVar2, n0Var);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        return ((o13.p) objG).f128595b;
    }

    @Override // bi.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final a2 getF64117d() {
        return this.f64117d;
    }

    @Override // bi.a
    public final Object c(n0 n0Var, z zVar, ci.a aVar) {
        j jVar = new j(n0Var, zVar, this, aVar);
        n nVar = this.f64119f;
        nVar.getClass();
        ReentrantReadWriteLock.ReadLock lock = nVar.f64137a.readLock();
        lock.lock();
        try {
            return jVar.invoke();
        } finally {
            lock.unlock();
        }
    }

    @Override // bi.a
    public final LinkedHashMap d(n0 n0Var, n0.a aVar, z zVar) {
        n0Var.getClass();
        aVar.getClass();
        zVar.getClass();
        return ci.l.b(n0Var, aVar, zVar, this.f64114a);
    }

    @Override // bi.a
    public final Object e(Set set, v13.c cVar) {
        Object objEmit;
        return (!set.isEmpty() && (objEmit = this.f64116c.emit(set, cVar)) == u13.a.COROUTINE_SUSPENDED) ? objEmit : Unit.INSTANCE;
    }

    @Override // bi.a
    public final void f() {
        this.f64119f.a(new i(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable g(ci.a aVar, v13.c cVar, z zVar, n0.a aVar2, n0 n0Var) {
        l lVar;
        Set set;
        Map map;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f64131c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f64131c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.f64129a;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f64131c;
        if (i15 != 0) {
            map = null;
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            set = null;
        } else {
            o13.r.b(obj);
            o13.p pVar = (o13.p) this.f64119f.a(new m(n0Var, aVar2, zVar, this, aVar));
            Map map2 = (Map) pVar.f128594a;
            set = (Set) pVar.f128595b;
            map = map2;
        }
        return new o13.p(h0.g1(map.values()), set);
    }
}
