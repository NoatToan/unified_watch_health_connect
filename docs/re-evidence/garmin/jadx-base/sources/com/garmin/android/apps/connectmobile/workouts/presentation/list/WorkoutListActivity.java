package com.garmin.android.apps.connectmobile.workouts.presentation.list;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.h1;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.r0;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.a0;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkExerciseActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.msn.MSNWorkoutListActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.schedule.ScheduleWorkoutTypeActivity;
import e23.l;
import e23.p;
import java.util.ArrayList;
import lc.u0;
import m52.k;
import o13.m;
import o13.n;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import o53.s0;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import r53.e2;
import r53.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/list/WorkoutListActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "", "isChildRestricted", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutListActivity extends r0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f49414i = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f49415e = m.a(n.NONE, new g(this, null, null, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f49416f = m.b(new h62.c(this, 0));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.c<Intent> f49417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.c<Intent> f49418h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity$onCreate$1", f = "WorkoutListActivity.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49419a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity$onCreate$1$1", f = "WorkoutListActivity.kt", l = {77}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f49421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutListActivity f49422b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0969a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ WorkoutListActivity f49423a;

                public C0969a(WorkoutListActivity workoutListActivity) {
                    this.f49423a = workoutListActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    ArrayList<? extends Parcelable> arrayList;
                    String str;
                    com.garmin.android.apps.connectmobile.workouts.presentation.list.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.list.e) obj;
                    a aVar = WorkoutListActivity.f49414i;
                    boolean z14 = eVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.list.e.c;
                    WorkoutListActivity workoutListActivity = this.f49423a;
                    if (z14) {
                        workoutListActivity.displayFailedMessage();
                    } else if (eVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.list.e.b) {
                        f.c<Intent> cVar = workoutListActivity.f49418h;
                        WorkoutDetailsActivity.a aVar2 = WorkoutDetailsActivity.f48482f;
                        long j8 = ((com.garmin.android.apps.connectmobile.workouts.presentation.list.e.b) eVar).f49445a;
                        aVar2.getClass();
                        Intent intent = new Intent(workoutListActivity, (Class<?>) WorkoutDetailsActivity.class);
                        intent.putExtra("GCM_extra_activity_type", 202);
                        intent.putExtra("GCM_workout_id", j8);
                        cVar.a(intent, null);
                    } else if (eVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.list.e.a) {
                        workoutListActivity.setResult(-1);
                        workoutListActivity.finish();
                    } else {
                        workoutListActivity.getClass();
                        if (!(eVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.list.e.d)) {
                            u0.r();
                            return null;
                        }
                        com.garmin.android.apps.connectmobile.workouts.presentation.list.e.d dVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.list.e.d) eVar;
                        long j14 = dVar2.f49449c;
                        WorkoutDTO workoutDTO = dVar2.f49448b;
                        ArrayList arrayList2 = dVar2.f49447a.f48038a;
                        if (arrayList2 != null) {
                            arrayList = new ArrayList<>();
                            for (Object obj2 : arrayList2) {
                                a0 a0Var = (a0) obj2;
                                String str2 = a0Var.f48094w;
                                if (!(str2 != null && str2.equals("FBT_ADAPTIVE")) && ((str = a0Var.f48094w) == null || !str.equals("ITP"))) {
                                    arrayList.add(obj2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        arrayList.getClass();
                        if (arrayList.isEmpty()) {
                            h62.m mVarMa = workoutListActivity.ma();
                            long j15 = workoutDTO.f48040a;
                            DateTime dateTime = new DateTime(j14);
                            mVarMa.getClass();
                            w9.a aVarA = v1.a(mVarMa);
                            x53.c cVar2 = s0.f129406a;
                            ge1.b.T(aVarA, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.workouts.presentation.list.a(mVarMa, dateTime, j15, null), 2);
                        } else {
                            f.c<Intent> cVar3 = workoutListActivity.f49417g;
                            Intent intent2 = new Intent(workoutListActivity, (Class<?>) ScheduleWorkoutTypeActivity.class);
                            intent2.putExtra("GCM_workout_dto", workoutDTO);
                            intent2.putExtra("extra.date.time", j14);
                            intent2.putParcelableArrayListExtra("GCM_tp_active_plans", arrayList);
                            cVar3.a(intent2, null);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WorkoutListActivity workoutListActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f49422b = workoutListActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f49422b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f49421a;
                if (i14 == 0) {
                    r.b(obj);
                    a aVar2 = WorkoutListActivity.f49414i;
                    WorkoutListActivity workoutListActivity = this.f49422b;
                    e2 e2Var = workoutListActivity.ma().f82254f;
                    C0969a c0969a = new C0969a(workoutListActivity);
                    this.f49421a = 1;
                    e2Var.getClass();
                    if (e2.m(e2Var, c0969a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return WorkoutListActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49419a;
            if (i14 == 0) {
                r.b(obj);
                WorkoutListActivity workoutListActivity = WorkoutListActivity.this;
                androidx.lifecycle.b0 f158017a = workoutListActivity.getF158016a();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(workoutListActivity, null);
                this.f49419a = 1;
                if (h1.a(f158017a, bVar, aVar2, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.a<Unit> {
        public c(Object obj) {
            super(0, obj, WorkoutListActivity.class, "onFindWorkout", "onFindWorkout()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            WorkoutListActivity workoutListActivity = (WorkoutListActivity) this.receiver;
            f.c<Intent> cVar = workoutListActivity.f49418h;
            MSNWorkoutListActivity.f49457a.getClass();
            cVar.a(new Intent(workoutListActivity, (Class<?>) MSNWorkoutListActivity.class), null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements e23.a<Unit> {
        public d(Object obj) {
            super(0, obj, WorkoutListActivity.class, "onCreateWorkout", "onCreateWorkout()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            WorkoutListActivity workoutListActivity = (WorkoutListActivity) this.receiver;
            f.c<Intent> cVar = workoutListActivity.f49418h;
            WorkoutPreCreateActivity.f48888d.getClass();
            cVar.a(new Intent(workoutListActivity, (Class<?>) WorkoutPreCreateActivity.class), null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements e23.a<Unit> {
        public e(Object obj) {
            super(0, obj, WorkoutListActivity.class, "onBenchmarkExercise", "onBenchmarkExercise()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            WorkoutListActivity workoutListActivity = (WorkoutListActivity) this.receiver;
            a aVar = WorkoutListActivity.f49414i;
            workoutListActivity.getClass();
            BenchmarkExerciseActivity.f48361a.getClass();
            workoutListActivity.startActivity(new Intent(workoutListActivity, (Class<?>) BenchmarkExerciseActivity.class));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements l<WorkoutDTO, Unit> {
        public f(Object obj) {
            super(1, obj, WorkoutListActivity.class, "onWorkoutSelected", "onWorkoutSelected(Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(WorkoutDTO workoutDTO) {
            Intent intentA;
            WorkoutDTO workoutDTO2 = workoutDTO;
            workoutDTO2.getClass();
            WorkoutListActivity workoutListActivity = (WorkoutListActivity) this.receiver;
            a aVar = WorkoutListActivity.f49414i;
            if (((Boolean) workoutListActivity.f49416f.getValue()).booleanValue()) {
                long longExtra = workoutListActivity.getIntent().getLongExtra("extra.date.time", -1L);
                h62.m mVarMa = workoutListActivity.ma();
                mVarMa.getClass();
                w9.a aVarA = v1.a(mVarMa);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.workouts.presentation.list.d(mVarMa, longExtra, workoutDTO2, null), 2);
            } else {
                f.c<Intent> cVar2 = workoutListActivity.f49418h;
                if (workoutDTO2.f48044e == k.A) {
                    MultiSportsDetailsActivity.a aVar2 = MultiSportsDetailsActivity.f48440z;
                    long j8 = workoutDTO2.f48040a;
                    aVar2.getClass();
                    intentA = new Intent(workoutListActivity, (Class<?>) MultiSportsDetailsActivity.class);
                    intentA.putExtra("GCM_workout_id", j8);
                } else {
                    WorkoutDetailsActivity.a aVar3 = WorkoutDetailsActivity.f48482f;
                    long j14 = workoutDTO2.f48040a;
                    aVar3.getClass();
                    intentA = WorkoutDetailsActivity.a.a(workoutListActivity, j14, null);
                }
                cVar2.a(intentA, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<h62.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f49424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f49425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f49426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f49427d;

        public g(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f49424a = gVar;
            this.f49425b = qualifier;
            this.f49426c = aVar;
            this.f49427d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, h62.m] */
        @Override // e23.a
        public final h62.m invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f49424a;
            y1 viewModelStore = gVar.getF185700a();
            e23.a aVar = this.f49426c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(h62.m.class), viewModelStore, null, defaultViewModelCreationExtras, this.f49425b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f49427d, 4, null);
        }
    }

    public WorkoutListActivity() {
        final int i14 = 0;
        this.f49417g = registerForActivityResult(new g.h(), new f.b(this) { // from class: h62.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutListActivity f82212b;

            {
                this.f82212b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                WorkoutListActivity workoutListActivity = this.f82212b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        WorkoutListActivity.a aVar2 = WorkoutListActivity.f49414i;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            workoutListActivity.setResult(-1);
                            workoutListActivity.finish();
                        }
                        break;
                    default:
                        WorkoutListActivity.a aVar3 = WorkoutListActivity.f49414i;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            m mVarMa = workoutListActivity.ma();
                            mVarMa.getClass();
                            ge1.b.T(v1.a(mVarMa), null, null, new o(mVarMa, null), 3);
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f49418h = registerForActivityResult(new g.h(), new f.b(this) { // from class: h62.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutListActivity f82212b;

            {
                this.f82212b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                WorkoutListActivity workoutListActivity = this.f82212b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        WorkoutListActivity.a aVar2 = WorkoutListActivity.f49414i;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            workoutListActivity.setResult(-1);
                            workoutListActivity.finish();
                        }
                        break;
                    default:
                        WorkoutListActivity.a aVar3 = WorkoutListActivity.f49414i;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            m mVarMa = workoutListActivity.ma();
                            mVarMa.getClass();
                            ge1.b.T(v1.a(mVarMa), null, null, new o(mVarMa, null), 3);
                        }
                        break;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "WORKOUTS";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final h62.m ma() {
        return (h62.m) this.f49415e.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"CommitTransaction"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        initActionBar(true, R.string.concept_workouts);
        ca("WORKOUTS");
        ht.a.f85464a.getClass();
        ht.a.a(null, "PageViewWorkoutsList");
        ma().getClass();
        ((o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null)).m();
        ge1.b.T(f0.w(this), null, null, new b(null), 3);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(1995847075, true, new h62.b(this, 0)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        if (getSupportFragmentManager().M() > 0) {
            getSupportFragmentManager().Z();
            return true;
        }
        finish();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/list/WorkoutListActivity$a;", "", "<init>", "()V", "", "EXTRA_FROM_CALENDER", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
