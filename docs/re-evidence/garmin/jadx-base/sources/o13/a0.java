package o13;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lo13/a0;", "", "Lo13/z;", "a", "storage", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 implements Collection<z>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f128562a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo13/a0$a;", "", "Lo13/z;", "", "array", "<init>", "([J)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<z>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f128563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f128564b;

        public a(long[] jArr) {
            jArr.getClass();
            this.f128563a = jArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f128564b < this.f128563a.length;
        }

        @Override // java.util.Iterator
        public final z next() {
            int i14 = this.f128564b;
            long[] jArr = this.f128563a;
            if (i14 < jArr.length) {
                this.f128564b = i14 + 1;
                return z.a(jArr[i14]);
            }
            n23.j.s(String.valueOf(i14));
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ a0(long[] jArr) {
        this.f128562a = jArr;
    }

    public static final /* synthetic */ a0 a(long[] jArr) {
        return new a0(jArr);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(z zVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends z> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        return p13.u.y(this.f128562a, ((z) obj).f128619a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof z)) {
                return false;
            }
            if (!p13.u.y(this.f128562a, ((z) obj).f128619a)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return p005kotlin.jvm.internal.s.g(this.f128562a, ((a0) obj).f128562a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f128562a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f128562a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<z> iterator() {
        return new a(this.f128562a);
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
        return this.f128562a.length;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f128562a) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }
}
