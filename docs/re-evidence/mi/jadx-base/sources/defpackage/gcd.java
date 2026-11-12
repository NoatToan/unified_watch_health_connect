package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class gcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f18830a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f18831b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    public static final int[] d = {1, 1, 2, 6, 24, 120, HMSedentaryConfig.INGORE_START_INDEX, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    public static int[] e = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, SportReportBaseParser.ReportType.divingOTU, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int a(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        o8f.b(j == ((long) i3), "checkedAdd", i, i2);
        return i3;
    }

    public static int b(int i, int i2) {
        return ahd.j(((long) i) + ((long) i2));
    }
}
