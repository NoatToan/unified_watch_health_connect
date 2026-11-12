package hx0;

import androidx.compose.ui.platform.ComposeView;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a f86052b;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a aVar, int i14) {
        this.f86051a = i14;
        this.f86052b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f86051a;
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a aVar = this.f86052b;
        switch (i14) {
            case 0:
                ComposeView composeView = aVar.f38863g;
                if (composeView != null) {
                    composeView.setVisibility(8);
                }
                aVar.f38864h = false;
                aVar.y6();
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.C0689a c0689a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.f38856n;
                return aVar.requireActivity().getOnBackPressedDispatcher();
            default:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.C0689a c0689a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.f38856n;
                aVar.A6(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a.EDIT_RANGE);
                return Unit.INSTANCE;
        }
    }
}
