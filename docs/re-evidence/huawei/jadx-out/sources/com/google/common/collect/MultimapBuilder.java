package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import defpackage.ale;
import defpackage.amz;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class MultimapBuilder<K0, V0> {
    private static final int DEFAULT_EXPECTED_KEYS = 8;

    public abstract <K extends K0, V extends V0> Multimap<K, V> build();

    private MultimapBuilder() {
    }

    public static MultimapBuilderWithKeys<Object> hashKeys() {
        return hashKeys(8);
    }

    public static MultimapBuilderWithKeys<Object> hashKeys(final int i) {
        ale.b(i, "expectedKeys");
        return new MultimapBuilderWithKeys<Object>() { // from class: com.google.common.collect.MultimapBuilder.2
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            <K, V> Map<K, Collection<V>> createMap() {
                return amz.a(i);
            }
        };
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys() {
        return linkedHashKeys(8);
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys(final int i) {
        ale.b(i, "expectedKeys");
        return new MultimapBuilderWithKeys<Object>() { // from class: com.google.common.collect.MultimapBuilder.5
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            <K, V> Map<K, Collection<V>> createMap() {
                return amz.d(i);
            }
        };
    }

    public static MultimapBuilderWithKeys<Comparable> treeKeys() {
        return treeKeys(Ordering.natural());
    }

    public static <K0> MultimapBuilderWithKeys<K0> treeKeys(final Comparator<K0> comparator) {
        Preconditions.checkNotNull(comparator);
        return new MultimapBuilderWithKeys<K0>() { // from class: com.google.common.collect.MultimapBuilder.3
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            <K extends K0, V> Map<K, Collection<V>> createMap() {
                return new TreeMap(comparator);
            }
        };
    }

    public static <K0 extends Enum<K0>> MultimapBuilderWithKeys<K0> enumKeys(final Class<K0> cls) {
        Preconditions.checkNotNull(cls);
        return new MultimapBuilderWithKeys<K0>() { // from class: com.google.common.collect.MultimapBuilder.1
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            <K extends K0, V> Map<K, Collection<V>> createMap() {
                return new EnumMap(cls);
            }
        };
    }

    static final class c<V> implements Supplier<List<V>>, Serializable {
        private final int d;

        c(int i) {
            this.d = ale.b(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.d);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    enum LinkedListSupplier implements Supplier<List<?>> {
        INSTANCE;

        public static <V> Supplier<List<V>> instance() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Supplier
        public List<?> get() {
            return new LinkedList();
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class a<V> implements Supplier<Set<V>>, Serializable {
        private final int d;

        a(int i) {
            this.d = ale.b(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return amz.b(this.d);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class e<V> implements Supplier<Set<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f4460a;

        e(int i) {
            this.f4460a = ale.b(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return amz.e(this.f4460a);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class b<V> implements Supplier<SortedSet<V>>, Serializable {
        private final Comparator<? super V> d;

        b(Comparator<? super V> comparator) {
            this.d = (Comparator) Preconditions.checkNotNull(comparator);
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> get() {
            return new TreeSet(this.d);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class d<V extends Enum<V>> implements Supplier<Set<V>>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<V> f4459c;

        d(Class<V> cls) {
            this.f4459c = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return EnumSet.noneOf(this.f4459c);
        }
    }

    public static abstract class MultimapBuilderWithKeys<K0> {
        private static final int DEFAULT_EXPECTED_VALUES_PER_KEY = 2;

        abstract <K extends K0, V> Map<K, Collection<V>> createMap();

        MultimapBuilderWithKeys() {
        }

        public ListMultimapBuilder<K0, Object> arrayListValues() {
            return arrayListValues(2);
        }

        public ListMultimapBuilder<K0, Object> arrayListValues(final int i) {
            ale.b(i, "expectedValuesPerKey");
            return new ListMultimapBuilder<K0, Object>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.5
                @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> ListMultimap<K, V> build() {
                    return Multimaps.c(MultimapBuilderWithKeys.this.createMap(), new c(i));
                }
            };
        }

        public ListMultimapBuilder<K0, Object> linkedListValues() {
            return new ListMultimapBuilder<K0, Object>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.1
                @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> ListMultimap<K, V> build() {
                    return Multimaps.c(MultimapBuilderWithKeys.this.createMap(), LinkedListSupplier.instance());
                }
            };
        }

        public SetMultimapBuilder<K0, Object> hashSetValues() {
            return hashSetValues(2);
        }

        public SetMultimapBuilder<K0, Object> hashSetValues(final int i) {
            ale.b(i, "expectedValuesPerKey");
            return new SetMultimapBuilder<K0, Object>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.3
                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> SetMultimap<K, V> build() {
                    return Multimaps.b(MultimapBuilderWithKeys.this.createMap(), new a(i));
                }
            };
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues() {
            return linkedHashSetValues(2);
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues(final int i) {
            ale.b(i, "expectedValuesPerKey");
            return new SetMultimapBuilder<K0, Object>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.4
                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> SetMultimap<K, V> build() {
                    return Multimaps.b(MultimapBuilderWithKeys.this.createMap(), new e(i));
                }
            };
        }

        public SortedSetMultimapBuilder<K0, Comparable> treeSetValues() {
            return treeSetValues(Ordering.natural());
        }

        public <V0> SortedSetMultimapBuilder<K0, V0> treeSetValues(final Comparator<V0> comparator) {
            Preconditions.checkNotNull(comparator, "comparator");
            return new SortedSetMultimapBuilder<K0, V0>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.2
                @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V extends V0> SortedSetMultimap<K, V> build() {
                    return Multimaps.a(MultimapBuilderWithKeys.this.createMap(), new b(comparator));
                }
            };
        }

        public <V0 extends Enum<V0>> SetMultimapBuilder<K0, V0> enumSetValues(final Class<V0> cls) {
            Preconditions.checkNotNull(cls, "valueClass");
            return new SetMultimapBuilder<K0, V0>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.7
                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V extends V0> SetMultimap<K, V> build() {
                    return Multimaps.b(MultimapBuilderWithKeys.this.createMap(), new d(cls));
                }
            };
        }
    }

    public <K extends K0, V extends V0> Multimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
        Multimap<K, V> multimapBuild = build();
        multimapBuild.putAll(multimap);
        return multimapBuild;
    }

    public static abstract class ListMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> ListMultimap<K, V> build();

        ListMultimapBuilder() {
            super();
        }

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> ListMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (ListMultimap) super.build((Multimap) multimap);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class SetMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SetMultimap<K, V> build();

        SetMultimapBuilder() {
            super();
        }

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (SetMultimap) super.build((Multimap) multimap);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class SortedSetMultimapBuilder<K0, V0> extends SetMultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SortedSetMultimap<K, V> build();

        SortedSetMultimapBuilder() {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SortedSetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (SortedSetMultimap) super.build((Multimap) multimap);
        }
    }
}
