package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public static final int c = 1073741824;
    private static final double d = 0.7d;
    private static final int e = 751619276;

    @RetainedWith
    @NullableDecl
    @LazyInit
    private transient ImmutableList<E> b;

    public static class Builder<E> extends ImmutableCollection.a<E> {

        @VisibleForTesting
        @NullableDecl
        public Object[] e;
        private int f;

        public Builder() {
            super(4);
        }

        private void c(E e) {
            int length = this.e.length - 1;
            int iHashCode = e.hashCode();
            int iC = b1.c(iHashCode);
            while (true) {
                int i = iC & length;
                Object[] objArr = this.e;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.f += iHashCode;
                    super.add((Object) e);
                    return;
                } else if (obj.equals(e)) {
                    return;
                } else {
                    iC = i + 1;
                }
            }
        }

        public Builder(int i) {
            super(i);
            this.e = new Object[ImmutableSet.i(i)];
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
            ImmutableSet<E> immutableSetJ;
            int i = this.c;
            if (i == 0) {
                return ImmutableSet.of();
            }
            if (i == 1) {
                return ImmutableSet.of(this.b[0]);
            }
            if (this.e == null || ImmutableSet.i(i) != this.e.length) {
                immutableSetJ = ImmutableSet.j(this.c, this.b);
                this.c = immutableSetJ.size();
            } else {
                Object[] objArrCopyOf = ImmutableSet.n(this.c, this.b.length) ? Arrays.copyOf(this.b, this.c) : this.b;
                int i2 = this.f;
                Object[] objArr = this.e;
                immutableSetJ = new e2<>(objArrCopyOf, i2, objArr, objArr.length - 1, this.c);
            }
            this.d = true;
            this.e = null;
            return immutableSetJ;
        }

        @Override // com.google.common.collect.ImmutableCollection.a, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Preconditions.checkNotNull(iterable);
            if (this.e != null) {
                Iterator<? extends E> it2 = iterable.iterator();
                while (it2.hasNext()) {
                    add((Object) it2.next());
                }
            } else {
                super.addAll((Iterable) iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.a, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e) {
            Preconditions.checkNotNull(e);
            if (this.e != null && ImmutableSet.i(this.c) <= this.e.length) {
                c(e);
                return this;
            }
            this.e = null;
            super.add((Object) e);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it2) {
            Preconditions.checkNotNull(it2);
            while (it2.hasNext()) {
                add((Object) it2.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.a, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            if (this.e != null) {
                for (E e : eArr) {
                    add((Object) e);
                }
            } else {
                super.add((Object[]) eArr);
            }
            return this;
        }
    }

    public static class a implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] a;

        public a(Object[] objArr) {
            this.a = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf(this.a);
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    @Beta
    public static <E> Builder<E> builderWithExpectedSize(int i) {
        u.b(i, "expectedSize");
        return new Builder<>(i);
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.f()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    @VisibleForTesting
    static int i(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= e) {
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
    public static <E> ImmutableSet<E> j(int i, Object... objArr) {
        if (i == 0) {
            return of();
        }
        if (i == 1) {
            return of(objArr[0]);
        }
        int i2 = i(i);
        Object[] objArr2 = new Object[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object objA = ObjectArrays.a(objArr[i6], i6);
            int iHashCode = objA.hashCode();
            int iC = b1.c(iHashCode);
            while (true) {
                int i7 = iC & i3;
                Object obj = objArr2[i7];
                if (obj == null) {
                    objArr[i5] = objA;
                    objArr2[i7] = objA;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj.equals(objA)) {
                    break;
                }
                iC++;
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            return new l2(objArr[0], i4);
        }
        if (i(i5) < i2 / 2) {
            return j(i5, objArr);
        }
        if (n(i5, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new e2(objArr, i4, objArr2, i3, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static <E> ImmutableSet<E> of() {
        return e2.k;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.b;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListK = k();
        this.b = immutableListK;
        return immutableListK;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && m() && ((ImmutableSet) obj).m() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.b(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract UnmodifiableIterator<E> iterator();

    public ImmutableList<E> k() {
        return ImmutableList.g(toArray());
    }

    public boolean m() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new a(toArray());
    }

    public static <E> ImmutableSet<E> of(E e2) {
        return new l2(e2);
    }

    public static <E> ImmutableSet<E> of(E e2, E e3) {
        return j(2, e2, e3);
    }

    public static <E> ImmutableSet<E> of(E e2, E e3, E e4) {
        return j(3, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> of(E e2, E e3, E e4, E e5) {
        return j(4, e2, e3, e4, e5);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> of(E e2, E e3, E e4, E e5, E e6) {
        return j(5, e2, e3, e4, e5, e6);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return j(length, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it2) {
        if (!it2.hasNext()) {
            return of();
        }
        E next = it2.next();
        if (!it2.hasNext()) {
            return of((Object) next);
        }
        return new Builder().add((Object) next).addAll((Iterator) it2).build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return j(eArr.length, (Object[]) eArr.clone());
        }
        return of((Object) eArr[0]);
    }
}
