package kd0;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/q;", "", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.WorkoutDelegateImpl$isAdaptiveCoachWorkoutOnDevice$2", f = "WorkoutDelegateImpl.kt", l = {267}, m = "invokeSuspend", v = 2)
public final class k7 extends v13.i implements e23.p<o53.b0, t13.d<? super o13.q<? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f104176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf2.r0 f104177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f104178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f104179f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lrf2/f;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.WorkoutDelegateImpl$isAdaptiveCoachWorkoutOnDevice$2$workouts$1", f = "WorkoutDelegateImpl.kt", l = {268}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends rf2.f>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ uf2.r0 f104181b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uf2.r0 r0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f104181b = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f104181b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends rf2.f>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104180a;
            if (i14 == 0) {
                o13.r.b(obj);
                uf2.r0 r0Var = this.f104181b;
                if (r0Var == null) {
                    return null;
                }
                this.f104180a = 1;
                obj = r0Var.c(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return (List) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(long j8, uf2.r0 r0Var, int i14, int i15, t13.d<? super k7> dVar) {
        super(2, dVar);
        this.f104176c = j8;
        this.f104177d = r0Var;
        this.f104178e = i14;
        this.f104179f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k7 k7Var = new k7(this.f104176c, this.f104177d, this.f104178e, this.f104179f, dVar);
        k7Var.f104175b = obj;
        return k7Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o13.q<? extends Boolean>> dVar) {
        return ((k7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Integer num;
        o53.b0 b0Var = (o53.b0) this.f104175b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104174a;
        long j8 = this.f104176c;
        boolean z14 = true;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                e53.c.a aVar2 = e53.c.f63094b;
                long jE = e53.e.e(5, e53.f.SECONDS);
                a aVar3 = new a(this.f104177d, null);
                this.f104175b = b0Var;
                this.f104174a = 1;
                obj = o53.j2.b(o53.m0.e(jE), aVar3, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            List list = (List) obj;
            if (list == null) {
                int i15 = o13.q.f128596b;
                bVar = new o13.q.b(new Exception("Failed to retrieve workouts for deviceUnitId: " + j8));
            } else {
                int i16 = o13.q.f128596b;
                int i17 = this.f104178e;
                int i18 = this.f104179f;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z14 = false;
                            break;
                        }
                        rf2.f fVar = (rf2.f) it.next();
                        Integer num2 = fVar.f152475a;
                        if (num2 != null && num2.intValue() == i17 && (num = fVar.f152476b) != null && num.intValue() == i18) {
                            break;
                        }
                    }
                } else {
                    z14 = false;
                    break;
                }
                bVar = Boolean.valueOf(z14);
            }
        } catch (CancellationException e4) {
            String strU = v.h.u(j8, "Cancelled retrieving adaptive coach workouts for deviceUnitId: ", ", error: ", e4.getMessage());
            p92.y.f136664a.getClass();
            p92.y.a.c("WorkoutDelegateImpl", strU);
            int i19 = o13.q.f128596b;
            bVar = new o13.q.b(new Exception(org.apache.commons.lang3.e.e(j8, "Cancelled retrieving adaptive coach workouts for deviceUnitId: ")));
        }
        return o13.q.a(bVar);
    }
}
