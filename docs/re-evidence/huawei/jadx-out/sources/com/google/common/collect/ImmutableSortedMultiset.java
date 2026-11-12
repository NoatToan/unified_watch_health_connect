package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.ale;
import defpackage.aln;
import defpackage.aml;
import defpackage.ang;
import defpackage.ani;
import defpackage.apn;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedMultiset<E> extends ImmutableMultiset<E> implements SortedMultiset<E> {
    private static final long serialVersionUID = 912559;

    @CheckForNull
    @LazyInit
    transient ImmutableSortedMultiset<E> descendingMultiset;

    public static /* synthetic */ int lambda$toImmutableSortedMultiset$0(Object obj) {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedMultisetBridge
    public abstract ImmutableSortedSet<E> elementSet();

    public abstract ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType);

    public abstract ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType);

    static <E> Collector<E, ?, ImmutableSortedMultiset<E>> toImmutableSortedMultiset(Comparator<? super E> comparator) {
        return toImmutableSortedMultiset(comparator, Function.identity(), new ToIntFunction() { // from class: ami
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$0(obj);
            }
        });
    }

    static <T, E> Collector<T, ?, ImmutableSortedMultiset<E>> toImmutableSortedMultiset(final Comparator<? super E> comparator, final Function<? super T, ? extends E> function, final ToIntFunction<? super T> toIntFunction) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        return Collector.of(new Supplier() { // from class: amj
            @Override // java.util.function.Supplier
            public final Object get() {
                return TreeMultiset.c(comparator);
            }
        }, new BiConsumer() { // from class: amk
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ImmutableSortedMultiset.mapAndAdd(obj2, (Multiset) obj, function, toIntFunction);
            }
        }, new BinaryOperator() { // from class: amg
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$3((Multiset) obj, (Multiset) obj2);
            }
        }, new Function() { // from class: amh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSortedMultiset.copyOfSortedEntries(comparator, ((Multiset) obj).entrySet());
            }
        }, new Collector.Characteristics[0]);
    }

    public static /* synthetic */ Multiset lambda$toImmutableSortedMultiset$3(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T, E> void mapAndAdd(T t, Multiset<E> multiset, Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        multiset.add(Preconditions.checkNotNull(function.apply(t)), toIntFunction.applyAsInt(t));
    }

    public static <E> ImmutableSortedMultiset<E> of() {
        return (ImmutableSortedMultiset<E>) ang.f598b;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable) {
        return new ang((ani) ImmutableSortedSet.of(comparable), new long[]{0, 1}, 0, 1);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        ArrayList arrayListB = aml.b(comparableArr.length + 6);
        Collections.addAll(arrayListB, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(arrayListB, comparableArr);
        return copyOf(Ordering.natural(), arrayListB);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset copyOf(Comparable[] comparableArr) {
        return copyOf(Ordering.natural(), Arrays.asList(comparableArr));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        Preconditions.checkNotNull(comparator);
        return new c(comparator).addAll(it).build();
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? copyOfSortedEntries(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        return new c(comparator).addAll(iterable).build();
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSorted(SortedMultiset<E> sortedMultiset) {
        return copyOfSortedEntries(sortedMultiset.comparator(), aml.a(sortedMultiset.entrySet()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSortedMultiset<E> copyOfSortedEntries(Comparator<? super E> comparator, Collection<Multiset.Entry<E>> collection) {
        if (collection.isEmpty()) {
            return emptyMultiset(comparator);
        }
        ImmutableList.c cVar = new ImmutableList.c(collection.size());
        long[] jArr = new long[collection.size() + 1];
        int i = 0;
        for (Multiset.Entry<E> entry : collection) {
            cVar.add(entry.getElement());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + ((long) entry.getCount());
            i = i2;
        }
        return new ang(new ani(cVar.build(), comparator), jArr, 0, collection.size());
    }

    protected static <E> ImmutableSortedMultiset<E> emptyMultiset(Comparator<? super E> comparator) {
        if (Ordering.natural().equals(comparator)) {
            return (ImmutableSortedMultiset<E>) ang.f598b;
        }
        return new ang(comparator);
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    public ImmutableSortedMultiset<E> descendingMultiset() {
        ImmutableSortedMultiset<E> alnVar = this.descendingMultiset;
        if (alnVar == null) {
            if (isEmpty()) {
                alnVar = emptyMultiset(Ordering.from(comparator()).reverse());
            } else {
                alnVar = new aln<>(this);
            }
            this.descendingMultiset = alnVar;
        }
        return alnVar;
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    @Deprecated
    public final Multiset.Entry<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    @Deprecated
    public final Multiset.Entry<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        Preconditions.checkArgument(comparator().compare(e, e2) <= 0, "Expected lowerBound <= upperBound but %s > %s", e, e2);
        return tailMultiset((Object) e, boundType).headMultiset((Object) e2, boundType2);
    }

    public static <E> c<E> orderedBy(Comparator<E> comparator) {
        return new c<>(comparator);
    }

    public static <E extends Comparable<?>> c<E> reverseOrder() {
        return new c<>(Ordering.natural().reverse());
    }

    public static <E extends Comparable<?>> c<E> naturalOrder() {
        return new c<>(Ordering.natural());
    }

    public static class c<E> extends ImmutableMultiset.a<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        E[] f4385a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Comparator<? super E> f4386c;
        private int[] f;
        private int g;
        private boolean j;

        public c(Comparator<? super E> comparator) {
            super(true);
            this.f4386c = (Comparator) Preconditions.checkNotNull(comparator);
            this.f4385a = (E[]) new Object[4];
            this.f = new int[4];
        }

        private void d() {
            int i = this.g;
            E[] eArr = this.f4385a;
            if (i == eArr.length) {
                c(true);
            } else if (this.j) {
                this.f4385a = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.j = false;
        }

        private void c(boolean z) {
            int i = this.g;
            if (i == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f4385a, i);
            Arrays.sort(objArr, this.f4386c);
            int i2 = 1;
            for (int i3 = 1; i3 < objArr.length; i3++) {
                if (this.f4386c.compare((Object) objArr[i2 - 1], (Object) objArr[i3]) < 0) {
                    objArr[i2] = objArr[i3];
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, this.g, (Object) null);
            if (z) {
                int i4 = this.g;
                if (i2 * 4 > i4 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, apn.b(i4, (i4 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i5 = 0; i5 < this.g; i5++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i2, this.f4385a[i5], this.f4386c);
                int i6 = this.f[i5];
                if (i6 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i6;
                } else {
                    iArr[iBinarySearch] = ~i6;
                }
            }
            this.f4385a = (E[]) objArr;
            this.f = iArr;
            this.g = i2;
        }

        @Override // com.google.common.collect.ImmutableMultiset.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c<E> add(E e) {
            return d(e, 1);
        }

        @Override // com.google.common.collect.ImmutableMultiset.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c<E> add(E... eArr) {
            for (E e : eArr) {
                add(e);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c<E> d(E e, int i) {
            Preconditions.checkNotNull(e);
            ale.b(i, "occurrences");
            if (i == 0) {
                return this;
            }
            d();
            E[] eArr = this.f4385a;
            int i2 = this.g;
            eArr[i2] = e;
            this.f[i2] = i;
            this.g = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.a, com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Multiset) {
                for (Multiset.Entry<E> entry : ((Multiset) iterable).entrySet()) {
                    d(entry.getElement(), entry.getCount());
                }
            } else {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    add(it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<E> addAll(Iterator<? extends E> it) {
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        private void b() {
            c(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.g;
                if (i < i3) {
                    int[] iArr = this.f;
                    int i4 = iArr[i];
                    if (i4 > 0) {
                        E[] eArr = this.f4385a;
                        eArr[i2] = eArr[i];
                        iArr[i2] = i4;
                        i2++;
                    }
                    i++;
                } else {
                    Arrays.fill(this.f4385a, i2, i3, (Object) null);
                    Arrays.fill(this.f, i2, this.g, 0);
                    this.g = i2;
                    return;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableMultiset.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMultiset<E> build() {
            b();
            int i = this.g;
            if (i == 0) {
                return ImmutableSortedMultiset.emptyMultiset(this.f4386c);
            }
            ani aniVar = (ani) ImmutableSortedSet.construct(this.f4386c, i, this.f4385a);
            long[] jArr = new long[this.g + 1];
            int i2 = 0;
            while (i2 < this.g) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + ((long) this.f[i2]);
                i2 = i3;
            }
            this.j = true;
            return new ang(aniVar, jArr, 0, this.g);
        }
    }

    static final class b<E> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final E[] f4382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Comparator<? super E> f4383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int[] f4384c;

        b(SortedMultiset<E> sortedMultiset) {
            this.f4383b = sortedMultiset.comparator();
            int size = sortedMultiset.entrySet().size();
            this.f4382a = (E[]) new Object[size];
            this.f4384c = new int[size];
            int i = 0;
            for (Multiset.Entry<E> entry : sortedMultiset.entrySet()) {
                this.f4382a[i] = entry.getElement();
                this.f4384c[i] = entry.getCount();
                i++;
            }
        }

        Object readResolve() {
            int length = this.f4382a.length;
            c cVar = new c(this.f4383b);
            for (int i = 0; i < length; i++) {
                cVar.d(this.f4382a[i], this.f4384c[i]);
            }
            return cVar.build();
        }
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new b(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> c<E> builder() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e, E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e, E e2, E e3) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e, E e2, E e3, E e4) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e, E e2, E e3, E e4, E e5) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <Z> ImmutableSortedMultiset<Z> copyOf(Z[] zArr) {
        throw new UnsupportedOperationException();
    }
}
