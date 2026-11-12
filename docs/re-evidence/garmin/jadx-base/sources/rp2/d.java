package rp2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerBankTermsConditionActivity;
import e23.l;
import java.util.concurrent.atomic.AtomicReference;
import lc.u0;
import o13.p;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayIssuerBankTermsConditionActivity f154091b;

    public /* synthetic */ d(FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity, int i14) {
        this.f154090a = i14;
        this.f154091b = fitPayIssuerBankTermsConditionActivity;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x034f  */
    /* JADX WARN: Code duplicated, block: B:105:0x035e  */
    /* JADX WARN: Code duplicated, block: B:74:0x029c  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x02db  */
    /* JADX WARN: Code duplicated, block: B:85:0x02e9  */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x035e, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f154090a;
        int i15 = 0;
        FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity = this.f154091b;
        switch (i14) {
            case 0:
                FitPayIssuerBankTermsConditionActivity.a aVar = FitPayIssuerBankTermsConditionActivity.f51592t;
                if (((Boolean) obj).booleanValue()) {
                    fitPayIssuerBankTermsConditionActivity.setResult(0);
                    fitPayIssuerBankTermsConditionActivity.finish();
                } else {
                    FitPayIssuerBankTermsConditionActivity.a.a(FitPayIssuerBankTermsConditionActivity.f51592t).error("launchDeclineTermsConditionForPushProvisioning: Did not finished correctly");
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b enumC1070b = (com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b) obj;
                FitPayIssuerBankTermsConditionActivity.a aVar2 = FitPayIssuerBankTermsConditionActivity.f51592t;
                enumC1070b.getClass();
                FitPayIssuerBankTermsConditionActivity.a aVar3 = FitPayIssuerBankTermsConditionActivity.f51592t;
                FitPayIssuerBankTermsConditionActivity.a.a(aVar3).debug("handleCardProvisionResult: " + enumC1070b);
                int i16 = 4;
                int i17 = 2;
                switch (FitPayIssuerBankTermsConditionActivity.b.f51606a[enumC1070b.ordinal()]) {
                    case 1:
                        FitPayIssuerBankTermsConditionActivity.a.a(aVar3).debug("handleCardProvisionResult: card provision complete, checking card state");
                        Logger loggerA = FitPayIssuerBankTermsConditionActivity.a.a(aVar3);
                        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = fitPayIssuerBankTermsConditionActivity.f51602o;
                        if (bVar == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        yo2.b bVarD = bVar.f51617g.d();
                        com.airbnb.lottie.animation.keyframe.a.w("handleCreditCardState =  viewModel.creditCard.value?.cardState=", bVarD != null ? bVarD.getCardState() : null, loggerA);
                        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar2 = fitPayIssuerBankTermsConditionActivity.f51602o;
                        if (bVar2 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        yo2.b bVarD2 = bVar2.f51617g.d();
                        String cardState = bVarD2 != null ? bVarD2.getCardState() : null;
                        if (cardState != null) {
                            switch (cardState) {
                                case "DELETED":
                                case "NOT_ELIGIBLE":
                                case "ERROR":
                                    FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCreditCardState: card state: ".concat(cardState));
                                    fitPayIssuerBankTermsConditionActivity.da();
                                    break;
                                case "PENDING_VERIFICATION":
                                    FitPayIssuerBankTermsConditionActivity.a.a(aVar3).debug("handleCreditCardState: card state: " + cardState + ", navigating to card verification screen");
                                    ge1.b.T(f0.w(fitPayIssuerBankTermsConditionActivity), s0.f129406a, null, new com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.a(fitPayIssuerBankTermsConditionActivity, null), 2);
                                    break;
                                case "DECLINED":
                                    FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCreditCardState: credit card declined");
                                    fitPayIssuerBankTermsConditionActivity.ca();
                                    break;
                                case "ACTIVE":
                                case "PENDING_ACTIVE":
                                    com.airbnb.lottie.animation.keyframe.a.u("handleCreditCardState: card state: ", cardState, ", navigating to wallet view", FitPayIssuerBankTermsConditionActivity.a.a(aVar3));
                                    if (!fitPayIssuerBankTermsConditionActivity.f51597j && fitPayIssuerBankTermsConditionActivity.f51600m == gp2.e.CREDENTIAL_NOT_CREATED) {
                                        br2.c cVar = br2.c.f19585a;
                                        String string = fitPayIssuerBankTermsConditionActivity.getResources().getString(R.string.card_add_device_success_ecom_payments_fail);
                                        string.getClass();
                                        cVar.c(fitPayIssuerBankTermsConditionActivity, string, new b(fitPayIssuerBankTermsConditionActivity, i16));
                                    } else {
                                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                                        AtomicReference<String> atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                                        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar3 = fitPayIssuerBankTermsConditionActivity.f51602o;
                                        if (bVar3 == null) {
                                            s.m("viewModel");
                                            throw null;
                                        }
                                        yo2.b bVarD3 = bVar3.f51617g.d();
                                        atomicReference.set(bVarD3 != null ? bVarD3.getExternalTokenReference() : null);
                                        fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.APPROVED);
                                    }
                                    break;
                                default:
                                    FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCreditCardState: unhandled state: " + cardState);
                                    fitPayIssuerBankTermsConditionActivity.ea();
                                    break;
                            }
                        } else {
                            FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCreditCardState: unhandled state: " + cardState);
                            fitPayIssuerBankTermsConditionActivity.ea();
                            break;
                        }
                        break;
                    case 2:
                        FitPayIssuerBankTermsConditionActivity.a.a(aVar3).debug("handleCardProvisionResult: card activated, navigating to the wallet view");
                        if (fitPayIssuerBankTermsConditionActivity.f51597j && fitPayIssuerBankTermsConditionActivity.f51600m == gp2.e.CREDENTIAL_NOT_CREATED) {
                            br2.c cVar2 = br2.c.f19585a;
                            String string2 = fitPayIssuerBankTermsConditionActivity.getResources().getString(R.string.card_add_device_success_ecom_payments_fail);
                            string2.getClass();
                            cVar2.c(fitPayIssuerBankTermsConditionActivity, string2, new b(fitPayIssuerBankTermsConditionActivity, i15));
                        } else {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                            AtomicReference<String> atomicReference2 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar4 = fitPayIssuerBankTermsConditionActivity.f51602o;
                            if (bVar4 == null) {
                                s.m("viewModel");
                                throw null;
                            }
                            yo2.b bVarD4 = bVar4.f51617g.d();
                            atomicReference2.set(bVarD4 != null ? bVarD4.getExternalTokenReference() : null);
                            fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.APPROVED);
                        }
                        break;
                    case 3:
                        FitPayIssuerBankTermsConditionActivity.a.a(aVar3).debug("handleCardProvisionResult: card is in pending verification, navigating to the pending verification screen");
                        ge1.b.T(f0.w(fitPayIssuerBankTermsConditionActivity), s0.f129406a, null, new com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.a(fitPayIssuerBankTermsConditionActivity, null), 2);
                        break;
                    case 4:
                        FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCardProvisionResult: failed to accept terms, card is deleted. Finish with refresh.");
                        fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                        break;
                    case 5:
                        FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCardProvisionResult: failed to accept terms, card is deleted");
                        fitPayIssuerBankTermsConditionActivity.ea();
                        break;
                    case 6:
                        FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCardProvisionResult: card eligibility check failed, card is deleted");
                        String string3 = fitPayIssuerBankTermsConditionActivity.getString(R.string.card_not_eligible_alt);
                        string3.getClass();
                        FitPayIssuerBankTermsConditionActivity.ha(fitPayIssuerBankTermsConditionActivity, string3, new p(fitPayIssuerBankTermsConditionActivity.getString(R.string.lbl_ok), new a(fitPayIssuerBankTermsConditionActivity, 4)));
                        break;
                    case 7:
                        com.airbnb.lottie.animation.keyframe.a.w("handleCardProvisionResult=", enumC1070b.f51637a, FitPayIssuerBankTermsConditionActivity.a.a(aVar3));
                        String str = enumC1070b.f51637a;
                        if (str == null) {
                            FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCardProvisionResult: card provision failed, card is deleted");
                            fitPayIssuerBankTermsConditionActivity.ca();
                        } else {
                            FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCardProvisionResult: card provision failed, reason is not null");
                            FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleReasonFromProvisionFailed: reason=".concat(str));
                            if (str.equals("NAME_VERIFICATION_ERROR")) {
                                String string4 = fitPayIssuerBankTermsConditionActivity.getString(R.string.name_does_not_match_card);
                                string4.getClass();
                                String string5 = fitPayIssuerBankTermsConditionActivity.getString(R.string.please_enter_your_name_as_it_appears_on_card);
                                string5.getClass();
                                fitPayIssuerBankTermsConditionActivity.ga(string4, string5, new p<>(fitPayIssuerBankTermsConditionActivity.getString(R.string.lbl_ok), new a(fitPayIssuerBankTermsConditionActivity, 7)));
                            } else if (!str.equals("PAYMENT_NETWORK_REJECTION")) {
                                FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleReasonFromProvisionFailed: Not yet implemented. Showing default message. isInRetryFlow=" + fitPayIssuerBankTermsConditionActivity.f51598k);
                                fitPayIssuerBankTermsConditionActivity.ja(new b(fitPayIssuerBankTermsConditionActivity, 3));
                            } else if (fitPayIssuerBankTermsConditionActivity.f51597j && fitPayIssuerBankTermsConditionActivity.f51600m == gp2.e.CREDENTIAL_CREATED) {
                                br2.c cVar3 = br2.c.f19585a;
                                String string6 = fitPayIssuerBankTermsConditionActivity.getResources().getString(R.string.card_add_ecom_success_device_fail);
                                string6.getClass();
                                cVar3.c(fitPayIssuerBankTermsConditionActivity, string6, new b(fitPayIssuerBankTermsConditionActivity, i17));
                            } else {
                                fitPayIssuerBankTermsConditionActivity.ca();
                            }
                        }
                        break;
                    case 8:
                        FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCardProvisionResult: card provision timed out, card is deleted");
                        String string7 = fitPayIssuerBankTermsConditionActivity.getString(R.string.your_bank_failed_to_respond_to_this_request);
                        string7.getClass();
                        String string8 = fitPayIssuerBankTermsConditionActivity.getString(R.string.bank_communication_error);
                        string8.getClass();
                        fitPayIssuerBankTermsConditionActivity.ga(string8, string7, new p<>(fitPayIssuerBankTermsConditionActivity.getString(R.string.lbl_ok), new a(fitPayIssuerBankTermsConditionActivity, 2)));
                        break;
                    case 9:
                        FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCardProvisionResult: terms are accepted but failed to fetch card");
                        fitPayIssuerBankTermsConditionActivity.fa();
                        break;
                    case 10:
                        FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCardProvisionResult: failed to fetch terms and conditions info");
                        fitPayIssuerBankTermsConditionActivity.fa();
                        break;
                    case 11:
                        FitPayIssuerBankTermsConditionActivity.a.a(aVar3).error("handleCardProvisionResult: credit card deleted");
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                        if (!s.g(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get(), Boolean.TRUE)) {
                            fitPayIssuerBankTermsConditionActivity.da();
                        }
                        break;
                    case 12:
                        FitPayIssuerBankTermsConditionActivity.a.a(aVar3).debug("handleCardProvisionResult: retrying card provision with additional card details");
                        fitPayIssuerBankTermsConditionActivity.ja(new b(fitPayIssuerBankTermsConditionActivity, 1));
                        break;
                    default:
                        u0.r();
                        return null;
                }
                return Unit.INSTANCE;
            default:
                FitPayIssuerBankTermsConditionActivity.a aVar4 = FitPayIssuerBankTermsConditionActivity.f51592t;
                if (((Boolean) obj).booleanValue()) {
                    fitPayIssuerBankTermsConditionActivity.S9(fitPayIssuerBankTermsConditionActivity);
                } else {
                    FitPayIssuerBankTermsConditionActivity.a.a(FitPayIssuerBankTermsConditionActivity.f51592t).error("finishWithCancellation: Did not finished correctly");
                }
                return Unit.INSTANCE;
        }
    }
}
