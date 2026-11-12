package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Multiset;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ajz {
    private static final Collector<Object, ?, ImmutableList<Object>> d = Collector.of(new Supplier() { // from class: alg
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableList.builder();
        }
    }, new BiConsumer() { // from class: akh
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableList.c) obj).add(obj2);
        }
    }, new BinaryOperator() { // from class: ake
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableList.c) obj).d((ImmutableList.c) obj2);
        }
    }, new Function() { // from class: akf
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableList.c) obj).build();
        }
    }, new Collector.Characteristics[0]);
    private static final Collector<Object, ?, ImmutableSet<Object>> e = Collector.of(new Supplier() { // from class: akg
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableSet.builder();
        }
    }, new BiConsumer() { // from class: akd
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableSet.b) obj).add(obj2);
        }
    }, new BinaryOperator() { // from class: akl
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableSet.b) obj).d((ImmutableSet.b) obj2);
        }
    }, new Function() { // from class: akk
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableSet.b) obj).build();
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collector<amv<Comparable<?>>, ?, amd<Comparable<?>>> f495c = Collector.of(new Supplier() { // from class: akj
        @Override // java.util.function.Supplier
        public final Object get() {
            return amd.d();
        }
    }, new BiConsumer() { // from class: akm
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((amd.c) obj).c((amv) obj2);
        }
    }, new BinaryOperator() { // from class: alc
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((amd.c) obj).b((amd.c) obj2);
        }
    }, new Function() { // from class: aka
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((amd.c) obj).b();
        }
    }, new Collector.Characteristics[0]);

    public static <E> Collector<E, ?, ImmutableList<E>> e() {
        return (Collector<E, ?, ImmutableList<E>>) d;
    }

    public static <E> Collector<E, ?, ImmutableSet<E>> d() {
        return (Collector<E, ?, ImmutableSet<E>>) e;
    }

    public static <E> Collector<E, ?, ImmutableSortedSet<E>> e(final Comparator<? super E> comparator) {
        Preconditions.checkNotNull(comparator);
        return Collector.of(new Supplier() { // from class: akv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ajz.b(comparator);
            }
        }, new BiConsumer() { // from class: akx
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedSet.e) obj).add(obj2);
            }
        }, new BinaryOperator() { // from class: ala
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedSet.e) obj).d((ImmutableSortedSet.e) obj2);
            }
        }, new Function() { // from class: alb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedSet.e) obj).build();
            }
        }, new Collector.Characteristics[0]);
    }

    static /* synthetic */ ImmutableSortedSet.e b(Comparator comparator) {
        return new ImmutableSortedSet.e(comparator);
    }

    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> c(final Function<? super T, ? extends E> function, final ToIntFunction<? super T> toIntFunction) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        return Collector.of(new Supplier() { // from class: akr
            @Override // java.util.function.Supplier
            public final Object get() {
                return amp.e();
            }
        }, new BiConsumer() { // from class: akn
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Multiset) obj).add(Preconditions.checkNotNull(function.apply(obj2)), toIntFunction.applyAsInt(obj2));
            }
        }, new BinaryOperator() { // from class: ako
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ajz.e((Multiset) obj, (Multiset) obj2);
            }
        }, new Function() { // from class: akp
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMultiset.copyFromEntries(((Multiset) obj).entrySet());
            }
        }, new Collector.Characteristics[0]);
    }

    static /* synthetic */ Multiset e(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> c(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new Supplier() { // from class: akt
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableMap.b();
            }
        }, new BiConsumer() { // from class: aku
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableMap.b) obj).c(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: aks
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableMap.b) obj).d((ImmutableMap.b) obj2);
            }
        }, new Function() { // from class: akw
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableMap.b) obj).j();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> a(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: akz
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }), new Function() { // from class: aky
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMap.copyOf((Map) obj);
            }
        });
    }

    public static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> e(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new Supplier() { // from class: ald
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableBiMap.c();
            }
        }, new BiConsumer() { // from class: ajy
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableBiMap.c) obj).c(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: aki
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableBiMap.c) obj).d((ImmutableBiMap.c) obj2);
            }
        }, new Function() { // from class: akq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableBiMap.c) obj).j();
            }
        }, new Collector.Characteristics[0]);
    }
}
