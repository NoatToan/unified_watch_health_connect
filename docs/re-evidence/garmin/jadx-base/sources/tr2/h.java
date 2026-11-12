package tr2;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.x1;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity;
import o53.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentCardDetailsActivity f166145b;

    public /* synthetic */ h(PaymentCardDetailsActivity paymentCardDetailsActivity, int i14) {
        this.f166144a = i14;
        this.f166145b = paymentCardDetailsActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f166144a;
        PaymentCardDetailsActivity paymentCardDetailsActivity = this.f166145b;
        switch (i14) {
            case 0:
                PaymentCardDetailsActivity.a aVar = PaymentCardDetailsActivity.f52177p;
                return (com.garmin.feature.garminpay.providers.gpay.ui.common.a) new x1(paymentCardDetailsActivity).b(s0.f105811a.b(com.garmin.feature.garminpay.providers.gpay.ui.common.a.class));
            case 1:
                PaymentCardDetailsActivity.a aVar2 = PaymentCardDetailsActivity.f52177p;
                paymentCardDetailsActivity.fa();
                return Unit.INSTANCE;
            case 2:
                PaymentCardDetailsActivity.a aVar3 = PaymentCardDetailsActivity.f52177p;
                return paymentCardDetailsActivity;
            case 3:
                PaymentCardDetailsActivity.a aVar4 = PaymentCardDetailsActivity.f52177p;
                xr2.a.f192031a.getClass();
                if (xr2.a.a()) {
                    ge1.b.T(f0.w(paymentCardDetailsActivity), null, null, new l(paymentCardDetailsActivity, null), 3);
                } else {
                    br2.c.f19585a.a(new h(paymentCardDetailsActivity, 5), paymentCardDetailsActivity);
                }
                return Unit.INSTANCE;
            case 4:
                PaymentCardDetailsActivity.a aVar5 = PaymentCardDetailsActivity.f52177p;
                paymentCardDetailsActivity.fa();
                return Unit.INSTANCE;
            case 5:
                PaymentCardDetailsActivity.a aVar6 = PaymentCardDetailsActivity.f52177p;
                ge1.b.T(f0.w(paymentCardDetailsActivity), null, null, new k(paymentCardDetailsActivity, null), 3);
                return Unit.INSTANCE;
            default:
                PaymentCardDetailsActivity.a aVar7 = PaymentCardDetailsActivity.f52177p;
                aq2.j jVar = aq2.j.f12491a;
                kj0.b.f104940a.getClass();
                zi2.a aVarA = kj0.b.a();
                jVar.getClass();
                paymentCardDetailsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aq2.j.c(aVarA))));
                return Unit.INSTANCE;
        }
    }
}
