package a61;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La61/e;", "", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f1563a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double[] f1564b = {41.7d, 45.4d, 51.1d, 55.4d};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double[] f1565c = {40.5d, 44.0d, 48.3d, 54.0d};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double[] f1566d = {38.5d, 42.4d, 46.4d, 52.5d};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double[] f1567e = {35.6d, 39.2d, 43.4d, 48.9d};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double[] f1568f = {32.3d, 35.5d, 39.5d, 45.7d};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final double[] f1569g = {29.4d, 32.3d, 36.7d, 42.1d};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double[] f1570h = {36.1d, 39.5d, 43.9d, 49.6d};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final double[] f1571i = {34.4d, 37.8d, 42.4d, 47.4d};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final double[] f1572j = {33.0d, 36.3d, 39.7d, 45.3d};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final double[] f1573k = {30.1d, 33.0d, 36.7d, 41.1d};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final double[] f1574l = {27.5d, 30.0d, 33.0d, 37.8d};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final double[] f1575m = {25.9d, 28.2d, 30.9d, 36.7d};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final double[] f1576n = {59.8d, 55.4d, 53.5d, 51.8d, 51.1d, 48.4d, 47.5d, 46.7d, 45.4d, 44.6d, 43.9d, 42.5d, 41.7d, 41.0d, 39.9d, 38.8d, 37.7d, 36.7d, 34.5d, 31.3d, 26.1d};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final double[] f1577o = {58.3d, 54.0d, 51.6d, 49.9d, 48.3d, 47.0d, 46.0d, 45.3d, 44.0d, 43.9d, 42.4d, 41.1d, 40.5d, 39.5d, 38.6d, 37.6d, 36.7d, 35.2d, 33.8d, 31.1d, 26.5d};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final double[] f1578p = {56.1d, 52.5d, 49.6d, 48.2d, 46.4d, 44.9d, 43.9d, 43.1d, 42.4d, 41.0d, 40.1d, 39.5d, 38.5d, 37.7d, 36.7d, 35.9d, 34.9d, 33.8d, 32.3d, 29.5d, 25.1d};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f1579q = {54.0d, 48.9d, 46.7d, 44.6d, 43.4d, 41.8d, 41.0d, 39.9d, 39.2d, 38.1d, 37.3d, 36.7d, 35.6d, 35.0d, 33.8d, 33.0d, 32.3d, 30.9d, 29.4d, 27.0d, 22.8d};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final double[] f1580r = {51.1d, 45.7d, 42.6d, 41.0d, 39.5d, 38.3d, 37.1d, 36.7d, 35.5d, 34.8d, 33.8d, 33.0d, 32.3d, 31.6d, 30.9d, 29.5d, 28.7d, 27.4d, 25.7d, 23.7d, 19.4d};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final double[] f1581s = {49.6d, 42.1d, 39.5d, 38.1d, 36.7d, 35.2d, 33.9d, 33.1d, 32.3d, 31.5d, 30.7d, 29.9d, 29.4d, 28.1d, 27.8d, 26.7d, 25.7d, 24.6d, 22.9d, 20.8d, 18.2d};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final double[] f1582t = {54.4d, 49.6d, 46.7d, 45.3d, 43.9d, 42.4d, 41.0d, 40.9d, 39.5d, 38.5d, 37.7d, 36.7d, 36.1d, 35.2d, 33.9d, 32.9d, 32.3d, 30.9d, 29.5d, 27.0d, 23.7d};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final double[] f1583u = {52.5d, 47.4d, 45.3d, 43.9d, 42.4d, 41.0d, 39.6d, 38.6d, 37.8d, 37.1d, 36.7d, 35.2d, 34.4d, 33.8d, 32.5d, 32.3d, 30.9d, 29.5d, 28.0d, 25.9d, 22.9d};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final double[] f1584v = {51.1d, 45.3d, 43.9d, 41.1d, 39.7d, 39.2d, 38.1d, 36.7d, 36.3d, 35.2d, 34.9d, 33.8d, 33.0d, 32.3d, 31.3d, 30.4d, 29.4d, 28.2d, 26.7d, 25.1d, 22.2d};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final double[] f1585w = {46.0d, 41.1d, 39.5d, 37.3d, 36.7d, 35.3d, 34.5d, 33.7d, 33.0d, 32.3d, 31.6d, 30.9d, 30.1d, 29.5d, 29.0d, 28.0d, 27.0d, 25.9d, 24.8d, 23.0d, 20.4d};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final double[] f1586x = {43.9d, 37.8d, 35.9d, 34.5d, 33.0d, 32.3d, 31.3d, 30.9d, 30.0d, 29.4d, 29.1d, 28.4d, 27.5d, 26.8d, 26.1d, 25.2d, 24.7d, 24.0d, 23.0d, 21.8d, 19.5d};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final double[] f1587y = {43.9d, 36.7d, 33.0d, 31.8d, 30.9d, 30.0d, 29.5d, 29.4d, 28.1d, 28.0d, 27.4d, 26.6d, 25.9d, 25.1d, 24.8d, 24.3d, 23.8d, 22.6d, 21.5d, 19.7d, 16.8d};

    private e() {
    }

    public static void a(String str, double d14, HashMap map) {
        if (map.containsKey(str) && map.get(str) != null) {
            Object obj = map.get(str);
            obj.getClass();
            if (((Number) obj).doubleValue() > d14) {
                return;
            }
        }
        if (str != null) {
            map.put(str, Double.valueOf(d14));
        }
    }

    public static q71.a b(double d14, double[] dArr) {
        int length;
        dArr.getClass();
        if (d14 <= dArr[dArr.length - 1]) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= dArr.length) {
                    length = i14;
                    break;
                }
                if (d14 < dArr[i15]) {
                    if (i15 != 0) {
                        length = i15 - 1;
                        break;
                    }
                    length = -1;
                    break;
                }
                if (i15 == dArr.length - 1) {
                    i14 = i15;
                }
                i15++;
            }
        } else {
            length = dArr.length - 1;
        }
        if (length == -1) {
            return q71.a.POOR;
        }
        if (length == 0) {
            return q71.a.FAIR;
        }
        if (length == 1) {
            return q71.a.GOOD;
        }
        if (length != 2) {
            return length != 3 ? q71.a.GOOD : q71.a.SUPERIOR;
        }
        return q71.a.EXCELLENT;
    }

    public static String c(l22.b bVar, double d14) {
        bVar.getClass();
        if (Double.isNaN(d14)) {
            return bVar.getString(R.string.no_value);
        }
        l3.f23124b.getClass();
        String str = l3.f23131i.format(d14);
        str.getClass();
        return str;
    }

    public static String d(l22.b bVar, double d14, e71.m mVar, boolean z14) {
        Integer num;
        bVar.getClass();
        return (z14 || Double.isNaN(d14) || (num = mVar.f63321a) == null) ? "" : bVar.getString(num.intValue());
    }

    public static String e(int i14, boolean z14) {
        return am.j.h(i14, z14 ? "top " : "bottom ");
    }

    public static double[] f(List list) {
        int i14 = 0;
        double[] dArr = new double[0];
        if (list != null) {
            dArr = new double[list.size()];
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dArr[i14] = ((o61.i) it.next()).f129596b;
                i14++;
            }
        }
        return dArr;
    }

    public static double[] g() {
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        String strW = lVar.w();
        return h(lVar.u(), strW.length() == 0 || strW.equals("MALE"));
    }

    public static double[] h(int i14, boolean z14) {
        if (z14) {
            if (i14 <= 29) {
                return f1564b;
            }
            if (i14 <= 39) {
                return f1565c;
            }
            if (i14 <= 49) {
                return f1566d;
            }
            if (i14 <= 59) {
                return f1567e;
            }
            return i14 <= 69 ? f1568f : f1569g;
        }
        if (i14 <= 29) {
            return f1570h;
        }
        if (i14 <= 39) {
            return f1571i;
        }
        if (i14 <= 49) {
            return f1572j;
        }
        if (i14 <= 59) {
            return f1573k;
        }
        return i14 <= 69 ? f1574l : f1575m;
    }

    public static String i(int i14, double d14, boolean z14) {
        if (z14) {
            if (i14 <= 29) {
                return l(d14, f1576n);
            }
            if (i14 <= 39) {
                return l(d14, f1577o);
            }
            if (i14 <= 49) {
                return l(d14, f1578p);
            }
            if (i14 <= 59) {
                return l(d14, f1579q);
            }
            return i14 <= 69 ? l(d14, f1580r) : l(d14, f1581s);
        }
        if (i14 <= 29) {
            return l(d14, f1582t);
        }
        if (i14 <= 39) {
            return l(d14, f1583u);
        }
        if (i14 <= 49) {
            return l(d14, f1584v);
        }
        if (i14 <= 59) {
            return l(d14, f1585w);
        }
        return i14 <= 69 ? l(d14, f1586x) : l(d14, f1587y);
    }

    public static HashMap j(ArrayList arrayList, DateTime dateTime, DateTime dateTime2, boolean z14) {
        dateTime.getClass();
        dateTime2.getClass();
        HashMap map = new HashMap();
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            HashMap map2 = new HashMap(size);
            for (int i14 = 0; i14 < size; i14++) {
                o61.l lVar = (o61.l) arrayList.get(i14);
                if (lVar != null) {
                    DateTime dateTime3 = lVar.f129608d;
                    String strB = c22.j0.b(dateTime3 != null ? dateTime3.withTimeAtStartOfDay() : null, "yyyy-MM-dd", null);
                    if (z14) {
                        a(strB, lVar.f129607c, map2);
                    } else {
                        a(strB, lVar.f129606b, map2);
                    }
                }
            }
            DateTime dateTimeWithTimeAtStartOfDay = dateTime2.plusDays(1).withTimeAtStartOfDay();
            for (DateTime dateTimeWithTimeAtStartOfDay2 = dateTime.withTimeAtStartOfDay(); dateTimeWithTimeAtStartOfDay2.isBefore(dateTimeWithTimeAtStartOfDay); dateTimeWithTimeAtStartOfDay2 = dateTimeWithTimeAtStartOfDay2.plusDays(1)) {
                map.put(dateTimeWithTimeAtStartOfDay2, map2.getOrDefault(c22.j0.b(dateTimeWithTimeAtStartOfDay2, "yyyy-MM-dd", null), Double.valueOf(0.0d)));
            }
        }
        return map;
    }

    public static boolean k(double d14) {
        return (Double.isNaN(d14) || Double.compare(d14, 0.0d) == 0) ? false : true;
    }

    public static String l(double d14, double[] dArr) {
        int length = dArr.length;
        if (d14 >= dArr[0]) {
            return e(1, true);
        }
        int i14 = length - 1;
        if (d14 < dArr[i14]) {
            return e(1, false);
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (d14 < dArr[i15]) {
                int i16 = i15 + 1;
                if (d14 >= dArr[i16]) {
                    if (i16 == 10) {
                        return e(50, true);
                    }
                    if (i16 == 11) {
                        return e(50, false);
                    }
                    return i16 > 11 ? e(50 - ((i15 - 10) * 5), false) : e(i16 * 5, true);
                }
            }
        }
        return "";
    }
}
