package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class xxy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f53309b;
    private static long e;
    private static SparseArray<Long> d = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Long> f53310c = new HashMap();

    public static boolean b(int i, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (d.indexOfKey(i) < 0) {
            a(i, jCurrentTimeMillis);
            return false;
        }
        if (jCurrentTimeMillis - d.get(i).longValue() <= j) {
            return true;
        }
        a(i, jCurrentTimeMillis);
        return false;
    }

    public static boolean c(int i) {
        return b(i, 500L);
    }

    private static void a(int i, long j) {
        if ((j - f53309b > 10000 && j - e > 500) || d.size() > 50) {
            f53309b = j;
            d.clear();
        }
        e = j;
        d.put(i, Long.valueOf(j));
    }
}
