package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import defpackage.ale;
import defpackage.alr;
import defpackage.ams;
import defpackage.ann;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient c<a<E>> f4508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient a<E> f4509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient alr<E> f4510c;

    enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            int nodeAggregate(a<?> aVar) {
                return ((a) aVar).e;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            long treeAggregate(@CheckForNull a<?> aVar) {
                if (aVar == null) {
                    return 0L;
                }
                return ((a) aVar).f;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            int nodeAggregate(a<?> aVar) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            long treeAggregate(@CheckForNull a<?> aVar) {
                if (aVar == null) {
                    return 0L;
                }
                return ((a) aVar).f4517c;
            }
        };

        abstract int nodeAggregate(a<?> aVar);

        abstract long treeAggregate(@CheckForNull a<?> aVar);
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedMultisetBridge
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset subMultiset(@ParametricNullness Object obj, BoundType boundType, @ParametricNullness Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    public static <E> TreeMultiset<E> c(@CheckForNull Comparator<? super E> comparator) {
        if (comparator == null) {
            return new TreeMultiset<>(Ordering.natural());
        }
        return new TreeMultiset<>(comparator);
    }

    TreeMultiset(c<a<E>> cVar, alr<E> alrVar, a<E> aVar) {
        super(alrVar.b());
        this.f4508a = cVar;
        this.f4510c = alrVar;
        this.f4509b = aVar;
    }

    TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.f4510c = alr.d(comparator);
        a<E> aVar = new a<>();
        this.f4509b = aVar;
        e(aVar, aVar);
        this.f4508a = new c<>();
    }

    private long e(Aggregate aggregate) {
        a<E> aVarC = this.f4508a.c();
        long jTreeAggregate = aggregate.treeAggregate(aVarC);
        if (this.f4510c.g()) {
            jTreeAggregate -= a(aggregate, aVarC);
        }
        return this.f4510c.i() ? jTreeAggregate - d(aggregate, aVarC) : jTreeAggregate;
    }

    private long a(Aggregate aggregate, @CheckForNull a<E> aVar) {
        long jTreeAggregate;
        long jA;
        if (aVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(ams.e(this.f4510c.c()), aVar.a());
        if (iCompare < 0) {
            return a(aggregate, ((a) aVar).f4515a);
        }
        if (iCompare == 0) {
            int i = AnonymousClass1.d[this.f4510c.a().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new AssertionError();
                }
                return aggregate.treeAggregate(((a) aVar).f4515a);
            }
            jTreeAggregate = aggregate.nodeAggregate(aVar);
            jA = aggregate.treeAggregate(((a) aVar).f4515a);
        } else {
            jTreeAggregate = aggregate.treeAggregate(((a) aVar).f4515a) + ((long) aggregate.nodeAggregate(aVar));
            jA = a(aggregate, ((a) aVar).h);
        }
        return jTreeAggregate + jA;
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[BoundType.values().length];
            d = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private long d(Aggregate aggregate, @CheckForNull a<E> aVar) {
        long jTreeAggregate;
        long jD;
        if (aVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(ams.e(this.f4510c.e()), aVar.a());
        if (iCompare > 0) {
            return d(aggregate, ((a) aVar).h);
        }
        if (iCompare == 0) {
            int i = AnonymousClass1.d[this.f4510c.d().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new AssertionError();
                }
                return aggregate.treeAggregate(((a) aVar).h);
            }
            jTreeAggregate = aggregate.nodeAggregate(aVar);
            jD = aggregate.treeAggregate(((a) aVar).h);
        } else {
            jTreeAggregate = aggregate.treeAggregate(((a) aVar).h) + ((long) aggregate.nodeAggregate(aVar));
            jD = d(aggregate, ((a) aVar).f4515a);
        }
        return jTreeAggregate + jD;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.a(e(Aggregate.SIZE));
    }

    @Override // com.google.common.collect.AbstractMultiset
    int distinctElements() {
        return Ints.a(e(Aggregate.DISTINCT));
    }

    static int b(@CheckForNull a<?> aVar) {
        if (aVar == null) {
            return 0;
        }
        return ((a) aVar).f4517c;
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object obj) {
        try {
            a<E> aVarC = this.f4508a.c();
            if (this.f4510c.c(obj) && aVarC != null) {
                return aVarC.a(comparator(), obj);
            }
            return 0;
        } catch (ClassCastException | NullPointerException unused) {
            return 0;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int add(@ParametricNullness E e, int i) {
        ale.b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        Preconditions.checkArgument(this.f4510c.c(e));
        a<E> aVarC = this.f4508a.c();
        if (aVarC == null) {
            comparator().compare(e, e);
            a<E> aVar = new a<>(e, i);
            a<E> aVar2 = this.f4509b;
            e(aVar2, aVar, aVar2);
            this.f4508a.e(aVarC, aVar);
            return 0;
        }
        int[] iArr = new int[1];
        this.f4508a.e(aVarC, aVarC.e(comparator(), e, i, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int remove(@CheckForNull Object obj, int i) {
        ale.b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        a<E> aVarC = this.f4508a.c();
        int[] iArr = new int[1];
        try {
            if (this.f4510c.c(obj) && aVarC != null) {
                this.f4508a.e(aVarC, aVarC.d(comparator(), obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int setCount(@ParametricNullness E e, int i) {
        ale.b(i, "count");
        if (!this.f4510c.c(e)) {
            Preconditions.checkArgument(i == 0);
            return 0;
        }
        a<E> aVarC = this.f4508a.c();
        if (aVarC == null) {
            if (i > 0) {
                add(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f4508a.e(aVarC, aVarC.b(comparator(), e, i, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public boolean setCount(@ParametricNullness E e, int i, int i2) {
        ale.b(i2, "newCount");
        ale.b(i, "oldCount");
        Preconditions.checkArgument(this.f4510c.c(e));
        a<E> aVarC = this.f4508a.c();
        if (aVarC != null) {
            int[] iArr = new int[1];
            this.f4508a.e(aVarC, aVarC.d(comparator(), e, i, i2, iArr));
            return iArr[0] == i;
        }
        if (i != 0) {
            return false;
        }
        if (i2 > 0) {
            add(e, i2);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.f4510c.g() || this.f4510c.i()) {
            Iterators.d(entryIterator());
            return;
        }
        a<E> aVarK = this.f4509b.k();
        while (true) {
            a<E> aVar = this.f4509b;
            if (aVarK == aVar) {
                e(aVar, aVar);
                this.f4508a.b();
                return;
            }
            a<E> aVarK2 = aVarK.k();
            ((a) aVarK).e = 0;
            ((a) aVarK).f4515a = null;
            ((a) aVarK).h = null;
            ((a) aVarK).i = null;
            ((a) aVarK).j = null;
            aVarK = aVarK2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset.Entry<E> a(final a<E> aVar) {
        return new Multisets.AbstractEntry<E>() { // from class: com.google.common.collect.TreeMultiset.5
            @Override // com.google.common.collect.Multiset.Entry
            @ParametricNullness
            public E getElement() {
                return (E) aVar.a();
            }

            @Override // com.google.common.collect.Multiset.Entry
            public int getCount() {
                int iB = aVar.b();
                return iB == 0 ? TreeMultiset.this.count(getElement()) : iB;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public a<E> b() {
        a<E> aVarK;
        a<E> aVarC = this.f4508a.c();
        if (aVarC == null) {
            return null;
        }
        if (this.f4510c.g()) {
            Object objE = ams.e(this.f4510c.c());
            aVarK = aVarC.c((Comparator<? super Object>) comparator(), objE);
            if (aVarK == null) {
                return null;
            }
            if (this.f4510c.a() == BoundType.OPEN && comparator().compare(objE, aVarK.a()) == 0) {
                aVarK = aVarK.k();
            }
        } else {
            aVarK = this.f4509b.k();
        }
        if (aVarK == this.f4509b || !this.f4510c.c(aVarK.a())) {
            return null;
        }
        return aVarK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public a<E> d() {
        a<E> aVarC;
        a<E> aVarC2 = this.f4508a.c();
        if (aVarC2 == null) {
            return null;
        }
        if (this.f4510c.i()) {
            Object objE = ams.e(this.f4510c.e());
            aVarC = aVarC2.e(comparator(), objE);
            if (aVarC == null) {
                return null;
            }
            if (this.f4510c.d() == BoundType.OPEN && comparator().compare(objE, aVarC.a()) == 0) {
                aVarC = aVarC.c();
            }
        } else {
            aVarC = this.f4509b.c();
        }
        if (aVarC == this.f4509b || !this.f4510c.c(aVarC.a())) {
            return null;
        }
        return aVarC;
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator<E> elementIterator() {
        return Multisets.d(entryIterator());
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator<Multiset.Entry<E>> entryIterator() {
        return new Iterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.TreeMultiset.3

            @CheckForNull
            a<E> d;

            @CheckForNull
            Multiset.Entry<E> e;

            {
                this.d = TreeMultiset.this.b();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.d == null) {
                    return false;
                }
                if (!TreeMultiset.this.f4510c.e(this.d.a())) {
                    return true;
                }
                this.d = null;
                return false;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry<E> next() {
                if (hasNext()) {
                    Multiset.Entry<E> entryA = TreeMultiset.this.a((a) Objects.requireNonNull(this.d));
                    this.e = entryA;
                    if (this.d.k() == TreeMultiset.this.f4509b) {
                        this.d = null;
                        return entryA;
                    }
                    this.d = this.d.k();
                    return entryA;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.e != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.setCount(this.e.getElement(), 0);
                this.e = null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    Iterator<Multiset.Entry<E>> descendingEntryIterator() {
        return new Iterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.TreeMultiset.4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @CheckForNull
            Multiset.Entry<E> f4513b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @CheckForNull
            a<E> f4514c;

            {
                this.f4514c = TreeMultiset.this.d();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f4514c == null) {
                    return false;
                }
                if (!TreeMultiset.this.f4510c.b(this.f4514c.a())) {
                    return true;
                }
                this.f4514c = null;
                return false;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry<E> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Objects.requireNonNull(this.f4514c);
                Multiset.Entry<E> entryA = TreeMultiset.this.a(this.f4514c);
                this.f4513b = entryA;
                if (this.f4514c.c() == TreeMultiset.this.f4509b) {
                    this.f4514c = null;
                    return entryA;
                }
                this.f4514c = this.f4514c.c();
                return entryA;
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.f4513b != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.setCount(this.f4513b.getElement(), 0);
                this.f4513b = null;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.b(this);
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(@ParametricNullness E e, BoundType boundType) {
        return new TreeMultiset(this.f4508a, this.f4510c.d(alr.b(comparator(), e, boundType)), this.f4509b);
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> tailMultiset(@ParametricNullness E e, BoundType boundType) {
        return new TreeMultiset(this.f4508a, this.f4510c.d(alr.d(comparator(), e, boundType)), this.f4509b);
    }

    static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        private T f4518a;

        private c() {
        }

        @CheckForNull
        public T c() {
            return this.f4518a;
        }

        public void e(@CheckForNull T t, @CheckForNull T t2) {
            if (this.f4518a != t) {
                throw new ConcurrentModificationException();
            }
            this.f4518a = t2;
        }

        void b() {
            this.f4518a = null;
        }
    }

    static final class a<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        private a<E> f4515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private final E f4516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4517c;
        private int d;
        private int e;
        private long f;

        @CheckForNull
        private a<E> h;

        @CheckForNull
        private a<E> i;

        @CheckForNull
        private a<E> j;

        a(@ParametricNullness E e, int i) {
            Preconditions.checkArgument(i > 0);
            this.f4516b = e;
            this.e = i;
            this.f = i;
            this.f4517c = 1;
            this.d = 1;
            this.f4515a = null;
            this.h = null;
        }

        a() {
            this.f4516b = null;
            this.e = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a<E> c() {
            return (a) Objects.requireNonNull(this.i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a<E> k() {
            return (a) Objects.requireNonNull(this.j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        int a(Comparator<? super E> comparator, @ParametricNullness E e) {
            int iCompare = comparator.compare(e, a());
            if (iCompare < 0) {
                a<E> aVar = this.f4515a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.a(comparator, e);
            }
            if (iCompare > 0) {
                a<E> aVar2 = this.h;
                if (aVar2 == null) {
                    return 0;
                }
                return aVar2.a(comparator, e);
            }
            return this.e;
        }

        private a<E> b(@ParametricNullness E e, int i) {
            a<E> aVar = new a<>(e, i);
            this.h = aVar;
            TreeMultiset.e(this, aVar, k());
            this.d = Math.max(2, this.d);
            this.f4517c++;
            this.f += (long) i;
            return this;
        }

        private a<E> d(@ParametricNullness E e, int i) {
            this.f4515a = new a<>(e, i);
            TreeMultiset.e(c(), this.f4515a, this);
            this.d = Math.max(2, this.d);
            this.f4517c++;
            this.f += (long) i;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        a<E> e(Comparator<? super E> comparator, @ParametricNullness E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, a());
            if (iCompare < 0) {
                a<E> aVar = this.f4515a;
                if (aVar == null) {
                    iArr[0] = 0;
                    return d(e, i);
                }
                int i2 = aVar.d;
                a<E> aVarE = aVar.e(comparator, e, i, iArr);
                this.f4515a = aVarE;
                if (iArr[0] == 0) {
                    this.f4517c++;
                }
                this.f += (long) i;
                if (aVarE.d != i2) {
                    return f();
                }
            } else if (iCompare > 0) {
                a<E> aVar2 = this.h;
                if (aVar2 == null) {
                    iArr[0] = 0;
                    return b(e, i);
                }
                int i3 = aVar2.d;
                a<E> aVarE2 = aVar2.e(comparator, e, i, iArr);
                this.h = aVarE2;
                if (iArr[0] == 0) {
                    this.f4517c++;
                }
                this.f += (long) i;
                if (aVarE2.d != i3) {
                    return f();
                }
            } else {
                int i4 = this.e;
                iArr[0] = i4;
                long j = i;
                Preconditions.checkArgument(((long) i4) + j <= 2147483647L);
                this.e += i;
                this.f += j;
                return this;
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        a<E> d(Comparator<? super E> comparator, @ParametricNullness E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, a());
            if (iCompare < 0) {
                a<E> aVar = this.f4515a;
                if (aVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f4515a = aVar.d(comparator, e, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.f4517c--;
                        this.f -= (long) i2;
                    } else {
                        this.f -= (long) i;
                    }
                }
                return i2 == 0 ? this : f();
            }
            if (iCompare > 0) {
                a<E> aVar2 = this.h;
                if (aVar2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.h = aVar2.d(comparator, e, i, iArr);
                int i3 = iArr[0];
                if (i3 > 0) {
                    if (i >= i3) {
                        this.f4517c--;
                        this.f -= (long) i3;
                    } else {
                        this.f -= (long) i;
                    }
                }
                return f();
            }
            int i4 = this.e;
            iArr[0] = i4;
            if (i >= i4) {
                return d();
            }
            this.e = i4 - i;
            this.f -= (long) i;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        a<E> b(Comparator<? super E> comparator, @ParametricNullness E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, a());
            if (iCompare < 0) {
                a<E> aVar = this.f4515a;
                if (aVar == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return d(e, i);
                    }
                } else {
                    this.f4515a = aVar.b(comparator, e, i, iArr);
                    if (i == 0 && iArr[0] != 0) {
                        this.f4517c--;
                    } else if (i > 0 && iArr[0] == 0) {
                        this.f4517c++;
                    }
                    this.f += (long) (i - iArr[0]);
                    return f();
                }
            } else if (iCompare > 0) {
                a<E> aVar2 = this.h;
                if (aVar2 == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return b(e, i);
                    }
                } else {
                    this.h = aVar2.b(comparator, e, i, iArr);
                    if (i == 0 && iArr[0] != 0) {
                        this.f4517c--;
                    } else if (i > 0 && iArr[0] == 0) {
                        this.f4517c++;
                    }
                    this.f += (long) (i - iArr[0]);
                    return f();
                }
            } else {
                int i2 = this.e;
                iArr[0] = i2;
                if (i == 0) {
                    return d();
                }
                this.f += (long) (i - i2);
                this.e = i;
                return this;
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        a<E> d(Comparator<? super E> comparator, @ParametricNullness E e, int i, int i2, int[] iArr) {
            int iCompare = comparator.compare(e, a());
            if (iCompare < 0) {
                a<E> aVar = this.f4515a;
                if (aVar == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        return d(e, i2);
                    }
                } else {
                    this.f4515a = aVar.d(comparator, e, i, i2, iArr);
                    int i3 = iArr[0];
                    if (i3 == i) {
                        if (i2 == 0 && i3 != 0) {
                            this.f4517c--;
                        } else if (i2 > 0 && i3 == 0) {
                            this.f4517c++;
                        }
                        this.f += (long) (i2 - i3);
                    }
                    return f();
                }
            } else if (iCompare > 0) {
                a<E> aVar2 = this.h;
                if (aVar2 == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        return b(e, i2);
                    }
                } else {
                    this.h = aVar2.d(comparator, e, i, i2, iArr);
                    int i4 = iArr[0];
                    if (i4 == i) {
                        if (i2 == 0 && i4 != 0) {
                            this.f4517c--;
                        } else if (i2 > 0 && i4 == 0) {
                            this.f4517c++;
                        }
                        this.f += (long) (i2 - i4);
                    }
                    return f();
                }
            } else {
                int i5 = this.e;
                iArr[0] = i5;
                if (i == i5) {
                    if (i2 == 0) {
                        return d();
                    }
                    this.f += (long) (i2 - i5);
                    this.e = i2;
                }
            }
            return this;
        }

        @CheckForNull
        private a<E> d() {
            int i = this.e;
            this.e = 0;
            TreeMultiset.e(c(), k());
            a<E> aVar = this.f4515a;
            if (aVar == null) {
                return this.h;
            }
            a<E> aVar2 = this.h;
            if (aVar2 == null) {
                return aVar;
            }
            if (aVar.d >= aVar2.d) {
                a<E> aVarC = c();
                aVarC.f4515a = this.f4515a.h(aVarC);
                aVarC.h = this.h;
                aVarC.f4517c = this.f4517c - 1;
                aVarC.f = this.f - ((long) i);
                return aVarC.f();
            }
            a<E> aVarK = k();
            aVarK.h = this.h.i(aVarK);
            aVarK.f4515a = this.f4515a;
            aVarK.f4517c = this.f4517c - 1;
            aVarK.f = this.f - ((long) i);
            return aVarK.f();
        }

        @CheckForNull
        private a<E> i(a<E> aVar) {
            a<E> aVar2 = this.f4515a;
            if (aVar2 == null) {
                return this.h;
            }
            this.f4515a = aVar2.i(aVar);
            this.f4517c--;
            this.f -= (long) aVar.e;
            return f();
        }

        @CheckForNull
        private a<E> h(a<E> aVar) {
            a<E> aVar2 = this.h;
            if (aVar2 == null) {
                return this.f4515a;
            }
            this.h = aVar2.h(aVar);
            this.f4517c--;
            this.f -= (long) aVar.e;
            return f();
        }

        private void j() {
            this.f4517c = TreeMultiset.b((a<?>) this.f4515a) + 1 + TreeMultiset.b((a<?>) this.h);
            this.f = ((long) this.e) + l(this.f4515a) + l(this.h);
        }

        private void g() {
            this.d = Math.max(f(this.f4515a), f(this.h)) + 1;
        }

        private void i() {
            j();
            g();
        }

        private a<E> f() {
            int iE = e();
            if (iE == -2) {
                Objects.requireNonNull(this.h);
                if (this.h.e() > 0) {
                    this.h = this.h.n();
                }
                return h();
            }
            if (iE == 2) {
                Objects.requireNonNull(this.f4515a);
                if (this.f4515a.e() < 0) {
                    this.f4515a = this.f4515a.h();
                }
                return n();
            }
            g();
            return this;
        }

        private int e() {
            return f(this.f4515a) - f(this.h);
        }

        private a<E> h() {
            Preconditions.checkState(this.h != null);
            a<E> aVar = this.h;
            this.h = aVar.f4515a;
            aVar.f4515a = this;
            aVar.f = this.f;
            aVar.f4517c = this.f4517c;
            i();
            aVar.g();
            return aVar;
        }

        private a<E> n() {
            Preconditions.checkState(this.f4515a != null);
            a<E> aVar = this.f4515a;
            this.f4515a = aVar.h;
            aVar.h = this;
            aVar.f = this.f;
            aVar.f4517c = this.f4517c;
            i();
            aVar.g();
            return aVar;
        }

        private static long l(@CheckForNull a<?> aVar) {
            if (aVar == null) {
                return 0L;
            }
            return ((a) aVar).f;
        }

        private static int f(@CheckForNull a<?> aVar) {
            if (aVar == null) {
                return 0;
            }
            return ((a) aVar).d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public a<E> c(Comparator<? super E> comparator, @ParametricNullness E e) {
            int iCompare = comparator.compare(e, a());
            if (iCompare < 0) {
                a<E> aVar = this.f4515a;
                if (aVar != null) {
                    return (a) MoreObjects.firstNonNull(aVar.c(comparator, e), this);
                }
            } else if (iCompare != 0) {
                a<E> aVar2 = this.h;
                if (aVar2 == null) {
                    return null;
                }
                return aVar2.c(comparator, e);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public a<E> e(Comparator<? super E> comparator, @ParametricNullness E e) {
            int iCompare = comparator.compare(e, a());
            if (iCompare > 0) {
                a<E> aVar = this.h;
                if (aVar != null) {
                    return (a) MoreObjects.firstNonNull(aVar.e(comparator, e), this);
                }
            } else if (iCompare != 0) {
                a<E> aVar2 = this.f4515a;
                if (aVar2 == null) {
                    return null;
                }
                return aVar2.e(comparator, e);
            }
            return this;
        }

        @ParametricNullness
        E a() {
            return (E) ams.e(this.f4516b);
        }

        int b() {
            return this.e;
        }

        public String toString() {
            return Multisets.c(a(), b()).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void e(a<T> aVar, a<T> aVar2) {
        ((a) aVar).j = aVar2;
        ((a) aVar2).i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void e(a<T> aVar, a<T> aVar2, a<T> aVar3) {
        e(aVar, aVar2);
        e(aVar2, aVar3);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        ann.b(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) Objects.requireNonNull(objectInputStream.readObject());
        ann.a(AbstractSortedMultiset.class, "comparator").d(this, comparator);
        ann.a(TreeMultiset.class, "range").d(this, alr.d(comparator));
        ann.a(TreeMultiset.class, "rootReference").d(this, new c());
        a aVar = new a();
        ann.a(TreeMultiset.class, "header").d(this, aVar);
        e(aVar, aVar);
        ann.d(this, objectInputStream);
    }
}
