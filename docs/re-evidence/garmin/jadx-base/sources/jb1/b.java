package jb1;

import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.logdelivery.PregnancyLogDeliveryDateActivity;
import e23.l;
import fw.c;
import fw.m;
import lc.u0;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Unit;
import rb1.g;
import rb1.j;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PregnancyLogDeliveryDateActivity f98114b;

    public /* synthetic */ b(PregnancyLogDeliveryDateActivity pregnancyLogDeliveryDateActivity, int i14) {
        this.f98113a = i14;
        this.f98114b = pregnancyLogDeliveryDateActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f98113a;
        PregnancyLogDeliveryDateActivity pregnancyLogDeliveryDateActivity = this.f98114b;
        int i15 = 2;
        m mVar = (m) obj;
        switch (i14) {
            case 0:
                PregnancyLogDeliveryDateActivity.a aVar = PregnancyLogDeliveryDateActivity.f40875e;
                int i16 = PregnancyLogDeliveryDateActivity.b.f40880a[mVar.f73769b.ordinal()];
                if (i16 == 1) {
                    pregnancyLogDeliveryDateActivity.ea().debug("Loading pregnancy snapshot...");
                    pregnancyLogDeliveryDateActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    Logger loggerEa = pregnancyLogDeliveryDateActivity.ea();
                    c cVar = mVar.f73771d;
                    loggerEa.debug("Error loading pregnancy snapshot: " + (cVar != null ? cVar.f73761a : null));
                    pregnancyLogDeliveryDateActivity.hideProgressOverlay();
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    pregnancyLogDeliveryDateActivity.ea().debug("Successfully fetched pregnancy snapshot: current=" + pregnancyLogDeliveryDateActivity.fa().f151627h);
                    pregnancyLogDeliveryDateActivity.hideProgressOverlay();
                    pregnancyLogDeliveryDateActivity.fa().f151620a = pregnancyLogDeliveryDateActivity.fa().f151627h;
                    pregnancyLogDeliveryDateActivity.ha(true);
                    pregnancyLogDeliveryDateActivity.ca();
                }
                return Unit.INSTANCE;
            case 1:
                PregnancyLogDeliveryDateActivity.a aVar2 = PregnancyLogDeliveryDateActivity.f40875e;
                mVar.getClass();
                c cVar2 = mVar.f73771d;
                int i17 = PregnancyLogDeliveryDateActivity.b.f40880a[mVar.f73769b.ordinal()];
                if (i17 == 1) {
                    pregnancyLogDeliveryDateActivity.showProgressOverlay();
                } else if (i17 == 2) {
                    pregnancyLogDeliveryDateActivity.ea().debug("updatePregnancySnapshot: error=" + cVar2);
                    pregnancyLogDeliveryDateActivity.hideProgressOverlay();
                    g22.a.a(pregnancyLogDeliveryDateActivity, cVar2);
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    pregnancyLogDeliveryDateActivity.hideProgressOverlay();
                    Logger loggerEa2 = pregnancyLogDeliveryDateActivity.ea();
                    p pVar = (p) mVar.f73770c;
                    loggerEa2.debug("updatePregnancySnapshot: result=" + (pVar != null ? (Boolean) pVar.f128595b : null));
                    pregnancyLogDeliveryDateActivity.ea().debug("updateCycleType: ");
                    ((y0) pregnancyLogDeliveryDateActivity.fa().f151629j.getValue()).f(pregnancyLogDeliveryDateActivity, new PregnancyLogDeliveryDateActivity.c(new b(pregnancyLogDeliveryDateActivity, i15)));
                    g gVarFa = pregnancyLogDeliveryDateActivity.fa();
                    ge1.b.T(v1.a(gVarFa), null, null, new j(gVarFa, null), 3);
                }
                return Unit.INSTANCE;
            default:
                PregnancyLogDeliveryDateActivity.a aVar3 = PregnancyLogDeliveryDateActivity.f40875e;
                int i18 = PregnancyLogDeliveryDateActivity.b.f40880a[mVar.f73769b.ordinal()];
                if (i18 == 1) {
                    pregnancyLogDeliveryDateActivity.showProgressOverlay();
                } else if (i18 == 2) {
                    pregnancyLogDeliveryDateActivity.hideProgressOverlay();
                    g22.a.a(pregnancyLogDeliveryDateActivity, mVar.f73771d);
                } else {
                    if (i18 != 3) {
                        u0.r();
                        return null;
                    }
                    pregnancyLogDeliveryDateActivity.hideProgressOverlay();
                    pregnancyLogDeliveryDateActivity.startActivity(MCTSetupActivity.a.a(MCTSetupActivity.f39100c, pregnancyLogDeliveryDateActivity, 2));
                    pregnancyLogDeliveryDateActivity.finish();
                }
                return Unit.INSTANCE;
        }
    }
}
