package o4;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final Bitmap a(v0 v0Var) {
        if (v0Var instanceof f) {
            return ((f) v0Var).f128848b;
        }
        org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final Bitmap.Config b(int i14) {
        w0.a aVar = w0.f129024b;
        aVar.getClass();
        if (i14 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        aVar.getClass();
        if (i14 == w0.f129025c) {
            return Bitmap.Config.ALPHA_8;
        }
        aVar.getClass();
        if (i14 == w0.f129026d) {
            return Bitmap.Config.RGB_565;
        }
        aVar.getClass();
        if (i14 == w0.f129027e) {
            return Bitmap.Config.RGBA_F16;
        }
        aVar.getClass();
        return i14 == w0.f129028f ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
