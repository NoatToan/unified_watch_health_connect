package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.TroubleConnectingActivity;
import com.garmin.android.apps.connectmobile.devices.targetedselection.TDSActivity;
import com.garmin.android.apps.connectmobile.powercurve.view.PowerCurveActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.RescheduleWorkoutActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.reschedule.RescheduleSTPWorkoutActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.PowerCurveTargetSelectionActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.android.livesessionview.LiveActivityActivity;
import com.google.mlkit.common.MlKitException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkd0/c7;", "Lo52/e;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c7 implements o52.e {

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104024a;

        static {
            int[] iArr = new int[vk1.e.values().length];
            try {
                iArr[vk1.e.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vk1.e.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vk1.e.CYCLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vk1.e.SWIMMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f104024a = iArr;
        }
    }

    static {
        new a(null);
    }

    public static zf2.d a(Context context, String str, Integer num, Integer num2) {
        if (num2 != null && num != null) {
            zf2.d.a aVar = zf2.d.f204601l;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            aVar.getClass();
            zf2.d dVarA = zf2.d.a.a(iIntValue, iIntValue2);
            if (dVarA != null) {
                return dVarA;
            }
            p92.y.f136664a.getClass();
            p92.y.a.c("WorkoutDelegateImpl", "Unable to find activity type for sportType: " + num + " and subSportType: " + num2);
            Toast.makeText(context, context.getString(R.string.txt_error_occurred), 0).show();
            return zf2.d.f204591f2;
        }
        zf2.d.a aVar2 = zf2.d.f204601l;
        String str2 = str == null ? "" : str;
        aVar2.getClass();
        w13.c cVar = zf2.d.f204597i2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : cVar) {
            mt2.k kVar = ((zf2.d) obj).f204636h;
            if (d53.u.q(kVar != null ? kVar.f121072a : null, str2, true)) {
                arrayList.add(obj);
            }
        }
        zf2.d dVar = (zf2.d) p13.h0.d0(arrayList);
        if (dVar != null) {
            return dVar;
        }
        String strN = fb1.c.n("Unable to find activity type for workoutSportType: ", str);
        p92.y.f136664a.getClass();
        p92.y.a.c("WorkoutDelegateImpl", strN);
        Toast.makeText(context, context.getString(R.string.txt_error_occurred), 0).show();
        return zf2.d.f204591f2;
    }

    @Override // o52.e
    public final Intent A(WorkoutDetailsActivity workoutDetailsActivity, long j8, String str, Integer num, Integer num2, int i14, String str2) {
        workoutDetailsActivity.getClass();
        LiveActivityActivity.a aVar = LiveActivityActivity.f50544d;
        zf2.d dVarA = a(workoutDetailsActivity, str, num, num2);
        zf2.i.c cVar = new zf2.i.c(i14);
        aVar.getClass();
        Intent intentB = LiveActivityActivity.a.b(workoutDetailsActivity, j8, dVarA, cVar, str2, false, false, false);
        intentB.setFlags(335544320);
        return intentB;
    }

    @Override // o52.e
    public final void B(Activity activity, m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.f0 f0Var) {
        activity.getClass();
        TDSActivity.f34565f.getClass();
        Intent intent = new Intent(activity, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", fd0.d.WORKOUTS);
        intent.putExtra("arg.sport.type", kVar);
        intent.putExtra("arg.workout.feature.preferences", f0Var);
        activity.startActivityForResult(intent, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // o52.e
    public final Object C(int i14, int i15, long j8, v13.c cVar) throws Throwable {
        j7 j7Var;
        if (cVar instanceof j7) {
            j7Var = (j7) cVar;
            int i16 = j7Var.f104158c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                j7Var.f104158c = i16 - Integer.MIN_VALUE;
            } else {
                j7Var = new j7(this, cVar);
            }
        } else {
            j7Var = new j7(this, cVar);
        }
        Object objE0 = j7Var.f104156a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = j7Var.f104158c;
        if (i17 == 0) {
            o13.r.b(objE0);
            uf2.r0 r0Var = (uf2.r0) zb0.k.b(uf2.r0.class, j8);
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            k7 k7Var = new k7(j8, r0Var, i14, i15, null);
            j7Var.f104158c = 1;
            objE0 = ge1.b.e0(bVar, k7Var, j7Var);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        return ((o13.q) objE0).f128597a;
    }

    @Override // o52.e
    public final void D(WorkoutDetailsActivity workoutDetailsActivity) {
        workoutDetailsActivity.getClass();
        workoutDetailsActivity.startActivity(new Intent(workoutDetailsActivity, (Class<?>) TroubleConnectingActivity.class));
    }

    @Override // o52.e
    public final void E(Activity activity, WorkoutScheduleDTO workoutScheduleDTO) {
        activity.getClass();
        workoutScheduleDTO.getClass();
        RescheduleWorkoutActivity.f45357n.getClass();
        Intent intent = new Intent(activity, (Class<?>) RescheduleWorkoutActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("GCM_extra_request_code", 208);
        am.a2.b(bundle, "GCM_workout_lite_data", workoutScheduleDTO);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, 208);
    }

    @Override // o52.e
    public final Intent F(Context context, double d14, List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list, int i14, int i15, int i16) {
        context.getClass();
        int i17 = (int) d14;
        PowerCurveTargetSelectionActivity.f49559e.getClass();
        Intent intent = new Intent(context, (Class<?>) PowerCurveTargetSelectionActivity.class);
        if (list != null) {
            intent.putParcelableArrayListExtra("EXTRA_POWER_CURVE_TARGET_LIST", new ArrayList<>(list));
        }
        intent.putExtra("STEP_DURATION", i17);
        intent.putExtra("POWER_CURVE_DURATION", i14);
        intent.putExtra("POWER_CURVE_SCALE", i15);
        intent.putExtra("POWER_CURVE_RANGE", i16);
        return intent;
    }

    @Override // o52.e
    public final boolean G() {
        com.garmin.android.apps.connectmobile.k1 k1Var = com.garmin.android.apps.connectmobile.k1.f37122a;
        k1Var.getClass();
        c22.s3.f23252a.getClass();
        return c22.s3.a("ROLE_DI_TESTER") && !k1Var.l0();
    }

    @Override // o52.e
    public final h7 H() {
        return new h7();
    }

    @Override // o52.e
    public final String i(long j8) {
        String displayName;
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null && (displayName = fVarI.getDisplayName()) != null) {
            if (displayName.length() <= 0) {
                displayName = null;
            }
            if (displayName != null) {
                return displayName;
            }
        }
        String productDisplayName = fVarI != null ? fVarI.getProductDisplayName() : null;
        return productDisplayName == null ? "" : productDisplayName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r9 == r1) goto L22;
     */
    @Override // o52.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(v13.c cVar) {
        e7 e7Var;
        ws0.a aVar;
        if (cVar instanceof e7) {
            e7Var = (e7) cVar;
            int i14 = e7Var.f104057d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e7Var.f104057d = i14 - Integer.MIN_VALUE;
            } else {
                e7Var = new e7(this, cVar);
            }
        } else {
            e7Var = new e7(this, cVar);
        }
        Object objI = e7Var.f104055b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = e7Var.f104057d;
        if (i15 != 0) {
            if (i15 == 1) {
                aVar = e7Var.f104054a;
                o13.r.b(objI);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objI);
            }
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objI;
            return v2Var instanceof com.garmin.android.apps.connectmobile.v2.b ? (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a : p13.j0.f134944a;
        }
        o13.r.b(objI);
        ws0.a aVar3 = (ws0.a) KoinJavaComponent.get$default(ws0.a.class, null, null, 6, null);
        f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        e7Var.f104054a = aVar3;
        e7Var.f104057d = 1;
        Object objC = bVar.C(e7Var);
        if (objC != aVar2) {
            aVar = aVar3;
            objI = objC;
        }
        return aVar2;
        b63.o oVarD = g22.l.d(b63.o.INSTANCE);
        xs0.a aVar4 = xs0.a.GENERIC;
        e7Var.f104054a = null;
        e7Var.f104057d = 2;
        objI = aVar.i((String) objI, oVarD, aVar4, e7Var);
    }

    @Override // o52.e
    public final long k(com.garmin.android.apps.connectmobile.workouts.presentation.details.f.c cVar) {
        uk1.j jVarA = uk1.j.f171905b.a();
        jVarA.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new uk1.g(jVarA, false, "CYCLING", 2, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o52.e
    public final Object l(long j8, v13.c cVar) {
        g7 g7Var;
        if (cVar instanceof g7) {
            g7Var = (g7) cVar;
            int i14 = g7Var.f104092c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g7Var.f104092c = i14 - Integer.MIN_VALUE;
            } else {
                g7Var = new g7(this, cVar);
            }
        } else {
            g7Var = new g7(this, cVar);
        }
        Object objJ = g7Var.f104090a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g7Var.f104092c;
        if (i15 == 0) {
            o13.r.b(objJ);
            uw1.b.f172999a.getClass();
            uw1.b bVar = new uw1.b();
            g7Var.f104092c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new uw1.e(j8, null), g7Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            return null;
        }
        tw1.m mVar = (tw1.m) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        DateTime startDate = mVar.getStartDate();
        if (startDate == null) {
            startDate = DateTime.now();
        }
        DateTime dateTime = startDate;
        DateTime dateTimeO = mVar.o();
        if (dateTimeO == null) {
            dateTimeO = dateTime.plusWeeks(mVar.getDurationInWeeks());
        }
        DateTime dateTime2 = dateTimeO;
        long trainingPlanId = mVar.getTrainingPlanId();
        dateTime.getClass();
        dateTime2.getClass();
        return new com.garmin.android.apps.connectmobile.workouts.data.model.c0(trainingPlanId, dateTime, dateTime2, mVar.getDurationInWeeks());
    }

    @Override // o52.e
    public final void m() {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.ENTERED_WORKOUTS);
    }

    @Override // o52.e
    public final void n(Context context) {
        context.getClass();
        context.startActivity(new Intent(context, (Class<?>) PowerCurveActivity.class));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o52.e
    public final Object o(v13.c cVar) {
        i7 i7Var;
        if (cVar instanceof i7) {
            i7Var = (i7) cVar;
            int i14 = i7Var.f104135c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i7Var.f104135c = i14 - Integer.MIN_VALUE;
            } else {
                i7Var = new i7(this, cVar);
            }
        } else {
            i7Var = new i7(this, cVar);
        }
        Object objI = i7Var.f104133a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i7Var.f104135c;
        if (i15 == 0) {
            o13.r.b(objI);
            zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
            i7Var.f104135c = 1;
            objI = j1Var.i(i7Var);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        return Boolean.valueOf(objI instanceof c80.s.a);
    }

    @Override // o52.e
    public final void p(Context context) {
        context.getClass();
        context.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context, c80.q.LIVE_ACTIVITY, false));
    }

    @Override // o52.e
    public final boolean q() {
        return km2.a.f(SupportedCapability.WORKOUT_DOWNLOAD.ordinal());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o52.e
    public final Object r(v13.c cVar) {
        l7 l7Var;
        if (cVar instanceof l7) {
            l7Var = (l7) cVar;
            int i14 = l7Var.f104215c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l7Var.f104215c = i14 - Integer.MIN_VALUE;
            } else {
                l7Var = new l7(this, cVar);
            }
        } else {
            l7Var = new l7(this, cVar);
        }
        Object objI = l7Var.f104213a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = l7Var.f104215c;
        if (i15 == 0) {
            o13.r.b(objI);
            zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
            l7Var.f104215c = 1;
            objI = j1Var.i(l7Var);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        return Boolean.valueOf(objI instanceof c80.s.b);
    }

    @Override // o52.e
    public final boolean s() {
        com.garmin.android.apps.connectmobile.k1.f37122a.getClass();
        return bo1.a.a().c().p0();
    }

    @Override // o52.e
    public final void t(Activity activity, WorkoutScheduleDTO workoutScheduleDTO) {
        activity.getClass();
        workoutScheduleDTO.getClass();
        RescheduleSTPWorkoutActivity.f49530b.getClass();
        Intent intent = new Intent(activity, (Class<?>) RescheduleSTPWorkoutActivity.class);
        intent.putExtra("GCM_workout_lite_data", workoutScheduleDTO);
        activity.startActivityForResult(intent, 208);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r8 == r1) goto L21;
     */
    @Override // o52.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable u(v13.c cVar) {
        f7 f7Var;
        if (cVar instanceof f7) {
            f7Var = (f7) cVar;
            int i14 = f7Var.f104070c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f7Var.f104070c = i14 - Integer.MIN_VALUE;
            } else {
                f7Var = new f7(this, cVar);
            }
        } else {
            f7Var = new f7(this, cVar);
        }
        Object objC = f7Var.f104068a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f7Var.f104070c;
        if (i15 == 0) {
            o13.r.b(objC);
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            f7Var.f104070c = 1;
            objC = bVar.C(f7Var);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objC);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objC;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            return p13.j0.f134944a;
        }
        Iterable<vs0.b> iterable = (Iterable) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        for (vs0.b bVar2 : iterable) {
            Double speed = bVar2.getSpeed();
            arrayList.add(new z52.e(speed != null ? speed.doubleValue() * ((double) 10) : 0.0d, bVar2.getHeartRate(), bVar2.getCyclingHeartRate()));
        }
        return arrayList;
        ws0.a aVar2 = (ws0.a) KoinJavaComponent.get$default(ws0.a.class, null, null, 6, null);
        f7Var.f104070c = 2;
        objC = aVar2.g((String) objC, f7Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o52.e
    public final Object v(long j8, long j14, String str, v13.c cVar) {
        m7 m7Var;
        boolean z14;
        if (cVar instanceof m7) {
            m7Var = (m7) cVar;
            int i14 = m7Var.f104238c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m7Var.f104238c = i14 - Integer.MIN_VALUE;
            } else {
                m7Var = new m7(this, cVar);
            }
        } else {
            m7Var = new m7(this, cVar);
        }
        Object objJ = m7Var.f104236a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m7Var.f104238c;
        if (i15 == 0) {
            o13.r.b(objJ);
            uw1.b.f172999a.getClass();
            uw1.b bVar = new uw1.b();
            m7Var.f104238c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new uw1.j(j8, j14, str, null), m7Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            tw1.j taskWorkout = ((tw1.r) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).getTaskWorkout();
            z14 = (taskWorkout != null ? taskWorkout.getWorkoutScheduleId() : null) != null;
        }
        return Boolean.valueOf(z14);
    }

    @Override // o52.e
    public final Intent w(WorkoutDetailsActivity workoutDetailsActivity, long j8, String str, Integer num, Integer num2, int i14, int i15, String str2) {
        workoutDetailsActivity.getClass();
        LiveActivityActivity.a aVar = LiveActivityActivity.f50544d;
        zf2.d dVarA = a(workoutDetailsActivity, str, num, num2);
        zf2.i.a aVar2 = new zf2.i.a(i14, i15);
        aVar.getClass();
        Intent intentB = LiveActivityActivity.a.b(workoutDetailsActivity, j8, dVarA, aVar2, str2, false, false, false);
        intentB.setFlags(335544320);
        return intentB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o52.e
    public final Object x(boolean z14, v13.c cVar) throws JSONException {
        d7 d7Var;
        vk1.b bVar;
        com.garmin.android.apps.connectmobile.v2 v2Var;
        if (cVar instanceof d7) {
            d7Var = (d7) cVar;
            int i14 = d7Var.f104035e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d7Var.f104035e = i14 - Integer.MIN_VALUE;
            } else {
                d7Var = new d7(this, cVar);
            }
        } else {
            d7Var = new d7(this, cVar);
        }
        Object obj = d7Var.f104033c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d7Var.f104035e;
        vk1.f fVarA = null;
        if (i15 == 0) {
            o13.r.b(obj);
            vk1.b bVar2 = new vk1.b();
            if (z14) {
                wk1.a aVarA = wk1.a.C3455a.a(wk1.a.f185807b);
                d7Var.f104032b = bVar2;
                d7Var.f104031a = z14;
                d7Var.f104035e = 1;
                Object objC = aVarA.C(new wk1.b(aVarA, null), d7Var);
                if (objC != aVar) {
                    bVar = bVar2;
                    obj = objC;
                    v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
                }
            } else {
                wk1.a aVarA2 = wk1.a.C3455a.a(wk1.a.f185807b);
                d7Var.f104032b = bVar2;
                d7Var.f104031a = z14;
                d7Var.f104035e = 2;
                Object objC2 = aVarA2.C(new wk1.c(aVarA2, null), d7Var);
                if (objC2 != aVar) {
                    bVar = bVar2;
                    obj = objC2;
                    v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
                }
            }
            return aVar;
        }
        if (i15 == 1) {
            z14 = d7Var.f104031a;
            bVar = d7Var.f104032b;
            o13.r.b(obj);
            v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = d7Var.f104031a;
            bVar = d7Var.f104032b;
            o13.r.b(obj);
            v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        }
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            String str = (String) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            if (str == null) {
                str = "";
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                if (z14) {
                    vk1.c.f178593a.getClass();
                    fVarA = vk1.c.a();
                }
                bVar.f178585e = fVarA;
                return bVar;
            }
            int length = jSONArray.length();
            for (int i16 = 0; i16 < length; i16++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i16);
                vk1.f fVar = new vk1.f();
                fVar.k(jSONObject);
                vk1.e eVarD = vk1.c.d(fVar);
                if (eVarD != null) {
                    int i17 = b.f104024a[eVarD.ordinal()];
                    if (i17 == 1) {
                        bVar.f178585e = fVar;
                    } else if (i17 == 2) {
                        bVar.f178586f = fVar;
                    } else if (i17 == 3) {
                        bVar.f178587g = fVar;
                    } else if (i17 == 4) {
                        bVar.f178588h = fVar;
                    }
                }
            }
        } else if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
            lc.u0.r();
            return null;
        }
        return bVar;
    }

    @Override // o52.e
    public final boolean y() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("barbell_exercise_pr_enabled");
    }

    @Override // o52.e
    public final void z(WorkoutDetailsActivity workoutDetailsActivity) {
        workoutDetailsActivity.getClass();
        LiveActivityActivity.f50544d.getClass();
        workoutDetailsActivity.startActivity(LiveActivityActivity.a.a(workoutDetailsActivity));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/c7$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
