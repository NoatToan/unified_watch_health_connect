package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001R\u001f\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001f\u0010\t\u001a\u00020\u00068&@&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u000b\u001a\u00020\u00068&@&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001f\u0010\r\u001a\u00020\u00068&@&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u001f\u0010\u000f\u001a\u00020\u00068&@&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-msEJaDk", "()J", "constraints", "Landroidx/compose/ui/unit/Dp;", "getMinWidth-D9Ej5fM", "()F", "minWidth", "getMaxWidth-D9Ej5fM", "maxWidth", "getMinHeight-D9Ej5fM", "minHeight", "getMaxHeight-D9Ej5fM", "maxHeight", "foundation-layout_release"}, k = 1, mv = {1, 5, 1})
public interface BoxWithConstraintsScope extends BoxScope {
    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
    long mo257getConstraintsmsEJaDk();

    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    float mo258getMaxHeightD9Ej5fM();

    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    float mo259getMaxWidthD9Ej5fM();

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    float mo260getMinHeightD9Ej5fM();

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    float mo261getMinWidthD9Ej5fM();
}
