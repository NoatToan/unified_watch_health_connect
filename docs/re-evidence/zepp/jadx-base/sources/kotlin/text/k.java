package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class k extends j {
    private static final <T> T c0(String str, Function1<? super String, ? extends T> function1) {
        try {
            if (d.b.matches(str)) {
                return function1.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal d0(String str) {
        return new BigDecimal(str);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal e0(String str, MathContext mathContext) {
        return new BigDecimal(str, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger f0(String str) {
        return new BigInteger(str);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger g0(String str, int i) {
        return new BigInteger(str, a.checkRadix(i));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "toBooleanNullable")
    private static final boolean i0(String str) {
        return Boolean.parseBoolean(str);
    }

    @InlineOnly
    private static final byte j0(String str) {
        return Byte.parseByte(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte k0(String str, int i) {
        return Byte.parseByte(str, a.checkRadix(i));
    }

    @InlineOnly
    private static final double l0(String str) {
        return Double.parseDouble(str);
    }

    @InlineOnly
    private static final float m0(String str) {
        return Float.parseFloat(str);
    }

    @InlineOnly
    private static final int n0(String str) {
        return Integer.parseInt(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int o0(String str, int i) {
        return Integer.parseInt(str, a.checkRadix(i));
    }

    @InlineOnly
    private static final long p0(String str) {
        return Long.parseLong(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long q0(String str, int i) {
        return Long.parseLong(str, a.checkRadix(i));
    }

    @InlineOnly
    private static final short r0(String str) {
        return Short.parseShort(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short s0(String str, int i) {
        return Short.parseShort(str, a.checkRadix(i));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String t0(byte b, int i) {
        return Integer.toString(b, a.checkRadix(a.checkRadix(i)));
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal toBigDecimalOrNull(@NotNull String str) {
        try {
            if (d.b.matches(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull String str) {
        return toBigIntegerOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Double toDoubleOrNull(@NotNull String str) {
        try {
            if (d.b.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Float toFloatOrNull(@NotNull String str) {
        try {
            if (d.b.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String u0(int i, int i2) {
        return Integer.toString(i, a.checkRadix(i2));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String v0(long j, int i) {
        return Long.toString(j, a.checkRadix(i));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String w0(short s, int i) {
        return Integer.toString(s, a.checkRadix(a.checkRadix(i)));
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull String str, int i) {
        a.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            int i2 = str.charAt(0) == '-' ? 1 : 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (a.digitOf(str.charAt(i2), i) < 0) {
                    return null;
                }
                i2 = i3;
            }
        } else if (a.digitOf(str.charAt(0), i) < 0) {
            return null;
        }
        return new BigInteger(str, a.checkRadix(i));
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal toBigDecimalOrNull(@NotNull String str, @NotNull MathContext mathContext) {
        try {
            if (d.b.matches(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
