package qr;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityFullResolutionPolylineIfNeeded$1", f = "ActivityDetailsViewModel.kt", l = {4869}, m = "invokeSuspend", v = 2)
public final class v0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f146777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f146778c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "hasFiveHzData", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "activityDetails", "Lo13/p;", "", "<anonymous>", "(ZLcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityFullResolutionPolylineIfNeeded$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<Boolean, ActivityDetailChartDTO, t13.d<? super o13.p<? extends Long, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f146779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ ActivityDetailChartDTO f146780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146781c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f146781c = tVar;
        }

        @Override // e23.q
        public final Object invoke(Boolean bool, ActivityDetailChartDTO activityDetailChartDTO, t13.d<? super o13.p<? extends Long, ? extends Boolean>> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(this.f146781c, dVar);
            aVar.f146779a = zBooleanValue;
            aVar.f146780b = activityDetailChartDTO;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14 = this.f146779a;
            ActivityDetailChartDTO activityDetailChartDTO = this.f146780b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new o13.p(new Long(this.f146781c.f146575z), Boolean.valueOf(new Integer(activityDetailChartDTO.I()).intValue() < new Integer(activityDetailChartDTO.M()).intValue() || z14));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo13/p;", "", "", "<destruct>", "", "<anonymous>", "(Lo13/p;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityFullResolutionPolylineIfNeeded$1$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o13.p<? extends Long, ? extends Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f146782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f146783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146784c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o53.b0 b0Var, t tVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f146783b = b0Var;
            this.f146784c = tVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f146783b, this.f146784c, dVar);
            bVar.f146782a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o13.p<? extends Long, ? extends Boolean> pVar, t13.d<? super Unit> dVar) {
            return ((b) create(pVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o13.p pVar = (o13.p) this.f146782a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            long jLongValue = ((Number) pVar.f128594a).longValue();
            boolean zBooleanValue = ((Boolean) pVar.f128595b).booleanValue();
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strH = com.airbnb.lottie.animation.keyframe.a.h("shouldShowFullResolutionPolyline=", zBooleanValue);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "ActivityDetailsViewModel", strH);
            if (zBooleanValue) {
                t tVar = this.f146784c;
                am.m mVar = tVar.f146507c;
                mVar.getClass();
                r53.c2 c2Var = new r53.c2(new am.s(mVar, jLongValue, null));
                x53.c cVar = o53.s0.f129406a;
                r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new r0(tVar, null), r53.s.A(c2Var, x53.b.f189152a)), new s0(tVar, null)), new t0(null)), new u0(tVar, null)), androidx.lifecycle.v1.a(tVar));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f146785a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f146786a;

            /* JADX INFO: renamed from: qr.v0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityFullResolutionPolylineIfNeeded$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "ActivityDetailsViewModel.kt", l = {52}, m = "emit", v = 2)
            public static final class C2760a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f146787a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f146788b;

                public C2760a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f146787a = obj;
                    this.f146788b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f146786a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2760a c2760a;
                if (dVar instanceof C2760a) {
                    c2760a = (C2760a) dVar;
                    int i14 = c2760a.f146788b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2760a.f146788b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2760a = new C2760a(dVar);
                    }
                } else {
                    c2760a = new C2760a(dVar);
                }
                Object obj2 = c2760a.f146787a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2760a.f146788b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    ps.r rVar = (ps.r) obj;
                    Boolean boolValueOf = rVar != null ? Boolean.valueOf(oe2.f.C(rVar)) : null;
                    if (boolValueOf != null) {
                        c2760a.f146788b = 1;
                        if (this.f146786a.emit(boolValueOf, c2760a) == aVar) {
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

        public c(r53.i iVar) {
            this.f146785a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f146785a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(t tVar, t13.d<? super v0> dVar) {
        super(2, dVar);
        this.f146778c = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v0 v0Var = new v0(this.f146778c, dVar);
        v0Var.f146777b = obj;
        return v0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f146777b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146776a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = t.A2;
            t tVar = this.f146778c;
            r53.i iVarS = r53.s.s(new r53.u1(new c(tVar.W4()), new r53.l1(tVar.N4()), new a(tVar, null)));
            b bVar = new b(b0Var, tVar, null);
            this.f146777b = null;
            this.f146776a = 1;
            if (r53.s.k(iVarS, bVar, this) == aVar) {
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
