package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jgx {
    public static boolean b(Object obj, Class cls) {
        return njy.b(obj, cls);
    }

    public static boolean e(Object obj, Class cls, Class cls2) {
        if (cls == null || cls2 == null || obj == null || !(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return cls.isInstance(pair.first) && cls2.isInstance(pair.second);
    }

    public static boolean d(Object obj, Class cls, Class cls2) {
        if (cls == null || cls2 == null || obj == null || !(obj instanceof HashMap)) {
            return false;
        }
        for (Map.Entry entry : ((HashMap) obj).entrySet()) {
            if (!cls.isInstance(entry.getKey()) || !njy.b(entry.getValue(), cls2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(Object obj, Class cls, Class cls2, Class cls3, Class cls4) {
        if (cls != null && cls2 != null && cls3 != null && cls4 != null && obj != null && (obj instanceof Pair)) {
            Pair pair = (Pair) obj;
            if ((pair.first instanceof Pair) && (pair.second instanceof Pair) && e(pair.first, cls, cls2) && e(pair.second, cls3, cls4)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Object obj, Class cls) {
        if (cls == null || obj == null || !(obj instanceof ArrayList)) {
            return false;
        }
        Iterator it = ((ArrayList) obj).iterator();
        while (it.hasNext()) {
            if (!cls.isInstance(it.next())) {
                return false;
            }
        }
        return true;
    }
}
