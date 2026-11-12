package com.google.common.collect;

import com.amap.api.mapcore.util.hl;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
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
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public abstract class Ordering<T> implements Comparator<T> {
    public static final int a = 1;
    public static final int b = -1;

    @VisibleForTesting
    public static class a extends Ordering<Object> {
        private final AtomicInteger c = new AtomicInteger(0);
        private final ConcurrentMap<Object, Integer> d = w1.k(new MapMaker()).makeMap();

        private Integer b(Object obj) {
            Integer num = this.d.get(obj);
            if (num != null) {
                return num;
            }
            Integer numValueOf = Integer.valueOf(this.c.getAndIncrement());
            Integer numPutIfAbsent = this.d.putIfAbsent(obj, numValueOf);
            return numPutIfAbsent != null ? numPutIfAbsent : numValueOf;
        }

        public int c(Object obj) {
            return System.identityHashCode(obj);
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Object obj, Object obj2) {
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
            int iCompareTo = b(obj).compareTo(b(obj2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    public static class b {
        public static final Ordering<Object> a = new a();

        private b() {
        }
    }

    @VisibleForTesting
    public static class c extends ClassCastException {
        private static final long serialVersionUID = 0;
        public final Object a;

        public c(Object obj) {
            super("Cannot compare value: " + obj);
            this.a = obj;
        }
    }

    @GwtCompatible(serializable = true)
    public static Ordering<Object> allEqual() {
        return p.c;
    }

    public static Ordering<Object> arbitrary() {
        return b.a;
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> explicit(List<T> list) {
        return new l0(list);
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> from(Comparator<T> comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new z(comparator);
    }

    @GwtCompatible(serializable = true)
    public static <C extends Comparable> Ordering<C> natural() {
        return r1.e;
    }

    @GwtCompatible(serializable = true)
    public static Ordering<Object> usingToString() {
        return a3.c;
    }

    public <T2 extends T> Ordering<Map.Entry<T2, ?>> a() {
        return (Ordering<Map.Entry<T2, ?>>) onResultOf(Maps.v());
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, @NullableDecl T t) {
        return Collections.binarySearch(list, t, this);
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);

    @GwtCompatible(serializable = true)
    public <U extends T> Ordering<U> compound(Comparator<? super U> comparator) {
        return new a0(this, (Comparator) Preconditions.checkNotNull(comparator));
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i) {
        return reverse().leastOf(iterable, i);
    }

    @CanIgnoreReturnValue
    public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return true;
        }
        T next = it2.next();
        while (it2.hasNext()) {
            T next2 = it2.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return true;
        }
        T next = it2.next();
        while (it2.hasNext()) {
            T next2 = it2.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
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

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<Iterable<S>> lexicographical() {
        return new o1(this);
    }

    @CanIgnoreReturnValue
    public <E extends T> E max(Iterator<E> it2) {
        E next = it2.next();
        while (it2.hasNext()) {
            next = (E) max(next, it2.next());
        }
        return next;
    }

    @CanIgnoreReturnValue
    public <E extends T> E min(Iterator<E> it2) {
        E next = it2.next();
        while (it2.hasNext()) {
            next = (E) min(next, it2.next());
        }
        return next;
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> nullsFirst() {
        return new s1(this);
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> nullsLast() {
        return new t1(this);
    }

    @GwtCompatible(serializable = true)
    public <F> Ordering<F> onResultOf(Function<F, ? extends T> function) {
        return new s(function, this);
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> reverse() {
        return new j2(this);
    }

    @CanIgnoreReturnValue
    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] objArrF = Iterables.f(iterable);
        Arrays.sort(objArrF, this);
        return Lists.newArrayList(Arrays.asList(objArrF));
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new a0(iterable);
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> explicit(T t, T... tArr) {
        return explicit(Lists.asList(t, tArr));
    }

    @GwtCompatible(serializable = true)
    @Deprecated
    public static <T> Ordering<T> from(Ordering<T> ordering) {
        return (Ordering) Preconditions.checkNotNull(ordering);
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it2, int i) {
        return reverse().leastOf(it2, i);
    }

    @CanIgnoreReturnValue
    public <E extends T> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    @CanIgnoreReturnValue
    public <E extends T> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CanIgnoreReturnValue
    public <E extends T> E max(@NullableDecl E e, @NullableDecl E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CanIgnoreReturnValue
    public <E extends T> E min(@NullableDecl E e, @NullableDecl E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    @CanIgnoreReturnValue
    public <E extends T> E max(@NullableDecl E e, @NullableDecl E e2, @NullableDecl E e3, E... eArr) {
        E e4 = (E) max(max(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) max(e4, e5);
        }
        return e4;
    }

    @CanIgnoreReturnValue
    public <E extends T> E min(@NullableDecl E e, @NullableDecl E e2, @NullableDecl E e3, E... eArr) {
        E e4 = (E) min(min(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) min(e4, e5);
        }
        return e4;
    }

    public <E extends T> List<E> leastOf(Iterator<E> it2, int i) {
        Preconditions.checkNotNull(it2);
        u.b(i, hl.k);
        if (i == 0 || !it2.hasNext()) {
            return Collections.emptyList();
        }
        if (i >= 1073741823) {
            ArrayList arrayListNewArrayList = Lists.newArrayList(it2);
            Collections.sort(arrayListNewArrayList, this);
            if (arrayListNewArrayList.size() > i) {
                arrayListNewArrayList.subList(i, arrayListNewArrayList.size()).clear();
            }
            arrayListNewArrayList.trimToSize();
            return Collections.unmodifiableList(arrayListNewArrayList);
        }
        w2 w2VarD = w2.d(i, this);
        w2VarD.g(it2);
        return w2VarD.j();
    }
}
