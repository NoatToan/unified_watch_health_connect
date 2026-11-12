package wy;

import e23.p;
import n82.f;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r53.j;
import sy.k;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.calories.presentation.detail.OneDayCaloriesReportsPageKt$OneDayCaloriesReportsPage$1$1$1", f = "OneDayCaloriesReportsPage.kt", l = {51}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f188028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f188029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f188030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f188031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u82.f<ny.c> f188032e;

        /* JADX INFO: renamed from: wy.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.calories.presentation.detail.OneDayCaloriesReportsPageKt$OneDayCaloriesReportsPage$1$1$1$3", f = "OneDayCaloriesReportsPage.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C3494a extends i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f188033a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u82.f<ny.c> f188034b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3494a(k kVar, u82.f<ny.c> fVar, t13.d<? super C3494a> dVar) {
                super(2, dVar);
                this.f188033a = kVar;
                this.f188034b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3494a(this.f188033a, this.f188034b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((C3494a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                ny.c.b values;
                Integer restingCalories;
                ny.c.b values2;
                Integer activeCalories;
                ny.c.b values3;
                Integer totalCalories;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                u82.f<ny.c> fVar = this.f188034b;
                ny.c cVarA = fVar.a();
                int iIntValue = 0;
                int iIntValue2 = (cVarA == null || (values3 = cVarA.getValues()) == null || (totalCalories = values3.getTotalCalories()) == null) ? 0 : totalCalories.intValue();
                ny.c cVarA2 = fVar.a();
                int iIntValue3 = (cVarA2 == null || (values2 = cVarA2.getValues()) == null || (activeCalories = values2.getActiveCalories()) == null) ? 0 : activeCalories.intValue();
                ny.c cVarA3 = fVar.a();
                if (cVarA3 != null && (values = cVarA3.getValues()) != null && (restingCalories = values.getRestingCalories()) != null) {
                    iIntValue = restingCalories.intValue();
                }
                k kVar = this.f188033a;
                kVar.getClass();
                kVar.f161184e = new sy.b(iIntValue2, iIntValue3, iIntValue, true);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f188035a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f188036b;

            /* JADX INFO: renamed from: wy.d$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3495a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f188037a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f188038b;

                /* JADX INFO: renamed from: wy.d$a$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @e(c = "com.garmin.android.apps.connectmobile.calories.presentation.detail.OneDayCaloriesReportsPageKt$OneDayCaloriesReportsPage$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "OneDayCaloriesReportsPage.kt", l = {50}, m = "emit", v = 2)
                public static final class C3496a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f188039a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f188040b;

                    public C3496a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f188039a = obj;
                        this.f188040b |= Integer.MIN_VALUE;
                        return C3495a.this.emit(null, this);
                    }
                }

                public C3495a(j jVar, o82.a aVar) {
                    this.f188037a = jVar;
                    this.f188038b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C3496a c3496a;
                    if (dVar instanceof C3496a) {
                        c3496a = (C3496a) dVar;
                        int i14 = c3496a.f188040b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c3496a.f188040b = i14 - Integer.MIN_VALUE;
                        } else {
                            c3496a = new C3496a(dVar);
                        }
                    } else {
                        c3496a = new C3496a(dVar);
                    }
                    Object obj2 = c3496a.f188039a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c3496a.f188040b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f188038b)) {
                            c3496a.f188040b = 1;
                            if (this.f188037a.emit(obj, c3496a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(r53.i iVar, o82.a aVar) {
                this.f188035a = iVar;
                this.f188036b = aVar;
            }

            @Override // r53.i
            public final Object collect(j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f188035a.collect(new C3495a(jVar, this.f188036b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, o82.a aVar, k kVar, u82.f<ny.c> fVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f188029b = fVar;
            this.f188030c = aVar;
            this.f188031d = kVar;
            this.f188032e = fVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f188029b, this.f188030c, this.f188031d, this.f188032e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f188028a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f188029b, 22)), this.f188030c);
                C3494a c3494a = new C3494a(this.f188031d, this.f188032e, null);
                this.f188028a = 1;
                if (r53.s.k(bVar, c3494a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(o82.a aVar, k kVar, f fVar, sy.a aVar2, m mVar, int i14) {
        int i15;
        aVar.getClass();
        kVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-590440449);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            u82.e.b(aVar, kVar.f161183d, null, false, z3.f.c(1249807519, new wy.a(fVar, aVar, kVar, aVar2), o0VarE), o0VarE, (i15 & 14) | 24576, 12);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(aVar, kVar, fVar, aVar2, i14, 0);
        }
    }
}
