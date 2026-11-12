package r01;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import vb.h;
import x01.i;
import zd0.g1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lr01/b;", "Lfe0/b;", "Lx01/i;", "nutritionStateProvider", "<init>", "(Lx01/i;)V", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements fe0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f148782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x01.e f148783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z53.b f148784c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.promo.NutritionSetupPromoWatcherImpl$1", f = "NutritionSetupPromoWatcherImpl.kt", l = {25}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f148786b;

        /* JADX INFO: renamed from: r01.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2802a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f148788a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f148789b;

            /* JADX INFO: renamed from: r01.b$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.promo.NutritionSetupPromoWatcherImpl$1$1", f = "NutritionSetupPromoWatcherImpl.kt", l = {51, 37}, m = "emit", v = 2)
            public static final class C2803a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public x01.e f148790a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public z53.b f148791b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public b f148792c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f148793d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ C2802a<T> f148794e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public int f148795f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2803a(C2802a<? super T> c2802a, t13.d<? super C2803a> dVar) {
                    super(dVar);
                    this.f148794e = c2802a;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f148793d = obj;
                    this.f148795f |= Integer.MIN_VALUE;
                    return this.f148794e.emit(null, this);
                }
            }

            public C2802a(b bVar, b0 b0Var) {
                this.f148788a = bVar;
                this.f148789b = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
            
                if (r7.w(r0) == r1) goto L30;
             */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(x01.e eVar, t13.d<? super Unit> dVar) {
                C2803a c2803a;
                z53.b bVar;
                x01.e eVar2;
                b bVar2;
                if (dVar instanceof C2803a) {
                    c2803a = (C2803a) dVar;
                    int i14 = c2803a.f148795f;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2803a.f148795f = i14 - Integer.MIN_VALUE;
                    } else {
                        c2803a = new C2803a(this, dVar);
                    }
                } else {
                    c2803a = new C2803a(this, dVar);
                }
                Object obj = c2803a.f148793d;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2803a.f148795f;
                try {
                    if (i15 != 0) {
                        if (i15 == 1) {
                            bVar2 = c2803a.f148792c;
                            bVar = c2803a.f148791b;
                            eVar2 = c2803a.f148790a;
                            r.b(obj);
                        } else {
                            if (i15 != 2) {
                                h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r.b(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    r.b(obj);
                    b bVar3 = this.f148788a;
                    bVar = bVar3.f148784c;
                    c2803a.f148790a = eVar;
                    c2803a.f148791b = bVar;
                    c2803a.f148792c = bVar3;
                    c2803a.f148795f = 1;
                    if (bVar.c(c2803a) != aVar) {
                        eVar2 = eVar;
                        bVar2 = bVar3;
                    }
                    return aVar;
                    if (bVar2.f148783b == null) {
                        bVar2.f148783b = eVar2;
                        Unit unit = Unit.INSTANCE;
                        bVar.e(null);
                        return unit;
                    }
                    bVar2.f148783b = eVar2;
                    Unit unit2 = Unit.INSTANCE;
                    bVar.e(null);
                    i2.f36769a.getClass();
                    i2.a.k(a2.PROMOTIONS, "NutritionSetupPromoWatcherImpl", "Nutrition state changed remapping promos " + eVar2);
                    g1 g1Var = (g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null);
                    c2803a.f148790a = null;
                    c2803a.f148791b = null;
                    c2803a.f148792c = null;
                    c2803a.f148795f = 2;
                } catch (Throwable th3) {
                    bVar.e(null);
                    throw th3;
                }
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = b.this.new a(dVar);
            aVar.f148786b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to r01.b$a for r5v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f148786b
                o53.b0 r0 = (o53.b0) r0
                u13.a r1 = u13.a.COROUTINE_SUSPENDED
                int r2 = r5.f148785a
                r3 = 1
                if (r2 == 0) goto L18
                if (r2 == r3) goto L14
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
            L12:
                r6 = 0
                return r6
            L14:
                o13.r.b(r6)
                goto L34
            L18:
                o13.r.b(r6)
                r01.b r6 = r01.b.this
                x01.i r2 = r6.f148782a
                r53.b2 r2 = x01.i.f188280c
                r01.b$a$a r4 = new r01.b$a$a
                r4.<init>(r6, r0)
                r6 = 0
                r5.f148786b = r6
                r5.f148785a = r3
                r53.o2<T> r6 = r2.f150540a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r1) goto L34
                return r1
            L34:
                o2.c.f()
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: r01.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new C2804b(null);
    }

    public b(i iVar) {
        iVar.getClass();
        this.f148782a = iVar;
        x53.c cVar = s0.f129406a;
        u53.d dVarA = c0.a(x53.b.f189152a);
        this.f148784c = z53.c.a();
        ge1.b.T(dVarA, null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: r01.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr01/b$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2804b {
        public /* synthetic */ C2804b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2804b() {
        }
    }
}
