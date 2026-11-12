package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.SubcomposeMeasureScope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J)\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListOnPostMeasureListener;", "", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "result", "", "onPostMeasure-VKLhPVY", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;JLandroidx/compose/foundation/lazy/LazyListMeasureResult;)V", "onPostMeasure", "foundation_release"}, k = 1, mv = {1, 5, 1})
public interface LazyListOnPostMeasureListener {
    /* JADX INFO: renamed from: onPostMeasure-VKLhPVY, reason: not valid java name */
    void mo357onPostMeasureVKLhPVY(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j, @NotNull LazyListMeasureResult lazyListMeasureResult);
}
