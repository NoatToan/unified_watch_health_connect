package o13;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lo13/y;", "", "Lo13/x;", "a", "storage", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y implements Collection<x>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f128615a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo13/y$a;", "", "Lo13/x;", "", "array", "<init>", "([I)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<x>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f128616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f128617b;

        public a(int[] iArr) {
            iArr.getClass();
            this.f128616a = iArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f128617b < this.f128616a.length;
        }

        @Override // java.util.Iterator
        public final x next() {
            int i14 = this.f128617b;
            int[] iArr = this.f128616a;
            if (i14 < iArr.length) {
                this.f128617b = i14 + 1;
                return x.a(iArr[i14]);
            }
            n23.j.s(String.valueOf(i14));
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ y(int[] iArr) {
        this.f128615a = iArr;
    }

    public static final /* synthetic */ y a(int[] iArr) {
        return new y(iArr);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends x> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        return p13.u.x(this.f128615a, ((x) obj).f128614a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof x)) {
                return false;
            }
            if (!p13.u.x(this.f128615a, ((x) obj).f128614a)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return p005kotlin.jvm.internal.s.g(this.f128615a, ((y) obj).f128615a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f128615a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f128615a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<x> iterator() {
        return new a(this.f128615a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f128615a.length;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f128615a) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }
}
