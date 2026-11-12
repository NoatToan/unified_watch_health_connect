package kotlin.collections.jdk8;

import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes23.dex */
@JvmName(name = "CollectionsJDK8Kt")
public final class CollectionsJDK8Kt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <K, V> V a(Map<? extends K, ? extends V> map, K k, V v) {
        return map.getOrDefault(k, v);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <K, V> boolean b(Map<? extends K, ? extends V> map, K k, V v) {
        return map.remove(k, v);
    }
}
