package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes13.dex */
public class owu {
    private static boolean a(short s) {
        return s >= 90 && s < 120;
    }

    private static float b(short s) {
        if (s == Short.MIN_VALUE) {
            return Float.MIN_VALUE;
        }
        if (s < 90) {
            return (s * 10.0f) / 90.0f;
        }
        if (s < 120) {
            return (((s - 90) * 10.0f) / 30.0f) + 10.0f;
        }
        if (s < 140) {
            return (((s - 120) * 10.0f) / 20.0f) + 20.0f;
        }
        if (s < 160) {
            return (((s - 140) * 10.0f) / 20.0f) + 30.0f;
        }
        if (s < 180) {
            return (((s - 160) * 10.0f) / 20.0f) + 40.0f;
        }
        if (s < 200) {
            return (((s - 180) * 10.0f) / 20.0f) + 50.0f;
        }
        return 60.0f;
    }

    private static float c(short s) {
        if (s == Short.MIN_VALUE) {
            return Float.MIN_VALUE;
        }
        if (s < 60) {
            return (s * 10.0f) / 60.0f;
        }
        if (s < 80) {
            return (((s - 60) * 10.0f) / 20.0f) + 10.0f;
        }
        if (s < 90) {
            return (((s - 80) * 10.0f) / 10.0f) + 20.0f;
        }
        if (s < 100) {
            return (((s - 90) * 10.0f) / 10.0f) + 30.0f;
        }
        if (s < 110) {
            return (s - 100.0f) + 40.0f;
        }
        if (s < 120) {
            return (((s - 110) * 10.0f) / 10.0f) + 50.0f;
        }
        return 60.0f;
    }

    private static boolean e(short s) {
        return s >= 60 && s < 80;
    }

    public static int d(short s, short s2) {
        return a(e(s, s2));
    }

    public static int a(float f) {
        if (Math.abs(f - Float.MIN_VALUE) < 1.0E-6d) {
            return -32768;
        }
        if (f < c(0)) {
            return 0;
        }
        if (f < c(1)) {
            return 1;
        }
        if (f < c(2)) {
            return 2;
        }
        if (f < c(3)) {
            return 3;
        }
        return f < c(4) ? 4 : 5;
    }

    public static float c(int i) {
        float fFloatValue = new BigDecimal((i + 1) * 10.0f).setScale(2, 4).floatValue();
        if (i == -32768) {
            return Float.MIN_VALUE;
        }
        return fFloatValue;
    }

    public static float e(short s, short s2) {
        float fC;
        if (s == Short.MIN_VALUE || s2 == Short.MIN_VALUE) {
            return Float.MIN_VALUE;
        }
        if (e(s2)) {
            fC = b(s);
        } else if (a(s)) {
            fC = c(s2);
        } else if (s2 >= 80 && s >= 120) {
            fC = b(s) > c(s2) ? b(s) : c(s2);
        } else {
            fC = (s2 >= 60 || s >= 90 || b(s) >= c(s2)) ? c(s2) : b(s);
        }
        return new BigDecimal(fC).setScale(2, 4).floatValue();
    }
}
