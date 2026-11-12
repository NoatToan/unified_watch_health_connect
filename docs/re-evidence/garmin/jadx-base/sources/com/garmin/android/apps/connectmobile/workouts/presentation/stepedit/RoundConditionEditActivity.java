package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import lc.u0;
import o53.f0;
import o62.r;
import o62.s;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/RoundConditionEditActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RoundConditionEditActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49565b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f49566a = new w1(s0.f105811a.b(r.class), new d(this), new c(this), new e(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49567a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.NumberOfTimes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.RepeatUntil.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f49567a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f49568a;

        public c(b.g gVar) {
            this.f49568a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f49568a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f49569a;

        public d(b.g gVar) {
            this.f49569a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f49569a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f49570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f49571b;

        public e(e23.a aVar, b.g gVar) {
            this.f49570a = aVar;
            this.f49571b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f49570a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49571b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final r ca() {
        return (r) this.f49566a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"CommitTransaction"})
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        m52.d dVar;
        Object serializableExtra;
        super.onCreate(bundle);
        setContentView();
        initActionBar(true, R.string.workout_rounds_label);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("GCM_extra_activity_metadata", j0.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("GCM_extra_activity_metadata") : null;
            if (!(parcelableExtra instanceof j0)) {
                parcelableExtra = null;
            }
            parcelable = (j0) parcelableExtra;
        }
        j0 j0Var = (j0) parcelable;
        Boolean boolValueOf = getIntent().hasExtra("SKIP_LAST_REST_STEP") ? Boolean.valueOf(getIntent().getBooleanExtra("SKIP_LAST_REST_STEP", false)) : null;
        if (getIntent().hasExtra("EXTRA_LAST_STEP_TYPE")) {
            Intent intent2 = getIntent();
            if (i14 >= 33) {
                serializableExtra = intent2 != null ? intent2.getSerializableExtra("EXTRA_LAST_STEP_TYPE", m52.d.class) : null;
            } else {
                Object serializableExtra2 = intent2 != null ? intent2.getSerializableExtra("EXTRA_LAST_STEP_TYPE") : null;
                if (!(serializableExtra2 instanceof m52.d)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (m52.d) serializableExtra2;
            }
            dVar = (m52.d) serializableExtra;
        } else {
            dVar = null;
        }
        ca().f129758e = !getIntent().getBooleanExtra("EXTRA_SKIP_LAST_REST_STEP_CLICKED", false);
        boolean booleanExtra = getIntent().getBooleanExtra("GCM_workout_is_round_type_edit_enabled", true);
        if (j0Var == null) {
            a2 a2Var = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "RoundConditionEditActivity", "Error! The workout step was null!");
            finish();
            return;
        }
        ca().f129756c = j0Var;
        ca().f129757d = booleanExtra;
        int i15 = b.f49567a[g8.i.K(ca().x4()).ordinal()];
        if (i15 == 1) {
            ca().x4().f48229n = 600.0d;
        } else {
            if (i15 != 2) {
                u0.r();
                return;
            }
            ca().x4().f48219e = 2;
        }
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.f49637i.getClass();
        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d dVar2 = new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d();
        Bundle bundle2 = new Bundle();
        if (boolValueOf != null) {
            bundle2.putBoolean("SKIP_LAST_REST_STEP", boolValueOf.booleanValue());
        }
        if (dVar != null) {
            bundle2.putSerializable("EXTRA_LAST_STEP_TYPE", dVar);
        }
        dVar2.setArguments(bundle2);
        aVarB.l(R.id.content_frame, dVar2, null);
        aVarB.e();
        f0.k(getOnBackPressedDispatcher(), this, new nw0.f(this, 2), 2);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/RoundConditionEditActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_SKIP_LAST_REST_STEP", "EXTRA_SKIP_LAST_REST_STEP_CLICKED", "EXTRA_LAST_STEP_TYPE", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
