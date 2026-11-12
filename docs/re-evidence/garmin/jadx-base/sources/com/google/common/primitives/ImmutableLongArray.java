package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@Immutable
@GwtCompatible
public final class ImmutableLongArray implements Serializable {
    private static final ImmutableLongArray EMPTY = new ImmutableLongArray(new long[0]);
    private final long[] array;
    private final int end;
    private final transient int start;

    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private final ImmutableLongArray parent;

        private AsList(ImmutableLongArray immutableLongArray) {
            this.parent = immutableLongArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.parent.equals(((AsList) obj).parent);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i14 = this.parent.start;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i15 = i14 + 1;
                    if (this.parent.array[i14] == ((Long) obj2).longValue()) {
                        i14 = i15;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i14) {
            return Long.valueOf(this.parent.get(i14));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                return this.parent.indexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return this.parent.lastIndexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i14, int i15) {
            return this.parent.subArray(i14, i15).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }
    }

    private ImmutableLongArray(long[] jArr, int i14, int i15) {
        this.array = jArr;
        this.start = i14;
        this.end = i15;
    }

    public static Builder builder(int i14) {
        Preconditions.checkArgument(i14 >= 0, "Invalid initialCapacity: %s", i14);
        return new Builder(i14);
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
        return iterable instanceof Collection ? copyOf((Collection<Long>) iterable) : builder().addAll(iterable).build();
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableLongArray of(long j8, long... jArr) {
        Preconditions.checkArgument(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j8;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new ImmutableLongArray(jArr2);
    }

    public List<Long> asList() {
        return new AsList();
    }

    public boolean contains(long j8) {
        return indexOf(j8) >= 0;
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
        for (int i14 = 0; i14 < length(); i14++) {
            if (get(i14) != immutableLongArray.get(i14)) {
                return false;
            }
        }
        return true;
    }

    public long get(int i14) {
        Preconditions.checkElementIndex(i14, length());
        return this.array[this.start + i14];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i14 = this.start; i14 < this.end; i14++) {
            iHashCode = (iHashCode * 31) + Longs.hashCode(this.array[i14]);
        }
        return iHashCode;
    }

    public int indexOf(long j8) {
        for (int i14 = this.start; i14 < this.end; i14++) {
            if (this.array[i14] == j8) {
                return i14 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(long j8) {
        int i14;
        int i15 = this.end;
        do {
            i15--;
            i14 = this.start;
            if (i15 < i14) {
                return -1;
            }
        } while (this.array[i15] != j8);
        return i15 - i14;
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableLongArray subArray(int i14, int i15) {
        Preconditions.checkPositionIndexes(i14, i15, length());
        if (i14 == i15) {
            return EMPTY;
        }
        long[] jArr = this.array;
        int i16 = this.start;
        return new ImmutableLongArray(jArr, i14 + i16, i16 + i15);
    }

    public long[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb3 = new StringBuilder(length() * 5);
        sb3.append('[');
        sb3.append(this.array[this.start]);
        int i14 = this.start;
        while (true) {
            i14++;
            if (i14 >= this.end) {
                sb3.append(']');
                return sb3.toString();
            }
            sb3.append(", ");
            sb3.append(this.array[i14]);
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

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableLongArray(Longs.toArray(collection));
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
        if (jArr.length == 0) {
            return EMPTY;
        }
        return new ImmutableLongArray(Arrays.copyOf(jArr, jArr.length));
    }

    public static ImmutableLongArray of(long j8) {
        return new ImmutableLongArray(new long[]{j8});
    }

    public static ImmutableLongArray of(long j8, long j14) {
        return new ImmutableLongArray(new long[]{j8, j14});
    }

    public static ImmutableLongArray of(long j8, long j14, long j15) {
        return new ImmutableLongArray(new long[]{j8, j14, j15});
    }

    public static ImmutableLongArray of(long j8, long j14, long j15, long j16) {
        return new ImmutableLongArray(new long[]{j8, j14, j15, j16});
    }

    public static ImmutableLongArray of(long j8, long j14, long j15, long j16, long j17) {
        return new ImmutableLongArray(new long[]{j8, j14, j15, j16, j17});
    }

    public static ImmutableLongArray of(long j8, long j14, long j15, long j16, long j17, long j18) {
        return new ImmutableLongArray(new long[]{j8, j14, j15, j16, j17, j18});
    }

    public static final class Builder {
        private long[] array;
        private int count = 0;

        public Builder(int i14) {
            this.array = new long[i14];
        }

        private void ensureRoomFor(int i14) {
            int i15 = this.count + i14;
            long[] jArr = this.array;
            if (i15 > jArr.length) {
                this.array = Arrays.copyOf(jArr, expandedCapacity(jArr.length, i15));
            }
        }

        private static int expandedCapacity(int i14, int i15) {
            if (i15 < 0) {
                h.q("cannot store more than MAX_VALUE elements");
                return 0;
            }
            int iHighestOneBit = i14 + (i14 >> 1) + 1;
            if (iHighestOneBit < i15) {
                iHighestOneBit = Integer.highestOneBit(i15 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @CanIgnoreReturnValue
        public Builder add(long j8) {
            ensureRoomFor(1);
            long[] jArr = this.array;
            int i14 = this.count;
            jArr[i14] = j8;
            this.count = i14 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(Collection<Long> collection) {
            ensureRoomFor(collection.size());
            for (Long l14 : collection) {
                long[] jArr = this.array;
                int i14 = this.count;
                this.count = i14 + 1;
                jArr[i14] = l14.longValue();
            }
            return this;
        }

        public ImmutableLongArray build() {
            if (this.count == 0) {
                return ImmutableLongArray.EMPTY;
            }
            return new ImmutableLongArray(this.array, 0, this.count);
        }

        @CanIgnoreReturnValue
        public Builder addAll(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Long>) iterable);
            }
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().longValue());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(long[] jArr) {
            ensureRoomFor(jArr.length);
            System.arraycopy(jArr, 0, this.array, this.count, jArr.length);
            this.count += jArr.length;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(ImmutableLongArray immutableLongArray) {
            ensureRoomFor(immutableLongArray.length());
            System.arraycopy(immutableLongArray.array, immutableLongArray.start, this.array, this.count, immutableLongArray.length());
            this.count = immutableLongArray.length() + this.count;
            return this;
        }
    }

    public static ImmutableLongArray of() {
        return EMPTY;
    }
}
