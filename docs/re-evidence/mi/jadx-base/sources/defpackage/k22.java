package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k22 extends n62<w14<u14>> {
    public abstract void onNewResultImpl(Bitmap bitmap);

    @Override // defpackage.n62
    public void onNewResultImpl(cp5<w14<u14>> cp5Var) {
        if (cp5Var.a()) {
            w14<u14> result = cp5Var.getResult();
            try {
                onNewResultImpl((result == null || !(result.n() instanceof t14)) ? null : ((t14) result.n()).d());
            } finally {
                w14.l(result);
            }
        }
    }
}
