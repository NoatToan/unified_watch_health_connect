package rp2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import qw0.y;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerTermsConditionViewModel$refreshCreditCardsSuspendable$1", f = "FitPayIssuerTermsConditionViewModel.kt", l = {287}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b f154104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f154104b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f154104b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = this.f154104b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154103a;
        try {
            if (i14 == 0) {
                r.b(obj);
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n.debug("refreshCreditCardsSuspendable");
                g1 g1Var = bVar.A4().f205979a;
                y yVar = new y(bVar, 20);
                this.f154103a = 1;
                if (g1.g0(g1Var, yVar, this, 3) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n.error("refreshCreditCardsSuspendable: error while refreshing cached cards ", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
