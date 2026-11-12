package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
public final class ui2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f35778a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f35779b = Math.log(10.0d);
    public static final double c = Math.log(2.0d);

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
