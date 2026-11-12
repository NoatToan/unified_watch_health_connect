package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.builders.SetBuilder;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class x {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <E> Set<E> a(int i, Function1<? super Set<E>, Unit> function1) {
        Set setCreateSetBuilder = createSetBuilder(i);
        function1.invoke(setCreateSetBuilder);
        return build(setCreateSetBuilder);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <E> Set<E> b(Function1<? super Set<E>, Unit> function1) {
        Set setCreateSetBuilder = createSetBuilder();
        function1.invoke(setCreateSetBuilder);
        return build(setCreateSetBuilder);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static <E> Set<E> build(@NotNull Set<E> set) {
        return ((SetBuilder) set).build();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final <E> Set<E> createSetBuilder() {
        return new SetBuilder();
    }

    @NotNull
    public static <T> Set<T> setOf(T t) {
        return Collections.singleton(t);
    }

    @NotNull
    public static <T> TreeSet<T> sortedSetOf(@NotNull T... tArr) {
        return (TreeSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet());
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static <E> Set<E> createSetBuilder(int i) {
        return new SetBuilder(i);
    }

    @NotNull
    public static final <T> TreeSet<T> sortedSetOf(@NotNull Comparator<? super T> comparator, @NotNull T... tArr) {
        return (TreeSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet(comparator));
    }
}
