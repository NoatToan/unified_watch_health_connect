package kotlin.collections.builders;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractMapBuilderEntrySet<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractMutableSet<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((Map.Entry<?, ?>) obj);
        }
        return false;
    }

    public final boolean contains(@NotNull E element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return containsEntry(element);
    }

    public /* bridge */ boolean remove(Map.Entry<?, ?> entry) {
        return super.remove((Object) entry);
    }
}
