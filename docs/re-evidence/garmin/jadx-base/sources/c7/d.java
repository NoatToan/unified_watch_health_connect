package c7;

import android.graphics.Color;
import com.google.android.flexbox.FlexItem;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<double[]> f25188a = new ThreadLocal<>();

    private d() {
    }

    public static int a(double d14, double d15, double d16) {
        double d17 = (((-0.4986d) * d16) + (((-1.5372d) * d15) + (3.2406d * d14))) / 100.0d;
        double d18 = ((0.0415d * d16) + ((1.8758d * d15) + ((-0.9689d) * d14))) / 100.0d;
        double d19 = ((1.057d * d16) + (((-0.204d) * d15) + (0.0557d * d14))) / 100.0d;
        double dPow = d17 > 0.0031308d ? (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d : d17 * 12.92d;
        double dPow2 = d18 > 0.0031308d ? (Math.pow(d18, 0.4166666666666667d) * 1.055d) - 0.055d : d18 * 12.92d;
        double dPow3 = d19 > 0.0031308d ? (Math.pow(d19, 0.4166666666666667d) * 1.055d) - 0.055d : d19 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static int b(int i14, int i15, float f14) {
        float f15 = 1.0f - f14;
        return Color.argb((int) ((Color.alpha(i15) * f14) + (Color.alpha(i14) * f15)), (int) ((Color.red(i15) * f14) + (Color.red(i14) * f15)), (int) ((Color.green(i15) * f14) + (Color.green(i14) * f15)), (int) ((Color.blue(i15) * f14) + (Color.blue(i14) * f15)));
    }

    public static int c(int i14, int i15) {
        int iAlpha = Color.alpha(i15);
        int iAlpha2 = Color.alpha(i14);
        int i16 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i16, d(Color.red(i14), iAlpha2, Color.red(i15), iAlpha, i16), d(Color.green(i14), iAlpha2, Color.green(i15), iAlpha, i16), d(Color.blue(i14), iAlpha2, Color.blue(i15), iAlpha, i16));
    }

    public static int d(int i14, int i15, int i16, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        return b71.i.b(255, i15, i16 * i17, (i14 * 255) * i15) / (i18 * 255);
    }

    public static int e(int i14, int i15) {
        if (i15 >= 0 && i15 <= 255) {
            return (i14 & FlexItem.MAX_SIZE) | (i15 << 24);
        }
        vb.h.s("alpha must be between 0 and 255.");
        return 0;
    }
}
