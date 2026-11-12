package i62;

import androidx.compose.ui.platform.ComposeView;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.msn.b f91853b;

    public /* synthetic */ i(com.garmin.android.apps.connectmobile.workouts.presentation.msn.b bVar, int i14) {
        this.f91852a = i14;
        this.f91853b = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f91852a;
        com.garmin.android.apps.connectmobile.workouts.presentation.msn.b bVar = this.f91853b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.workouts.presentation.msn.b.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.msn.b.f49484x;
                return new com.garmin.android.apps.connectmobile.workouts.presentation.msn.b.e(bVar);
            case 1:
                com.garmin.android.apps.connectmobile.workouts.presentation.msn.b.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.msn.b.f49484x;
                return new com.garmin.android.apps.connectmobile.workouts.presentation.msn.b.c(bVar);
            default:
                bVar.f49491n = true;
                ComposeView composeView = bVar.f49486i;
                if (composeView != null) {
                    composeView.setVisibility(8);
                    return Unit.INSTANCE;
                }
                s.m("errorBannerView");
                throw null;
        }
    }
}
