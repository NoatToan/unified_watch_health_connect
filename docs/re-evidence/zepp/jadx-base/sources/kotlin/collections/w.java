package kotlin.collections;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
class w<T> extends AbstractList<T> {

    @NotNull
    private final List<T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@NotNull List<? extends T> list) {
        this.a = list;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i) {
        return this.a.get(i.R(this, i));
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.a.size();
    }
}
