package bo2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import e23.p;
import fo2.e0;
import fo2.f0;
import fo2.s;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c2;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.r0;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2", f = "AlipayAppletInstallationViewModel.kt", l = {141, 145, 217}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g1 f19283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f19284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f19285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f19286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c2 f19287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f19289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bo2.e f19290h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$1", f = "AlipayAppletInstallationViewModel.kt", l = {150, 151}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g1 f19292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f19293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ bo2.e f19294d;

        /* JADX INFO: renamed from: bo2.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfo2/e0;", "<anonymous>", "()Lfo2/e0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$1$1", f = "AlipayAppletInstallationViewModel.kt", l = {151}, m = "invokeSuspend", v = 2)
        public static final class C0280a extends v13.i implements e23.l<t13.d<? super e0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f19296b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f19297c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0280a(g1 g1Var, String str, t13.d<? super C0280a> dVar) {
                super(1, dVar);
                this.f19296b = g1Var;
                this.f19297c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new C0280a(this.f19296b, this.f19297c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super e0> dVar) {
                return ((C0280a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws NewFitPayException {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f19295a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f19295a = 1;
                    Object objN = this.f19296b.N(this.f19297c, this);
                    return objN == aVar ? aVar : objN;
                }
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class b extends q implements e23.l<e0.a, Boolean> {
            public b(Object obj) {
                super(1, obj, bo2.e.class, "isInitialized", "isInitialized(Lcom/garmin/feature/garminpay/providers/gpay/model/SecurityDomain$State;)Z", 0);
            }

            @Override // e23.l
            public final Boolean invoke(e0.a aVar) {
                return Boolean.valueOf(bo2.e.y4((bo2.e) this.receiver, aVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1 g1Var, s sVar, bo2.e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f19292b = g1Var;
            this.f19293c = sVar;
            this.f19294d = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f19292b, this.f19293c, this.f19294d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (bo2.e.z4(r2, r1, r6, r5) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NewFitPayException {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f19291a;
            g1 g1Var = this.f19292b;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            fo2.p pVar = this.f19293c.f73111k;
            f0.a aVar2 = f0.a.ALIPAY;
            this.f19291a = 1;
            obj = g1Var.k(pVar, aVar2, this);
            if (obj != aVar) {
            }
            return aVar;
            C0280a c0280a = new C0280a(g1Var, (String) obj, null);
            bo2.e eVar = this.f19294d;
            b bVar = new b(eVar);
            this.f19291a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$2", f = "AlipayAppletInstallationViewModel.kt", l = {159, SyslogConstants.LOG_LOCAL4, 161, 162}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f19300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g1 f19301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ bo2.e f19302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ s f19303f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfo2/e0;", "<anonymous>", "()Lfo2/e0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$2$1", f = "AlipayAppletInstallationViewModel.kt", l = {SyslogConstants.LOG_LOCAL4}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super e0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f19305b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f19306c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g1 g1Var, String str, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f19305b = g1Var;
                this.f19306c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f19305b, this.f19306c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super e0> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws NewFitPayException {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f19304a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f19304a = 1;
                    Object objN = this.f19305b.N(this.f19306c, this);
                    return objN == aVar ? aVar : objN;
                }
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX INFO: renamed from: bo2.l$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class C0281b extends q implements e23.l<e0.a, Boolean> {
            public C0281b(Object obj) {
                super(1, obj, bo2.e.class, "isDeleted", "isDeleted(Lcom/garmin/feature/garminpay/providers/gpay/model/SecurityDomain$State;)Z", 0);
            }

            @Override // e23.l
            public final Boolean invoke(e0.a aVar) {
                return Boolean.valueOf(bo2.e.x4((bo2.e) this.receiver, aVar));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfo2/e0;", "<anonymous>", "()Lfo2/e0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$2$3", f = "AlipayAppletInstallationViewModel.kt", l = {162}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.l<t13.d<? super e0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19307a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f19308b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f19309c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(g1 g1Var, String str, t13.d<? super c> dVar) {
                super(1, dVar);
                this.f19308b = g1Var;
                this.f19309c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new c(this.f19308b, this.f19309c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super e0> dVar) {
                return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws NewFitPayException {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f19307a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f19307a = 1;
                    Object objN = this.f19308b.N(this.f19309c, this);
                    return objN == aVar ? aVar : objN;
                }
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class d extends q implements e23.l<e0.a, Boolean> {
            public d(Object obj) {
                super(1, obj, bo2.e.class, "isInitialized", "isInitialized(Lcom/garmin/feature/garminpay/providers/gpay/model/SecurityDomain$State;)Z", 0);
            }

            @Override // e23.l
            public final Boolean invoke(e0.a aVar) {
                return Boolean.valueOf(bo2.e.y4((bo2.e) this.receiver, aVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var, g1 g1Var, bo2.e eVar, s sVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f19300c = e0Var;
            this.f19301d = g1Var;
            this.f19302e = eVar;
            this.f19303f = sVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f19300c, this.f19301d, this.f19302e, this.f19303f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007d A[PHI: r11
          0x007d: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v0 java.lang.Object) binds: [B:26:0x007a, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
        
            if (bo2.e.z4(r6, r1, r11, r10) == r0) goto L30;
         */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NewFitPayException {
            String link;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f19299b;
            bo2.e eVar = this.f19302e;
            g1 g1Var = this.f19301d;
            if (i14 == 0) {
                r.b(obj);
                e0 e0Var = this.f19300c;
                fo2.p pVar = (fo2.p) e0Var.getLinks().f51142a.get("self");
                if (pVar == null || (link = pVar.getLink()) == null) {
                    androidx.core.view.j.r(e0Var, "No self link in ");
                    return null;
                }
                this.f19298a = link;
                this.f19299b = 1;
                if (g1Var.r(link, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                link = this.f19298a;
                r.b(obj);
            } else {
                if (i14 == 2) {
                    r.b(obj);
                    fo2.p pVar2 = this.f19303f.f73111k;
                    f0.a aVar2 = f0.a.ALIPAY;
                    this.f19298a = null;
                    this.f19299b = 3;
                    obj = g1Var.k(pVar2, aVar2, this);
                    if (obj != aVar) {
                        c cVar = new c(g1Var, (String) obj, null);
                        d dVar = new d(eVar);
                        this.f19298a = null;
                        this.f19299b = 4;
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    r.b(obj);
                    c cVar2 = new c(g1Var, (String) obj, null);
                    d dVar2 = new d(eVar);
                    this.f19298a = null;
                    this.f19299b = 4;
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            }
            return Unit.INSTANCE;
            a aVar3 = new a(g1Var, link, null);
            C0281b c0281b = new C0281b(eVar);
            this.f19298a = null;
            this.f19299b = 2;
            if (bo2.e.z4(eVar, aVar3, c0281b, this) != aVar) {
                fo2.p pVar3 = this.f19303f.f73111k;
                f0.a aVar4 = f0.a.ALIPAY;
                this.f19298a = null;
                this.f19299b = 3;
                obj = g1Var.k(pVar3, aVar4, this);
                if (obj != aVar) {
                    c cVar3 = new c(g1Var, (String) obj, null);
                    d dVar3 = new d(eVar);
                    this.f19298a = null;
                    this.f19299b = 4;
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$3", f = "AlipayAppletInstallationViewModel.kt", l = {169}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ bo2.e f19311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g1 f19312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s f19313d;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfo2/e0;", "<anonymous>", "()Lfo2/e0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$3$1", f = "AlipayAppletInstallationViewModel.kt", l = {169}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super e0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19314a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f19315b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ s f19316c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g1 g1Var, s sVar, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f19315b = g1Var;
                this.f19316c = sVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f19315b, this.f19316c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super e0> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws NewFitPayException {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f19314a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                String str = this.f19316c.f73101a;
                this.f19314a = 1;
                Object objM = this.f19315b.M(str, this);
                return objM == aVar ? aVar : objM;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class b extends q implements e23.l<e0.a, Boolean> {
            public b(Object obj) {
                super(1, obj, bo2.e.class, "isInitialized", "isInitialized(Lcom/garmin/feature/garminpay/providers/gpay/model/SecurityDomain$State;)Z", 0);
            }

            @Override // e23.l
            public final Boolean invoke(e0.a aVar) {
                return Boolean.valueOf(bo2.e.y4((bo2.e) this.receiver, aVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(bo2.e eVar, g1 g1Var, s sVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f19311b = eVar;
            this.f19312c = g1Var;
            this.f19313d = sVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f19311b, this.f19312c, this.f19313d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f19310a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(this.f19312c, this.f19313d, null);
                bo2.e eVar = this.f19311b;
                b bVar = new b(eVar);
                this.f19310a = 1;
                if (bo2.e.z4(eVar, aVar2, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$4", f = "AlipayAppletInstallationViewModel.kt", l = {182, 183, SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f19318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ bo2.e f19319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g1 f19320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s f19321e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfo2/e0;", "<anonymous>", "()Lfo2/e0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$4$1", f = "AlipayAppletInstallationViewModel.kt", l = {182}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super e0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19322a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f19323b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f19324c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g1 g1Var, String str, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f19323b = g1Var;
                this.f19324c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f19323b, this.f19324c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super e0> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws NewFitPayException {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f19322a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f19322a = 1;
                    Object objN = this.f19323b.N(this.f19324c, this);
                    return objN == aVar ? aVar : objN;
                }
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class b extends q implements e23.l<e0.a, Boolean> {
            public b(Object obj) {
                super(1, obj, bo2.e.class, "isDeleted", "isDeleted(Lcom/garmin/feature/garminpay/providers/gpay/model/SecurityDomain$State;)Z", 0);
            }

            @Override // e23.l
            public final Boolean invoke(e0.a aVar) {
                return Boolean.valueOf(bo2.e.x4((bo2.e) this.receiver, aVar));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfo2/e0;", "<anonymous>", "()Lfo2/e0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$4$3", f = "AlipayAppletInstallationViewModel.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.l<t13.d<? super e0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f19326b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f19327c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(g1 g1Var, String str, t13.d<? super c> dVar) {
                super(1, dVar);
                this.f19326b = g1Var;
                this.f19327c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new c(this.f19326b, this.f19327c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super e0> dVar) {
                return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws NewFitPayException {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f19325a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f19325a = 1;
                    Object objN = this.f19326b.N(this.f19327c, this);
                    return objN == aVar ? aVar : objN;
                }
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX INFO: renamed from: bo2.l$d$d, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class C0282d extends q implements e23.l<e0.a, Boolean> {
            public C0282d(Object obj) {
                super(1, obj, bo2.e.class, "isInitialized", "isInitialized(Lcom/garmin/feature/garminpay/providers/gpay/model/SecurityDomain$State;)Z", 0);
            }

            @Override // e23.l
            public final Boolean invoke(e0.a aVar) {
                return Boolean.valueOf(bo2.e.y4((bo2.e) this.receiver, aVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e0 e0Var, bo2.e eVar, g1 g1Var, s sVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f19318b = e0Var;
            this.f19319c = eVar;
            this.f19320d = g1Var;
            this.f19321e = sVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f19318b, this.f19319c, this.f19320d, this.f19321e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        
            if (bo2.e.z4(r6, r1, r10, r9) == r0) goto L25;
         */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NewFitPayException {
            String link;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f19317a;
            g1 g1Var = this.f19320d;
            bo2.e eVar = this.f19319c;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else if (i14 == 2) {
                    r.b(obj);
                    c cVar = new c(g1Var, (String) obj, null);
                    C0282d c0282d = new C0282d(eVar);
                    this.f19317a = 3;
                } else {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            e0 e0Var = this.f19318b;
            fo2.p pVar = (fo2.p) e0Var.getLinks().f51142a.get("self");
            if (pVar == null || (link = pVar.getLink()) == null) {
                androidx.core.view.j.r(e0Var, "No self link in ");
                return null;
            }
            a aVar2 = new a(g1Var, link, null);
            b bVar = new b(eVar);
            this.f19317a = 1;
            if (bo2.e.z4(eVar, aVar2, bVar, this) != aVar) {
            }
            return aVar;
            fo2.p pVar2 = this.f19321e.f73111k;
            f0.a aVar3 = f0.a.ALIPAY;
            this.f19317a = 2;
            obj = g1Var.k(pVar2, aVar3, this);
            if (obj != aVar) {
                c cVar2 = new c(g1Var, (String) obj, null);
                C0282d c0282d2 = new C0282d(eVar);
                this.f19317a = 3;
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$5", f = "AlipayAppletInstallationViewModel.kt", l = {192, 193, 194, 195}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f19330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g1 f19331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ bo2.e f19332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ s f19333f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfo2/e0;", "<anonymous>", "()Lfo2/e0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$5$1", f = "AlipayAppletInstallationViewModel.kt", l = {193}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super e0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19334a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f19335b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f19336c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g1 g1Var, String str, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f19335b = g1Var;
                this.f19336c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f19335b, this.f19336c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super e0> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws NewFitPayException {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f19334a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f19334a = 1;
                    Object objN = this.f19335b.N(this.f19336c, this);
                    return objN == aVar ? aVar : objN;
                }
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class b extends q implements e23.l<e0.a, Boolean> {
            public b(Object obj) {
                super(1, obj, bo2.e.class, "isDeleted", "isDeleted(Lcom/garmin/feature/garminpay/providers/gpay/model/SecurityDomain$State;)Z", 0);
            }

            @Override // e23.l
            public final Boolean invoke(e0.a aVar) {
                return Boolean.valueOf(bo2.e.x4((bo2.e) this.receiver, aVar));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfo2/e0;", "<anonymous>", "()Lfo2/e0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$1$5$3", f = "AlipayAppletInstallationViewModel.kt", l = {195}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.l<t13.d<? super e0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19337a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f19338b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f19339c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(g1 g1Var, String str, t13.d<? super c> dVar) {
                super(1, dVar);
                this.f19338b = g1Var;
                this.f19339c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new c(this.f19338b, this.f19339c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super e0> dVar) {
                return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws NewFitPayException {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f19337a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f19337a = 1;
                    Object objN = this.f19338b.N(this.f19339c, this);
                    return objN == aVar ? aVar : objN;
                }
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class d extends q implements e23.l<e0.a, Boolean> {
            public d(Object obj) {
                super(1, obj, bo2.e.class, "isInitialized", "isInitialized(Lcom/garmin/feature/garminpay/providers/gpay/model/SecurityDomain$State;)Z", 0);
            }

            @Override // e23.l
            public final Boolean invoke(e0.a aVar) {
                return Boolean.valueOf(bo2.e.y4((bo2.e) this.receiver, aVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e0 e0Var, g1 g1Var, bo2.e eVar, s sVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f19330c = e0Var;
            this.f19331d = g1Var;
            this.f19332e = eVar;
            this.f19333f = sVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f19330c, this.f19331d, this.f19332e, this.f19333f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007d A[PHI: r11
          0x007d: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v0 java.lang.Object) binds: [B:26:0x007a, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
        
            if (bo2.e.z4(r6, r1, r11, r10) == r0) goto L30;
         */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NewFitPayException {
            String link;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f19329b;
            bo2.e eVar = this.f19332e;
            g1 g1Var = this.f19331d;
            if (i14 == 0) {
                r.b(obj);
                e0 e0Var = this.f19330c;
                fo2.p pVar = (fo2.p) e0Var.getLinks().f51142a.get("self");
                if (pVar == null || (link = pVar.getLink()) == null) {
                    androidx.core.view.j.r(e0Var, "No self link in ");
                    return null;
                }
                this.f19328a = link;
                this.f19329b = 1;
                if (g1Var.r(link, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                link = this.f19328a;
                r.b(obj);
            } else {
                if (i14 == 2) {
                    r.b(obj);
                    fo2.p pVar2 = this.f19333f.f73111k;
                    f0.a aVar2 = f0.a.ALIPAY;
                    this.f19328a = null;
                    this.f19329b = 3;
                    obj = g1Var.k(pVar2, aVar2, this);
                    if (obj != aVar) {
                        c cVar = new c(g1Var, (String) obj, null);
                        d dVar = new d(eVar);
                        this.f19328a = null;
                        this.f19329b = 4;
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    r.b(obj);
                    c cVar2 = new c(g1Var, (String) obj, null);
                    d dVar2 = new d(eVar);
                    this.f19328a = null;
                    this.f19329b = 4;
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            }
            return Unit.INSTANCE;
            a aVar3 = new a(g1Var, link, null);
            b bVar = new b(eVar);
            this.f19328a = null;
            this.f19329b = 2;
            if (bo2.e.z4(eVar, aVar3, bVar, this) != aVar) {
                fo2.p pVar3 = this.f19333f.f73111k;
                f0.a aVar4 = f0.a.ALIPAY;
                this.f19328a = null;
                this.f19329b = 3;
                obj = g1Var.k(pVar3, aVar4, this);
                if (obj != aVar) {
                    c cVar3 = new c(g1Var, (String) obj, null);
                    d dVar3 = new d(eVar);
                    this.f19328a = null;
                    this.f19329b = 4;
                }
            }
            return aVar;
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19340a;

        static {
            int[] iArr = new int[e0.a.values().length];
            try {
                iArr[e0.a.INITIALIZATION_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.a.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.a.INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.a.DELETE_IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e0.a.DELETE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19340a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$disconnectionObserverJob$1", f = "AlipayAppletInstallationViewModel.kt", l = {202}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ bo2.e f19342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0<i0<Unit>> f19343c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ bo2.e f19344a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0<i0<Unit>> f19345b;

            public a(bo2.e eVar, r0<i0<Unit>> r0Var) {
                this.f19344a = eVar;
                this.f19345b = r0Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                bo2.e.f19250d.f19254a.a().info("receiving device disconnect event of ESN " + this.f19344a.B4());
                g8.i.q("Device disconnected", this.f19345b.f105810a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(bo2.e eVar, r0<i0<Unit>> r0Var, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f19342b = eVar;
            this.f19343c = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f19342b, this.f19343c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f19341a;
            if (i14 == 0) {
                r.b(obj);
                bo2.e.a aVar2 = bo2.e.f19250d;
                bo2.e eVar = this.f19342b;
                r53.f fVarI = r53.s.i(new j(eVar.B4(), null));
                a aVar3 = new a(eVar, this.f19343c);
                this.f19341a = 1;
                if (fVarI.collect(aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletImpl$2$manualSyncJob$1", f = "AlipayAppletInstallationViewModel.kt", l = {210}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ bo2.e f19347b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(bo2.e eVar, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f19347b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f19347b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0043  */
        /* JADX WARN: Code duplicated, block: B:16:0x004b  */
        /* JADX WARN: Code duplicated, block: B:19:0x0050  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:12:0x0022). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r5.f19346a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                o13.r.b(r6)
                goto L22
            Ld:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
                r6 = 0
                return r6
            L14:
                o13.r.b(r6)
            L17:
                r5.f19346a = r2
                r3 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r6 = o53.m0.b(r3, r5)
                if (r6 != r0) goto L22
                return r0
            L22:
                bo2.e$a r6 = bo2.e.f19250d
                wr2.m r6 = r6.f19254a
                org.slf4j.Logger r6 = r6.a()
                java.lang.String r1 = "try to trigger manual sync"
                r6.info(r1)
                ps2.w r6 = ps2.w.f140538a
                bo2.e r1 = r5.f19347b
                long r3 = r1.B4()
                is2.b r1 = is2.b.FITPAY
                r6.getClass()
                ps2.n r6 = ps2.w.i(r3)
                r3 = 0
                if (r6 == 0) goto L4c
                ms2.d r6 = r6.g(r1)
                boolean r1 = r6 instanceof zn2.t
                if (r1 == 0) goto L4c
                r3 = r6
            L4c:
                zn2.t r3 = (zn2.t) r3
                if (r3 == 0) goto L17
                r3.m()
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: bo2.l.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(bo2.e eVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f19290h = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f19290h, dVar);
        lVar.f19289g = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:51:0x012c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0171  */
    /* JADX WARN: Type inference failed for: r5v11, types: [T, o53.j0] */
    /* JADX WARN: Type inference failed for: r5v16, types: [T, o53.j0] */
    /* JADX WARN: Type inference failed for: r5v21, types: [T, o53.j0] */
    /* JADX WARN: Type inference failed for: r5v26, types: [T, o53.j0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, o53.j0] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        g1 g1Var;
        Object objO;
        g1 g1Var2;
        s sVar;
        r0 r0Var;
        Object objM;
        s sVar2;
        g1 g1Var3;
        e0 e0Var;
        e0.a aVar;
        int i14;
        bo2.e eVar;
        c2 c2VarT;
        c2 c2VarT2;
        c2 c2Var;
        c2 c2Var2;
        i0 i0Var;
        b0 b0Var = (b0) this.f19289g;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f19288f;
        bo2.e eVar2 = this.f19290h;
        if (i15 == 0) {
            r.b(obj);
            bo2.e.a aVar3 = bo2.e.f19250d;
            g1Var = eVar2.C4().f205979a;
            long jB4 = eVar2.B4();
            this.f19289g = b0Var;
            this.f19283a = g1Var;
            this.f19288f = 1;
            objO = g1Var.O(jB4, this);
            if (objO != aVar2) {
            }
            return aVar2;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c2Var2 = this.f19287e;
                c2Var = this.f19286d;
                try {
                    r.b(obj);
                    c2Var.c(null);
                    c2Var2.c(null);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    c2Var.c(null);
                    c2Var2.c(null);
                    throw th;
                }
            }
            r0Var = this.f19285c;
            sVar = this.f19284b;
            g1Var2 = this.f19283a;
            r.b(obj);
            objM = obj;
            sVar2 = sVar;
            g1Var3 = g1Var2;
            e0Var = (e0) objM;
            if (e0Var != null) {
                aVar = e0Var.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String();
            } else {
                aVar = null;
            }
            if (aVar == null) {
                i14 = -1;
            } else {
                i14 = f.f19340a[aVar.ordinal()];
            }
            eVar = this.f19290h;
            if (i14 != -1) {
                bo2.e.f19250d.f19254a.a().info("No security domain installed, POST a new one.");
                r0Var.f105810a = ge1.b.j(b0Var, null, null, new a(g1Var3, sVar2, eVar, null), 3);
            } else if (i14 != 1) {
                bo2.e.f19250d.f19254a.a().info("Previous security domain installation failed, DELETE it and then POST a new one.");
                r0Var.f105810a = ge1.b.j(b0Var, null, null, new b(e0Var, g1Var3, eVar, sVar2, null), 3);
            } else if (i14 != 2) {
                bo2.e.f19250d.f19254a.a().info("A security domain is under installation, start polling its state.");
                r0Var.f105810a = ge1.b.j(b0Var, null, null, new c(eVar, g1Var3, sVar2, null), 3);
            } else {
                if (i14 != 3) {
                    bo2.e.f19250d.f19254a.a().info("A security domain has been installed, finish installation.");
                    return Unit.INSTANCE;
                }
                if (i14 != 4) {
                    bo2.e.f19250d.f19254a.a().info("A security domain is under deletion, start polling its state and then POST it again.");
                    r0Var.f105810a = ge1.b.j(b0Var, null, null, new d(e0Var, eVar, g1Var3, sVar2, null), 3);
                } else {
                    if (i14 == 5) {
                        u0.r();
                        return null;
                    }
                    bo2.e.f19250d.f19254a.a().info("A security domain was failing to be deleted, delete it again and then also POST it again.");
                    r0Var.f105810a = ge1.b.j(b0Var, null, null, new e(e0Var, g1Var3, eVar, sVar2, null), 3);
                }
            }
            c2VarT = ge1.b.T(b0Var, null, null, new g(eVar2, r0Var, null), 3);
            c2VarT2 = ge1.b.T(b0Var, null, null, new h(eVar2, null), 3);
            try {
                i0Var = (i0) r0Var.f105810a;
                this.f19289g = null;
                this.f19283a = null;
                this.f19284b = null;
                this.f19285c = null;
                this.f19286d = c2VarT;
                this.f19287e = c2VarT2;
                this.f19288f = 3;
                if (i0Var.await(this) != aVar2) {
                    c2Var = c2VarT;
                    c2Var2 = c2VarT2;
                    c2Var.c(null);
                    c2Var2.c(null);
                    return Unit.INSTANCE;
                }
                return aVar2;
            } catch (Throwable th4) {
                th = th4;
                c2Var = c2VarT;
                c2Var2 = c2VarT2;
                c2Var.c(null);
                c2Var2.c(null);
                throw th;
            }
        }
        g1Var = this.f19283a;
        r.b(obj);
        objO = obj;
        g1Var2 = g1Var;
        sVar = (s) objO;
        if (sVar == null) {
            bo2.e.a aVar4 = bo2.e.f19250d;
            kg.f.n(org.apache.commons.lang3.e.e(eVar2.B4(), "Cannot get device with ESN #"));
            return null;
        }
        r0Var = new r0();
        String str = sVar.f73101a;
        this.f19289g = b0Var;
        this.f19283a = g1Var2;
        this.f19284b = sVar;
        this.f19285c = r0Var;
        this.f19288f = 2;
        objM = g1Var2.M(str, this);
        if (objM != aVar2) {
            sVar2 = sVar;
            g1Var3 = g1Var2;
            e0Var = (e0) objM;
            if (e0Var != null) {
                aVar = e0Var.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String();
            } else {
                aVar = null;
            }
            if (aVar == null) {
                i14 = -1;
            } else {
                i14 = f.f19340a[aVar.ordinal()];
            }
            eVar = this.f19290h;
            if (i14 != -1) {
                bo2.e.f19250d.f19254a.a().info("No security domain installed, POST a new one.");
                r0Var.f105810a = ge1.b.j(b0Var, null, null, new a(g1Var3, sVar2, eVar, null), 3);
            } else if (i14 != 1) {
                bo2.e.f19250d.f19254a.a().info("Previous security domain installation failed, DELETE it and then POST a new one.");
                r0Var.f105810a = ge1.b.j(b0Var, null, null, new b(e0Var, g1Var3, eVar, sVar2, null), 3);
            } else if (i14 != 2) {
                bo2.e.f19250d.f19254a.a().info("A security domain is under installation, start polling its state.");
                r0Var.f105810a = ge1.b.j(b0Var, null, null, new c(eVar, g1Var3, sVar2, null), 3);
            } else {
                if (i14 != 3) {
                    bo2.e.f19250d.f19254a.a().info("A security domain has been installed, finish installation.");
                    return Unit.INSTANCE;
                }
                if (i14 != 4) {
                    bo2.e.f19250d.f19254a.a().info("A security domain is under deletion, start polling its state and then POST it again.");
                    r0Var.f105810a = ge1.b.j(b0Var, null, null, new d(e0Var, eVar, g1Var3, sVar2, null), 3);
                } else {
                    if (i14 == 5) {
                        u0.r();
                        return null;
                    }
                    bo2.e.f19250d.f19254a.a().info("A security domain was failing to be deleted, delete it again and then also POST it again.");
                    r0Var.f105810a = ge1.b.j(b0Var, null, null, new e(e0Var, g1Var3, eVar, sVar2, null), 3);
                }
            }
            c2VarT = ge1.b.T(b0Var, null, null, new g(eVar2, r0Var, null), 3);
            c2VarT2 = ge1.b.T(b0Var, null, null, new h(eVar2, null), 3);
            i0Var = (i0) r0Var.f105810a;
            this.f19289g = null;
            this.f19283a = null;
            this.f19284b = null;
            this.f19285c = null;
            this.f19286d = c2VarT;
            this.f19287e = c2VarT2;
            this.f19288f = 3;
            if (i0Var.await(this) != aVar2) {
                c2Var = c2VarT;
                c2Var2 = c2VarT2;
                c2Var.c(null);
                c2Var2.c(null);
                return Unit.INSTANCE;
            }
        }
        return aVar2;
    }
}
