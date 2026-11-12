package rp2;

import e23.p;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerTermsConditionViewModel$declineTermsCondition$1", f = "FitPayIssuerTermsConditionViewModel.kt", l = {274, 278}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f154093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b f154094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f154094c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f154094c, dVar);
        eVar.f154093b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r7.o(r4, r6) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.z4(r1, r6) == r0) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fo2.p declineTermsLink;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154092a;
        try {
            if (i14 == 0) {
                r.b(obj);
                Logger logger = com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n;
                logger.debug("onUserDeclineTerms");
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = this.f154094c;
                bVar.B4();
                yo2.b bVarD = bVar.f51617g.d();
                if (bVarD == null || (declineTermsLink = bVarD.getDeclineTermsLink()) == null || (r4 = declineTermsLink.getLink()) == null) {
                    logger.error("onUserDeclineTerms: decline link is missing, deleting card");
                    this.f154093b = null;
                    this.f154092a = 1;
                } else {
                    g1 g1Var = bVar.A4().f205979a;
                    this.f154093b = null;
                    this.f154092a = 2;
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        } catch (Exception e4) {
            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n.error("onUserDeclineTerms: error while decline terms ", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
