package com.google.common.collect;

import defpackage.c6i;
import defpackage.d0i;
import defpackage.d44;
import defpackage.t3h;
import defpackage.uaq;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] EMPTY_ARRAY = new Object[0];

    public static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f9021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9022b;
        public boolean c;

        public a(int i) {
            d44.b(i, "initialCapacity");
            this.f9021a = new Object[i];
            this.f9022b = 0;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        public b<E> b(E... eArr) {
            g(eArr, eArr.length);
            return this;
        }

        public a<E> f(E e) {
            c6i.o(e);
            h(this.f9022b + 1);
            Object[] objArr = this.f9021a;
            int i = this.f9022b;
            this.f9022b = i + 1;
            objArr[i] = e;
            return this;
        }

        public final void g(Object[] objArr, int i) {
            t3h.c(objArr, i);
            h(this.f9022b + i);
            System.arraycopy(objArr, 0, this.f9021a, this.f9022b, i);
            this.f9022b += i;
        }

        public final void h(int i) {
            Object[] objArr = this.f9021a;
            if (objArr.length < i) {
                this.f9021a = Arrays.copyOf(objArr, b.e(objArr.length, i));
                this.c = false;
            } else if (this.c) {
                this.f9021a = (Object[]) objArr.clone();
                this.c = false;
            }
        }
    }

    public static abstract class b<E> {
        public static int e(int i, int i2) {
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

        public abstract b<E> a(E e);

        public b<E> b(E... eArr) {
            for (E e : eArr) {
                a(e);
            }
            return this;
        }

        public b<E> c(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public b<E> d(Iterator<? extends E> it) {
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        return isEmpty() ? ImmutableList.of() : ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public int copyIntoArray(Object[] objArr, int i) {
        uaq<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object[] internalArray() {
        return null;
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract uaq<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    public Object writeReplace() {
        return new ImmutableList.d(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        c6i.o(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrInternalArray = internalArray();
            if (objArrInternalArray != null) {
                return (T[]) d0i.a(objArrInternalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = (T[]) t3h.e(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }
}
