package androidx.compose.ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/VertexMode;", "Landroid/graphics/Canvas$VertexMode;", "toAndroidVertexMode-JOOmi9M", "(I)Landroid/graphics/Canvas$VertexMode;", "toAndroidVertexMode", "ui-graphics_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidVertexMode_androidKt {
    @NotNull
    /* JADX INFO: renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final android.graphics.Canvas.VertexMode m1127toAndroidVertexModeJOOmi9M(int i) {
        VertexMode.Companion companion = VertexMode.INSTANCE;
        if (VertexMode.m1521equalsimpl0(i, companion.m1527getTrianglesc2xauaI())) {
            return android.graphics.Canvas.VertexMode.TRIANGLES;
        }
        if (VertexMode.m1521equalsimpl0(i, companion.m1526getTriangleStripc2xauaI())) {
            return android.graphics.Canvas.VertexMode.TRIANGLE_STRIP;
        }
        return VertexMode.m1521equalsimpl0(i, companion.m1525getTriangleFanc2xauaI()) ? android.graphics.Canvas.VertexMode.TRIANGLE_FAN : android.graphics.Canvas.VertexMode.TRIANGLES;
    }
}
