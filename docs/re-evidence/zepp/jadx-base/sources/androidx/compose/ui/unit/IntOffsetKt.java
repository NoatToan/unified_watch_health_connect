package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.huami.watch.companion.mediac.Command;
import com.ingenic.iwds.HardwareList;
import kotlin.Metadata;
import kotlin.math.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\u0010\u001a\u00020\r*\u00020\u0003H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0014\u001a\u00020\r*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\"\u0010\u0016\u001a\u00020\r*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0013\u001a\"\u0010\u0014\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0013\u001a\"\u0010\u0016\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0013\u001a\u001a\u0010\u001a\u001a\u00020\u0003*\u00020\rH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"", "x", "y", "Landroidx/compose/ui/unit/IntOffset;", "IntOffset", "(II)J", "start", Command.STOP, "", "fraction", "lerp-81ZRxRo", "(JJF)J", "lerp", "Landroidx/compose/ui/geometry/Offset;", "toOffset--gyyYBs", "(J)J", "toOffset", "offset", "plus-Nv-tHpc", "(JJ)J", "plus", "minus-Nv-tHpc", "minus", "plus-oCl6YwE", "minus-oCl6YwE", "round-k-4lQ0M", HardwareList.VALUE_LCD_EXTERIOR_ROUND, "ui-unit_release"}, k = 2, mv = {1, 5, 1})
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m3037constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m3054lerp81ZRxRo(long j, long j2, float f) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m3043getXimpl(j), IntOffset.m3043getXimpl(j2), f), MathHelpersKt.lerp(IntOffset.m3044getYimpl(j), IntOffset.m3044getYimpl(j2), f));
    }

    @Stable
    /* JADX INFO: renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m3055minusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m983getXimpl(j) - IntOffset.m3043getXimpl(j2), Offset.m984getYimpl(j) - IntOffset.m3044getYimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m3056minusoCl6YwE(long j, long j2) {
        return OffsetKt.Offset(IntOffset.m3043getXimpl(j) - Offset.m983getXimpl(j2), IntOffset.m3044getYimpl(j) - Offset.m984getYimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m3057plusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m983getXimpl(j) + IntOffset.m3043getXimpl(j2), Offset.m984getYimpl(j) + IntOffset.m3044getYimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m3058plusoCl6YwE(long j, long j2) {
        return OffsetKt.Offset(IntOffset.m3043getXimpl(j) + Offset.m983getXimpl(j2), IntOffset.m3044getYimpl(j) + Offset.m984getYimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m3059roundk4lQ0M(long j) {
        return IntOffset(c.roundToInt(Offset.m983getXimpl(j)), c.roundToInt(Offset.m984getYimpl(j)));
    }

    @Stable
    /* JADX INFO: renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m3060toOffsetgyyYBs(long j) {
        return OffsetKt.Offset(IntOffset.m3043getXimpl(j), IntOffset.m3044getYimpl(j));
    }
}
