package com.xiaomi.wearable.wear.api;

import android.os.RemoteException;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.WearApiResult;
import defpackage.dsf;
import defpackage.ht2;
import defpackage.lq2;
import defpackage.me4;
import defpackage.o43;
import defpackage.pm5;
import defpackage.q90;
import defpackage.t7r;
import defpackage.w6r;

/* JADX INFO: loaded from: classes2.dex */
public final class WearAuthV1 extends w6r {

    public class a implements o43 {

        /* JADX INFO: renamed from: com.xiaomi.wearable.wear.api.WearAuthV1$a$a, reason: collision with other inner class name */
        public class C0897a implements ht2<Void> {
            public C0897a() {
            }

            @Override // defpackage.ht2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(Void r3) {
                CoreExtKt.logger.i("WearAuth", "enableNotifications success ");
                if (WearAuthV1.this.b()) {
                    return;
                }
                WearAuthV1.this.e();
            }

            @Override // defpackage.ht2
            public void onFailed(int i) {
                CoreExtKt.logger.i("WearAuth", "enableNotifications fail");
                if (WearAuthV1.this.b()) {
                    return;
                }
                WearAuthV1.this.g.b(2003, "enable notifications failed");
            }
        }

        public a() {
        }

        @Override // defpackage.o43
        public void onBondFailure(int i) {
            CoreExtKt.logger.d("WearAuth", "onBondFailure() called with: status = [" + i + "]");
            if (WearAuthV1.this.b()) {
                return;
            }
            WearAuthV1.this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "bond failed");
        }

        @Override // defpackage.o43
        public void onBondSuccess() {
            CoreExtKt.logger.d("WearAuth", "onBondSuccess() called");
            if (WearAuthV1.this.b()) {
                return;
            }
            CoreExtKt.logger.i("WearAuth", "enableNotifications() called");
            ((lq2) WearAuthV1.this.c).f(new C0897a());
        }
    }

    public WearAuthV1(String str, byte[] bArr, lq2 lq2Var, int i) {
        super(str, bArr, true, lq2Var, i, null);
    }

    @Override // defpackage.w6r
    public void c(me4 me4Var) {
        super.c(me4Var);
        CoreExtKt.logger.i("WearAuth", "start() called createBond");
        ((lq2) this.c).e(new a());
    }

    public final void e() {
        CoreExtKt.logger.d("WearAuth", "start verify() called");
        t7r t7rVar = new t7r();
        t7rVar.e = 1;
        t7rVar.f = 5;
        q90 q90Var = new q90();
        q90Var.y(this.f37671a);
        t7rVar.s(q90Var);
        this.c.call(101, dsf.i(t7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.wearable.wear.api.WearAuthV1.2
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) throws RemoteException {
                if (!wearApiResult.d()) {
                    WearAuthV1.this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "verify apiCode: " + wearApiResult.a());
                    return;
                }
                t7r t7rVarA = pm5.a(wearApiResult.c());
                if (!t7rVarA.o().u()) {
                    if (!t7rVarA.o().r()) {
                        WearAuthV1.this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "verify failed");
                        return;
                    } else {
                        ((lq2) WearAuthV1.this.c).l();
                        WearAuthV1.this.g.b(2004, "device ready");
                        return;
                    }
                }
                int iQ = t7rVarA.o().q();
                if (iQ == 4) {
                    WearAuthV1.this.g.b(CommonConstants.Mgc.RECHARGE_NOT_EXIST, "device not bound");
                    return;
                }
                WearAuthV1.this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "verify errorCode: " + iQ);
            }
        }, 15000);
    }
}
