package rp2;

import e23.p;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zn2.g1;
import zn2.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerTermsConditionViewModel$fetchHtmlData$1", f = "FitPayIssuerTermsConditionViewModel.kt", l = {162}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b f154095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f154096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b f154097c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f154097c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f154097c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        fo2.p termsAndConditionsLink;
        String link;
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154096b;
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar2 = this.f154097c;
        try {
            if (i14 == 0) {
                r.b(obj);
                Logger logger = com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n;
                logger.debug("fetchHtmlData");
                yo2.b bVarD = bVar2.f51617g.d();
                if (bVarD == null || (termsAndConditionsLink = bVarD.getTermsAndConditionsLink()) == null || (link = termsAndConditionsLink.getLink()) == null) {
                    logger.error("fetchHtmlData: terms url not found can not navigate to webView");
                    bVar2.f51616f.j(null);
                } else {
                    g1 g1Var = bVar2.A4().f205979a;
                    this.f154095a = bVar2;
                    this.f154096b = 1;
                    obj = g1Var.P(link, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    bVar = bVar2;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = this.f154095a;
            r.b(obj);
            String str = (String) obj;
            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n.debug("fetchHtmlData: issuer T&C received");
            if (bVar.f51620j != null && bVar.f51611a != null) {
                to2.a aVar2 = bVar.A4().f205982d;
                t tVar = bVar.f51611a;
                if (tVar == null) {
                    s.m("deviceServiceProvider");
                    throw null;
                }
                aVar2.i(tVar.f205819e.f205629a.f73101a, bVar);
            }
            bVar.f51616f.j(str);
        } catch (Exception unused) {
            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n.error("fetchHtmlData: failed to get getTermsCondition");
            bVar2.f51616f.j(null);
        }
        return Unit.INSTANCE;
    }
}
