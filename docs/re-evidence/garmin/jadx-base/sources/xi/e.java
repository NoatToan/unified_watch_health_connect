package xi;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public class e implements d {
    @Override // xi.d
    public final void a() {
    }

    @Override // xi.d
    public final void b(int i14) {
    }

    @Override // xi.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // xi.d
    public final Bitmap d(int i14, int i15, Bitmap.Config config) {
        return Bitmap.createBitmap(i14, i15, config);
    }

    @Override // xi.d
    public final Bitmap e(int i14, int i15, Bitmap.Config config) {
        return Bitmap.createBitmap(i14, i15, config);
    }
}
