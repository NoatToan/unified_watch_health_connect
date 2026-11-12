package p005kotlin.jvm.internal;

import f23.a;
import java.util.Iterator;
import n23.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/b;", "T", "", "", "array", "<init>", "([Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b<T> implements Iterator<T>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T[] f105787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f105788b;

    public b(T[] tArr) {
        tArr.getClass();
        this.f105787a = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f105788b < this.f105787a.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f105787a;
            int i14 = this.f105788b;
            this.f105788b = i14 + 1;
            return tArr[i14];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f105788b--;
            j.s(e4.getMessage());
            return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
