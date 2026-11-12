package vn2;

import com.garmin.android.apps.connectmobile.R;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class x implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f178966b;

    public /* synthetic */ x(b0 b0Var, int i14) {
        this.f178965a = i14;
        this.f178966b = b0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f178965a;
        b0 b0Var = this.f178966b;
        switch (i14) {
            case 0:
                Logger logger = b0.f178864c;
                u uVar = new u(b0Var, 3);
                int i15 = w03.b.f181178a;
                return new z03.d(uVar);
            case 1:
                Logger logger2 = b0.f178864c;
                b0Var.getView().i();
                b0Var.getView().e();
                b0Var.getView().V7(wr2.q.b.REMOVED_COMPLETELY, b0Var.f0().getDeviceUnitId(), p13.w.c(b0Var.f0().getDeviceName()));
                return Unit.INSTANCE;
            case 2:
                Logger logger3 = b0.f178864c;
                b0Var.getView().i();
                b0Var.getView().e();
                b0Var.getView().C3(R.string.wallet_card_removed, w5.r.v(R.string.wallet_suica_message_error_contact_support_center_to_refund, "0492679114"), "0492679114", R.string.lbl_ok, new t(b0Var, 11));
                return Unit.INSTANCE;
            case 3:
                Logger logger4 = b0.f178864c;
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 4:
                Logger logger5 = b0.f178864c;
                b0Var.getView().c();
                return Unit.INSTANCE;
            case 5:
                Logger logger6 = b0.f178864c;
                b0Var.getView().c();
                return Unit.INSTANCE;
            default:
                Logger logger7 = b0.f178864c;
                b0Var.getView().i();
                b0Var.getView().e();
                b0Var.getView().c();
                return Unit.INSTANCE;
        }
    }
}
