package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExperimentalStdlibApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class h extends g {
    private static final <T> boolean C(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1, boolean z) {
        Iterator<? extends T> it2 = iterable.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue() == z) {
                it2.remove();
                z2 = true;
            }
        }
        return z2;
    }

    private static final <T> boolean D(List<T> list, Function1<? super T, Boolean> function1, boolean z) {
        int i;
        if (!(list instanceof RandomAccess)) {
            return C(list, function1, z);
        }
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                int i3 = i2 + 1;
                T t = list.get(i2);
                if (function1.invoke(t).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(list);
        if (i > lastIndex2) {
            return true;
        }
        while (true) {
            int i4 = lastIndex2 - 1;
            list.remove(lastIndex2);
            if (lastIndex2 == i) {
                return true;
            }
            lastIndex2 = i4;
        }
    }

    @InlineOnly
    private static final <T> void E(Collection<? super T> collection, Iterable<? extends T> iterable) {
        removeAll(collection, iterable);
    }

    @InlineOnly
    private static final <T> void F(Collection<? super T> collection, T t) {
        collection.remove(t);
    }

    @InlineOnly
    private static final <T> void G(Collection<? super T> collection, Sequence<? extends T> sequence) {
        removeAll(collection, sequence);
    }

    @InlineOnly
    private static final <T> void H(Collection<? super T> collection, T[] tArr) {
        removeAll(collection, tArr);
    }

    @InlineOnly
    private static final <T> void I(Collection<? super T> collection, Iterable<? extends T> iterable) {
        addAll(collection, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> void J(Collection<? super T> collection, T t) {
        collection.add(t);
    }

    @InlineOnly
    private static final <T> void K(Collection<? super T> collection, Sequence<? extends T> sequence) {
        addAll(collection, sequence);
    }

    @InlineOnly
    private static final <T> void L(Collection<? super T> collection, T[] tArr) {
        addAll(collection, tArr);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @ReplaceWith(expression = "removeAt(index)", imports = {}))
    @InlineOnly
    private static final <T> T M(List<T> list, int i) {
        return list.remove(i);
    }

    @InlineOnly
    private static final <T> boolean N(Collection<? extends T> collection, T t) {
        return collection.remove(t);
    }

    @InlineOnly
    private static final <T> boolean O(Collection<? extends T> collection, Collection<? extends T> collection2) {
        return collection.removeAll(collection2);
    }

    @InlineOnly
    private static final <T> boolean P(Collection<? extends T> collection, Collection<? extends T> collection2) {
        return collection.retainAll(collection2);
    }

    private static final boolean Q(Collection<?> collection) {
        boolean z = !collection.isEmpty();
        collection.clear();
        return z;
    }

    public static <T> boolean addAll(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            if (collection.add(it2.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean removeAll(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        return collection.removeAll(BrittleContainsOptimizationKt.convertToSetForSetOperationWith(iterable, collection));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T removeFirst(@NotNull List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static <T> T removeFirstOrNull(@NotNull List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static <T> T removeLast(@NotNull List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <T> T removeLastOrNull(@NotNull List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    public static <T> boolean retainAll(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        return collection.retainAll(BrittleContainsOptimizationKt.convertToSetForSetOperationWith(iterable, collection));
    }

    public static <T> boolean removeAll(@NotNull Collection<? super T> collection, @NotNull Sequence<? extends T> sequence) {
        Collection<?> collectionConvertToSetForSetOperation = BrittleContainsOptimizationKt.convertToSetForSetOperation(sequence);
        return (collectionConvertToSetForSetOperation.isEmpty() ^ true) && collection.removeAll(collectionConvertToSetForSetOperation);
    }

    public static final <T> boolean retainAll(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        return (tArr.length == 0) ^ true ? collection.retainAll(BrittleContainsOptimizationKt.convertToSetForSetOperation(tArr)) : Q(collection);
    }

    public static <T> boolean addAll(@NotNull Collection<? super T> collection, @NotNull Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (collection.add(it2.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean removeAll(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        return ((tArr.length == 0) ^ true) && collection.removeAll(BrittleContainsOptimizationKt.convertToSetForSetOperation(tArr));
    }

    public static <T> boolean removeAll(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        return C(iterable, function1, true);
    }

    public static final <T> boolean retainAll(@NotNull Collection<? super T> collection, @NotNull Sequence<? extends T> sequence) {
        Collection<?> collectionConvertToSetForSetOperation = BrittleContainsOptimizationKt.convertToSetForSetOperation(sequence);
        if (!collectionConvertToSetForSetOperation.isEmpty()) {
            return collection.retainAll(collectionConvertToSetForSetOperation);
        }
        return Q(collection);
    }

    public static <T> boolean addAll(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        return collection.addAll(ArraysKt___ArraysJvmKt.asList(tArr));
    }

    public static <T> boolean removeAll(@NotNull List<T> list, @NotNull Function1<? super T, Boolean> function1) {
        return D(list, function1, true);
    }

    public static <T> boolean retainAll(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        return C(iterable, function1, false);
    }

    public static final <T> boolean retainAll(@NotNull List<T> list, @NotNull Function1<? super T, Boolean> function1) {
        return D(list, function1, false);
    }
}
