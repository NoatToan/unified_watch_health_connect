package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initStatsStateCollector$1", f = "ActivityDetailsViewModel.kt", l = {3440}, m = "invokeSuspend", v = 2)
public final class x5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146833b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/t$h;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initStatsStateCollector$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<r53.j<? super nr.t.h>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146836c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f146836c = tVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super nr.t.h> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            a aVar = new a(this.f146836c, dVar);
            aVar.f146834a = jVar;
            aVar.f146835b = th3;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146835b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("StatsState ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            this.f146836c.L1.k(null, new nr.i(null, false, true, null, 11, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146837a;

        public b(t tVar) {
            this.f146837a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            this.f146837a.N1.setValue((nr.t.h) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<nr.t.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i[] f146838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f146839b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<Object[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i[] f146840a;

            public a(r53.i[] iVarArr) {
                this.f146840a = iVarArr;
            }

            @Override // e23.a
            public final Object[] invoke() {
                return new Object[this.f146840a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initStatsStateCollector$1$invokeSuspend$$inlined$combine$1$3", f = "ActivityDetailsViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.q<r53.j<? super nr.t.h>, Object[], t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f146841a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ r53.j f146842b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object[] f146843c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ t f146844d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t13.d dVar, t tVar) {
                super(3, dVar);
                this.f146844d = tVar;
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super nr.t.h> jVar, Object[] objArr, t13.d<? super Unit> dVar) {
                b bVar = new b(dVar, this.f146844d);
                bVar.f146842b = jVar;
                bVar.f146843c = objArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:116:0x01f5  */
            /* JADX WARN: Code duplicated, block: B:165:0x02a4  */
            /* JADX WARN: Code duplicated, block: B:166:0x02a9  */
            /* JADX WARN: Code duplicated, block: B:183:0x02e4  */
            /* JADX WARN: Code duplicated, block: B:205:0x0394  */
            /* JADX WARN: Code duplicated, block: B:210:0x03a4  */
            /* JADX WARN: Code duplicated, block: B:213:0x03af  */
            /* JADX WARN: Code duplicated, block: B:214:0x03b4  */
            /* JADX WARN: Code duplicated, block: B:219:0x03be  */
            /* JADX WARN: Code duplicated, block: B:221:0x03c4  */
            /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
            /* JADX WARN: Code duplicated, block: B:251:0x0450  */
            /* JADX WARN: Code duplicated, block: B:253:0x0460  */
            /* JADX WARN: Code duplicated, block: B:255:0x0469  */
            /* JADX WARN: Code duplicated, block: B:256:0x046d  */
            /* JADX WARN: Code duplicated, block: B:258:0x0473  */
            /* JADX WARN: Code duplicated, block: B:283:0x0508  */
            /* JADX WARN: Code duplicated, block: B:288:0x0516  */
            /* JADX WARN: Code duplicated, block: B:290:0x0519  */
            /* JADX WARN: Code duplicated, block: B:319:0x0580  */
            /* JADX WARN: Code duplicated, block: B:344:0x05d5  */
            /* JADX WARN: Code duplicated, block: B:359:0x05d8 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:377:0x051c A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v20 */
            /* JADX WARN: Type inference failed for: r13v21 */
            /* JADX WARN: Type inference failed for: r13v41 */
            /* JADX WARN: Type inference failed for: r13v46 */
            /* JADX WARN: Type inference failed for: r4v18 */
            /* JADX WARN: Type inference failed for: r4v19, types: [T] */
            /* JADX WARN: Type inference failed for: r4v22 */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r16v9 ps.c0, still in use, count: 2, list:
                  (r16v9 ps.c0) from 0x028f: INVOKE (r16v9 ps.c0) VIRTUAL call: ps.c0.b():java.lang.String A[MD:():java.lang.String (m), WRAPPED]
                  (r16v9 ps.c0) from 0x029e: PHI (r16 I:??) = (r16v4 ps.c0), (r16v9 ps.c0) binds: [B:162:0x029c, B:364:0x029e] A[DONT_GENERATE, DONT_INLINE]
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r43) {
                /*
                    Method dump skipped, instruction units count: 1582
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: qr.x5.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(r53.i[] iVarArr, t tVar) {
            this.f146838a = iVarArr;
            this.f146839b = tVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super nr.t.h> jVar, t13.d dVar) {
            r53.i[] iVarArr = this.f146838a;
            Object objA = s53.m.a(iVarArr, new a(iVarArr), new b(null, this.f146839b), jVar, dVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(t tVar, t13.d<? super x5> dVar) {
        super(2, dVar);
        this.f146833b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x5(this.f146833b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146832a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = t.A2;
            t tVar = this.f146833b;
            r53.w wVar = new r53.w(new c(new r53.i[]{tVar.b5(), tVar.h5(), (r53.z1) tVar.f146551q1.getValue(), (r53.z1) tVar.f146502a1.getValue(), (r53.z1) tVar.Z0.getValue(), (r53.z1) tVar.f146554r1.getValue(), tVar.y5()}, tVar), new a(tVar, null));
            b bVar = new b(tVar);
            this.f146832a = 1;
            if (wVar.collect(bVar, this) == aVar) {
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
