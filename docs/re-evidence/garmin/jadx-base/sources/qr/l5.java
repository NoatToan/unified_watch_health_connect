package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initActivityShareDataCollector$1", f = "ActivityDetailsViewModel.kt", l = {1784}, m = "invokeSuspend", v = 2)
public final class l5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146323b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/m;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initActivityShareDataCollector$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<r53.j<? super nr.m>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146325b;

        public a(t13.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super nr.m> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            a aVar = new a(dVar);
            aVar.f146324a = jVar;
            aVar.f146325b = th3;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146325b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strP = am.j.p("activity basic data ", th3);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strP);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146326a;

        public b(t tVar) {
            this.f146326a = tVar;
        }

        /* JADX WARN: Code duplicated, block: B:105:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:106:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:109:0x01df  */
        /* JADX WARN: Code duplicated, block: B:113:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:117:0x020a  */
        /* JADX WARN: Code duplicated, block: B:129:0x0247  */
        /* JADX WARN: Code duplicated, block: B:135:0x0274  */
        /* JADX WARN: Code duplicated, block: B:141:0x0287 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:147:0x02e8  */
        /* JADX WARN: Code duplicated, block: B:148:0x02eb  */
        /* JADX WARN: Code duplicated, block: B:151:0x02f0  */
        /* JADX WARN: Code duplicated, block: B:152:0x02f3  */
        /* JADX WARN: Code duplicated, block: B:154:0x02f6  */
        /* JADX WARN: Code duplicated, block: B:155:0x02f9  */
        /* JADX WARN: Code duplicated, block: B:157:0x02fc  */
        /* JADX WARN: Code duplicated, block: B:161:0x031c  */
        /* JADX WARN: Code duplicated, block: B:168:0x020d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:170:0x0013 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:173:0x01fc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:175:0x01ea A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:184:0x0282 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:190:0x0324 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:192:0x0316 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x0134  */
        /* JADX WARN: Code duplicated, block: B:74:0x0153  */
        /* JADX WARN: Multi-variable type inference failed */
        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v12 T, still in use, count: 2, list:
              (r3v12 T) from 0x0243: PHI (r3 I:??) = (r3v3 nr.p0), (r3v12 T) binds: [B:126:0x0242, B:180:0x0243] A[DONT_GENERATE, DONT_INLINE]
              (r3v12 T) from 0x0235: CHECK_CAST (nr.p0) (r3v12 T)
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
        @Override // r53.j
        public final java.lang.Object emit(java.lang.Object r27, t13.d r28) {
            /*
                Method dump skipped, instruction units count: 836
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qr.l5.b.emit(java.lang.Object, t13.d):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<nr.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i[] f146327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f146328b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<Object[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i[] f146329a;

            public a(r53.i[] iVarArr) {
                this.f146329a = iVarArr;
            }

            @Override // e23.a
            public final Object[] invoke() {
                return new Object[this.f146329a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initActivityShareDataCollector$1$invokeSuspend$$inlined$combine$1$3", f = "ActivityDetailsViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.q<r53.j<? super nr.m>, Object[], t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f146330a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ r53.j f146331b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object[] f146332c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ t f146333d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t13.d dVar, t tVar) {
                super(3, dVar);
                this.f146333d = tVar;
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super nr.m> jVar, Object[] objArr, t13.d<? super Unit> dVar) {
                b bVar = new b(dVar, this.f146333d);
                bVar.f146331b = jVar;
                bVar.f146332c = objArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                wg0.d dVar;
                nr.a aVar;
                ps.p pVar;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f146330a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    r53.j jVar = this.f146331b;
                    Object[] objArr = this.f146332c;
                    boolean z14 = false;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    nr.c cVar = (nr.c) objArr[5];
                    nr.j0 j0Var = (nr.j0) obj6;
                    nr.v vVar = (nr.v) obj5;
                    ps.r rVar = (ps.r) obj3;
                    jr.c cVar2 = (jr.c) obj2;
                    t tVar = this.f146333d;
                    nr.j jVarX4 = t.x4(tVar, rVar, (nr.n0) obj4, null, null);
                    if (rVar != null) {
                        os.a aVar3 = tVar.Z;
                        ps.a1 metadataDTO = rVar.getMetadataDTO();
                        if (metadataDTO != null && metadataDTO.C0()) {
                            z14 = true;
                        }
                        dVar = pr.a.a(rVar, j0Var, aVar3, z14).f185102a;
                    } else {
                        dVar = null;
                    }
                    nr.m mVar = new nr.m(cVar2, jVarX4, rVar, vVar, dVar, (cVar == null || (aVar = cVar.f126996a) == null || (pVar = aVar.f126977d) == null) ? null : pVar.i());
                    this.f146331b = null;
                    this.f146332c = null;
                    this.f146330a = 1;
                    if (jVar.emit(mVar, this) == aVar2) {
                        return aVar2;
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

        public c(r53.i[] iVarArr, t tVar) {
            this.f146327a = iVarArr;
            this.f146328b = tVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super nr.m> jVar, t13.d dVar) {
            r53.i[] iVarArr = this.f146327a;
            Object objA = s53.m.a(iVarArr, new a(iVarArr), new b(null, this.f146328b), jVar, dVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(t tVar, t13.d<? super l5> dVar) {
        super(2, dVar);
        this.f146323b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l5(this.f146323b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146322a;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = this.f146323b;
            r53.w wVar = new r53.w(new c(new r53.i[]{tVar.T, tVar.W4(), (r53.z1) tVar.Z0.getValue(), tVar.h5(), (r53.z1) tVar.f146514e1.getValue(), tVar.b5()}, tVar), new a(null));
            b bVar = new b(tVar);
            this.f146322a = 1;
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
