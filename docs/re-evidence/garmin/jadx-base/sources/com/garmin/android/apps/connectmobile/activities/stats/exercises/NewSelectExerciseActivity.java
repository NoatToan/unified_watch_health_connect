package com.garmin.android.apps.connectmobile.activities.stats.exercises;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.NewSelectExerciseActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import e23.l;
import fw.p;
import h62.j;
import hq.b1;
import hq.c1;
import hq.d0;
import hq.r0;
import java.util.ArrayList;
import java.util.List;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/NewSelectExerciseActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewSelectExerciseActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29823c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f29824a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.activities.stats.exercises.c.class), new f(this), new e(this), new g(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29825b = R.id.content_frame;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29826a;

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
            f29826a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/stats/exercises/NewSelectExerciseActivity$c", "Lb/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = NewSelectExerciseActivity.f29823c;
            NewSelectExerciseActivity newSelectExerciseActivity = NewSelectExerciseActivity.this;
            Fragment fragmentF = newSelectExerciseActivity.getSupportFragmentManager().F(newSelectExerciseActivity.f29825b);
            if (fragmentF instanceof d0) {
                d0 d0Var = (d0) fragmentF;
                if (d0Var.getChildFragmentManager().M() > 0) {
                    d0Var.getChildFragmentManager().Z();
                    return;
                } else {
                    d0Var.getParentFragmentManager().Z();
                    return;
                }
            }
            if (newSelectExerciseActivity.da().f29889f == null) {
                newSelectExerciseActivity.setResult(0);
                newSelectExerciseActivity.finish();
                return;
            }
            com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVarDa = newSelectExerciseActivity.da();
            j jVar = new j(newSelectExerciseActivity, 12);
            w9.a aVarA = v1.a(cVarDa);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new c1(cVarDa, jVar, newSelectExerciseActivity, null), 2);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29828a;

        public d(l lVar) {
            lVar.getClass();
            this.f29828a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f29828a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29828a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f29829a;

        public e(b.g gVar) {
            this.f29829a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29829a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f29830a;

        public f(b.g gVar) {
            this.f29830a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29830a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f29832b;

        public g(e23.a aVar, b.g gVar) {
            this.f29831a = aVar;
            this.f29832b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29831a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29832b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static final Intent ca(Context context, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.repcounting.model.e eVar, String str, String str2, boolean z14, boolean z15) {
        a aVar = f29823c;
        aVar.getClass();
        return a.a(aVar, context, cVar, eVar, str, false, str2, z14, z15, false, 256);
    }

    public final com.garmin.android.apps.connectmobile.activities.stats.exercises.c da() {
        return (com.garmin.android.apps.connectmobile.activities.stats.exercises.c) this.f29824a.getValue();
    }

    public final void ea(Fragment fragment) {
        List<Fragment> listF = getSupportFragmentManager().f7372c.f();
        listF.getClass();
        Fragment fragment2 = (Fragment) h0.n0(listF);
        if (fragment2 == null || fragment2.getClass() != fragment.getClass()) {
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
            aVarB.l(this.f29825b, fragment, null);
            if (!(fragment instanceof com.garmin.android.apps.connectmobile.activities.stats.exercises.a)) {
                aVarB.d(null);
            }
            aVarB.e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.garmin.android.apps.connectmobile.repcounting.model.b[] bVarArr;
        r0 r0Var;
        com.garmin.android.apps.connectmobile.repcounting.model.b bVar;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarN;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF;
        List listI0;
        com.garmin.android.apps.connectmobile.repcounting.model.b[] bVarArrF;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_content_frame);
        da().f29885b = getIntent().getBooleanExtra("EXTRA_FUZZY_SEARCH", false);
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVarDa = da();
        Bundle extras = getIntent().getExtras();
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = extras != null ? (com.garmin.android.apps.connectmobile.repcounting.model.c) extras.getParcelable("EXTRA_EXERCISE_LIST") : null;
        Bundle extras2 = getIntent().getExtras();
        com.garmin.android.apps.connectmobile.repcounting.model.e eVar = extras2 != null ? (com.garmin.android.apps.connectmobile.repcounting.model.e) extras2.getParcelable("EXTRA_SELECTED_UPDATE_EXERCISE_SET") : null;
        Bundle extras3 = getIntent().getExtras();
        boolean z14 = extras3 != null && extras3.getBoolean("EXTRA_PRESELECT_FIRST_SUGGESTED_EXERCISE");
        cVarDa.f29896m = cVar;
        if (eVar == null || (bVarArrF = eVar.F()) == null) {
            bVarArr = null;
        } else {
            ArrayList arrayListL0 = u.l0(bVarArrF);
            p13.d0.A(arrayListL0, new x91.j(13), true);
            bVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.b[]) arrayListL0.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.b[0]);
        }
        if (eVar != null) {
            eVar.h0(bVarArr);
        }
        cVarDa.f29900q = eVar;
        ge1.b.T(v1.a(cVarDa), null, null, new hq.z0(this, cVarDa, null), 3);
        if (cVarDa.f29889f == null) {
            if (!z14 || (bVar = (com.garmin.android.apps.connectmobile.repcounting.model.b) h0.d0(cVarDa.A4())) == null) {
                r0Var = null;
            } else {
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = cVarDa.f29896m;
                if (cVar2 == null || (dVarArrF = cVar2.F()) == null || (listI0 = u.i0(dVarArrF)) == null) {
                    dVarN = null;
                } else {
                    String strD = bVar.D();
                    String strF = bVar.F();
                    if (strF == null) {
                        strF = bVar.D();
                    }
                    dVarN = zf.b.n(strD, strF, listI0);
                }
                if (dVarN != null) {
                    r0Var = new r0(dVarN, null, 2, null);
                } else {
                    r0Var = null;
                }
            }
            cVarDa.f29889f = r0Var;
        }
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVarDa2 = da();
        String stringExtra = getIntent().getStringExtra("EXTRA_TITLE");
        if (stringExtra == null) {
            stringExtra = getString(R.string.strength_training_select_exercise);
            stringExtra.getClass();
        }
        String stringExtra2 = getIntent().getStringExtra("EXTRA_SEARCH_HINT");
        if (stringExtra2 == null) {
            stringExtra2 = getString(R.string.strength_training_search_exercises);
            stringExtra2.getClass();
        }
        boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_SUPPORT_MUSCLE_FILTER", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("EXTRA_SUPPORT_EQUIPMENT_FILTER", true);
        cVarDa2.f29902t = stringExtra;
        cVarDa2.f29903v = stringExtra2;
        cVarDa2.f29904w = booleanExtra;
        cVarDa2.f29905x = booleanExtra2;
        final int i14 = 0;
        dh.b.L(m.a(null, new b1(da(), this, null), 3), this, new d(new l(this) { // from class: hq.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewSelectExerciseActivity f85173b;

            {
                this.f85173b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                NewSelectExerciseActivity newSelectExerciseActivity = this.f85173b;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        NewSelectExerciseActivity.a aVar = NewSelectExerciseActivity.f29823c;
                        g3Var.getClass();
                        int i16 = NewSelectExerciseActivity.b.f29826a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            newSelectExerciseActivity.hideProgressOverlay();
                            newSelectExerciseActivity.da().f29890g.j(Unit.INSTANCE);
                        } else if (i16 == 2) {
                            newSelectExerciseActivity.hideProgressOverlay();
                            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "Prepare resource failed. \n Exception: ");
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.f(a2Var, "NewSelectExerciseActivity", strD2);
                            newSelectExerciseActivity.finish();
                        } else {
                            if (i16 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            newSelectExerciseActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        NewSelectExerciseActivity.a aVar3 = NewSelectExerciseActivity.f29823c;
                        com.garmin.android.apps.connectmobile.activities.stats.exercises.a.f29847i.getClass();
                        newSelectExerciseActivity.ea(new com.garmin.android.apps.connectmobile.activities.stats.exercises.a());
                        return Unit.INSTANCE;
                    default:
                        NewSelectExerciseActivity.a aVar4 = NewSelectExerciseActivity.f29823c;
                        newSelectExerciseActivity.ea(new d0());
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        dh.b.L(da().f29890g, this, new d(new l(this) { // from class: hq.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewSelectExerciseActivity f85173b;

            {
                this.f85173b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                NewSelectExerciseActivity newSelectExerciseActivity = this.f85173b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        NewSelectExerciseActivity.a aVar = NewSelectExerciseActivity.f29823c;
                        g3Var.getClass();
                        int i17 = NewSelectExerciseActivity.b.f29826a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            newSelectExerciseActivity.hideProgressOverlay();
                            newSelectExerciseActivity.da().f29890g.j(Unit.INSTANCE);
                        } else if (i17 == 2) {
                            newSelectExerciseActivity.hideProgressOverlay();
                            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "Prepare resource failed. \n Exception: ");
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.f(a2Var, "NewSelectExerciseActivity", strD2);
                            newSelectExerciseActivity.finish();
                        } else {
                            if (i17 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            newSelectExerciseActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        NewSelectExerciseActivity.a aVar3 = NewSelectExerciseActivity.f29823c;
                        com.garmin.android.apps.connectmobile.activities.stats.exercises.a.f29847i.getClass();
                        newSelectExerciseActivity.ea(new com.garmin.android.apps.connectmobile.activities.stats.exercises.a());
                        return Unit.INSTANCE;
                    default:
                        NewSelectExerciseActivity.a aVar4 = NewSelectExerciseActivity.f29823c;
                        newSelectExerciseActivity.ea(new d0());
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 2;
        dh.b.L(da().f29891h, this, new d(new l(this) { // from class: hq.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewSelectExerciseActivity f85173b;

            {
                this.f85173b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                NewSelectExerciseActivity newSelectExerciseActivity = this.f85173b;
                switch (i17) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        NewSelectExerciseActivity.a aVar = NewSelectExerciseActivity.f29823c;
                        g3Var.getClass();
                        int i18 = NewSelectExerciseActivity.b.f29826a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            newSelectExerciseActivity.hideProgressOverlay();
                            newSelectExerciseActivity.da().f29890g.j(Unit.INSTANCE);
                        } else if (i18 == 2) {
                            newSelectExerciseActivity.hideProgressOverlay();
                            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "Prepare resource failed. \n Exception: ");
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.f(a2Var, "NewSelectExerciseActivity", strD2);
                            newSelectExerciseActivity.finish();
                        } else {
                            if (i18 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            newSelectExerciseActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        NewSelectExerciseActivity.a aVar3 = NewSelectExerciseActivity.f29823c;
                        com.garmin.android.apps.connectmobile.activities.stats.exercises.a.f29847i.getClass();
                        newSelectExerciseActivity.ea(new com.garmin.android.apps.connectmobile.activities.stats.exercises.a());
                        return Unit.INSTANCE;
                    default:
                        NewSelectExerciseActivity.a aVar4 = NewSelectExerciseActivity.f29823c;
                        newSelectExerciseActivity.ea(new d0());
                        return Unit.INSTANCE;
                }
            }
        }));
        getOnBackPressedDispatcher().b(new c(), this);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/NewSelectExerciseActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_EXERCISE_LIST", "EXTRA_SELECTED_UPDATE_EXERCISE_SET", "EXTRA_PRESELECT_FIRST_SUGGESTED_EXERCISE", "EXTRA_TITLE", "EXTRA_SEARCH_HINT", "EXTRA_SUPPORT_MUSCLE_FILTER", "EXTRA_SUPPORT_EQUIPMENT_FILTER", "EXTRA_FUZZY_SEARCH", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.repcounting.model.e eVar, String str, boolean z14, String str2, boolean z15, boolean z16, boolean z17, int i14) {
            String string;
            String string2;
            com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 = (i14 & 4) != 0 ? null : eVar;
            if ((i14 & 8) != 0) {
                string = context.getString(R.string.strength_training_select_exercise);
                string.getClass();
            } else {
                string = str;
            }
            boolean z18 = (i14 & 16) != 0 ? true : z14;
            if ((i14 & 32) != 0) {
                string2 = context.getString(R.string.strength_training_search_exercises);
                string2.getClass();
            } else {
                string2 = str2;
            }
            boolean z19 = (i14 & 256) != 0 ? false : z17;
            aVar.getClass();
            context.getClass();
            string.getClass();
            string2.getClass();
            Intent intent = new Intent(context, (Class<?>) NewSelectExerciseActivity.class);
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, h7.c.a(new o13.p("EXTRA_EXERCISE_LIST", cVar), new o13.p("EXTRA_SELECTED_UPDATE_EXERCISE_SET", eVar2), new o13.p("EXTRA_TITLE", string), new o13.p("EXTRA_PRESELECT_FIRST_SUGGESTED_EXERCISE", Boolean.valueOf(z18)), new o13.p("EXTRA_SEARCH_HINT", string2), new o13.p("EXTRA_SUPPORT_MUSCLE_FILTER", Boolean.valueOf(z15)), new o13.p("EXTRA_SUPPORT_EQUIPMENT_FILTER", Boolean.valueOf(z16)), new o13.p("EXTRA_FUZZY_SEARCH", Boolean.valueOf(z19))));
            return intent;
        }

        private a() {
        }
    }
}
