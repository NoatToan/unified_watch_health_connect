package io.sentry.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class b {
    public static <T> boolean a(@NotNull T[] tArr, @NotNull T t) {
        for (T t2 : tArr) {
            if (t.equals(t2)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static <T> List<T> b(@Nullable List<T> list) {
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    @Nullable
    public static <K, V> Map<K, V> c(@Nullable Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    @Nullable
    public static <K, V> Map<K, V> d(@Nullable Map<K, V> map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public static int e(@NotNull Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i;
    }
}
