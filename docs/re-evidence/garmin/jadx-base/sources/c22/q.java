package c22;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23202a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23202a = iArr;
        }
    }

    public static final String a(Bitmap.CompressFormat compressFormat) {
        compressFormat.getClass();
        int i14 = a.f23202a[compressFormat.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? "webp" : "png";
        }
        return "jpg";
    }

    public static final zp0.f b(Bitmap bitmap, int i14, int i15) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i14, i15, false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        bitmapCreateScaledBitmap.compress(compressFormat, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmapCreateScaledBitmap.recycle();
        byteArray.getClass();
        return new zp0.f(byteArray, a(compressFormat));
    }

    public static zp0.f c(Bitmap bitmap, double d14) {
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("resizeToApprox -> sizeInMB[", d14, "] fallbackSize[");
        sbA.append(d14);
        am.j.x(sbA, "] deltaInMB[", 0.0d, "] lossless[");
        int i14 = 0;
        String strK = hb.a.k(sbA, false, "]");
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, strK);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        double d15 = 1024;
        double d16 = d14 * d15 * d15;
        double d17 = 0.0d * d15 * d15;
        byteArrayOutputStream.reset();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "resizeToApprox -> compress byteArrayOutputStream quality 100");
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        double d18 = d17 + d16;
        if (byteArrayOutputStream.size() < d18) {
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "resizeToApprox -> resize complete");
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            return new zp0.f(byteArray, a(compressFormat));
        }
        byteArrayOutputStream.reset();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "resizeToApprox -> compress byteArrayOutputStream quality 50");
        int i15 = 50;
        bitmap.compress(compressFormat, 50, byteArrayOutputStream);
        int i16 = 100;
        int i17 = 0;
        while (i15 > 20 && (i14 = i14 + 1) <= 7) {
            if (byteArrayOutputStream.size() < d16 - d17) {
                i17 = i15;
            } else {
                if (byteArrayOutputStream.size() <= d18) {
                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, "resizeToApprox -> resize complete");
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    byteArray2.getClass();
                    return new zp0.f(byteArray2, a(compressFormat));
                }
                i16 = i15;
            }
            i15 = (i17 + i16) / 2;
            byteArrayOutputStream.reset();
            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
            String strH = am.j.h(i15, "resizeToApprox -> compress byteArrayOutputStream quality ");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var3, strH);
            bitmap.compress(compressFormat, i15, byteArrayOutputStream);
        }
        if (byteArrayOutputStream.size() >= d14 * d15 * d15) {
            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.GENERAL;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var4, "resizeToApprox -> resize NOT possible");
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.GENERAL;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var5, "resizeToApprox -> resize complete");
        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
        byteArray3.getClass();
        return new zp0.f(byteArray3, a(compressFormat));
    }
}
