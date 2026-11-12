package w52;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.common.components.WorkoutStepScreenKt$WorkoutStepScreen$1$1", f = "WorkoutStepScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f182729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f182730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r53.i<v52.c<Object>> f182731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f182732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<Object, Unit> f182733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f182734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r53.i<v52.c<Object>> f182735g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.common.components.WorkoutStepScreenKt$WorkoutStepScreen$1$1$1", f = "WorkoutStepScreen.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f182736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r53.i<v52.c<Object>> f182737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f182738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<Object, Unit> f182739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f182740e;

        /* JADX INFO: renamed from: w52.s1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3394a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p3.p1<Boolean> f182741a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e23.l<Object, Unit> f182742b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f182743c;

            public C3394a(p3.p1<Boolean> p1Var, e23.l<Object, Unit> lVar, e23.a<Unit> aVar) {
                this.f182741a = p1Var;
                this.f182742b = lVar;
                this.f182743c = aVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                v52.c cVar = (v52.c) obj;
                boolean z14 = cVar instanceof v52.c.b;
                p3.p1<Boolean> p1Var = this.f182741a;
                if (z14) {
                    p1Var.setValue(Boolean.TRUE);
                } else if (cVar instanceof v52.c.C3278c) {
                    r52.a aVar = (r52.a) ((v52.c.C3278c) cVar).f175760a;
                    p1Var.setValue(Boolean.FALSE);
                    this.f182742b.invoke(aVar);
                } else {
                    if (!(cVar instanceof v52.c.a)) {
                        lc.u0.r();
                        return null;
                    }
                    p1Var.setValue(Boolean.FALSE);
                    this.f182743c.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(r53.i<? extends v52.c<Object>> iVar, p3.p1<Boolean> p1Var, e23.l<Object, Unit> lVar, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f182737b = iVar;
            this.f182738c = p1Var;
            this.f182739d = lVar;
            this.f182740e = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f182737b, this.f182738c, this.f182739d, this.f182740e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f182736a;
            if (i14 == 0) {
                o13.r.b(obj);
                C3394a c3394a = new C3394a(this.f182738c, this.f182739d, this.f182740e);
                this.f182736a = 1;
                if (this.f182737b.collect(c3394a, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.common.components.WorkoutStepScreenKt$WorkoutStepScreen$1$1$2", f = "WorkoutStepScreen.kt", l = {70}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f182744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r53.i<v52.c<Object>> f182745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f182746c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f182747a;

            public a(e23.a<Unit> aVar) {
                this.f182747a = aVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                v52.c cVar = (v52.c) obj;
                if (!(cVar instanceof v52.c.b) && !(cVar instanceof v52.c.C3278c)) {
                    if (!(cVar instanceof v52.c.a)) {
                        lc.u0.r();
                        return null;
                    }
                    this.f182747a.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(r53.i<? extends v52.c<Object>> iVar, e23.a<Unit> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f182745b = iVar;
            this.f182746c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f182745b, this.f182746c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f182744a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(this.f182746c);
                this.f182744a = 1;
                if (this.f182745b.collect(aVar2, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s1(e23.a<Unit> aVar, r53.i<? extends v52.c<Object>> iVar, p3.p1<Boolean> p1Var, e23.l<Object, Unit> lVar, e23.a<Unit> aVar2, r53.i<? extends v52.c<Object>> iVar2, t13.d<? super s1> dVar) {
        super(2, dVar);
        this.f182730b = aVar;
        this.f182731c = iVar;
        this.f182732d = p1Var;
        this.f182733e = lVar;
        this.f182734f = aVar2;
        this.f182735g = iVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s1 s1Var = new s1(this.f182730b, this.f182731c, this.f182732d, this.f182733e, this.f182734f, this.f182735g, dVar);
        s1Var.f182729a = obj;
        return s1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f182729a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ge1.b.T(b0Var, null, null, new a(this.f182731c, this.f182732d, this.f182733e, this.f182734f, null), 3);
        ge1.b.T(b0Var, null, null, new b(this.f182735g, this.f182734f, null), 3);
        this.f182730b.invoke();
        return Unit.INSTANCE;
    }
}
