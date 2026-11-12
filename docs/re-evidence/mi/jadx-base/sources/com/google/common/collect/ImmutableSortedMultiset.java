package com.google.common.collect;

import defpackage.c6i;
import defpackage.d44;
import defpackage.gcd;
import defpackage.ich;
import defpackage.xhe;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImmutableSortedMultiset<E> extends q<E> implements l0<E> {
    transient ImmutableSortedMultiset<E> descendingMultiset;

    public static class a<E> extends ImmutableMultiset.b<E> {
        public final Comparator<? super E> d;
        public E[] e;
        public int[] f;
        public int g;
        public boolean h;

        public a(Comparator<? super E> comparator) {
            super(true);
            this.d = (Comparator) c6i.o(comparator);
            this.e = (E[]) new Object[4];
            this.f = new int[4];
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e) {
            return j(e, 1);
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a<E> g(E... eArr) {
            for (E e : eArr) {
                a(e);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<E> h(Iterable<? extends E> iterable) {
            if (iterable instanceof u) {
                for (u.a<E> aVar : ((u) iterable).entrySet()) {
                    j(aVar.getElement(), aVar.getCount());
                }
            } else {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<E> i(Iterator<? extends E> it) {
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<E> j(E e, int i) {
            c6i.o(e);
            d44.b(i, "occurrences");
            if (i == 0) {
                return this;
            }
            u();
            E[] eArr = this.e;
            int i2 = this.g;
            eArr[i2] = e;
            this.f[i2] = i;
            this.g = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMultiset<E> k() {
            t();
            int i = this.g;
            if (i == 0) {
                return ImmutableSortedMultiset.emptyMultiset(this.d);
            }
            e0 e0Var = (e0) ImmutableSortedSet.construct(this.d, i, this.e);
            long[] jArr = new long[this.g + 1];
            int i2 = 0;
            while (i2 < this.g) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + ((long) this.f[i2]);
                i2 = i3;
            }
            this.h = true;
            return new d0(e0Var, jArr, 0, this.g);
        }

        public final void s(boolean z) {
            int i = this.g;
            if (i == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.e, i);
            Arrays.sort(objArr, this.d);
            int i2 = 1;
            for (int i3 = 1; i3 < objArr.length; i3++) {
                if (this.d.compare((Object) objArr[i2 - 1], (Object) objArr[i3]) < 0) {
                    objArr[i2] = objArr[i3];
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, this.g, (Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.g;
                if (i4 > i5 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, gcd.b(i5, (i5 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i6 = 0; i6 < this.g; i6++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i2, this.e[i6], this.d);
                int i7 = this.f[i6];
                if (i7 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i7;
                } else {
                    iArr[iBinarySearch] = ~i7;
                }
            }
            this.e = (E[]) objArr;
            this.f = iArr;
            this.g = i2;
        }

        public final void t() {
            s(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.g;
                if (i >= i3) {
                    Arrays.fill(this.e, i2, i3, (Object) null);
                    Arrays.fill(this.f, i2, this.g, 0);
                    this.g = i2;
                    return;
                }
                int[] iArr = this.f;
                int i4 = iArr[i];
                if (i4 > 0) {
                    E[] eArr = this.e;
                    eArr[i2] = eArr[i];
                    iArr[i2] = i4;
                    i2++;
                }
                i++;
            }
        }

        public final void u() {
            int i = this.g;
            E[] eArr = this.e;
            if (i == eArr.length) {
                s(true);
            } else if (this.h) {
                this.e = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.h = false;
        }
    }

    public static final class b<E> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparator<? super E> f9078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E[] f9079b;
        public final int[] c;

        public b(l0<E> l0Var) {
            this.f9078a = l0Var.comparator();
            int size = l0Var.entrySet().size();
            this.f9079b = (E[]) new Object[size];
            this.c = new int[size];
            int i = 0;
            for (u.a<E> aVar : l0Var.entrySet()) {
                this.f9079b[i] = aVar.getElement();
                this.c[i] = aVar.getCount();
                i++;
            }
        }

        public Object readResolve() {
            int length = this.f9079b.length;
            a aVar = new a(this.f9078a);
            for (int i = 0; i < length; i++) {
                aVar.j(this.f9079b[i], this.c[i]);
            }
            return aVar.k();
        }
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset copyOf(Comparable[] comparableArr) {
        return copyOf(ich.e(), Arrays.asList(comparableArr));
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSorted(l0<E> l0Var) {
        return copyOfSortedEntries(l0Var.comparator(), xhe.h(l0Var.entrySet()));
    }

    private static <E> ImmutableSortedMultiset<E> copyOfSortedEntries(Comparator<? super E> comparator, Collection<u.a<E>> collection) {
        if (collection.isEmpty()) {
            return emptyMultiset(comparator);
        }
        ImmutableList.a aVar = new ImmutableList.a(collection.size());
        long[] jArr = new long[collection.size() + 1];
        int i = 0;
        for (u.a<E> aVar2 : collection) {
            aVar.a(aVar2.getElement());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + ((long) aVar2.getCount());
            i = i2;
        }
        return new d0(new e0(aVar.k(), comparator), jArr, 0, collection.size());
    }

    public static <E> ImmutableSortedMultiset<E> emptyMultiset(Comparator<? super E> comparator) {
        return ich.e().equals(comparator) ? (ImmutableSortedMultiset<E>) d0.f : new d0(comparator);
    }

    public static <E extends Comparable<?>> a<E> naturalOrder() {
        return new a<>(ich.e());
    }

    public static <E> ImmutableSortedMultiset<E> of() {
        return (ImmutableSortedMultiset<E>) d0.f;
    }

    public static <E> a<E> orderedBy(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    public static <E extends Comparable<?>> a<E> reverseOrder() {
        return new a<>(ich.e().h());
    }

    @Override // com.google.common.collect.l0, defpackage.n4n
    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.u
    public abstract /* synthetic */ int count(Object obj);

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.u
    public abstract ImmutableSortedSet<E> elementSet();

    @Override // com.google.common.collect.l0
    public abstract /* synthetic */ u.a firstEntry();

    @Override // com.google.common.collect.l0
    public abstract ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType);

    @Override // com.google.common.collect.l0
    public abstract /* synthetic */ u.a lastEntry();

    @Override // com.google.common.collect.l0
    @Deprecated
    public final u.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l0
    @Deprecated
    public final u.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l0
    public abstract ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType);

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new b(this);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(ich.e(), iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable) {
        return new d0((e0) ImmutableSortedSet.of(comparable), new long[]{0, 1}, 0, 1);
    }

    @Override // com.google.common.collect.l0
    public ImmutableSortedMultiset<E> descendingMultiset() {
        ImmutableSortedMultiset<E> immutableSortedMultisetEmptyMultiset = this.descendingMultiset;
        if (immutableSortedMultisetEmptyMultiset == null) {
            immutableSortedMultisetEmptyMultiset = isEmpty() ? emptyMultiset(ich.a(comparator()).h()) : new l<>(this);
            this.descendingMultiset = immutableSortedMultisetEmptyMultiset;
        }
        return immutableSortedMultisetEmptyMultiset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.l0
    public ImmutableSortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        c6i.k(comparator().compare(e, e2) <= 0, "Expected lowerBound <= upperBound but %s > %s", e, e2);
        return tailMultiset((Object) e, boundType).headMultiset((Object) e2, boundType2);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> it) {
        return copyOf(ich.e(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2) {
        return copyOf(ich.e(), Arrays.asList(comparable, comparable2));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        c6i.o(comparator);
        return new a(comparator).i(it).k();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return copyOf(ich.e(), Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return copyOf(ich.e(), Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? copyOfSortedEntries(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        return new a(comparator).h(iterable).k();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return copyOf(ich.e(), Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        ArrayList arrayListJ = xhe.j(comparableArr.length + 6);
        Collections.addAll(arrayListJ, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(arrayListJ, comparableArr);
        return copyOf(ich.e(), arrayListJ);
    }
}
