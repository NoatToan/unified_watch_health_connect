package com.xiaomi.eco.api;

import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.ht2;
import defpackage.mj7;
import defpackage.qd7;
import defpackage.qj7;
import defpackage.r90;
import defpackage.u7r;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends qd7 {

    public class a implements mj7 {

        /* JADX INFO: renamed from: com.xiaomi.eco.api.c$a$a, reason: collision with other inner class name */
        public class C0354a implements ht2<Void> {
            public C0354a() {
            }

            @Override // defpackage.ht2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(Void r2) {
                Logger.i("WearAuth", "enableNotifications success ");
                if (c.this.c()) {
                    return;
                }
                c.this.h();
            }

            @Override // defpackage.ht2
            public void onFailed(int i) {
                Logger.i("WearAuth", "enableNotifications fail");
                if (c.this.c()) {
                    return;
                }
                c.this.e.b(2003, "enable notifications failed");
            }
        }

        public a() {
        }

        @Override // defpackage.mj7
        public void onBondFailure(int i) {
            Logger.d("WearAuth", "onBondFailure() called with: status = [" + i + "]");
            if (c.this.c()) {
                return;
            }
            c.this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "bond failed");
        }

        @Override // defpackage.mj7
        public void onBondSuccess() {
            Logger.d("WearAuth", "onBondSuccess() called");
            if (c.this.c()) {
                return;
            }
            Logger.i("WearAuth", "enableNotifications() called");
            ((i) c.this.c).E5(new C0354a());
        }
    }

    public c(String str, byte[] bArr, i iVar) {
        super(str, bArr, iVar);
    }

    @Override // defpackage.qd7
    public void d(qj7 qj7Var) {
        super.d(qj7Var);
        Logger.i("WearAuth", "start() called createBond");
        ((i) this.c).C5(new a());
    }

    public final /* synthetic */ void g(EcoApiResult ecoApiResult) {
        if (!ecoApiResult.f()) {
            this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "verify apiCode: " + ecoApiResult.a());
            return;
        }
        if (!ecoApiResult.e().o().D()) {
            if (!ecoApiResult.e().o().z()) {
                this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "verify failed");
                return;
            } else {
                ((i) this.c).d6();
                this.e.b(2004, "device ready");
                return;
            }
        }
        int iT = ecoApiResult.e().o().t();
        if (iT == 4) {
            this.e.b(CommonConstants.Mgc.RECHARGE_NOT_EXIST, "device not bound");
            return;
        }
        this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "verify errorCode: " + iT);
    }

    public final void h() {
        Logger.d("WearAuth", "start verify() called");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 5;
        r90 r90Var = new r90();
        r90Var.Z(this.f31404a);
        u7rVar.z(r90Var);
        this.f = this.c.callTimeout(u7rVar, true, new p.a() { // from class: sd7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f33525a.g(ecoApiResult);
            }
        }, 15000);
    }
}
