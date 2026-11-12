package pi;

import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.apollographql.apollo3.exception.SubscriptionOperationException;
import ds.e0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lc.u0;
import o53.b0;
import o53.c0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import r53.a2;
import r53.c2;
import r53.e2;
import r53.g2;
import r53.o2;
import r53.u;
import r53.u2;
import vh.g0;
import vh.n0;
import vh.o0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0015Bl\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012*\u0010\u0012\u001a&\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lpi/k;", "Lni/a;", "", "serverUrl", "", "Lwh/e;", "headers", "Lpi/j;", "webSocketEngine", "", "idleTimeoutMillis", "Lpi/p$a;", "protocolFactory", "Lkotlin/Function3;", "", "Lt13/d;", "", "", "reopenWhen", "<init>", "(Ljava/lang/String;Ljava/util/List;Lpi/j;JLpi/p$a;Le23/q;)V", "b", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class k implements ni.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<wh.e> f137748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f137749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f137750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p.a f137751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.q<Throwable, Long, t13.d<? super Boolean>, Object> f137752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q53.b f137753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2 f137754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f137755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o2<Integer> f137756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final li.c f137757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f137758l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 5, 1})
    @v13.e(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$1", f = "WebSocketNetworkTransport.kt", l = {96}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f137760b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = k.this.new a(dVar);
            aVar.f137760b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Closeable closeable;
            Unit unit;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137759a;
            Throwable th3 = null;
            if (i14 == 0) {
                o13.r.b(obj);
                b0 b0Var = (b0) this.f137760b;
                k kVar = k.this;
                li.c cVar = kVar.f137757k;
                try {
                    this.f137760b = cVar;
                    this.f137759a = 1;
                    if (k.b(kVar, b0Var, this) == aVar) {
                        return aVar;
                    }
                    closeable = cVar;
                } catch (Throwable th4) {
                    th = th4;
                    closeable = cVar;
                    th3 = th;
                    unit = null;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable = (Closeable) this.f137760b;
                try {
                    o13.r.b(obj);
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    unit = null;
                }
            }
            unit = Unit.INSTANCE;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th6) {
                    if (th3 == null) {
                        th3 = th6;
                    } else {
                        o13.g.a(th3, th6);
                    }
                }
            }
            if (th3 != null) {
                throw th3;
            }
            unit.getClass();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpi/k$b;", "", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f137762a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public pi.e f137763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f137764c;
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements r53.i<qi.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f137765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vh.e f137766b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f137767a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ vh.e f137768b;

            /* JADX INFO: renamed from: pi.k$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @v13.e(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2", f = "WebSocketNetworkTransport.kt", l = {223}, m = "emit")
            public static final class C2612a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f137769a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f137770b;

                public C2612a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f137769a = obj;
                    this.f137770b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, vh.e eVar) {
                this.f137767a = jVar;
                this.f137768b = eVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2612a c2612a;
                if (dVar instanceof C2612a) {
                    c2612a = (C2612a) dVar;
                    int i14 = c2612a.f137770b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2612a.f137770b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2612a = new C2612a(dVar);
                    }
                } else {
                    c2612a = new C2612a(dVar);
                }
                Object obj2 = c2612a.f137769a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2612a.f137770b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    qi.c cVar = (qi.c) obj;
                    if (s.g(cVar.getF144811a(), this.f137768b.f178289b.toString()) || cVar.getF144811a() == null) {
                        c2612a.f137770b = 1;
                        if (this.f137767a.emit(obj, c2612a) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public c(r53.i iVar, vh.e eVar) {
            this.f137765a = iVar;
            this.f137766b = eVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super qi.c> jVar, t13.d dVar) {
            Object objCollect = this.f137765a.collect(new a(jVar, this.f137766b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d<D> implements r53.i<vh.f<D>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f137772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ li.d f137773b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f137774a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ li.d f137775b;

            /* JADX INFO: renamed from: pi.k$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @v13.e(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2", f = "WebSocketNetworkTransport.kt", l = {223}, m = "emit")
            public static final class C2613a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f137776a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f137777b;

                public C2613a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f137776a = obj;
                    this.f137777b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, li.d dVar) {
                this.f137774a = jVar;
                this.f137775b = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2613a c2613a;
                if (dVar instanceof C2613a) {
                    c2613a = (C2613a) dVar;
                    int i14 = c2613a.f137777b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2613a.f137777b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2613a = new C2613a(dVar);
                    }
                } else {
                    c2613a = new C2613a(dVar);
                }
                Object obj2 = c2613a.f137776a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2613a.f137777b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    if (!this.f137775b.f112571f) {
                        c2613a.f137777b = 1;
                        if (this.f137774a.emit(obj, c2613a) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public d(r53.i iVar, li.d dVar) {
            this.f137772a = iVar;
            this.f137773b = dVar;
        }

        @Override // r53.i
        public final Object collect(r53.j jVar, t13.d dVar) {
            Object objCollect = this.f137772a.collect(new a(jVar, this.f137773b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e<D> implements r53.i<vh.f<D>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f137779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vh.e f137780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ li.d f137781c;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f137782a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ vh.e f137783b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ li.d f137784c;

            /* JADX INFO: renamed from: pi.k$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @v13.e(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2", f = "WebSocketNetworkTransport.kt", l = {223}, m = "emit")
            public static final class C2614a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f137785a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f137786b;

                public C2614a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f137785a = obj;
                    this.f137786b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, vh.e eVar, li.d dVar) {
                this.f137782a = jVar;
                this.f137783b = eVar;
                this.f137784c = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2614a c2614a;
                o13.p pVar;
                if (dVar instanceof C2614a) {
                    c2614a = (C2614a) dVar;
                    int i14 = c2614a.f137786b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2614a.f137786b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2614a = new C2614a(dVar);
                    }
                } else {
                    c2614a = new C2614a(dVar);
                }
                Object obj2 = c2614a.f137785a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2614a.f137786b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    qi.c cVar = (qi.c) obj;
                    boolean z14 = cVar instanceof qi.i;
                    vh.e eVar = this.f137783b;
                    if (!z14) {
                        if (cVar instanceof qi.h) {
                            throw new SubscriptionOperationException(eVar.f178288a.name(), ((qi.h) cVar).f144810b);
                        }
                        if (cVar instanceof qi.f) {
                            throw new ApolloNetworkException("Network error while executing ".concat(eVar.f178288a.name()), ((qi.f) cVar).f144807a);
                        }
                        if (cVar instanceof qi.g ? true : cVar instanceof qi.d) {
                            e0.t(cVar, "Unexpected event ");
                            return null;
                        }
                        u0.r();
                        return null;
                    }
                    Map<String, Object> map = ((qi.i) cVar).f144812b;
                    g0.b bVarB = eVar.f178290c.b(z.f178396e);
                    bVarB.getClass();
                    z zVar = (z) bVarB;
                    boolean zContains = map.keySet().contains("hasNext");
                    li.d dVar2 = this.f137784c;
                    if (zContains) {
                        LinkedHashMap linkedHashMapB = dVar2.b(map);
                        LinkedHashSet linkedHashSet = dVar2.f112569d;
                        linkedHashSet.getClass();
                        z.a aVar2 = new z.a();
                        aVar2.f178401a.putAll(zVar.f178400d);
                        vh.b.a aVarA = zVar.f178398b.a();
                        aVarA.f178262b = linkedHashSet;
                        aVar2.f178402b = aVarA.a();
                        pVar = new o13.p(linkedHashMapB, aVar2.a());
                    } else {
                        pVar = new o13.p(map, zVar);
                    }
                    Map map2 = (Map) pVar.f128594a;
                    z zVar2 = (z) pVar.f128595b;
                    n0<D> n0Var = eVar.f178288a;
                    map2.getClass();
                    vh.f.a aVarA2 = o0.a(n0Var, new zh.h(map2, null, 2, null), zVar2).a();
                    UUID uuid = eVar.f178289b;
                    uuid.getClass();
                    aVarA2.f178315b = uuid;
                    vh.f fVarB = aVarA2.b();
                    if (!dVar2.f112570e) {
                        dVar2.f112566a.clear();
                        dVar2.f112568c.clear();
                        dVar2.f112570e = true;
                        dVar2.f112571f = false;
                    }
                    c2614a.f137786b = 1;
                    if (this.f137782a.emit(fVarB, c2614a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public e(r53.i iVar, vh.e eVar, li.d dVar) {
            this.f137779a = iVar;
            this.f137780b = eVar;
            this.f137781c = dVar;
        }

        @Override // r53.i
        public final Object collect(r53.j jVar, t13.d dVar) {
            Object objCollect = this.f137779a.collect(new a(jVar, this.f137780b, this.f137781c), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lqi/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 5, 1})
    @v13.e(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$1", f = "WebSocketNetworkTransport.kt", l = {262}, m = "invokeSuspend")
    public static final class f extends v13.i implements e23.p<r53.j<? super qi.c>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137788a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vh.e<D> f137790c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(vh.e<D> eVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f137790c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new f(this.f137790c, dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super qi.c> jVar, t13.d<? super Unit> dVar) {
            return ((f) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137788a;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.b bVar = k.this.f137753g;
                qi.j jVar = new qi.j(this.f137790c);
                this.f137788a = 1;
                if (bVar.h(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lqi/c;", "it", "", "<anonymous>", "(Lr53/j;Lqi/c;)Z"}, k = 3, mv = {1, 5, 1})
    @v13.e(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$3", f = "WebSocketNetworkTransport.kt", l = {271, 282}, m = "invokeSuspend")
    public static final class g extends v13.i implements e23.q<r53.j<? super qi.c>, qi.c, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f137792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ qi.c f137793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ vh.e<D> f137794d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(vh.e<D> eVar, t13.d<? super g> dVar) {
            super(3, dVar);
            this.f137794d = eVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super qi.c> jVar, qi.c cVar, t13.d<? super Boolean> dVar) {
            g gVar = new g(this.f137794d, dVar);
            gVar.f137792b = jVar;
            gVar.f137793c = cVar;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137791a;
            boolean z14 = false;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.j jVar = this.f137792b;
                qi.c cVar = this.f137793c;
                if (!(cVar instanceof qi.g)) {
                    if (cVar instanceof qi.f) {
                        this.f137792b = null;
                        this.f137791a = 1;
                    } else {
                        if (cVar instanceof qi.d) {
                            System.out.println((Object) ("Received general error while executing operation " + this.f137794d.f178288a.name() + ": " + ((qi.d) cVar).f144806a));
                        } else {
                            this.f137792b = null;
                            this.f137791a = 2;
                        }
                        z14 = true;
                    }
                    return aVar;
                }
            } else if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                z14 = true;
            }
            return Boolean.valueOf(z14);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lvh/f;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    @v13.e(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$6", f = "WebSocketNetworkTransport.kt", l = {317}, m = "invokeSuspend")
    public static final class h<D> extends v13.i implements e23.q<r53.j<? super vh.f<D>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137795a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vh.e<D> f137797c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(vh.e<D> eVar, t13.d<? super h> dVar) {
            super(3, dVar);
            this.f137797c = eVar;
        }

        @Override // e23.q
        public final Object invoke(Object obj, Throwable th3, t13.d<? super Unit> dVar) {
            return k.this.new h(this.f137797c, dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137795a;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.b bVar = k.this.f137753g;
                qi.k kVar = new qi.k(this.f137797c);
                this.f137795a = 1;
                if (bVar.h(kVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"pi/k$i", "Lpi/p$b;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class i implements p.b {
        public i() {
        }

        @Override // pi.p.b
        public final void a(Exception exc) {
            k.this.f137753g.i(new qi.f(exc));
        }

        @Override // pi.p.b
        public final void b(String str, Map<String, ? extends Object> map) {
            k.this.f137753g.i(new qi.h(str, map));
        }

        @Override // pi.p.b
        public final void c(Map<String, ? extends Object> map) {
            k.this.f137753g.i(new qi.d(map));
        }

        @Override // pi.p.b
        public final void d(String str) {
            k.this.f137753g.i(new qi.g(str));
        }

        @Override // pi.p.b
        public final void e(String str, Map<String, ? extends Object> map) {
            k.this.f137753g.i(new qi.i(str, map));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private k(String str, List<wh.e> list, j jVar, long j8, p.a aVar, e23.q<? super Throwable, ? super Long, ? super t13.d<? super Boolean>, ? extends Object> qVar) {
        this.f137747a = str;
        this.f137748b = list;
        this.f137749c = jVar;
        this.f137750d = j8;
        this.f137751e = aVar;
        this.f137752f = qVar;
        this.f137753g = q53.l.a(Integer.MAX_VALUE, 6, null);
        e2 e2VarA = g2.a(0, Integer.MAX_VALUE, q53.a.SUSPEND);
        this.f137754h = e2VarA;
        this.f137755i = r53.s.c(e2VarA);
        this.f137756j = e2VarA.f();
        li.c cVar = new li.c();
        this.f137757k = cVar;
        ge1.b.T(c0.a(cVar.f112565b), null, null, new a(null), 3);
        this.f137758l = new i();
    }

    /* JADX WARN: Code duplicated, block: B:145:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0226 A[LOOP:1: B:80:0x0204->B:88:0x0226, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, o53.c2] */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, o53.c2] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, pi.f] */
    /* JADX WARN: Type inference failed for: r8v11, types: [T, qi.e] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x02cd -> B:13:0x004a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0318 -> B:111:0x02d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x0399 -> B:28:0x00fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01a5 -> B:54:0x01a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(pi.k r24, o53.b0 r25, v13.c r26) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.k.b(pi.k, o53.b0, v13.c):java.lang.Object");
    }

    public static final void c(r0<p> r0Var, r0<l1> r0Var2, r0<l1> r0Var3) {
        p pVar = r0Var.f105810a;
        if (pVar != null) {
            pVar.f137820a.close();
        }
        r0Var.f105810a = null;
        l1 l1Var = r0Var2.f105810a;
        if (l1Var != null) {
            l1Var.c(null);
        }
        r0Var2.f105810a = null;
        l1 l1Var2 = r0Var3.f105810a;
        if (l1Var2 != null) {
            l1Var2.c(null);
        }
        r0Var3.f105810a = null;
    }

    @Override // ni.a
    public final <D extends n0.a> r53.i<vh.f<D>> a(vh.e<D> eVar) {
        eVar.getClass();
        li.d dVar = new li.d();
        return new u(new d(new e(new c2(new li.f(new c(new u2(this.f137755i, new f(eVar, null)), eVar), new g(eVar, null), null)), eVar, dVar), dVar), new h(eVar, null));
    }

    @Override // ni.a
    public final void dispose() {
        this.f137753g.i(qi.b.f144805a);
    }

    public /* synthetic */ k(String str, List list, j jVar, long j8, p.a aVar, e23.q qVar, p005kotlin.jvm.internal.j jVar2) {
        this(str, list, jVar, j8, aVar, qVar);
    }

    public /* synthetic */ k(String str, List list, j jVar, long j8, p.a aVar, e23.q qVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(str, list, (i14 & 4) != 0 ? new pi.e() : jVar, (i14 & 8) != 0 ? 60000L : j8, (i14 & 16) != 0 ? new pi.f.b(0L, null, null, 7, null) : aVar, qVar);
    }
}
