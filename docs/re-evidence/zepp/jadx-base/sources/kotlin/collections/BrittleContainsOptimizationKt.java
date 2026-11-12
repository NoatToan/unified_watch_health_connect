package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class BrittleContainsOptimizationKt {
    private static final <T> boolean a(Collection<? extends T> collection) {
        return CollectionSystemProperties.brittleContainsOptimizationEnabled && collection.size() > 2 && (collection instanceof ArrayList);
    }

    @NotNull
    public static final <T> Collection<T> convertToSetForSetOperation(@NotNull Iterable<? extends T> iterable) {
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return CollectionSystemProperties.brittleContainsOptimizationEnabled ? CollectionsKt___CollectionsKt.toHashSet(iterable) : CollectionsKt___CollectionsKt.toList(iterable);
        }
        Collection<T> collection = (Collection) iterable;
        return a(collection) ? CollectionsKt___CollectionsKt.toHashSet(iterable) : collection;
    }

    @NotNull
    public static final <T> Collection<T> convertToSetForSetOperationWith(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return CollectionSystemProperties.brittleContainsOptimizationEnabled ? CollectionsKt___CollectionsKt.toHashSet(iterable) : CollectionsKt___CollectionsKt.toList(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection<T> collection = (Collection) iterable;
        return a(collection) ? CollectionsKt___CollectionsKt.toHashSet(iterable) : collection;
    }

    @NotNull
    public static final <T> Collection<T> convertToSetForSetOperation(@NotNull Sequence<? extends T> sequence) {
        return CollectionSystemProperties.brittleContainsOptimizationEnabled ? SequencesKt___SequencesKt.toHashSet(sequence) : SequencesKt___SequencesKt.toList(sequence);
    }

    @NotNull
    public static final <T> Collection<T> convertToSetForSetOperation(@NotNull T[] tArr) {
        return CollectionSystemProperties.brittleContainsOptimizationEnabled ? ArraysKt___ArraysKt.toHashSet(tArr) : ArraysKt___ArraysJvmKt.asList(tArr);
    }
}
