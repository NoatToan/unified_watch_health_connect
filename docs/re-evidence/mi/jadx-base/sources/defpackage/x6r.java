package defpackage;

import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.wear.api.WearAuthV2;

/* JADX INFO: loaded from: classes2.dex */
public class x6r extends WearAuthV2 {

    public class a implements o43 {
        public a() {
        }

        @Override // defpackage.o43
        public void onBondFailure(int i) {
            CoreExtKt.logger.i("WearAuthBLE", "onBondFailure() called with: status = [" + i + "]");
            x6r.this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "bond failed");
        }

        @Override // defpackage.o43
        public void onBondSuccess() {
            CoreExtKt.logger.i("WearAuthBLE", "onBondSuccess() called");
            x6r.this.l();
        }
    }

    public class b implements ht2<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f38766a;

        public b(long j) {
            this.f38766a = j;
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r6) {
            if (x6r.this.b()) {
                return;
            }
            CoreExtKt.logger.i("WearAuthBLE", "enableNotification success cost = " + ((System.currentTimeMillis() - this.f38766a) / 1000.0f));
            x6r.this.i();
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            if (x6r.this.b()) {
                return;
            }
            CoreExtKt.logger.i("WearAuthBLE", "enableNotification fail");
            x6r.this.g.b(2003, "enable notifications failed");
        }
    }

    public x6r(String str, byte[] bArr, String str2, String str3, boolean z, lq2 lq2Var, int i) {
        super(str, bArr, str2, str3, z, lq2Var, i);
    }

    @Override // com.xiaomi.wearable.wear.api.WearAuthV2, defpackage.w6r
    public void c(me4 me4Var) {
        super.c(me4Var);
        if (this.d) {
            ((lq2) this.c).e(new a());
        } else {
            l();
        }
    }

    public final void l() {
        CoreExtKt.logger.i("WearAuthBLE", "start auth enableNotification");
        ((lq2) this.c).f(new b(System.currentTimeMillis()));
    }
}
