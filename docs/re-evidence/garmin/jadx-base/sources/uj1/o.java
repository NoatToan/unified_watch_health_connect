package uj1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171554b;

    public /* synthetic */ o(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar, int i14) {
        this.f171553a = i14;
        this.f171554b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f171553a;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171554b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                return dVar.requireActivity().getOnBackPressedDispatcher();
            case 1:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                dVar.E6();
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                dVar.C6();
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                dVar.C6();
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                dVar.E6();
                return Unit.INSTANCE;
        }
    }
}
