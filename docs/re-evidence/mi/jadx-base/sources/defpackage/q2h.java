package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
public final class q2h {
    public static float a(Number number, int i) {
        return b(String.valueOf(number), i);
    }

    public static float b(String str, int i) {
        try {
            return new BigDecimal(str).setScale(i, 4).floatValue();
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public static short c(byte b2) {
        return (short) (b2 & 255);
    }
}
