package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class y4f {
    public static <K, V> V a(Map<K, V> map, K k2, V v) {
        return map.containsKey(k2) ? map.get(k2) : v;
    }
}
