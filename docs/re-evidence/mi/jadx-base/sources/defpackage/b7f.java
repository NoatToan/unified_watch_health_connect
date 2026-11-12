package defpackage;

import android.content.Intent;
import com.xiaomi.fitness.nfc.issuer.IssuerResult;

/* JADX INFO: loaded from: classes9.dex */
public class b7f extends dld {
    @Override // defpackage.itc
    public boolean a(boolean z) {
        return true;
    }

    @Override // defpackage.itc
    public void b(Intent intent) {
    }

    @Override // defpackage.dld
    public void i() {
        super.i();
    }

    @Override // defpackage.dld
    public void n(boolean z, int i, String str, IssuerResult issuerResult) {
        super.n(z, i, str, issuerResult);
        ltg.c().s(3, z ? 1 : 2);
        if (z) {
            this.f15656a.getHandler().obtainMessage(10, issuerResult).sendToTarget();
        } else {
            this.f15656a.getHandler().obtainMessage(30, issuerResult).sendToTarget();
        }
    }
}
