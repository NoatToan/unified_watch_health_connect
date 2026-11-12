package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mej {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f41502c;
    private static final Map<String, Integer> d;

    static {
        int i = 16;
        d = new LinkedHashMap(i) { // from class: mej.3
            private static final long serialVersionUID = -8254872593092335747L;

            {
                put("isSupportMultiLink", 25);
                put("isSupportPreemptLink", 26);
                put("isSupportSingleLink", 51);
            }
        };
        f41502c = new HashMap(i) { // from class: mej.2
            private static final long serialVersionUID = -1234088914796797210L;

            {
                put(2, 1);
                put(3, 0);
            }
        };
    }

    public static HashMap<Integer, Integer> d() {
        return f41502c;
    }

    public static Map<String, Integer> e() {
        return d;
    }
}
