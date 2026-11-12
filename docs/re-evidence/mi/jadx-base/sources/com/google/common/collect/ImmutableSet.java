package com.google.common.collect;

import defpackage.c6i;
import defpackage.d44;
import defpackage.qlb;
import defpackage.t3h;
import defpackage.uaq;
import defpackage.wem;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;
    private transient ImmutableList<E> asList;

    public static class a<E> extends ImmutableCollection.a<E> {
        public Object[] d;
        public int e;

        public a() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e) {
            c6i.o(e);
            if (this.d != null && ImmutableSet.chooseTableSize(this.f9022b) <= this.d.length) {
                l(e);
                return this;
            }
            this.d = null;
            super.f(e);
            return this;
        }

        public a<E> j(E... eArr) {
            if (this.d != null) {
                for (E e : eArr) {
                    a(e);
                }
            } else {
                super.b(eArr);
            }
            return this;
        }

        public a<E> k(Iterator<? extends E> it) {
            c6i.o(it);
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public final void l(E e) {
            Objects.requireNonNull(this.d);
            int length = this.d.length - 1;
            int iHashCode = e.hashCode();
            int iC = qlb.c(iHashCode);
            while (true) {
                int i = iC & length;
                Object[] objArr = this.d;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.e += iHashCode;
                    super.f(e);
                    return;
                } else if (obj.equals(e)) {
                    return;
                } else {
                    iC = i + 1;
                }
            }
        }

        public ImmutableSet<E> m() {
            ImmutableSet<E> immutableSetConstruct;
            int i = this.f9022b;
            if (i == 0) {
                return ImmutableSet.of();
            }
            if (i == 1) {
                Object obj = this.f9021a[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.of(obj);
            }
            if (this.d == null || ImmutableSet.chooseTableSize(i) != this.d.length) {
                immutableSetConstruct = ImmutableSet.construct(this.f9022b, this.f9021a);
                this.f9022b = immutableSetConstruct.size();
            } else {
                Object[] objArrCopyOf = ImmutableSet.shouldTrim(this.f9022b, this.f9021a.length) ? Arrays.copyOf(this.f9021a, this.f9022b) : this.f9021a;
                int i2 = this.e;
                Object[] objArr = this.d;
                immutableSetConstruct = new c0<>(objArrCopyOf, i2, objArr, objArr.length - 1, this.f9022b);
            }
            this.c = true;
            this.d = null;
            return immutableSetConstruct;
        }

        public a(int i) {
            super(i);
            this.d = new Object[ImmutableSet.chooseTableSize(i)];
        }
    }

    public static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f9072a;

        public b(Object[] objArr) {
            this.f9072a = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf(this.f9072a);
        }
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    public static <E> a<E> builderWithExpectedSize(int i) {
        d44.b(i, "expectedSize");
        return new a<>(i);
    }

    public static int chooseTableSize(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= CUTOFF) {
            c6i.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * DESIRED_LOAD_FACTOR < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSet<E> construct(int i, Object... objArr) {
        if (i == 0) {
            return of();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return of(obj);
        }
        int iChooseTableSize = chooseTableSize(i);
        Object[] objArr2 = new Object[iChooseTableSize];
        int i2 = iChooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object objA = t3h.a(objArr[i5], i5);
            int iHashCode = objA.hashCode();
            int iC = qlb.c(iHashCode);
            while (true) {
                int i6 = iC & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = objA;
                    objArr2[i6] = objA;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iC++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new wem(obj3);
        }
        if (chooseTableSize(i4) < iChooseTableSize / 2) {
            return construct(i4, objArr);
        }
        if (shouldTrim(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new c0(objArr, i3, objArr2, i2, i4);
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

    public static <E> ImmutableSet<E> of() {
        return c0.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
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
        return i0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return i0.b(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract uaq<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new b(toArray());
    }

    public static <E> ImmutableSet<E> of(E e) {
        return new wem(e);
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

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        c6i.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
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

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new a().a(next).k(it).m();
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
