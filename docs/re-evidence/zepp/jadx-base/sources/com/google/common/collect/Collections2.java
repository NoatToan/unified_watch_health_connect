package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.math.IntMath;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public final class Collections2 {

    public static class a<E> extends AbstractCollection<E> {
        public final Collection<E> a;
        public final Predicate<? super E> b;

        public a(Collection<E> collection, Predicate<? super E> predicate) {
            this.a = collection;
            this.b = predicate;
        }

        public a<E> a(Predicate<? super E> predicate) {
            return new a<>(this.a, Predicates.and(this.b, predicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e) {
            Preconditions.checkArgument(this.b.apply(e));
            return this.a.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it2 = collection.iterator();
            while (it2.hasNext()) {
                Preconditions.checkArgument(this.b.apply(it2.next()));
            }
            return this.a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            Iterables.removeIf(this.a, this.b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (Collections2.g(this.a, obj)) {
                return this.b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return Collections2.c(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !Iterables.any(this.a, this.b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return Iterators.filter(this.a.iterator(), this.b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it2 = this.a.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                E next = it2.next();
                if (this.b.apply(next) && collection.contains(next)) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it2 = this.a.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                E next = it2.next();
                if (this.b.apply(next) && !collection.contains(next)) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it2 = this.a.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (this.b.apply(it2.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.newArrayList(iterator()).toArray(tArr);
        }
    }

    public static final class b<E> extends AbstractCollection<List<E>> {
        public final ImmutableList<E> a;
        public final Comparator<? super E> b;
        public final int c;

        public b(Iterable<E> iterable, Comparator<? super E> comparator) {
            ImmutableList<E> immutableListSortedCopyOf = ImmutableList.sortedCopyOf(comparator, iterable);
            this.a = immutableListSortedCopyOf;
            this.b = comparator;
            this.c = a(immutableListSortedCopyOf, comparator);
        }

        private static <E> int a(List<E> list, Comparator<? super E> comparator) {
            int i = 1;
            int iSaturatedMultiply = 1;
            int i2 = 1;
            while (i < list.size()) {
                if (comparator.compare(list.get(i - 1), list.get(i)) < 0) {
                    iSaturatedMultiply = IntMath.saturatedMultiply(iSaturatedMultiply, IntMath.binomial(i, i2));
                    i2 = 0;
                    if (iSaturatedMultiply == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                }
                i++;
                i2++;
            }
            return IntMath.saturatedMultiply(iSaturatedMultiply, IntMath.binomial(i, i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return Collections2.e(this.a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new c(this.a, this.b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.c;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(" + this.a + ")";
        }
    }

    public static final class c<E> extends AbstractIterator<List<E>> {

        @NullableDecl
        public List<E> c;
        public final Comparator<? super E> d;

        public c(List<E> list, Comparator<? super E> comparator) {
            this.c = Lists.newArrayList(list);
            this.d = comparator;
        }

        public void b() {
            int iD = d();
            if (iD == -1) {
                this.c = null;
                return;
            }
            Collections.swap(this.c, iD, e(iD));
            Collections.reverse(this.c.subList(iD + 1, this.c.size()));
        }

        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<E> computeNext() {
            List<E> list = this.c;
            if (list == null) {
                return endOfData();
            }
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) list);
            b();
            return immutableListCopyOf;
        }

        public int d() {
            for (int size = this.c.size() - 2; size >= 0; size--) {
                if (this.d.compare(this.c.get(size), this.c.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        public int e(int i) {
            E e = this.c.get(i);
            for (int size = this.c.size() - 1; size > i; size--) {
                if (this.d.compare(e, this.c.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    public static final class d<E> extends AbstractCollection<List<E>> {
        public final ImmutableList<E> a;

        public d(ImmutableList<E> immutableList) {
            this.a = immutableList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return Collections2.e(this.a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new e(this.a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return IntMath.factorial(this.a.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(" + this.a + ")";
        }
    }

    public static class e<E> extends AbstractIterator<List<E>> {
        public final List<E> c;
        public final int[] d;
        public final int[] e;
        public int f;

        public e(List<E> list) {
            this.c = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.d = iArr;
            int[] iArr2 = new int[size];
            this.e = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f = Integer.MAX_VALUE;
        }

        public void b() {
            int size = this.c.size() - 1;
            this.f = size;
            if (size == -1) {
                return;
            }
            int i = 0;
            while (true) {
                int[] iArr = this.d;
                int i2 = this.f;
                int i3 = iArr[i2] + this.e[i2];
                if (i3 < 0) {
                    d();
                } else if (i3 != i2 + 1) {
                    Collections.swap(this.c, (i2 - iArr[i2]) + i, (i2 - i3) + i);
                    this.d[this.f] = i3;
                    return;
                } else {
                    if (i2 == 0) {
                        return;
                    }
                    i++;
                    d();
                }
            }
        }

        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<E> computeNext() {
            if (this.f <= 0) {
                return endOfData();
            }
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.c);
            b();
            return immutableListCopyOf;
        }

        public void d() {
            int[] iArr = this.e;
            int i = this.f;
            iArr[i] = -iArr[i];
            this.f = i - 1;
        }
    }

    public static class f<F, T> extends AbstractCollection<T> {
        public final Collection<F> a;
        public final Function<? super F, ? extends T> b;

        public f(Collection<F> collection, Function<? super F, ? extends T> function) {
            this.a = (Collection) Preconditions.checkNotNull(collection);
            this.b = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.transform(this.a.iterator(), this.b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.a.size();
        }
    }

    private Collections2() {
    }

    public static <T> Collection<T> b(Iterable<T> iterable) {
        return (Collection) iterable;
    }

    public static boolean c(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it2 = collection2.iterator();
        while (it2.hasNext()) {
            if (!collection.contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    private static <E> u1<E> d(Collection<E> collection) {
        u1<E> u1Var = new u1<>();
        for (E e2 : collection) {
            u1Var.v(e2, u1Var.g(e2) + 1);
        }
        return u1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        u1 u1VarD = d(list);
        u1 u1VarD2 = d(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (u1VarD.l(i) != u1VarD2.g(u1VarD.j(i))) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder f(int i) {
        u.b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }

    public static <E> Collection<E> filter(Collection<E> collection, Predicate<? super E> predicate) {
        return collection instanceof a ? ((a) collection).a(predicate) : new a((Collection) Preconditions.checkNotNull(collection), (Predicate) Preconditions.checkNotNull(predicate));
    }

    public static boolean g(Collection<?> collection, @NullableDecl Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean h(Collection<?> collection, @NullableDecl Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static String i(Collection<?> collection) {
        StringBuilder sbF = f(collection.size());
        sbF.append(JsonLexerKt.BEGIN_LIST);
        boolean z = true;
        for (Object obj : collection) {
            if (!z) {
                sbF.append(", ");
            }
            z = false;
            if (obj == collection) {
                sbF.append("(this Collection)");
            } else {
                sbF.append(obj);
            }
        }
        sbF.append(JsonLexerKt.END_LIST);
        return sbF.toString();
    }

    @Beta
    public static <E extends Comparable<? super E>> Collection<List<E>> orderedPermutations(Iterable<E> iterable) {
        return orderedPermutations(iterable, Ordering.natural());
    }

    @Beta
    public static <E> Collection<List<E>> permutations(Collection<E> collection) {
        return new d(ImmutableList.copyOf((Collection) collection));
    }

    public static <F, T> Collection<T> transform(Collection<F> collection, Function<? super F, T> function) {
        return new f(collection, function);
    }

    @Beta
    public static <E> Collection<List<E>> orderedPermutations(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new b(iterable, comparator);
    }
}
