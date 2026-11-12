package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractRangeSet;
import com.google.common.collect.Cut;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Ordering;
import com.google.common.collect.PeekingIterator;
import com.google.common.collect.RangeSet;
import com.google.common.collect.SortedLists;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class amd<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final amd<Comparable<?>> f531c = new amd<>(ImmutableList.of());
    private static final amd<Comparable<?>> d = new amd<>(ImmutableList.of(amv.d()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient ImmutableList<amv<C>> f532b;

    @CheckForNull
    @LazyInit
    private transient amd<C> e;

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet rangeSet) {
        return super.enclosesAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    public static <C extends Comparable> amd<C> e() {
        return f531c;
    }

    static <C extends Comparable> amd<C> b() {
        return d;
    }

    amd(ImmutableList<amv<C>> immutableList) {
        this.f532b = immutableList;
    }

    private amd(ImmutableList<amv<C>> immutableList, amd<C> amdVar) {
        this.f532b = immutableList;
        this.e = amdVar;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(amv<C> amvVar) {
        int iC = SortedLists.c(this.f532b, amv.e(), amvVar.f568c, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (iC < this.f532b.size() && this.f532b.get(iC).e(amvVar) && !this.f532b.get(iC).c(amvVar).f()) {
            return true;
        }
        if (iC <= 0) {
            return false;
        }
        int i = iC - 1;
        return this.f532b.get(i).e(amvVar) && !this.f532b.get(i).c(amvVar).f();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(amv<C> amvVar) {
        int iC = SortedLists.c(this.f532b, amv.e(), amvVar.f568c, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        return iC != -1 && this.f532b.get(iC).b(amvVar);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @CheckForNull
    public amv<C> rangeContaining(C c2) {
        int iC = SortedLists.c(this.f532b, amv.e(), Cut.belowValue(c2), Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iC == -1) {
            return null;
        }
        amv<C> amvVar = this.f532b.get(iC);
        if (amvVar.i(c2)) {
            return amvVar;
        }
        return null;
    }

    @Override // com.google.common.collect.RangeSet
    public amv<C> span() {
        if (this.f532b.isEmpty()) {
            throw new NoSuchElementException();
        }
        Cut<C> cut = this.f532b.get(0).f568c;
        ImmutableList<amv<C>> immutableList = this.f532b;
        return amv.c(cut, immutableList.get(immutableList.size() - 1).f567b);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean isEmpty() {
        return this.f532b.isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void add(amv<C> amvVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void addAll(RangeSet<C> rangeSet) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void addAll(Iterable<amv<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void remove(amv<C> amvVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void removeAll(RangeSet<C> rangeSet) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void removeAll(Iterable<amv<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<amv<C>> asRanges() {
        if (this.f532b.isEmpty()) {
            return ImmutableSet.of();
        }
        return new ani(this.f532b, amv.c());
    }

    @Override // com.google.common.collect.RangeSet
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<amv<C>> asDescendingSetOfRanges() {
        if (this.f532b.isEmpty()) {
            return ImmutableSet.of();
        }
        return new ani(this.f532b.reverse(), amv.c().reverse());
    }

    final class b extends ImmutableList<amv<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f536a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f537c;
        private final boolean e;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        b() {
            boolean zA = ((amv) amd.this.f532b.get(0)).a();
            this.f536a = zA;
            boolean zJ = ((amv) amn.a(amd.this.f532b)).j();
            this.e = zJ;
            int size = amd.this.f532b.size();
            size = zA ? size : size - 1;
            this.f537c = zJ ? size + 1 : size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f537c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public amv<C> get(int i) {
            Cut<C> cutBelowAll;
            Cut<C> cutAboveAll;
            Preconditions.checkElementIndex(i, this.f537c);
            if (!this.f536a) {
                cutBelowAll = ((amv) amd.this.f532b.get(i)).f567b;
            } else {
                cutBelowAll = i == 0 ? Cut.belowAll() : ((amv) amd.this.f532b.get(i - 1)).f567b;
            }
            if (!this.e || i != this.f537c - 1) {
                cutAboveAll = ((amv) amd.this.f532b.get(i + (!this.f536a ? 1 : 0))).f568c;
            } else {
                cutAboveAll = Cut.aboveAll();
            }
            return amv.c(cutBelowAll, cutAboveAll);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.RangeSet
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public amd<C> complement() {
        amd<C> amdVar = this.e;
        if (amdVar != null) {
            return amdVar;
        }
        if (this.f532b.isEmpty()) {
            amd<C> amdVarB = b();
            this.e = amdVarB;
            return amdVarB;
        }
        if (this.f532b.size() == 1 && this.f532b.get(0).equals(amv.d())) {
            amd<C> amdVarE = e();
            this.e = amdVarE;
            return amdVarE;
        }
        amd<C> amdVar2 = new amd<>(new b(), this);
        this.e = amdVar2;
        return amdVar2;
    }

    private ImmutableList<amv<C>> a(final amv<C> amvVar) {
        int size;
        if (this.f532b.isEmpty() || amvVar.f()) {
            return ImmutableList.of();
        }
        if (amvVar.b(span())) {
            return this.f532b;
        }
        final int iD = amvVar.a() ? SortedLists.d(this.f532b, amv.b(), amvVar.f568c, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
        if (amvVar.j()) {
            size = SortedLists.d(this.f532b, amv.e(), amvVar.f567b, SortedLists.KeyPresentBehavior.FIRST_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        } else {
            size = this.f532b.size();
        }
        final int i = size - iD;
        if (i == 0) {
            return ImmutableList.of();
        }
        return (ImmutableList<amv<C>>) new ImmutableList<amv<C>>() { // from class: amd.1
            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public amv<C> get(int i2) {
                Preconditions.checkElementIndex(i2, i);
                return (i2 == 0 || i2 == i + (-1)) ? ((amv) amd.this.f532b.get(i2 + iD)).c(amvVar) : (amv) amd.this.f532b.get(i2 + iD);
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.RangeSet
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public amd<C> subRangeSet(amv<C> amvVar) {
        if (!isEmpty()) {
            amv<C> amvVarSpan = span();
            if (amvVar.b(amvVarSpan)) {
                return this;
            }
            if (amvVar.e(amvVarSpan)) {
                return new amd<>(a(amvVar));
            }
        }
        return e();
    }

    public static <C extends Comparable<?>> c<C> d() {
        return new c<>();
    }

    public static class c<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<amv<C>> f538a = aml.e();

        public c<C> c(amv<C> amvVar) {
            Preconditions.checkArgument(!amvVar.f(), "range must not be empty, but was %s", amvVar);
            this.f538a.add(amvVar);
            return this;
        }

        public c<C> e(Iterable<amv<C>> iterable) {
            Iterator<amv<C>> it = iterable.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            return this;
        }

        c<C> b(c<C> cVar) {
            e(cVar.f538a);
            return this;
        }

        public amd<C> b() {
            ImmutableList.c cVar = new ImmutableList.c(this.f538a.size());
            Collections.sort(this.f538a, amv.c());
            PeekingIterator peekingIteratorA = Iterators.a(this.f538a.iterator());
            while (peekingIteratorA.hasNext()) {
                amv amvVarA = (amv) peekingIteratorA.next();
                while (peekingIteratorA.hasNext()) {
                    amv<C> amvVar = (amv) peekingIteratorA.peek();
                    if (!amvVarA.e(amvVar)) {
                        break;
                    }
                    Preconditions.checkArgument(amvVarA.c(amvVar).f(), "Overlapping ranges not permitted but found %s overlapping %s", amvVarA, amvVar);
                    amvVarA = amvVarA.a((amv) peekingIteratorA.next());
                }
                cVar.add(amvVarA);
            }
            ImmutableList immutableListBuild = cVar.build();
            if (immutableListBuild.isEmpty()) {
                return amd.e();
            }
            if (immutableListBuild.size() == 1 && ((amv) amn.c(immutableListBuild)).equals(amv.d())) {
                return amd.b();
            }
            return new amd<>(immutableListBuild);
        }
    }

    static final class a<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableList<amv<C>> f535b;

        a(ImmutableList<amv<C>> immutableList) {
            this.f535b = immutableList;
        }

        Object readResolve() {
            if (this.f535b.isEmpty()) {
                return amd.e();
            }
            if (this.f535b.equals(ImmutableList.of(amv.d()))) {
                return amd.b();
            }
            return new amd(this.f535b);
        }
    }

    Object writeReplace() {
        return new a(this.f532b);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
