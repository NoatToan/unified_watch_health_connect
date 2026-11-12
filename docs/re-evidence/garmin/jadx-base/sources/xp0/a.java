package xp0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.hydration.presentation.settings.a f191830b;

    public /* synthetic */ a(int i14, com.garmin.android.apps.connectmobile.hydration.presentation.settings.a aVar) {
        this.f191829a = i14;
        this.f191830b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f191829a;
        com.garmin.android.apps.connectmobile.hydration.presentation.settings.a aVar = this.f191830b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.C0652a c0652a = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l;
                return aVar.requireActivity().getOnBackPressedDispatcher();
            case 1:
                com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.C0652a c0652a2 = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l;
                aVar.u6(1);
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.C0652a c0652a3 = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l;
                aVar.u6(2);
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.C0652a c0652a4 = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l;
                aVar.u6(3);
                return Unit.INSTANCE;
        }
    }
}
