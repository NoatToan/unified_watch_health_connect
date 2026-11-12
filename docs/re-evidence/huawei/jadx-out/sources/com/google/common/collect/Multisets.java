package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import defpackage.ale;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class Multisets {
    public static <E> Multiset.Entry<E> c(@ParametricNullness E e, int i) {
        return new b(e, i);
    }

    static class b<E> extends AbstractEntry<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f4470c;

        @ParametricNullness
        private final E e;

        b(@ParametricNullness E e, int i) {
            this.e = e;
            this.f4470c = i;
            ale.b(i, "count");
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public final E getElement() {
            return this.e;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.f4470c;
        }
    }

    static int e(Iterable<?> iterable) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).elementSet().size();
        }
        return 11;
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Multisets$4, reason: invalid class name */
    class AnonymousClass4<E> extends ViewMultiset<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Multiset f4464b;
        final /* synthetic */ Multiset d;

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@CheckForNull Object obj) {
            return this.f4464b.contains(obj) || this.d.contains(obj);
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f4464b.isEmpty() && this.d.isEmpty();
        }

        @Override // com.google.common.collect.Multiset
        public int count(@CheckForNull Object obj) {
            return Math.max(this.f4464b.count(obj), this.d.count(obj));
        }

        @Override // com.google.common.collect.AbstractMultiset
        Set<E> createElementSet() {
            return Sets.a(this.f4464b.elementSet(), this.d.elementSet());
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<Multiset.Entry<E>> entryIterator() {
            final Iterator<Multiset.Entry<E>> it = this.f4464b.entrySet().iterator();
            final Iterator<Multiset.Entry<E>> it2 = this.d.entrySet().iterator();
            return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.4.5
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Multiset.Entry<E> computeNext() {
                    if (it.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) it.next();
                        Object element = entry.getElement();
                        return Multisets.c(element, Math.max(entry.getCount(), AnonymousClass4.this.d.count(element)));
                    }
                    while (it2.hasNext()) {
                        Multiset.Entry entry2 = (Multiset.Entry) it2.next();
                        Object element2 = entry2.getElement();
                        if (!AnonymousClass4.this.f4464b.contains(element2)) {
                            return Multisets.c(element2, entry2.getCount());
                        }
                    }
                    return endOfData();
                }
            };
        }
    }

    public static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return getCount() == entry.getCount() && Objects.equal(getElement(), entry.getElement());
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.Multiset.Entry
        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    static boolean a(Multiset<?> multiset, @CheckForNull Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof Multiset) {
            Multiset multiset2 = (Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.count(entry.getElement()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    static <E> boolean d(Multiset<E> multiset, Collection<? extends E> collection) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            return a(multiset, d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.a(multiset, collection.iterator());
    }

    private static <E> boolean a(Multiset<E> multiset, Multiset<? extends E> multiset2) {
        if (multiset2 instanceof AbstractMapBasedMultiset) {
            return e(multiset, (AbstractMapBasedMultiset) multiset2);
        }
        if (multiset2.isEmpty()) {
            return false;
        }
        for (Multiset.Entry<? extends E> entry : multiset2.entrySet()) {
            multiset.add(entry.getElement(), entry.getCount());
        }
        return true;
    }

    private static <E> boolean e(Multiset<E> multiset, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.addTo(multiset);
        return true;
    }

    static boolean e(Multiset<?> multiset, Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    static boolean c(Multiset<?> multiset, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    static <E> int b(Multiset<E> multiset, @ParametricNullness E e, int i) {
        ale.b(i, "count");
        int iCount = multiset.count(e);
        int i2 = i - iCount;
        if (i2 > 0) {
            multiset.add(e, i2);
            return iCount;
        }
        if (i2 < 0) {
            multiset.remove(e, -i2);
        }
        return iCount;
    }

    static <E> boolean a(Multiset<E> multiset, @ParametricNullness E e, int i, int i2) {
        ale.b(i, "oldCount");
        ale.b(i2, "newCount");
        if (multiset.count(e) != i) {
            return false;
        }
        multiset.setCount(e, i2);
        return true;
    }

    public static <E> Iterator<E> d(Iterator<Multiset.Entry<E>> it) {
        return new TransformedIterator<Multiset.Entry<E>, E>(it) { // from class: com.google.common.collect.Multisets.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public E transform(Multiset.Entry<E> entry) {
                return entry.getElement();
            }
        };
    }

    public static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        protected abstract Multiset<E> multiset();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return multiset().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return multiset().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return multiset().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            return multiset().remove(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return multiset().entrySet().size();
        }
    }

    static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        abstract Multiset<E> multiset();

        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (entry.getCount() > 0 && multiset().count(entry.getElement()) == entry.getCount()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                Object element = entry.getElement();
                int count = entry.getCount();
                if (count != 0) {
                    return multiset().setCount(element, count, 0);
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }
    }

    static <E> Iterator<E> b(Multiset<E> multiset) {
        return new a(multiset, multiset.entrySet().iterator());
    }

    static final class a<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<Multiset.Entry<E>> f4468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Multiset<E> f4469c;

        @CheckForNull
        private Multiset.Entry<E> d;
        private boolean e;
        private int f;

        a(Multiset<E> multiset, Iterator<Multiset.Entry<E>> it) {
            this.f4469c = multiset;
            this.f4468b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4467a > 0 || this.f4468b.hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f4467a == 0) {
                Multiset.Entry<E> next = this.f4468b.next();
                this.d = next;
                int count = next.getCount();
                this.f4467a = count;
                this.f = count;
            }
            this.f4467a--;
            this.e = true;
            return (E) ((Multiset.Entry) java.util.Objects.requireNonNull(this.d)).getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            ale.b(this.e);
            if (this.f == 1) {
                this.f4468b.remove();
            } else {
                this.f4469c.remove(((Multiset.Entry) java.util.Objects.requireNonNull(this.d)).getElement());
            }
            this.f--;
            this.e = false;
        }
    }

    static int e(Multiset<?> multiset) {
        Iterator<Multiset.Entry<?>> it = multiset.entrySet().iterator();
        long count = 0;
        while (it.hasNext()) {
            count += (long) it.next().getCount();
        }
        return Ints.a(count);
    }

    static <T> Multiset<T> d(Iterable<T> iterable) {
        return (Multiset) iterable;
    }

    static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        private ViewMultiset() {
        }

        /* synthetic */ ViewMultiset(AnonymousClass4 anonymousClass4) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return Multisets.e((Multiset<?>) this);
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<E> iterator() {
            return Multisets.b(this);
        }

        @Override // com.google.common.collect.AbstractMultiset
        int distinctElements() {
            return elementSet().size();
        }
    }
}
