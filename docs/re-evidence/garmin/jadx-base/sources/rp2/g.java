package rp2;

import com.google.mlkit.common.MlKitException;
import ds.e0;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerTermsConditionViewModel$getCardTypes$1", f = "FitPayIssuerTermsConditionViewModel.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b f154099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f154099b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f154099b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154098a;
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = this.f154099b;
        try {
            if (i14 == 0) {
                r.b(obj);
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n.debug("getCardTypes");
                g1 g1Var = bVar.A4().f205979a;
                this.f154098a = 1;
                obj = g1Var.w(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            bVar.f51618h.j(((ep2.c) obj).b());
        } catch (Exception e4) {
            e0.v("getCardTypes: ", e4.getMessage(), com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n);
        }
        return Unit.INSTANCE;
    }
}
