package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class vks implements pws, txs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f36989a;

    public vks(Context context) {
        this.f36989a = context;
    }

    @Override // defpackage.txs
    /* JADX INFO: renamed from: a */
    public boolean mo65a(fys fysVar) {
        return true;
    }

    @Override // defpackage.pws
    public void b(mvs mvsVar) {
        if (mvsVar != null && mvsVar.a() == 0 && "PING".equals(mvsVar.e())) {
            yls.i(this.f36989a);
        } else {
            yls.e(this.f36989a);
        }
    }

    @Override // defpackage.pws
    public void a(fys fysVar) {
        yls.e(this.f36989a);
    }
}
