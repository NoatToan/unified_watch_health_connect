package com.google.common.collect;

import defpackage.b10;
import defpackage.c6i;
import defpackage.d8g;
import defpackage.df5;
import defpackage.dqh;
import defpackage.epd;
import defpackage.i1a;
import defpackage.ich;
import defpackage.o10;
import defpackage.sbj;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public class TreeRangeSet<C extends Comparable<?>> extends o10<C> implements Serializable {
    private transient Set<Range<C>> asDescendingSetOfRanges;
    private transient Set<Range<C>> asRanges;
    private transient sbj<C> complement;
    final NavigableMap<df5<C>, Range<C>> rangesByLowerBound;

    public final class b extends i1a<Range<C>> implements Set<Range<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Collection<Range<C>> f9128a;

        public b(TreeRangeSet treeRangeSet, Collection<Range<C>> collection) {
            this.f9128a = collection;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return i0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return i0.b(this);
        }

        @Override // defpackage.i1a, defpackage.t1a
        public Collection<Range<C>> delegate() {
            return this.f9128a;
        }
    }

    public final class c extends TreeRangeSet<C> {
        public c() {
            super(new d(TreeRangeSet.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.TreeRangeSet, defpackage.o10
        public void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, defpackage.sbj
        public sbj<C> complement() {
            return TreeRangeSet.this;
        }

        @Override // com.google.common.collect.TreeRangeSet, defpackage.o10
        public boolean contains(C c) {
            return !TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, defpackage.o10
        public void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }
    }

    public static final class d<C extends Comparable<?>> extends com.google.common.collect.f<df5<C>, Range<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NavigableMap<df5<C>, Range<C>> f9130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NavigableMap<df5<C>, Range<C>> f9131b;
        public final Range<df5<C>> c;

        public class a extends b10<Map.Entry<df5<C>, Range<C>>> {
            public df5<C> c;
            public final /* synthetic */ df5 d;
            public final /* synthetic */ dqh e;

            public a(df5 df5Var, dqh dqhVar) {
                this.d = df5Var;
                this.e = dqhVar;
                this.c = df5Var;
            }

            @Override // defpackage.b10
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<df5<C>, Range<C>> a() {
                Range rangeCreate;
                if (d.this.c.upperBound.o(this.c) || this.c == df5.a()) {
                    return (Map.Entry) b();
                }
                if (this.e.hasNext()) {
                    Range range = (Range) this.e.next();
                    rangeCreate = Range.create(this.c, range.lowerBound);
                    this.c = range.upperBound;
                } else {
                    rangeCreate = Range.create(this.c, df5.a());
                    this.c = df5.a();
                }
                return s.i(rangeCreate.lowerBound, rangeCreate);
            }
        }

        public class b extends b10<Map.Entry<df5<C>, Range<C>>> {
            public df5<C> c;
            public final /* synthetic */ df5 d;
            public final /* synthetic */ dqh e;

            public b(df5 df5Var, dqh dqhVar) {
                this.d = df5Var;
                this.e = dqhVar;
                this.c = df5Var;
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
            @Override // defpackage.b10
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<df5<C>, Range<C>> a() {
                if (this.c == df5.c()) {
                    return (Map.Entry) b();
                }
                if (this.e.hasNext()) {
                    Range range = (Range) this.e.next();
                    Range rangeCreate = Range.create(range.upperBound, this.c);
                    this.c = range.lowerBound;
                    if (d.this.c.lowerBound.o(rangeCreate.lowerBound)) {
                        return s.i(rangeCreate.lowerBound, rangeCreate);
                    }
                } else if (d.this.c.lowerBound.o(df5.c())) {
                    Range rangeCreate2 = Range.create(df5.c(), this.c);
                    this.c = df5.c();
                    return s.i(df5.c(), rangeCreate2);
                }
                return (Map.Entry) b();
            }
        }

        public d(NavigableMap<df5<C>, Range<C>> navigableMap) {
            this(navigableMap, Range.all());
        }

        @Override // com.google.common.collect.s.l
        public Iterator<Map.Entry<df5<C>, Range<C>>> a() {
            Collection<Range<C>> collectionValues;
            df5 df5VarC;
            if (this.c.hasLowerBound()) {
                collectionValues = this.f9131b.tailMap((df5) this.c.lowerEndpoint(), this.c.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                collectionValues = this.f9131b.values();
            }
            dqh dqhVarP = epd.p(collectionValues.iterator());
            if (this.c.contains(df5.c()) && (!dqhVarP.hasNext() || ((Range) dqhVarP.peek()).lowerBound != df5.c())) {
                df5VarC = df5.c();
            } else {
                if (!dqhVarP.hasNext()) {
                    return epd.h();
                }
                df5VarC = ((Range) dqhVarP.next()).upperBound;
            }
            return new a(df5VarC, dqhVarP);
        }

        @Override // com.google.common.collect.f
        public Iterator<Map.Entry<df5<C>, Range<C>>> b() {
            df5<C> df5VarHigherKey;
            dqh dqhVarP = epd.p(this.f9131b.headMap(this.c.hasUpperBound() ? (df5) this.c.upperEndpoint() : df5.a(), this.c.hasUpperBound() && this.c.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (dqhVarP.hasNext()) {
                df5VarHigherKey = ((Range) dqhVarP.peek()).upperBound == df5.a() ? ((Range) dqhVarP.next()).lowerBound : this.f9130a.higherKey(((Range) dqhVarP.peek()).upperBound);
            } else {
                if (!this.c.contains(df5.c()) || this.f9130a.containsKey(df5.c())) {
                    return epd.h();
                }
                df5VarHigherKey = this.f9130a.higherKey(df5.c());
            }
            return new b((df5) d8g.a(df5VarHigherKey, df5.a()), dqhVarP);
        }

        @Override // java.util.SortedMap
        public Comparator<? super df5<C>> comparator() {
            return ich.e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            if (obj instanceof df5) {
                try {
                    df5<C> df5Var = (df5) obj;
                    Map.Entry<df5<C>, Range<C>> entryFirstEntry = tailMap(df5Var, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(df5Var)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<df5<C>, Range<C>> headMap(df5<C> df5Var, boolean z) {
            return j(Range.upTo(df5Var, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<df5<C>, Range<C>> subMap(df5<C> df5Var, boolean z, df5<C> df5Var2, boolean z2) {
            return j(Range.range(df5Var, BoundType.forBoolean(z), df5Var2, BoundType.forBoolean(z2)));
        }

        public final NavigableMap<df5<C>, Range<C>> j(Range<df5<C>> range) {
            if (!this.c.isConnected(range)) {
                return ImmutableSortedMap.of();
            }
            return new d(this.f9130a, range.intersection(this.c));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap<df5<C>, Range<C>> tailMap(df5<C> df5Var, boolean z) {
            return j(Range.downTo(df5Var, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return epd.u(a());
        }

        public d(NavigableMap<df5<C>, Range<C>> navigableMap, Range<df5<C>> range) {
            this.f9130a = navigableMap;
            this.f9131b = new e(navigableMap);
            this.c = range;
        }
    }

    public final class f extends TreeRangeSet<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Range<C> f9134a;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(Range<C> range) {
            super(new g(Range.all(), range, TreeRangeSet.this.rangesByLowerBound));
            this.f9134a = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, defpackage.o10
        public void add(Range<C> range) {
            c6i.k(this.f9134a.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, this.f9134a);
            TreeRangeSet.this.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, defpackage.o10
        public void clear() {
            TreeRangeSet.this.remove(this.f9134a);
        }

        @Override // com.google.common.collect.TreeRangeSet, defpackage.o10
        public boolean contains(C c) {
            return this.f9134a.contains(c) && TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, defpackage.o10, defpackage.sbj
        public boolean encloses(Range<C> range) {
            Range rangeRangeEnclosing;
            return (this.f9134a.isEmpty() || !this.f9134a.encloses(range) || (rangeRangeEnclosing = TreeRangeSet.this.rangeEnclosing(range)) == null || rangeRangeEnclosing.intersection(this.f9134a).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, defpackage.o10
        public Range<C> rangeContaining(C c) {
            Range<C> rangeRangeContaining;
            if (this.f9134a.contains(c) && (rangeRangeContaining = TreeRangeSet.this.rangeContaining(c)) != null) {
                return rangeRangeContaining.intersection(this.f9134a);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, defpackage.o10
        public void remove(Range<C> range) {
            if (range.isConnected(this.f9134a)) {
                TreeRangeSet.this.remove(range.intersection(this.f9134a));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, defpackage.sbj
        public sbj<C> subRangeSet(Range<C> range) {
            if (range.encloses(this.f9134a)) {
                return this;
            }
            return range.isConnected(this.f9134a) ? new f(this.f9134a.intersection(range)) : ImmutableRangeSet.of();
        }
    }

    public static final class g<C extends Comparable<?>> extends com.google.common.collect.f<df5<C>, Range<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Range<df5<C>> f9136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Range<C> f9137b;
        public final NavigableMap<df5<C>, Range<C>> c;
        public final NavigableMap<df5<C>, Range<C>> d;

        public class a extends b10<Map.Entry<df5<C>, Range<C>>> {
            public final /* synthetic */ Iterator c;
            public final /* synthetic */ df5 d;

            public a(Iterator it, df5 df5Var) {
                this.c = it;
                this.d = df5Var;
            }

            @Override // defpackage.b10
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<df5<C>, Range<C>> a() {
                if (!this.c.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.c.next();
                if (this.d.o(range.lowerBound)) {
                    return (Map.Entry) b();
                }
                Range rangeIntersection = range.intersection(g.this.f9137b);
                return s.i(rangeIntersection.lowerBound, rangeIntersection);
            }
        }

        public class b extends b10<Map.Entry<df5<C>, Range<C>>> {
            public final /* synthetic */ Iterator c;

            public b(Iterator it) {
                this.c = it;
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
            @Override // defpackage.b10
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<df5<C>, Range<C>> a() {
                if (!this.c.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.c.next();
                if (g.this.f9137b.lowerBound.compareTo(range.upperBound) >= 0) {
                    return (Map.Entry) b();
                }
                Range rangeIntersection = range.intersection(g.this.f9137b);
                return g.this.f9136a.contains(rangeIntersection.lowerBound) ? s.i(rangeIntersection.lowerBound, rangeIntersection) : (Map.Entry) b();
            }
        }

        private NavigableMap<df5<C>, Range<C>> l(Range<df5<C>> range) {
            return !range.isConnected(this.f9136a) ? ImmutableSortedMap.of() : new g(this.f9136a.intersection(range), this.f9137b, this.c);
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
        @Override // com.google.common.collect.s.l
        public Iterator<Map.Entry<df5<C>, Range<C>>> a() {
            Iterator<Range<C>> it;
            if (!this.f9137b.isEmpty() && !this.f9136a.upperBound.o(this.f9137b.lowerBound)) {
                if (this.f9136a.lowerBound.o(this.f9137b.lowerBound)) {
                    it = this.d.tailMap(this.f9137b.lowerBound, false).values().iterator();
                } else {
                    it = this.c.tailMap((df5) this.f9136a.lowerBound.m(), this.f9136a.lowerBoundType() == BoundType.CLOSED).values().iterator();
                }
                return new a(it, (df5) ich.e().d(this.f9136a.upperBound, df5.d(this.f9137b.upperBound)));
            }
            return epd.h();
        }

        @Override // com.google.common.collect.f
        public Iterator<Map.Entry<df5<C>, Range<C>>> b() {
            if (this.f9137b.isEmpty()) {
                return epd.h();
            }
            df5 df5Var = (df5) ich.e().d(this.f9136a.upperBound, df5.d(this.f9137b.upperBound));
            return new b(this.c.headMap((df5) df5Var.m(), df5Var.s() == BoundType.CLOSED).descendingMap().values().iterator());
        }

        @Override // java.util.SortedMap
        public Comparator<? super df5<C>> comparator() {
            return ich.e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
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
        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            if (obj instanceof df5) {
                try {
                    df5<C> df5Var = (df5) obj;
                    if (this.f9136a.contains(df5Var) && df5Var.compareTo(this.f9137b.lowerBound) >= 0 && df5Var.compareTo(this.f9137b.upperBound) < 0) {
                        if (df5Var.equals(this.f9137b.lowerBound)) {
                            Range range = (Range) s.E(this.c.floorEntry(df5Var));
                            if (range != null && range.upperBound.compareTo(this.f9137b.lowerBound) > 0) {
                                return range.intersection(this.f9137b);
                            }
                        } else {
                            Range<C> range2 = this.c.get(df5Var);
                            if (range2 != null) {
                                return range2.intersection(this.f9137b);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<df5<C>, Range<C>> headMap(df5<C> df5Var, boolean z) {
            return l(Range.upTo(df5Var, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<df5<C>, Range<C>> subMap(df5<C> df5Var, boolean z, df5<C> df5Var2, boolean z2) {
            return l(Range.range(df5Var, BoundType.forBoolean(z), df5Var2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<df5<C>, Range<C>> tailMap(df5<C> df5Var, boolean z) {
            return l(Range.downTo(df5Var, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return epd.u(a());
        }

        public g(Range<df5<C>> range, Range<C> range2, NavigableMap<df5<C>, Range<C>> navigableMap) {
            this.f9136a = (Range) c6i.o(range);
            this.f9137b = (Range) c6i.o(range2);
            this.c = (NavigableMap) c6i.o(navigableMap);
            this.d = new e(navigableMap);
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Range<C> rangeEnclosing(Range<C> range) {
        c6i.o(range);
        Map.Entry<df5<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (entryFloorEntry == null || !entryFloorEntry.getValue().encloses(range)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    private void replaceRangeWithSameLowerBound(Range<C> range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.o10
    public void add(Range<C> range) {
        c6i.o(range);
        if (range.isEmpty()) {
            return;
        }
        df5<C> df5Var = range.lowerBound;
        df5<C> df5Var2 = range.upperBound;
        Map.Entry<df5<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(df5Var);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo(df5Var) >= 0) {
                if (value.upperBound.compareTo(df5Var2) >= 0) {
                    df5Var2 = value.upperBound;
                }
                df5Var = value.lowerBound;
            }
        }
        Map.Entry<df5<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(df5Var2);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (value2.upperBound.compareTo(df5Var2) >= 0) {
                df5Var2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(df5Var, df5Var2).clear();
        replaceRangeWithSameLowerBound(Range.create(df5Var, df5Var2));
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ void addAll(sbj sbjVar) {
        super.addAll(sbjVar);
    }

    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.asDescendingSetOfRanges;
        if (set != null) {
            return set;
        }
        b bVar = new b(this, this.rangesByLowerBound.descendingMap().values());
        this.asDescendingSetOfRanges = bVar;
        return bVar;
    }

    @Override // defpackage.sbj
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.asRanges;
        if (set != null) {
            return set;
        }
        b bVar = new b(this, this.rangesByLowerBound.values());
        this.asRanges = bVar;
        return bVar;
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // defpackage.sbj
    public sbj<C> complement() {
        sbj<C> sbjVar = this.complement;
        if (sbjVar != null) {
            return sbjVar;
        }
        c cVar = new c();
        this.complement = cVar;
        return cVar;
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // defpackage.o10, defpackage.sbj
    public boolean encloses(Range<C> range) {
        c6i.o(range);
        Map.Entry<df5<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        return entryFloorEntry != null && entryFloorEntry.getValue().encloses(range);
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ boolean enclosesAll(sbj sbjVar) {
        return super.enclosesAll(sbjVar);
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // defpackage.o10
    public boolean intersects(Range<C> range) {
        c6i.o(range);
        Map.Entry<df5<C>, Range<C>> entryCeilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().isConnected(range) && !entryCeilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<df5<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().isConnected(range) || entryLowerEntry.getValue().intersection(range).isEmpty()) ? false : true;
    }

    @Override // defpackage.o10, defpackage.sbj
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // defpackage.o10
    public Range<C> rangeContaining(C c2) {
        c6i.o(c2);
        Map.Entry<df5<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(df5.d(c2));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(c2)) {
            return null;
        }
        return entryFloorEntry.getValue();
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
    @Override // defpackage.o10
    public void remove(Range<C> range) {
        c6i.o(range);
        if (range.isEmpty()) {
            return;
        }
        Map.Entry<df5<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo(range.lowerBound) >= 0) {
                if (range.hasUpperBound() && value.upperBound.compareTo(range.upperBound) >= 0) {
                    replaceRangeWithSameLowerBound(Range.create(range.upperBound, value.upperBound));
                }
                replaceRangeWithSameLowerBound(Range.create(value.lowerBound, range.lowerBound));
            }
        }
        Map.Entry<df5<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.upperBound);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (range.hasUpperBound() && value2.upperBound.compareTo(range.upperBound) >= 0) {
                replaceRangeWithSameLowerBound(Range.create(range.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
    }

    @Override // defpackage.o10, defpackage.sbj
    public /* bridge */ /* synthetic */ void removeAll(sbj sbjVar) {
        super.removeAll(sbjVar);
    }

    public Range<C> span() {
        Map.Entry<df5<C>, Range<C>> entryFirstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<df5<C>, Range<C>> entryLastEntry = this.rangesByLowerBound.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.create(entryFirstEntry.getValue().lowerBound, entryLastEntry.getValue().upperBound);
    }

    @Override // defpackage.sbj
    public sbj<C> subRangeSet(Range<C> range) {
        return range.equals(Range.all()) ? this : new f(range);
    }

    private TreeRangeSet(NavigableMap<df5<C>, Range<C>> navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(sbj<C> sbjVar) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(sbjVar);
        return treeRangeSetCreate;
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    public static final class e<C extends Comparable<?>> extends com.google.common.collect.f<df5<C>, Range<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NavigableMap<df5<C>, Range<C>> f9132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Range<df5<C>> f9133b;

        public class a extends b10<Map.Entry<df5<C>, Range<C>>> {
            public final /* synthetic */ Iterator c;

            public a(Iterator it) {
                this.c = it;
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
            @Override // defpackage.b10
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<df5<C>, Range<C>> a() {
                if (!this.c.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.c.next();
                return e.this.f9133b.upperBound.o(range.upperBound) ? (Map.Entry) b() : s.i(range.upperBound, range);
            }
        }

        public class b extends b10<Map.Entry<df5<C>, Range<C>>> {
            public final /* synthetic */ dqh c;

            public b(dqh dqhVar) {
                this.c = dqhVar;
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
            @Override // defpackage.b10
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<df5<C>, Range<C>> a() {
                if (!this.c.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.c.next();
                return e.this.f9133b.lowerBound.o(range.upperBound) ? s.i(range.upperBound, range) : (Map.Entry) b();
            }
        }

        public e(NavigableMap<df5<C>, Range<C>> navigableMap) {
            this.f9132a = navigableMap;
            this.f9133b = Range.all();
        }

        private NavigableMap<df5<C>, Range<C>> j(Range<df5<C>> range) {
            return range.isConnected(this.f9133b) ? new e(this.f9132a, range.intersection(this.f9133b)) : ImmutableSortedMap.of();
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
        @Override // com.google.common.collect.s.l
        public Iterator<Map.Entry<df5<C>, Range<C>>> a() {
            Map.Entry<df5<C>, Range<C>> entryLowerEntry;
            Iterator<Range<C>> it;
            if (this.f9133b.hasLowerBound() && (entryLowerEntry = this.f9132a.lowerEntry((df5) this.f9133b.lowerEndpoint())) != null) {
                it = this.f9133b.lowerBound.o(entryLowerEntry.getValue().upperBound) ? this.f9132a.tailMap(entryLowerEntry.getKey(), true).values().iterator() : this.f9132a.tailMap((df5) this.f9133b.lowerEndpoint(), true).values().iterator();
            } else {
                it = this.f9132a.values().iterator();
            }
            return new a(it);
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
        @Override // com.google.common.collect.f
        public Iterator<Map.Entry<df5<C>, Range<C>>> b() {
            dqh dqhVarP = epd.p((this.f9133b.hasUpperBound() ? this.f9132a.headMap((df5) this.f9133b.upperEndpoint(), false).descendingMap().values() : this.f9132a.descendingMap().values()).iterator());
            if (dqhVarP.hasNext() && this.f9133b.upperBound.o(((Range) dqhVarP.peek()).upperBound)) {
                dqhVarP.next();
            }
            return new b(dqhVarP);
        }

        @Override // java.util.SortedMap
        public Comparator<? super df5<C>> comparator() {
            return ich.e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            Map.Entry<df5<C>, Range<C>> entryLowerEntry;
            if (obj instanceof df5) {
                try {
                    df5<C> df5Var = (df5) obj;
                    if (this.f9133b.contains(df5Var) && (entryLowerEntry = this.f9132a.lowerEntry(df5Var)) != null && entryLowerEntry.getValue().upperBound.equals(df5Var)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<df5<C>, Range<C>> headMap(df5<C> df5Var, boolean z) {
            return j(Range.upTo(df5Var, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<df5<C>, Range<C>> subMap(df5<C> df5Var, boolean z, df5<C> df5Var2, boolean z2) {
            return j(Range.range(df5Var, BoundType.forBoolean(z), df5Var2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.f9133b.equals(Range.all())) {
                return this.f9132a.isEmpty();
            }
            return !a().hasNext();
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap<df5<C>, Range<C>> tailMap(df5<C> df5Var, boolean z) {
            return j(Range.downTo(df5Var, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f9133b.equals(Range.all()) ? this.f9132a.size() : epd.u(a());
        }

        public e(NavigableMap<df5<C>, Range<C>> navigableMap, Range<df5<C>> range) {
            this.f9132a = navigableMap;
            this.f9133b = range;
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(iterable);
        return treeRangeSetCreate;
    }
}
