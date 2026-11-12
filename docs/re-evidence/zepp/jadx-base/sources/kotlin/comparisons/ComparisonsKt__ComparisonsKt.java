package kotlin.comparisons;

import java.util.Comparator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class ComparisonsKt__ComparisonsKt {

    public static final class a<T> implements Comparator {
        public final /* synthetic */ Function1<T, Comparable<?>>[] a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
            this.a = function1Arr;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.g(t, t2, this.a);
        }
    }

    public static final class b<T> implements Comparator {
        public final /* synthetic */ Comparator<? super T> a;

        public b(Comparator<? super T> comparator) {
            this.a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(@Nullable T t, @Nullable T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return -1;
            }
            if (t2 == null) {
                return 1;
            }
            return this.a.compare(t, t2);
        }
    }

    public static final class c<T> implements Comparator {
        public final /* synthetic */ Comparator<? super T> a;

        public c(Comparator<? super T> comparator) {
            this.a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(@Nullable T t, @Nullable T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return 1;
            }
            if (t2 == null) {
                return -1;
            }
            return this.a.compare(t, t2);
        }
    }

    /* JADX INFO: renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements Comparator {
        public final /* synthetic */ Function1<T, Comparable<?>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super T, ? extends Comparable<?>> function1) {
            this.a = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1<T, Comparable<?>> function1 = this.a;
            return ComparisonsKt__ComparisonsKt.compareValues(function1.invoke(t), function1.invoke(t2));
        }
    }

    public static final class d<T> implements Comparator {
        public final /* synthetic */ Comparator<T> a;
        public final /* synthetic */ Comparator<? super T> b;

        public d(Comparator<T> comparator, Comparator<? super T> comparator2) {
            this.a = comparator;
            this.b = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.a.compare(t, t2);
            return iCompare != 0 ? iCompare : this.b.compare(t, t2);
        }
    }

    public static final class e<T> implements Comparator {
        public final /* synthetic */ Comparator<T> a;
        public final /* synthetic */ Comparator<? super T> b;

        public e(Comparator<T> comparator, Comparator<? super T> comparator2) {
            this.a = comparator;
            this.b = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.a.compare(t, t2);
            return iCompare != 0 ? iCompare : this.b.compare(t2, t);
        }
    }

    @InlineOnly
    private static final <T, K> Comparator<T> a(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> function1) {
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareBy.3
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function2 = function1;
                return comparator2.compare((Object) function2.invoke(t), (Object) function2.invoke(t2));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> b(Function1<? super T, ? extends Comparable<?>> function1) {
        return new AnonymousClass2(function1);
    }

    @InlineOnly
    private static final <T, K> Comparator<T> c(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> function1) {
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function2 = function1;
                return comparator2.compare((Object) function2.invoke(t2), (Object) function2.invoke(t));
            }
        };
    }

    @NotNull
    public static <T> Comparator<T> compareBy(@NotNull Function1<? super T, ? extends Comparable<?>>... function1Arr) {
        if (function1Arr.length > 0) {
            return new a(function1Arr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static <T extends Comparable<?>> int compareValues(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static final <T> int compareValuesBy(T t, T t2, @NotNull Function1<? super T, ? extends Comparable<?>>... function1Arr) {
        if (function1Arr.length > 0) {
            return g(t, t2, function1Arr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @InlineOnly
    private static final <T> Comparator<T> d(Function1<? super T, ? extends Comparable<?>> function1) {
        return new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1);
    }

    @InlineOnly
    private static final <T, K> int e(T t, T t2, Comparator<? super K> comparator, Function1<? super T, ? extends K> function1) {
        return comparator.compare(function1.invoke(t), function1.invoke(t2));
    }

    @InlineOnly
    private static final <T> int f(T t, T t2, Function1<? super T, ? extends Comparable<?>> function1) {
        return compareValues(function1.invoke(t), function1.invoke(t2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int g(T t, T t2, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        int length = function1Arr.length;
        int i = 0;
        while (i < length) {
            Function1<? super T, ? extends Comparable<?>> function1 = function1Arr[i];
            i++;
            int iCompareValues = compareValues(function1.invoke(t), function1.invoke(t2));
            if (iCompareValues != 0) {
                return iCompareValues;
            }
        }
        return 0;
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> h() {
        return nullsFirst(naturalOrder());
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> i() {
        return nullsLast(naturalOrder());
    }

    @InlineOnly
    private static final <T, K> Comparator<T> j(final Comparator<T> comparator, final Comparator<? super K> comparator2, final Function1<? super T, ? extends K> function1) {
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                Comparator<? super K> comparator3 = comparator2;
                Function1<T, K> function2 = function1;
                return comparator3.compare((Object) function2.invoke(t), (Object) function2.invoke(t2));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> k(final Comparator<T> comparator, final Function1<? super T, ? extends Comparable<?>> function1) {
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                Function1<T, Comparable<?>> function2 = function1;
                return ComparisonsKt__ComparisonsKt.compareValues(function2.invoke(t), function2.invoke(t2));
            }
        };
    }

    @InlineOnly
    private static final <T, K> Comparator<T> l(final Comparator<T> comparator, final Comparator<? super K> comparator2, final Function1<? super T, ? extends K> function1) {
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                Comparator<? super K> comparator3 = comparator2;
                Function1<T, K> function2 = function1;
                return comparator3.compare((Object) function2.invoke(t2), (Object) function2.invoke(t));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> m(final Comparator<T> comparator, final Function1<? super T, ? extends Comparable<?>> function1) {
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                Function1<T, Comparable<?>> function2 = function1;
                return ComparisonsKt__ComparisonsKt.compareValues(function2.invoke(t2), function2.invoke(t));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> n(final Comparator<T> comparator, final Function2<? super T, ? super T, Integer> function2) {
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenComparator$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : function2.invoke(t, t2).intValue();
            }
        };
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        return kotlin.comparisons.c.a;
    }

    @NotNull
    public static final <T> Comparator<T> nullsFirst(@NotNull Comparator<? super T> comparator) {
        return new b(comparator);
    }

    @NotNull
    public static final <T> Comparator<T> nullsLast(@NotNull Comparator<? super T> comparator) {
        return new c(comparator);
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        return kotlin.comparisons.d.a;
    }

    @NotNull
    public static final <T> Comparator<T> reversed(@NotNull Comparator<T> comparator) {
        if (comparator instanceof kotlin.comparisons.e) {
            return ((kotlin.comparisons.e) comparator).a();
        }
        Comparator<T> eVar = kotlin.comparisons.c.a;
        if (Intrinsics.areEqual(comparator, eVar)) {
            return kotlin.comparisons.d.a;
        }
        if (!Intrinsics.areEqual(comparator, kotlin.comparisons.d.a)) {
            eVar = new kotlin.comparisons.e<>(comparator);
        }
        return eVar;
    }

    @NotNull
    public static final <T> Comparator<T> then(@NotNull Comparator<T> comparator, @NotNull Comparator<? super T> comparator2) {
        return new d(comparator, comparator2);
    }

    @NotNull
    public static final <T> Comparator<T> thenDescending(@NotNull Comparator<T> comparator, @NotNull Comparator<? super T> comparator2) {
        return new e(comparator, comparator2);
    }
}
