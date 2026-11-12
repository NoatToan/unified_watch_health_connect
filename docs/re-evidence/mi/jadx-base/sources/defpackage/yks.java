package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class yks implements pws, txs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f40278a;

    public yks(Context context) {
        this.f40278a = context;
    }

    @Override // defpackage.txs
    /* JADX INFO: renamed from: a */
    public boolean mo65a(fys fysVar) {
        return true;
    }

    @Override // defpackage.pws
    public void b(mvs mvsVar) {
        if (mvsVar != null && mvsVar.a() == 0 && "PING".equals(mvsVar.e())) {
            yls.h(this.f40278a);
        } else {
            yls.a(this.f40278a);
        }
    }

    @Override // defpackage.pws
    public void a(fys fysVar) {
        yls.a(this.f40278a);
    }
}
