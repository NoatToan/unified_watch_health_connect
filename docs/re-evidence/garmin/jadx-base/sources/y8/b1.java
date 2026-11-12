package y8;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public static final boolean a() {
        return Build.VERSION.SDK_INT >= 36 || SdkExtensions.getExtensionVersion(34) >= 16;
    }

    public static final <T extends Comparable<? super T>> void b(T t7, T t14, T t15, String str) {
        t7.getClass();
        t14.getClass();
        t15.getClass();
        d(t7, t14, str);
        e(t7, t15, str);
    }

    public static final void c(double d14, String str) {
        if (d14 >= 0.0d) {
            return;
        }
        vb.h.x(str.concat(" must not be negative"));
    }

    public static final <T extends Comparable<? super T>> void d(T t7, T t14, String str) {
        t7.getClass();
        t14.getClass();
        if (t7.compareTo(t14) >= 0) {
            return;
        }
        throw new IllegalArgumentException((str + " must not be less than " + t14 + ", currently " + t7 + '.').toString());
    }

    public static final <T extends Comparable<? super T>> void e(T t7, T t14, String str) {
        t7.getClass();
        t14.getClass();
        if (t7.compareTo(t14) <= 0) {
            return;
        }
        throw new IllegalArgumentException((str + " must not be more than " + t14 + ", currently " + t7 + '.').toString());
    }

    public static final LinkedHashMap f(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iA = p13.t0.a(p13.y.r(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        return linkedHashMap;
    }
}
