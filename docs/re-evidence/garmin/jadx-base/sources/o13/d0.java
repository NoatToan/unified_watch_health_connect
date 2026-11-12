package o13;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lo13/d0;", "", "Lo13/c0;", "a", "storage", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 implements Collection<c0>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short[] f128573a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo13/d0$a;", "", "Lo13/c0;", "", "array", "<init>", "([S)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<c0>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short[] f128574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f128575b;

        public a(short[] sArr) {
            sArr.getClass();
            this.f128574a = sArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f128575b < this.f128574a.length;
        }

        @Override // java.util.Iterator
        public final c0 next() {
            int i14 = this.f128575b;
            short[] sArr = this.f128574a;
            if (i14 < sArr.length) {
                this.f128575b = i14 + 1;
                return c0.a(sArr[i14]);
            }
            n23.j.s(String.valueOf(i14));
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ d0(short[] sArr) {
        this.f128573a = sArr;
    }

    public static final /* synthetic */ d0 a(short[] sArr) {
        return new d0(sArr);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(c0 c0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends c0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0020 A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        short s8 = ((c0) obj).f128568a;
        short[] sArr = this.f128573a;
        sArr.getClass();
        int length = sArr.length;
        int i14 = 0;
        while (i14 < length) {
            if (s8 == sArr[i14]) {
                if (i14 >= 0) {
                    return true;
                }
                return false;
            }
            i14++;
        }
        i14 = -1;
        if (i14 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Collection<?> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof c0) {
                    short s8 = ((c0) obj).f128568a;
                    short[] sArr = this.f128573a;
                    sArr.getClass();
                    int length = sArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            i14 = -1;
                            break;
                        }
                        if (s8 == sArr[i14]) {
                            break;
                        }
                        i14++;
                    }
                    if (i14 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return p005kotlin.jvm.internal.s.g(this.f128573a, ((d0) obj).f128573a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f128573a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f128573a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<c0> iterator() {
        return new a(this.f128573a);
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
        return this.f128573a.length;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f128573a) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }
}
