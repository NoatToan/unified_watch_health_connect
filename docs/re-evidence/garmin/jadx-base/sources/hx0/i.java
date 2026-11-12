package hx0;

import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleCalendarViewModel$postCycleUpdate$1$1", f = "MenstrualCycleCalendarViewModel.kt", l = {175}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f86073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b f86074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw0.c f86075d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleCalendarViewModel$postCycleUpdate$1$1$1", f = "MenstrualCycleCalendarViewModel.kt", l = {177, 178}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l1 f86077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b f86078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ xw0.c f86079d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l1 l1Var, com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b bVar, xw0.c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f86077b = l1Var;
            this.f86078c = bVar;
            this.f86079d = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f86077b, this.f86078c, this.f86079d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        
            if (r13 == r0) goto L22;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f86076a;
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b bVar = this.f86078c;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    l1 l1Var = this.f86077b;
                    if (l1Var != null) {
                        this.f86076a = 1;
                        if (l1Var.P(this) == aVar) {
                        }
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
                c83.a0 a0Var = (c83.a0) obj;
                bVar.f38892k.j(new cx0.a<>(null, null, new Integer(a0Var.f25745a.code()), a0Var.f25745a.isSuccessful()));
                return Unit.INSTANCE;
                yw0.a aVar2 = bVar.f38882a;
                xw0.c cVar = this.f86079d;
                this.f86076a = 2;
                obj = aVar2.d(cVar, this);
            } catch (Throwable th3) {
                bVar.f38892k.j(new cx0.a<>(null, th3, null, false, 12, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l1 l1Var, com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b bVar, xw0.c cVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f86073b = l1Var;
        this.f86074c = bVar;
        this.f86075d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f86073b, this.f86074c, this.f86075d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86072a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f86073b, this.f86074c, this.f86075d, null);
            this.f86072a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
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
