package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.SizeKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\r\u001a\u00020\n*\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u0011\u001a\u00020\u000e*\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\"#\u0010\u0016\u001a\u00020\u0012*\u00020\u00038F@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "Landroidx/compose/ui/unit/IntSize;", "IntSize", "(II)J", "size", "times-O0kMr_c", "(IJ)J", "times", "Landroidx/compose/ui/unit/IntRect;", "toIntRect-ozmzZPI", "(J)Landroidx/compose/ui/unit/IntRect;", "toIntRect", "Landroidx/compose/ui/geometry/Size;", "toSize-ozmzZPI", "(J)J", "toSize", "Landroidx/compose/ui/unit/IntOffset;", "getCenter-ozmzZPI", "getCenter-ozmzZPI$annotations", "(J)V", b.m0, "ui-unit_release"}, k = 2, mv = {1, 5, 1})
public final class IntSizeKt {
    @Stable
    public static final long IntSize(int i, int i2) {
        return IntSize.m3080constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    /* JADX INFO: renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m3091getCenterozmzZPI(long j) {
        return IntOffsetKt.IntOffset(IntSize.m3085getWidthimpl(j) / 2, IntSize.m3084getHeightimpl(j) / 2);
    }

    @Stable
    /* JADX INFO: renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m3092getCenterozmzZPI$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m3093timesO0kMr_c(int i, long j) {
        return IntSize.m3087timesYEO4UFw(j, i);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final IntRect m3094toIntRectozmzZPI(long j) {
        return IntRectKt.m3075IntRectVbeCjmY(IntOffset.INSTANCE.m3053getZeronOccac(), j);
    }

    @Stable
    /* JADX INFO: renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m3095toSizeozmzZPI(long j) {
        return SizeKt.Size(IntSize.m3085getWidthimpl(j), IntSize.m3084getHeightimpl(j));
    }
}
