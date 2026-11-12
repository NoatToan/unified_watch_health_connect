package ho2;

import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerBankTermsConditionActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.updatedevice.NewFitPayUpdateDeviceActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import org.slf4j.Logger;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PushProvMainActivity f84836b;

    public /* synthetic */ c(PushProvMainActivity pushProvMainActivity, int i14) {
        this.f84835a = i14;
        this.f84836b = pushProvMainActivity;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = 6;
        int i15 = 5;
        switch (this.f84835a) {
            case 0:
                gp2.f fVar = (gp2.f) obj;
                PushProvMainActivity.a aVar = PushProvMainActivity.f51161t;
                fVar.getClass();
                Logger logger = PushProvMainActivity.f51162v;
                logger.debug("prepareBailOutData: " + fVar.name());
                logger.debug("handleCreditCardCreatedResult");
                int i16 = PushProvMainActivity.b.f51175a[fVar.ordinal()];
                int i17 = 14;
                PushProvMainActivity pushProvMainActivity = this.f84836b;
                switch (i16) {
                    case 1:
                        logger.debug("handleCreditCardCreatedResult: navigating to T&C activity");
                        ap2.h hVar = pushProvMainActivity.f51164h;
                        if (hVar == null) {
                            s.m("fitPayAddCardViewModel");
                            throw null;
                        }
                        yo2.b bVar = hVar.f11707k.get();
                        if (bVar == null) {
                            logger.error("handleCreditCardCreatedResult, card is not available");
                            pushProvMainActivity.la(new o13.p<>(pushProvMainActivity.getString(R.string.lbl_ok), new b(pushProvMainActivity, i15)));
                            return;
                        }
                        FitPayIssuerBankTermsConditionActivity.a aVar2 = FitPayIssuerBankTermsConditionActivity.f51592t;
                        m mVar = pushProvMainActivity.f51165i;
                        if (mVar != null) {
                            pushProvMainActivity.f51173q.a(FitPayIssuerBankTermsConditionActivity.a.c(aVar2, Long.valueOf(mVar.f84872c), bVar, false, null, 124), null);
                            return;
                        } else {
                            s.m("pushProvViewModel");
                            throw null;
                        }
                    case 2:
                        logger.debug("handleCreditCardCreatedResult: device requires SE updates, navigating to SE update screen....");
                        ap2.h hVar2 = pushProvMainActivity.f51164h;
                        if (hVar2 == null) {
                            s.m("fitPayAddCardViewModel");
                            throw null;
                        }
                        yo2.b bVar2 = hVar2.f11707k.get();
                        if (bVar2 == null) {
                            logger.error("handleCreditCardCreatedResult, card is not available");
                            pushProvMainActivity.la(new o13.p<>(pushProvMainActivity.getString(R.string.lbl_ok), new b(pushProvMainActivity, i14)));
                            return;
                        }
                        NewFitPayUpdateDeviceActivity.a aVar3 = NewFitPayUpdateDeviceActivity.f51718o;
                        m mVar2 = pushProvMainActivity.f51165i;
                        if (mVar2 == null) {
                            s.m("pushProvViewModel");
                            throw null;
                        }
                        Long lValueOf = Long.valueOf(mVar2.f84872c);
                        aVar3.getClass();
                        pushProvMainActivity.startActivity(NewFitPayUpdateDeviceActivity.a.a(lValueOf, bVar2, false, null));
                        pushProvMainActivity.finish();
                        return;
                    case 3:
                        hn2.c.ba(pushProvMainActivity, Boolean.FALSE, null, null, 14);
                        logger.error("handleCreditCardCreatedResult: DUPLICATE_CARD");
                        logger.debug("showCardAlreadyAddedDialog");
                        br2.c cVar = br2.c.f19585a;
                        String string = pushProvMainActivity.getString(R.string.dialog_title_error);
                        string.getClass();
                        String string2 = pushProvMainActivity.getString(R.string.card_already_added);
                        string2.getClass();
                        androidx.appcompat.app.e eVarQ = br2.c.q(cVar, pushProvMainActivity, string, string2, new o13.p(pushProvMainActivity.getString(R.string.lbl_ok), new b(pushProvMainActivity, 15)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                        if (eVarQ != null) {
                            eVarQ.show();
                            return;
                        }
                        return;
                    case 4:
                        hn2.c.ba(pushProvMainActivity, Boolean.FALSE, null, null, 14);
                        logger.error("handleCreditCardCreatedResult: MAX_CARD_LIMIT_REACHED");
                        logger.debug("showMaxNumCardsReachedDialog");
                        br2.c cVar2 = br2.c.f19585a;
                        String string3 = pushProvMainActivity.getString(R.string.dialog_title_error);
                        string3.getClass();
                        String string4 = pushProvMainActivity.getString(R.string.max_card_type_exceeded);
                        string4.getClass();
                        androidx.appcompat.app.e eVarQ2 = br2.c.q(cVar2, pushProvMainActivity, string3, string4, new o13.p(pushProvMainActivity.getString(R.string.lbl_ok), new b(pushProvMainActivity, 12)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                        if (eVarQ2 != null) {
                            eVarQ2.show();
                            return;
                        }
                        return;
                    case 5:
                        hn2.c.ba(pushProvMainActivity, Boolean.FALSE, null, null, 14);
                        logger.error("handleCreditCardCreatedResult: CARD_ISSUER_NOT_ELIGIBLE");
                        logger.debug("showIssuerNotEligibleDialog");
                        String string5 = pushProvMainActivity.getString(R.string.card_not_eligible_alt);
                        string5.getClass();
                        br2.c cVar3 = br2.c.f19585a;
                        String string6 = pushProvMainActivity.getString(R.string.dialog_title_error);
                        string6.getClass();
                        androidx.appcompat.app.e eVarQ3 = br2.c.q(cVar3, pushProvMainActivity, string6, string5, new o13.p(pushProvMainActivity.getString(R.string.lbl_ok), new b(pushProvMainActivity, 13)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                        if (eVarQ3 != null) {
                            eVarQ3.show();
                            return;
                        }
                        return;
                    case 6:
                    case 7:
                        logger.error("handleCreditCardCreatedResult: CARD_CREATED_BUT_CAN_NOT_PROCEED_FURTHER");
                        return;
                    case 8:
                        hn2.c.ba(pushProvMainActivity, Boolean.FALSE, null, null, 14);
                        logger.error("handleCreditCardCreatedResult: FAILURE_TO_CREATE_CREDIT_CARD");
                        pushProvMainActivity.la(new o13.p<>(pushProvMainActivity.getString(R.string.lbl_ok), new b(pushProvMainActivity, 7)));
                        return;
                    case 9:
                        logger.error("handleCreditCardCreatedResult: CARD_DELETED");
                        logger.debug("showCardCouldNotBeAddedDialog");
                        String string7 = pushProvMainActivity.getString(R.string.card_deleted);
                        string7.getClass();
                        br2.c cVar4 = br2.c.f19585a;
                        String string8 = pushProvMainActivity.getString(R.string.dialog_title_error);
                        string8.getClass();
                        androidx.appcompat.app.e eVarQ4 = br2.c.q(cVar4, pushProvMainActivity, string8, string7, new o13.p(pushProvMainActivity.getString(R.string.lbl_ok), new b(pushProvMainActivity, i17)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                        if (eVarQ4 != null) {
                            eVarQ4.show();
                            return;
                        }
                        return;
                    default:
                        logger.error("handleCreditCardCreatedResult: Other error");
                        pushProvMainActivity.ka();
                        return;
                }
            default:
                com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a enumC1069a = (com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a) obj;
                int i18 = enumC1069a == null ? -1 : i.b.f84852a[enumC1069a.ordinal()];
                PushProvMainActivity pushProvMainActivity2 = this.f84836b;
                if (i18 == 1) {
                    PushProvMainActivity.ca(pushProvMainActivity2);
                    return;
                }
                if (i18 == 2) {
                    PushProvMainActivity.f51162v.debug("fitPay setup is failed");
                    pushProvMainActivity2.ka();
                    return;
                }
                if (i18 != 3) {
                    PushProvMainActivity.a aVar4 = PushProvMainActivity.f51161t;
                    pushProvMainActivity2.ka();
                    return;
                }
                PushProvMainActivity.a aVar5 = PushProvMainActivity.f51161t;
                pushProvMainActivity2.getClass();
                PushProvMainActivity.f51162v.debug("showMaintenanceAlertDialog");
                androidx.appcompat.app.e eVarF = br2.c.f19585a.f(pushProvMainActivity2, new a(pushProvMainActivity2, 5), new a(pushProvMainActivity2, 6));
                if (eVarF != null) {
                    eVarF.show();
                    return;
                }
                return;
        }
    }
}
