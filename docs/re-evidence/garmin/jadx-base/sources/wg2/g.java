package wg2;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.room.a0;
import o13.r;
import of2.b0;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import r53.b2;
import r53.k2;
import r53.m2;
import r53.o2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lwg2/g;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f185145o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f185146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f185147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f185148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f185149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f185150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f185151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f185152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f185153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f185154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f185155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f185156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f185157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f185158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f185159n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<dg2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f185160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f185161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f185162c;

        public b(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f185160a = koinComponent;
            this.f185161b = qualifier;
            this.f185162c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [dg2.a, java.lang.Object] */
        @Override // e23.a
        public final dg2.a invoke() {
            KoinComponent koinComponent = this.f185160a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(dg2.a.class), this.f185161b, this.f185162c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<nf2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f185163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f185164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f185165c;

        public c(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f185163a = koinComponent;
            this.f185164b = qualifier;
            this.f185165c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, nf2.a] */
        @Override // e23.a
        public final nf2.a invoke() {
            KoinComponent koinComponent = this.f185163a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(nf2.a.class), this.f185164b, this.f185165c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<fg2.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f185166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f185167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f185168c;

        public d(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f185166a = koinComponent;
            this.f185167b = qualifier;
            this.f185168c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [fg2.f, java.lang.Object] */
        @Override // e23.a
        public final fg2.f invoke() {
            KoinComponent koinComponent = this.f185166a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(fg2.f.class), this.f185167b, this.f185168c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<bh2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f185169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f185170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f185171c;

        public e(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f185169a = koinComponent;
            this.f185170b = qualifier;
            this.f185171c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [bh2.c, java.lang.Object] */
        @Override // e23.a
        public final bh2.c invoke() {
            KoinComponent koinComponent = this.f185169a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(bh2.c.class), this.f185170b, this.f185171c);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f185172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f185173b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f185174a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f185175b;

            /* JADX INFO: renamed from: wg2.g$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.livesessionview.ui.states.SessionStateViewModel$special$$inlined$map$1$2", f = "SessionStateViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C3427a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f185176a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f185177b;

                public C3427a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f185176a = obj;
                    this.f185177b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, g gVar) {
                this.f185174a = jVar;
                this.f185175b = gVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, o13.l] */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3427a c3427a;
                if (dVar instanceof C3427a) {
                    c3427a = (C3427a) dVar;
                    int i14 = c3427a.f185177b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3427a.f185177b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3427a = new C3427a(dVar);
                    }
                } else {
                    c3427a = new C3427a(dVar);
                }
                Object obj2 = c3427a.f185176a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3427a.f185177b;
                if (i15 == 0) {
                    r.b(obj2);
                    int i16 = g.f185145o;
                    ((bh2.c) this.f185175b.f185149d.getValue()).getClass();
                    Boolean boolValueOf = Boolean.valueOf(bh2.c.a((jg2.a) obj));
                    c3427a.f185177b = 1;
                    if (this.f185174a.emit(boolValueOf, c3427a) == aVar) {
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

        public f(r53.i iVar, g gVar) {
            this.f185172a = iVar;
            this.f185173b = gVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f185172a.collect(new a(jVar, this.f185173b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: wg2.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3428g implements r53.i<jg2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f185179a;

        /* JADX INFO: renamed from: wg2.g$g$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f185180a;

            /* JADX INFO: renamed from: wg2.g$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.livesessionview.ui.states.SessionStateViewModel$special$$inlined$mapNotNull$1$2", f = "SessionStateViewModel.kt", l = {52}, m = "emit", v = 2)
            public static final class C3429a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f185181a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f185182b;

                public C3429a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f185181a = obj;
                    this.f185182b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f185180a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3429a c3429a;
                if (dVar instanceof C3429a) {
                    c3429a = (C3429a) dVar;
                    int i14 = c3429a.f185182b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3429a.f185182b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3429a = new C3429a(dVar);
                    }
                } else {
                    c3429a = new C3429a(dVar);
                }
                Object obj2 = c3429a.f185181a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3429a.f185182b;
                if (i15 == 0) {
                    r.b(obj2);
                    b0 b0Var = (b0) obj;
                    jg2.a aVar2 = b0Var != null ? b0Var.f131746c : null;
                    if (aVar2 != null) {
                        c3429a.f185182b = 1;
                        if (this.f185180a.emit(aVar2, c3429a) == aVar) {
                            return aVar;
                        }
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

        public C3428g(r53.i iVar) {
            this.f185179a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super jg2.a> jVar, t13.d dVar) {
            Object objCollect = this.f185179a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f185184a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f185185a;

            /* JADX INFO: renamed from: wg2.g$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.livesessionview.ui.states.SessionStateViewModel$special$$inlined$mapNotNull$2$2", f = "SessionStateViewModel.kt", l = {52}, m = "emit", v = 2)
            public static final class C3430a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f185186a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f185187b;

                public C3430a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f185186a = obj;
                    this.f185187b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f185185a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3430a c3430a;
                if (dVar instanceof C3430a) {
                    c3430a = (C3430a) dVar;
                    int i14 = c3430a.f185187b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3430a.f185187b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3430a = new C3430a(dVar);
                    }
                } else {
                    c3430a = new C3430a(dVar);
                }
                Object obj2 = c3430a.f185186a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3430a.f185187b;
                if (i15 == 0) {
                    r.b(obj2);
                    jg2.a aVar2 = (jg2.a) obj;
                    Boolean boolValueOf = aVar2 != null ? Boolean.valueOf(aVar2 instanceof jg2.a.C1897a) : null;
                    if (boolValueOf != null) {
                        c3430a.f185187b = 1;
                        if (this.f185185a.emit(boolValueOf, c3430a) == aVar) {
                            return aVar;
                        }
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

        public h(r53.i iVar) {
            this.f185184a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f185184a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f185189a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f185190a;

            /* JADX INFO: renamed from: wg2.g$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.livesessionview.ui.states.SessionStateViewModel$special$$inlined$mapNotNull$3$2", f = "SessionStateViewModel.kt", l = {52}, m = "emit", v = 2)
            public static final class C3431a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f185191a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f185192b;

                public C3431a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f185191a = obj;
                    this.f185192b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f185190a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3431a c3431a;
                if (dVar instanceof C3431a) {
                    c3431a = (C3431a) dVar;
                    int i14 = c3431a.f185192b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3431a.f185192b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3431a = new C3431a(dVar);
                    }
                } else {
                    c3431a = new C3431a(dVar);
                }
                Object obj2 = c3431a.f185191a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3431a.f185192b;
                if (i15 == 0) {
                    r.b(obj2);
                    jg2.a aVar2 = (jg2.a) obj;
                    Boolean boolValueOf = aVar2 != null ? Boolean.valueOf(jg2.b.a(aVar2)) : null;
                    if (boolValueOf != null) {
                        c3431a.f185192b = 1;
                        if (this.f185190a.emit(boolValueOf, c3431a) == aVar) {
                            return aVar;
                        }
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

        public i(r53.i iVar) {
            this.f185189a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f185189a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public g() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        o13.l lVarA = o13.m.a(koinPlatformTools.defaultLazyMode(), new b(this, null, null));
        this.f185146a = lVarA;
        o13.l lVarA2 = o13.m.a(koinPlatformTools.defaultLazyMode(), new c(this, null, null));
        this.f185147b = lVarA2;
        this.f185148c = o13.m.a(koinPlatformTools.defaultLazyMode(), new d(this, null, null));
        o13.l lVarA3 = o13.m.a(koinPlatformTools.defaultLazyMode(), new e(this, null, null));
        this.f185149d = lVarA3;
        Boolean bool = Boolean.FALSE;
        p2 p2VarA = q2.a(bool);
        this.f185150e = p2VarA;
        this.f185151f = p2VarA;
        this.f185152g = ((nf2.a) lVarA2.getValue()).f125898a;
        this.f185153h = ((dg2.a) lVarA.getValue()).f59523a;
        this.f185154i = q2.a(bool);
        p2 p2VarA2 = q2.a(null);
        this.f185155j = p2VarA2;
        this.f185156k = p2VarA2;
        C3428g c3428g = new C3428g(x4().f71482f);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        m2 m2Var = k2.a.f150706c;
        b0 b0Var = (b0) x4().f71482f.getValue();
        b2 b2VarK = s.K(c3428g, aVarA, m2Var, b0Var != null ? b0Var.f131746c : null);
        o2<T> o2Var = b2VarK.f150540a;
        h hVar = new h(b2VarK);
        w9.a aVarA2 = v1.a(this);
        jg2.a aVar = (jg2.a) o2Var.getValue();
        boolean z14 = false;
        this.f185157l = s.K(hVar, aVarA2, m2Var, Boolean.valueOf(aVar != null && (aVar instanceof jg2.a.C1897a)));
        i iVar = new i(b2VarK);
        w9.a aVarA3 = v1.a(this);
        jg2.a aVar2 = (jg2.a) o2Var.getValue();
        if (aVar2 != null && jg2.b.a(aVar2)) {
            z14 = true;
        }
        this.f185158m = s.K(iVar, aVarA3, m2Var, Boolean.valueOf(z14));
        f fVar = new f(b2VarK, this);
        w9.a aVarA4 = v1.a(this);
        bh2.c cVar = (bh2.c) lVarA3.getValue();
        jg2.a aVar3 = (jg2.a) o2Var.getValue();
        cVar.getClass();
        this.f185159n = s.K(fVar, aVarA4, m2Var, Boolean.valueOf(bh2.c.a(aVar3)));
        ge1.b.T(v1.a(this), null, null, new wg2.h(this, null), 3);
        ge1.b.T(v1.a(this), null, null, new wg2.i(this, null), 3);
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final fg2.f x4() {
        return (fg2.f) this.f185148c.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwg2/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
