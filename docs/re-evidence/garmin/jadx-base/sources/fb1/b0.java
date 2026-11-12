package fb1;

import android.content.Context;
import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h f70212b;

    public /* synthetic */ b0(com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h hVar, int i14) {
        this.f70211a = i14;
        this.f70212b = hVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f70211a;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h hVar = this.f70212b;
        cx0.a<Unit> aVar = (cx0.a) obj;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                hVar.E6(aVar);
                break;
            case 1:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                hVar.F6(aVar);
                break;
            case 2:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                g22.e.f(hVar);
                if (aVar != null) {
                    Integer num = aVar.f56601c;
                    if ((num != null && num.intValue() == 200) || (num != null && num.intValue() == 204)) {
                        hVar.H6();
                    } else if (!aVar.f56602d) {
                        if (num != null && num.intValue() == 412) {
                            DataStorageConsentActivity.a aVar5 = DataStorageConsentActivity.f32194t;
                            Context contextRequireContext = hVar.requireContext();
                            contextRequireContext.getClass();
                            DataStorageConsentActivity.a.c(aVar5, contextRequireContext);
                        } else if (hVar.f40651t < 3) {
                            o13.p pVar = new o13.p(hVar.getString(R.string.lbl_retry), new c0(hVar, 5));
                            o13.p pVar2 = new o13.p(hVar.getString(R.string.lbl_cancel), new c0(hVar, 6));
                            c22.f fVar = c22.f.f23050a;
                            Context contextRequireContext2 = hVar.requireContext();
                            contextRequireContext2.getClass();
                            fVar.getClass();
                            c22.f.a(contextRequireContext2, R.string.pregnancy_something_went_wrong, R.string.connect_iq_try_again, pVar, pVar2).show();
                        } else {
                            androidx.appcompat.app.e.a aVar6 = new androidx.appcompat.app.e.a(hVar.requireContext());
                            aVar6.setMessage(hVar.getString(R.string.pregnancy_something_went_wrong));
                            aVar6.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                            androidx.appcompat.app.e eVarCreate = aVar6.create();
                            eVarCreate.getClass();
                            eVarCreate.show();
                            hVar.f40651t = 0;
                        }
                    }
                }
                break;
            case 3:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar7 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                hVar.F6(aVar);
                break;
            default:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar8 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                hVar.E6(aVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
