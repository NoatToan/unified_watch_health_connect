package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import d53.s;
import d53.t;
import lc.u0;
import o62.o0;
import o62.r0;
import o62.v0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/WorkoutStepEditWeightActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "Lo62/j;", "uiState", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutStepEditWeightActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49597b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f49598a = new w1(s0.f105811a.b(r0.class), new h(this), new n82.i(this, 14), new i(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements e23.l<o62.i, Unit> {
        public b(Object obj) {
            super(1, obj, r0.class, "changeEditMode", "changeEditMode(Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/EditWeightMode;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(o62.i iVar) {
            o62.i iVar2 = iVar;
            iVar2.getClass();
            r0 r0Var = (r0) this.receiver;
            r0Var.getClass();
            p2 p2Var = r0Var.f129762c;
            p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), null, iVar2, null, null, 13));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.l<String, Unit> {
        public c(Object obj) {
            super(1, obj, r0.class, "setManualWeightInput", "setManualWeightInput(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            double dDoubleValue;
            String str2 = str;
            str2.getClass();
            r0 r0Var = (r0) this.receiver;
            p2 p2Var = r0Var.f129762c;
            if (str2.length() > 0) {
                Double dF = s.f(str2);
                if (dF != null) {
                    dDoubleValue = dF.doubleValue();
                }
                return Unit.INSTANCE;
            }
            dDoubleValue = r0Var.f129761b ? -1.0d : 0.0d;
            p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, Double.valueOf(dDoubleValue), null, null, 510), null, str2, null, 10));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements e23.l<String, Boolean> {
        public d(Object obj) {
            super(1, obj, r0.class, "validateManualWeightInput", "validateManualWeightInput(Ljava/lang/String;)Z", 0);
        }

        @Override // e23.l
        public final Boolean invoke(String str) {
            Double dF;
            String str2 = str;
            str2.getClass();
            ((r0) this.receiver).getClass();
            return Boolean.valueOf(r0.f129759e.d(str2) && ((dF = s.f(str2)) == null || dF.doubleValue() <= (v52.f.s() ? 453.5d : 999.5d)));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements e23.l<String, Unit> {
        public e(Object obj) {
            super(1, obj, r0.class, "setBenchmarkPercentageInput", "setBenchmarkPercentageInput(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            p2 p2Var = ((r0) this.receiver).f129762c;
            Double dF = s.f(str2);
            double dDoubleValue = 1.0d;
            if (dF != null) {
                double dDoubleValue2 = dF.doubleValue();
                if (1.0d > dDoubleValue2 || dDoubleValue2 > 120.0d) {
                    dF = null;
                }
                if (dF != null) {
                    dDoubleValue = dF.doubleValue();
                }
            }
            p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, null, Double.valueOf(dDoubleValue), null, 479), null, null, str2, 6));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements e23.l<String, Boolean> {
        public f(Object obj) {
            super(1, obj, r0.class, "validateBenchmarkPercentageInput", "validateBenchmarkPercentageInput(Ljava/lang/String;)Z", 0);
        }

        @Override // e23.l
        public final Boolean invoke(String str) {
            Integer numI;
            int iIntValue;
            String str2 = str;
            str2.getClass();
            ((r0) this.receiver).getClass();
            return Boolean.valueOf(str2.length() == 0 || ((numI = t.i(str2)) != null && (iIntValue = numI.intValue()) >= 0 && iIntValue < 121));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends q implements e23.l<j0.c, Unit> {
        public g(Object obj) {
            super(1, obj, r0.class, "setVerbalWeight", "setVerbalWeight(Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutStepDTO$RelativeWeight;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(j0.c cVar) {
            j0.c cVar2 = cVar;
            cVar2.getClass();
            r0 r0Var = (r0) this.receiver;
            r0Var.getClass();
            p2 p2Var = r0Var.f129762c;
            p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, null, null, cVar2, 255), null, null, null, 14));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f49599a;

        public h(b.g gVar) {
            this.f49599a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f49599a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f49600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f49601b;

        public i(e23.a aVar, b.g gVar) {
            this.f49600a = aVar;
            this.f49601b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f49600a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49601b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/stepedit/WorkoutStepEditWeightActivity$j", "Landroidx/lifecycle/x1$c;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j implements x1.c {
        public j() {
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002d  */
        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            v0 v0Var;
            Parcelable parcelable;
            cls.getClass();
            Bundle extras = WorkoutStepEditWeightActivity.this.getIntent().getExtras();
            if (extras == null) {
                v0Var = new v0(null, false, false, null, null, null, null, false, null, 511, null);
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) extras.getParcelable("WORKOUT_STEP_WEIGHT", v0.class);
                } else {
                    Parcelable parcelable2 = extras.getParcelable("WORKOUT_STEP_WEIGHT");
                    if (!(parcelable2 instanceof v0)) {
                        parcelable2 = null;
                    }
                    parcelable = (v0) parcelable2;
                }
                v0Var = (v0) parcelable;
                if (v0Var == null) {
                    v0Var = new v0(null, false, false, null, null, null, null, false, null, 511, null);
                }
            }
            return new r0(v0Var);
        }
    }

    public final r0 ca() {
        return (r0) this.f49598a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        p2 p2Var;
        o62.i iVar;
        r0 r0VarCa = ca();
        v0 v0Var = r0VarCa.f129760a;
        p2 p2Var2 = r0VarCa.f129762c;
        int i14 = r0.b.f129764a[((o62.j) p2Var2.getValue()).f129688b.ordinal()];
        if (i14 == 1) {
            Double d14 = ((o62.j) p2Var2.getValue()).f129687a.f129789a;
            Double d15 = v0Var.f129789a;
            if ((d15 == null || !Double.isNaN(d15.doubleValue()) || d14 == null || !Double.isNaN(d14.doubleValue())) && !p005kotlin.jvm.internal.s.d(d15, d14)) {
                p2Var = ca().f129762c;
                iVar = ((o62.j) p2Var.getValue()).f129688b;
                if (iVar != o62.i.MANUAL_WEIGHT) {
                    p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, null, null, null, 510), null, null, null, 14));
                }
                if (iVar != o62.i.SCALED_FROM_BENCHMARK_WEIGHT) {
                    p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, null, null, null, 479), null, null, null, 14));
                }
                if (iVar != o62.i.VERBAL_WEIGHT) {
                    p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, null, null, null, 255), null, null, null, 14));
                }
                Intent intent = new Intent();
                intent.putExtra("WORKOUT_STEP_WEIGHT", ((o62.j) ca().f129763d.getValue()).f129687a);
                setResult(-1, intent);
            }
        } else if (i14 == 2) {
            Double d16 = ((o62.j) p2Var2.getValue()).f129687a.f129794f;
            Double d17 = v0Var.f129794f;
            if ((d17 == null || !Double.isNaN(d17.doubleValue()) || d16 == null || !Double.isNaN(d16.doubleValue())) && !p005kotlin.jvm.internal.s.d(d17, d16)) {
                p2Var = ca().f129762c;
                iVar = ((o62.j) p2Var.getValue()).f129688b;
                if (iVar != o62.i.MANUAL_WEIGHT) {
                    p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, null, null, null, 510), null, null, null, 14));
                }
                if (iVar != o62.i.SCALED_FROM_BENCHMARK_WEIGHT) {
                    p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, null, null, null, 479), null, null, null, 14));
                }
                if (iVar != o62.i.VERBAL_WEIGHT) {
                    p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, null, null, null, 255), null, null, null, 14));
                }
                Intent intent2 = new Intent();
                intent2.putExtra("WORKOUT_STEP_WEIGHT", ((o62.j) ca().f129763d.getValue()).f129687a);
                setResult(-1, intent2);
            }
        } else {
            if (i14 != 3) {
                u0.r();
                return;
            }
            if (v0Var.f129797i != ((o62.j) p2Var2.getValue()).f129687a.f129797i) {
                p2Var = ca().f129762c;
                iVar = ((o62.j) p2Var.getValue()).f129688b;
                if (iVar != o62.i.MANUAL_WEIGHT) {
                    p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, null, null, null, 510), null, null, null, 14));
                }
                if (iVar != o62.i.SCALED_FROM_BENCHMARK_WEIGHT) {
                    p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, null, null, null, 479), null, null, null, 14));
                }
                if (iVar != o62.i.VERBAL_WEIGHT) {
                    p2Var.k(null, o62.j.a((o62.j) p2Var.getValue(), v0.b(((o62.j) p2Var.getValue()).f129687a, null, null, null, 255), null, null, null, 14));
                }
                Intent intent3 = new Intent();
                intent3.putExtra("WORKOUT_STEP_WEIGHT", ((o62.j) ca().f129763d.getValue()).f129687a);
                setResult(-1, intent3);
            }
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        initActionBar(true, R.string.label_set_weight);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(440026107, true, new o0(this, 0)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/WorkoutStepEditWeightActivity$a;", "", "<init>", "()V", "", "EXTRA_WORKOUT_STEP_WEIGHT", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
