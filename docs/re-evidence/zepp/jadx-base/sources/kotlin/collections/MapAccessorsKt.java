package kotlin.collections;

import java.util.Map;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes23.dex */
@JvmName(name = "MapAccessorsKt")
public final class MapAccessorsKt {
    @InlineOnly
    private static final <V, V1 extends V> V1 a(Map<? super String, ? extends V> map, Object obj, KProperty<?> kProperty) {
        return (V1) p.getOrImplicitDefaultNullable(map, kProperty.getName());
    }

    @InlineOnly
    @JvmName(name = "getVar")
    private static final <V, V1 extends V> V1 b(Map<? super String, ? extends V> map, Object obj, KProperty<?> kProperty) {
        return (V1) p.getOrImplicitDefaultNullable(map, kProperty.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <V> void c(Map<? super String, ? super V> map, Object obj, KProperty<?> kProperty, V v) {
        map.put(kProperty.getName(), v);
    }
}
