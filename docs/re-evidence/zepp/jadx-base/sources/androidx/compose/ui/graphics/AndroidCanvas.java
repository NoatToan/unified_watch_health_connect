package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.widget.share.ShareAnalytics;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntProgression;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b{\u0010qJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000J)\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000J \u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u001d\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J=\u0010+\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J%\u00100\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u0017\u00104\u001a\u000201*\u00020'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J-\u00109\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J0\u0010:\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J@\u0010=\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010>\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J-\u0010C\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJH\u0010H\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u00142\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010I\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J-\u0010O\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010NJE\u0010X\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020P2\u0006\u0010U\u001a\u00020R2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010WJ3\u0010\b\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020Y2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b[\u0010\\J\b\u0010]\u001a\u00020\u0007H\u0016J\b\u0010^\u001a\u00020\u0007H\u0016J-\u0010\r\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b_\u0010`J-\u0010g\u001a\u00020\u00072\u0006\u0010b\u001a\u00020a2\u0006\u0010d\u001a\u00020c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\be\u0010fR,\u0010j\u001a\u00060hj\u0002`i8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bj\u0010k\u0012\u0004\bp\u0010q\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001d\u0010w\u001a\u00020r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001d\u0010z\u001a\u00020r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010t\u001a\u0004\by\u0010v\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006|"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "", "Landroidx/compose/ui/geometry/Offset;", "points", "Landroidx/compose/ui/graphics/Paint;", "paint", "", "drawPoints", "", "stepBy", "drawLines", "", "drawRawPoints", "drawRawLines", ShareAnalytics.ParamValue.SAVE, "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "saveLayer", "", "dx", "dy", VoiceConfigFuncKt.TRANSLATE, "sx", "sy", AnimatorViewWrapper.SCALE, "degrees", "rotate", "skew", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "toRegionOp", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "radiusX", "radiusY", "drawRoundRect", "drawOval", b.m0, "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "drawPath", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "enableZ", "disableZ", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "internalCanvas", "Landroid/graphics/Canvas;", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "()V", "Landroid/graphics/Rect;", "srcRect$delegate", "Lkotlin/Lazy;", "getSrcRect", "()Landroid/graphics/Rect;", "srcRect", "dstRect$delegate", "getDstRect", "dstRect", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
@PublishedApi
public final class AndroidCanvas implements Canvas {

    /* JADX INFO: renamed from: dstRect$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dstRect;

    @NotNull
    private android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;

    /* JADX INFO: renamed from: srcRect$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy srcRect;

    public AndroidCanvas() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.srcRect = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Rect>() { // from class: androidx.compose.ui.graphics.AndroidCanvas$srcRect$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Rect invoke() {
                return new Rect();
            }
        });
        this.dstRect = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Rect>() { // from class: androidx.compose.ui.graphics.AndroidCanvas$dstRect$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Rect invoke() {
                return new Rect();
            }
        });
    }

    private final void drawLines(List<Offset> points, Paint paint, int stepBy) {
        if (points.size() >= 2) {
            IntProgression intProgressionStep = e.step(e.until(0, points.size() - 1), stepBy);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i = first + step;
                    long packedValue = points.get(first).getPackedValue();
                    long packedValue2 = points.get(first + 1).getPackedValue();
                    this.internalCanvas.drawLine(Offset.m983getXimpl(packedValue), Offset.m984getYimpl(packedValue), Offset.m983getXimpl(packedValue2), Offset.m984getYimpl(packedValue2), paint.getInternalPaint());
                    if (first == last) {
                        return;
                    } else {
                        first = i;
                    }
                }
            }
        }
    }

    private final void drawPoints(List<Offset> points, Paint paint) {
        int size = points.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            long packedValue = points.get(i).getPackedValue();
            getInternalCanvas().drawPoint(Offset.m983getXimpl(packedValue), Offset.m984getYimpl(packedValue), paint.getInternalPaint());
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    private final void drawRawLines(float[] points, Paint paint, int stepBy) {
        if (points.length < 4 || points.length % 2 != 0) {
            return;
        }
        IntProgression intProgressionStep = e.step(e.until(0, points.length - 3), stepBy * 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            int i = first + step;
            this.internalCanvas.drawLine(points[first], points[first + 1], points[first + 2], points[first + 3], paint.getInternalPaint());
            if (first == last) {
                return;
            } else {
                first = i;
            }
        }
    }

    private final void drawRawPoints(float[] points, Paint paint, int stepBy) {
        if (points.length % 2 != 0) {
            return;
        }
        IntProgression intProgressionStep = e.step(e.until(0, points.length - 1), stepBy);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            int i = first + step;
            this.internalCanvas.drawPoint(points[first], points[first + 1], paint.getInternalPaint());
            if (first == last) {
                return;
            } else {
                first = i;
            }
        }
    }

    private final Rect getDstRect() {
        return (Rect) this.dstRect.getValue();
    }

    @PublishedApi
    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    private final Rect getSrcRect() {
        return (Rect) this.srcRect.getValue();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo1077clipPathmtrdDE(@NotNull Path path, int clipOp) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m1088toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo1078clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, m1088toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
    public void mo1079clipRectmtrdDE(@NotNull androidx.compose.ui.geometry.Rect rect, int i) {
        Canvas.DefaultImpls.m1190clipRectmtrdDE(this, rect, i);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo1080concat58bKbWc(@NotNull float[] matrix) {
        if (MatrixKt.m1400isIdentity58bKbWc(matrix)) {
            return;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m1095setFromEL8BTi8(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(@NotNull androidx.compose.ui.geometry.Rect rect, float f, float f2, boolean z, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawArc(this, rect, f, f2, z, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArcRad(@NotNull androidx.compose.ui.geometry.Rect rect, float f, float f2, boolean z, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawArcRad(this, rect, f, f2, z, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo1081drawCircle9KIMszo(long center, float radius, @NotNull Paint paint) {
        this.internalCanvas.drawCircle(Offset.m983getXimpl(center), Offset.m984getYimpl(center), radius, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo1082drawImaged4ec7I(@NotNull ImageBitmap image, long topLeftOffset, @NotNull Paint paint) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Offset.m983getXimpl(topLeftOffset), Offset.m984getYimpl(topLeftOffset), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo1083drawImageRectHPBpro0(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @NotNull Paint paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        Rect srcRect = getSrcRect();
        srcRect.left = IntOffset.m3043getXimpl(srcOffset);
        srcRect.top = IntOffset.m3044getYimpl(srcOffset);
        srcRect.right = IntOffset.m3043getXimpl(srcOffset) + IntSize.m3085getWidthimpl(srcSize);
        srcRect.bottom = IntOffset.m3044getYimpl(srcOffset) + IntSize.m3084getHeightimpl(srcSize);
        Unit unit = Unit.INSTANCE;
        Rect dstRect = getDstRect();
        dstRect.left = IntOffset.m3043getXimpl(dstOffset);
        dstRect.top = IntOffset.m3044getYimpl(dstOffset);
        dstRect.right = IntOffset.m3043getXimpl(dstOffset) + IntSize.m3085getWidthimpl(dstSize);
        dstRect.bottom = IntOffset.m3044getYimpl(dstOffset) + IntSize.m3084getHeightimpl(dstSize);
        canvas.drawBitmap(bitmapAsAndroidBitmap, srcRect, dstRect, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo1084drawLineWko1d7g(long p1, long p2, @NotNull Paint paint) {
        this.internalCanvas.drawLine(Offset.m983getXimpl(p1), Offset.m984getYimpl(p1), Offset.m983getXimpl(p2), Offset.m984getYimpl(p2), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(@NotNull androidx.compose.ui.geometry.Rect rect, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawOval(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo1085drawPointsO7TthRY(int pointMode, @NotNull List<Offset> points, @NotNull Paint paint) {
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m1442equalsimpl0(pointMode, companion.m1446getLinesr_lszbg())) {
            drawLines(points, paint, 2);
        } else if (PointMode.m1442equalsimpl0(pointMode, companion.m1448getPolygonr_lszbg())) {
            drawLines(points, paint, 1);
        } else if (PointMode.m1442equalsimpl0(pointMode, companion.m1447getPointsr_lszbg())) {
            drawPoints(points, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo1086drawRawPointsO7TthRY(int pointMode, @NotNull float[] points, @NotNull Paint paint) {
        if (points.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m1442equalsimpl0(pointMode, companion.m1446getLinesr_lszbg())) {
            drawRawLines(points, paint, 2);
        } else if (PointMode.m1442equalsimpl0(pointMode, companion.m1448getPolygonr_lszbg())) {
            drawRawLines(points, paint, 1);
        } else if (PointMode.m1442equalsimpl0(pointMode, companion.m1447getPointsr_lszbg())) {
            drawRawPoints(points, paint, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(@NotNull androidx.compose.ui.geometry.Rect rect, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawRect(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY, @NotNull Paint paint) {
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo1087drawVerticesTPEHhCM(@NotNull Vertices vertices, int blendMode, @NotNull Paint paint) {
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m1127toAndroidVertexModeJOOmi9M(vertices.getVertexMode()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @NotNull
    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@NotNull androidx.compose.ui.geometry.Rect bounds, @NotNull Paint paint) {
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.getInternalPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    public final void setInternalCanvas(@NotNull android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float sx, float sy) {
        this.internalCanvas.skew(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skewRad(float f, float f2) {
        Canvas.DefaultImpls.skewRad(this, f, f2);
    }

    @NotNull
    /* JADX INFO: renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m1088toRegionOp7u2Bmg(int i) {
        return ClipOp.m1196equalsimpl0(i, ClipOp.INSTANCE.m1200getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, @NotNull Paint paint) {
        this.internalCanvas.drawOval(left, top, right, bottom, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, @NotNull Paint paint) {
        this.internalCanvas.drawRect(left, top, right, bottom, paint.getInternalPaint());
    }
}
