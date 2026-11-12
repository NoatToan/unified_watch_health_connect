package ap2;

import androidx.lifecycle.i0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import o53.f0;
import o53.s0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayAddCardActivity f11690b;

    public /* synthetic */ e(FitPayAddCardActivity fitPayAddCardActivity, int i14) {
        this.f11689a = i14;
        this.f11690b = fitPayAddCardActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f11689a;
        int i15 = 7;
        int i16 = 8;
        FitPayAddCardActivity fitPayAddCardActivity = this.f11690b;
        switch (i14) {
            case 0:
                e eVar = new e(fitPayAddCardActivity, i16);
                FitPayAddCardActivity.a aVar = FitPayAddCardActivity.f51376x;
                fitPayAddCardActivity.ia(false, eVar);
                break;
            case 1:
                e eVar2 = new e(fitPayAddCardActivity, i15);
                FitPayAddCardActivity.a aVar2 = FitPayAddCardActivity.f51376x;
                fitPayAddCardActivity.ia(false, eVar2);
                break;
            case 2:
                FitPayAddCardActivity.a.a(FitPayAddCardActivity.f51376x).debug("handleIssuerNotEligible");
                String string = fitPayAddCardActivity.getString(R.string.card_not_eligible_alt);
                string.getClass();
                String string2 = fitPayAddCardActivity.getString(R.string.lbl_ok);
                string2.getClass();
                FitPayAddCardActivity.da(fitPayAddCardActivity, string, new o13.p(string2, new c(fitPayAddCardActivity, 6)));
                break;
            case 3:
                FitPayAddCardActivity.a aVar3 = FitPayAddCardActivity.f51376x;
                i0 i0VarW = f0.w(fitPayAddCardActivity);
                x53.c cVar = s0.f129406a;
                ge1.b.T(i0VarW, u53.o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.ui.addcard.a(fitPayAddCardActivity, null), 2);
                break;
            case 4:
                FitPayAddCardActivity.a aVar4 = FitPayAddCardActivity.f51376x;
                fitPayAddCardActivity.ka(new o13.p<>(fitPayAddCardActivity.getString(R.string.lbl_ok), new c(fitPayAddCardActivity, 7)));
                break;
            case 5:
                FitPayAddCardActivity.a aVar5 = FitPayAddCardActivity.f51376x;
                fitPayAddCardActivity.la();
                break;
            case 6:
                FitPayAddCardActivity.a aVar6 = FitPayAddCardActivity.f51376x;
                fitPayAddCardActivity.ea();
                break;
            case 7:
                FitPayAddCardActivity.a.a(FitPayAddCardActivity.f51376x).debug("handleMaxCardReached");
                String string3 = fitPayAddCardActivity.getString(R.string.max_card_type_exceeded);
                string3.getClass();
                String string4 = fitPayAddCardActivity.getString(R.string.lbl_ok);
                string4.getClass();
                FitPayAddCardActivity.da(fitPayAddCardActivity, string3, new o13.p(string4, new c(fitPayAddCardActivity, 8)));
                break;
            default:
                FitPayAddCardActivity.a.a(FitPayAddCardActivity.f51376x).debug("handleDuplicateCard");
                String string5 = fitPayAddCardActivity.getString(R.string.card_already_added);
                string5.getClass();
                String string6 = fitPayAddCardActivity.getString(R.string.lbl_ok);
                string6.getClass();
                FitPayAddCardActivity.da(fitPayAddCardActivity, string5, new o13.p(string6, new c(fitPayAddCardActivity, 9)));
                break;
        }
        return Unit.INSTANCE;
    }
}
