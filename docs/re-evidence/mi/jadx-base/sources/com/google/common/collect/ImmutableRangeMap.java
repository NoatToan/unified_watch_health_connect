package com.google.common.collect;

import defpackage.c6i;
import defpackage.df5;
import defpackage.dua;
import defpackage.rbj;
import defpackage.uaq;
import defpackage.xhe;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public class ImmutableRangeMap<K extends Comparable<?>, V> implements rbj<K, V>, Serializable {
    private static final ImmutableRangeMap<Comparable<?>, Object> EMPTY = new ImmutableRangeMap<>(ImmutableList.of(), ImmutableList.of());
    private static final long serialVersionUID = 0;
    private final transient ImmutableList<Range<K>> ranges;
    private final transient ImmutableList<V> values;

    public class a extends ImmutableList<Range<K>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f9056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9057b;
        public final /* synthetic */ Range c;

        public a(int i, int i2, Range range) {
            this.f9056a = i;
            this.f9057b = i2;
            this.c = range;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Range<K> get(int i) {
            c6i.m(i, this.f9056a);
            return (i == 0 || i == this.f9056a + (-1)) ? ((Range) ImmutableRangeMap.this.ranges.get(i + this.f9057b)).intersection(this.c) : (Range) ImmutableRangeMap.this.ranges.get(i + this.f9057b);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9056a;
        }
    }

    public class b extends ImmutableRangeMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Range f9058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImmutableRangeMap f9059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImmutableRangeMap immutableRangeMap, ImmutableList immutableList, ImmutableList immutableList2, Range range, ImmutableRangeMap immutableRangeMap2) {
            super(immutableList, immutableList2);
            this.f9058a = range;
            this.f9059b = immutableRangeMap2;
        }

        @Override // com.google.common.collect.ImmutableRangeMap
        /* JADX INFO: renamed from: asDescendingMapOfRanges */
        public /* bridge */ /* synthetic */ Map mo136asDescendingMapOfRanges() {
            return super.mo136asDescendingMapOfRanges();
        }

        @Override // com.google.common.collect.ImmutableRangeMap, defpackage.rbj
        public /* bridge */ /* synthetic */ Map asMapOfRanges() {
            return super.asMapOfRanges();
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // com.google.common.collect.ImmutableRangeMap
        /* JADX INFO: renamed from: subRangeMap, reason: merged with bridge method [inline-methods] */
        public ImmutableRangeMap<K, V> mo137subRangeMap(Range<K> range) {
            return this.f9058a.isConnected(range) ? this.f9059b.mo137subRangeMap((Range) range.intersection(this.f9058a)) : ImmutableRangeMap.of();
        }
    }

    public static final class c<K extends Comparable<?>, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Map.Entry<Range<K>, V>> f9060a = xhe.g();

        public ImmutableRangeMap<K, V> a() {
            Collections.sort(this.f9060a, Range.rangeLexOrdering().f());
            ImmutableList.a aVar = new ImmutableList.a(this.f9060a.size());
            ImmutableList.a aVar2 = new ImmutableList.a(this.f9060a.size());
            for (int i = 0; i < this.f9060a.size(); i++) {
                Range<K> key = this.f9060a.get(i).getKey();
                if (i > 0) {
                    Range<K> key2 = this.f9060a.get(i - 1).getKey();
                    if (key.isConnected(key2) && !key.intersection(key2).isEmpty()) {
                        String strValueOf = String.valueOf(key2);
                        String strValueOf2 = String.valueOf(key);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 47 + strValueOf2.length());
                        sb.append("Overlapping ranges: range ");
                        sb.append(strValueOf);
                        sb.append(" overlaps with entry ");
                        sb.append(strValueOf2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                aVar.a(key);
                aVar2.a(this.f9060a.get(i).getValue());
            }
            return new ImmutableRangeMap<>(aVar.k(), aVar2.k());
        }

        public c<K, V> b(Range<K> range, V v) {
            c6i.o(range);
            c6i.o(v);
            c6i.j(!range.isEmpty(), "Range must not be empty, but was %s", range);
            this.f9060a.add(s.i(range, v));
            return this;
        }
    }

    public static class d<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMap<Range<K>, V> f9061a;

        public d(ImmutableMap<Range<K>, V> immutableMap) {
            this.f9061a = immutableMap;
        }

        public Object a() {
            c cVar = new c();
            uaq<Map.Entry<Range<K>, V>> it = this.f9061a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Range<K>, V> next = it.next();
                cVar.b(next.getKey(), next.getValue());
            }
            return cVar.a();
        }

        public Object readResolve() {
            return this.f9061a.isEmpty() ? ImmutableRangeMap.of() : a();
        }
    }

    public ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
        this.ranges = immutableList;
        this.values = immutableList2;
    }

    public static <K extends Comparable<?>, V> c<K, V> builder() {
        return new c<>();
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(rbj<K, ? extends V> rbjVar) {
        if (rbjVar instanceof ImmutableRangeMap) {
            return (ImmutableRangeMap) rbjVar;
        }
        Map<Range<K>, ? extends V> mapAsMapOfRanges = rbjVar.asMapOfRanges();
        ImmutableList.a aVar = new ImmutableList.a(mapAsMapOfRanges.size());
        ImmutableList.a aVar2 = new ImmutableList.a(mapAsMapOfRanges.size());
        for (Map.Entry entry : mapAsMapOfRanges.entrySet()) {
            aVar.a((Range) entry.getKey());
            aVar2.a(entry.getValue());
        }
        return new ImmutableRangeMap<>(aVar.k(), aVar2.k());
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of() {
        return (ImmutableRangeMap<K, V>) EMPTY;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof rbj) {
            return asMapOfRanges().equals(((rbj) obj).asMapOfRanges());
        }
        return false;
    }

    public V get(K k2) {
        int iA = k0.a(this.ranges, Range.lowerBoundFn(), df5.d(k2), k0.c.f9196a, k0.b.f9194a);
        if (iA != -1 && this.ranges.get(iA).contains(k2)) {
            return this.values.get(iA);
        }
        return null;
    }

    public Map.Entry<Range<K>, V> getEntry(K k2) {
        int iA = k0.a(this.ranges, Range.lowerBoundFn(), df5.d(k2), k0.c.f9196a, k0.b.f9194a);
        if (iA == -1) {
            return null;
        }
        Range<K> range = this.ranges.get(iA);
        if (range.contains(k2)) {
            return s.i(range, this.values.get(iA));
        }
        return null;
    }

    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Deprecated
    public final void put(Range<K> range, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(rbj<K, V> rbjVar) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putCoalescing(Range<K> range, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void remove(Range<K> range) {
        throw new UnsupportedOperationException();
    }

    public Range<K> span() {
        if (this.ranges.isEmpty()) {
            throw new NoSuchElementException();
        }
        Range<K> range = this.ranges.get(0);
        ImmutableList<Range<K>> immutableList = this.ranges;
        return Range.create(range.lowerBound, immutableList.get(immutableList.size() - 1).upperBound);
    }

    public String toString() {
        return asMapOfRanges().toString();
    }

    public Object writeReplace() {
        return new d(asMapOfRanges());
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of(Range<K> range, V v) {
        return new ImmutableRangeMap<>(ImmutableList.of(range), ImmutableList.of(v));
    }

    @Override // 
    /* JADX INFO: renamed from: asDescendingMapOfRanges, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<Range<K>, V> mo136asDescendingMapOfRanges() {
        return this.ranges.isEmpty() ? ImmutableMap.of() : new ImmutableSortedMap(new e0(this.ranges.reverse(), Range.rangeLexOrdering().h()), this.values.reverse());
    }

    @Override // defpackage.rbj
    public ImmutableMap<Range<K>, V> asMapOfRanges() {
        return this.ranges.isEmpty() ? ImmutableMap.of() : new ImmutableSortedMap(new e0(this.ranges, Range.rangeLexOrdering()), this.values);
    }

    @Override // 
    /* JADX INFO: renamed from: subRangeMap */
    public ImmutableRangeMap<K, V> mo137subRangeMap(Range<K> range) {
        if (((Range) c6i.o(range)).isEmpty()) {
            return of();
        }
        if (this.ranges.isEmpty() || range.encloses(span())) {
            return this;
        }
        ImmutableList<Range<K>> immutableList = this.ranges;
        dua duaVarUpperBoundFn = Range.upperBoundFn();
        Comparable comparable = range.lowerBound;
        k0.c cVar = k0.c.d;
        k0.b bVar = k0.b.f9195b;
        int iA = k0.a(immutableList, duaVarUpperBoundFn, comparable, cVar, bVar);
        int iA2 = k0.a(this.ranges, Range.lowerBoundFn(), range.upperBound, k0.c.f9196a, bVar);
        return iA >= iA2 ? of() : new b(this, new a(iA2 - iA, iA, range), this.values.subList(iA, iA2), range, this);
    }
}
