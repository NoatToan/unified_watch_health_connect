package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.widget.share.ShareAnalytics;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH&J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH&J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u001d\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J?\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J'\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J-\u00102\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0018\u00103\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u00103\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J@\u00106\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u00107\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u00107\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J-\u0010<\u001a\u00020\u00022\u0006\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J0\u0010A\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n2\u0006\u0010@\u001a\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0016JH\u0010A\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n2\u0006\u0010@\u001a\u00020?2\u0006\u0010\b\u001a\u00020\u0007H&J0\u0010D\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020\n2\u0006\u0010@\u001a\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010E\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020\u0007H&J-\u0010K\u001a\u00020\u00022\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JJM\u0010T\u001a\u00020\u00022\u0006\u0010G\u001a\u00020F2\b\b\u0002\u0010M\u001a\u00020L2\b\b\u0002\u0010O\u001a\u00020N2\b\b\u0002\u0010P\u001a\u00020L2\b\b\u0002\u0010Q\u001a\u00020N2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010SJ3\u0010[\u001a\u00020\u00022\u0006\u0010V\u001a\u00020U2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020-0W2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bY\u0010ZJ-\u0010_\u001a\u00020\u00022\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020\\2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010^J-\u0010f\u001a\u00020\u00022\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020b2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bd\u0010eJ\b\u0010g\u001a\u00020\u0002H&J\b\u0010h\u001a\u00020\u0002H&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006i"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "", ShareAnalytics.ParamValue.SAVE, "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "saveLayer", "", "dx", "dy", VoiceConfigFuncKt.TRANSLATE, "sx", "sy", AnimatorViewWrapper.SCALE, "degrees", "rotate", "skew", "sxRad", "syRad", "skewRad", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "rect", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-mtrdD-E", "(Landroidx/compose/ui/geometry/Rect;I)V", "clipRect", "left", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "radiusX", "radiusY", "drawRoundRect", "drawOval", b.m0, "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "startAngleRad", "sweepAngleRad", "drawArcRad", "drawPath", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "", "points", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "enableZ", "disableZ", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
public interface Canvas {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
        public static /* synthetic */ void m1188clipPathmtrdDE$default(Canvas canvas, Path path, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            }
            if ((i2 & 2) != 0) {
                i = ClipOp.INSTANCE.m1201getIntersectrtfAjoo();
            }
            canvas.mo1077clipPathmtrdDE(path, i);
        }

        /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
        public static /* synthetic */ void m1189clipRectN_I0leg$default(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            }
            if ((i2 & 16) != 0) {
                i = ClipOp.INSTANCE.m1201getIntersectrtfAjoo();
            }
            canvas.mo1078clipRectN_I0leg(f, f2, f3, f4, i);
        }

        /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m1190clipRectmtrdDE(@NotNull Canvas canvas, @NotNull Rect rect, int i) {
            canvas.mo1078clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i);
        }

        /* JADX INFO: renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
        public static /* synthetic */ void m1191clipRectmtrdDE$default(Canvas canvas, Rect rect, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
            }
            if ((i2 & 2) != 0) {
                i = ClipOp.INSTANCE.m1201getIntersectrtfAjoo();
            }
            canvas.mo1079clipRectmtrdDE(rect, i);
        }

        public static void drawArc(@NotNull Canvas canvas, @NotNull Rect rect, float f, float f2, boolean z, @NotNull Paint paint) {
            canvas.drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2, z, paint);
        }

        public static void drawArcRad(@NotNull Canvas canvas, @NotNull Rect rect, float f, float f2, boolean z, @NotNull Paint paint) {
            canvas.drawArc(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z, paint);
        }

        /* JADX INFO: renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
        public static /* synthetic */ void m1192drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
            }
            long jM3053getZeronOccac = (i & 2) != 0 ? IntOffset.INSTANCE.m3053getZeronOccac() : j;
            long jIntSize = (i & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
            canvas.mo1083drawImageRectHPBpro0(imageBitmap, jM3053getZeronOccac, jIntSize, (i & 8) != 0 ? IntOffset.INSTANCE.m3053getZeronOccac() : j3, (i & 16) != 0 ? jIntSize : j4, paint);
        }

        public static void drawOval(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
            canvas.drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
        }

        public static void drawRect(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
            canvas.drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
        }

        public static /* synthetic */ void scale$default(Canvas canvas, float f, float f2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
            }
            if ((i & 2) != 0) {
                f2 = f;
            }
            canvas.scale(f, f2);
        }

        public static void skewRad(@NotNull Canvas canvas, float f, float f2) {
            canvas.skew(DegreesKt.degrees(f), DegreesKt.degrees(f2));
        }
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo1077clipPathmtrdDE(@NotNull Path path, int clipOp);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo1078clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp);

    /* JADX INFO: renamed from: clipRect-mtrdD-E */
    void mo1079clipRectmtrdDE(@NotNull Rect rect, int clipOp);

    /* JADX INFO: renamed from: concat-58bKbWc */
    void mo1080concat58bKbWc(@NotNull float[] matrix);

    void disableZ();

    void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint);

    void drawArc(@NotNull Rect rect, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint);

    void drawArcRad(@NotNull Rect rect, float startAngleRad, float sweepAngleRad, boolean useCenter, @NotNull Paint paint);

    /* JADX INFO: renamed from: drawCircle-9KIMszo */
    void mo1081drawCircle9KIMszo(long center, float radius, @NotNull Paint paint);

    /* JADX INFO: renamed from: drawImage-d-4ec7I */
    void mo1082drawImaged4ec7I(@NotNull ImageBitmap image, long topLeftOffset, @NotNull Paint paint);

    /* JADX INFO: renamed from: drawImageRect-HPBpro0 */
    void mo1083drawImageRectHPBpro0(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @NotNull Paint paint);

    /* JADX INFO: renamed from: drawLine-Wko1d7g */
    void mo1084drawLineWko1d7g(long p1, long p2, @NotNull Paint paint);

    void drawOval(float left, float top, float right, float bottom, @NotNull Paint paint);

    void drawOval(@NotNull Rect rect, @NotNull Paint paint);

    void drawPath(@NotNull Path path, @NotNull Paint paint);

    /* JADX INFO: renamed from: drawPoints-O7TthRY */
    void mo1085drawPointsO7TthRY(int pointMode, @NotNull List<Offset> points, @NotNull Paint paint);

    /* JADX INFO: renamed from: drawRawPoints-O7TthRY */
    void mo1086drawRawPointsO7TthRY(int pointMode, @NotNull float[] points, @NotNull Paint paint);

    void drawRect(float left, float top, float right, float bottom, @NotNull Paint paint);

    void drawRect(@NotNull Rect rect, @NotNull Paint paint);

    void drawRoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY, @NotNull Paint paint);

    /* JADX INFO: renamed from: drawVertices-TPEHhCM */
    void mo1087drawVerticesTPEHhCM(@NotNull Vertices vertices, int blendMode, @NotNull Paint paint);

    void enableZ();

    void restore();

    void rotate(float degrees);

    void save();

    void saveLayer(@NotNull Rect bounds, @NotNull Paint paint);

    void scale(float sx, float sy);

    void skew(float sx, float sy);

    void skewRad(float sxRad, float syRad);

    void translate(float dx, float dy);
}
