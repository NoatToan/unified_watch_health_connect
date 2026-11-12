package com.garmin.android.apps.connectmobile.hydration.presentation.settings;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z10.p3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/settings/HydrationSettingsActivity;", "Lz10/p3;", "<init>", "()V", "a", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HydrationSettingsActivity extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f36708c = new a(null);

    @Override // z10.p3
    public final Fragment ca() {
        Intent intent = getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("NAVIGATE_TO_GOAL", false) : false;
        com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l.getClass();
        com.garmin.android.apps.connectmobile.hydration.presentation.settings.a aVar = new com.garmin.android.apps.connectmobile.hydration.presentation.settings.a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("NAVIGATE_TO_GOAL", booleanExtra);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.lbl_hydration_settings);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/settings/HydrationSettingsActivity$a;", "", "<init>", "()V", "", "EXTRA_NAVIGATE_TO_GOAL", "Ljava/lang/String;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
