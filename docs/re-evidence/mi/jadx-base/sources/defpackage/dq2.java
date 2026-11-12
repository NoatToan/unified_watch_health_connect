package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class dq2 implements cq2 {
    @Override // defpackage.cq2
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.cq2
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.cq2
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        return b(i, i2, config);
    }

    @Override // defpackage.cq2
    public void clearMemory() {
    }

    @Override // defpackage.cq2
    public void trimMemory(int i) {
    }
}
