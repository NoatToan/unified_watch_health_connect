package tn2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class u0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f165674b;

    public /* synthetic */ u0(Throwable th3, int i14) {
        this.f165673a = i14;
        this.f165674b = th3;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Throwable {
        switch (this.f165673a) {
            case 0:
                ((c83.a0) obj).getClass();
                Throwable th3 = this.f165674b;
                th3.getClass();
                throw th3;
            default:
                androidx.appcompat.app.e.a aVar = (androidx.appcompat.app.e.a) obj;
                aVar.setTitle(R.string.dialog_title_error);
                Throwable th4 = this.f165674b;
                if (th4 instanceof ProviderErrorCodeException) {
                    aVar.setMessage(aVar.getContext().getString(R.string.title_error_occurred) + " (" + ((ProviderErrorCodeException) th4).getErrorCode() + ")");
                } else {
                    aVar.setMessage(R.string.title_error_occurred);
                }
                aVar.setCancelable(false);
                aVar.setNegativeButton(R.string.lbl_ok, new xk1.v(10));
                return Unit.INSTANCE;
        }
    }
}
