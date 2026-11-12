package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0015\u001a\u00020\u0003*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0015\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0003H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0017\u001a\u0019\u0010\u001b\u001a\u00020\u0018*\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\"\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u001c\"$\u0010\"\u001a\u00020\u001d*\u00020\u00038Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\"$\u0010%\u001a\u00020\u001d*\u00020\u00038Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001f\"#\u0010*\u001a\u00020&*\u00020\u00038F@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b)\u0010!\u001a\u0004\b'\u0010(\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "Landroidx/compose/ui/geometry/Size;", "Size", "(FF)J", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "takeOrElse-TmRCtEA", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "start", Command.STOP, "fraction", "lerp-VgWVRYQ", "(JJF)J", "lerp", "", "size", "times-d16Qtg0", "(IJ)J", "times", "", "(DJ)J", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "toRect", "(FJ)J", "", "isSpecified-uvyYCjk", "(J)Z", "isSpecified-uvyYCjk$annotations", "(J)V", "isSpecified", "isUnspecified-uvyYCjk", "isUnspecified-uvyYCjk$annotations", "isUnspecified", "Landroidx/compose/ui/geometry/Offset;", "getCenter-uvyYCjk", "(J)J", "getCenter-uvyYCjk$annotations", b.m0, "ui-geometry_release"}, k = 2, mv = {1, 5, 1})
public final class SizeKt {
    @Stable
    public static final long Size(float f, float f2) {
        return Size.m1043constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m1062getCenteruvyYCjk(long j) {
        return OffsetKt.Offset(Size.m1052getWidthimpl(j) / 2.0f, Size.m1049getHeightimpl(j) / 2.0f);
    }

    @Stable
    /* JADX INFO: renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1063getCenteruvyYCjk$annotations(long j) {
    }

    /* JADX INFO: renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m1064isSpecifieduvyYCjk(long j) {
        return j != Size.INSTANCE.m1060getUnspecifiedNHjbRc();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1065isSpecifieduvyYCjk$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m1066isUnspecifieduvyYCjk(long j) {
        return j == Size.INSTANCE.m1060getUnspecifiedNHjbRc();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1067isUnspecifieduvyYCjk$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m1068lerpVgWVRYQ(long j, long j2, float f) {
        return Size(MathHelpersKt.lerp(Size.m1052getWidthimpl(j), Size.m1052getWidthimpl(j2), f), MathHelpersKt.lerp(Size.m1049getHeightimpl(j), Size.m1049getHeightimpl(j2), f));
    }

    /* JADX INFO: renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m1069takeOrElseTmRCtEA(long j, @NotNull Function0<Size> function0) {
        return (j > Size.INSTANCE.m1060getUnspecifiedNHjbRc() ? 1 : (j == Size.INSTANCE.m1060getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? j : function0.invoke().getPackedValue();
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1072timesd16Qtg0(int i, long j) {
        return Size.m1055times7Ah8Wj8(j, i);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m1073toRectuvyYCjk(long j) {
        return RectKt.m1023Recttz77jQw(Offset.INSTANCE.m999getZeroF1C5BW0(), j);
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1070timesd16Qtg0(double d, long j) {
        return Size.m1055times7Ah8Wj8(j, (float) d);
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1071timesd16Qtg0(float f, long j) {
        return Size.m1055times7Ah8Wj8(j, f);
    }
}
