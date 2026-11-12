package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\"\u001f\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001f\u0010\n\u001a\u00020\u00058\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "position", "getAdjustedCoordinates-k-4lQ0M", "(J)J", "getAdjustedCoordinates", "Landroidx/compose/ui/unit/Dp;", "HANDLE_WIDTH", "F", "getHANDLE_WIDTH", "()F", "HANDLE_HEIGHT", "getHANDLE_HEIGHT", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class SelectionHandlesKt {
    private static final float HANDLE_HEIGHT;
    private static final float HANDLE_WIDTH;

    static {
        float f = 25;
        HANDLE_WIDTH = Dp.m2965constructorimpl(f);
        HANDLE_HEIGHT = Dp.m2965constructorimpl(f);
    }

    /* JADX INFO: renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m514getAdjustedCoordinatesk4lQ0M(long j) {
        return OffsetKt.Offset(Offset.m983getXimpl(j), Offset.m984getYimpl(j) - 1.0f);
    }

    public static final float getHANDLE_HEIGHT() {
        return HANDLE_HEIGHT;
    }

    public static final float getHANDLE_WIDTH() {
        return HANDLE_WIDTH;
    }
}
