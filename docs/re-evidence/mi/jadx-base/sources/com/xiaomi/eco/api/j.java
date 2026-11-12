package com.xiaomi.eco.api;

import com.xiaomi.fitness.common.log.Logger;
import defpackage.ch7;
import defpackage.ht2;
import defpackage.mj7;

/* JADX INFO: loaded from: classes7.dex */
public class j extends EcoBinderV1 {

    public class a implements mj7 {

        /* JADX INFO: renamed from: com.xiaomi.eco.api.j$a$a, reason: collision with other inner class name */
        public class C0355a implements ht2<Void> {
            public C0355a() {
            }

            @Override // defpackage.ht2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(Void r1) {
                if (j.this.isCancelled()) {
                    return;
                }
                j.this.getBindStatus();
            }

            @Override // defpackage.ht2
            public void onFailed(int i) {
                if (j.this.isCancelled()) {
                    return;
                }
                j.this.mCallback.onBindFailure(1001, "enable notifications failed,code:" + i);
            }
        }

        public a() {
        }

        @Override // defpackage.mj7
        public void onBondFailure(int i) {
            if (j.this.isCancelled()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onBondFailure() called with: status = [");
            sb.append(i);
            sb.append("]");
            j.this.mCallback.onBondFailure(i);
        }

        @Override // defpackage.mj7
        public void onBondSuccess() {
            if (j.this.isCancelled()) {
                return;
            }
            Logger.i("EcoBleBinderV1", "onBondSuccess: ");
            j.this.mCallback.onBondSuccess();
            ((i) j.this.mApiCall).E5(new C0355a());
        }
    }

    public j(String str, i iVar) {
        super(str, null, iVar);
    }

    @Override // com.xiaomi.eco.api.e
    public final void start(ch7 ch7Var) {
        super.start(ch7Var);
        Logger.i("EcoBleBinderV1", "start createBond");
        ((i) this.mApiCall).C5(new a());
    }
}
