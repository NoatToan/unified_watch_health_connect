package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import o53.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/WorkoutRestStepHelpActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutRestStepHelpActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49572a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"CommitTransaction"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        String stringExtra = getIntent().getStringExtra("EXTRA_TITLE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra("EXTRA_HELP_TITLE");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        String stringExtra3 = getIntent().getStringExtra("EXTRA_HELP_DESCRIPTION");
        String str = stringExtra3 != null ? stringExtra3 : "";
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        f.f49662e.getClass();
        aVarB.l(R.id.content_frame, new f(stringExtra, stringExtra2, str), null);
        aVarB.e();
        f0.k(getOnBackPressedDispatcher(), this, new nw0.f(this, 6), 2);
        initActionBar(true, stringExtra);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/WorkoutRestStepHelpActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_TITLE", "EXTRA_HELP_TITLE", "EXTRA_HELP_DESCRIPTION", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
