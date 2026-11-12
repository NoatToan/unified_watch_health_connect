package vn2;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.felica.exception.DeviceNotConnectedException;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNServerIncorrectResponseException;
import org.json.JSONException;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f178888b;

    public /* synthetic */ h0(k0 k0Var, int i14) {
        this.f178887a = i14;
        this.f178888b = k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011f  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f178887a;
        k0 k0Var = this.f178888b;
        switch (i14) {
            case 0:
                Logger logger = k0.f178905d;
                k0Var.getView().T2(Integer.valueOf(k0Var.f0().getChargingAmount()));
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                k0.f178905d.error("Recharge failed: ", th3);
                if (th3 instanceof DeviceNotConnectedException) {
                    k0Var.getView().u1(new b1(7), k0Var.f0().getDeviceUnitId(), k0Var.f0().getDeviceName());
                    k0Var.getView().Z0();
                } else if (th3 instanceof JSONException) {
                    k0Var.U(th3);
                } else {
                    boolean z14 = th3 instanceof FNServerIncorrectResponseException;
                    if (z14 && ((FNServerIncorrectResponseException) th3).isServerInUrgentMaintenance()) {
                        k0Var.getView().e2(new h0(k0Var, 4));
                    } else if (z14) {
                        FNServerIncorrectResponseException fNServerIncorrectResponseException = (FNServerIncorrectResponseException) th3;
                        if (fNServerIncorrectResponseException.isExpectedFNServerError()) {
                            k0Var.getView().o6(new j0(k0Var, 1), fNServerIncorrectResponseException.getFNServerErrorMessage(), R.string.wallet_title_recharge_failed);
                        } else {
                            k0Var.getView().o6(new j0(k0Var, 2), "", R.string.wallet_title_recharge_failed);
                        }
                    } else {
                        k0Var.getView().o6(new j0(k0Var, 2), "", R.string.wallet_title_recharge_failed);
                    }
                }
                break;
            case 2:
                Integer num = (Integer) obj;
                Logger logger2 = k0.f178905d;
                e1 view2 = k0Var.getView();
                num.getClass();
                view2.P6(num.intValue());
                break;
            case 3:
                k0.f178905d.error("Get Balance Failed: ", (Throwable) obj);
                k0Var.getView().J3(new h0(k0Var, 5));
                break;
            case 4:
                Logger logger3 = k0.f178905d;
                ((DialogInterface) obj).getClass();
                k0Var.getView().q4(0, null);
                break;
            case 5:
                Logger logger4 = k0.f178905d;
                ((DialogInterface) obj).getClass();
                k0Var.getView().q4(0, null);
                break;
            case 6:
                k0.f178905d.error("Get Balance Failed: ", (Throwable) obj);
                k0Var.getView().Z0();
                break;
            default:
                Logger logger5 = k0.f178905d;
                k0Var.getView().U5(R.string.wallet_charging_your_card);
                k0Var.getView().E4(R.string.wallet_charging);
                k0Var.getView().j();
                k0Var.getView().h();
                break;
        }
        return Unit.INSTANCE;
    }
}
