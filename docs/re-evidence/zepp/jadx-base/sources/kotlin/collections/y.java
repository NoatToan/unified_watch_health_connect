package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.BuilderInference;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class y extends x {
    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <E> Set<E> c(int i, @BuilderInference Function1<? super Set<E>, Unit> function1) {
        Set setCreateSetBuilder = x.createSetBuilder(i);
        function1.invoke(setCreateSetBuilder);
        return x.build(setCreateSetBuilder);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <E> Set<E> d(@BuilderInference Function1<? super Set<E>, Unit> function1) {
        Set setCreateSetBuilder = x.createSetBuilder();
        function1.invoke(setCreateSetBuilder);
        return x.build(setCreateSetBuilder);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> HashSet<T> e() {
        return new HashSet<>();
    }

    @NotNull
    public static <T> Set<T> emptySet() {
        return EmptySet.INSTANCE;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> LinkedHashSet<T> f() {
        return new LinkedHashSet<>();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> Set<T> g() {
        return new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Set<T> h(Set<? extends T> set) {
        return set == 0 ? emptySet() : set;
    }

    @NotNull
    public static <T> HashSet<T> hashSetOf(@NotNull T... tArr) {
        return (HashSet) ArraysKt___ArraysKt.toCollection(tArr, new HashSet(q.mapCapacity(tArr.length)));
    }

    @InlineOnly
    private static final <T> Set<T> i() {
        return emptySet();
    }

    @NotNull
    public static <T> LinkedHashSet<T> linkedSetOf(@NotNull T... tArr) {
        return (LinkedHashSet) ArraysKt___ArraysKt.toCollection(tArr, new LinkedHashSet(q.mapCapacity(tArr.length)));
    }

    @NotNull
    public static <T> Set<T> mutableSetOf(@NotNull T... tArr) {
        return (Set) ArraysKt___ArraysKt.toCollection(tArr, new LinkedHashSet(q.mapCapacity(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> Set<T> optimizeReadOnlySet(@NotNull Set<? extends T> set) {
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : x.setOf(set.iterator().next());
        }
        return emptySet();
    }

    @NotNull
    public static <T> Set<T> setOf(@NotNull T... tArr) {
        return tArr.length > 0 ? ArraysKt___ArraysKt.toSet(tArr) : emptySet();
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Set<T> setOfNotNull(@Nullable T t) {
        return t != null ? x.setOf(t) : emptySet();
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Set<T> setOfNotNull(@NotNull T... tArr) {
        return (Set) ArraysKt___ArraysKt.filterNotNullTo(tArr, new LinkedHashSet());
    }
}
