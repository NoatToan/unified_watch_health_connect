package com.google.common.primitives;

import defpackage.c6i;
import defpackage.dse;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes5.dex */
public final class ImmutableLongArray implements Serializable {
    private static final ImmutableLongArray EMPTY = new ImmutableLongArray(new long[0]);
    private final long[] array;
    private final int end;
    private final transient int start;

    public static class b extends AbstractList<Long> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableLongArray f9288a;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Long get(int i) {
            return Long.valueOf(this.f9288a.get(i));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f9288a.equals(((b) obj).f9288a);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i = this.f9288a.start;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i2 = i + 1;
                    if (this.f9288a.array[i] == ((Long) obj2).longValue()) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f9288a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f9288a.indexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f9288a.lastIndexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9288a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            return this.f9288a.subArray(i, i2).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f9288a.toString();
        }

        public b(ImmutableLongArray immutableLongArray) {
            this.f9288a = immutableLongArray;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long[] f9289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9290b = 0;

        public c(int i) {
            this.f9289a = new long[i];
        }

        public static int f(int i, int i2) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public c a(long j) {
            e(1);
            long[] jArr = this.f9289a;
            int i = this.f9290b;
            jArr[i] = j;
            this.f9290b = i + 1;
            return this;
        }

        public c b(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return c((Collection) iterable);
            }
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next().longValue());
            }
            return this;
        }

        public c c(Collection<Long> collection) {
            e(collection.size());
            for (Long l : collection) {
                long[] jArr = this.f9289a;
                int i = this.f9290b;
                this.f9290b = i + 1;
                jArr[i] = l.longValue();
            }
            return this;
        }

        public ImmutableLongArray d() {
            if (this.f9290b == 0) {
                return ImmutableLongArray.EMPTY;
            }
            return new ImmutableLongArray(this.f9289a, 0, this.f9290b);
        }

        public final void e(int i) {
            int i2 = this.f9290b + i;
            long[] jArr = this.f9289a;
            if (i2 > jArr.length) {
                this.f9289a = Arrays.copyOf(jArr, f(jArr.length, i2));
            }
        }
    }

    public static c builder(int i) {
        c6i.f(i >= 0, "Invalid initialCapacity: %s", i);
        return new c(i);
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
        return jArr.length == 0 ? EMPTY : new ImmutableLongArray(Arrays.copyOf(jArr, jArr.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableLongArray of() {
        return EMPTY;
    }

    public List<Long> asList() {
        return new b();
    }

    public boolean contains(long j) {
        return indexOf(j) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (length() != immutableLongArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableLongArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public long get(int i) {
        c6i.m(i, length());
        return this.array[this.start + i];
    }

    public int hashCode() {
        int iE = 1;
        for (int i = this.start; i < this.end; i++) {
            iE = (iE * 31) + dse.e(this.array[i]);
        }
        return iE;
    }

    public int indexOf(long j) {
        for (int i = this.start; i < this.end; i++) {
            if (this.array[i] == j) {
                return i - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(long j) {
        int i;
        int i2 = this.end;
        do {
            i2--;
            i = this.start;
            if (i2 < i) {
                return -1;
            }
        } while (this.array[i2] != j);
        return i2 - i;
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableLongArray subArray(int i, int i2) {
        c6i.s(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        long[] jArr = this.array;
        int i3 = this.start;
        return new ImmutableLongArray(jArr, i + i3, i3 + i2);
    }

    public long[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(this.array[this.start]);
        int i = this.start;
        while (true) {
            i++;
            if (i >= this.end) {
                sb.append(AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.array[i]);
        }
    }

    public ImmutableLongArray trimmed() {
        return isPartialView() ? new ImmutableLongArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    public static ImmutableLongArray of(long j) {
        return new ImmutableLongArray(new long[]{j});
    }

    private ImmutableLongArray(long[] jArr, int i, int i2) {
        this.array = jArr;
        this.start = i;
        this.end = i2;
    }

    public static c builder() {
        return new c(10);
    }

    public static ImmutableLongArray of(long j, long j2) {
        return new ImmutableLongArray(new long[]{j, j2});
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableLongArray(dse.i(collection));
    }

    public static ImmutableLongArray of(long j, long j2, long j3) {
        return new ImmutableLongArray(new long[]{j, j2, j3});
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Long>) iterable);
        }
        return builder().b(iterable).d();
    }

    public static ImmutableLongArray of(long j, long j2, long j3, long j4) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4});
    }

    public static ImmutableLongArray of(long j, long j2, long j3, long j4, long j5) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5});
    }

    public static ImmutableLongArray of(long j, long j2, long j3, long j4, long j5, long j6) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5, j6});
    }

    public static ImmutableLongArray of(long j, long... jArr) {
        c6i.e(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new ImmutableLongArray(jArr2);
    }
}
