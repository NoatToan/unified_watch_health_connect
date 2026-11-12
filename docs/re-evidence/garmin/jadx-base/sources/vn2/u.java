package vn2;

import com.garmin.feature.garminpay.providers.felica.exception.DeviceNotConnectedException;
import java.util.concurrent.Callable;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class u implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f178954b;

    public /* synthetic */ u(b0 b0Var, int i14) {
        this.f178953a = i14;
        this.f178954b = b0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws DeviceNotConnectedException {
        int i14 = this.f178953a;
        b0 b0Var = this.f178954b;
        switch (i14) {
            case 0:
                Logger logger = b0.f178864c;
                if (b0Var.f0().c()) {
                    return b0Var.f0().W().c(b0Var.f0().P());
                }
                throw new DeviceNotConnectedException("Device is not connected.");
            case 1:
                b0.f178864c.trace("precheckForRemoveCard()");
                if (!b0Var.f0().c()) {
                    throw new DeviceNotConnectedException("Device is not connected.");
                }
                e13.c cVarC = b0Var.f0().e(tn2.f0.a.REFUND).c(b0Var.f0().E0());
                y yVar = new y(new t(b0Var, 18), 2);
                int i15 = w03.b.f181178a;
                return new e13.j(cVarC, yVar);
            case 2:
                b0.f178864c.trace("refundForErrorHandling()");
                if (!b0Var.f0().c()) {
                    throw new DeviceNotConnectedException("Device is not connected.");
                }
                q03.r<Boolean> rVarE0 = b0Var.f0().E0();
                y yVar2 = new y(new t(b0Var, 24), 7);
                rVarE0.getClass();
                int i16 = w03.b.f181178a;
                return new e13.k(rVarE0, yVar2);
            default:
                b0.f178864c.trace("deleteCardForErrorHandling()");
                if (!b0Var.f0().c()) {
                    throw new DeviceNotConnectedException("Device is not connected.");
                }
                q03.r<Boolean> rVarE1 = b0Var.f0().E0();
                y yVar3 = new y(new t(b0Var, 21), 6);
                rVarE1.getClass();
                int i17 = w03.b.f181178a;
                return new e13.k(rVarE1, yVar3);
        }
    }
}
