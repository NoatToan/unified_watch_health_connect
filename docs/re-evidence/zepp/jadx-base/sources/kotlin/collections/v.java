package kotlin.collections;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class v<T> extends AbstractMutableList<T> {

    @NotNull
    private final List<T> a;

    public v(@NotNull List<T> list) {
        this.a = list;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        this.a.add(i.S(this, i), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.a.get(i.R(this, i));
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.a.size();
    }

    @Override // kotlin.collections.AbstractMutableList
    public T removeAt(int i) {
        return this.a.remove(i.R(this, i));
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        return this.a.set(i.R(this, i), t);
    }
}
