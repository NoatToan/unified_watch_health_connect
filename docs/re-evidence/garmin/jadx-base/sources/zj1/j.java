package zj1;

import android.content.Context;
import android.os.Bundle;
import p005kotlin.Unit;
import pj1.d0;
import pj1.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e f204934b;

    public /* synthetic */ j(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e eVar, int i14) {
        this.f204933a = i14;
        this.f204934b = eVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f204933a;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e eVar = this.f204934b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d;
                Bundle arguments = eVar.getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("ARG_SHOW_BLANK") : false);
            case 1:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d;
                androidx.fragment.app.m mVarRequireActivity = eVar.requireActivity();
                Bundle extras = mVarRequireActivity.getIntent().getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.putBoolean("GCM_safety_features_continue_wizard", true);
                s.d5(eVar.u6(), mVarRequireActivity, "", extras, 4);
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d;
                Context contextRequireContext = eVar.requireContext();
                contextRequireContext.getClass();
                d0.m(contextRequireContext, eVar.u6().N4(), eVar.u6().f137988z, eVar.u6().A, false);
                return Unit.INSTANCE;
        }
    }
}
