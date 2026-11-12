package com.airbnb.lottie.utils;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import b.m;
import c7.b;
import com.airbnb.lottie.animation.LPaint;
import kg.f;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class OffscreenLayer {
    private static final Matrix IDENTITY_MATRIX = new Matrix();
    private Bitmap bitmap;
    private Canvas bitmapCanvas;
    private Rect bitmapSrcRect;
    private LPaint clearPaint;
    private Paint composePaint;
    private RenderStrategy currentStrategy;
    private Rect intRectIncludingShadow;
    private DropShadow lastRenderNodeShadow;
    private float lastShadowBlurRadius = 0.0f;

    /* JADX INFO: renamed from: op, reason: collision with root package name */
    private ComposeOp f28252op;
    private Canvas parentCanvas;
    Matrix parentCanvasMatrix;
    float[] preExistingTransform;
    private RectF rectIncludingShadow;
    private RenderNode renderNode;
    private RectF scaledBounds;
    private RectF scaledRectIncludingShadow;
    private Bitmap shadowBitmap;
    private Canvas shadowBitmapCanvas;
    private Rect shadowBitmapSrcRect;
    private BlurMaskFilter shadowBlurFilter;
    private Bitmap shadowMaskBitmap;
    private Canvas shadowMaskBitmapCanvas;
    private LPaint shadowPaint;
    private RenderNode shadowRenderNode;
    private RectF targetRect;
    private RectF tmpRect;

    public static class ComposeOp {
        public int alpha;
        public b blendMode;
        public ColorFilter colorFilter;
        public DropShadow shadow;

        public ComposeOp() {
            reset();
        }

        public boolean hasBlendMode() {
            b bVar = this.blendMode;
            return (bVar == null || bVar == b.SRC_OVER) ? false : true;
        }

        public boolean hasColorFilter() {
            return this.colorFilter != null;
        }

        public boolean hasShadow() {
            return this.shadow != null;
        }

        public boolean isNoop() {
            return (isTranslucent() || hasBlendMode() || hasShadow() || hasColorFilter()) ? false : true;
        }

        public boolean isTranslucent() {
            return this.alpha < 255;
        }

        public void reset() {
            this.alpha = 255;
            this.blendMode = null;
            this.colorFilter = null;
            this.shadow = null;
        }
    }

    public enum RenderStrategy {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    private Bitmap allocateBitmap(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    private RectF calculateRectIncludingShadow(RectF rectF, DropShadow dropShadow) {
        if (this.rectIncludingShadow == null) {
            this.rectIncludingShadow = new RectF();
        }
        if (this.tmpRect == null) {
            this.tmpRect = new RectF();
        }
        this.rectIncludingShadow.set(rectF);
        this.rectIncludingShadow.offsetTo(dropShadow.getDx() + rectF.left, dropShadow.getDy() + rectF.top);
        this.rectIncludingShadow.inset(-dropShadow.getRadius(), -dropShadow.getRadius());
        this.tmpRect.set(rectF);
        this.rectIncludingShadow.union(this.tmpRect);
        return this.rectIncludingShadow;
    }

    private RenderStrategy chooseRenderStrategy(Canvas canvas, ComposeOp composeOp) {
        if (composeOp.isNoop()) {
            return RenderStrategy.DIRECT;
        }
        if (!composeOp.hasShadow()) {
            return RenderStrategy.SAVE_LAYER;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 29 || !canvas.isHardwareAccelerated()) {
            return RenderStrategy.BITMAP;
        }
        return i14 <= 31 ? RenderStrategy.BITMAP : RenderStrategy.RENDER_NODE;
    }

    private void deallocateBitmap(Bitmap bitmap) {
        bitmap.recycle();
    }

    private boolean needNewBitmap(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    private void renderBitmapShadow(Canvas canvas, DropShadow dropShadow) {
        LPaint lPaint;
        RectF rectF = this.targetRect;
        if (rectF == null || this.bitmap == null) {
            h.z("Cannot render to bitmap outside a start()/finish() block");
            return;
        }
        RectF rectFCalculateRectIncludingShadow = calculateRectIncludingShadow(rectF, dropShadow);
        if (this.intRectIncludingShadow == null) {
            this.intRectIncludingShadow = new Rect();
        }
        this.intRectIncludingShadow.set((int) Math.floor(rectFCalculateRectIncludingShadow.left), (int) Math.floor(rectFCalculateRectIncludingShadow.top), (int) Math.ceil(rectFCalculateRectIncludingShadow.right), (int) Math.ceil(rectFCalculateRectIncludingShadow.bottom));
        float[] fArr = this.preExistingTransform;
        float f14 = fArr != null ? fArr[0] : 1.0f;
        float f15 = fArr != null ? fArr[4] : 1.0f;
        if (this.scaledRectIncludingShadow == null) {
            this.scaledRectIncludingShadow = new RectF();
        }
        this.scaledRectIncludingShadow.set(rectFCalculateRectIncludingShadow.left * f14, rectFCalculateRectIncludingShadow.top * f15, rectFCalculateRectIncludingShadow.right * f14, rectFCalculateRectIncludingShadow.bottom * f15);
        if (this.shadowBitmapSrcRect == null) {
            this.shadowBitmapSrcRect = new Rect();
        }
        this.shadowBitmapSrcRect.set(0, 0, Math.round(this.scaledRectIncludingShadow.width()), Math.round(this.scaledRectIncludingShadow.height()));
        if (needNewBitmap(this.shadowBitmap, this.scaledRectIncludingShadow)) {
            Bitmap bitmap = this.shadowBitmap;
            if (bitmap != null) {
                deallocateBitmap(bitmap);
            }
            Bitmap bitmap2 = this.shadowMaskBitmap;
            if (bitmap2 != null) {
                deallocateBitmap(bitmap2);
            }
            this.shadowBitmap = allocateBitmap(this.scaledRectIncludingShadow, Bitmap.Config.ARGB_8888);
            this.shadowMaskBitmap = allocateBitmap(this.scaledRectIncludingShadow, Bitmap.Config.ALPHA_8);
            this.shadowBitmapCanvas = new Canvas(this.shadowBitmap);
            this.shadowMaskBitmapCanvas = new Canvas(this.shadowMaskBitmap);
        } else {
            Canvas canvas2 = this.shadowBitmapCanvas;
            if (canvas2 == null || this.shadowMaskBitmapCanvas == null || (lPaint = this.clearPaint) == null) {
                h.z("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                return;
            } else {
                canvas2.drawRect(this.shadowBitmapSrcRect, lPaint);
                this.shadowMaskBitmapCanvas.drawRect(this.shadowBitmapSrcRect, this.clearPaint);
            }
        }
        if (this.shadowMaskBitmap == null) {
            h.z("Expected to have allocated a shadow mask bitmap");
            return;
        }
        if (this.shadowPaint == null) {
            this.shadowPaint = new LPaint(1);
        }
        RectF rectF2 = this.targetRect;
        this.shadowMaskBitmapCanvas.drawBitmap(this.bitmap, Math.round((rectF2.left - rectFCalculateRectIncludingShadow.left) * f14), Math.round((rectF2.top - rectFCalculateRectIncludingShadow.top) * f15), (Paint) null);
        if (this.shadowBlurFilter == null || this.lastShadowBlurRadius != dropShadow.getRadius()) {
            float radius = ((f14 + f15) * dropShadow.getRadius()) / 2.0f;
            if (radius > 0.0f) {
                this.shadowBlurFilter = new BlurMaskFilter(radius, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.shadowBlurFilter = null;
            }
            this.lastShadowBlurRadius = dropShadow.getRadius();
        }
        this.shadowPaint.setColor(dropShadow.getColor());
        float radius2 = dropShadow.getRadius();
        LPaint lPaint2 = this.shadowPaint;
        if (radius2 > 0.0f) {
            lPaint2.setMaskFilter(this.shadowBlurFilter);
        } else {
            lPaint2.setMaskFilter(null);
        }
        this.shadowPaint.setFilterBitmap(true);
        this.shadowBitmapCanvas.drawBitmap(this.shadowMaskBitmap, Math.round(dropShadow.getDx() * f14), Math.round(dropShadow.getDy() * f15), this.shadowPaint);
        canvas.drawBitmap(this.shadowBitmap, this.shadowBitmapSrcRect, this.intRectIncludingShadow, this.composePaint);
    }

    private void renderHardwareShadow(Canvas canvas, DropShadow dropShadow) {
        if (this.renderNode == null || this.shadowRenderNode == null) {
            h.z("Cannot render to render node outside a start()/finish() block");
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            f.n("RenderEffect is not supported on API level <31");
            return;
        }
        float[] fArr = this.preExistingTransform;
        float f14 = fArr != null ? fArr[0] : 1.0f;
        float f15 = fArr != null ? fArr[4] : 1.0f;
        DropShadow dropShadow2 = this.lastRenderNodeShadow;
        if (dropShadow2 == null || !dropShadow.sameAs(dropShadow2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(dropShadow.getColor(), PorterDuff.Mode.SRC_IN));
            if (dropShadow.getRadius() > 0.0f) {
                float radius = ((f14 + f15) * dropShadow.getRadius()) / 2.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(radius, radius, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.shadowRenderNode.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.lastRenderNodeShadow = dropShadow;
        }
        RectF rectFCalculateRectIncludingShadow = calculateRectIncludingShadow(this.targetRect, dropShadow);
        RectF rectF = new RectF(rectFCalculateRectIncludingShadow.left * f14, rectFCalculateRectIncludingShadow.top * f15, rectFCalculateRectIncludingShadow.right * f14, rectFCalculateRectIncludingShadow.bottom * f15);
        this.shadowRenderNode.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.shadowRenderNode.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((dropShadow.getDx() * f14) + (-rectF.left), (dropShadow.getDy() * f15) + (-rectF.top));
        recordingCanvasBeginRecording.drawRenderNode(this.renderNode);
        this.shadowRenderNode.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.shadowRenderNode);
        canvas.restore();
    }

    public void finish() {
        if (this.parentCanvas == null || this.f28252op == null || this.preExistingTransform == null || this.targetRect == null) {
            h.z("OffscreenBitmap: finish() call without matching start()");
            return;
        }
        int iOrdinal = this.currentStrategy.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.parentCanvas.restore();
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.renderNode == null) {
                    h.z("RenderNode is not ready; should've been initialized at start() time");
                    return;
                }
                if (Build.VERSION.SDK_INT < 29) {
                    h.z("RenderNode not supported but we chose it as render strategy");
                    return;
                }
                this.parentCanvas.save();
                Canvas canvas = this.parentCanvas;
                float[] fArr = this.preExistingTransform;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.renderNode.endRecording();
                if (this.f28252op.hasShadow()) {
                    renderHardwareShadow(this.parentCanvas, this.f28252op.shadow);
                }
                this.parentCanvas.drawRenderNode(this.renderNode);
                this.parentCanvas.restore();
            }
        } else {
            if (this.bitmap == null) {
                h.z("Bitmap is not ready; should've been initialized at start() time");
                return;
            }
            if (this.f28252op.hasShadow()) {
                renderBitmapShadow(this.parentCanvas, this.f28252op.shadow);
            }
            if (this.bitmapSrcRect == null) {
                this.bitmapSrcRect = new Rect();
            }
            this.bitmapSrcRect.set(0, 0, (int) (this.targetRect.width() * this.preExistingTransform[0]), (int) (this.targetRect.height() * this.preExistingTransform[4]));
            this.parentCanvas.drawBitmap(this.bitmap, this.bitmapSrcRect, this.targetRect, this.composePaint);
        }
        this.parentCanvas = null;
    }

    public boolean finishDecrementsCanvasSaveCount() {
        return this.currentStrategy == RenderStrategy.RENDER_NODE;
    }

    public Canvas start(Canvas canvas, RectF rectF, ComposeOp composeOp) {
        if (this.parentCanvas != null) {
            h.z("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
            return null;
        }
        if (this.preExistingTransform == null) {
            this.preExistingTransform = new float[9];
        }
        if (this.parentCanvasMatrix == null) {
            this.parentCanvasMatrix = new Matrix();
        }
        canvas.getMatrix(this.parentCanvasMatrix);
        this.parentCanvasMatrix.getValues(this.preExistingTransform);
        float[] fArr = this.preExistingTransform;
        float f14 = fArr[0];
        float f15 = fArr[4];
        if (this.scaledBounds == null) {
            this.scaledBounds = new RectF();
        }
        this.scaledBounds.set(rectF.left * f14, rectF.top * f15, rectF.right * f14, rectF.bottom * f15);
        this.parentCanvas = canvas;
        this.f28252op = composeOp;
        this.currentStrategy = chooseRenderStrategy(canvas, composeOp);
        if (this.targetRect == null) {
            this.targetRect = new RectF();
        }
        this.targetRect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.composePaint == null) {
            this.composePaint = new LPaint();
        }
        this.composePaint.reset();
        int iOrdinal = this.currentStrategy.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.composePaint.setAlpha(composeOp.alpha);
            this.composePaint.setColorFilter(composeOp.colorFilter);
            if (composeOp.hasBlendMode()) {
                c7.f.a(this.composePaint, composeOp.blendMode);
            }
            Utils.saveLayerCompat(canvas, rectF, this.composePaint);
            return canvas;
        }
        if (iOrdinal == 2) {
            if (this.clearPaint == null) {
                LPaint lPaint = new LPaint();
                this.clearPaint = lPaint;
                lPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (needNewBitmap(this.bitmap, this.scaledBounds)) {
                Bitmap bitmap = this.bitmap;
                if (bitmap != null) {
                    deallocateBitmap(bitmap);
                }
                this.bitmap = allocateBitmap(this.scaledBounds, Bitmap.Config.ARGB_8888);
                this.bitmapCanvas = new Canvas(this.bitmap);
            } else {
                Canvas canvas2 = this.bitmapCanvas;
                if (canvas2 == null) {
                    h.z("If needNewBitmap() returns true, we should have a canvas ready");
                    return null;
                }
                canvas2.setMatrix(IDENTITY_MATRIX);
                this.bitmapCanvas.drawRect(-1.0f, -1.0f, this.scaledBounds.width() + 1.0f, this.scaledBounds.height() + 1.0f, this.clearPaint);
            }
            c7.f.a(this.composePaint, composeOp.blendMode);
            this.composePaint.setColorFilter(composeOp.colorFilter);
            this.composePaint.setAlpha(composeOp.alpha);
            Canvas canvas3 = this.bitmapCanvas;
            canvas3.scale(f14, f15);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iOrdinal != 3) {
            f.n("Invalid render strategy for OffscreenLayer");
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            h.z("RenderNode not supported but we chose it as render strategy");
            return null;
        }
        if (this.renderNode == null) {
            this.renderNode = m.g();
        }
        if (composeOp.hasShadow() && this.shadowRenderNode == null) {
            this.shadowRenderNode = m.C();
            this.lastRenderNodeShadow = null;
        }
        if (composeOp.hasBlendMode() || composeOp.hasColorFilter()) {
            if (this.composePaint == null) {
                this.composePaint = new LPaint();
            }
            this.composePaint.reset();
            c7.f.a(this.composePaint, composeOp.blendMode);
            this.composePaint.setColorFilter(composeOp.colorFilter);
            this.renderNode.setUseCompositingLayer(true, this.composePaint);
            if (composeOp.hasShadow()) {
                RenderNode renderNode = this.shadowRenderNode;
                if (renderNode == null) {
                    h.z("Must initialize shadowRenderNode when we have shadow");
                    return null;
                }
                renderNode.setUseCompositingLayer(true, this.composePaint);
            }
        }
        this.renderNode.setAlpha(composeOp.alpha / 255.0f);
        if (composeOp.hasShadow()) {
            RenderNode renderNode2 = this.shadowRenderNode;
            if (renderNode2 == null) {
                h.z("Must initialize shadowRenderNode when we have shadow");
                return null;
            }
            renderNode2.setAlpha(composeOp.alpha / 255.0f);
        }
        this.renderNode.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.renderNode;
        RectF rectF2 = this.scaledBounds;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording((int) this.scaledBounds.width(), (int) this.scaledBounds.height());
        recordingCanvasBeginRecording.setMatrix(IDENTITY_MATRIX);
        recordingCanvasBeginRecording.scale(f14, f15);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
