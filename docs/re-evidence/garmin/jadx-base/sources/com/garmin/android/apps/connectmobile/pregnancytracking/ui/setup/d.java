package com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup;

import am.j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PregnancySetupActivity.a aVar = PregnancySetupActivity.f40934g;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        contextRequireContext.startActivity(new Intent(contextRequireContext, (Class<?>) PregnancySetupActivity.class).putExtras(j.e(0, "EXTRA_RETRY_COUNTER")));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
