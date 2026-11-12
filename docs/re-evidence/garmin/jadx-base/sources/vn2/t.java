package vn2;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.felica.exception.ServerInMaintenanceAlertException;
import com.garmin.feature.garminpay.providers.felica.exception.ServerInMaintenanceException;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNServerIncorrectResponseException;
import com.google.common.base.Optional;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class t implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f178950b;

    public /* synthetic */ t(b0 b0Var, int i14) {
        this.f178949a = i14;
        this.f178950b = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f178949a;
        int i15 = 13;
        int i16 = 5;
        int i17 = 6;
        b0 b0Var = this.f178950b;
        switch (i14) {
            case 0:
                tn2.y0.c cVar = (tn2.y0.c) obj;
                Logger logger = b0.f178864c;
                cVar.getClass();
                b0Var.k0(cVar);
                return Unit.INSTANCE;
            case 1:
                Throwable th3 = (Throwable) obj;
                b0.f178864c.error("Download transaction history PDF failed: ", th3);
                b0Var.getView().hideProgressOverlay();
                if (th3 instanceof ServerInMaintenanceException) {
                    ServerInMaintenanceException serverInMaintenanceException = (ServerInMaintenanceException) th3;
                    b0Var.getView().Q0(tn2.f0.a.GET_USAGE_HISTORY, serverInMaintenanceException.getStartTime(), serverInMaintenanceException.getEndTime(), new ya0.j(12));
                } else if (th3 instanceof ServerInMaintenanceAlertException) {
                    b0Var.getView().l3(((ServerInMaintenanceAlertException) th3).getTimeToMaintenance(), new ya0.j(i15));
                } else {
                    b0Var.getView().R1();
                }
                return Unit.INSTANCE;
            case 2:
                z0.e eVar = (z0.e) obj;
                Logger logger2 = b0.f178864c;
                b0Var.getView().hideProgressOverlay();
                eVar.getClass();
                b0Var.i0(eVar);
                return Unit.INSTANCE;
            case 3:
                Throwable th4 = (Throwable) obj;
                Logger logger3 = b0.f178864c;
                b0Var.getView().hideProgressOverlay();
                th4.getClass();
                b0Var.h0(th4);
                return Unit.INSTANCE;
            case 4:
                o13.p pVar = (o13.p) obj;
                Logger logger4 = b0.f178864c;
                List<vr2.q> list = (List) pVar.f128594a;
                Optional<hs2.c> optional = (Optional) pVar.f128595b;
                b0Var.getView().hideProgressOverlay();
                b0Var.getView().c();
                b0Var.getView().y4(b0Var.f0().getDeviceUnitId(), list, optional, b0Var.f0().getDeviceName());
                return Unit.INSTANCE;
            case 5:
                Throwable th5 = (Throwable) obj;
                b0.f178864c.error("addMetadataToDevice Error: ", th5);
                th5.getClass();
                b0Var.j0(th5, new t(b0Var, i17));
                return Unit.INSTANCE;
            case 6:
                Logger logger5 = b0.f178864c;
                ((String) obj).getClass();
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 7:
                Logger logger6 = b0.f178864c;
                ((DialogInterface) obj).getClass();
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 8:
                b0.f178864c.error("Check Card Status Error: ", (Throwable) obj);
                b0Var.getView().J3(new t(b0Var, 7));
                return Unit.INSTANCE;
            case 9:
                Logger logger7 = b0.f178864c;
                b0Var.getView().i();
                b0Var.getView().e();
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 10:
                DialogInterface dialogInterface = (DialogInterface) obj;
                Logger logger8 = b0.f178864c;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 11:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                Logger logger9 = b0.f178864c;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                b0Var.getView().V7(wr2.q.b.REMOVED_COMPLETELY, b0Var.f0().getDeviceUnitId(), p13.w.c(b0Var.f0().getDeviceName()));
                return Unit.INSTANCE;
            case 12:
                Logger logger10 = b0.f178864c;
                ((String) obj).getClass();
                b0Var.getView().J3(new t(b0Var, 22));
                return Unit.INSTANCE;
            case 13:
                Logger logger11 = b0.f178864c;
                ((DialogInterface) obj).getClass();
                b0Var.getView().i();
                b0Var.getView().e();
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 14:
                Logger logger12 = b0.f178864c;
                ((DialogInterface) obj).getClass();
                b0Var.getView().i();
                b0Var.getView().e();
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 15:
                Logger logger13 = b0.f178864c;
                com.garmin.feature.garminpay.providers.felica.ui.b view2 = b0Var.getView();
                tn2.e eVar2 = new tn2.e(null, 1, null);
                as2.b bVar = (as2.b) ((Optional) obj).orNull();
                view2.q(eVar2.b(bVar != null ? (Integer) bVar.a() : null));
                return Unit.INSTANCE;
            case 16:
                Logger logger14 = b0.f178864c;
                ((DialogInterface) obj).getClass();
                b0Var.getView().i();
                b0Var.getView().e();
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 17:
                b0.f178864c.error("checkGooglePayReady Error: ", (Throwable) obj);
                b0Var.getView().hideProgressOverlay();
                com.garmin.feature.garminpay.providers.felica.ui.b view3 = b0Var.getView();
                int i18 = vq2.b.f179457y0;
                view3.J3(new b1(i16));
                return Unit.INSTANCE;
            case 18:
                Boolean bool = (Boolean) obj;
                Logger logger15 = b0.f178864c;
                bool.getClass();
                return bool.booleanValue() ? b0Var.f0().v0().c(b0Var.f0().p0()) : b0Var.f0().p0();
            case 19:
                z0.b bVar2 = (z0.b) obj;
                Logger logger16 = b0.f178864c;
                logger16.trace("prepareCardDetail success");
                b0Var.getView().hideProgressOverlay();
                tn2.e eVar3 = new tn2.e(null, 1, null);
                com.garmin.feature.garminpay.providers.felica.ui.b view4 = b0Var.getView();
                as2.b<Integer> bVar3 = bVar2.f178976d;
                Throwable th6 = bVar2.f178975c;
                pn2.e eVar4 = bVar2.f178974b;
                view4.q(eVar3.b(bVar3 != null ? bVar3.a() : null));
                com.garmin.feature.garminpay.providers.felica.ui.b view5 = b0Var.getView();
                as2.b<Integer> bVar4 = bVar2.f178976d;
                view5.v(w52.u0.i(bVar4 != null ? bVar4.c() : null));
                b0Var.getView().W(b0Var.f0().getDeviceName(), b0Var.f0().r());
                com.garmin.feature.garminpay.providers.felica.ui.b view6 = b0Var.getView();
                rn2.a additionalInfo = bVar2.f178973a.getAdditionalInfo();
                additionalInfo.getClass();
                rn2.u transitInformation = additionalInfo.getTransitInformation();
                transitInformation.getClass();
                view6.w(transitInformation.getCardNumber().getValue());
                if (eVar4 != null) {
                    b0Var.getView().y(eVar4);
                } else {
                    logger16.error("getCardUsageHistory Error: ", th6);
                    if ((th6 instanceof FNServerIncorrectResponseException) && ((FNServerIncorrectResponseException) th6).isServerInUrgentMaintenance()) {
                        b0Var.getView().V8();
                    } else {
                        b0Var.getView().O6(new t(b0Var, 23));
                    }
                }
                return Unit.INSTANCE;
            case 20:
                b0.f178864c.error("prepareCardDetail Error: ", (Throwable) obj);
                b0Var.getView().hideProgressOverlay();
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 21:
                Boolean bool2 = (Boolean) obj;
                Logger logger17 = b0.f178864c;
                bool2.getClass();
                return bool2.booleanValue() ? b0Var.f0().v0().d(b0Var.f0().y(new c0(b0Var))) : b0Var.f0().y(new d0(b0Var));
            case 22:
                Logger logger18 = b0.f178864c;
                ((DialogInterface) obj).getClass();
                b0Var.getView().i();
                b0Var.getView().e();
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 23:
                Logger logger19 = b0.f178864c;
                ((DialogInterface) obj).getClass();
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 24:
                Boolean bool3 = (Boolean) obj;
                Logger logger20 = b0.f178864c;
                bool3.getClass();
                if (!bool3.booleanValue()) {
                    return b0Var.f0().B(new z0.e.a(), new f0(b0Var));
                }
                e13.c cVarC = b0Var.f0().v0().c(b0Var.f0().p0());
                y yVar = new y(new t(b0Var, 28), i15);
                int i19 = w03.b.f181178a;
                return new e13.k(cVarC, yVar);
            case 25:
                Throwable th7 = (Throwable) obj;
                Logger logger21 = b0.f178864c;
                b0Var.getView().i();
                b0Var.getView().e();
                b0Var.getView().hideProgressOverlay();
                th7.getClass();
                b0Var.h0(th7);
                return Unit.INSTANCE;
            case 26:
                Throwable th8 = (Throwable) obj;
                Logger logger22 = b0.f178864c;
                b0Var.getView().i();
                b0Var.getView().e();
                b0Var.getView().hideProgressOverlay();
                if (th8 instanceof FNServerIncorrectResponseException) {
                    FNServerIncorrectResponseException fNServerIncorrectResponseException = (FNServerIncorrectResponseException) th8;
                    if (fNServerIncorrectResponseException.isServerInUrgentMaintenance()) {
                        b0Var.getView().e2(new a0(b0Var, 0));
                    } else if (fNServerIncorrectResponseException.isExpectedFNServerError()) {
                        b0Var.getView().o6(new x(b0Var, 3), fNServerIncorrectResponseException.getFNServerErrorMessage(), R.string.wallet_title_remove_card_error);
                    } else {
                        b0Var.getView().o6(new x(b0Var, 4), "", R.string.wallet_title_remove_card_error);
                    }
                } else {
                    b0Var.getView().o6(new x(b0Var, i16), "", R.string.wallet_title_remove_card_error);
                }
                return Unit.INSTANCE;
            case 27:
                Throwable th9 = (Throwable) obj;
                b0.f178864c.error("removeCard Error: ", th9);
                th9.getClass();
                b0Var.j0(th9, new t(b0Var, 29));
                return Unit.INSTANCE;
            case 28:
                z0.e eVar5 = (z0.e) obj;
                Logger logger23 = b0.f178864c;
                eVar5.getClass();
                return b0Var.f0().B(eVar5, new e0(b0Var));
            default:
                String str = (String) obj;
                Logger logger24 = b0.f178864c;
                str.getClass();
                b0Var.getView().o6(new x(b0Var, i17), str, R.string.wallet_title_remove_card_error);
                return Unit.INSTANCE;
        }
    }
}
