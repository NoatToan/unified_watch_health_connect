package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f0i {
    public w14<Bitmap> a(int i, int i2) {
        return b(i, i2, Bitmap.Config.ARGB_8888);
    }

    public w14<Bitmap> b(int i, int i2, Bitmap.Config config) {
        return c(i, i2, config, null);
    }

    public w14<Bitmap> c(int i, int i2, Bitmap.Config config, Object obj) {
        return d(i, i2, config);
    }

    public abstract w14<Bitmap> d(int i, int i2, Bitmap.Config config);
}
