package c22;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes10.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b71.i f23256a = new b71.i(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f23257b = new t(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f23258c = new t(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f23259d = new t(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f23260e = new t(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f23261f = new t(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f23262g = new t(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f23263h = new t(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f23264i = new t(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t f23265j = new t(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t f23266k = new t(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t f23267l = new t(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t f23268m = new t(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t f23269n = new t(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t f23270o = new t(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t f23271p = new t(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t f23272q = new t(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t f23273r = new t(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t f23274s = new t(17);

    public static double[] a(double d14, double d15) {
        int iMax;
        if (d14 < -20.0d || d15 > 20.0d || d14 >= d15 || (iMax = (int) Math.max(Math.abs(d14), Math.abs(d15))) <= 0) {
            return null;
        }
        if (iMax >= 15) {
            return new double[]{-20.0d, -10.0d, 0.0d, 10.0d, 20.0d};
        }
        if (iMax >= 10) {
            return new double[]{-15.0d, -10.0d, 0.0d, 10.0d, 15.0d};
        }
        if (iMax >= 5) {
            return new double[]{-10.0d, -5.0d, 0.0d, 5.0d, 10.0d};
        }
        return iMax >= 3 ? new double[]{-5.0d, -3.0d, 0.0d, 3.0d, 5.0d} : new double[]{-2.0d, -1.0d, 0.0d, 1.0d, 2.0d};
    }

    public static Integer b(String str) {
        if (str != null) {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length == 3) {
                return Integer.valueOf(Integer.valueOf(strArrSplit[2]).intValue() + (Integer.valueOf(strArrSplit[0]).intValue() * DateTimeConstants.SECONDS_PER_HOUR) + (Integer.valueOf(strArrSplit[1]).intValue() * 60));
            }
            if (strArrSplit.length == 2) {
                return Integer.valueOf(Integer.valueOf(strArrSplit[1]).intValue() + (Integer.valueOf(strArrSplit[0]).intValue() * 60));
            }
        }
        return null;
    }

    public static Double c(HashMap<Double, Double> map, double d14) {
        int iAbs = -1;
        boolean z14 = false;
        boolean z15 = false;
        Double d15 = null;
        while (!z14) {
            d15 = map.get(Double.valueOf(((double) iAbs) + d14));
            if (d15 != null) {
                z14 = true;
            } else if (z15) {
                iAbs = (iAbs - (iAbs * 2)) - 1;
                z15 = false;
            } else {
                iAbs = (Math.abs(iAbs) * 2) + iAbs;
                z15 = true;
            }
            if (iAbs < -500 || iAbs > 500) {
                break;
            }
        }
        if (d15 == null) {
            return null;
        }
        return d15;
    }

    public static String d(float f14, Context context) {
        if (Float.isNaN(f14) || f14 < 0.0f) {
            return context.getString(R.string.no_value);
        }
        int i14 = (int) f14;
        return context.getString(R.string.stress_level_format, Integer.valueOf(i14), context.getString(jg.b.C(Integer.valueOf(i14))));
    }

    public static int e(long j8, List list) {
        int i14 = 0;
        if (j8 <= ((Double) list.get(0)).longValue()) {
            return 0;
        }
        int size = list.size() - 1;
        if (j8 >= ((Double) list.get(size)).longValue()) {
            return size;
        }
        while (i14 < size) {
            int i15 = (i14 + size) / 2;
            if (j8 < ((Double) list.get(i15)).longValue()) {
                size = i15 - 1;
            } else {
                if (j8 <= ((Double) list.get(i15)).longValue()) {
                    return i15;
                }
                i14 = i15 + 1;
            }
        }
        if (j8 < ((Double) list.get(i14)).longValue()) {
            int i16 = i14 - 1;
            if (j8 - ((Double) list.get(i16)).longValue() < ((Double) list.get(i14)).longValue() - j8) {
                return i16;
            }
        } else {
            int i17 = i14 + 1;
            if (j8 - ((Double) list.get(i14)).longValue() >= ((Double) list.get(i17)).longValue() - j8) {
                return i17;
            }
        }
        return i14;
    }
}
