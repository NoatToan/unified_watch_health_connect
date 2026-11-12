package com.garmin.android.apps.connectmobile.activities.stats;

import a73.j;
import am.x0;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.View;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import aq.o;
import aq.u;
import aq.u1;
import aq.w1;
import aq.x1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.android.apps.connectmobile.repcounting.model.e;
import com.mobeta.android.dslv.DragSortListView;
import e23.l;
import java.util.ArrayList;
import mt0.k0;
import mt0.q3;
import mt0.r3;
import o13.h;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r53.c2;
import r53.m1;
import r53.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/EditExercisesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lmt0/q3;", "Lmt0/r3;", "Lmt0/k0;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditExercisesActivity extends com.garmin.android.apps.connectmobile.c implements q3, r3, k0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f29765m = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExerciseSetsDTO f29767b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f29769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f29770e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.d f29772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f29776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f29777l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29766a = m.a(n.NONE, new d(this, null, null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExerciseSetsDTO f29768c = new ExerciseSetsDTO();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x0 f29771f = x0.f4309n1;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29778a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4322q2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4326r2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.f4309n1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.f4293j1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.f4357z3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.A3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.f4329s2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f29778a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29779a;

        public c(l lVar) {
            lVar.getClass();
            this.f29779a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f29779a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29779a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f29781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f29782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f29783d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f29780a = gVar;
            this.f29781b = qualifier;
            this.f29782c = aVar;
            this.f29783d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, aq.x1] */
        @Override // e23.a
        public final x1 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f29780a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f29782c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(x1.class), viewModelStore, null, defaultViewModelCreationExtras, this.f29781b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f29783d, 4, null);
        }
    }

    public static void ca(EditExercisesActivity editExercisesActivity, boolean z14) {
        if (z14) {
            return;
        }
        super.onBackPressed();
    }

    @Override // mt0.k0
    public final void D2(ArrayList<e> arrayList) {
        a2 a2Var = a2.ACTIVITIES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "EditExercisesActivity", "addExercises");
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ExerciseSetsDTO exerciseSetsDTO = this.f29767b;
        if (exerciseSetsDTO != null) {
            exerciseSetsDTO.C(arrayList);
            this.f29776k = true;
            return;
        }
        ExerciseSetsDTO exerciseSetsDTO2 = new ExerciseSetsDTO();
        this.f29767b = exerciseSetsDTO2;
        exerciseSetsDTO2.f41090b = this.f29770e;
        exerciseSetsDTO2.C(arrayList);
        this.f29776k = true;
    }

    @Override // mt0.q3
    public final void Q1(long j8, ArrayList arrayList) {
        a2 a2Var = a2.ACTIVITIES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "EditExercisesActivity", "removeExercises");
        if (arrayList != null) {
            ExerciseSetsDTO exerciseSetsDTO = this.f29767b;
            if (exerciseSetsDTO != null) {
                exerciseSetsDTO.C(arrayList);
            }
            this.f29774i = true;
        }
        this.f29770e = j8;
    }

    @Override // mt0.r3
    public final void Q3(ArrayList<e> arrayList) {
        a2 a2Var = a2.ACTIVITIES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "EditExercisesActivity", "reorderExercises");
        if (arrayList.size() > 0) {
            ExerciseSetsDTO exerciseSetsDTO = this.f29767b;
            if (exerciseSetsDTO != null) {
                exerciseSetsDTO.C(arrayList);
            }
            this.f29775j = true;
        }
    }

    @Override // mt0.k0
    public final void b8(int i14, long j8, long j14, double d14) {
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    @o13.e
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (intent != null) {
            a2 a2Var = a2.ACTIVITIES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EditExercisesActivity", "inside onActivityResults");
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x0158  */
    /* JADX WARN: Code duplicated, block: B:84:0x015c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0162  */
    /* JADX WARN: Code duplicated, block: B:99:0x0189  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        u uVar;
        int i14;
        ExerciseSetsDTO exerciseSetsDTO;
        ExerciseSetsDTO exerciseSetsDTO2;
        ?? r14;
        u uVar2;
        int i15;
        int i16;
        int i17;
        DragSortListView dragSortListView;
        View viewFindFocus;
        u uVar3 = this.f29777l;
        if (uVar3 != null && (dragSortListView = uVar3.f12237o) != null && (viewFindFocus = dragSortListView.findFocus()) != null) {
            viewFindFocus.clearFocus();
        }
        int i18 = b.f29778a[this.f29771f.ordinal()];
        if (i18 == 1) {
            ExerciseSetsDTO exerciseSetsDTO3 = this.f29767b;
            e[] eVarArr = exerciseSetsDTO3 != null ? exerciseSetsDTO3.f41089a : null;
            if (eVarArr != null) {
                int length = eVarArr.length;
                int i19 = 0;
                while (true) {
                    if (i19 < length) {
                        Double D = eVarArr[i19].D();
                        if ((D != null ? D.doubleValue() : 0.0d) <= 0.0d) {
                            if (!s.g(this.f29768c, this.f29767b)) {
                                super.onBackPressed();
                                return;
                            }
                            if (b.f29778a[this.f29771f.ordinal()] != 1) {
                                i17 = R.string.msg_pilates_save_validation;
                                i16 = R.string.lbl_add_time_reps;
                            } else {
                                i16 = R.string.lbl_add_time;
                                i17 = R.string.msg_yoga_save_validation;
                            }
                            q1.b bVar = q1.f41066b;
                            String string = getString(i16);
                            string.getClass();
                            String string2 = getString(i17);
                            string2.getClass();
                            j jVar = new j(this, 16);
                            bVar.getClass();
                            q1 q1VarC = q1.b.c(string, string2, R.string.lbl_add_data, R.string.lbl_don_t_save, jVar);
                            v supportFragmentManager = getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
                            return;
                        }
                        i19++;
                    }
                }
            }
            uVar = this.f29777l;
            if (uVar != null) {
                super.onBackPressed();
                return;
            }
            while (i14 < uVar.f12236n.size() - 1) {
                while (i15 < uVar.f12235m.size() - 1) {
                    if (uVar.f12236n.get(i14).I() == null) {
                    }
                }
            }
            exerciseSetsDTO = this.f29767b;
            if (exerciseSetsDTO != null) {
                uVar2 = this.f29777l;
                if (uVar2 != null) {
                    s.m("fragment");
                    throw null;
                }
                exerciseSetsDTO.C(uVar2.f12236n);
            }
            boolean zG = s.g(this.f29768c, this.f29767b);
            if (this.f29775j) {
            }
            exerciseSetsDTO2 = this.f29767b;
            r14 = this.f29766a;
            if (exerciseSetsDTO2 != null) {
                x1 x1Var = (x1) r14.getValue();
                long j8 = this.f29770e;
                x1Var.getClass();
                ge1.b.T(v1.a(x1Var), null, null, new w1(x1Var, j8, exerciseSetsDTO2, null), 3);
            }
            ((x1) r14.getValue()).f12295f.f(this, new c(new o(this, 1)));
        }
        if (i18 == 2) {
            ExerciseSetsDTO exerciseSetsDTO4 = this.f29767b;
            e[] eVarArr2 = exerciseSetsDTO4 != null ? exerciseSetsDTO4.f41089a : null;
            if (eVarArr2 != null) {
                int length2 = eVarArr2.length;
                int i24 = 0;
                while (true) {
                    if (i24 < length2) {
                        e eVar = eVarArr2[i24];
                        Double D2 = eVar.D();
                        double dDoubleValue = D2 != null ? D2.doubleValue() : 0.0d;
                        Long lH = eVar.H();
                        long jLongValue = lH != null ? lH.longValue() : 0L;
                        if (dDoubleValue <= 0.0d && jLongValue <= 0) {
                            if (!s.g(this.f29768c, this.f29767b)) {
                                super.onBackPressed();
                                return;
                            }
                            if (b.f29778a[this.f29771f.ordinal()] != 1) {
                                i17 = R.string.msg_pilates_save_validation;
                                i16 = R.string.lbl_add_time_reps;
                            } else {
                                i16 = R.string.lbl_add_time;
                                i17 = R.string.msg_yoga_save_validation;
                            }
                            q1.b bVar2 = q1.f41066b;
                            String string3 = getString(i16);
                            string3.getClass();
                            String string4 = getString(i17);
                            string4.getClass();
                            j jVar2 = new j(this, 16);
                            bVar2.getClass();
                            q1 q1VarC2 = q1.b.c(string3, string4, R.string.lbl_add_data, R.string.lbl_don_t_save, jVar2);
                            v supportFragmentManager2 = getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            q1VarC2.v6(supportFragmentManager2, "GCMFragTwoBttnAlertDialog");
                            return;
                        }
                        i24++;
                    }
                }
            }
        }
        uVar = this.f29777l;
        if (uVar != null) {
            super.onBackPressed();
            return;
        }
        for (i14 = 0; i14 < uVar.f12236n.size() - 1; i14++) {
            for (i15 = 0; i15 < uVar.f12235m.size() - 1; i15++) {
                if (uVar.f12236n.get(i14).I() == null && uVar.f12235m.get(i15).I() != null && uVar.f12236n.get(i14).I() == uVar.f12235m.get(i15).I()) {
                    int i25 = i15 + 1;
                    if (uVar.f12235m.get(i25) != null && uVar.f12235m.get(i25).f0()) {
                        uVar.f12236n.add(i14 + 1, uVar.f12235m.get(i25));
                        break;
                    }
                }
            }
        }
        exerciseSetsDTO = this.f29767b;
        if (exerciseSetsDTO != null) {
            uVar2 = this.f29777l;
            if (uVar2 != null) {
                s.m("fragment");
                throw null;
            }
            exerciseSetsDTO.C(uVar2.f12236n);
        }
        boolean zG2 = s.g(this.f29768c, this.f29767b);
        if (this.f29775j && !this.f29774i && !this.f29776k && zG2) {
            super.onBackPressed();
            return;
        }
        exerciseSetsDTO2 = this.f29767b;
        r14 = this.f29766a;
        if (exerciseSetsDTO2 != null) {
            x1 x1Var2 = (x1) r14.getValue();
            long j14 = this.f29770e;
            x1Var2.getClass();
            ge1.b.T(v1.a(x1Var2), null, null, new w1(x1Var2, j14, exerciseSetsDTO2, null), 3);
        }
        ((x1) r14.getValue()).f12295f.f(this, new c(new o(this, 1)));
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        Parcelable parcelable;
        Parcelable parcelable2;
        Object serializable;
        Parcelable parcelable3;
        super.onCreate(bundle);
        setContentView(R.layout.edit_exercises_3_0);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("EXTRA_EXERCISE_SETS", ExerciseSetsDTO.class);
            } else {
                Parcelable parcelable4 = bundleA.getParcelable("EXTRA_EXERCISE_SETS");
                if (!(parcelable4 instanceof ExerciseSetsDTO)) {
                    parcelable4 = null;
                }
                parcelable = (ExerciseSetsDTO) parcelable4;
            }
            ExerciseSetsDTO exerciseSetsDTO = (ExerciseSetsDTO) parcelable;
            if (exerciseSetsDTO == null) {
                exerciseSetsDTO = new ExerciseSetsDTO();
            }
            this.f29767b = exerciseSetsDTO;
            this.f29768c = new ExerciseSetsDTO(this.f29767b);
            if (i14 >= 33) {
                parcelable2 = (Parcelable) bundleA.getParcelable("EXTRA_EXERCISE_LIST", com.garmin.android.apps.connectmobile.repcounting.model.c.class);
            } else {
                Parcelable parcelable5 = bundleA.getParcelable("EXTRA_EXERCISE_LIST");
                if (!(parcelable5 instanceof com.garmin.android.apps.connectmobile.repcounting.model.c)) {
                    parcelable5 = null;
                }
                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable5;
            }
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable2;
            if (cVar == null) {
                cVar = new com.garmin.android.apps.connectmobile.repcounting.model.c();
            }
            this.f29769d = cVar;
            this.f29770e = bundleA.getLong("EXTRA_ACTIVITY_ID");
            if (i14 >= 33) {
                serializable = bundleA.getSerializable("EXTRA_ACTIVITY_TYPE", x0.class);
            } else {
                Object serializable2 = bundleA.getSerializable("EXTRA_ACTIVITY_TYPE");
                if (!(serializable2 instanceof x0)) {
                    serializable2 = null;
                }
                serializable = (x0) serializable2;
            }
            x0 x0Var = serializable instanceof x0 ? (x0) serializable : null;
            if (x0Var == null) {
                x0Var = x0.f4309n1;
            }
            this.f29771f = x0Var;
            if (i14 >= 33) {
                parcelable3 = (Parcelable) bundleA.getParcelable("EXTRA_ADDED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
            } else {
                Parcelable parcelable6 = bundleA.getParcelable("EXTRA_ADDED_EXERCISE");
                if (!(parcelable6 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d)) {
                    parcelable6 = null;
                }
                parcelable3 = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable6;
            }
            this.f29772g = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable3;
            this.f29773h = bundleA.getBoolean("EXTRA_IS_WHEELCHAIR");
        }
        int i15 = b.f29778a[this.f29771f.ordinal()];
        if (i15 == 1) {
            string = getString(R.string.lbl_yoga_poses_edit);
            string.getClass();
        } else if (i15 == 2) {
            string = getString(R.string.lbl_edit_activity_type_moves, dh.b.A(this, x0.f4326r2.f4360c));
            string.getClass();
        } else if (i15 == 3) {
            string = getString(R.string.strength_training_edit_exercises);
            string.getClass();
        } else if (i15 != 7) {
            string = getString(R.string.strength_training_edit_exercises);
            string.getClass();
        } else {
            string = getString(R.string.lbl_edit_mobility_moves);
            string.getClass();
        }
        initActionBar(true, string);
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = this.f29769d;
        ?? r14 = this.f29766a;
        if (cVar2 == null) {
            x1 x1Var = (x1) r14.getValue();
            x0 x0Var2 = this.f29771f;
            boolean z14 = this.f29773h;
            x1Var.getClass();
            x0Var2.getClass();
            c2 c2VarB = x1Var.f12291b.b(x0Var2, z14);
            x53.c cVar3 = o53.s0.f129406a;
            new m1(new w(r53.s.A(c2VarB, x53.b.f189152a), new u1(null)), new aq.v1(x1Var, null));
        } else {
            this.f29777l = u.y6(this.f29770e, this.f29771f, this.f29767b, cVar2, this.f29772g);
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
            u uVar = this.f29777l;
            if (uVar == null) {
                s.m("fragment");
                throw null;
            }
            aVarB.l(R.id.edit_exercises_fragment, uVar, null);
            aVarB.e();
        }
        ((x1) r14.getValue()).f12293d.f(this, new c(new o(this, 0)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        String str = this.f29771f.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        if (am.z0.b(x0.C2, str)) {
            return false;
        }
        getMenuInflater().inflate(R.menu.edit_exercises_reorder_menu, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // mt0.k0
    public final void z7(int i14, int i15) {
        a2 a2Var = a2.ACTIVITIES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "EditExercisesActivity", "exerciseListClicked");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/EditExercisesActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_EXERCISE_SETS", "EXTRA_ACTIVITY_ID", "EXTRA_ACTIVITY_TYPE", "EXTRA_EXERCISE_LIST", "EXTRA_EXERCISE_ADDED", "EXTRA_IS_WHEELCHAIR", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
