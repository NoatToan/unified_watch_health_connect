package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import g02.u;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r22.t1;
import r22.u1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/WorkoutStepTargetTypeActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutStepTargetTypeActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f49603b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u1 f49604a;

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x52.f[] fVarArr;
        x52.f fVar;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        Bundle extras4;
        Bundle extras5;
        Object serializable;
        Bundle extras6;
        Object serializable2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (extras6 = intent.getExtras()) == null) {
            fVarArr = null;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = extras6.getSerializable("WORKOUT_STEP_TARGET_TYPES", x52.f[].class);
            } else {
                Object serializable3 = extras6.getSerializable("WORKOUT_STEP_TARGET_TYPES");
                if (!(serializable3 instanceof x52.f[])) {
                    serializable3 = null;
                }
                serializable2 = (x52.f[]) serializable3;
            }
            fVarArr = (x52.f[]) serializable2;
        }
        if (fVarArr == null || fVarArr.length == 0) {
            finish();
            return;
        }
        Intent intent2 = getIntent();
        if (intent2 == null || (extras5 = intent2.getExtras()) == null) {
            fVar = null;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras5.getSerializable("SEL_WORKOUT_STEP_TARGET_TYPE", x52.f.class);
            } else {
                Object serializable4 = extras5.getSerializable("SEL_WORKOUT_STEP_TARGET_TYPE");
                if (!(serializable4 instanceof x52.f)) {
                    serializable4 = null;
                }
                serializable = (x52.f) serializable4;
            }
            fVar = (x52.f) serializable;
        }
        Intent intent3 = getIntent();
        boolean z14 = (intent3 == null || (extras4 = intent3.getExtras()) == null) ? false : extras4.getBoolean("PRIMARY_TARGET_TYPE_SELECTION");
        Intent intent4 = getIntent();
        boolean z15 = (intent4 == null || (extras3 = intent4.getExtras()) == null) ? false : extras3.getBoolean("SECONDARY_TARGET_TYPE_SELECTION");
        Intent intent5 = getIntent();
        boolean z16 = (intent5 == null || (extras2 = intent5.getExtras()) == null) ? false : extras2.getBoolean("SUPPORTS_SECONDARY_TARGET_TYPE");
        Intent intent6 = getIntent();
        boolean z17 = (intent6 == null || (extras = intent6.getExtras()) == null) ? false : extras.getBoolean("HAS_SECONDARY_TARGET_TYPE");
        setContentView(R.layout.gcm4_workout_step_target_type_activity);
        initActionBar(true, (z14 && z16) ? R.string.workout_primary_target_type : z15 ? R.string.workout_secondary_target_type : R.string.workout_intensity_target_type);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(null);
        recyclerView.setMotionEventSplittingEnabled(false);
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (x52.f fVar2 : fVarArr) {
            String strName = fVar2.name();
            String string = getString(fVar2.f189097b);
            Integer num = fVar2.f189098c;
            arrayList.add(new t1(strName, null, null, string, num != null ? getString(num.intValue()) : null, false, s.g(fVar2.name(), fVar != null ? fVar.name() : null) || (fVar == null && s.g(fVar2.name(), "NONE")), null, false, null, 934, null));
        }
        boolean z18 = z14;
        u1 u1Var = new u1(new n82.i(this, 15));
        u1Var.D(arrayList);
        u1Var.f149752e = new u(z18, z17, this, u1Var, 2);
        this.f49604a = u1Var;
        recyclerView.setAdapter(u1Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/WorkoutStepTargetTypeActivity$a;", "", "<init>", "()V", "", "EXTRA_PRIMARY_TARGET_TYPE_SELECTION", "Ljava/lang/String;", "EXTRA_SECONDARY_TARGET_TYPE_SELECTION", "EXTRA_SUPPORTS_SECONDARY_TARGET_TYPE", "EXTRA_HAS_SECONDARY_TARGET_TYPE", "EXTRA_WORKOUT_STEP_TARGET_TYPES", "EXTRA_SEL_WORKOUT_STEP_TARGET_TYPE", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
