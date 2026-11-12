package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.MessengerShareContentUtility;
import kotlin.Metadata;
import kotlin.ranges.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\u001a:\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u00020\f*\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\n\u001a!\u0010\u0012\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0011\u001a!\u0010\u0019\u001a\u00020\u0016*\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001e\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"", "minWidth", "maxWidth", "minHeight", "maxHeight", "Landroidx/compose/ui/unit/Constraints;", androidx.constraintlayout.widget.Constraints.TAG, "(IIII)J", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "constrain", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "constrainWidth-K40F9xA", "(JI)I", "constrainWidth", "height", "constrainHeight-K40F9xA", "constrainHeight", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "isSatisfiedBy", MessengerShareContentUtility.IMAGE_RATIO_HORIZONTAL, "vertical", "offset-NN6Ew-U", "(JII)J", "offset", "max", "value", "addMaxWithMinimum", "ui-unit_release"}, k = 2, mv = {1, 5, 1})
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (!(i4 >= i3)) {
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        if (i >= 0 && i3 >= 0) {
            return Constraints.INSTANCE.m2942createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : e.coerceAtLeast(i + i2, 0);
    }

    @Stable
    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m2946constrain4WqzIAM(long j, long j2) {
        return IntSizeKt.IntSize(e.coerceIn(IntSize.m3085getWidthimpl(j2), Constraints.m2937getMinWidthimpl(j), Constraints.m2935getMaxWidthimpl(j)), e.coerceIn(IntSize.m3084getHeightimpl(j2), Constraints.m2936getMinHeightimpl(j), Constraints.m2934getMaxHeightimpl(j)));
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m2947constrainN9IONVI(long j, long j2) {
        return Constraints(e.coerceIn(Constraints.m2937getMinWidthimpl(j2), Constraints.m2937getMinWidthimpl(j), Constraints.m2935getMaxWidthimpl(j)), e.coerceIn(Constraints.m2935getMaxWidthimpl(j2), Constraints.m2937getMinWidthimpl(j), Constraints.m2935getMaxWidthimpl(j)), e.coerceIn(Constraints.m2936getMinHeightimpl(j2), Constraints.m2936getMinHeightimpl(j), Constraints.m2934getMaxHeightimpl(j)), e.coerceIn(Constraints.m2934getMaxHeightimpl(j2), Constraints.m2936getMinHeightimpl(j), Constraints.m2934getMaxHeightimpl(j)));
    }

    @Stable
    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m2948constrainHeightK40F9xA(long j, int i) {
        return e.coerceIn(i, Constraints.m2936getMinHeightimpl(j), Constraints.m2934getMaxHeightimpl(j));
    }

    @Stable
    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m2949constrainWidthK40F9xA(long j, int i) {
        return e.coerceIn(i, Constraints.m2937getMinWidthimpl(j), Constraints.m2935getMaxWidthimpl(j));
    }

    @Stable
    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m2950isSatisfiedBy4WqzIAM(long j, long j2) {
        int iM2937getMinWidthimpl = Constraints.m2937getMinWidthimpl(j);
        int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j);
        int iM3085getWidthimpl = IntSize.m3085getWidthimpl(j2);
        if (iM2937getMinWidthimpl <= iM3085getWidthimpl && iM3085getWidthimpl <= iM2935getMaxWidthimpl) {
            int iM2936getMinHeightimpl = Constraints.m2936getMinHeightimpl(j);
            int iM2934getMaxHeightimpl = Constraints.m2934getMaxHeightimpl(j);
            int iM3084getHeightimpl = IntSize.m3084getHeightimpl(j2);
            if (iM2936getMinHeightimpl <= iM3084getHeightimpl && iM3084getHeightimpl <= iM2934getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m2951offsetNN6EwU(long j, int i, int i2) {
        return Constraints(e.coerceAtLeast(Constraints.m2937getMinWidthimpl(j) + i, 0), addMaxWithMinimum(Constraints.m2935getMaxWidthimpl(j), i), e.coerceAtLeast(Constraints.m2936getMinHeightimpl(j) + i2, 0), addMaxWithMinimum(Constraints.m2934getMaxHeightimpl(j), i2));
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m2952offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m2951offsetNN6EwU(j, i, i2);
    }
}
