package tr2;

import android.content.DialogInterface;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentCardDetailsActivity f166147b;

    public /* synthetic */ i(PaymentCardDetailsActivity paymentCardDetailsActivity, int i14) {
        this.f166146a = i14;
        this.f166147b = paymentCardDetailsActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f166146a;
        PaymentCardDetailsActivity paymentCardDetailsActivity = this.f166147b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        PaymentCardDetailsActivity.a aVar = PaymentCardDetailsActivity.f52177p;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                paymentCardDetailsActivity.fa();
                break;
            case 1:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                paymentCardDetailsActivity.fa();
                break;
            default:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                paymentCardDetailsActivity.fa();
                break;
        }
        return Unit.INSTANCE;
    }
}
