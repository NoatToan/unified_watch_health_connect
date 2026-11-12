package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.SolidColor;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/Dp;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/foundation/BorderStroke;", "BorderStroke-cXLIe8U", "(FJ)Landroidx/compose/foundation/BorderStroke;", "BorderStroke", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class BorderStrokeKt {
    @Stable
    @NotNull
    /* JADX INFO: renamed from: BorderStroke-cXLIe8U, reason: not valid java name */
    public static final BorderStroke m125BorderStrokecXLIe8U(float f, long j) {
        return new BorderStroke(f, new SolidColor(j, null), null);
    }
}
