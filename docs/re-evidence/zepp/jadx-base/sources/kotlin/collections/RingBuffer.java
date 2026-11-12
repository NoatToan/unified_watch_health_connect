package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {

    @NotNull
    private final Object[] a;
    private final int b;
    private int c;
    private int d;

    public RingBuffer(@NotNull Object[] objArr, int i) {
        this.a = objArr;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("ring buffer filled size should not be negative but it is ", Integer.valueOf(i)).toString());
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    private final int g(int i, int i2) {
        return (i + i2) % this.b;
    }

    public final void e(T t) {
        if (h()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.a[(this.c + size()) % this.b] = t;
        this.d = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final RingBuffer<T> f(int i) {
        int i2 = this.b;
        int iCoerceAtMost = kotlin.ranges.e.coerceAtMost(i2 + (i2 >> 1) + 1, i);
        return new RingBuffer<>(this.c == 0 ? Arrays.copyOf(this.a, iCoerceAtMost) : toArray(new Object[iCoerceAtMost]), size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return (T) this.a[(this.c + i) % this.b];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int get_size() {
        return this.d;
    }

    public final boolean h() {
        return size() == this.b;
    }

    public final void i(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("n shouldn't be negative but it is ", Integer.valueOf(i)).toString());
        }
        if (!(i <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = (i2 + i) % this.b;
            if (i2 > i3) {
                ArraysKt___ArraysJvmKt.fill(this.a, (Object) null, i2, this.b);
                ArraysKt___ArraysJvmKt.fill(this.a, (Object) null, 0, i3);
            } else {
                ArraysKt___ArraysJvmKt.fill(this.a, (Object) null, i2, i3);
            }
            this.c = i3;
            this.d = size() - i;
        }
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer.iterator.1
            private int c;
            private int d;
            public final /* synthetic */ RingBuffer<T> e;

            {
                this.e = this;
                this.c = this.size();
                this.d = ((RingBuffer) this).c;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                if (this.c == 0) {
                    done();
                    return;
                }
                setNext(((RingBuffer) this.e).a[this.d]);
                this.d = (this.d + 1) % ((RingBuffer) this.e).b;
                this.c--;
            }
        };
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.c; i2 < size && i3 < this.b; i3++) {
            tArr[i2] = this.a[i3];
            i2++;
        }
        while (i2 < size) {
            tArr[i2] = this.a[i];
            i2++;
            i++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public RingBuffer(int i) {
        this(new Object[i], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
