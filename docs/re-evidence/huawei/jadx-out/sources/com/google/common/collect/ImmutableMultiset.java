package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultiset;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.ajz;
import defpackage.amt;
import defpackage.and;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E> {
    private static final long serialVersionUID = 912559;

    @CheckForNull
    @LazyInit
    private transient ImmutableList<E> asList;

    @CheckForNull
    @LazyInit
    private transient ImmutableSet<Multiset.Entry<E>> entrySet;

    public static /* synthetic */ int lambda$toImmutableMultiset$0(Object obj) {
        return 1;
    }

    public abstract ImmutableSet<E> elementSet();

    protected abstract Multiset.Entry<E> getEntry(int i);

    @Override // com.google.common.collect.ImmutableCollection
    protected abstract Object writeReplace();

    static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
        return ajz.c(Function.identity(), new ToIntFunction() { // from class: ame
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ImmutableMultiset.lambda$toImmutableMultiset$0(obj);
            }
        });
    }

    static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        return ajz.c(function, toIntFunction);
    }

    public static <E> ImmutableMultiset<E> of() {
        return and.f588b;
    }

    public static <E> ImmutableMultiset<E> of(E e) {
        return copyFromElements(e);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2) {
        return copyFromElements(e, e2);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3) {
        return copyFromElements(e, e2, e3);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4) {
        return copyFromElements(e, e2, e3, e4);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5) {
        return copyFromElements(e, e2, e3, e4, e5);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new a().add(e).add(e2).add(e3).add(e4).add(e5).add(e6).add((Object[]) eArr).build();
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return copyFromElements(eArr);
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        a aVar = new a(Multisets.e(iterable));
        aVar.addAll(iterable);
        return aVar.build();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        return new a().addAll(it).build();
    }

    private static <E> ImmutableMultiset<E> copyFromElements(E... eArr) {
        return new a().add((Object[]) eArr).build();
    }

    public static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends Multiset.Entry<? extends E>> collection) {
        a aVar = new a(collection.size());
        for (Multiset.Entry<? extends E> entry : collection) {
            aVar.d(entry.getElement(), entry.getCount());
        }
        return aVar.build();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        final UnmodifiableIterator<Multiset.Entry<E>> it = entrySet().iterator();
        return new UnmodifiableIterator<E>(this) { // from class: com.google.common.collect.ImmutableMultiset.2

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @CheckForNull
            E f4378c;
            int e;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.e > 0 || it.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.e <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) it.next();
                    this.f4378c = (E) entry.getElement();
                    this.e = entry.getCount();
                }
                this.e--;
                return (E) Objects.requireNonNull(this.f4378c);
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListAsList = super.asList();
        this.asList = immutableListAsList;
        return immutableListAsList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final int remove(@CheckForNull Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    protected int copyIntoArray(Object[] objArr, int i) {
        UnmodifiableIterator<Multiset.Entry<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            Multiset.Entry<E> next = it.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(@CheckForNull Object obj) {
        return Multisets.a(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return Sets.d(entrySet());
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.Multiset
    public ImmutableSet<Multiset.Entry<E>> entrySet() {
        ImmutableSet<Multiset.Entry<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Multiset.Entry<E>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    private ImmutableSet<Multiset.Entry<E>> createEntrySet() {
        return isEmpty() ? ImmutableSet.of() : new b();
    }

    final class b extends IndexedImmutableSet<Multiset.Entry<E>> {
        private static final long serialVersionUID = 0;

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Multiset.Entry<E> get(int i) {
            return ImmutableMultiset.this.getEntry(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (entry.getCount() > 0 && ImmutableMultiset.this.count(entry.getElement()) == entry.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new c(ImmutableMultiset.this);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }
    }

    static class c<E> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ImmutableMultiset<E> f4380a;

        c(ImmutableMultiset<E> immutableMultiset) {
            this.f4380a = immutableMultiset;
        }

        Object readResolve() {
            return this.f4380a.entrySet();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    public static class a<E> extends ImmutableCollection.Builder<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        amt<E> f4379b;
        boolean d;
        boolean e;

        public a() {
            this(4);
        }

        public a(int i) {
            this.d = false;
            this.e = false;
            this.f4379b = amt.d(i);
        }

        a(boolean z) {
            this.d = false;
            this.e = false;
            this.f4379b = null;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a<E> add(E e) {
            return d(e, 1);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }

        public a<E> d(E e, int i) {
            Objects.requireNonNull(this.f4379b);
            if (i == 0) {
                return this;
            }
            if (this.d) {
                this.f4379b = new amt<>(this.f4379b);
                this.e = false;
            }
            this.d = false;
            Preconditions.checkNotNull(e);
            amt<E> amtVar = this.f4379b;
            amtVar.d(e, i + amtVar.b(e));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a<E> addAll(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f4379b);
            if (iterable instanceof Multiset) {
                Multiset multisetD = Multisets.d(iterable);
                amt amtVarE = e(multisetD);
                if (amtVarE != null) {
                    amt<E> amtVar = this.f4379b;
                    amtVar.c(Math.max(amtVar.a(), amtVarE.a()));
                    for (int iD = amtVarE.d(); iD >= 0; iD = amtVarE.g(iD)) {
                        d(amtVarE.b(iD), amtVarE.e(iD));
                    }
                } else {
                    Set<Multiset.Entry<E>> setEntrySet = multisetD.entrySet();
                    amt<E> amtVar2 = this.f4379b;
                    amtVar2.c(Math.max(amtVar2.a(), setEntrySet.size()));
                    for (Multiset.Entry<E> entry : multisetD.entrySet()) {
                        d(entry.getElement(), entry.getCount());
                    }
                }
                return this;
            }
            super.addAll(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a<E> addAll(Iterator<? extends E> it) {
            super.addAll(it);
            return this;
        }

        @CheckForNull
        static <T> amt<T> e(Iterable<T> iterable) {
            if (iterable instanceof and) {
                return ((and) iterable).f589a;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return ((AbstractMapBasedMultiset) iterable).backingMap;
            }
            return null;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ImmutableMultiset<E> build() {
            Objects.requireNonNull(this.f4379b);
            if (this.f4379b.a() == 0) {
                return ImmutableMultiset.of();
            }
            if (this.e) {
                this.f4379b = new amt<>(this.f4379b);
                this.e = false;
            }
            this.d = true;
            return new and(this.f4379b);
        }
    }
}
