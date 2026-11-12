package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class i0m {
    public static <E> CopyOnWriteArraySet<E> a() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E> Set<E> b() {
        return c(new IdentityHashMap());
    }

    public static <E> Set<E> c(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }
}
