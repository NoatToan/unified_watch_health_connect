package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.fitness.watch.face.edit.entity.SlotType;
import defpackage.iej;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class GroupView extends RenderableView {
    ReadableMap mFont;
    private GlyphContext mGlyphContext;

    public GroupView(ReactContext reactContext) {
        super(reactContext);
    }

    private static <T> T requireNonNull(T t) {
        t.getClass();
        return t;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        setupGlyphContext(canvas);
        if (f > 0.01f) {
            clip(canvas, paint);
            drawGroup(canvas, paint, f);
        }
    }

    public void drawGroup(Canvas canvas, Paint paint, float f) {
        pushGlyphContext();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof MaskView)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (virtualView instanceof RenderableView) {
                        ((RenderableView) virtualView).mergeProperties(this);
                    }
                    int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas);
                    virtualView.render(canvas, paint, this.mOpacity * f);
                    RectF clientRect = virtualView.getClientRect();
                    if (clientRect != null) {
                        rectF.union(clientRect);
                    }
                    virtualView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                    if (virtualView instanceof RenderableView) {
                        ((RenderableView) virtualView).resetProperties();
                    }
                    if (virtualView.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        setClientRect(rectF);
        popGlyphContext();
    }

    public void drawPath(Canvas canvas, Paint paint, float f) {
        super.draw(canvas, paint, f);
    }

    public GlyphContext getGlyphContext() {
        return this.mGlyphContext;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        ((VirtualView) this).mPath = new Path();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof MaskView) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                ((VirtualView) this).mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return ((VirtualView) this).mPath;
    }

    public GlyphContext getTextRootGlyphContext() {
        return ((GroupView) requireNonNull(getTextRoot())).getGlyphContext();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        int iReactTagForTouch;
        VirtualView virtualView;
        int iHitTest;
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            Path clipPath = getClipPath();
            if (clipPath != null) {
                if (this.mClipRegionPath != clipPath) {
                    this.mClipRegionPath = clipPath;
                    this.mClipRegion = getRegion(clipPath);
                }
                if (!this.mClipRegion.contains(iRound, iRound2)) {
                    return -1;
                }
            }
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof VirtualView) {
                    if (!(childAt instanceof MaskView) && (iHitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                        return (virtualView.isResponsible() || iHitTest != childAt.getId()) ? iHitTest : getId();
                    }
                } else if ((childAt instanceof SvgView) && (iReactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return iReactTagForTouch;
                }
            }
        }
        return -1;
    }

    public void popGlyphContext() {
        getTextRootGlyphContext().popContext();
    }

    public void pushGlyphContext() {
        getTextRootGlyphContext().pushContext(this, this.mFont);
    }

    @Override // com.horcrux.svg.RenderableView
    public void resetProperties() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    @iej(name = SlotType.FONT)
    public void setFont(ReadableMap readableMap) {
        this.mFont = readableMap;
        invalidate();
    }

    public void setupGlyphContext(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Matrix matrix2 = this.mTransform;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.mGlyphContext = new GlyphContext(this.mScale, rectF.width(), rectF.height());
    }

    public Path getPath(Canvas canvas, Paint paint, Region.Op op) {
        Path path;
        Path path2 = new Path();
        Path.Op opValueOf = Path.Op.valueOf(op.name());
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof MaskView) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                if (virtualView instanceof GroupView) {
                    path = ((GroupView) virtualView).getPath(canvas, paint, op);
                } else {
                    path = virtualView.getPath(canvas, paint);
                }
                path.transform(matrix);
                path2.op(path, opValueOf);
            }
        }
        return path2;
    }
}
