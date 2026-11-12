package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class MovingSubList<E> extends AbstractList<E> implements RandomAccess {

    @NotNull
    private final List<E> a;
    private int b;
    private int c;

    /* JADX WARN: Multi-variable type inference failed */
    public MovingSubList(@NotNull List<? extends E> list) {
        this.a = list;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.c;
    }

    public final void move(int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, this.a.size());
        this.b = i;
        this.c = i2 - i;
    }
}
