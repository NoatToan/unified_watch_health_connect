package dg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p13.h0;
import p13.j0;
import p13.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final <T> List<T> a(List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(h0.b0(list));
        }
        return j0.f134944a;
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) h0.a0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
