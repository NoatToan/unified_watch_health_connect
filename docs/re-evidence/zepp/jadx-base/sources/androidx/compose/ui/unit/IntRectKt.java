package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "offset", "Landroidx/compose/ui/unit/IntSize;", "size", "Landroidx/compose/ui/unit/IntRect;", "IntRect-VbeCjmY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "IntRect", "topLeft", "bottomRight", "IntRect-E1MhUcY", b.m0, "", "radius", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "start", Command.STOP, "", "fraction", "lerp", "ui-unit_release"}, k = 2, mv = {1, 5, 1})
public final class IntRectKt {
    @Stable
    @NotNull
    /* JADX INFO: renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m3074IntRectE1MhUcY(long j, long j2) {
        return new IntRect(IntOffset.m3043getXimpl(j), IntOffset.m3044getYimpl(j), IntOffset.m3043getXimpl(j2), IntOffset.m3044getYimpl(j2));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m3075IntRectVbeCjmY(long j, long j2) {
        return new IntRect(IntOffset.m3043getXimpl(j), IntOffset.m3044getYimpl(j), IntOffset.m3043getXimpl(j) + IntSize.m3085getWidthimpl(j2), IntOffset.m3044getYimpl(j) + IntSize.m3084getHeightimpl(j2));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m3076IntRectar5cAso(long j, int i) {
        return new IntRect(IntOffset.m3043getXimpl(j) - i, IntOffset.m3044getYimpl(j) - i, IntOffset.m3043getXimpl(j) + i, IntOffset.m3044getYimpl(j) + i);
    }

    @Stable
    @NotNull
    public static final IntRect lerp(@NotNull IntRect intRect, @NotNull IntRect intRect2, float f) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f));
    }
}
