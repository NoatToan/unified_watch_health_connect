package ey1;

import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$fetchBenchmarks$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {324, 325}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f67393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f67394c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$fetchBenchmarks$1$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {326, 326}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f67396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f67397c;

        /* JADX INFO: renamed from: ey1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1399a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f67398a;

            /* JADX INFO: renamed from: ey1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$fetchBenchmarks$1$1$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {327}, m = "emit", v = 2)
            public static final class C1400a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public ix1.e f67399a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f67400b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ C1399a<T> f67401c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public int f67402d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1400a(C1399a<? super T> c1399a, t13.d<? super C1400a> dVar) {
                    super(dVar);
                    this.f67401c = c1399a;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f67400b = obj;
                    this.f67402d |= Integer.MIN_VALUE;
                    return this.f67401c.emit(null, this);
                }
            }

            public C1399a(j jVar) {
                this.f67398a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ix1.e eVar, t13.d<? super Unit> dVar) {
                C1400a c1400a;
                if (dVar instanceof C1400a) {
                    c1400a = (C1400a) dVar;
                    int i14 = c1400a.f67402d;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1400a.f67402d = i14 - Integer.MIN_VALUE;
                    } else {
                        c1400a = new C1400a(this, dVar);
                    }
                } else {
                    c1400a = new C1400a(this, dVar);
                }
                Object obj = c1400a.f67400b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1400a.f67402d;
                j jVar = this.f67398a;
                if (i15 == 0) {
                    o13.r.b(obj);
                    p2 p2Var = jVar.f67355x;
                    Boolean bool = Boolean.FALSE;
                    c1400a.f67399a = eVar;
                    c1400a.f67402d = 1;
                    p2Var.k(null, bool);
                    if (Unit.INSTANCE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = c1400a.f67399a;
                    o13.r.b(obj);
                }
                jVar.f67351r.setValue(eVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f67396b = jVar;
            this.f67397c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f67396b, this.f67397c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        
            if (((r53.o2) r8).collect(r1, r7) == r0) goto L16;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67395a;
            j jVar = this.f67396b;
            if (i14 == 0) {
                o13.r.b(obj);
                nx1.h hVar = jVar.f67337d;
                Long l14 = new Long(this.f67397c);
                this.f67395a = 1;
                obj = hVar.a(l14, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
            C1399a c1399a = new C1399a(jVar);
            this.f67395a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j jVar, long j8, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f67393b = jVar;
        this.f67394c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f67393b, this.f67394c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (ge1.b.e0(r8, r1, r7) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67392a;
        j jVar = this.f67393b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        p2 p2Var = jVar.f67355x;
        Boolean bool = Boolean.TRUE;
        this.f67392a = 1;
        p2Var.k(null, bool);
        if (Unit.INSTANCE != aVar) {
        }
        return aVar;
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar2 = new a(jVar, this.f67394c, null);
        this.f67392a = 2;
    }
}
