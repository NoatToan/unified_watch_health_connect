package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ln70/x;", "", "Ll70/c;", "dashboardRepository", "Ln70/i3;", "getSecondaryStatsItemsUseCase", "<init>", "(Ll70/c;Ln70/i3;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f124719h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.c f124720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f124721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f124722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f124723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f124724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f124725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f124726g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f124727a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f124728a;

            /* JADX INFO: renamed from: n70.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDailyStatsItemsUseCase$isLoading_delegate$lambda$0$$inlined$map$1$2", f = "GetDailyStatsItemsUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C2393a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f124729a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f124730b;

                public C2393a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f124729a = obj;
                    this.f124730b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f124728a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2393a c2393a;
                yz1.u uVar;
                yz1.d dVar2;
                if (dVar instanceof C2393a) {
                    c2393a = (C2393a) dVar;
                    int i14 = c2393a.f124730b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2393a.f124730b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2393a = new C2393a(dVar);
                    }
                } else {
                    c2393a = new C2393a(dVar);
                }
                Object obj2 = c2393a.f124729a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2393a.f124730b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    j70.k.f fVar = (j70.k.f) obj;
                    if (fVar == null || (dVar2 = fVar.f97565a) == null || (uVar = dVar2.f200298a) == null) {
                        uVar = yz1.u.LOADING;
                    }
                    Boolean boolValueOf = Boolean.valueOf(uVar == yz1.u.LOADING);
                    c2393a.f124730b = 1;
                    if (this.f124728a.emit(boolValueOf, c2393a) == aVar) {
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

        public b(r53.i iVar) {
            this.f124727a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f124727a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public x(l70.c cVar, i3 i3Var) {
        cVar.getClass();
        i3Var.getClass();
        this.f124720a = cVar;
        this.f124721b = i3Var;
        o53.m1 m1VarC = g8.i.c();
        x53.c cVar2 = o53.s0.f129406a;
        this.f124722c = o53.c0.a(t13.g.a.C3052a.d(x53.b.f189152a, m1VarC));
        final int i14 = 0;
        this.f124723d = o13.m.b(new e23.a(this) { // from class: n70.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f124702b;

            {
                this.f124702b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                x xVar = this.f124702b;
                switch (i15) {
                    case 0:
                        return r53.s.K(xVar.f124720a.x3(false), xVar.f124722c, r53.k2.a.a(r53.k2.f150703a, 3), null);
                    case 1:
                        return r53.s.K(xVar.f124720a.j4(), xVar.f124722c, r53.k2.a.a(r53.k2.f150703a, 3), null);
                    case 2:
                        s53.k kVarD2 = xVar.f124720a.D2();
                        u53.d dVar = xVar.f124722c;
                        r53.k2.f150703a.getClass();
                        return r53.s.K(kVarD2, dVar, r53.k2.a.f150706c, null);
                    default:
                        int i16 = x.f124719h;
                        return new x.b((r53.o2) xVar.f124723d.getValue());
                }
            }
        });
        final int i15 = 1;
        this.f124724e = o13.m.b(new e23.a(this) { // from class: n70.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f124702b;

            {
                this.f124702b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                x xVar = this.f124702b;
                switch (i16) {
                    case 0:
                        return r53.s.K(xVar.f124720a.x3(false), xVar.f124722c, r53.k2.a.a(r53.k2.f150703a, 3), null);
                    case 1:
                        return r53.s.K(xVar.f124720a.j4(), xVar.f124722c, r53.k2.a.a(r53.k2.f150703a, 3), null);
                    case 2:
                        s53.k kVarD2 = xVar.f124720a.D2();
                        u53.d dVar = xVar.f124722c;
                        r53.k2.f150703a.getClass();
                        return r53.s.K(kVarD2, dVar, r53.k2.a.f150706c, null);
                    default:
                        int i17 = x.f124719h;
                        return new x.b((r53.o2) xVar.f124723d.getValue());
                }
            }
        });
        final int i16 = 2;
        this.f124725f = o13.m.b(new e23.a(this) { // from class: n70.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f124702b;

            {
                this.f124702b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                x xVar = this.f124702b;
                switch (i17) {
                    case 0:
                        return r53.s.K(xVar.f124720a.x3(false), xVar.f124722c, r53.k2.a.a(r53.k2.f150703a, 3), null);
                    case 1:
                        return r53.s.K(xVar.f124720a.j4(), xVar.f124722c, r53.k2.a.a(r53.k2.f150703a, 3), null);
                    case 2:
                        s53.k kVarD2 = xVar.f124720a.D2();
                        u53.d dVar = xVar.f124722c;
                        r53.k2.f150703a.getClass();
                        return r53.s.K(kVarD2, dVar, r53.k2.a.f150706c, null);
                    default:
                        int i18 = x.f124719h;
                        return new x.b((r53.o2) xVar.f124723d.getValue());
                }
            }
        });
        final int i17 = 3;
        this.f124726g = o13.m.b(new e23.a(this) { // from class: n70.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f124702b;

            {
                this.f124702b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                x xVar = this.f124702b;
                switch (i18) {
                    case 0:
                        return r53.s.K(xVar.f124720a.x3(false), xVar.f124722c, r53.k2.a.a(r53.k2.f150703a, 3), null);
                    case 1:
                        return r53.s.K(xVar.f124720a.j4(), xVar.f124722c, r53.k2.a.a(r53.k2.f150703a, 3), null);
                    case 2:
                        s53.k kVarD2 = xVar.f124720a.D2();
                        u53.d dVar = xVar.f124722c;
                        r53.k2.f150703a.getClass();
                        return r53.s.K(kVarD2, dVar, r53.k2.a.f150706c, null);
                    default:
                        int i19 = x.f124719h;
                        return new x.b((r53.o2) xVar.f124723d.getValue());
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln70/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
