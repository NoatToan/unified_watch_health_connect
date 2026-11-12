package kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.builders.ListBuilder;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class e {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <E> List<E> a(int i, Function1<? super List<E>, Unit> function1) {
        List listCreateListBuilder = createListBuilder(i);
        function1.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <E> List<E> b(Function1<? super List<E>, Unit> function1) {
        List listCreateListBuilder = createListBuilder();
        function1.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    public static final boolean brittleContainsOptimizationEnabled() {
        return CollectionSystemProperties.brittleContainsOptimizationEnabled;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static <E> List<E> build(@NotNull List<E> list) {
        return ((ListBuilder) list).build();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final int c(int i) {
        if (i < 0) {
            if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                throw new ArithmeticException("Count overflow has happened.");
            }
            CollectionsKt__CollectionsKt.throwCountOverflow();
        }
        return i;
    }

    @NotNull
    public static final <T> Object[] copyToArrayOfAny(@NotNull T[] tArr, boolean z) {
        return (z && Intrinsics.areEqual(tArr.getClass(), Object[].class)) ? tArr : Arrays.copyOf(tArr, tArr.length, Object[].class);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static <E> List<E> createListBuilder() {
        return new ListBuilder();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final int d(int i) {
        if (i < 0) {
            if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            CollectionsKt__CollectionsKt.throwIndexOverflow();
        }
        return i;
    }

    @InlineOnly
    private static final Object[] e(Collection<?> collection) {
        return CollectionToArray.toArray(collection);
    }

    @InlineOnly
    private static final <T> T[] f(Collection<?> collection, T[] tArr) {
        return (T[]) CollectionToArray.toArray(collection, tArr);
    }

    @InlineOnly
    private static final <T> List<T> g(Enumeration<T> enumeration) {
        return Collections.list(enumeration);
    }

    @NotNull
    public static <T> List<T> listOf(T t) {
        return Collections.singletonList(t);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable) {
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static <E> List<E> createListBuilder(int i) {
        return new ListBuilder(i);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList, random);
        return mutableList;
    }
}
