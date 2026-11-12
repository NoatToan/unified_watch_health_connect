package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Iterators;
import com.google.common.collect.ParametricNullness;
import com.google.common.collect.TransformedListIterator;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class aml {
    public static <E> ArrayList<E> e() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> a(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return a(iterable.iterator());
    }

    public static <E> ArrayList<E> a(Iterator<? extends E> it) {
        ArrayList<E> arrayListE = e();
        Iterators.a(arrayListE, it);
        return arrayListE;
    }

    public static <E> ArrayList<E> b(int i) {
        ale.b(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    public static <E> List<E> c(@ParametricNullness E e2, E[] eArr) {
        return new d(e2, eArr);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class d<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final E[] f550c;

        @ParametricNullness
        final E d;

        d(@ParametricNullness E e, E[] eArr) {
            this.d = e;
            this.f550c = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return apn.b(this.f550c.length, 1);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i) {
            Preconditions.checkElementIndex(i, size());
            return i == 0 ? this.d : this.f550c[i - 1];
        }
    }

    public static <F, T> List<T> a(List<F> list, Function<? super F, ? extends T> function) {
        if (list instanceof RandomAccess) {
            return new c(list, function);
        }
        return new b(list, function);
    }

    static class b<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Function<? super F, ? extends T> f547a;
        final List<F> e;

        b(List<F> list, Function<? super F, ? extends T> function) {
            this.e = (List) Preconditions.checkNotNull(list);
            this.f547a = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            this.e.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.e.size();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new TransformedListIterator<F, T>(this.e.listIterator(i)) { // from class: aml.b.2
                @Override // com.google.common.collect.TransformedIterator
                @ParametricNullness
                public T transform(@ParametricNullness F f) {
                    return b.this.f547a.apply(f);
                }
            };
        }
    }

    static class c<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Function<? super F, ? extends T> f549a;
        final List<F> e;

        c(List<F> list, Function<? super F, ? extends T> function) {
            this.e = (List) Preconditions.checkNotNull(list);
            this.f549a = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            this.e.subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i) {
            return this.f549a.apply(this.e.get(i));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new TransformedListIterator<F, T>(this.e.listIterator(i)) { // from class: aml.c.3
                @Override // com.google.common.collect.TransformedIterator
                public T transform(F f) {
                    return c.this.f549a.apply(f);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.e.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.f549a.apply(this.e.remove(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.e.size();
        }
    }

    public static int b(List<?> list) {
        Iterator<?> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~((i * 31) + (next == null ? 0 : next.hashCode())));
        }
        return i;
    }

    public static boolean a(List<?> list, @CheckForNull Object obj) {
        if (obj == Preconditions.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return Iterators.b(list.iterator(), (Iterator<?>) list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!Objects.equal(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static <E> boolean a(List<E> list, int i, Iterable<? extends E> iterable) {
        ListIterator<E> listIterator = list.listIterator(i);
        Iterator<? extends E> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z = true;
        }
        return z;
    }

    public static int e(List<?> list, @CheckForNull Object obj) {
        if (list instanceof RandomAccess) {
            return d(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int d(List<?> list, @CheckForNull Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int c(List<?> list, @CheckForNull Object obj) {
        if (list instanceof RandomAccess) {
            return b(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int b(List<?> list, @CheckForNull Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ListIterator<E> b(List<E> list, int i) {
        return new a(list).listIterator(i);
    }

    public static <E> List<E> b(List<E> list, int i, int i2) {
        List list2;
        if (list instanceof RandomAccess) {
            list2 = new e<E>(list) { // from class: aml.5
                @Override // java.util.AbstractList, java.util.List
                public ListIterator<E> listIterator(int i3) {
                    return this.f546b.listIterator(i3);
                }
            };
        } else {
            list2 = new a<E>(list) { // from class: aml.1
                @Override // java.util.AbstractList, java.util.List
                public ListIterator<E> listIterator(int i3) {
                    return this.f546b.listIterator(i3);
                }
            };
        }
        return list2.subList(i, i2);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class a<E> extends AbstractList<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<E> f546b;

        a(List<E> list) {
            this.f546b = (List) Preconditions.checkNotNull(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, @ParametricNullness E e) {
            this.f546b.add(i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
            return this.f546b.addAll(i, collection);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i) {
            return this.f546b.get(i);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E remove(int i) {
            return this.f546b.remove(i);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E set(int i, @ParametricNullness E e) {
            return this.f546b.set(i, e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return this.f546b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f546b.size();
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class e<E> extends a<E> implements RandomAccess {
        e(List<E> list) {
            super(list);
        }
    }

    static <T> List<T> c(Iterable<T> iterable) {
        return (List) iterable;
    }
}
