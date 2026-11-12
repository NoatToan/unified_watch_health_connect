package is0;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.ManageTripsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageTripsActivity f94926b;

    public /* synthetic */ f(ManageTripsActivity manageTripsActivity, int i14) {
        this.f94925a = i14;
        this.f94926b = manageTripsActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f94925a;
        ManageTripsActivity manageTripsActivity = this.f94926b;
        switch (i14) {
            case 0:
                ManageTripsActivity.a aVar = ManageTripsActivity.f36985h;
                manageTripsActivity.ea();
                return Unit.INSTANCE;
            default:
                ManageTripsActivity.a aVar2 = ManageTripsActivity.f36985h;
                Bundle extras = manageTripsActivity.getIntent().getExtras();
                return Boolean.valueOf(extras != null ? extras.getBoolean("EXTRA_FROM_CALENDAR") : false);
        }
    }
}
