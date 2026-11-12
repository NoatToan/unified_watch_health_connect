package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
class nak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f42828a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f42829c;

    static {
        int i = 16;
        f42829c = new LinkedHashMap(i) { // from class: nak.5
            {
                put("isSupportMultiLink", 25);
                put("isSupportPreemptLink", 26);
                put("isSupportSingleLink", 51);
            }
        };
        f42828a = new HashMap(i) { // from class: nak.4
            {
                put(2, 1);
                put(3, 0);
            }
        };
    }

    public static HashMap<Integer, Integer> b() {
        return f42828a;
    }

    public static Map<String, Integer> e() {
        return f42829c;
    }
}
