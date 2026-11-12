package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.v2;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.r0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z10.l0;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/v2/MenstrualCycleTrackingActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MenstrualCycleTrackingActivity extends r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f39197e = new a(null);

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "MENSTRUAL_CYCLE";
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.HEALTH_STATS;
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final boolean la() {
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        ca("MENSTRUAL_CYCLE");
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(263658406, true, new nx0.a(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/v2/MenstrualCycleTrackingActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "NAVIGATION_ITEM", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
