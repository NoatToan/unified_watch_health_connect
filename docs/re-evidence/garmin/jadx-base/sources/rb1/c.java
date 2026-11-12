package rb1;

import android.content.Intent;
import android.widget.Button;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingActivity;
import e23.l;
import fw.m;
import java.util.ArrayList;
import lc.u0;
import o13.p;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Unit;
import z6.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PregnancyStopTrackingActivity f151596b;

    public /* synthetic */ c(PregnancyStopTrackingActivity pregnancyStopTrackingActivity, int i14) {
        this.f151595a = i14;
        this.f151596b = pregnancyStopTrackingActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f151595a;
        int i15 = 0;
        PregnancyStopTrackingActivity pregnancyStopTrackingActivity = this.f151596b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                PregnancyStopTrackingActivity.a aVar = PregnancyStopTrackingActivity.f41001d;
                int i16 = PregnancyStopTrackingActivity.b.f41005a[mVar.f73769b.ordinal()];
                if (i16 == 1) {
                    pregnancyStopTrackingActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    pregnancyStopTrackingActivity.hideProgressOverlay();
                    g22.a.a(pregnancyStopTrackingActivity, mVar.f73771d);
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    pregnancyStopTrackingActivity.hideProgressOverlay();
                    i52.a.f91796a.getClass();
                    pd1.c cVarJ = i52.a.j();
                    nb1.a aVar2 = new nb1.a();
                    GarminConnectMobileApp.f28685g.getClass();
                    aVar2.a(GarminConnectMobileApp.a.a(), cVarJ);
                    f12.l.f68084a.getClass();
                    f12.l.a.a().e4(false);
                    if (pregnancyStopTrackingActivity.ca().f151621b == eb1.d.PREFER_NOT_SAY) {
                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                        Intent intent = new Intent(pregnancyStopTrackingActivity, (Class<?>) DashboardActivity.class);
                        intent.addFlags(67108864);
                        h0 h0VarE = h0.e(pregnancyStopTrackingActivity);
                        ArrayList<Intent> arrayList = h0VarE.f202637a;
                        arrayList.add(intent);
                        arrayList.add(MenstrualCycleDetailsActivity.a.b(MenstrualCycleDetailsActivity.f38784t, pregnancyStopTrackingActivity, false, null, 30));
                        h0VarE.g();
                    } else {
                        pregnancyStopTrackingActivity.startActivity(MCTSetupActivity.a.a(MCTSetupActivity.f39100c, pregnancyStopTrackingActivity, 2));
                    }
                    pregnancyStopTrackingActivity.finish();
                }
                return Unit.INSTANCE;
            case 1:
                t tVar = pregnancyStopTrackingActivity.f41002a;
                m mVar2 = (m) obj;
                PregnancyStopTrackingActivity.a aVar3 = PregnancyStopTrackingActivity.f41001d;
                int i17 = PregnancyStopTrackingActivity.b.f41005a[mVar2.f73769b.ordinal()];
                if (i17 == 1) {
                    ((Logger) tVar.getValue()).debug("Loading pregnancy snapshot...");
                    pregnancyStopTrackingActivity.showProgressOverlay();
                } else if (i17 == 2) {
                    Logger logger = (Logger) tVar.getValue();
                    fw.c cVar = mVar2.f73771d;
                    logger.debug("Error loading pregnancy snapshot: " + (cVar != null ? cVar.f73761a : null));
                    pregnancyStopTrackingActivity.hideProgressOverlay();
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    ((Logger) tVar.getValue()).debug("Successfully fetched pregnancy settings");
                    pregnancyStopTrackingActivity.hideProgressOverlay();
                    pregnancyStopTrackingActivity.ca().f151620a = pregnancyStopTrackingActivity.ca().f151627h;
                }
                return Unit.INSTANCE;
            case 2:
                db1.c cVar2 = (db1.c) obj;
                PregnancyStopTrackingActivity.a aVar4 = PregnancyStopTrackingActivity.f41001d;
                cVar2.getClass();
                pregnancyStopTrackingActivity.updateActionBarTitle(pregnancyStopTrackingActivity.getString(cVar2.f58989a));
                Button button = (Button) pregnancyStopTrackingActivity.findViewById(R.id.stop_pregnancy_next_button);
                Button button2 = (Button) pregnancyStopTrackingActivity.findViewById(R.id.stop_pregnancy_skip_button);
                button.setVisibility(cVar2.f58990b);
                button.setText(pregnancyStopTrackingActivity.getString(cVar2.f58992d));
                button2.setVisibility(cVar2.f58991c);
                button2.setText(pregnancyStopTrackingActivity.getString(cVar2.f58993e));
                return Unit.INSTANCE;
            default:
                m mVar3 = (m) obj;
                PregnancyStopTrackingActivity.a aVar5 = PregnancyStopTrackingActivity.f41001d;
                mVar3.getClass();
                int i18 = PregnancyStopTrackingActivity.b.f41005a[mVar3.f73769b.ordinal()];
                if (i18 == 1) {
                    pregnancyStopTrackingActivity.showProgressOverlay();
                } else if (i18 == 2) {
                    pregnancyStopTrackingActivity.hideProgressOverlay();
                    g22.a.a(pregnancyStopTrackingActivity, mVar3.f73771d);
                } else {
                    if (i18 != 3) {
                        u0.r();
                        return null;
                    }
                    pregnancyStopTrackingActivity.hideProgressOverlay();
                    p pVar = (p) mVar3.f73770c;
                    if (pVar != null && !((Boolean) pVar.f128595b).booleanValue()) {
                        ((y0) pregnancyStopTrackingActivity.ca().f151629j.getValue()).f(pregnancyStopTrackingActivity, new PregnancyStopTrackingActivity.c(new c(pregnancyStopTrackingActivity, i15)));
                        g gVarCa = pregnancyStopTrackingActivity.ca();
                        ge1.b.T(v1.a(gVarCa), null, null, new j(gVarCa, null), 3);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
