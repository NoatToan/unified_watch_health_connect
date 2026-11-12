package kotlin.collections;

import java.util.List;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
    @NotNull
    public static final <T> List<T> asReversed(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new ReversedListReadOnly(list);
    }

    @JvmName(name = "asReversedMutable")
    @NotNull
    public static <T> List<T> asReversedMutable(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new ReversedList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i) {
        if (i >= 0 && i <= CollectionsKt__CollectionsKt.getLastIndex(list)) {
            return CollectionsKt__CollectionsKt.getLastIndex(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseIteratorIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i) {
        return CollectionsKt__CollectionsKt.getLastIndex(list) - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new IntRange(0, list.size()) + "].");
    }
}
