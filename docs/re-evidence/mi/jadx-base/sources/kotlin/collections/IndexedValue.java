package kotlin.collections;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class IndexedValue<T> {
    private final int index;
    private final T value;

    public IndexedValue(int i, T t) {
        this.index = i;
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexedValue copy$default(IndexedValue indexedValue, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = indexedValue.index;
        }
        if ((i2 & 2) != 0) {
            obj = indexedValue.value;
        }
        return indexedValue.copy(i, obj);
    }

    public final int component1() {
        return this.index;
    }

    public final T component2() {
        return this.value;
    }

    @NotNull
    public final IndexedValue<T> copy(int i, T t) {
        return new IndexedValue<>(i, t);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.index == indexedValue.index && Intrinsics.areEqual(this.value, indexedValue.value);
    }

    public final int getIndex() {
        return this.index;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        T t = this.value;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        return "IndexedValue(index=" + this.index + ", value=" + this.value + ')';
    }
}
