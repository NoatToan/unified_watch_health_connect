package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aej {
    public static /* synthetic */ BigDecimal a(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
