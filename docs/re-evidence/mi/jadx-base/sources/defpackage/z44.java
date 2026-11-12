package defpackage;

import android.graphics.Color;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.collection.ScatterMapKt;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z44 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<double[]> f40861a = new ThreadLocal<>();

    @RequiresApi(26)
    public static class a {
        public static Color a(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float fAlpha = color.alpha();
            float fAlpha2 = color2.alpha() * (1.0f - fAlpha);
            int componentCount = color2.getComponentCount() - 1;
            float f = fAlpha + fAlpha2;
            components2[componentCount] = f;
            if (f > 0.0f) {
                fAlpha /= f;
                fAlpha2 /= f;
            }
            for (int i = 0; i < componentCount; i++) {
                components2[i] = (components[i] * fAlpha) + (components2[i] * fAlpha2);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    public static void a(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i2, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i3, float[] fArr) {
        float f;
        float fAbs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else {
                f = fMax == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            }
            fAbs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = m(f7, 0.0f, 360.0f);
        fArr[1] = m(fAbs, 0.0f, 1.0f);
        fArr[2] = m(f6, 0.0f, 1.0f);
    }

    public static void b(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i2, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i3, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) i) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) i2) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) i3) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static int c(@FloatRange(from = 0.0d, to = 95.047d) double d, @FloatRange(from = 0.0d, to = 100.0d) double d2, @FloatRange(from = 0.0d, to = 108.883d) double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(n((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), n((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), n((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    public static double d(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = j(i, i2);
        }
        double dE = e(i) + 0.05d;
        double dE2 = e(i2) + 0.05d;
        return Math.max(dE, dE2) / Math.min(dE, dE2);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static double e(int i) {
        double[] dArrO = o();
        h(i, dArrO);
        return dArrO[1] / 100.0d;
    }

    public static int f(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        double d = f;
        if (d(p(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (d(p(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    public static void g(int i, float[] fArr) {
        a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static void h(int i, double[] dArr) {
        b(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static int i(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    public static int j(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = i(iAlpha2, iAlpha);
        return Color.argb(i3, l(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), l(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), l(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    @RequiresApi(26)
    public static Color k(Color color, Color color2) {
        return a.a(color, color2);
    }

    public static int l(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    public static float m(float f, float f2, float f3) {
        return f < f2 ? f2 : Math.min(f, f3);
    }

    public static int n(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    public static double[] o() {
        ThreadLocal<double[]> threadLocal = f40861a;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int p(int i, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
