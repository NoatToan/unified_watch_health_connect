package defpackage;

import com.google.android.gms.fitness.data.WorkoutExercises;
import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class anr {
    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> e(final Function<? super T, ? extends R> function, final Function<? super T, ? extends C> function2, final Function<? super T, ? extends V> function3) {
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        return Collector.of(new Supplier() { // from class: anu
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableTable.a();
            }
        }, new BiConsumer() { // from class: anw
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableTable.a) obj).d(function.apply(obj2), function2.apply(obj2), function3.apply(obj2));
            }
        }, new BinaryOperator() { // from class: ans
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableTable.a) obj).e((ImmutableTable.a) obj2);
            }
        }, new Function() { // from class: anq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableTable.a) obj).e();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> e(final Function<? super T, ? extends R> function, final Function<? super T, ? extends C> function2, final Function<? super T, ? extends V> function3, final BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        Preconditions.checkNotNull(binaryOperator, "mergeFunction");
        return Collector.of(new Supplier() { // from class: anp
            @Override // java.util.function.Supplier
            public final Object get() {
                return anr.b();
            }
        }, new BiConsumer() { // from class: anv
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                anr.d dVar = (anr.d) obj;
                dVar.c(function.apply(obj2), function2.apply(obj2), function3.apply(obj2), binaryOperator);
            }
        }, new BinaryOperator() { // from class: any
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((anr.d) obj).d((anr.d) obj2, binaryOperator);
            }
        }, new Function() { // from class: anx
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((anr.d) obj).e();
            }
        }, new Collector.Characteristics[0]);
    }

    static /* synthetic */ d b() {
        return new d();
    }

    static final class d<R, C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<c<R, C, V>> f607a;
        final Table<R, C, c<R, C, V>> d;

        private d() {
            this.f607a = new ArrayList();
            this.d = alv.c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(R r, C c2, V v, BinaryOperator<V> binaryOperator) {
            c<R, C, V> cVar = this.d.get(r, c2);
            if (cVar == null) {
                c<R, C, V> cVar2 = new c<>(r, c2, v);
                this.f607a.add(cVar2);
                this.d.put(r, c2, cVar2);
                return;
            }
            cVar.a(v, binaryOperator);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d<R, C, V> d(d<R, C, V> dVar, BinaryOperator<V> binaryOperator) {
            for (c<R, C, V> cVar : dVar.f607a) {
                c(cVar.getRowKey(), cVar.getColumnKey(), cVar.getValue(), binaryOperator);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ImmutableTable<R, C, V> e() {
            return ImmutableTable.copyOf(this.f607a);
        }
    }

    static final class c<R, C, V> extends Tables.AbstractCell<R, C, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final R f605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private V f606c;
        private final C e;

        c(R r, C c2, V v) {
            this.f605b = (R) Preconditions.checkNotNull(r, WorkoutExercises.ROW);
            this.e = (C) Preconditions.checkNotNull(c2, "column");
            this.f606c = (V) Preconditions.checkNotNull(v, "value");
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
            return this.f605b;
        }

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
            return this.e;
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
            return this.f606c;
        }

        void a(V v, BinaryOperator<V> binaryOperator) {
            Preconditions.checkNotNull(v, "value");
            this.f606c = (V) Preconditions.checkNotNull(binaryOperator.apply(this.f606c, v), "mergeFunction.apply");
        }
    }
}
