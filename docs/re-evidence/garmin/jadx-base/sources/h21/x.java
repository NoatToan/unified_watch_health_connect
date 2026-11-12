package h21;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.screen.OneDayNutritionReportsPageKt$OneDayNutritionReportsPage$1$1$1", f = "OneDayNutritionReportsPage.kt", l = {96}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f81182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n82.f f81183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.a f81184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i21.d f81185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g21.u f81186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b11.f f81187f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.screen.OneDayNutritionReportsPageKt$OneDayNutritionReportsPage$1$1$1$3", f = "OneDayNutritionReportsPage.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o82.a, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i21.d f81188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g21.u f81189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b11.f f81190c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i21.d dVar, g21.u uVar, b11.f fVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f81188a = dVar;
            this.f81189b = uVar;
            this.f81190c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f81188a, this.f81189b, this.f81190c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            g21.u uVar = this.f81189b;
            Integer num2 = uVar != null ? new Integer(uVar.f75500b) : null;
            Integer num3 = uVar != null ? new Integer(uVar.f75500b) : null;
            if (num2 == null || num3 == null) {
                num = null;
            } else {
                num = new Integer(num2.intValue() - num3.intValue());
            }
            b11.f fVar = this.f81190c;
            this.f81188a.f87283o = new g21.k(num, fVar != null ? fVar.f14266a : null, uVar != null ? new Integer(uVar.f75500b) : null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<o82.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f81191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o82.a f81192b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f81193a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f81194b;

            /* JADX INFO: renamed from: h21.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.screen.OneDayNutritionReportsPageKt$OneDayNutritionReportsPage$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "OneDayNutritionReportsPage.kt", l = {50}, m = "emit", v = 2)
            public static final class C1614a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f81195a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f81196b;

                public C1614a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f81195a = obj;
                    this.f81196b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, o82.a aVar) {
                this.f81193a = jVar;
                this.f81194b = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1614a c1614a;
                if (dVar instanceof C1614a) {
                    c1614a = (C1614a) dVar;
                    int i14 = c1614a.f81196b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1614a.f81196b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1614a = new C1614a(dVar);
                    }
                } else {
                    c1614a = new C1614a(dVar);
                }
                Object obj2 = c1614a.f81195a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1614a.f81196b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    if (p005kotlin.jvm.internal.s.g((o82.a) obj, this.f81194b)) {
                        c1614a.f81196b = 1;
                        if (this.f81193a.emit(obj, c1614a) == aVar) {
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

        public b(r53.i iVar, o82.a aVar) {
            this.f81191a = iVar;
            this.f81192b = aVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
            Object objCollect = this.f81191a.collect(new a(jVar, this.f81192b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(n82.f fVar, o82.a aVar, i21.d dVar, g21.u uVar, b11.f fVar2, t13.d<? super x> dVar2) {
        super(2, dVar2);
        this.f81183b = fVar;
        this.f81184c = aVar;
        this.f81185d = dVar;
        this.f81186e = uVar;
        this.f81187f = fVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f81183b, this.f81184c, this.f81185d, this.f81186e, this.f81187f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f81182a;
        if (i14 == 0) {
            o13.r.b(obj);
            b bVar = new b(p0.s(new d52.p(this.f81183b, 2)), this.f81184c);
            a aVar2 = new a(this.f81185d, this.f81186e, this.f81187f, null);
            this.f81182a = 1;
            if (r53.s.k(bVar, aVar2, this) == aVar) {
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
