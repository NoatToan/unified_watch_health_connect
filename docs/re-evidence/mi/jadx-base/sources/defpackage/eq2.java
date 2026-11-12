package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class eq2 extends wve<Bitmap> {
    @Override // defpackage.wve, defpackage.g3i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i) {
        Bitmap bitmap = (Bitmap) super.get(i);
        if (bitmap == null || !e(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // defpackage.g3i
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int a(Bitmap bitmap) {
        return jq2.e(bitmap);
    }

    public boolean e(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            cm8.I("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        cm8.I("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // defpackage.wve, defpackage.g3i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void put(Bitmap bitmap) {
        if (e(bitmap)) {
            super.put(bitmap);
        }
    }
}
