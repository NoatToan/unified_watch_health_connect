package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import defpackage.ajx;
import defpackage.akc;
import defpackage.ale;
import defpackage.ali;
import defpackage.alp;
import defpackage.alu;
import defpackage.aml;
import defpackage.amm;
import defpackage.amn;
import defpackage.amo;
import defpackage.amq;
import defpackage.amr;
import defpackage.amz;
import defpackage.anh;
import defpackage.anz;
import defpackage.aoc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class Ordering<T> implements Comparator<T> {
    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;

    /* JADX INFO: loaded from: classes21.dex */
    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Ordering<Object> f4472b = new e();
    }

    @Override // java.util.Comparator
    public abstract int compare(@ParametricNullness T t, @ParametricNullness T t2);

    public static <C extends Comparable> Ordering<C> natural() {
        return amo.f558b;
    }

    public static <T> Ordering<T> from(Comparator<T> comparator) {
        if (comparator instanceof Ordering) {
            return (Ordering) comparator;
        }
        return new ali(comparator);
    }

    @Deprecated
    public static <T> Ordering<T> from(Ordering<T> ordering) {
        return (Ordering) Preconditions.checkNotNull(ordering);
    }

    public static <T> Ordering<T> explicit(List<T> list) {
        return new alu(list);
    }

    public static <T> Ordering<T> explicit(T t, T... tArr) {
        return explicit(aml.c(t, tArr));
    }

    public static Ordering<Object> allEqual() {
        return ajx.f493c;
    }

    public static Ordering<Object> usingToString() {
        return anz.f615a;
    }

    public static Ordering<Object> arbitrary() {
        return c.f4472b;
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class e extends Ordering<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f4474b = new AtomicInteger(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ConcurrentMap<Object, Integer> f4473a = amz.b(new MapMaker()).g();

        e() {
        }

        private Integer a(Object obj) {
            Integer numPutIfAbsent;
            Integer numValueOf = this.f4473a.get(obj);
            return (numValueOf != null || (numPutIfAbsent = this.f4473a.putIfAbsent(obj, (numValueOf = Integer.valueOf(this.f4474b.getAndIncrement())))) == null) ? numValueOf : numPutIfAbsent;
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(@CheckForNull Object obj, @CheckForNull Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int iC = c(obj);
            int iC2 = c(obj2);
            if (iC != iC2) {
                return iC < iC2 ? -1 : 1;
            }
            int iCompareTo = a(obj).compareTo(a(obj2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }

        int c(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public <S extends T> Ordering<S> reverse() {
        return new anh(this);
    }

    public <S extends T> Ordering<S> nullsFirst() {
        return new amq(this);
    }

    public <S extends T> Ordering<S> nullsLast() {
        return new amr(this);
    }

    public <F> Ordering<F> onResultOf(Function<F, ? extends T> function) {
        return new akc(function, this);
    }

    public <T2 extends T> Ordering<Map.Entry<T2, ?>> onKeys() {
        return (Ordering<Map.Entry<T2, ?>>) onResultOf(Maps.e());
    }

    public <U extends T> Ordering<U> compound(Comparator<? super U> comparator) {
        return new alp(this, (Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <T> Ordering<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new alp(iterable);
    }

    public <S extends T> Ordering<Iterable<S>> lexicographical() {
        return new amm(this);
    }

    @ParametricNullness
    public <E extends T> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    @ParametricNullness
    public <E extends T> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ParametricNullness
    public <E extends T> E min(@ParametricNullness E e2, @ParametricNullness E e3) {
        return compare(e2, e3) <= 0 ? e2 : e3;
    }

    @ParametricNullness
    public <E extends T> E min(@ParametricNullness E e2, @ParametricNullness E e3, @ParametricNullness E e4, E... eArr) {
        E e5 = (E) min(min(e2, e3), e4);
        for (E e6 : eArr) {
            e5 = (E) min(e5, e6);
        }
        return e5;
    }

    @ParametricNullness
    public <E extends T> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    @ParametricNullness
    public <E extends T> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ParametricNullness
    public <E extends T> E max(@ParametricNullness E e2, @ParametricNullness E e3) {
        return compare(e2, e3) >= 0 ? e2 : e3;
    }

    @ParametricNullness
    public <E extends T> E max(@ParametricNullness E e2, @ParametricNullness E e3, @ParametricNullness E e4, E... eArr) {
        E e5 = (E) max(max(e2, e3), e4);
        for (E e6 : eArr) {
            e5 = (E) max(e5, e6);
        }
        return e5;
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= ((long) i) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = Arrays.copyOf(array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i);
    }

    public <E extends T> List<E> leastOf(Iterator<E> it, int i) {
        Preconditions.checkNotNull(it);
        ale.b(i, "k");
        if (i == 0 || !it.hasNext()) {
            return Collections.EMPTY_LIST;
        }
        if (i >= 1073741823) {
            ArrayList arrayListA = aml.a(it);
            Collections.sort(arrayListA, this);
            if (arrayListA.size() > i) {
                arrayListA.subList(i, arrayListA.size()).clear();
            }
            arrayListA.trimToSize();
            return Collections.unmodifiableList(arrayListA);
        }
        aoc aocVarA = aoc.a(i, this);
        aocVarA.e(it);
        return aocVarA.a();
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i) {
        return reverse().leastOf(iterable, i);
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it, int i) {
        return reverse().leastOf(it, i);
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] objArrE = amn.e(iterable);
        Arrays.sort(objArrE, this);
        return aml.a(Arrays.asList(objArrE));
    }

    public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, @ParametricNullness T t) {
        return Collections.binarySearch(list, t, this);
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class a extends ClassCastException {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f4471c;

        public a(Object obj) {
            super("Cannot compare value: " + obj);
            this.f4471c = obj;
        }
    }
}
