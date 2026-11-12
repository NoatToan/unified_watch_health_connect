package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"#\u0010\u0016\u001a\u00020\u0011*\u00020\u00038F@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"#\u0010\u0019\u001a\u00020\u0011*\u00020\u00038F@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013\"#\u0010\u001c\u001a\u00020\u0011*\u00020\u00038F@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0013\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"", "x", "y", "Landroidx/compose/ui/geometry/Offset;", "Offset", "(FF)J", "start", Command.STOP, "fraction", "lerp-Wko1d7g", "(JJF)J", "lerp", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "takeOrElse-3MmeM6k", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "", "isFinite-k-4lQ0M", "(J)Z", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite", "isSpecified-k-4lQ0M", "isSpecified-k-4lQ0M$annotations", "isSpecified", "isUnspecified-k-4lQ0M", "isUnspecified-k-4lQ0M$annotations", "isUnspecified", "ui-geometry_release"}, k = 2, mv = {1, 5, 1})
public final class OffsetKt {
    @Stable
    public static final long Offset(float f, float f2) {
        return Offset.m975constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m1000isFinitek4lQ0M(long j) {
        float fM983getXimpl = Offset.m983getXimpl(j);
        if ((Float.isInfinite(fM983getXimpl) || Float.isNaN(fM983getXimpl)) ? false : true) {
            float fM984getYimpl = Offset.m984getYimpl(j);
            if ((Float.isInfinite(fM984getYimpl) || Float.isNaN(fM984getYimpl)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* JADX INFO: renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m1001isFinitek4lQ0M$annotations(long j) {
    }

    /* JADX INFO: renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m1002isSpecifiedk4lQ0M(long j) {
        return j != Offset.INSTANCE.m998getUnspecifiedF1C5BW0();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m1003isSpecifiedk4lQ0M$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m1004isUnspecifiedk4lQ0M(long j) {
        return j == Offset.INSTANCE.m998getUnspecifiedF1C5BW0();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m1005isUnspecifiedk4lQ0M$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m1006lerpWko1d7g(long j, long j2, float f) {
        return Offset(MathHelpersKt.lerp(Offset.m983getXimpl(j), Offset.m983getXimpl(j2), f), MathHelpersKt.lerp(Offset.m984getYimpl(j), Offset.m984getYimpl(j2), f));
    }

    /* JADX INFO: renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m1007takeOrElse3MmeM6k(long j, @NotNull Function0<Offset> function0) {
        return m1002isSpecifiedk4lQ0M(j) ? j : function0.invoke().getPackedValue();
    }
}
