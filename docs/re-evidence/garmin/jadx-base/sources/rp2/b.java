package rp2;

import androidx.lifecycle.v1;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerBankTermsConditionActivity;
import java.util.concurrent.atomic.AtomicReference;
import o53.s0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayIssuerBankTermsConditionActivity f154087b;

    public /* synthetic */ b(FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity, int i14) {
        this.f154086a = i14;
        this.f154087b = fitPayIssuerBankTermsConditionActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f154086a;
        int i15 = 0;
        FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity = this.f154087b;
        switch (i14) {
            case 0:
                FitPayIssuerBankTermsConditionActivity.a aVar = FitPayIssuerBankTermsConditionActivity.f51592t;
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                AtomicReference<String> atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = fitPayIssuerBankTermsConditionActivity.f51602o;
                if (bVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                yo2.b bVarD = bVar.f51617g.d();
                atomicReference.set(bVarD != null ? bVarD.getExternalTokenReference() : null);
                fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.APPROVED);
                return Unit.INSTANCE;
            case 1:
                FitPayIssuerBankTermsConditionActivity.a aVar2 = FitPayIssuerBankTermsConditionActivity.f51592t;
                fitPayIssuerBankTermsConditionActivity.ea();
                return Unit.INSTANCE;
            case 2:
                FitPayIssuerBankTermsConditionActivity.a aVar3 = FitPayIssuerBankTermsConditionActivity.f51592t;
                fitPayIssuerBankTermsConditionActivity.ia(null);
                return Unit.INSTANCE;
            case 3:
                FitPayIssuerBankTermsConditionActivity.a aVar4 = FitPayIssuerBankTermsConditionActivity.f51592t;
                fitPayIssuerBankTermsConditionActivity.ca();
                return Unit.INSTANCE;
            case 4:
                FitPayIssuerBankTermsConditionActivity.a aVar5 = FitPayIssuerBankTermsConditionActivity.f51592t;
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                AtomicReference<String> atomicReference2 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar2 = fitPayIssuerBankTermsConditionActivity.f51602o;
                if (bVar2 == null) {
                    s.m("viewModel");
                    throw null;
                }
                yo2.b bVarD2 = bVar2.f51617g.d();
                atomicReference2.set(bVarD2 != null ? bVarD2.getExternalTokenReference() : null);
                fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.APPROVED);
                return Unit.INSTANCE;
            case 5:
                FitPayIssuerBankTermsConditionActivity.a aVar6 = FitPayIssuerBankTermsConditionActivity.f51592t;
                fitPayIssuerBankTermsConditionActivity.setResult(0);
                fitPayIssuerBankTermsConditionActivity.finish();
                return Unit.INSTANCE;
            case 6:
                FitPayIssuerBankTermsConditionActivity.a aVar7 = FitPayIssuerBankTermsConditionActivity.f51592t;
                fitPayIssuerBankTermsConditionActivity.ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                return Unit.INSTANCE;
            default:
                FitPayIssuerBankTermsConditionActivity.a aVar8 = FitPayIssuerBankTermsConditionActivity.f51592t;
                hn2.c.ba(fitPayIssuerBankTermsConditionActivity, Boolean.TRUE, null, null, 14);
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar3 = fitPayIssuerBankTermsConditionActivity.f51602o;
                if (bVar3 == null) {
                    s.m("viewModel");
                    throw null;
                }
                ge1.b.T(v1.a(bVar3), null, null, new e(bVar3, null), 3);
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar4 = fitPayIssuerBankTermsConditionActivity.f51602o;
                if (bVar4 == null) {
                    s.m("viewModel");
                    throw null;
                }
                bVar4.f51615e.f(fitPayIssuerBankTermsConditionActivity, new FitPayIssuerBankTermsConditionActivity.c(new d(fitPayIssuerBankTermsConditionActivity, i15)));
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar5 = fitPayIssuerBankTermsConditionActivity.f51602o;
                if (bVar5 != null) {
                    ge1.b.T(v1.a(bVar5), s0.f129406a, null, new i(bVar5, null), 2);
                    return Unit.INSTANCE;
                }
                s.m("viewModel");
                throw null;
        }
    }
}
