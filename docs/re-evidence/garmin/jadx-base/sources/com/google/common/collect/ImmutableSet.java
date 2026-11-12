package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;
    private static final long serialVersionUID = 912559;

    @RetainedWith
    @LazyInit
    private transient ImmutableList<E> asList;

    @J2ktIncompatible
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> Builder<E> builderWithExpectedSize(int i14) {
        CollectPreconditions.checkNonnegative(i14, "expectedSize");
        return new Builder<>(i14, true);
    }

    @VisibleForTesting
    public static int chooseTableSize(int i14) {
        int iMax = Math.max(i14, 2);
        if (iMax >= CUTOFF) {
            Preconditions.checkArgument(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSet<E> construct(int i14, Object... objArr) {
        if (i14 == 0) {
            return of();
        }
        if (i14 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return of(obj);
        }
        int iChooseTableSize = chooseTableSize(i14);
        Object[] objArr2 = new Object[iChooseTableSize];
        int i15 = iChooseTableSize - 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            Object objCheckElementNotNull = ObjectArrays.checkElementNotNull(objArr[i18], i18);
            int iHashCode = objCheckElementNotNull.hashCode();
            int iSmear = Hashing.smear(iHashCode);
            while (true) {
                int i19 = iSmear & i15;
                Object obj2 = objArr2[i19];
                if (obj2 == null) {
                    objArr[i17] = objCheckElementNotNull;
                    objArr2[i19] = objCheckElementNotNull;
                    i16 += iHashCode;
                    i17++;
                    break;
                }
                if (obj2.equals(objCheckElementNotNull)) {
                    break;
                }
                iSmear++;
            }
        }
        Arrays.fill(objArr, i17, i14, (Object) null);
        if (i17 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new SingletonImmutableSet(obj3);
        }
        if (chooseTableSize(i17) < iChooseTableSize / 2) {
            return construct(i17, objArr);
        }
        if (shouldTrim(i17, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i17);
        }
        return new RegularImmutableSet(objArr, i16, objArr2, i15, i17);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        return !it.hasNext() ? of((Object) next) : new Builder().add((Object) next).addAll((Iterator) it).build();
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e4, E e14, E e15, E e16, E e17, E e18, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e4;
        objArr[1] = e14;
        objArr[2] = e15;
        objArr[3] = e16;
        objArr[4] = e17;
        objArr[5] = e18;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int i14, int i15) {
        return i14 < (i15 >> 1) + (i15 >> 2);
    }

    @IgnoreJRERequirement
    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return CollectCollectors.toImmutableSet();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListCreateAsList = createAsList();
        this.asList = immutableListCreateAsList;
        return immutableListCreateAsList;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        private int hashCode;

        @VisibleForTesting
        Object[] hashTable;

        public Builder(int i14, boolean z14) {
            super(i14);
            if (z14) {
                this.hashTable = new Object[ImmutableSet.chooseTableSize(i14)];
            }
        }

        private void addDeduping(E e4) {
            Objects.requireNonNull(this.hashTable);
            int length = this.hashTable.length - 1;
            int iHashCode = e4.hashCode();
            int iSmear = Hashing.smear(iHashCode);
            while (true) {
                int i14 = iSmear & length;
                Object[] objArr = this.hashTable;
                Object obj = objArr[i14];
                if (obj == null) {
                    objArr[i14] = e4;
                    this.hashCode += iHashCode;
                    super.add((Object) e4);
                    return;
                } else if (obj.equals(e4)) {
                    return;
                } else {
                    iSmear = i14 + 1;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e4) {
            Preconditions.checkNotNull(e4);
            if (this.hashTable != null && ImmutableSet.chooseTableSize(this.size) <= this.hashTable.length) {
                addDeduping(e4);
                return this;
            }
            this.hashTable = null;
            super.add((Object) e4);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Preconditions.checkNotNull(iterable);
            if (this.hashTable == null) {
                super.addAll((Iterable) iterable);
                return this;
            }
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                add((Object) it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
            ImmutableSet<E> immutableSetConstruct;
            int i14 = this.size;
            if (i14 == 0) {
                return ImmutableSet.of();
            }
            if (i14 == 1) {
                Object obj = this.contents[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.of(obj);
            }
            if (this.hashTable == null || ImmutableSet.chooseTableSize(i14) != this.hashTable.length) {
                immutableSetConstruct = ImmutableSet.construct(this.size, this.contents);
                this.size = immutableSetConstruct.size();
            } else {
                boolean zShouldTrim = ImmutableSet.shouldTrim(this.size, this.contents.length);
                Object[] objArrCopyOf = this.contents;
                if (zShouldTrim) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, this.size);
                }
                int i15 = this.hashCode;
                Object[] objArr = this.hashTable;
                immutableSetConstruct = new RegularImmutableSet<>(objArrCopyOf, i15, objArr, objArr.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return immutableSetConstruct;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public Builder<E> combine(Builder<E> builder) {
            if (this.hashTable == null) {
                addAll(builder.contents, builder.size);
                return this;
            }
            for (int i14 = 0; i14 < builder.size; i14++) {
                Object obj = builder.contents[i14];
                Objects.requireNonNull(obj);
                add(obj);
            }
            return this;
        }

        public Builder() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            if (this.hashTable != null) {
                for (E e4 : eArr) {
                    add((Object) e4);
                }
                return this;
            }
            super.add((Object[]) eArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            Preconditions.checkNotNull(it);
            while (it.hasNext()) {
                add((Object) it.next());
            }
            return this;
        }
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> of(E e4) {
        return new SingletonImmutableSet(e4);
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static <E> ImmutableSet<E> of(E e4, E e14) {
        return construct(2, e4, e14);
    }

    public static <E> ImmutableSet<E> of(E e4, E e14, E e15) {
        return construct(3, e4, e14, e15);
    }

    public static <E> ImmutableSet<E> of(E e4, E e14, E e15, E e16) {
        return construct(4, e4, e14, e15, e16);
    }

    public static <E> ImmutableSet<E> of(E e4, E e14, E e15, E e16, E e17) {
        return construct(5, e4, e14, e15, e16, e17);
    }

    public static <E> ImmutableSet<E> of() {
        return RegularImmutableSet.EMPTY;
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return construct(eArr.length, (Object[]) eArr.clone());
        }
        return of((Object) eArr[0]);
    }
}
