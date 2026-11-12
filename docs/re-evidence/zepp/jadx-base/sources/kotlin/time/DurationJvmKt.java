package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class DurationJvmKt {
    private static final boolean a = false;

    @NotNull
    private static final ThreadLocal<DecimalFormat>[] b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        b = threadLocalArr;
    }

    private static final DecimalFormat a(int i) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i > 0) {
            decimalFormat.setMinimumFractionDigits(i);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @NotNull
    public static final String formatToExactDecimals(double d, int i) {
        DecimalFormat decimalFormatA;
        ThreadLocal<DecimalFormat>[] threadLocalArr = b;
        if (i < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i];
            DecimalFormat decimalFormatA2 = threadLocal.get();
            if (decimalFormatA2 == null) {
                decimalFormatA2 = a(i);
                threadLocal.set(decimalFormatA2);
            }
            decimalFormatA = decimalFormatA2;
        } else {
            decimalFormatA = a(i);
        }
        return decimalFormatA.format(d);
    }

    @NotNull
    public static final String formatUpToDecimals(double d, int i) {
        DecimalFormat decimalFormatA = a(0);
        decimalFormatA.setMaximumFractionDigits(i);
        return decimalFormatA.format(d);
    }

    public static final boolean getDurationAssertionsEnabled() {
        return a;
    }
}
