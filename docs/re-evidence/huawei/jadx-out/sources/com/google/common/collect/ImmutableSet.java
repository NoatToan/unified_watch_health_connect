package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.ajz;
import defpackage.ale;
import defpackage.aly;
import defpackage.amu;
import defpackage.ane;
import defpackage.anm;
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
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;
    private static final long serialVersionUID = 912559;

    @CheckForNull
    @LazyInit
    private transient ImmutableList<E> asList;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    protected boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return ajz.d();
    }

    public static <E> ImmutableSet<E> of() {
        return ane.f595b;
    }

    public static <E> ImmutableSet<E> of(E e) {
        return new anm(e);
    }

    public static <E> ImmutableSet<E> of(E e, E e2) {
        return construct(2, e, e2);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSet<E> construct(int i, Object... objArr) {
        if (i == 0) {
            return of();
        }
        if (i == 1) {
            return of(Objects.requireNonNull(objArr[0]));
        }
        int iChooseTableSize = chooseTableSize(i);
        Object[] objArr2 = new Object[iChooseTableSize];
        int i2 = iChooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object objA = amu.a(objArr[i5], i5);
            int iHashCode = objA.hashCode();
            int iE = aly.e(iHashCode);
            while (true) {
                int i6 = iE & i2;
                Object obj = objArr2[i6];
                if (obj == null) {
                    objArr[i4] = objA;
                    objArr2[i6] = objA;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj.equals(objA)) {
                    break;
                }
                iE++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new anm(Objects.requireNonNull(objArr[0]));
        }
        if (chooseTableSize(i4) < iChooseTableSize / 2) {
            return construct(i4, objArr);
        }
        if (shouldTrim(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new ane(objArr, i3, objArr2, i2, i4);
    }

    public static int chooseTableSize(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < CUTOFF) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * DESIRED_LOAD_FACTOR < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        Preconditions.checkArgument(iMax < 1073741824, "collection too large");
        return 1073741824;
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

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new b().add(next).addAll((Iterator) it).build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length == 1) {
            return of((Object) eArr[0]);
        }
        return construct(eArr.length, (Object[]) eArr.clone());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.d(this);
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

    /* JADX INFO: loaded from: classes21.dex */
    static class d implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] d;

        d(Object[] objArr) {
            this.d = objArr;
        }

        Object readResolve() {
            return ImmutableSet.copyOf(this.d);
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new d(toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> b<E> builder() {
        return new b<>();
    }

    public static <E> b<E> builderWithExpectedSize(int i) {
        ale.b(i, "expectedSize");
        return new b<>(i);
    }

    public static class b<E> extends ImmutableCollection.ArrayBasedBuilder<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        Object[] f4381a;
        private int d;

        public b() {
            super(4);
        }

        b(int i) {
            super(i);
            this.f4381a = new Object[ImmutableSet.chooseTableSize(i)];
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b<E> add(E e) {
            Preconditions.checkNotNull(e);
            if (this.f4381a != null && ImmutableSet.chooseTableSize(this.size) <= this.f4381a.length) {
                e(e);
                return this;
            }
            this.f4381a = null;
            super.add((Object) e);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b<E> add(E... eArr) {
            if (this.f4381a != null) {
                for (E e : eArr) {
                    add(e);
                }
                return this;
            }
            super.add((Object[]) eArr);
            return this;
        }

        private void e(E e) {
            Objects.requireNonNull(this.f4381a);
            int length = this.f4381a.length;
            int iHashCode = e.hashCode();
            int iE = aly.e(iHashCode);
            while (true) {
                int i = iE & (length - 1);
                Object[] objArr = this.f4381a;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.d += iHashCode;
                    super.add((Object) e);
                    return;
                } else if (obj.equals(e)) {
                    return;
                } else {
                    iE = i + 1;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b<E> addAll(Iterable<? extends E> iterable) {
            Preconditions.checkNotNull(iterable);
            if (this.f4381a != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    add(it.next());
                }
                return this;
            }
            super.addAll(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b<E> addAll(Iterator<? extends E> it) {
            Preconditions.checkNotNull(it);
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b<E> d(b<E> bVar) {
            if (this.f4381a != null) {
                for (int i = 0; i < bVar.size; i++) {
                    add(Objects.requireNonNull(bVar.contents[i]));
                }
                return this;
            }
            addAll(bVar.contents, bVar.size);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<E> build() {
            ImmutableSet<E> immutableSetConstruct;
            int i = this.size;
            if (i == 0) {
                return ImmutableSet.of();
            }
            if (i == 1) {
                return ImmutableSet.of(Objects.requireNonNull(this.contents[0]));
            }
            if (this.f4381a == null || ImmutableSet.chooseTableSize(this.size) != this.f4381a.length) {
                immutableSetConstruct = ImmutableSet.construct(this.size, this.contents);
                this.size = immutableSetConstruct.size();
            } else {
                Object[] objArrCopyOf = ImmutableSet.shouldTrim(this.size, this.contents.length) ? Arrays.copyOf(this.contents, this.size) : this.contents;
                int i2 = this.d;
                Object[] objArr = this.f4381a;
                immutableSetConstruct = new ane<>(objArrCopyOf, i2, objArr, objArr.length - 1, this.size);
            }
            this.forceCopy = true;
            this.f4381a = null;
            return immutableSetConstruct;
        }
    }
}
