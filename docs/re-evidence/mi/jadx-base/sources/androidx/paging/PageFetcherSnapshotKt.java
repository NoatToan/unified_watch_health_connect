package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"shouldPrioritizeOver", "", "Landroidx/paging/GenerationalViewportHint;", "previous", "loadType", "Landroidx/paging/LoadType;", "paging-common"}, k = 2, mv = {1, 4, 2})
public final class PageFetcherSnapshotKt {
    public static final boolean shouldPrioritizeOver(@NotNull GenerationalViewportHint shouldPrioritizeOver, @NotNull GenerationalViewportHint previous, @NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(shouldPrioritizeOver, "$this$shouldPrioritizeOver");
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        if (shouldPrioritizeOver.getGenerationId() > previous.getGenerationId()) {
            return true;
        }
        if ((previous.getHint() instanceof ViewportHint.Initial) && (shouldPrioritizeOver.getHint() instanceof ViewportHint.Access)) {
            return true;
        }
        if (!(shouldPrioritizeOver.getHint() instanceof ViewportHint.Initial) || !(previous.getHint() instanceof ViewportHint.Access)) {
            if (shouldPrioritizeOver.getHint().getOriginalPageOffsetFirst() != previous.getHint().getOriginalPageOffsetFirst() || shouldPrioritizeOver.getHint().getOriginalPageOffsetLast() != previous.getHint().getOriginalPageOffsetLast()) {
                return true;
            }
            if ((loadType != LoadType.PREPEND || previous.getHint().getPresentedItemsBefore() >= shouldPrioritizeOver.getHint().getPresentedItemsBefore()) && (loadType != LoadType.APPEND || previous.getHint().getPresentedItemsAfter() >= shouldPrioritizeOver.getHint().getPresentedItemsAfter())) {
                return true;
            }
        }
        return false;
    }
}
