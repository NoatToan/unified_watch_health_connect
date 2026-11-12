package defpackage;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Objects;

/* JADX INFO: loaded from: classes46.dex */
public final class yyk {
    public static long b(Duration duration, Duration duration2) {
        Objects.requireNonNull(duration2, "divisor");
        return a(duration).divideToIntegralValue(a(duration2)).longValueExact();
    }

    private static BigDecimal a(Duration duration) {
        return BigDecimal.valueOf(duration.getSeconds()).add(BigDecimal.valueOf(duration.getNano(), 9));
    }
}
