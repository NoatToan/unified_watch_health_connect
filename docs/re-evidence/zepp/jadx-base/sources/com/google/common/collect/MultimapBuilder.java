package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
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

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible
public abstract class MultimapBuilder<K0, V0> {
    private static final int a = 8;

    public static abstract class MultimapBuilderWithKeys<K0> {
        private static final int a = 2;

        public class a extends ListMultimapBuilder<K0, Object> {
            public final /* synthetic */ int b;

            public a(int i) {
                this.b = i;
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> ListMultimap<K, V> build() {
                return Multimaps.newListMultimap(MultimapBuilderWithKeys.this.a(), new e(this.b));
            }
        }

        public class b extends ListMultimapBuilder<K0, Object> {
            public b() {
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> ListMultimap<K, V> build() {
                return Multimaps.newListMultimap(MultimapBuilderWithKeys.this.a(), i.b());
            }
        }

        public class c extends SetMultimapBuilder<K0, Object> {
            public final /* synthetic */ int b;

            public c(int i) {
                this.b = i;
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> SetMultimap<K, V> build() {
                return Multimaps.newSetMultimap(MultimapBuilderWithKeys.this.a(), new g(this.b));
            }
        }

        public class d extends SetMultimapBuilder<K0, Object> {
            public final /* synthetic */ int b;

            public d(int i) {
                this.b = i;
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> SetMultimap<K, V> build() {
                return Multimaps.newSetMultimap(MultimapBuilderWithKeys.this.a(), new h(this.b));
            }
        }

        public class f extends SetMultimapBuilder<K0, V0> {
            public final /* synthetic */ Class b;

            public f(Class cls) {
                this.b = cls;
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V extends V0> SetMultimap<K, V> build() {
                return Multimaps.newSetMultimap(MultimapBuilderWithKeys.this.a(), new f(this.b));
            }
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> a();

        public ListMultimapBuilder<K0, Object> arrayListValues() {
            return arrayListValues(2);
        }

        public <V0 extends Enum<V0>> SetMultimapBuilder<K0, V0> enumSetValues(Class<V0> cls) {
            Preconditions.checkNotNull(cls, "valueClass");
            return new f(cls);
        }

        public SetMultimapBuilder<K0, Object> hashSetValues() {
            return hashSetValues(2);
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues() {
            return linkedHashSetValues(2);
        }

        public ListMultimapBuilder<K0, Object> linkedListValues() {
            return new b();
        }

        public SortedSetMultimapBuilder<K0, Comparable> treeSetValues() {
            return treeSetValues(Ordering.natural());
        }

        public class e extends SortedSetMultimapBuilder<K0, V0> {
            public final /* synthetic */ Comparator b;

            public e(Comparator comparator) {
                this.b = comparator;
            }

            @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V extends V0> SortedSetMultimap<K, V> build() {
                return Multimaps.newSortedSetMultimap(MultimapBuilderWithKeys.this.a(), new j(this.b));
            }
        }

        public ListMultimapBuilder<K0, Object> arrayListValues(int i) {
            u.b(i, "expectedValuesPerKey");
            return new a(i);
        }

        public SetMultimapBuilder<K0, Object> hashSetValues(int i) {
            u.b(i, "expectedValuesPerKey");
            return new c(i);
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues(int i) {
            u.b(i, "expectedValuesPerKey");
            return new d(i);
        }

        public <V0> SortedSetMultimapBuilder<K0, V0> treeSetValues(Comparator<V0> comparator) {
            Preconditions.checkNotNull(comparator, "comparator");
            return new e(comparator);
        }
    }

    public static class a extends MultimapBuilderWithKeys<Object> {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        public <K, V> Map<K, Collection<V>> a() {
            return w1.c(this.b);
        }
    }

    public static class b extends MultimapBuilderWithKeys<Object> {
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        public <K, V> Map<K, Collection<V>> a() {
            return w1.e(this.b);
        }
    }

    public static class c extends MultimapBuilderWithKeys<K0> {
        public final /* synthetic */ Comparator b;

        public c(Comparator comparator) {
            this.b = comparator;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        public <K extends K0, V> Map<K, Collection<V>> a() {
            return new TreeMap(this.b);
        }
    }

    public static class d extends MultimapBuilderWithKeys<K0> {
        public final /* synthetic */ Class b;

        public d(Class cls) {
            this.b = cls;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        public <K extends K0, V> Map<K, Collection<V>> a() {
            return new EnumMap(this.b);
        }
    }

    public static final class e<V> implements Supplier<List<V>>, Serializable {
        private final int a;

        public e(int i) {
            this.a = u.b(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.a);
        }
    }

    public static final class f<V extends Enum<V>> implements Supplier<Set<V>>, Serializable {
        private final Class<V> a;

        public f(Class<V> cls) {
            this.a = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return EnumSet.noneOf(this.a);
        }
    }

    public static final class g<V> implements Supplier<Set<V>>, Serializable {
        private final int a;

        public g(int i) {
            this.a = u.b(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return w1.d(this.a);
        }
    }

    public static final class h<V> implements Supplier<Set<V>>, Serializable {
        private final int a;

        public h(int i) {
            this.a = u.b(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return w1.f(this.a);
        }
    }

    public enum i implements Supplier<List<Object>> {
        INSTANCE;

        public static <V> Supplier<List<V>> b() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Object> get() {
            return new LinkedList();
        }
    }

    public static final class j<V> implements Supplier<SortedSet<V>>, Serializable {
        private final Comparator<? super V> a;

        public j(Comparator<? super V> comparator) {
            this.a = (Comparator) Preconditions.checkNotNull(comparator);
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> get() {
            return new TreeSet(this.a);
        }
    }

    public /* synthetic */ MultimapBuilder(a aVar) {
        this();
    }

    public static <K0 extends Enum<K0>> MultimapBuilderWithKeys<K0> enumKeys(Class<K0> cls) {
        Preconditions.checkNotNull(cls);
        return new d(cls);
    }

    public static MultimapBuilderWithKeys<Object> hashKeys() {
        return hashKeys(8);
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys() {
        return linkedHashKeys(8);
    }

    public static MultimapBuilderWithKeys<Comparable> treeKeys() {
        return treeKeys(Ordering.natural());
    }

    public abstract <K extends K0, V extends V0> Multimap<K, V> build();

    public <K extends K0, V extends V0> Multimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
        Multimap<K, V> multimapBuild = build();
        multimapBuild.putAll(multimap);
        return multimapBuild;
    }

    public static abstract class ListMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        public ListMultimapBuilder() {
            super(null);
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> ListMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> ListMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (ListMultimap) super.build((Multimap) multimap);
        }
    }

    public static abstract class SetMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        public SetMultimapBuilder() {
            super(null);
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (SetMultimap) super.build((Multimap) multimap);
        }
    }

    private MultimapBuilder() {
    }

    public static MultimapBuilderWithKeys<Object> hashKeys(int i2) {
        u.b(i2, "expectedKeys");
        return new a(i2);
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys(int i2) {
        u.b(i2, "expectedKeys");
        return new b(i2);
    }

    public static <K0> MultimapBuilderWithKeys<K0> treeKeys(Comparator<K0> comparator) {
        Preconditions.checkNotNull(comparator);
        return new c(comparator);
    }

    public static abstract class SortedSetMultimapBuilder<K0, V0> extends SetMultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SortedSetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SortedSetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (SortedSetMultimap) super.build((Multimap) multimap);
        }
    }
}
