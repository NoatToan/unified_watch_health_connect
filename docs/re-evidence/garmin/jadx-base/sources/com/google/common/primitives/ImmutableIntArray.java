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
public final class ImmutableIntArray implements Serializable {
    private static final ImmutableIntArray EMPTY = new ImmutableIntArray(new int[0]);
    private final int[] array;
    private final int end;
    private final transient int start;

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private final ImmutableIntArray parent;

        private AsList(ImmutableIntArray immutableIntArray) {
            this.parent = immutableIntArray;
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
                if (obj2 instanceof Integer) {
                    int i15 = i14 + 1;
                    if (this.parent.array[i14] == ((Integer) obj2).intValue()) {
                        i14 = i15;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i14) {
            return Integer.valueOf(this.parent.get(i14));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.parent.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.parent.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i14, int i15) {
            return this.parent.subArray(i14, i15).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }
    }

    private ImmutableIntArray(int[] iArr, int i14, int i15) {
        this.array = iArr;
        this.start = i14;
        this.end = i15;
    }

    public static Builder builder(int i14) {
        Preconditions.checkArgument(i14 >= 0, "Invalid initialCapacity: %s", i14);
        return new Builder(i14);
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
        return iterable instanceof Collection ? copyOf((Collection<Integer>) iterable) : builder().addAll(iterable).build();
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableIntArray of(int i14, int... iArr) {
        Preconditions.checkArgument(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i14;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2);
    }

    public List<Integer> asList() {
        return new AsList();
    }

    public boolean contains(int i14) {
        return indexOf(i14) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i14 = 0; i14 < length(); i14++) {
            if (get(i14) != immutableIntArray.get(i14)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i14) {
        Preconditions.checkElementIndex(i14, length());
        return this.array[this.start + i14];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i14 = this.start; i14 < this.end; i14++) {
            iHashCode = (iHashCode * 31) + Ints.hashCode(this.array[i14]);
        }
        return iHashCode;
    }

    public int indexOf(int i14) {
        for (int i15 = this.start; i15 < this.end; i15++) {
            if (this.array[i15] == i14) {
                return i15 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(int i14) {
        int i15;
        int i16 = this.end;
        do {
            i16--;
            i15 = this.start;
            if (i16 < i15) {
                return -1;
            }
        } while (this.array[i16] != i14);
        return i16 - i15;
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableIntArray subArray(int i14, int i15) {
        Preconditions.checkPositionIndexes(i14, i15, length());
        if (i14 == i15) {
            return EMPTY;
        }
        int[] iArr = this.array;
        int i16 = this.start;
        return new ImmutableIntArray(iArr, i14 + i16, i16 + i15);
    }

    public int[] toArray() {
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

    public ImmutableIntArray trimmed() {
        return isPartialView() ? new ImmutableIntArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableIntArray(Ints.toArray(collection));
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
        return iArr.length == 0 ? EMPTY : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    public static ImmutableIntArray of(int i14) {
        return new ImmutableIntArray(new int[]{i14});
    }

    public static ImmutableIntArray of(int i14, int i15) {
        return new ImmutableIntArray(new int[]{i14, i15});
    }

    public static ImmutableIntArray of(int i14, int i15, int i16) {
        return new ImmutableIntArray(new int[]{i14, i15, i16});
    }

    public static ImmutableIntArray of(int i14, int i15, int i16, int i17) {
        return new ImmutableIntArray(new int[]{i14, i15, i16, i17});
    }

    public static ImmutableIntArray of(int i14, int i15, int i16, int i17, int i18) {
        return new ImmutableIntArray(new int[]{i14, i15, i16, i17, i18});
    }

    public static ImmutableIntArray of(int i14, int i15, int i16, int i17, int i18, int i19) {
        return new ImmutableIntArray(new int[]{i14, i15, i16, i17, i18, i19});
    }

    public static final class Builder {
        private int[] array;
        private int count = 0;

        public Builder(int i14) {
            this.array = new int[i14];
        }

        private void ensureRoomFor(int i14) {
            int i15 = this.count + i14;
            int[] iArr = this.array;
            if (i15 > iArr.length) {
                this.array = Arrays.copyOf(iArr, expandedCapacity(iArr.length, i15));
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
        public Builder add(int i14) {
            ensureRoomFor(1);
            int[] iArr = this.array;
            int i15 = this.count;
            iArr[i15] = i14;
            this.count = i15 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(Collection<Integer> collection) {
            ensureRoomFor(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.array;
                int i14 = this.count;
                this.count = i14 + 1;
                iArr[i14] = num.intValue();
            }
            return this;
        }

        public ImmutableIntArray build() {
            if (this.count == 0) {
                return ImmutableIntArray.EMPTY;
            }
            return new ImmutableIntArray(this.array, 0, this.count);
        }

        @CanIgnoreReturnValue
        public Builder addAll(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Integer>) iterable);
            }
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().intValue());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(int[] iArr) {
            ensureRoomFor(iArr.length);
            System.arraycopy(iArr, 0, this.array, this.count, iArr.length);
            this.count += iArr.length;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(ImmutableIntArray immutableIntArray) {
            ensureRoomFor(immutableIntArray.length());
            System.arraycopy(immutableIntArray.array, immutableIntArray.start, this.array, this.count, immutableIntArray.length());
            this.count = immutableIntArray.length() + this.count;
            return this;
        }
    }

    public static ImmutableIntArray of() {
        return EMPTY;
    }
}
