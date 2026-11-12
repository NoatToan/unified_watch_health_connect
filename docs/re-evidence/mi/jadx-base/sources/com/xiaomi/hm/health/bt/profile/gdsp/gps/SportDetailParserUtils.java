package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes11.dex */
public class SportDetailParserUtils {
    private static final double MAX_X = Math.pow(2.0d, 31.0d);
    private static final double MAX_Y = Math.pow(2.0d, 32.0d);

    public static double convert(long j) {
        double d = j;
        if (d > MAX_X) {
            d -= MAX_Y;
        }
        return new BigDecimal(d / 3000000.0d).setScale(8, 4).doubleValue();
    }
}
