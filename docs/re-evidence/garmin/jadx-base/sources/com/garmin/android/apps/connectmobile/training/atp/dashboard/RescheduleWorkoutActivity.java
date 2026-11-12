package com.garmin.android.apps.connectmobile.training.atp.dashboard;

import am.a2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.x;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import java.util.ArrayList;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import wt1.t;
import wt1.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/RescheduleWorkoutActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/a$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RescheduleWorkoutActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.training.atp.dashboard.a.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f45357n = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f45361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xw1.d f45362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WorkoutScheduleDTO f45363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public wt1.b f45364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DateTime f45365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FrameLayout f45366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.training.atp.dashboard.a f45367j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45358a = m.a(n.NONE, new c(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f45359b = (u) KoinJavaComponent.get$default(u.class, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f45360c = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45368k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a4.b f45369l = new a4.b(this, 14);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f45370m = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/dashboard/RescheduleWorkoutActivity$b", "Lcu1/n;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends cu1.n {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            RescheduleWorkoutActivity rescheduleWorkoutActivity = RescheduleWorkoutActivity.this;
            rescheduleWorkoutActivity.hideProgressOverlay();
            g1.b(rescheduleWorkoutActivity, cVar);
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                wt1.b bVar = rescheduleWorkoutActivity.f45364g;
                if (bVar != null) {
                    bVar.e();
                }
                rescheduleWorkoutActivity.setResult(-1);
                rescheduleWorkoutActivity.finish();
                return;
            }
            FrameLayout frameLayout = rescheduleWorkoutActivity.f45366i;
            if (frameLayout == null) {
                s.m("calendarContainer");
                throw null;
            }
            frameLayout.setVisibility(8);
            Button button = rescheduleWorkoutActivity.f45361d;
            if (button == null) {
                s.m("rescheduleButton");
                throw null;
            }
            button.setVisibility(8);
            wt1.b bVar2 = rescheduleWorkoutActivity.f45364g;
            if (bVar2 != null) {
                bVar2.g();
            }
            wt1.b bVar3 = rescheduleWorkoutActivity.f45364g;
            if (bVar3 != null) {
                bVar3.c(new cu1.s(rescheduleWorkoutActivity, 2));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f45373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f45374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f45375d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f45372a = gVar;
            this.f45373b = qualifier;
            this.f45374c = aVar;
            this.f45375d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, wt1.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f45372a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f45374c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), viewModelStore, null, defaultViewModelCreationExtras, this.f45373b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f45375d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.a.b
    public final void P8() {
        Button button = this.f45361d;
        if (button != null) {
            button.setEnabled(false);
        } else {
            s.m("rescheduleButton");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final void ca() {
        showProgressOverlay();
        t tVar = (t) this.f45358a.getValue();
        tVar.getClass();
        androidx.lifecycle.m.a(null, new wt1.s(tVar, null), 3).f(this, this.f45369l);
    }

    public final void da() {
        if (this.f45365h != null) {
            xw1.d dVar = this.f45362e;
            if (dVar == null) {
                s.m("athletePlanDTO");
                throw null;
            }
            long athletePlanId = dVar.getAthletePlanId();
            WorkoutScheduleDTO workoutScheduleDTO = this.f45363f;
            if (workoutScheduleDTO == null) {
                s.m("workoutScheduleDTO");
                throw null;
            }
            long j8 = workoutScheduleDTO.f48067c;
            DateTime dateTimeNow = this.f45365h;
            if (dateTimeNow == null) {
                dateTimeNow = DateTime.now();
            }
            DateTime dateTime = dateTimeNow;
            dateTime.getClass();
            this.f45360c.add(Long.valueOf(this.f45359b.l(athletePlanId, j8, dateTime, this.f45370m)));
            showProgressOverlay();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.a.b
    public final void f9() {
        String strValueOf = String.valueOf(this.f45367j != null ? 3 : null);
        String string = getString(R.string.lbl_consecutive_workouts, strValueOf);
        string.getClass();
        String string2 = getString(R.string.msg_consecutive_workouts, strValueOf);
        string2.getClass();
        q1.f41066b.getClass();
        q1 q1VarB = q1.b.b(string, string2);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarB.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.dashboard.a.b
    public final void j8() {
        Button button = this.f45361d;
        if (button != null) {
            button.setEnabled(true);
        } else {
            s.m("rescheduleButton");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_training_reschedule_workout);
        initActionBar(true, R.string.lbl_reschedule_workout);
        WorkoutScheduleDTO workoutScheduleDTO = (WorkoutScheduleDTO) a2.c(getIntent().getExtras(), "GCM_workout_lite_data");
        if (workoutScheduleDTO == null) {
            i2.a aVar = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "RescheduleWorkoutAct", "Missing required workout object");
            finish();
            return;
        }
        this.f45363f = workoutScheduleDTO;
        View viewFindViewById = findViewById(R.id.calendar_content_frame);
        viewFindViewById.getClass();
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        this.f45366i = frameLayout;
        frameLayout.addOnLayoutChangeListener(new com.google.android.material.carousel.a(this, 1));
        wt1.b bVar = new wt1.b(findViewById(R.id.training_error_layout));
        this.f45364g = bVar;
        bVar.b();
        wt1.b bVar2 = this.f45364g;
        if (bVar2 != null) {
            bVar2.d(new cu1.s(this, 0));
        }
        wt1.b bVar3 = this.f45364g;
        if (bVar3 != null) {
            bVar3.f();
        }
        wt1.b bVar4 = this.f45364g;
        if (bVar4 != null) {
            bVar4.e();
        }
        View viewFindViewById2 = findViewById(R.id.workout_reschedule_btn);
        viewFindViewById2.getClass();
        Button button = (Button) viewFindViewById2;
        this.f45361d = button;
        button.setOnClickListener(new x(this, 9));
        ca();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        hideProgressOverlay();
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.c(this.f45360c);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/RescheduleWorkoutActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
