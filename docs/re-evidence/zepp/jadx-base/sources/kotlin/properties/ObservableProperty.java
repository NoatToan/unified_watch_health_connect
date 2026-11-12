package kotlin.properties;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {
    private V a;

    public ObservableProperty(V v) {
        this.a = v;
    }

    public void afterChange(@NotNull KProperty<?> kProperty, V v, V v2) {
    }

    public boolean beforeChange(@NotNull KProperty<?> kProperty, V v, V v2) {
        return true;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public V getValue(@Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return this.a;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> kProperty, V v) {
        V v2 = this.a;
        if (beforeChange(kProperty, v2, v)) {
            this.a = v;
            afterChange(kProperty, v2, v);
        }
    }
}
