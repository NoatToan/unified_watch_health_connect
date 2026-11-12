package gm0;

import androidx.room.a0;
import bi.m;
import ch.qos.logback.core.CoreConstants;
import com.apollographql.apollo3.exception.ApolloCompositeException;
import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.apollographql.apollo3.exception.ApolloParseException;
import com.apollographql.apollo3.exception.CacheMissException;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import e23.p;
import e23.q;
import hm0.a;
import j70.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.c0;
import o53.e2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.t0;
import p13.y;
import r53.j;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import t13.g;
import v13.i;
import vh.d0;
import vh.f;
import vh.s0;
import vh.s0.a;
import yz1.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lgm0/a;", "Lvh/s0$a;", "T", "Lhm0/a;", "Q", "", "Lgm0/e;", "<init>", "()V", "a", "gcm-graphql_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a<T extends s0.a, Q extends hm0.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f77987d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u53.d f77988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f77989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f77990c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvh/s0$a;", "T", "Lvh/f;", "response", "", "<anonymous>", "(Lvh/f;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.graphql.data.datasource.GraphQLQueryDataSource$triggerServerCall$1", f = "GraphQLQueryDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<f<T>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f77991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<T, Q> f77992b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<T, Q> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f77992b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f77992b, dVar);
            bVar.f77991a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((b) create((f) obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            f<T> fVar = (f) this.f77991a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = a.f77987d;
            this.f77992b.f(fVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvh/s0$a;", "T", "Lr53/j;", "Lvh/f;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.graphql.data.datasource.GraphQLQueryDataSource$triggerServerCall$2", f = "GraphQLQueryDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements q<j<? super f<T>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Throwable f77993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<T, Q> f77994b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a<T, Q> aVar, t13.d<? super c> dVar) {
            super(3, dVar);
            this.f77994b = aVar;
        }

        @Override // e23.q
        public final Object invoke(Object obj, Throwable th3, t13.d<? super Unit> dVar) {
            c cVar = new c(this.f77994b, dVar);
            cVar.f77993a = th3;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f77993a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = a.f77987d;
            this.f77994b.e(th3);
            return Unit.INSTANCE;
        }
    }

    static {
        new C1570a(null);
    }

    public a() {
        e2 e2VarH = ge1.b.h();
        x53.c cVar = o53.s0.f129406a;
        this.f77988a = c0.a(g.a.C3052a.d(x53.b.f189152a, e2VarH));
        this.f77989b = q2.a(new e(new yz1.d(null, null, false, 6, null), null, 2, null));
        this.f77990c = q2.a(null);
    }

    public final void a() {
        c0.c(this.f77988a, null);
    }

    public final p2 b(h hVar) {
        this.f77990c.setValue(hVar);
        p2 p2Var = this.f77989b;
        if (((e) p2Var.getValue()).f78008a.f200298a == null) {
            p2Var.k(null, e.a((e) p2Var.getValue(), new yz1.d(u.LOADING, null, false, 6, null)));
        } else {
            p2Var.k(null, e.a((e) p2Var.getValue(), yz1.d.a(((e) p2Var.getValue()).f78008a, null, true, 3)));
        }
        k(hVar, bi.g.CacheAndNetwork);
        return p2Var;
    }

    public abstract uh.b c();

    public abstract s0<T> d(Q q14);

    public final void e(Throwable th3) {
        String str;
        a2 a2Var = a2.GRAPH_QL;
        th3.getClass();
        StringBuilder sb3 = new StringBuilder();
        if (th3 instanceof ApolloException) {
            ApolloException apolloException = (ApolloException) th3;
            if (apolloException instanceof ApolloParseException) {
                sb3.append("ApolloParseException: " + apolloException.getMessage());
                sb3.append('\n');
                Throwable cause = apolloException.getCause();
                if (cause != null) {
                    sb3.append(CoreConstants.CAUSED_BY + p005kotlin.jvm.internal.s0.f105811a.b(cause.getClass()).D() + ": " + cause.getMessage());
                    sb3.append('\n');
                }
            } else if (apolloException instanceof ApolloCompositeException) {
                sb3.append("ApolloCompositeException: " + apolloException.getMessage());
                sb3.append('\n');
                for (Throwable th4 : x13.b.f188452a.b(apolloException)) {
                    sb3.append(CoreConstants.SUPPRESSED + p005kotlin.jvm.internal.s0.f105811a.b(th4.getClass()).D() + ": " + th4.getMessage());
                    sb3.append('\n');
                    if (th4 instanceof CacheMissException) {
                        str = "The response was not received because the cache was empty";
                    } else if (th4 instanceof ApolloHttpException) {
                        str = "The response was received with an HTTP error";
                    } else {
                        str = th4 instanceof ApolloNetworkException ? "The response was not received due to a network exception" : "Something else happened (parsing error, ...)";
                    }
                    sb3.append("Reason: ".concat(str));
                    sb3.append('\n');
                }
            } else {
                Class<?> cls = apolloException.getClass();
                t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                sb3.append(t0Var.b(cls).D() + ": " + apolloException.getMessage());
                sb3.append('\n');
                Throwable cause2 = apolloException.getCause();
                if (cause2 != null) {
                    sb3.append(CoreConstants.CAUSED_BY + t0Var.b(cause2.getClass()).D() + ": " + cause2.getMessage());
                    sb3.append('\n');
                }
            }
        } else {
            Class<?> cls2 = th3.getClass();
            t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
            sb3.append(t0Var2.b(cls2).D() + ": " + th3.getMessage());
            sb3.append('\n');
            Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                sb3.append(CoreConstants.CAUSED_BY + t0Var2.b(cause3.getClass()).D() + ": " + cause3.getMessage());
                sb3.append('\n');
            }
        }
        String strN = fb1.c.n("GraphQLQuery failed: ", w.k0(sb3.toString()).toString());
        i2.f36769a.getClass();
        i2.a.f(a2Var, "GraphQLQueryDataSource", strN);
        p2 p2Var = this.f77989b;
        p2Var.k(null, new e(((e) p2Var.getValue()).f78009b == null ? new yz1.d(u.ERROR, yz1.c.SERVER, false, 4, null) : new yz1.d(u.SUCCESS, yz1.c.CACHE, false, 4, null), ((e) p2Var.getValue()).f78009b));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    public final void f(f<T> fVar) {
        s0.a aVarI;
        yz1.d dVar;
        ArrayList arrayList;
        fVar.getClass();
        List<d0> list = fVar.f178310d;
        D d14 = fVar.f178309c;
        bi.c cVarB = m.b(fVar);
        boolean z14 = true;
        yz1.c cVar = (cVarB == null || !cVarB.f17928f) ? yz1.c.SERVER : yz1.c.CACHE;
        yz1.c cVar2 = yz1.c.SERVER;
        p2 p2Var = this.f77989b;
        if (cVar != cVar2) {
            aVarI = (s0.a) d14;
            dVar = new yz1.d(u.SUCCESS, cVar, false, 4, null);
        } else {
            if (list != null && !list.isEmpty()) {
                z14 = false;
            }
            if (z14) {
                aVarI = (s0.a) d14;
                dVar = new yz1.d(u.SUCCESS, cVar, false, 4, null);
            } else {
                a2 a2Var = a2.GRAPH_QL;
                if (list != null) {
                    arrayList = new ArrayList(y.r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((d0) it.next()).toString());
                    }
                } else {
                    arrayList = null;
                }
                String strK = a0.k("GraphQLQuery success with errors ", arrayList);
                i2.f36769a.getClass();
                i2.a.f(a2Var, "GraphQLQueryDataSource", strK);
                u uVar = ((e) p2Var.getValue()).f78008a.f200298a;
                u uVar2 = u.SUCCESS;
                T t7 = uVar == uVar2 ? ((e) p2Var.getValue()).f78009b : null;
                if (t7 == null) {
                    dVar = new yz1.d(u.ERROR, yz1.c.SERVER, false, 4, null);
                    aVarI = (s0.a) d14;
                } else {
                    yz1.d dVar2 = new yz1.d(uVar2, yz1.c.CACHE, false, 4, null);
                    aVarI = i(t7, (s0.a) d14);
                    dVar = dVar2;
                }
            }
        }
        p2Var.k(null, new e(dVar, aVarI));
    }

    public final gm0.b g() {
        return new gm0.b(this.f77989b);
    }

    public final gm0.c h() {
        return new gm0.c(this.f77989b);
    }

    public abstract T i(T t7, T t14);

    public final void j(boolean z14) {
        p2 p2Var = this.f77989b;
        if (((e) p2Var.getValue()).f78008a.f200298a == null) {
            return;
        }
        if (z14) {
            p2Var.k(null, new e(new yz1.d(u.LOADING, null, false, 6, null), null, 2, null));
        } else {
            p2Var.k(null, e.a((e) p2Var.getValue(), yz1.d.a(((e) p2Var.getValue()).f78008a, null, true, 3)));
        }
        k((hm0.a) this.f77990c.getValue(), bi.g.NetworkOnly);
    }

    public final void k(Q q14, bi.g gVar) {
        uh.b bVarC = c();
        if (q14 == null) {
            q14 = new hm0.b();
        }
        s0<T> s0VarD = d(q14);
        bVarC.getClass();
        uh.a aVar = new uh.a(bVarC, s0VarD);
        m.a(aVar, gVar);
        s.C(new r53.w(new m1(aVar.a(), new b(this, null)), new c(this, null)), this.f77988a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(am0.a aVar, bi.g gVar, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f78007c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f78007c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objH = dVar.f78005a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f78007c;
        p2 p2Var = this.f77989b;
        try {
            if (i15 == 0) {
                r.b(objH);
                uh.b bVarC = c();
                Object bVar = aVar;
                if (aVar == null) {
                    bVar = new hm0.b();
                }
                s0<T> s0VarD = d(bVar);
                bVarC.getClass();
                uh.a aVar3 = new uh.a(bVarC, s0VarD);
                m.a(aVar3, gVar);
                dVar.f78007c = 1;
                objH = s.H(aVar3.a(), dVar);
                if (objH == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objH);
            }
            f((f) objH);
            return (e) p2Var.getValue();
        } catch (Exception e4) {
            e(e4);
            return (e) p2Var.getValue();
        }
    }

    /* JADX INFO: renamed from: gm0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgm0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-graphql_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1570a {
        public /* synthetic */ C1570a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1570a() {
        }
    }
}
