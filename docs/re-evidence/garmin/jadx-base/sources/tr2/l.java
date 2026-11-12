package tr2;

import android.content.Intent;
import com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity$startDeviceSelection$2", f = "PaymentCardDetailsActivity.kt", l = {340}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentCardDetailsActivity f166153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PaymentCardDetailsActivity paymentCardDetailsActivity, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f166153b = paymentCardDetailsActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f166153b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166152a;
        PaymentCardDetailsActivity paymentCardDetailsActivity = this.f166153b;
        if (i14 == 0) {
            o13.r.b(obj);
            vr2.i iVar = paymentCardDetailsActivity.f52180h;
            if (iVar == null) {
                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                throw null;
            }
            ps2.n nVar = iVar.f179609l;
            if (nVar != null) {
                this.f166152a = 1;
                obj = nVar.i(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                PaymentCardDetailsActivity.f52178q.error("startDeviceSelection: can not start device selection, device wallet is null");
                paymentCardDetailsActivity.ha();
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ns2.a aVar2 = (ns2.a) obj;
        if (aVar2 != null) {
            f.c<Intent> cVar = paymentCardDetailsActivity.f52185m;
            CardDestinationSelectionActivity.a aVar3 = CardDestinationSelectionActivity.f52143n;
            vr2.i iVar2 = paymentCardDetailsActivity.f52180h;
            if (iVar2 == null) {
                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                throw null;
            }
            long j8 = iVar2.f179600c;
            aVar3.getClass();
            cVar.a(CardDestinationSelectionActivity.a.a(paymentCardDetailsActivity, aVar2, j8, null), null);
        } else {
            PaymentCardDetailsActivity.f52178q.error("startDeviceSelection: can not start device selection, device wallet is null");
            paymentCardDetailsActivity.ha();
        }
        return Unit.INSTANCE;
    }
}
