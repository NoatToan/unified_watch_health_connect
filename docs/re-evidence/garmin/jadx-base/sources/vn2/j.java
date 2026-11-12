package vn2;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.felica.exception.AlreadyHasOneCardException;
import com.garmin.feature.garminpay.providers.felica.exception.ServerInMaintenanceAlertException;
import com.garmin.feature.garminpay.providers.felica.exception.ServerInMaintenanceException;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNServerIncorrectResponseException;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f178900b;

    public /* synthetic */ j(m mVar, int i14) {
        this.f178899a = i14;
        this.f178900b = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01f5  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f178899a;
        int i15 = 3;
        int i16 = 2;
        m mVar = this.f178900b;
        switch (i14) {
            case 0:
                pn2.t tVar = (pn2.t) obj;
                m.f178912c.trace("getUserInfo Success");
                mVar.getView().i();
                mVar.getView().e();
                mVar.f0().x0(tVar);
                mVar.getView().hideProgressOverlay();
                tVar.getClass();
                mVar.g0(tVar, false);
                break;
            case 1:
                m.f178912c.debug("navigateToProvision(): onError");
                mVar.getView().J3(new j(mVar, i15));
                break;
            case 2:
                Logger logger = m.f178912c;
                ((DialogInterface) obj).getClass();
                mVar.getView().c();
                break;
            case 3:
                Logger logger2 = m.f178912c;
                ((DialogInterface) obj).getClass();
                mVar.getView().c();
                break;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                Logger logger3 = m.f178912c;
                mVar.getView().s(iIntValue);
                break;
            case 5:
                Throwable th3 = (Throwable) obj;
                m.f178912c.error("Issue Card Failed: ", th3);
                mVar.getView().w8();
                mVar.getView().i();
                mVar.getView().e();
                boolean z14 = th3 instanceof FNServerIncorrectResponseException;
                if (z14 && ((FNServerIncorrectResponseException) th3).needCallCenter()) {
                    mVar.getView().C3(R.string.title_error_occurred, w5.r.v(R.string.wallet_suica_message_error_contact_support_center, "0492679114"), "0492679114", R.string.lbl_cancel, new j(mVar, 8));
                } else if (z14 && ((FNServerIncorrectResponseException) th3).isServerInUrgentMaintenance()) {
                    mVar.getView().e2(new j(mVar, 9));
                } else if (z14) {
                    FNServerIncorrectResponseException fNServerIncorrectResponseException = (FNServerIncorrectResponseException) th3;
                    if (fNServerIncorrectResponseException.isExpectedFNServerError()) {
                        mVar.getView().o6(new k(mVar, 1), fNServerIncorrectResponseException.getFNServerErrorMessage(), R.string.wallet_title_add_card_failure);
                    } else {
                        mVar.getView().o6(new k(mVar, 2), "", R.string.wallet_title_add_card_failure);
                    }
                } else {
                    mVar.getView().o6(new k(mVar, 2), "", R.string.wallet_title_add_card_failure);
                }
                break;
            case 6:
                Throwable th4 = (Throwable) obj;
                Logger logger4 = m.f178912c;
                mVar.getView().hideProgressOverlay();
                if (th4 instanceof ServerInMaintenanceException) {
                    ServerInMaintenanceException serverInMaintenanceException = (ServerInMaintenanceException) th4;
                    mVar.getView().Q0(tn2.f0.a.PROVISION, serverInMaintenanceException.getStartTime(), serverInMaintenanceException.getEndTime(), new k(mVar, 4));
                } else if (th4 instanceof ServerInMaintenanceAlertException) {
                    mVar.getView().l3(((ServerInMaintenanceAlertException) th4).getTimeToMaintenance(), new ya0.j(13));
                } else if (th4 instanceof AlreadyHasOneCardException) {
                    mVar.getView().Z5(new j(mVar, 11));
                } else {
                    m.f178912c.error("Unhandled exception!: ", th4);
                    mVar.getView().c();
                }
                break;
            case 7:
                Logger logger5 = m.f178912c;
                mVar.getView().i9(mVar.f0().getGarminJpPhoneNumber(), new k(mVar, 3));
                break;
            case 8:
                DialogInterface dialogInterface = (DialogInterface) obj;
                Logger logger6 = m.f178912c;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                mVar.getView().c();
                break;
            case 9:
                Logger logger7 = m.f178912c;
                ((DialogInterface) obj).getClass();
                mVar.getView().c();
                break;
            case 10:
                m.f178912c.error("getUserInfo Failed: ", (Throwable) obj);
                mVar.getView().i();
                mVar.getView().e();
                mVar.getView().hideProgressOverlay();
                mVar.getView().J3(new j(mVar, i16));
                break;
            case 11:
                androidx.appcompat.app.e.a aVar = (androidx.appcompat.app.e.a) obj;
                Logger logger8 = m.f178912c;
                aVar.getClass();
                aVar.setTitle(R.string.wallet_card_limit_reached);
                aVar.setMessage(w5.r.v(R.string.wallet_suica_message_card_limit_exceeded, mVar.f0().getDeviceName()));
                aVar.setCancelable(false);
                aVar.setPositiveButton(R.string.lbl_ok, new sa2.b(mVar, 20));
                break;
            case 12:
                m.f178912c.error("Set Felica express transit card failed: ", (Throwable) obj);
                mVar.getView().hideProgressOverlay();
                mVar.getView().c();
                break;
            default:
                Logger logger9 = m.f178912c;
                y0 view2 = mVar.getView();
                int i17 = vq2.e.f179461z0;
                view2.S5(null, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
