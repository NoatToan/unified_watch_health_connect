package kotlin.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T elementAtOrNull(@NotNull Iterable<? extends T> iterable, int i) {
        return (T) CollectionsKt___CollectionsKt.elementAtOrNull(iterable, i);
    }

    public static /* bridge */ /* synthetic */ <T> T first(@NotNull Iterable<? extends T> iterable) {
        return (T) CollectionsKt___CollectionsKt.first(iterable);
    }

    public static /* bridge */ /* synthetic */ <T> T first(@NotNull List<? extends T> list) {
        return (T) CollectionsKt___CollectionsKt.first((List) list);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T firstOrNull(@NotNull Iterable<? extends T> iterable) {
        return (T) CollectionsKt___CollectionsKt.firstOrNull(iterable);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T firstOrNull(@NotNull List<? extends T> list) {
        return (T) CollectionsKt___CollectionsKt.firstOrNull((List) list);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T getOrNull(@NotNull List<? extends T> list, int i) {
        return (T) CollectionsKt___CollectionsKt.getOrNull(list, i);
    }

    public static /* bridge */ /* synthetic */ <T> T last(@NotNull Iterable<? extends T> iterable) {
        return (T) CollectionsKt___CollectionsKt.last(iterable);
    }

    public static /* bridge */ /* synthetic */ <T> T last(@NotNull List<? extends T> list) {
        return (T) CollectionsKt___CollectionsKt.last((List) list);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T lastOrNull(@NotNull Iterable<? extends T> iterable) {
        return (T) CollectionsKt___CollectionsKt.lastOrNull(iterable);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T lastOrNull(@NotNull List<? extends T> list) {
        return (T) CollectionsKt___CollectionsKt.lastOrNull((List) list);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static /* bridge */ /* synthetic */ <T extends Comparable<? super T>> T maxOrNull(@NotNull Iterable<? extends T> iterable) {
        return (T) CollectionsKt___CollectionsKt.maxOrNull(iterable);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static /* bridge */ /* synthetic */ <T> T maxWithOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        return (T) CollectionsKt___CollectionsKt.maxWithOrNull(iterable, comparator);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static /* bridge */ /* synthetic */ <T extends Comparable<? super T>> T minOrNull(@NotNull Iterable<? extends T> iterable) {
        return (T) CollectionsKt___CollectionsKt.minOrNull(iterable);
    }

    @SinceKotlin(version = "1.3")
    public static /* bridge */ /* synthetic */ <T> T random(@NotNull Collection<? extends T> collection, @NotNull Random random) {
        return (T) CollectionsKt___CollectionsKt.random(collection, random);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static /* bridge */ /* synthetic */ <T> T removeFirstOrNull(@NotNull List<T> list) {
        return (T) h.removeFirstOrNull(list);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static /* bridge */ /* synthetic */ <T> T removeLast(@NotNull List<T> list) {
        return (T) h.removeLast(list);
    }

    public static /* bridge */ /* synthetic */ <T> T single(@NotNull Iterable<? extends T> iterable) {
        return (T) CollectionsKt___CollectionsKt.single(iterable);
    }

    public static /* bridge */ /* synthetic */ <T> T single(@NotNull List<? extends T> list) {
        return (T) CollectionsKt___CollectionsKt.single((List) list);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T singleOrNull(@NotNull Iterable<? extends T> iterable) {
        return (T) CollectionsKt___CollectionsKt.singleOrNull(iterable);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T singleOrNull(@NotNull List<? extends T> list) {
        return (T) CollectionsKt___CollectionsKt.singleOrNull((List) list);
    }
}
