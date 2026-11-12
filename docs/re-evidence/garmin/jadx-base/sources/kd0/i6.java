package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.NewSelectExerciseActivity;
import com.garmin.android.apps.connectmobile.cyclingability.presentation.CyclingAbilityReportsActivity;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkd0/i6;", "Lcom/garmin/android/apps/connectmobile/e3;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ll52/x;", "workoutsAPI", "Ljr0/a;", "intensityMinutesRepo", "Lnz1/a;", "trainingReadinessAPI", "Lt32/a;", "vo2MaxRepository", "Lis1/e;", "timelineRepository", "Ldx/a;", "bodyBatteryRepository", "<init>", "(Ll52/x;Ljr0/a;Lnz1/a;Lt32/a;Lis1/e;Ldx/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i6 implements com.garmin.android.apps.connectmobile.e3, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f104121g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l52.x f104122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jr0.a f104123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nz1.a f104124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t32.a f104125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final is1.e f104126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dx.a f104127f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Loz1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.TrainingPlanDelegateImpl$getTrainingReadiness$2", f = "TrainingPlanDelegateImpl.kt", l = {245}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends oz1.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104128a;

        public b(t13.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return i6.this.new b(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<List<? extends oz1.b>>> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104128a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            LocalDate localDateNow = LocalDate.now();
            localDateNow.getClass();
            o53.i0<c83.a0<List<oz1.b>>> i0VarD = i6.this.f104124c.d(fz0.d.c(localDateNow));
            this.f104128a = 1;
            Object objAwait = i0VarD.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.TrainingPlanDelegateImpl$saveNewBenchmarks$2", f = "TrainingPlanDelegateImpl.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104130a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<com.garmin.android.apps.connectmobile.workouts.data.model.b> f104132c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list, t13.d<? super c> dVar) {
            super(1, dVar);
            this.f104132c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return i6.this.new c(this.f104132c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.b>>> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104130a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.workouts.data.model.b>>> i0VarA = i6.this.f104122a.a(this.f104132c);
            this.f104130a = 1;
            Object objAwait = i0VarA.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    static {
        new a(null);
    }

    public i6(l52.x xVar, jr0.a aVar, nz1.a aVar2, t32.a aVar3, is1.e eVar, dx.a aVar4) {
        xVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        eVar.getClass();
        aVar4.getClass();
        this.f104122a = xVar;
        this.f104123b = aVar;
        this.f104124c = aVar2;
        this.f104125d = aVar3;
        this.f104126e = eVar;
        this.f104127f = aVar4;
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final Intent B(Activity activity, long j8, boolean z14, boolean z15) {
        activity.getClass();
        WorkoutDetailsActivity.f48482f.getClass();
        Intent intent = new Intent(activity, (Class<?>) WorkoutDetailsActivity.class);
        intent.putExtra("GCM_workout_schedule_id", j8);
        intent.putExtra("GCM_workout_is_protected", false);
        intent.putExtra("GCM_workout_completed", z14);
        intent.putExtra("GCM_workout_is_plan_completed", z15);
        return intent;
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void E(h4.r rVar, oz1.b bVar, p3.m mVar, int i14) {
        int i15;
        rVar.getClass();
        p3.o0 o0VarE = mVar.E(2063962198);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            su1.e.a(rVar, bVar, o0VarE, (i15 & 112) | (i15 & 14) | (oz1.b.F << 3));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, rVar, bVar, i14, 4);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final Object H(v13.c cVar) {
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        return this.f104125d.b(fz0.d.c(localDateNow), p13.j0.f134944a, cVar);
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void I(ir0.e eVar, String str, boolean z14, o13.p<String, String> pVar, p3.m mVar, int i14) {
        eVar.getClass();
        str.getClass();
        mVar.C(1938695952);
        p3.x1 x1Var = p3.n.f135158a;
        rr0.q.e(eVar, str, z14, pVar, mVar, ir0.e.f94792c | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168));
        mVar.f();
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void L(androidx.fragment.app.m mVar, fg0.k kVar, p3.m mVar2, int i14) {
        int i15;
        kVar.getClass();
        p3.o0 o0VarE = mVar2.E(129826843);
        if ((i14 & 48) == 0) {
            i15 = ((i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            uc1.d.a(null, kVar, null, o0VarE, (fg0.k.X << 3) | (i15 & 112), 5);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, mVar, kVar, i14, 0);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final Object M(lx1.c.d dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new j6(this, null), dVar);
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void N(Context context, boolean z14) {
        context.getClass();
        TrainingStatusSummaryActivity.f40068w.getClass();
        TrainingStatusSummaryActivity.a.b(context, z14);
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final Object O(long j8, kv1.f fVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new k6(j8, null), fVar);
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final Object R(com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, lx1.d.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new s6(this, bVar, null), aVar);
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final Object T(ps.m mVar, kv1.f fVar) throws Throwable {
        x53.c cVar = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new q6(mVar, null), fVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void V(k61.b bVar, j61.d dVar, p3.m mVar, int i14) {
        int i15;
        bVar.getClass();
        p3.o0 o0VarE = mVar.E(-2105881618);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            f70.c.d(bVar, dVar, true, o0VarE, (i15 & 14) | 384 | (j61.d.f97317e << 3) | (i15 & 112), 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, bVar, dVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(v13.c cVar) {
        o6 o6Var;
        if (cVar instanceof o6) {
            o6Var = (o6) cVar;
            int i14 = o6Var.f104273c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o6Var.f104273c = i14 - Integer.MIN_VALUE;
            } else {
                o6Var = new o6(this, cVar);
            }
        } else {
            o6Var = new o6(this, cVar);
        }
        Object objA = o6Var.f104271a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o6Var.f104273c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objA);
            LocalDate localDateNow = LocalDate.now();
            LocalDate localDateMinusDays = localDateNow.minusDays(6);
            localDateMinusDays.getClass();
            o6Var.f104273c = 1;
            objA = this.f104127f.a(localDateMinusDays, localDateNow, o6Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objA;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            if (((Collection) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).isEmpty()) {
            }
            return Boolean.valueOf(z14);
        }
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
            lc.u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a, "hasLast7DaysBodyBatteryData() - Failed to get body battery data: ");
        com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar2.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "TrainingPlanDelegateImpl", strD);
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final Object a(List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list, t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends List<com.garmin.android.apps.connectmobile.workouts.data.model.b>>> dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new c(list, null), dVar);
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final o13.p<String, String> b(Context context, long j8, double d14) {
        context.getClass();
        q91.d.a aVar = q91.d.f143558e;
        Long lValueOf = Long.valueOf(j8);
        aVar.getClass();
        q91.d dVarA = q91.d.a.a(lValueOf);
        if (dVarA == null) {
            dVarA = q91.d.f143561h;
        }
        z91.a aVar2 = z91.a.f203130a;
        l22.a aVar3 = new l22.a(context);
        aVar2.getClass();
        return new o13.p<>(z91.a.d(aVar3, j8, null), z91.a.g(context, dVarA, d14, true));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.e3
    public final Object c(v13.c cVar) {
        l6 l6Var;
        gs1.z userDailySummary;
        gs1.z zVar;
        gs1.l payload;
        Integer bodyBatteryMostRecentValue;
        Integer bodyBatteryChargedValue;
        gs1.l payload2;
        gs1.l payload3;
        gs1.l payload4;
        if (cVar instanceof l6) {
            l6Var = (l6) cVar;
            int i14 = l6Var.f104212d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l6Var.f104212d = i14 - Integer.MIN_VALUE;
            } else {
                l6Var = new l6(this, cVar);
            }
        } else {
            l6Var = new l6(this, cVar);
        }
        Object objA = l6Var.f104210b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = l6Var.f104212d;
        boolean zBooleanValue = true;
        Integer bodyBatteryDrainedValue = null;
        if (i15 == 0) {
            o13.r.b(objA);
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            l6Var.f104212d = 1;
            objA = this.f104126e.a(dateTimeNow, l6Var);
            if (objA != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objA);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = l6Var.f104209a;
            o13.r.b(objA);
        }
        zBooleanValue = ((Boolean) objA).booleanValue();
        userDailySummary = zVar;
        if (userDailySummary != null || (payload4 = userDailySummary.getPayload()) == null) {
            bodyBatteryMostRecentValue = null;
        } else {
            bodyBatteryMostRecentValue = payload4.getBodyBatteryMostRecentValue();
        }
        if (userDailySummary != null || (payload3 = userDailySummary.getPayload()) == null) {
            bodyBatteryChargedValue = null;
        } else {
            bodyBatteryChargedValue = payload3.getBodyBatteryChargedValue();
        }
        if (userDailySummary != null && (payload2 = userDailySummary.getPayload()) != null) {
            bodyBatteryDrainedValue = payload2.getBodyBatteryDrainedValue();
        }
        return new av1.c(bodyBatteryMostRecentValue, bodyBatteryChargedValue, bodyBatteryDrainedValue, zBooleanValue);
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objA;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            userDailySummary = ((gs1.t) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).getUserDailySummary();
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a, "getFBTDashboardBodyBatteryData() - Error retrieving timeline snapshot data: ");
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "TrainingPlanDelegateImpl", strD);
            userDailySummary = null;
        }
        if (((userDailySummary == null || (payload = userDailySummary.getPayload()) == null) ? null : payload.getBodyBatteryMostRecentValue()) == null) {
            l6Var.f104209a = userDailySummary;
            l6Var.f104212d = 2;
            Object objY = Y(l6Var);
            if (objY != obj) {
                zVar = userDailySummary;
                objA = objY;
                zBooleanValue = ((Boolean) objA).booleanValue();
                userDailySummary = zVar;
            }
            return obj;
        }
        if (userDailySummary != null) {
            bodyBatteryMostRecentValue = null;
        } else {
            bodyBatteryMostRecentValue = null;
        }
        if (userDailySummary != null) {
            bodyBatteryChargedValue = null;
        } else {
            bodyBatteryChargedValue = null;
        }
        if (userDailySummary != null) {
            bodyBatteryDrainedValue = payload2.getBodyBatteryDrainedValue();
        }
        return new av1.c(bodyBatteryMostRecentValue, bodyBatteryChargedValue, bodyBatteryDrainedValue, zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x0162  */
    @Override // com.garmin.android.apps.connectmobile.e3
    public final Object d(v13.c cVar) {
        m6 m6Var;
        int i14;
        Integer numValueOf;
        LinkedHashMap linkedHashMap;
        i53.c cVarB;
        String str;
        ir0.f fVar;
        if (cVar instanceof m6) {
            m6Var = (m6) cVar;
            int i15 = m6Var.f104235d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                m6Var.f104235d = i15 - Integer.MIN_VALUE;
            } else {
                m6Var = new m6(this, cVar);
            }
        } else {
            m6Var = new m6(this, cVar);
        }
        Object objD = m6Var.f104233b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = m6Var.f104235d;
        if (i16 == 0) {
            o13.r.b(objD);
            DateTime dateTimeNow = DateTime.now();
            int i17 = gg1.m.MONDAY.f77271c;
            dateTimeNow.getClass();
            DateTime dateTimeO = g22.k.o(i17, dateTimeNow);
            DateTime dateTimeB = g22.k.b(i17, dateTimeNow);
            int iA = g22.k.a(dateTimeB, dateTimeO) + 1;
            m6Var.f104232a = i17;
            m6Var.f104235d = 1;
            objD = this.f104123b.d(dateTimeB, iA, m6Var);
            if (objD == aVar) {
                return aVar;
            }
            i14 = i17;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = m6Var.f104232a;
            o13.r.b(objD);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objD;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a, "Failed to get intensity minutes data: ");
            com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "TrainingPlanDelegateImpl", strD);
            return null;
        }
        List<ir0.f> list = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        LocalDate localDateNow = LocalDate.now();
        Integer numValueOf2 = (list == null || (fVar = (ir0.f) p13.h0.d0(list)) == null) ? null : Integer.valueOf(fVar.f94797b);
        ArrayList arrayList = new ArrayList();
        int i18 = 0;
        if (list != null) {
            int iY = 0;
            for (ir0.f fVar2 : list) {
                iY += oe2.f.y(fVar2 != null ? fVar2.d() : null, fVar2 != null ? fVar2.g() : null);
            }
            numValueOf = Integer.valueOf(iY);
        } else {
            numValueOf = null;
        }
        if (list != null) {
            int iA2 = p13.t0.a(p13.y.r(list, 10));
            if (iA2 < 16) {
                iA2 = 16;
            }
            linkedHashMap = new LinkedHashMap(iA2);
            for (ir0.f fVar3 : list) {
                int iY2 = oe2.f.y(fVar3 != null ? fVar3.d() : null, fVar3 != null ? fVar3.g() : null);
                i18 += iY2;
                if (i18 >= (numValueOf2 != null ? numValueOf2.intValue() : Integer.MAX_VALUE) && fVar3 != null && (str = fVar3.f94796a) != null) {
                    arrayList.add(c02.n.c(g22.k.v(str, "yyyy-MM-dd")));
                }
                o13.p pVar = new o13.p(String.valueOf(fVar3 != null ? fVar3.f94796a : null), Integer.valueOf(iY2));
                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
            }
        } else {
            linkedHashMap = null;
        }
        yz1.d dVar = new yz1.d(yz1.u.SUCCESS, null, false, 6, null);
        Integer num = (numValueOf == null || numValueOf.intValue() < 0) ? null : numValueOf;
        Integer num2 = (numValueOf2 == null || numValueOf2.intValue() < 0) ? null : numValueOf2;
        if (linkedHashMap != null) {
            localDateNow.getClass();
            cVarB = c02.a.f(linkedHashMap, jg.b.A(i14, localDateNow), e32.o.f62807j.f62819a);
            if (cVarB == null) {
                cVarB = j53.l.b();
            }
        } else {
            cVarB = j53.l.b();
        }
        i53.c cVar2 = cVarB;
        i53.f fVarJ = i53.a.j(arrayList);
        localDateNow.getClass();
        return new zz1.d(dVar, num, num2, cVar2, fVarJ, c02.n.c(localDateNow));
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void f(Activity activity, boolean z14, String str) {
        activity.getClass();
        if (z14) {
            MultiSportsDetailsActivity.f48440z.getClass();
            Intent intent = new Intent(activity, (Class<?>) MultiSportsDetailsActivity.class);
            intent.putExtra("GCM_extra_activity_type", 101);
            if (str != null) {
                intent.putExtra("EXTRA_SCHEDULE_WORKOUT_UUID", str);
            }
            intent.putExtra("EXTRA_IS_FBT_WORKOUT", true);
            activity.startActivityForResult(intent, 101);
            return;
        }
        WorkoutDetailsActivity.f48482f.getClass();
        Intent intent2 = new Intent(activity, (Class<?>) WorkoutDetailsActivity.class);
        intent2.putExtra("GCM_extra_activity_type", 101);
        if (str != null) {
            intent2.putExtra("EXTRA_SCHEDULE_WORKOUT_UUID", str);
        }
        intent2.putExtra("EXTRA_IS_FBT_WORKOUT", true);
        activity.startActivityForResult(intent2, 101);
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void g(Context context) {
        context.getClass();
        context.startActivity(new Intent(context, (Class<?>) CyclingAbilityReportsActivity.class));
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void h(h4.r rVar, av1.c cVar, p3.m mVar, int i14) {
        int i15;
        rVar.getClass();
        p3.o0 o0VarE = mVar.E(-464178150);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            mx.j.a(rVar, new gx.a(new yz1.d(yz1.u.SUCCESS, null, false, 6, null), cVar != null ? cVar.f13246a : null, cVar != null ? cVar.f13247b : null, cVar != null ? cVar.f13248c : null, cVar != null && cVar.f13249d), o0VarE, i15 & 14);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, rVar, cVar, i14, 2);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void i(h4.r rVar, h61.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        rVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(1348845197);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            g70.c.b(rVar, aVar, aVar2, o0VarE, i15 & 1022);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g02.q0(this, rVar, aVar, aVar2, i14, 14);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void j(j61.i iVar, j61.d dVar, p3.m mVar, int i14) {
        int i15;
        iVar.getClass();
        p3.o0 o0VarE = mVar.E(-2062863188);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            j61.i.Companion companion = j61.i.INSTANCE;
            f70.c.c(iVar, dVar, o0VarE, (i15 & 112) | (i15 & 14) | (j61.d.f97317e << 3));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, iVar, dVar, i14, 5);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final Object k(t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends List<oz1.b>>> dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new b(null), dVar);
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final Intent l(Activity activity, long j8, long j14) {
        activity.getClass();
        WorkoutDetailsActivity.f48482f.getClass();
        return WorkoutDetailsActivity.a.b(activity, j8, j14, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.garmin.android.apps.connectmobile.e3
    public final Object m(v13.c cVar) {
        p6 p6Var;
        List<j70.v> listD;
        if (cVar instanceof p6) {
            p6Var = (p6) cVar;
            int i14 = p6Var.f104292c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p6Var.f104292c = i14 - Integer.MIN_VALUE;
            } else {
                p6Var = new p6(this, cVar);
            }
        } else {
            p6Var = new p6(this, cVar);
        }
        Object objY = p6Var.f104290a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p6Var.f104292c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objY);
            r53.i<j70.f> iVarP = ((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class, null, null, 6, null)).p();
            p6Var.f104292c = 1;
            objY = r53.s.y(iVarP, p6Var);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        j70.f fVar = (j70.f) objY;
        if (fVar == null || (listD = fVar.d()) == null || listD.isEmpty()) {
            z14 = false;
        } else {
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                if (p005kotlin.jvm.internal.s.g(((j70.v) it.next()).getSectionType(), o70.f.TRAINING.f129989a)) {
                }
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r6.t(r2, r0) == r1) goto L23;
     */
    @Override // com.garmin.android.apps.connectmobile.e3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(v13.c cVar) {
        r6 r6Var;
        if (cVar instanceof r6) {
            r6Var = (r6) cVar;
            int i14 = r6Var.f104355c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r6Var.f104355c = i14 - Integer.MIN_VALUE;
            } else {
                r6Var = new r6(this, cVar);
            }
        } else {
            r6Var = new r6(this, cVar);
        }
        Object objM = r6Var.f104353a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = r6Var.f104355c;
        if (i15 == 0) {
            o13.r.b(objM);
            r6Var.f104355c = 1;
            objM = m(r6Var);
            if (objM != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objM);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objM);
        }
        return Unit.INSTANCE;
        if (((Boolean) objM).booleanValue()) {
            return Unit.INSTANCE;
        }
        com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0 l0Var = (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class, null, null, 6, null);
        o70.f fVar = o70.f.TRAINING;
        r6Var.f104355c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.e3
    public final Object o(DateTime dateTime, DateTime dateTime2, boolean z14, v13.c cVar) {
        n6 n6Var;
        if (cVar instanceof n6) {
            n6Var = (n6) cVar;
            int i14 = n6Var.f104254f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n6Var.f104254f = i14 - Integer.MIN_VALUE;
            } else {
                n6Var = new n6(this, cVar);
            }
        } else {
            n6Var = new n6(this, cVar);
        }
        Object objF = n6Var.f104252d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n6Var.f104254f;
        if (i15 == 0) {
            o13.r.b(objF);
            gg1.m mVar = gg1.m.MONDAY;
            DateTime dateTimeO = g22.k.o(mVar.f77271c, dateTime);
            DateTime dateTimeB = g22.k.b(mVar.f77271c, dateTime2);
            n6Var.f104249a = dateTime;
            n6Var.f104250b = dateTime2;
            n6Var.f104251c = z14;
            n6Var.f104254f = 1;
            objF = this.f104123b.f(dateTimeO, dateTimeB, n6Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = n6Var.f104251c;
            dateTime2 = n6Var.f104250b;
            dateTime = n6Var.f104249a;
            o13.r.b(objF);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objF;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            com.garmin.android.apps.connectmobile.v2.a aVar2 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.a ? (com.garmin.android.apps.connectmobile.v2.a) v2Var : null;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(aVar2 != null ? aVar2.f47383a : null, "Failed to fetch daily summary for chart: ");
            com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar3.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "IntensityMinutes", strD);
            return null;
        }
        if (z14) {
            List<ir0.f> list = ((b22.f) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).a().f94793a;
            if (list != null) {
                return or0.p.d(list, dateTime, dateTime2, 7);
            }
        } else {
            List<ir0.f> list2 = ((b22.f) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).a().f94793a;
            if (list2 != null) {
                return or0.p.d(list2, dateTime, dateTime2, 1);
            }
        }
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void q(ir0.e eVar, String str, DateTime dateTime, DateTime dateTime2, o13.p<String, String> pVar, p3.m mVar, int i14) {
        eVar.getClass();
        str.getClass();
        mVar.C(223666445);
        p3.x1 x1Var = p3.n.f135158a;
        rr0.u.c(eVar, str, dateTime, dateTime2, pVar, mVar, ir0.e.f94792c | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (i14 & 57344));
        mVar.f();
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final zz1.a r(Context context) {
        context.getClass();
        return new zz1.a(new ho0.a(context, 19), new ho0.a(context, 20), new ho0.a(context, 21));
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void t(h4.r rVar, o61.q qVar, p3.m mVar, int i14) {
        int i15;
        rVar.getClass();
        p3.o0 o0VarE = mVar.E(456413594);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(qVar) : o0VarE.r(qVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            su1.a.a(rVar, qVar, o0VarE, i15 & 126);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, rVar, qVar, i14, 3);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final void v(int i14, ActivityListItemDTO activityListItemDTO, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        rVar.getClass();
        activityListItemDTO.getClass();
        p3.o0 o0VarE = mVar.E(1959029675);
        int i15 = (o0VarE.r(activityListItemDTO) ? 32 : 16) | i14;
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            su1.d.a(i15 & 8190, activityListItemDTO, aVar, rVar, o0VarE, z14);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(this, rVar, activityListItemDTO, z14, aVar, i14, 12);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e3
    public final Intent y(Context context, String str, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.repcounting.model.e eVar, boolean z14, String str2) {
        context.getClass();
        return NewSelectExerciseActivity.a.a(NewSelectExerciseActivity.f29823c, context, cVar, eVar, str, z14, str2, true, true, false, 256);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/i6$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
