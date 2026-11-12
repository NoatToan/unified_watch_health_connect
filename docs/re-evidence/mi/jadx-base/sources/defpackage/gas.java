package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;

/* JADX INFO: loaded from: classes2.dex */
public class gas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ddm f18793a;

    public static Bitmap a(byte[] bArr, int i, int i2, int i3, Bitmap bitmap, Bitmap bitmap2, boolean z) {
        Bitmap bitmapD = null;
        if (bitmap != null && bitmap2 != null) {
            Bitmap bitmapC = c(bitmap2, i, i2, i3);
            if (bitmapC == null) {
                return null;
            }
            bitmapD = afs.d(bitmap, bitmapC, 0, 0);
            if (z) {
                f18793a.onResponseCustomDialEffectImg(bitmapD);
            }
        }
        return bitmapD;
    }

    public static Bitmap c(Bitmap bitmap, int i, int i2, int i3) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        for (int i4 = 0; i4 < height; i4++) {
            for (int i5 = 0; i5 < width; i5++) {
                bitmapCreateBitmap.setPixel(i5, i4, Color.argb(Color.alpha(bitmap.getPixel(i5, i4)), i, i2, i3));
            }
        }
        return bitmapCreateBitmap;
    }

    public byte[] b(boolean z, byte[] bArr, int i, int i2, int i3, Bitmap bitmap, Bitmap bitmap2) {
        byte[] bArrA = null;
        if (bitmap != null && bitmap2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("source_data = ");
            sb.append(bArr.length);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getNewCustomClockDialData source_data len = ");
            sb2.append(bArr.length);
            int i4 = i;
            int i5 = i2;
            if (i4 < 8) {
                i4 = 8;
            }
            int i6 = i3;
            if (i5 < 8) {
                i5 = 8;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            int i7 = bArr[0] & 255;
            dss dssVar = new dss(bArr);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("getNewCustomClockDialData mHandleCustomClockDialModle len = ");
            sb3.append(dssVar.toString());
            bArrA = i7 == 1 ? wus.a(z, bArr, i4, i5, i6, bitmap, bitmap2) : null;
            f18793a.onResponseCustomDialData(bArrA);
        }
        return bArrA;
    }
}
