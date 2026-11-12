package oi;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.apollographql.apollo3.exception.ApolloParseException;
import d53.u;
import ds.e0;
import e23.p;
import java.io.IOException;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import r53.c2;
import r53.w;
import vh.n0;
import vh.o0;
import vh.z;
import w2.a0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lvh/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1", f = "HttpNetworkTransport.kt", l = {65, 85, 90}, m = "invokeSuspend")
public final class i extends v13.i implements p<r53.j<? super vh.f<Object>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f132204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f132205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f132206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f132207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh.g f132208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vh.e<Object> f132209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f132210g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements r53.i<vh.f<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f132211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f132212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vh.e f132213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ wh.i f132214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f132215e;

        /* JADX INFO: renamed from: oi.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C2510a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f132216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f132217b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ vh.e f132218c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ wh.i f132219d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ long f132220e;

            /* JADX INFO: renamed from: oi.i$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @v13.e(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2", f = "HttpNetworkTransport.kt", l = {223}, m = "emit")
            public static final class C2511a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f132221a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f132222b;

                public C2511a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f132221a = obj;
                    this.f132222b |= Integer.MIN_VALUE;
                    return C2510a.this.emit(null, this);
                }
            }

            public C2510a(r53.j jVar, h hVar, vh.e eVar, wh.i iVar, long j8) {
                this.f132216a = jVar;
                this.f132217b = hVar;
                this.f132218c = eVar;
                this.f132219d = iVar;
                this.f132220e = j8;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2511a c2511a;
                if (dVar instanceof C2511a) {
                    c2511a = (C2511a) dVar;
                    int i14 = c2511a.f132222b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2511a.f132222b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2511a = new C2511a(dVar);
                    }
                } else {
                    c2511a = new C2511a(dVar);
                }
                Object obj2 = c2511a.f132221a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2511a.f132222b;
                if (i15 == 0) {
                    r.b(obj2);
                    vh.f fVarB = h.b(this.f132217b, (vh.f) obj, this.f132218c.f178289b, this.f132219d, this.f132220e);
                    c2511a.f132222b = 1;
                    if (this.f132216a.emit(fVarB, c2511a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(r53.i iVar, h hVar, vh.e eVar, wh.i iVar2, long j8) {
            this.f132211a = iVar;
            this.f132212b = hVar;
            this.f132213c = eVar;
            this.f132214d = iVar2;
            this.f132215e = j8;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super vh.f<Object>> jVar, t13.d dVar) {
            Object objCollect = this.f132211a.collect(new C2510a(jVar, this.f132212b, this.f132213c, this.f132214d, this.f132215e), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, wh.g gVar, vh.e<Object> eVar, z zVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f132207d = hVar;
        this.f132208e = gVar;
        this.f132209f = eVar;
        this.f132210g = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f132207d, this.f132208e, this.f132209f, this.f132210g, dVar);
        iVar.f132206c = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super vh.f<Object>> jVar, t13.d<? super Unit> dVar) {
        return ((i) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        if (r53.s.v(r2, r12, r20) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010f, code lost:
    
        if (r2.emit(r4, r20) == r0) goto L33;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        r53.j jVar;
        long jCurrentTimeMillis;
        Object objA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132205b;
        h hVar = this.f132207d;
        w63.g gVarA = null;
        if (i14 != 0) {
            if (i14 == 1) {
                jCurrentTimeMillis = this.f132204a;
                jVar = (r53.j) this.f132206c;
                r.b(obj);
                objA = obj;
            } else {
                if (i14 != 2 && i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        jVar = (r53.j) this.f132206c;
        int i15 = mi.a.f118679a;
        jCurrentTimeMillis = System.currentTimeMillis();
        d dVar = new d(h0.D0(hVar.f132196c, hVar.f132198e), 0);
        this.f132206c = jVar;
        this.f132204a = jCurrentTimeMillis;
        this.f132205b = 1;
        List<g> list = dVar.f132189a;
        int size = list.size();
        int i16 = dVar.f132190b;
        if (i16 >= size) {
            vb.h.z("Check failed.");
            return null;
        }
        g gVar = list.get(i16);
        new d(list, i16 + 1);
        objA = gVar.a(this.f132208e, this);
        if (objA != aVar) {
        }
        return aVar;
        long j8 = jCurrentTimeMillis;
        wh.i iVar = (wh.i) objA;
        int i17 = iVar.f185234a;
        if (200 > i17 || i17 >= 300) {
            if (hVar.f132197d) {
                gVarA = iVar.a();
            } else {
                w63.g gVarA2 = iVar.a();
                if (gVarA2 != null) {
                    gVarA2.close();
                }
            }
            throw new ApolloHttpException(iVar.f185234a, iVar.f185235b, gVarA, e0.j(new StringBuilder("Http request failed with status code `"), iVar.f185234a, '`'), null, 16, null);
        }
        String strT = a0.t(iVar.f185235b);
        z zVar = this.f132210g;
        vh.e<Object> eVar = this.f132209f;
        if (strT == null || !u.y(strT, "multipart/", true)) {
            n0<D> n0Var = eVar.f178288a;
            h.b bVar = h.f132193f;
            hVar.getClass();
            try {
                w63.g gVarA3 = iVar.a();
                gVarA3.getClass();
                vh.f.a aVarA = o0.a(n0Var, new zh.d(gVarA3), zVar).a();
                aVarA.f178320g = true;
                vh.f fVarB = h.b(hVar, aVarA.b(), eVar.f178289b, iVar, j8);
                this.f132206c = null;
                this.f132205b = 3;
            } catch (Exception e4) {
                h.f132193f.getClass();
                if (e4 instanceof ApolloException) {
                    throw ((ApolloException) e4);
                }
                throw new ApolloParseException("Failed to parse GraphQL http network response", e4);
            }
        } else {
            n0<D> n0Var2 = eVar.f178288a;
            h.b bVar2 = h.f132193f;
            hVar.getClass();
            r0 r0Var = new r0();
            r0 r0Var2 = new r0();
            a aVar2 = new a(new w(new j(new r53.u(new c2(new li.g(r0Var2, iVar, null)), new li.h(r0Var2, null)), n0Var2, zVar, r0Var), new k(null)), this.f132207d, this.f132209f, iVar, j8);
            this.f132206c = null;
            this.f132205b = 2;
        }
    }
}
