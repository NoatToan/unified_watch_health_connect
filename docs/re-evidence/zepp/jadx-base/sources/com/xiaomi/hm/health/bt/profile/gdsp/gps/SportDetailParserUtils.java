package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes18.dex */
public class SportDetailParserUtils {
    private static final double a = Math.pow(2.0d, 31.0d);
    private static final double b = Math.pow(2.0d, 32.0d);

    public static double convert(long value) {
        double d = value;
        if (d > a) {
            d -= b;
        }
        return new BigDecimal(d / 3000000.0d).setScale(8, 4).doubleValue();
    }
}
