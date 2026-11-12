package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleDestroyedException;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import java.util.ArrayList;
import java.util.List;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/WorkoutEditActivity;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/a;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutEditActivity extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f48854j = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f48855i = "";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditActivity$init$3", f = "WorkoutEditActivity.kt", l = {114, 213}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48856a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f48858a = new a();

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                dialogInterface.getClass();
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditActivity$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DialogInterfaceOnClickListenerC0950b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ WorkoutEditActivity f48859a;

            public DialogInterfaceOnClickListenerC0950b(WorkoutEditActivity workoutEditActivity) {
                this.f48859a = workoutEditActivity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                this.f48859a.finish();
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c implements r53.i<v52.c.C3278c<q>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f48860a;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f48861a;

                /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditActivity$b$c$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditActivity$init$3$invokeSuspend$$inlined$mapNotNull$1$2", f = "WorkoutEditActivity.kt", l = {52}, m = "emit", v = 2)
                public static final class C0951a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f48862a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f48863b;

                    public C0951a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f48862a = obj;
                        this.f48863b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar) {
                    this.f48861a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C0951a c0951a;
                    if (dVar instanceof C0951a) {
                        c0951a = (C0951a) dVar;
                        int i14 = c0951a.f48863b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c0951a.f48863b = i14 - Integer.MIN_VALUE;
                        } else {
                            c0951a = new C0951a(dVar);
                        }
                    } else {
                        c0951a = new C0951a(dVar);
                    }
                    Object obj2 = c0951a.f48862a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c0951a.f48863b;
                    if (i15 == 0) {
                        o13.r.b(obj2);
                        v52.c cVar = (v52.c) obj;
                        v52.c.C3278c c3278c = cVar instanceof v52.c.C3278c ? (v52.c.C3278c) cVar : null;
                        if (c3278c != null) {
                            c0951a.f48863b = 1;
                            if (this.f48861a.emit(c3278c, c0951a) == aVar) {
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
                this.f48860a = iVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super v52.c.C3278c<q>> jVar, t13.d dVar) {
                Object objCollect = this.f48860a.collect(new a(jVar), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class d implements e23.a<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f48865a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutEditActivity f48866b;

            public d(q qVar, WorkoutEditActivity workoutEditActivity) {
                this.f48865a = qVar;
                this.f48866b = workoutEditActivity;
            }

            @Override // e23.a
            public final Unit invoke() {
                m52.l lVar;
                q qVar = this.f48865a;
                if (qVar.f49245a == m52.k.f116764z && (lVar = qVar.f49246b) != null && lVar != m52.l.GENERIC) {
                    Object[] objArr = {lVar.name()};
                    WorkoutEditActivity workoutEditActivity = this.f48866b;
                    String string = workoutEditActivity.getString(R.string.workout_edit_workout_prompt_msg, objArr);
                    string.getClass();
                    new androidx.appcompat.app.e.a(workoutEditActivity).setMessage(string).setPositiveButton(workoutEditActivity.getString(R.string.lbl_common_continue), a.f48858a).setNegativeButton(workoutEditActivity.getString(R.string.lbl_cancel), new DialogInterfaceOnClickListenerC0950b(workoutEditActivity)).show();
                }
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return WorkoutEditActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
        
            if (androidx.lifecycle.d2.a(r4, r5, r6, r7, r8, r10) == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            m52.l lVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48856a;
            WorkoutEditActivity workoutEditActivity = WorkoutEditActivity.this;
            if (i14 == 0) {
                o13.r.b(obj);
                c cVar = new c(workoutEditActivity.ga().f49286m);
                this.f48856a = 1;
                obj = r53.s.x(cVar, this);
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
            return Unit.INSTANCE;
            q qVar = (q) ((v52.c.C3278c) obj).f175760a;
            androidx.lifecycle.b0 f158016a = workoutEditActivity.getF158016a();
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.RESUMED;
            x53.c cVar2 = s0.f129406a;
            t1 t1VarH = u53.o.f168762a.H();
            boolean zIsDispatchNeeded = t1VarH.isDispatchNeeded(getF157466b());
            if (zIsDispatchNeeded) {
                d dVar = new d(qVar, workoutEditActivity);
                this.f48856a = 2;
            } else {
                if (f158016a.getF7973d() == androidx.lifecycle.b0.b.DESTROYED) {
                    throw new LifecycleDestroyedException();
                }
                if (f158016a.getF7973d().compareTo(bVar) >= 0) {
                    if (qVar.f49245a == m52.k.f116764z && (lVar = qVar.f49246b) != null && lVar != m52.l.GENERIC) {
                        String string = workoutEditActivity.getString(R.string.workout_edit_workout_prompt_msg, lVar.name());
                        string.getClass();
                        new androidx.appcompat.app.e.a(workoutEditActivity).setMessage(string).setPositiveButton(workoutEditActivity.getString(R.string.lbl_common_continue), a.f48858a).setNegativeButton(workoutEditActivity.getString(R.string.lbl_cancel), new DialogInterfaceOnClickListenerC0950b(workoutEditActivity)).show();
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    d dVar2 = new d(qVar, workoutEditActivity);
                    this.f48856a = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.a
    /* JADX INFO: renamed from: fa, reason: from getter */
    public final String getF48853i() {
        return this.f48855i;
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.a
    public final void ha(Long l14, String str, g gVar) {
        if (gVar instanceof g.a) {
            Intent intent = new Intent();
            intent.putExtra("extra_workout_dto", ea(null));
            intent.putExtra("extra_sports_segment_index", ((g.a) gVar).f48992a);
            setResult(-1, intent);
            finish();
            return;
        }
        if (l14 == null || str == null) {
            a2 a2Var = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "WorkoutEditActivity", "workoutID or workoutName - is null on onPreSaveStepsComplete()");
            return;
        }
        r rVarGa = ga();
        long jLongValue = l14.longValue();
        WorkoutDetailsDTO workoutDetailsDTOEa = ea(str);
        workoutDetailsDTOEa.f48040a = jLongValue;
        m52.l lVar = m52.l.GENERIC;
        lVar.getClass();
        workoutDetailsDTOEa.f48045f = lVar;
        rVarGa.V4(workoutDetailsDTOEa);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x018f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.a
    public final void init() {
        Parcelable parcelable;
        Parcelable parcelable2;
        ArrayList parcelableArrayListExtra;
        ArrayList arrayList;
        ArrayList parcelableArrayListExtra2;
        ArrayList arrayList2;
        m52.k kVar;
        String string;
        String description;
        g aVar;
        int iA0;
        Double d14;
        Double d15;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.h0> list;
        boolean booleanExtra = getIntent().getBooleanExtra("extra_is_from_multi_sports_workout", false);
        int intExtra = getIntent().getIntExtra("extra_sports_segment_index", 0);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("extra_workout_dto", WorkoutDetailsDTO.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_workout_dto") : null;
            if (!(parcelableExtra instanceof WorkoutDetailsDTO)) {
                parcelableExtra = null;
            }
            parcelable = (WorkoutDetailsDTO) parcelableExtra;
        }
        WorkoutDetailsDTO workoutDetailsDTO = (WorkoutDetailsDTO) parcelable;
        com.garmin.android.apps.connectmobile.workouts.data.model.h0 h0Var = (workoutDetailsDTO == null || (list = workoutDetailsDTO.Q0) == null) ? null : list.get(intExtra);
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            parcelable2 = intent2 != null ? (Parcelable) intent2.getParcelableExtra("extra_cycling_power_zone_dto", PowerZonesDTO.class) : null;
        } else {
            Parcelable parcelableExtra2 = intent2 != null ? intent2.getParcelableExtra("extra_cycling_power_zone_dto") : null;
            if (!(parcelableExtra2 instanceof PowerZonesDTO)) {
                parcelableExtra2 = null;
            }
            parcelable2 = (PowerZonesDTO) parcelableExtra2;
        }
        PowerZonesDTO powerZonesDTO = (PowerZonesDTO) parcelable2;
        Intent intent3 = getIntent();
        if (i14 >= 33) {
            if (intent3 != null) {
                parcelableArrayListExtra = intent3.getParcelableArrayListExtra("extra_benchmark_list_dto", com.garmin.android.apps.connectmobile.workouts.data.model.b.class);
                arrayList = parcelableArrayListExtra;
            } else {
                arrayList = null;
            }
        } else if (intent3 != null) {
            parcelableArrayListExtra = intent3.getParcelableArrayListExtra("extra_benchmark_list_dto");
            arrayList = parcelableArrayListExtra;
        } else {
            arrayList = null;
        }
        Intent intent4 = getIntent();
        if (i14 >= 33) {
            if (intent4 != null) {
                parcelableArrayListExtra2 = intent4.getParcelableArrayListExtra("extra_power_curve_target_dto", com.garmin.android.apps.connectmobile.workouts.data.model.v.class);
                arrayList2 = parcelableArrayListExtra2;
            } else {
                arrayList2 = null;
            }
        } else if (intent4 != null) {
            parcelableArrayListExtra2 = intent4.getParcelableArrayListExtra("extra_power_curve_target_dto");
            arrayList2 = parcelableArrayListExtra2;
        } else {
            arrayList2 = null;
        }
        boolean booleanExtra2 = getIntent().getBooleanExtra("extra_has_training.plan", false);
        long longExtra = getIntent().getLongExtra("GCM_workout_queue_download_to_device", -1L);
        if (booleanExtra) {
            if (h0Var != null) {
                kVar = h0Var.f48193h;
            } else {
                kVar = null;
            }
        } else if (workoutDetailsDTO != null) {
            kVar = workoutDetailsDTO.f48044e;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            kVar = m52.k.f116756p;
        }
        double dDoubleValue = (workoutDetailsDTO == null || (d15 = workoutDetailsDTO.f48047h) == null) ? Double.NaN : d15.doubleValue();
        m52.j jVar = workoutDetailsDTO != null ? workoutDetailsDTO.f48048i : null;
        d.a aVar2 = d.f48945a;
        Double d16 = workoutDetailsDTO != null ? workoutDetailsDTO.f48047h : null;
        m52.j jVar2 = workoutDetailsDTO != null ? workoutDetailsDTO.f48048i : null;
        aVar2.getClass();
        d dVarA = d.a.a(d16, jVar2);
        k0 k0Var = k0.f49020a;
        if (!zf.b.D(Double.valueOf(dDoubleValue))) {
            ga();
            dDoubleValue = 25.0d;
        }
        double d17 = dDoubleValue;
        k0Var.getClass();
        k0.a aVarA = k0.a(kVar, d17, jVar, booleanExtra);
        l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVarF = (workoutDetailsDTO == null || workoutDetailsDTO.Q0.isEmpty()) ? aVarA.f() : workoutDetailsDTO.Q0.get(intExtra).t();
        r rVarGa = ga();
        if (jVar == null) {
            jVar = m52.j.f116747g;
        }
        rVarGa.f49278e = jVar;
        String str = workoutDetailsDTO != null ? workoutDetailsDTO.f48041b : null;
        if (booleanExtra) {
            string = getString(R.string.lbl_workout_type_leg, getString(kVar.e()));
            string.getClass();
        } else {
            string = str == null ? "" : str;
        }
        this.f48855i = string;
        r rVarGa2 = ga();
        m52.l lVar = workoutDetailsDTO != null ? workoutDetailsDTO.f48045f : null;
        Long lValueOf = longExtra != -1 ? Long.valueOf(longExtra) : null;
        Long lValueOf2 = workoutDetailsDTO != null ? Long.valueOf(workoutDetailsDTO.f48040a) : null;
        if (booleanExtra) {
            if (h0Var != null) {
                description = h0Var.getDescription();
            } else {
                description = null;
            }
        } else if (workoutDetailsDTO != null) {
            description = workoutDetailsDTO.f48046g;
        } else {
            description = null;
        }
        f62.o oVar = new f62.o(workoutDetailsDTO != null ? workoutDetailsDTO.f48049j : null, Double.valueOf((workoutDetailsDTO == null || (d14 = workoutDetailsDTO.f48050k) == null) ? Double.NaN : d14.doubleValue()), workoutDetailsDTO != null ? workoutDetailsDTO.f48053m : null, workoutDetailsDTO != null ? workoutDetailsDTO.f48054n : null);
        if (booleanExtra) {
            if (workoutDetailsDTO != null) {
                iA0 = workoutDetailsDTO.a0() - (h0Var != null ? h0Var.s() : 0);
            } else {
                iA0 = 0;
            }
            aVar = new g.a(intExtra, iA0, workoutDetailsDTO == null ? false : zf.b.B(workoutDetailsDTO));
        } else {
            aVar = g.b.f48995a;
        }
        rVarGa2.G4(kVar, lVar, lValueOf, lValueOf2, str, iVarF, aVarA, arrayList2, powerZonesDTO, arrayList, description, booleanExtra2, dVarA, oVar, aVar, workoutDetailsDTO != null ? workoutDetailsDTO.D() : false, new r.d(workoutDetailsDTO != null ? workoutDetailsDTO.D : null, workoutDetailsDTO != null ? workoutDetailsDTO.E : null), workoutDetailsDTO != null ? p005kotlin.jvm.internal.s.g(workoutDetailsDTO.I0, Boolean.TRUE) : false, workoutDetailsDTO != null ? workoutDetailsDTO.C() : null);
        ge1.b.T(o53.f0.w(this), null, null, new b(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/WorkoutEditActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_WORKOUT_DTO", "EXTRA_BENCHMARK_LIST_DTO", "EXTRA_CYCLING_POWER_ZONE_DTO", "EXTRA_POWER_CURVE_TARGET_DTO", "EXTRA_HAS_TRAINING_PLAN", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
