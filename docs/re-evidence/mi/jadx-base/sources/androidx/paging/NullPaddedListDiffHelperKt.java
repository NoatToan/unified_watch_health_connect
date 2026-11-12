package androidx.paging;

import androidx.recyclerview.widget.h;
import defpackage.ghe;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a?\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "T", "Landroidx/paging/NullPaddedList;", "newList", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "Landroidx/paging/NullPaddedDiffResult;", "computeDiff", "(Landroidx/paging/NullPaddedList;Landroidx/paging/NullPaddedList;Landroidx/recyclerview/widget/h$f;)Landroidx/paging/NullPaddedDiffResult;", "Lghe;", "callback", "diffResult", "", "dispatchDiff", "(Landroidx/paging/NullPaddedList;Lghe;Landroidx/paging/NullPaddedList;Landroidx/paging/NullPaddedDiffResult;)V", "", "oldPosition", "transformAnchorIndex", "(Landroidx/paging/NullPaddedList;Landroidx/paging/NullPaddedDiffResult;Landroidx/paging/NullPaddedList;I)I", "paging-runtime_release"}, k = 2, mv = {1, 4, 2})
public final class NullPaddedListDiffHelperKt {
    @NotNull
    public static final <T> NullPaddedDiffResult computeDiff(@NotNull final NullPaddedList<T> computeDiff, @NotNull final NullPaddedList<T> newList, @NotNull final h.f<T> diffCallback) {
        Intrinsics.checkNotNullParameter(computeDiff, "$this$computeDiff");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        final int storageCount = computeDiff.getStorageCount();
        final int storageCount2 = newList.getStorageCount();
        h.b bVar = new h.b() { // from class: androidx.paging.NullPaddedListDiffHelperKt$computeDiff$diffResult$1
            @Override // androidx.recyclerview.widget.h.b
            public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                Object fromStorage = computeDiff.getFromStorage(oldItemPosition);
                Object fromStorage2 = newList.getFromStorage(newItemPosition);
                if (fromStorage == fromStorage2) {
                    return true;
                }
                return diffCallback.areContentsTheSame(fromStorage, fromStorage2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                Object fromStorage = computeDiff.getFromStorage(oldItemPosition);
                Object fromStorage2 = newList.getFromStorage(newItemPosition);
                if (fromStorage == fromStorage2) {
                    return true;
                }
                return diffCallback.areItemsTheSame(fromStorage, fromStorage2);
            }

            @Override // androidx.recyclerview.widget.h.b
            @Nullable
            public Object getChangePayload(int oldItemPosition, int newItemPosition) {
                Object fromStorage = computeDiff.getFromStorage(oldItemPosition);
                Object fromStorage2 = newList.getFromStorage(newItemPosition);
                return fromStorage == fromStorage2 ? Boolean.TRUE : diffCallback.getChangePayload(fromStorage, fromStorage2);
            }

            @Override // androidx.recyclerview.widget.h.b
            /* JADX INFO: renamed from: getNewListSize, reason: from getter */
            public int get$newSize() {
                return storageCount2;
            }

            @Override // androidx.recyclerview.widget.h.b
            /* JADX INFO: renamed from: getOldListSize, reason: from getter */
            public int get$oldSize() {
                return storageCount;
            }
        };
        boolean z = true;
        h.e eVarC = h.c(bVar, true);
        Intrinsics.checkNotNullExpressionValue(eVarC, "DiffUtil.calculateDiff(\n…    },\n        true\n    )");
        Iterable iterableUntil = RangesKt___RangesKt.until(0, computeDiff.getStorageCount());
        if ((iterableUntil instanceof Collection) && ((Collection) iterableUntil).isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = iterableUntil.iterator();
            while (it.hasNext()) {
                if (eVarC.b(((IntIterator) it).nextInt()) != -1) {
                }
            }
            z = false;
        }
        return new NullPaddedDiffResult(eVarC, z);
    }

    public static final <T> void dispatchDiff(@NotNull NullPaddedList<T> dispatchDiff, @NotNull ghe callback, @NotNull NullPaddedList<T> newList, @NotNull NullPaddedDiffResult diffResult) {
        Intrinsics.checkNotNullParameter(dispatchDiff, "$this$dispatchDiff");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        if (diffResult.getHasOverlap()) {
            OverlappingListsDiffDispatcher.INSTANCE.dispatchDiff(dispatchDiff, newList, callback, diffResult);
        } else {
            DistinctListsDiffDispatcher.INSTANCE.dispatchDiff(callback, dispatchDiff, newList);
        }
    }

    public static final int transformAnchorIndex(@NotNull NullPaddedList<?> transformAnchorIndex, @NotNull NullPaddedDiffResult diffResult, @NotNull NullPaddedList<?> newList, int i) {
        int iB;
        Intrinsics.checkNotNullParameter(transformAnchorIndex, "$this$transformAnchorIndex");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(newList, "newList");
        if (!diffResult.getHasOverlap()) {
            return RangesKt___RangesKt.coerceIn(i, (ClosedRange<Integer>) RangesKt___RangesKt.until(0, newList.getSize()));
        }
        int placeholdersBefore = i - transformAnchorIndex.getPlaceholdersBefore();
        int storageCount = transformAnchorIndex.getStorageCount();
        if (placeholdersBefore >= 0 && storageCount > placeholdersBefore) {
            for (int i2 = 0; i2 <= 29; i2++) {
                int i3 = ((i2 / 2) * (i2 % 2 == 1 ? -1 : 1)) + placeholdersBefore;
                if (i3 >= 0 && i3 < transformAnchorIndex.getStorageCount() && (iB = diffResult.getDiff().b(i3)) != -1) {
                    return iB + newList.getPlaceholdersBefore();
                }
            }
        }
        return RangesKt___RangesKt.coerceIn(i, (ClosedRange<Integer>) RangesKt___RangesKt.until(0, newList.getSize()));
    }
}
