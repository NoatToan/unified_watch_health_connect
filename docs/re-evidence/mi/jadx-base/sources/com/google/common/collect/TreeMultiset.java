package com.google.common.collect;

import defpackage.ahd;
import defpackage.c6i;
import defpackage.cpd;
import defpackage.d2h;
import defpackage.d44;
import defpackage.d8g;
import defpackage.epd;
import defpackage.ich;
import defpackage.qxa;
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

/* JADX INFO: loaded from: classes5.dex */
public final class TreeMultiset<E> extends h<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient f<E> header;
    private final transient qxa<E> range;
    private final transient g<f<E>> rootReference;

    public class a extends v.b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f9116a;

        public a(f fVar) {
            this.f9116a = fVar;
        }

        @Override // com.google.common.collect.u.a
        public int getCount() {
            int iW = this.f9116a.w();
            return iW == 0 ? TreeMultiset.this.count(getElement()) : iW;
        }

        @Override // com.google.common.collect.u.a
        public E getElement() {
            return (E) this.f9116a.x();
        }
    }

    public class b implements Iterator<u.a<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f<E> f9118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u.a<E> f9119b;

        public b() {
            this.f9118a = TreeMultiset.this.firstNode();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u.a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            TreeMultiset treeMultiset = TreeMultiset.this;
            f<E> fVar = this.f9118a;
            Objects.requireNonNull(fVar);
            u.a<E> aVarWrapEntry = treeMultiset.wrapEntry(fVar);
            this.f9119b = aVarWrapEntry;
            if (this.f9118a.L() == TreeMultiset.this.header) {
                this.f9118a = null;
            } else {
                this.f9118a = this.f9118a.L();
            }
            return aVarWrapEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9118a == null) {
                return false;
            }
            if (!TreeMultiset.this.range.m(this.f9118a.x())) {
                return true;
            }
            this.f9118a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            c6i.u(this.f9119b != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f9119b.getElement(), 0);
            this.f9119b = null;
        }
    }

    public class c implements Iterator<u.a<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f<E> f9120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u.a<E> f9121b = null;

        public c() {
            this.f9120a = TreeMultiset.this.lastNode();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u.a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.f9120a);
            u.a<E> aVarWrapEntry = TreeMultiset.this.wrapEntry(this.f9120a);
            this.f9121b = aVarWrapEntry;
            if (this.f9120a.z() == TreeMultiset.this.header) {
                this.f9120a = null;
            } else {
                this.f9120a = this.f9120a.z();
            }
            return aVarWrapEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9120a == null) {
                return false;
            }
            if (!TreeMultiset.this.range.n(this.f9120a.x())) {
                return true;
            }
            this.f9120a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            c6i.u(this.f9121b != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f9121b.getElement(), 0);
            this.f9121b = null;
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9122a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f9122a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9122a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f9123a = new a("SIZE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f9124b = new b("DISTINCT", 1);
        public static final /* synthetic */ e[] c = a();

        public final enum a extends e {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public int b(f<?> fVar) {
                return fVar.f9126b;
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public long c(f<?> fVar) {
                if (fVar == null) {
                    return 0L;
                }
                return fVar.d;
            }
        }

        public final enum b extends e {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public int b(f<?> fVar) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public long c(f<?> fVar) {
                if (fVar == null) {
                    return 0L;
                }
                return fVar.c;
            }
        }

        public e(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ e[] a() {
            return new e[]{f9123a, f9124b};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) c.clone();
        }

        public abstract int b(f<?> fVar);

        public abstract long c(f<?> fVar);

        public /* synthetic */ e(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public static final class g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f9127a;

        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        public void a(T t, T t2) {
            if (this.f9127a != t) {
                throw new ConcurrentModificationException();
            }
            this.f9127a = t2;
        }

        public void b() {
            this.f9127a = null;
        }

        public T c() {
            return this.f9127a;
        }
    }

    public TreeMultiset(g<f<E>> gVar, qxa<E> qxaVar, f<E> fVar) {
        super(qxaVar.b());
        this.rootReference = gVar;
        this.range = qxaVar;
        this.header = fVar;
    }

    private long aggregateAboveRange(e eVar, f<E> fVar) {
        long jC;
        long jAggregateAboveRange;
        if (fVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(d2h.a(this.range.h()), fVar.x());
        if (iCompare > 0) {
            return aggregateAboveRange(eVar, fVar.g);
        }
        if (iCompare == 0) {
            int i = d.f9122a[this.range.g().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return eVar.c(fVar.g);
                }
                throw new AssertionError();
            }
            jC = eVar.b(fVar);
            jAggregateAboveRange = eVar.c(fVar.g);
        } else {
            jC = eVar.c(fVar.g) + ((long) eVar.b(fVar));
            jAggregateAboveRange = aggregateAboveRange(eVar, fVar.f);
        }
        return jC + jAggregateAboveRange;
    }

    private long aggregateBelowRange(e eVar, f<E> fVar) {
        long jC;
        long jAggregateBelowRange;
        if (fVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(d2h.a(this.range.f()), fVar.x());
        if (iCompare < 0) {
            return aggregateBelowRange(eVar, fVar.f);
        }
        if (iCompare == 0) {
            int i = d.f9122a[this.range.e().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return eVar.c(fVar.f);
                }
                throw new AssertionError();
            }
            jC = eVar.b(fVar);
            jAggregateBelowRange = eVar.c(fVar.f);
        } else {
            jC = eVar.c(fVar.f) + ((long) eVar.b(fVar));
            jAggregateBelowRange = aggregateBelowRange(eVar, fVar.g);
        }
        return jC + jAggregateBelowRange;
    }

    private long aggregateForEntries(e eVar) {
        f<E> fVarC = this.rootReference.c();
        long jC = eVar.c(fVarC);
        if (this.range.i()) {
            jC -= aggregateBelowRange(eVar, fVarC);
        }
        return this.range.j() ? jC - aggregateAboveRange(eVar, fVarC) : jC;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(ich.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f<E> firstNode() {
        f<E> fVarL;
        f<E> fVarC = this.rootReference.c();
        if (fVarC == null) {
            return null;
        }
        if (this.range.i()) {
            Object objA = d2h.a(this.range.f());
            fVarL = fVarC.s(comparator(), objA);
            if (fVarL == null) {
                return null;
            }
            if (this.range.e() == BoundType.OPEN && comparator().compare(objA, fVarL.x()) == 0) {
                fVarL = fVarL.L();
            }
        } else {
            fVarL = this.header.L();
        }
        if (fVarL == this.header || !this.range.c(fVarL.x())) {
            return null;
        }
        return fVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f<E> lastNode() {
        f<E> fVarZ;
        f<E> fVarC = this.rootReference.c();
        if (fVarC == null) {
            return null;
        }
        if (this.range.j()) {
            Object objA = d2h.a(this.range.h());
            fVarZ = fVarC.v(comparator(), objA);
            if (fVarZ == null) {
                return null;
            }
            if (this.range.g() == BoundType.OPEN && comparator().compare(objA, fVarZ.x()) == 0) {
                fVarZ = fVarZ.z();
            }
        } else {
            fVarZ = this.header.z();
        }
        if (fVarZ == this.header || !this.range.c(fVarZ.x())) {
            return null;
        }
        return fVarZ;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        g0.a(h.class, "comparator").b(this, comparator);
        g0.a(TreeMultiset.class, "range").b(this, qxa.a(comparator));
        g0.a(TreeMultiset.class, "rootReference").b(this, new g(null));
        f fVar = new f();
        g0.a(TreeMultiset.class, "header").b(this, fVar);
        successor(fVar, fVar);
        g0.f(this, objectInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(f<T> fVar, f<T> fVar2) {
        fVar.i = fVar2;
        fVar2.h = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u.a<E> wrapEntry(f<E> fVar) {
        return new a(fVar);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        g0.k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public int add(E e2, int i) {
        d44.b(i, "occurrences");
        if (i == 0) {
            return count(e2);
        }
        c6i.d(this.range.c(e2));
        f<E> fVarC = this.rootReference.c();
        if (fVarC != null) {
            int[] iArr = new int[1];
            this.rootReference.a(fVarC, fVarC.o(comparator(), e2, i, iArr));
            return iArr[0];
        }
        comparator().compare(e2, e2);
        f<E> fVar = new f<>(e2, i);
        f<E> fVar2 = this.header;
        successor(fVar2, fVar, fVar2);
        this.rootReference.a(fVarC, fVar);
        return 0;
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.range.i() || this.range.j()) {
            epd.d(entryIterator());
            return;
        }
        f<E> fVarL = this.header.L();
        while (true) {
            f<E> fVar = this.header;
            if (fVarL == fVar) {
                successor(fVar, fVar);
                this.rootReference.b();
                return;
            }
            f<E> fVarL2 = fVarL.L();
            fVarL.f9126b = 0;
            fVarL.f = null;
            fVarL.g = null;
            fVarL.h = null;
            fVarL.i = null;
            fVarL = fVarL2;
        }
    }

    @Override // com.google.common.collect.h, com.google.common.collect.l0, defpackage.n4n
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.u
    public int count(Object obj) {
        try {
            f<E> fVarC = this.rootReference.c();
            if (this.range.c(obj) && fVarC != null) {
                return fVarC.t(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.h
    public Iterator<u.a<E>> descendingEntryIterator() {
        return new c();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.l0
    public /* bridge */ /* synthetic */ l0 descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.e
    public int distinctElements() {
        return ahd.j(aggregateForEntries(e.f9124b));
    }

    @Override // com.google.common.collect.e
    public Iterator<E> elementIterator() {
        return v.e(entryIterator());
    }

    @Override // com.google.common.collect.h, com.google.common.collect.e, com.google.common.collect.u
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.e
    public Iterator<u.a<E>> entryIterator() {
        return new b();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.l0
    public /* bridge */ /* synthetic */ u.a firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.l0
    public l0<E> headMultiset(E e2, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.k(qxa.o(comparator(), e2, boundType)), this.header);
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return v.i(this);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.l0
    public /* bridge */ /* synthetic */ u.a lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.l0
    public /* bridge */ /* synthetic */ u.a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.l0
    public /* bridge */ /* synthetic */ u.a pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public int remove(Object obj, int i) {
        d44.b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        f<E> fVarC = this.rootReference.c();
        int[] iArr = new int[1];
        try {
            if (this.range.c(obj) && fVarC != null) {
                this.rootReference.a(fVarC, fVarC.E(comparator(), obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public int setCount(E e2, int i) {
        d44.b(i, "count");
        if (!this.range.c(e2)) {
            c6i.d(i == 0);
            return 0;
        }
        f<E> fVarC = this.rootReference.c();
        if (fVarC == null) {
            if (i > 0) {
                add(e2, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.a(fVarC, fVarC.K(comparator(), e2, i, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public int size() {
        return ahd.j(aggregateForEntries(e.f9123a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.l0
    public /* bridge */ /* synthetic */ l0 subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    @Override // com.google.common.collect.l0
    public l0<E> tailMultiset(E e2, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.k(qxa.d(comparator(), e2, boundType)), this.header);
    }

    public static <E> TreeMultiset<E> create(Comparator<? super E> comparator) {
        return comparator == null ? new TreeMultiset<>(ich.e()) : new TreeMultiset<>(comparator);
    }

    public static int distinctElements(f<?> fVar) {
        if (fVar == null) {
            return 0;
        }
        return fVar.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(f<T> fVar, f<T> fVar2, f<T> fVar3) {
        successor(fVar, fVar2);
        successor(fVar2, fVar3);
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> treeMultisetCreate = create();
        cpd.a(treeMultisetCreate, iterable);
        return treeMultisetCreate;
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = qxa.a(comparator);
        f<E> fVar = new f<>();
        this.header = fVar;
        successor(fVar, fVar);
        this.rootReference = new g<>(null);
    }

    public static final class f<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f9125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9126b;
        public int c;
        public long d;
        public int e;
        public f<E> f;
        public f<E> g;
        public f<E> h;
        public f<E> i;

        public f(E e, int i) {
            c6i.d(i > 0);
            this.f9125a = e;
            this.f9126b = i;
            this.d = i;
            this.c = 1;
            this.e = 1;
            this.f = null;
            this.g = null;
        }

        public static long M(f<?> fVar) {
            if (fVar == null) {
                return 0L;
            }
            return fVar.d;
        }

        public static int y(f<?> fVar) {
            if (fVar == null) {
                return 0;
            }
            return fVar.e;
        }

        public final f<E> A() {
            int iR = r();
            if (iR == -2) {
                Objects.requireNonNull(this.g);
                if (this.g.r() > 0) {
                    this.g = this.g.I();
                }
                return H();
            }
            if (iR != 2) {
                C();
                return this;
            }
            Objects.requireNonNull(this.f);
            if (this.f.r() < 0) {
                this.f = this.f.H();
            }
            return I();
        }

        public final void B() {
            D();
            C();
        }

        public final void C() {
            this.e = Math.max(y(this.f), y(this.g)) + 1;
        }

        public final void D() {
            this.c = TreeMultiset.distinctElements(this.f) + 1 + TreeMultiset.distinctElements(this.g);
            this.d = ((long) this.f9126b) + M(this.f) + M(this.g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f<E> E(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, x());
            if (iCompare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f = fVar.E(comparator, e, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.c--;
                        this.d -= (long) i2;
                    } else {
                        this.d -= (long) i;
                    }
                }
                return i2 == 0 ? this : A();
            }
            if (iCompare <= 0) {
                int i3 = this.f9126b;
                iArr[0] = i3;
                if (i >= i3) {
                    return u();
                }
                this.f9126b = i3 - i;
                this.d -= (long) i;
                return this;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.g = fVar2.E(comparator, e, i, iArr);
            int i4 = iArr[0];
            if (i4 > 0) {
                if (i >= i4) {
                    this.c--;
                    this.d -= (long) i4;
                } else {
                    this.d -= (long) i;
                }
            }
            return A();
        }

        public final f<E> F(f<E> fVar) {
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                return this.f;
            }
            this.g = fVar2.F(fVar);
            this.c--;
            this.d -= (long) fVar.f9126b;
            return A();
        }

        public final f<E> G(f<E> fVar) {
            f<E> fVar2 = this.f;
            if (fVar2 == null) {
                return this.g;
            }
            this.f = fVar2.G(fVar);
            this.c--;
            this.d -= (long) fVar.f9126b;
            return A();
        }

        public final f<E> H() {
            c6i.t(this.g != null);
            f<E> fVar = this.g;
            this.g = fVar.f;
            fVar.f = this;
            fVar.d = this.d;
            fVar.c = this.c;
            B();
            fVar.C();
            return fVar;
        }

        public final f<E> I() {
            c6i.t(this.f != null);
            f<E> fVar = this.f;
            this.f = fVar.g;
            fVar.g = this;
            fVar.d = this.d;
            fVar.c = this.c;
            B();
            fVar.C();
            return fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f<E> J(Comparator<? super E> comparator, E e, int i, int i2, int[] iArr) {
            int iCompare = comparator.compare(e, x());
            if (iCompare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return (i != 0 || i2 <= 0) ? this : p(e, i2);
                }
                this.f = fVar.J(comparator, e, i, i2, iArr);
                int i3 = iArr[0];
                if (i3 == i) {
                    if (i2 == 0 && i3 != 0) {
                        this.c--;
                    } else if (i2 > 0 && i3 == 0) {
                        this.c++;
                    }
                    this.d += (long) (i2 - i3);
                }
                return A();
            }
            if (iCompare <= 0) {
                int i4 = this.f9126b;
                iArr[0] = i4;
                if (i == i4) {
                    if (i2 == 0) {
                        return u();
                    }
                    this.d += (long) (i2 - i4);
                    this.f9126b = i2;
                }
                return this;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return (i != 0 || i2 <= 0) ? this : q(e, i2);
            }
            this.g = fVar2.J(comparator, e, i, i2, iArr);
            int i5 = iArr[0];
            if (i5 == i) {
                if (i2 == 0 && i5 != 0) {
                    this.c--;
                } else if (i2 > 0 && i5 == 0) {
                    this.c++;
                }
                this.d += (long) (i2 - i5);
            }
            return A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f<E> K(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, x());
            if (iCompare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return i > 0 ? p(e, i) : this;
                }
                this.f = fVar.K(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.c++;
                }
                this.d += (long) (i - iArr[0]);
                return A();
            }
            if (iCompare <= 0) {
                int i2 = this.f9126b;
                iArr[0] = i2;
                if (i == 0) {
                    return u();
                }
                this.d += (long) (i - i2);
                this.f9126b = i;
                return this;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return i > 0 ? q(e, i) : this;
            }
            this.g = fVar2.K(comparator, e, i, iArr);
            if (i == 0 && iArr[0] != 0) {
                this.c--;
            } else if (i > 0 && iArr[0] == 0) {
                this.c++;
            }
            this.d += (long) (i - iArr[0]);
            return A();
        }

        public final f<E> L() {
            f<E> fVar = this.i;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f<E> o(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, x());
            if (iCompare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return p(e, i);
                }
                int i2 = fVar.e;
                f<E> fVarO = fVar.o(comparator, e, i, iArr);
                this.f = fVarO;
                if (iArr[0] == 0) {
                    this.c++;
                }
                this.d += (long) i;
                return fVarO.e == i2 ? this : A();
            }
            if (iCompare <= 0) {
                int i3 = this.f9126b;
                iArr[0] = i3;
                long j = i;
                c6i.d(((long) i3) + j <= 2147483647L);
                this.f9126b += i;
                this.d += j;
                return this;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return q(e, i);
            }
            int i4 = fVar2.e;
            f<E> fVarO2 = fVar2.o(comparator, e, i, iArr);
            this.g = fVarO2;
            if (iArr[0] == 0) {
                this.c++;
            }
            this.d += (long) i;
            return fVarO2.e == i4 ? this : A();
        }

        public final f<E> p(E e, int i) {
            this.f = new f<>(e, i);
            TreeMultiset.successor(z(), this.f, this);
            this.e = Math.max(2, this.e);
            this.c++;
            this.d += (long) i;
            return this;
        }

        public final f<E> q(E e, int i) {
            f<E> fVar = new f<>(e, i);
            this.g = fVar;
            TreeMultiset.successor(this, fVar, L());
            this.e = Math.max(2, this.e);
            this.c++;
            this.d += (long) i;
            return this;
        }

        public final int r() {
            return y(this.f) - y(this.g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final f<E> s(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, x());
            if (iCompare < 0) {
                f<E> fVar = this.f;
                return fVar == null ? this : (f) d8g.a(fVar.s(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                return null;
            }
            return fVar2.s(comparator, e);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int t(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, x());
            if (iCompare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    return 0;
                }
                return fVar.t(comparator, e);
            }
            if (iCompare <= 0) {
                return this.f9126b;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                return 0;
            }
            return fVar2.t(comparator, e);
        }

        public String toString() {
            return v.g(x(), w()).toString();
        }

        public final f<E> u() {
            int i = this.f9126b;
            this.f9126b = 0;
            TreeMultiset.successor(z(), L());
            f<E> fVar = this.f;
            if (fVar == null) {
                return this.g;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                return fVar;
            }
            if (fVar.e >= fVar2.e) {
                f<E> fVarZ = z();
                fVarZ.f = this.f.F(fVarZ);
                fVarZ.g = this.g;
                fVarZ.c = this.c - 1;
                fVarZ.d = this.d - ((long) i);
                return fVarZ.A();
            }
            f<E> fVarL = L();
            fVarL.g = this.g.G(fVarL);
            fVarL.f = this.f;
            fVarL.c = this.c - 1;
            fVarL.d = this.d - ((long) i);
            return fVarL.A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final f<E> v(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, x());
            if (iCompare > 0) {
                f<E> fVar = this.g;
                return fVar == null ? this : (f) d8g.a(fVar.v(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            f<E> fVar2 = this.f;
            if (fVar2 == null) {
                return null;
            }
            return fVar2.v(comparator, e);
        }

        public int w() {
            return this.f9126b;
        }

        public E x() {
            return (E) d2h.a(this.f9125a);
        }

        public final f<E> z() {
            f<E> fVar = this.h;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        public f() {
            this.f9125a = null;
            this.f9126b = 1;
        }
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public boolean setCount(E e2, int i, int i2) {
        d44.b(i2, "newCount");
        d44.b(i, "oldCount");
        c6i.d(this.range.c(e2));
        f<E> fVarC = this.rootReference.c();
        if (fVarC != null) {
            int[] iArr = new int[1];
            this.rootReference.a(fVarC, fVarC.J(comparator(), e2, i, i2, iArr));
            return iArr[0] == i;
        }
        if (i != 0) {
            return false;
        }
        if (i2 > 0) {
            add(e2, i2);
        }
        return true;
    }
}
