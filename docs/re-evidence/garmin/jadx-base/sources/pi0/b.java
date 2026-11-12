package pi0;

import java.util.Arrays;
import java.util.Map;
import o13.p;
import p13.s;
import p13.t0;
import p13.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<qi0.b, c> f137834a = t0.b(new p(qi0.b.NUMERICAL_DATE_RELATIVE_24H_AM_PM_TIME, new c(new int[]{131072, 4, 1}, false, 2, null)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f137835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f137836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<qi0.d, c> f137837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f137838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map<qi0.e, c> f137839f;

    static {
        p pVar = new p(qi0.a.NUMERIC_YEAR_MONTH_DAY, new c(new int[]{4, 131072}, false, 2, null));
        p pVar2 = new p(qi0.a.YEAR_ABBREV_MONTH_DAY, new c(new int[]{4, 65536}, false, 2, null));
        p pVar3 = new p(qi0.a.RELATIVE_YEAR_MONTH_NO_DAY, new c(new int[]{32}, false, 2, null));
        p pVar4 = new p(qi0.a.RELATIVE_YEAR_ABBREV_MONTH_NO_DAY, new c(new int[]{32, 65536}, false, 2, null));
        qi0.a aVar = qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY;
        f137835b = u0.e(pVar, pVar2, pVar3, pVar4, new p(aVar, new c(new int[]{65536}, false, 2, null)), new p(qi0.a.RELATIVE_YEAR_MONTH_DAY, new c(null, false, 3, null)), new p(aVar, new c(new int[]{65536}, false, 2, null)), new p(qi0.a.RELATIVE_YEAR_MONTH_DAY_WEEKDAY, new c(new int[]{2}, false, 2, null)), new p(qi0.a.YEAR_MONTH_DAY_WEEKDAY, new c(new int[]{2, 4}, false, 2, null)), new p(qi0.a.YEAR_MONTH_DAY, new c(new int[]{4}, false, 2, null)), new p(qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY_WEEKDAY, new c(new int[]{2, 65536}, false, 2, null)), new p(qi0.a.NO_YEAR_ABBREV_MONTH_DAY, new c(new int[]{65536, 8}, false, 2, null)), new p(qi0.a.NO_YEAR_MONTH_DAY, new c(new int[]{8}, false, 2, null)), new p(qi0.a.WEEKDAY, new c(new int[]{2}, false)), new p(qi0.a.ABBREV_WEEKDAY, new c(new int[]{2, 32768}, false)));
        f137836c = u0.e(new p(qi0.f.RELATIVE_24H_AM_PM_TIME, new c(null, false, 3, null)), new p(qi0.f.HOUR_OF_DAY_24H_AM_PM_TIME, new c(new int[]{16384}, false, 2, null)));
        f137837d = t0.b(new p(qi0.d.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_MONTH_DAY, new c(null, false, 3, null)));
        f137838e = u0.e(new p(qi0.c.NUMERIC_YEAR_MONTH_DAY, new c(new int[]{16, 4, 131072}, false, 2, null)), new p(qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_MONTH_DAY, new c(null, false, 3, null)), new p(qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_DAY, new c(new int[]{65536}, false, 2, null)), new p(qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_NO_DAY, new c(new int[]{65536, 32}, false, 2, null)), new p(qi0.c.NO_YEAR_OVERLAPPING_ABBREV_MONTH_DAY, new c(new int[]{65536, 8}, false, 2, null)), new p(qi0.c.NO_YEAR_MONTH_DAY, new c(new int[]{8}, false, 2, null)));
        f137839f = t0.b(new p(qi0.e.RELATIVE_24H_AM_PM_TIME, new c(null, false, 3, null)));
    }

    public static final int a(c cVar, int... iArr) {
        int[] iArrS;
        if (cVar == null || (iArrS = cVar.f137840a) == null) {
            iArrS = new int[]{0};
        }
        if (cVar != null && cVar.f137841b) {
            iArrS = s.s(iArrS, iArr);
        }
        int i14 = 0;
        for (int i15 : Arrays.copyOf(iArrS, iArrS.length)) {
            i14 |= i15;
        }
        return i14;
    }
}
