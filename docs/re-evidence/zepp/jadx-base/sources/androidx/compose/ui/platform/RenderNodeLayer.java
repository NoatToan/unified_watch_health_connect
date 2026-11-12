package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u0001dB1\u0012\u0006\u00108\u001a\u000207\u0012\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00020<\u0012\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020A¢\u0006\u0004\bb\u0010cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u008d\u0001\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010 \u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010$J\b\u0010)\u001a\u00020\u0002H\u0016J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020\u0002H\u0016J%\u00103\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u0018\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\u0006\u00100\u001a\u00020\u0013H\u0016R\u0019\u00108\u001a\u0002078\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R%\u0010=\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00020<8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020A8\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER$\u0010G\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u00138\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010HR\u0016\u0010O\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010HR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001f\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010VR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020Z8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001c\u0010a\u001a\u00020Z8V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b_\u0010`\u001a\u0004\b^\u0010\\\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006e"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "", "triggerRepaint", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "updateLayerProperties-dRfWZ4U", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "updateLayerProperties", "Landroidx/compose/ui/geometry/Offset;", "position", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "invalidate", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "drawLayer", "updateDisplayList", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/Function1;", "drawBlock", "Lkotlin/jvm/functions/Function1;", "getDrawBlock", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "invalidateParentLayer", "Lkotlin/jvm/functions/Function0;", "getInvalidateParentLayer", "()Lkotlin/jvm/functions/Function0;", "value", "isDirty", "Z", "setDirty", "(Z)V", "Landroidx/compose/ui/platform/OutlineResolver;", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "isDestroyed", "drawnWithZ", "Landroidx/compose/ui/platform/RenderNodeMatrixCache;", "matrixCache", "Landroidx/compose/ui/platform/RenderNodeMatrixCache;", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "J", "Landroidx/compose/ui/platform/DeviceRenderNode;", "renderNode", "Landroidx/compose/ui/platform/DeviceRenderNode;", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "getOwnerViewId$annotations", "()V", "ownerViewId", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class RenderNodeLayer implements OwnedLayer {

    @NotNull
    private final Function1<Canvas, Unit> drawBlock;
    private boolean drawnWithZ;

    @NotNull
    private final Function0<Unit> invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;

    @NotNull
    private final OutlineResolver outlineResolver;

    @NotNull
    private final AndroidComposeView ownerView;

    @NotNull
    private final DeviceRenderNode renderNode;

    @NotNull
    private final RenderNodeMatrixCache matrixCache = new RenderNodeMatrixCache();

    @NotNull
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private long transformOrigin = TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29;", "", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
    @RequiresApi(29)
    public static final class UniqueDrawingIdApi29 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @RequiresApi(29)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29$Companion;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "getUniqueDrawingId", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final long getUniqueDrawingId(@NotNull View view) {
                return view.getUniqueDrawingId();
            }
        }

        @JvmStatic
        public static final long getUniqueDrawingId(@NotNull View view) {
            return INSTANCE.getUniqueDrawingId(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RenderNodeLayer(@NotNull AndroidComposeView androidComposeView, @NotNull Function1<? super Canvas, Unit> function1, @NotNull Function0<Unit> function0) {
        this.ownerView = androidComposeView;
        this.drawBlock = function1;
        this.invalidateParentLayer = function0;
        this.outlineResolver = new OutlineResolver(androidComposeView.getDensity());
        DeviceRenderNode renderNodeApi29 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29(androidComposeView) : new RenderNodeApi23(androidComposeView);
        renderNodeApi29.setHasOverlappingRendering(true);
        Unit unit = Unit.INSTANCE;
        this.renderNode = renderNodeApi29;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getOwnerViewId$annotations() {
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (!nativeCanvas.isHardwareAccelerated()) {
            this.drawBlock.invoke(canvas);
            setDirty(false);
            return;
        }
        updateDisplayList();
        boolean z = this.renderNode.getElevation() > 0.0f;
        this.drawnWithZ = z;
        if (z) {
            canvas.enableZ();
        }
        this.renderNode.drawInto(nativeCanvas);
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    @NotNull
    public final Function1<Canvas, Unit> getDrawBlock() {
        return this.drawBlock;
    }

    @NotNull
    public final Function0<Unit> getInvalidateParentLayer() {
        return this.invalidateParentLayer;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.INSTANCE.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo2584isInLayerk4lQ0M(long position) {
        float fM983getXimpl = Offset.m983getXimpl(position);
        float fM984getYimpl = Offset.m984getYimpl(position);
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= fM983getXimpl && fM983getXimpl < ((float) this.renderNode.getWidth()) && 0.0f <= fM984getYimpl && fM984getYimpl < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m2607isInOutlinek4lQ0M(position);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect rect, boolean inverse) {
        if (inverse) {
            Matrix.m1384mapimpl(this.matrixCache.m2609getInverseMatrixGrdbGEg(this.renderNode), rect);
        } else {
            Matrix.m1384mapimpl(this.matrixCache.m2610getMatrixGrdbGEg(this.renderNode), rect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo2585mapOffset8S9VItk(long point, boolean inverse) {
        return inverse ? Matrix.m1382mapMKHz9U(this.matrixCache.m2609getInverseMatrixGrdbGEg(this.renderNode), point) : Matrix.m1382mapMKHz9U(this.matrixCache.m2610getMatrixGrdbGEg(this.renderNode), point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo2586movegyyYBs(long position) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int iM3043getXimpl = IntOffset.m3043getXimpl(position);
        int iM3044getYimpl = IntOffset.m3044getYimpl(position);
        if (left == iM3043getXimpl && top == iM3044getYimpl) {
            return;
        }
        this.renderNode.offsetLeftAndRight(iM3043getXimpl - left);
        this.renderNode.offsetTopAndBottom(iM3044getYimpl - top);
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo2587resizeozmzZPI(long size) {
        int iM3085getWidthimpl = IntSize.m3085getWidthimpl(size);
        int iM3084getHeightimpl = IntSize.m3084getHeightimpl(size);
        float f = iM3085getWidthimpl;
        this.renderNode.setPivotX(TransformOrigin.m1512getPivotFractionXimpl(this.transformOrigin) * f);
        float f2 = iM3084getHeightimpl;
        this.renderNode.setPivotY(TransformOrigin.m1513getPivotFractionYimpl(this.transformOrigin) * f2);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + iM3085getWidthimpl, this.renderNode.getTop() + iM3084getHeightimpl)) {
            this.outlineResolver.m2608updateuvyYCjk(SizeKt.Size(f, f2));
            this.renderNode.setOutline(this.outlineResolver.getOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            setDirty(false);
            this.renderNode.record(this.canvasHolder, this.renderNode.getClipToOutline() ? this.outlineResolver.getClipPath() : null, this.drawBlock);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: updateLayerProperties-dRfWZ4U */
    public void mo2588updateLayerPropertiesdRfWZ4U(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, @NotNull Shape shape, boolean clip, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        this.transformOrigin = transformOrigin;
        boolean z = this.renderNode.getClipToOutline() && this.outlineResolver.getClipPath() != null;
        this.renderNode.setScaleX(scaleX);
        this.renderNode.setScaleY(scaleY);
        this.renderNode.setAlpha(alpha);
        this.renderNode.setTranslationX(translationX);
        this.renderNode.setTranslationY(translationY);
        this.renderNode.setElevation(shadowElevation);
        this.renderNode.setRotationZ(rotationZ);
        this.renderNode.setRotationX(rotationX);
        this.renderNode.setRotationY(rotationY);
        this.renderNode.setCameraDistance(cameraDistance);
        this.renderNode.setPivotX(TransformOrigin.m1512getPivotFractionXimpl(transformOrigin) * this.renderNode.getWidth());
        this.renderNode.setPivotY(TransformOrigin.m1513getPivotFractionYimpl(transformOrigin) * this.renderNode.getHeight());
        this.renderNode.setClipToOutline(clip && shape != RectangleShapeKt.getRectangleShape());
        this.renderNode.setClipToBounds(clip && shape == RectangleShapeKt.getRectangleShape());
        boolean zUpdate = this.outlineResolver.update(shape, this.renderNode.getAlpha(), this.renderNode.getClipToOutline(), this.renderNode.getElevation(), layoutDirection, density);
        this.renderNode.setOutline(this.outlineResolver.getOutline());
        boolean z2 = this.renderNode.getClipToOutline() && this.outlineResolver.getClipPath() != null;
        if (z != z2 || (z2 && zUpdate)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f) {
            this.invalidateParentLayer.getA();
        }
        this.matrixCache.invalidate();
    }
}
