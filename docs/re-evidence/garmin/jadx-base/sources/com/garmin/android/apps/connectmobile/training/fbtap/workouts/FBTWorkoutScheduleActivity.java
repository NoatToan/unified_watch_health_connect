package com.garmin.android.apps.connectmobile.training.fbtap.workouts;

import am.a2;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.v;
import androidx.lifecycle.h1;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.l2;
import fg0.k;
import fw.p;
import java.util.Map;
import jv1.e0;
import lc.u0;
import o13.r;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import r53.b2;
import r53.p2;
import r53.s;
import tw1.m;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/workouts/FBTWorkoutScheduleActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FBTWorkoutScheduleActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45552c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45553a = new w1(s0.f105811a.b(gw1.b.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.b f45554b = new a4.b(this, 25);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45555a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45555a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.workouts.FBTWorkoutScheduleActivity$onCreate$2", f = "FBTWorkoutScheduleActivity.kt", l = {82}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45556a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.workouts.FBTWorkoutScheduleActivity$onCreate$2$1", f = "FBTWorkoutScheduleActivity.kt", l = {83}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f45558a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FBTWorkoutScheduleActivity f45559b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.fbtap.workouts.FBTWorkoutScheduleActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "Ltw1/m;", "trainingPlanUIResource", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;)V"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.workouts.FBTWorkoutScheduleActivity$onCreate$2$1$1", f = "FBTWorkoutScheduleActivity.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0877a extends i implements e23.p<g3<? extends m>, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f45560a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FBTWorkoutScheduleActivity f45561b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0877a(FBTWorkoutScheduleActivity fBTWorkoutScheduleActivity, t13.d<? super C0877a> dVar) {
                    super(2, dVar);
                    this.f45561b = fBTWorkoutScheduleActivity;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    C0877a c0877a = new C0877a(this.f45561b, dVar);
                    c0877a.f45560a = obj;
                    return c0877a;
                }

                @Override // e23.p
                public final Object invoke(g3<? extends m> g3Var, t13.d<? super Unit> dVar) {
                    return ((C0877a) create(g3Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    g3 g3Var = (g3) this.f45560a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    r.b(obj);
                    a aVar2 = FBTWorkoutScheduleActivity.f45552c;
                    FBTWorkoutScheduleActivity fBTWorkoutScheduleActivity = this.f45561b;
                    fBTWorkoutScheduleActivity.getClass();
                    if (g3Var != null) {
                        int i14 = b.f45555a[g3Var.f35300a.ordinal()];
                        if (i14 == 1) {
                            fBTWorkoutScheduleActivity.hideProgressOverlay();
                            m mVar = (m) g3Var.f35301b;
                            if (mVar != null) {
                                fBTWorkoutScheduleActivity.ca(mVar);
                            }
                        } else if (i14 == 2) {
                            fBTWorkoutScheduleActivity.hideProgressOverlay();
                        } else {
                            if (i14 != 3) {
                                u0.r();
                                return null;
                            }
                            fBTWorkoutScheduleActivity.showProgressOverlay();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FBTWorkoutScheduleActivity fBTWorkoutScheduleActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f45559b = fBTWorkoutScheduleActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f45559b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f45558a;
                if (i14 == 0) {
                    r.b(obj);
                    a aVar2 = FBTWorkoutScheduleActivity.f45552c;
                    FBTWorkoutScheduleActivity fBTWorkoutScheduleActivity = this.f45559b;
                    b2 b2Var = fBTWorkoutScheduleActivity.da().W0;
                    C0877a c0877a = new C0877a(fBTWorkoutScheduleActivity, null);
                    this.f45558a = 1;
                    if (s.k(b2Var, c0877a, this) == aVar) {
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

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FBTWorkoutScheduleActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f45556a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                FBTWorkoutScheduleActivity fBTWorkoutScheduleActivity = FBTWorkoutScheduleActivity.this;
                a aVar2 = new a(fBTWorkoutScheduleActivity, null);
                this.f45556a = 1;
                if (h1.b(fBTWorkoutScheduleActivity, bVar, aVar2, this) == aVar) {
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
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45562a;

        public d(g gVar) {
            this.f45562a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45562a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45563a;

        public e(g gVar) {
            this.f45563a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45563a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45565b;

        public f(e23.a aVar, g gVar) {
            this.f45564a = aVar;
            this.f45565b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45564a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45565b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final void ca(m mVar) {
        da().O0 = da().N0;
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        com.garmin.android.apps.connectmobile.training.fbtap.workouts.b.f45573j.getClass();
        mVar.getClass();
        com.garmin.android.apps.connectmobile.training.fbtap.workouts.b bVar = new com.garmin.android.apps.connectmobile.training.fbtap.workouts.b();
        Bundle bundle = new Bundle();
        a2.b(bundle, "EXTRA_TRAINING_PLAN", mVar);
        bVar.setArguments(bundle);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content, bVar, null);
        aVar.e();
    }

    public final gw1.b da() {
        return (gw1.b) this.f45553a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 101) {
            setResult(-1);
            gw1.b bVarDa = da();
            w9.a aVarA = v1.a(bVarDa);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new gw1.a(bVarDa, null), 2);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object value;
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_training_plan_overview_layout);
        ((FrameLayout) findViewById(R.id.parent_container)).setBackgroundColor(getColor(R.color.gcm_background));
        initActionBar(true, R.string.lbl_workout_schedule);
        gw1.b bVarDa = da();
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        bVarDa.P0 = (e0) a2.c(bundleA, "extra_user_settings");
        bVarDa.Q0 = (k) a2.c(bundleA, "GCM_extra_event");
        bVarDa.R0 = a2.d(bundleA, "extra_fitness_stats_Activity");
        bVarDa.T0 = a2.d(bundleA, "extra_completed_activity_list");
        bVarDa.U0 = a2.d(bundleA, "extra_supporting_events_list");
        a2.f3853a.getClass();
        bVarDa.V0 = (Map) a2.e(bundleA, "extra_events_weather_data");
        m mVar = (m) a2.c(bundleA, "extra_training_plan");
        if (mVar != null) {
            bVarDa.S0 = mVar;
            bVarDa.f180261k0 = Long.valueOf(mVar.getTrainingPlanId());
            p2 p2Var = bVarDa.M0;
            do {
                value = p2Var.getValue();
                g3.f35298f.getClass();
            } while (!p2Var.b(value, g3.a.d(mVar)));
        }
        ge1.b.T(f0.w(this), null, null, new c(null), 3);
        da().J0.f(this, this.f45554b);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/workouts/FBTWorkoutScheduleActivity$a;", "", "<init>", "()V", "", "EXTRA_USER_SETTINGS", "Ljava/lang/String;", "EXTRA_TRAINING_PLAN", "EXTRA_FITNESS_STATS_ACTIVITY", "EXTRA_COMPLETED_ACTIVITY_LIST", "EXTRA_SUPPORTING_EVENTS_LIST", "EXTRA_EVENTS_WEATHER_DATA", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
