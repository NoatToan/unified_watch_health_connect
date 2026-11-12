package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class z extends y {
    @InlineOnly
    private static final <T> Set<T> j(Set<? extends T> set, T t) {
        return minus(set, t);
    }

    @InlineOnly
    private static final <T> Set<T> k(Set<? extends T> set, T t) {
        return plus(set, t);
    }

    @NotNull
    public static final <T> Set<T> minus(@NotNull Set<? extends T> set, T t) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(q.mapCapacity(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && Intrinsics.areEqual(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static <T> Set<T> plus(@NotNull Set<? extends T> set, T t) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(q.mapCapacity(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> minus(@NotNull Set<? extends T> set, @NotNull T[] tArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        h.removeAll(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> plus(@NotNull Set<? extends T> set, @NotNull T[] tArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(q.mapCapacity(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        h.addAll(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @NotNull
    public static <T> Set<T> minus(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        Collection<?> collectionConvertToSetForSetOperationWith = BrittleContainsOptimizationKt.convertToSetForSetOperationWith(iterable, set);
        if (collectionConvertToSetForSetOperationWith.isEmpty()) {
            return CollectionsKt___CollectionsKt.toSet(set);
        }
        if (collectionConvertToSetForSetOperationWith instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!collectionConvertToSetForSetOperationWith.contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(collectionConvertToSetForSetOperationWith);
        return linkedHashSet2;
    }

    @NotNull
    public static <T> Set<T> plus(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        Integer numCollectionSizeOrNull = CollectionsKt__IterablesKt.collectionSizeOrNull(iterable);
        LinkedHashSet linkedHashSet = new LinkedHashSet(q.mapCapacity(numCollectionSizeOrNull == null ? set.size() * 2 : numCollectionSizeOrNull.intValue() + set.size()));
        linkedHashSet.addAll(set);
        h.addAll(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> plus(@NotNull Set<? extends T> set, @NotNull Sequence<? extends T> sequence) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(q.mapCapacity(set.size() * 2));
        linkedHashSet.addAll(set);
        h.addAll(linkedHashSet, sequence);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> minus(@NotNull Set<? extends T> set, @NotNull Sequence<? extends T> sequence) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        h.removeAll(linkedHashSet, sequence);
        return linkedHashSet;
    }
}
