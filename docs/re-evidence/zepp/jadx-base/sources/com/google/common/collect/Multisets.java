package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public final class Multisets {

    /* JADX INFO: Add missing generic type declarations: [E] */
    public static class a<E> extends n<E> {
        public final /* synthetic */ Multiset c;
        public final /* synthetic */ Multiset d;

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$a$a, reason: collision with other inner class name */
        public class C0185a extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ Iterator c;
            public final /* synthetic */ Iterator d;

            public C0185a(Iterator it2, Iterator it3) {
                this.c = it2;
                this.d = it3;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry<E> computeNext() {
                if (this.c.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.c.next();
                    Object element = entry.getElement();
                    return Multisets.immutableEntry(element, Math.max(entry.getCount(), a.this.d.count(element)));
                }
                while (this.d.hasNext()) {
                    Multiset.Entry entry2 = (Multiset.Entry) this.d.next();
                    Object element2 = entry2.getElement();
                    if (!a.this.c.contains(element2)) {
                        return Multisets.immutableEntry(element2, entry2.getCount());
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Multiset multiset, Multiset multiset2) {
            super(null);
            this.c = multiset;
            this.d = multiset2;
        }

        @Override // com.google.common.collect.h
        public Set<E> a() {
            return Sets.union(this.c.elementSet(), this.d.elementSet());
        }

        @Override // com.google.common.collect.h
        public Iterator<E> c() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@NullableDecl Object obj) {
            return this.c.contains(obj) || this.d.contains(obj);
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            return Math.max(this.c.count(obj), this.d.count(obj));
        }

        @Override // com.google.common.collect.h
        public Iterator<Multiset.Entry<E>> e() {
            return new C0185a(this.c.entrySet().iterator(), this.d.entrySet().iterator());
        }

        @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.c.isEmpty() && this.d.isEmpty();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public static class b<E> extends n<E> {
        public final /* synthetic */ Multiset c;
        public final /* synthetic */ Multiset d;

        public class a extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ Iterator c;

            public a(Iterator it2) {
                this.c = it2;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry<E> computeNext() {
                while (this.c.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.c.next();
                    Object element = entry.getElement();
                    int iMin = Math.min(entry.getCount(), b.this.d.count(element));
                    if (iMin > 0) {
                        return Multisets.immutableEntry(element, iMin);
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Multiset multiset, Multiset multiset2) {
            super(null);
            this.c = multiset;
            this.d = multiset2;
        }

        @Override // com.google.common.collect.h
        public Set<E> a() {
            return Sets.intersection(this.c.elementSet(), this.d.elementSet());
        }

        @Override // com.google.common.collect.h
        public Iterator<E> c() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            int iCount = this.c.count(obj);
            if (iCount == 0) {
                return 0;
            }
            return Math.min(iCount, this.d.count(obj));
        }

        @Override // com.google.common.collect.h
        public Iterator<Multiset.Entry<E>> e() {
            return new a(this.c.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public static class c<E> extends n<E> {
        public final /* synthetic */ Multiset c;
        public final /* synthetic */ Multiset d;

        public class a extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ Iterator c;
            public final /* synthetic */ Iterator d;

            public a(Iterator it2, Iterator it3) {
                this.c = it2;
                this.d = it3;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry<E> computeNext() {
                if (this.c.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.c.next();
                    Object element = entry.getElement();
                    return Multisets.immutableEntry(element, entry.getCount() + c.this.d.count(element));
                }
                while (this.d.hasNext()) {
                    Multiset.Entry entry2 = (Multiset.Entry) this.d.next();
                    Object element2 = entry2.getElement();
                    if (!c.this.c.contains(element2)) {
                        return Multisets.immutableEntry(element2, entry2.getCount());
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Multiset multiset, Multiset multiset2) {
            super(null);
            this.c = multiset;
            this.d = multiset2;
        }

        @Override // com.google.common.collect.h
        public Set<E> a() {
            return Sets.union(this.c.elementSet(), this.d.elementSet());
        }

        @Override // com.google.common.collect.h
        public Iterator<E> c() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@NullableDecl Object obj) {
            return this.c.contains(obj) || this.d.contains(obj);
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            return this.c.count(obj) + this.d.count(obj);
        }

        @Override // com.google.common.collect.h
        public Iterator<Multiset.Entry<E>> e() {
            return new a(this.c.entrySet().iterator(), this.d.entrySet().iterator());
        }

        @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.c.isEmpty() && this.d.isEmpty();
        }

        @Override // com.google.common.collect.Multisets.n, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return IntMath.saturatedAdd(this.c.size(), this.d.size());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public static class d<E> extends n<E> {
        public final /* synthetic */ Multiset c;
        public final /* synthetic */ Multiset d;

        public class a extends AbstractIterator<E> {
            public final /* synthetic */ Iterator c;

            public a(Iterator it2) {
                this.c = it2;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            public E computeNext() {
                while (this.c.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.c.next();
                    E e = (E) entry.getElement();
                    if (entry.getCount() > d.this.d.count(e)) {
                        return e;
                    }
                }
                return endOfData();
            }
        }

        public class b extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ Iterator c;

            public b(Iterator it2) {
                this.c = it2;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry<E> computeNext() {
                while (this.c.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.c.next();
                    Object element = entry.getElement();
                    int count = entry.getCount() - d.this.d.count(element);
                    if (count > 0) {
                        return Multisets.immutableEntry(element, count);
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Multiset multiset, Multiset multiset2) {
            super(null);
            this.c = multiset;
            this.d = multiset2;
        }

        @Override // com.google.common.collect.Multisets.n, com.google.common.collect.h
        public int b() {
            return Iterators.size(e());
        }

        @Override // com.google.common.collect.h
        public Iterator<E> c() {
            return new a(this.c.entrySet().iterator());
        }

        @Override // com.google.common.collect.Multisets.n, com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multiset
        public int count(@NullableDecl Object obj) {
            int iCount = this.c.count(obj);
            if (iCount == 0) {
                return 0;
            }
            return Math.max(0, iCount - this.d.count(obj));
        }

        @Override // com.google.common.collect.h
        public Iterator<Multiset.Entry<E>> e() {
            return new b(this.c.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public static class e<E> extends x2<Multiset.Entry<E>, E> {
        public e(Iterator it2) {
            super(it2);
        }

        @Override // com.google.common.collect.x2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(Multiset.Entry<E> entry) {
            return entry.getElement();
        }
    }

    public static abstract class f<E> implements Multiset.Entry<E> {
        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(@NullableDecl Object obj) {
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

    public static final class g implements Comparator<Multiset.Entry<?>> {
        public static final g a = new g();

        private g() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    public static abstract class h<E> extends Sets.k<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return d().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return d().containsAll(collection);
        }

        public abstract Multiset<E> d();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return d().remove(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d().entrySet().size();
        }
    }

    public static abstract class i<E> extends Sets.k<Multiset.Entry<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && d().count(entry.getElement()) == entry.getCount();
        }

        public abstract Multiset<E> d();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                Object element = entry.getElement();
                int count = entry.getCount();
                if (count != 0) {
                    return d().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    public static final class j<E> extends n<E> {
        public final Multiset<E> c;
        public final Predicate<? super E> d;

        public class a implements Predicate<Multiset.Entry<E>> {
            public a() {
            }

            @Override // com.google.common.base.Predicate
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(Multiset.Entry<E> entry) {
                return j.this.d.apply(entry.getElement());
            }
        }

        public j(Multiset<E> multiset, Predicate<? super E> predicate) {
            super(null);
            this.c = (Multiset) Preconditions.checkNotNull(multiset);
            this.d = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.collect.h
        public Set<E> a() {
            return Sets.filter(this.c.elementSet(), this.d);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.Multiset
        public int add(@NullableDecl E e, int i) {
            Preconditions.checkArgument(this.d.apply(e), "Element %s does not match predicate %s", e, this.d);
            return this.c.add(e, i);
        }

        @Override // com.google.common.collect.h
        public Iterator<E> c() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multiset
        public int count(@NullableDecl Object obj) {
            int iCount = this.c.count(obj);
            if (iCount <= 0 || !this.d.apply(obj)) {
                return 0;
            }
            return iCount;
        }

        @Override // com.google.common.collect.h
        public Set<Multiset.Entry<E>> createEntrySet() {
            return Sets.filter(this.c.entrySet(), new a());
        }

        @Override // com.google.common.collect.h
        public Iterator<Multiset.Entry<E>> e() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multisets.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public UnmodifiableIterator<E> iterator() {
            return Iterators.filter(this.c.iterator(), this.d);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.Multiset
        public int remove(@NullableDecl Object obj, int i) {
            u.b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            if (contains(obj)) {
                return this.c.remove(obj, i);
            }
            return 0;
        }
    }

    public static class k<E> extends f<E> implements Serializable {
        private static final long serialVersionUID = 0;

        @NullableDecl
        private final E a;
        private final int b;

        public k(@NullableDecl E e, int i) {
            this.a = e;
            this.b = i;
            u.b(i, "count");
        }

        public k<E> a() {
            return null;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.b;
        }

        @Override // com.google.common.collect.Multiset.Entry
        @NullableDecl
        public final E getElement() {
            return this.a;
        }
    }

    public static final class l<E> implements Iterator<E> {
        private final Multiset<E> a;
        private final Iterator<Multiset.Entry<E>> b;

        @MonotonicNonNullDecl
        private Multiset.Entry<E> c;
        private int d;
        private int e;
        private boolean f;

        public l(Multiset<E> multiset, Iterator<Multiset.Entry<E>> it2) {
            this.a = multiset;
            this.b = it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.d > 0 || this.b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.d == 0) {
                Multiset.Entry<E> next = this.b.next();
                this.c = next;
                int count = next.getCount();
                this.d = count;
                this.e = count;
            }
            this.d--;
            this.f = true;
            return this.c.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            u.e(this.f);
            if (this.e == 1) {
                this.b.remove();
            } else {
                this.a.remove(this.c.getElement());
            }
            this.e--;
            this.f = false;
        }
    }

    public static class m<E> extends ForwardingMultiset<E> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Multiset<? extends E> a;

        @MonotonicNonNullDecl
        public transient Set<E> b;

        @MonotonicNonNullDecl
        public transient Set<Multiset.Entry<E>> c;

        public m(Multiset<? extends E> multiset) {
            this.a = multiset;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Set<E> e() {
            return Collections.unmodifiableSet(this.a.elementSet());
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<E> elementSet() {
            Set<E> set = this.b;
            if (set != null) {
                return set;
            }
            Set<E> setE = e();
            this.b = setE;
            return setE;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set = this.c;
            if (set != null) {
                return set;
            }
            Set<Multiset.Entry<E>> setUnmodifiableSet = Collections.unmodifiableSet(this.a.entrySet());
            this.c = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return Iterators.unmodifiableIterator(this.a.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int setCount(E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int add(E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public boolean setCount(E e, int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Multiset<E> delegate() {
            return this.a;
        }
    }

    public static abstract class n<E> extends com.google.common.collect.h<E> {
        private n() {
        }

        @Override // com.google.common.collect.h
        public int b() {
            return elementSet().size();
        }

        @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<E> iterator() {
            return Multisets.h(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return Multisets.i(this);
        }

        public /* synthetic */ n(a aVar) {
            this();
        }
    }

    private Multisets() {
    }

    private static <E> boolean a(Multiset<E> multiset, com.google.common.collect.e<? extends E> eVar) {
        if (eVar.isEmpty()) {
            return false;
        }
        eVar.f(multiset);
        return true;
    }

    private static <E> boolean b(Multiset<E> multiset, Multiset<? extends E> multiset2) {
        if (multiset2 instanceof com.google.common.collect.e) {
            return a(multiset, (com.google.common.collect.e) multiset2);
        }
        if (multiset2.isEmpty()) {
            return false;
        }
        for (Multiset.Entry<? extends E> entry : multiset2.entrySet()) {
            multiset.add(entry.getElement(), entry.getCount());
        }
        return true;
    }

    public static <E> boolean c(Multiset<E> multiset, Collection<? extends E> collection) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            return b(multiset, d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.addAll(multiset, collection.iterator());
    }

    @CanIgnoreReturnValue
    public static boolean containsOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        for (Multiset.Entry<?> entry : multiset2.entrySet()) {
            if (multiset.count(entry.getElement()) < entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    @Beta
    public static <E> ImmutableMultiset<E> copyHighestCountFirst(Multiset<E> multiset) {
        Multiset.Entry[] entryArr = (Multiset.Entry[]) multiset.entrySet().toArray(new Multiset.Entry[0]);
        Arrays.sort(entryArr, g.a);
        return ImmutableMultiset.h(Arrays.asList(entryArr));
    }

    public static <T> Multiset<T> d(Iterable<T> iterable) {
        return (Multiset) iterable;
    }

    @Beta
    public static <E> Multiset<E> difference(Multiset<E> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new d(multiset, multiset2);
    }

    public static <E> Iterator<E> e(Iterator<Multiset.Entry<E>> it2) {
        return new e(it2);
    }

    public static boolean f(Multiset<?> multiset, @NullableDecl Object obj) {
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

    @Beta
    public static <E> Multiset<E> filter(Multiset<E> multiset, Predicate<? super E> predicate) {
        if (!(multiset instanceof j)) {
            return new j(multiset, predicate);
        }
        j jVar = (j) multiset;
        return new j(jVar.c, Predicates.and(jVar.d, predicate));
    }

    public static int g(Iterable<?> iterable) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).elementSet().size();
        }
        return 11;
    }

    public static <E> Iterator<E> h(Multiset<E> multiset) {
        return new l(multiset, multiset.entrySet().iterator());
    }

    public static int i(Multiset<?> multiset) {
        Iterator<Multiset.Entry<?>> it2 = multiset.entrySet().iterator();
        long count = 0;
        while (it2.hasNext()) {
            count += (long) it2.next().getCount();
        }
        return Ints.saturatedCast(count);
    }

    public static <E> Multiset.Entry<E> immutableEntry(@NullableDecl E e2, int i2) {
        return new k(e2, i2);
    }

    public static <E> Multiset<E> intersection(Multiset<E> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new b(multiset, multiset2);
    }

    public static boolean j(Multiset<?> multiset, Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    public static boolean k(Multiset<?> multiset, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    private static <E> boolean l(Multiset<E> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        Iterator<Multiset.Entry<E>> it2 = multiset.entrySet().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Multiset.Entry<E> next = it2.next();
            int iCount = multiset2.count(next.getElement());
            if (iCount == 0) {
                it2.remove();
            } else if (iCount < next.getCount()) {
                multiset.setCount(next.getElement(), iCount);
            }
            z = true;
        }
        return z;
    }

    public static <E> int m(Multiset<E> multiset, E e2, int i2) {
        u.b(i2, "count");
        int iCount = multiset.count(e2);
        int i3 = i2 - iCount;
        if (i3 > 0) {
            multiset.add(e2, i3);
        } else if (i3 < 0) {
            multiset.remove(e2, -i3);
        }
        return iCount;
    }

    public static <E> boolean n(Multiset<E> multiset, E e2, int i2, int i3) {
        u.b(i2, "oldCount");
        u.b(i3, "newCount");
        if (multiset.count(e2) != i2) {
            return false;
        }
        multiset.setCount(e2, i3);
        return true;
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Iterable<?> iterable) {
        if (iterable instanceof Multiset) {
            return removeOccurrences(multiset, (Multiset<?>) iterable);
        }
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(iterable);
        boolean zRemove = false;
        Iterator<?> it2 = iterable.iterator();
        while (it2.hasNext()) {
            zRemove |= multiset.remove(it2.next());
        }
        return zRemove;
    }

    @CanIgnoreReturnValue
    public static boolean retainOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        return l(multiset, multiset2);
    }

    @Beta
    public static <E> Multiset<E> sum(Multiset<? extends E> multiset, Multiset<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new c(multiset, multiset2);
    }

    @Beta
    public static <E> Multiset<E> union(Multiset<? extends E> multiset, Multiset<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new a(multiset, multiset2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Multiset<E> unmodifiableMultiset(Multiset<? extends E> multiset) {
        return ((multiset instanceof m) || (multiset instanceof ImmutableMultiset)) ? multiset : new m((Multiset) Preconditions.checkNotNull(multiset));
    }

    @Beta
    public static <E> SortedMultiset<E> unmodifiableSortedMultiset(SortedMultiset<E> sortedMultiset) {
        return new z2((SortedMultiset) Preconditions.checkNotNull(sortedMultiset));
    }

    @Deprecated
    public static <E> Multiset<E> unmodifiableMultiset(ImmutableMultiset<E> immutableMultiset) {
        return (Multiset) Preconditions.checkNotNull(immutableMultiset);
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        Iterator<Multiset.Entry<?>> it2 = multiset.entrySet().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Multiset.Entry<?> next = it2.next();
            int iCount = multiset2.count(next.getElement());
            if (iCount >= next.getCount()) {
                it2.remove();
            } else if (iCount > 0) {
                multiset.remove(next.getElement(), iCount);
            }
            z = true;
        }
        return z;
    }
}
