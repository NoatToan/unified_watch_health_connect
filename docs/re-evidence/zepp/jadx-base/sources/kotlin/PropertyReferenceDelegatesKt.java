package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes23.dex */
public final class PropertyReferenceDelegatesKt {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> V a(KProperty0<? extends V> kProperty0, Object obj, KProperty<?> kProperty) {
        return kProperty0.get();
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T, V> V b(KProperty1<T, ? extends V> kProperty1, T t, KProperty<?> kProperty) {
        return kProperty1.get(t);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> void c(KMutableProperty0<V> kMutableProperty0, Object obj, KProperty<?> kProperty, V v) {
        kMutableProperty0.set(v);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T, V> void d(KMutableProperty1<T, V> kMutableProperty1, T t, KProperty<?> kProperty, V v) {
        kMutableProperty1.set(t, v);
    }
}
