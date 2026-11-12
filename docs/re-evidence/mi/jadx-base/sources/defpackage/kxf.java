package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.fitness.nfc.issuer.IssuerResult;

/* JADX INFO: loaded from: classes9.dex */
public class kxf extends dld {
    public kxf(Bundle bundle) {
        this.g = bundle;
    }

    @Override // defpackage.itc
    public boolean a(boolean z) {
        return true;
    }

    @Override // defpackage.itc
    public void b(Intent intent) {
    }

    @Override // defpackage.dld
    public void i() {
        if (this.f15657b != null) {
            ltg.c().t(0, 0, this.f15657b);
        }
        super.i();
    }

    @Override // defpackage.dld
    public void n(boolean z, int i, String str, IssuerResult issuerResult) {
        super.n(z, i, str, issuerResult);
        if (z) {
            ltg.c().s(0, 1);
            this.f15656a.getHandler().sendEmptyMessage(4);
            return;
        }
        if (this.f15656a.getActivity() == null) {
            return;
        }
        String strB = fmg.b(i);
        if (lxf.d(this.f15657b) && i == 1010012) {
            strB = this.f15656a.getString(o0j.h5);
        }
        Integer numValueOf = Integer.valueOf(i);
        if (!TextUtils.isEmpty(strB)) {
            str = strB;
        }
        this.f15656a.getHandler().obtainMessage(5, new Pair(numValueOf, str)).sendToTarget();
    }
}
