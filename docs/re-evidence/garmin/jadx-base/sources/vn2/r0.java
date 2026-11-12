package vn2;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.felica.exception.ServerInMaintenanceException;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNServerIncorrectResponseException;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class r0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f178939b;

    public /* synthetic */ r0(v0 v0Var, int i14) {
        this.f178938a = i14;
        this.f178939b = v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a4  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f178938a;
        int i15 = 5;
        final int i16 = 0;
        final v0 v0Var = this.f178939b;
        switch (i14) {
            case 0:
                pn2.t tVar = (pn2.t) obj;
                Logger logger = v0.f178959c;
                i1 i1VarF0 = v0Var.f0();
                tVar.getClass();
                i1VarF0.I0(tVar);
                v0Var.getView().y7(tVar);
                v0Var.getView().hideProgressOverlay();
                v0Var.getView().Q6();
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                v0.f178959c.error("Check server maintenance failed: ", th3);
                if (th3 instanceof ServerInMaintenanceException) {
                    ServerInMaintenanceException serverInMaintenanceException = (ServerInMaintenanceException) th3;
                    v0Var.getView().Q0(tn2.f0.a.UPDATE_USER_INFO, serverInMaintenanceException.getStartTime(), serverInMaintenanceException.getEndTime(), new ya0.j(12));
                } else {
                    k1 view2 = v0Var.getView();
                    int i17 = vq2.b.f179457y0;
                    view2.J3(new b1(5));
                }
                break;
            case 2:
                String str = (String) obj;
                Logger logger2 = v0.f178959c;
                k1 view3 = v0Var.getView();
                str.getClass();
                view3.X5(str);
                v0Var.getView().hideProgressOverlay();
                break;
            case 3:
                v0.f178959c.error("Get user email failed: ", (Throwable) obj);
                v0Var.getView().hideProgressOverlay();
                k1 view4 = v0Var.getView();
                int i18 = vq2.b.f179457y0;
                view4.J3(new b1(5));
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                v0.f178959c.error("Update User Info failed: ", th4);
                v0Var.getView().hideProgressOverlay();
                boolean z14 = th4 instanceof FNServerIncorrectResponseException;
                if (z14 && ((FNServerIncorrectResponseException) th4).isServerInUrgentMaintenance()) {
                    v0Var.getView().e2(new r0(v0Var, i15));
                } else if (z14) {
                    FNServerIncorrectResponseException fNServerIncorrectResponseException = (FNServerIncorrectResponseException) th4;
                    if (fNServerIncorrectResponseException.isExpectedFNServerError()) {
                        v0Var.getView().o6(new e23.a() { // from class: vn2.u0
                            @Override // e23.a
                            public final Object invoke() {
                                int i19 = i16;
                                v0 v0Var2 = v0Var;
                                switch (i19) {
                                    case 0:
                                        Logger logger3 = v0.f178959c;
                                        v0Var2.getView().D1(-2);
                                        break;
                                    default:
                                        Logger logger4 = v0.f178959c;
                                        v0Var2.getView().D1(0);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, fNServerIncorrectResponseException.getFNServerErrorMessage(), R.string.wallet_failed_to_update_user_information);
                    } else {
                        final int i19 = 1;
                        v0Var.getView().o6(new e23.a() { // from class: vn2.u0
                            @Override // e23.a
                            public final Object invoke() {
                                int i110 = i19;
                                v0 v0Var2 = v0Var;
                                switch (i110) {
                                    case 0:
                                        Logger logger3 = v0.f178959c;
                                        v0Var2.getView().D1(-2);
                                        break;
                                    default:
                                        Logger logger4 = v0.f178959c;
                                        v0Var2.getView().D1(0);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, "", R.string.wallet_failed_to_update_user_information);
                    }
                } else {
                    final int i110 = 1;
                    v0Var.getView().o6(new e23.a() { // from class: vn2.u0
                        @Override // e23.a
                        public final Object invoke() {
                            int i111 = i110;
                            v0 v0Var2 = v0Var;
                            switch (i111) {
                                case 0:
                                    Logger logger3 = v0.f178959c;
                                    v0Var2.getView().D1(-2);
                                    break;
                                default:
                                    Logger logger4 = v0.f178959c;
                                    v0Var2.getView().D1(0);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, "", R.string.wallet_failed_to_update_user_information);
                }
                break;
            case 5:
                Logger logger3 = v0.f178959c;
                ((DialogInterface) obj).getClass();
                v0Var.getView().D1(0);
                break;
            case 6:
                pn2.t tVar2 = (pn2.t) obj;
                Logger logger4 = v0.f178959c;
                i1 i1VarF1 = v0Var.f0();
                tVar2.getClass();
                i1VarF1.I0(tVar2);
                v0Var.getView().y7(tVar2);
                v0Var.getView().hideProgressOverlay();
                break;
            default:
                v0.f178959c.error("getUserInfo Failed: ", (Throwable) obj);
                v0Var.getView().D1(0);
                break;
        }
        return Unit.INSTANCE;
    }
}
