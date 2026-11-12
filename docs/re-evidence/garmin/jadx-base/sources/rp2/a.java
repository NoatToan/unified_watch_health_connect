package rp2;

import android.content.DialogInterface;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerBankTermsConditionActivity;
import com.google.gson.Gson;
import e23.p;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayIssuerBankTermsConditionActivity f154085b;

    public /* synthetic */ a(FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity, int i14) {
        this.f154084a = i14;
        this.f154085b = fitPayIssuerBankTermsConditionActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f154084a;
        FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity = this.f154085b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        FitPayIssuerBankTermsConditionActivity.a aVar = FitPayIssuerBankTermsConditionActivity.f51592t;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayIssuerBankTermsConditionActivity.ia(null);
                return Unit.INSTANCE;
            case 1:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED);
                return Unit.INSTANCE;
            case 2:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                return Unit.INSTANCE;
            case 3:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                return Unit.INSTANCE;
            case 4:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                return Unit.INSTANCE;
            case 5:
                dialogInterface.getClass();
                fitPayIssuerBankTermsConditionActivity.f51599l = false;
                dialogInterface.dismiss();
                gp2.g gVar = fitPayIssuerBankTermsConditionActivity.f51601n;
                if (gVar != null) {
                    jo2.g gVar2 = jo2.g.f99843a;
                    jo2.b bVar = jo2.b.KEY_API;
                    aq2.j.f12491a.getClass();
                    Gson gsonD = aq2.j.d();
                    com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar2 = fitPayIssuerBankTermsConditionActivity.f51602o;
                    if (bVar2 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    String json = gsonD.toJson(bVar2.f51619i.get(), dp2.b.class);
                    json.getClass();
                    gVar2.getClass();
                    String strB = jo2.g.b(bVar, json);
                    FitPayAddCardActivity.a aVar2 = FitPayAddCardActivity.f51376x;
                    Long l14 = fitPayIssuerBankTermsConditionActivity.f51594g;
                    yo2.b bVar3 = fitPayIssuerBankTermsConditionActivity.f51596i;
                    String paymentCardId = bVar3 != null ? bVar3.getPaymentCardId() : null;
                    yo2.b bVar4 = fitPayIssuerBankTermsConditionActivity.f51596i;
                    String creditCardImage = bVar4 != null ? bVar4.getCreditCardImage() : null;
                    yo2.b bVar5 = fitPayIssuerBankTermsConditionActivity.f51596i;
                    String cardType = bVar5 != null ? bVar5.getCardType() : null;
                    gp2.b bVar6 = gp2.b.START_RETRY_FLOW;
                    aVar2.getClass();
                    fitPayIssuerBankTermsConditionActivity.startActivity(FitPayAddCardActivity.a.b(l14, paymentCardId, creditCardImage, cardType, gVar, bVar6, true, strB));
                }
                fitPayIssuerBankTermsConditionActivity.finish();
                return Unit.INSTANCE;
            case 6:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.DECLINED);
                return Unit.INSTANCE;
            default:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.DECLINED);
                return Unit.INSTANCE;
        }
    }
}
