package defpackage;

import android.content.Intent;
import android.util.Pair;
import com.xiaomi.fitness.nfc.issuer.IssuerResult;

/* JADX INFO: loaded from: classes9.dex */
public class sdi extends dld {
    @Override // defpackage.itc
    public boolean a(boolean z) {
        return true;
    }

    @Override // defpackage.itc
    public void b(Intent intent) {
    }

    @Override // defpackage.dld
    public void i() {
        ltg.c().t(8, 0, this.f15657b);
        super.i();
    }

    @Override // defpackage.dld
    public void n(boolean z, int i, String str, IssuerResult issuerResult) {
        super.n(z, i, str, issuerResult);
        ltg.c().s(8, z ? 1 : 2);
        if (z) {
            this.f15656a.getHandler().sendEmptyMessage(50);
        } else {
            this.f15656a.getHandler().obtainMessage(80, new Pair(Integer.valueOf(i), str)).sendToTarget();
        }
    }
}
