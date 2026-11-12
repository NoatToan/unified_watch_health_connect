package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import defpackage.cv;
import defpackage.cx;
import defpackage.ef;
import defpackage.fa;
import defpackage.fd;
import defpackage.fl;
import defpackage.fo;
import defpackage.ge;
import defpackage.gq;
import defpackage.gs;
import defpackage.gv;
import defpackage.gw;
import defpackage.gx;
import defpackage.gy;
import defpackage.ha;
import defpackage.ho;
import defpackage.iy;
import defpackage.je;
import defpackage.jf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {
    private static final int CLIP_SAVE_FLAG = 2;
    private static final int CLIP_TO_LAYER_SAVE_FLAG = 16;
    private static final int MATRIX_SAVE_FLAG = 1;
    private static final int SAVE_FLAGS = 19;
    private final List<BaseKeyframeAnimation<?, ?>> animations;
    BlurMaskFilter blurMaskFilter;
    float blurMaskFilterRadius;
    protected final Matrix boundsMatrix;
    private final RectF canvasBounds;
    private final Paint clearPaint;
    private final String drawTraceName;
    private fd inOutAnimation;
    protected final Layer layerModel;
    protected final LottieDrawable lottieDrawable;
    private fa mask;
    private final RectF maskBoundsRect;
    private final RectF matteBoundsRect;
    private BaseLayer matteLayer;
    private final Paint mattePaint;
    private boolean outlineMasksAndMattes;
    private Paint outlineMasksAndMattesPaint;
    private BaseLayer parentLayer;
    private List<BaseLayer> parentLayers;
    private final RectF rect;
    private final RectF tempMaskBoundsRect;
    protected final fl transform;
    private boolean visible;
    private final Path path = new Path();
    private final Matrix matrix = new Matrix();
    private final Matrix canvasMatrix = new Matrix();
    private final Paint contentPaint = new ef(1);
    private final Paint dstInPaint = new ef(1, PorterDuff.Mode.DST_IN);
    private final Paint dstOutPaint = new ef(1, PorterDuff.Mode.DST_OUT);

    protected abstract void drawLayer(Canvas canvas, Matrix matrix, int i);

    protected void resolveChildKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }

    public static BaseLayer forModel(gs gsVar, Layer layer, LottieDrawable lottieDrawable, cx cxVar) {
        switch (AnonymousClass5.f1948b[layer.h().ordinal()]) {
            case 1:
                return new gy(lottieDrawable, layer, gsVar, cxVar);
            case 2:
                return new gs(lottieDrawable, layer, cxVar.a(layer.k()), cxVar);
            case 3:
                return new ha(lottieDrawable, layer);
            case 4:
                return new gv(lottieDrawable, layer);
            case 5:
                return new gw(lottieDrawable, layer);
            case 6:
                return new gx(lottieDrawable, layer);
            default:
                iy.d("Unknown layer type " + layer.h());
                return null;
        }
    }

    public BaseLayer(LottieDrawable lottieDrawable, Layer layer) {
        ef efVar = new ef(1);
        this.mattePaint = efVar;
        this.clearPaint = new ef(PorterDuff.Mode.CLEAR);
        this.rect = new RectF();
        this.canvasBounds = new RectF();
        this.maskBoundsRect = new RectF();
        this.matteBoundsRect = new RectF();
        this.tempMaskBoundsRect = new RectF();
        this.boundsMatrix = new Matrix();
        this.animations = new ArrayList();
        this.visible = true;
        this.blurMaskFilterRadius = 0.0f;
        this.lottieDrawable = lottieDrawable;
        this.layerModel = layer;
        this.drawTraceName = layer.g() + "#draw";
        if (layer.j() == Layer.MatteType.INVERT) {
            efVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            efVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        fl flVarB = layer.y().b();
        this.transform = flVarB;
        flVarB.b((BaseKeyframeAnimation.AnimationListener) this);
        if (layer.i() != null && !layer.i().isEmpty()) {
            fa faVar = new fa(layer.i());
            this.mask = faVar;
            Iterator<BaseKeyframeAnimation<gq, Path>> it = faVar.e().iterator();
            while (it.hasNext()) {
                it.next().addUpdateListener(this);
            }
            for (BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation : this.mask.a()) {
                addAnimation(baseKeyframeAnimation);
                baseKeyframeAnimation.addUpdateListener(this);
            }
        }
        setupInOutAnimations();
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (z && this.outlineMasksAndMattesPaint == null) {
            this.outlineMasksAndMattesPaint = new ef();
        }
        this.outlineMasksAndMattes = z;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        invalidateSelf();
    }

    public Layer getLayerModel() {
        return this.layerModel;
    }

    public void setMatteLayer(BaseLayer baseLayer) {
        this.matteLayer = baseLayer;
    }

    boolean hasMatteOnThisLayer() {
        return this.matteLayer != null;
    }

    public void setParentLayer(BaseLayer baseLayer) {
        this.parentLayer = baseLayer;
    }

    private void setupInOutAnimations() {
        if (!this.layerModel.f().isEmpty()) {
            fd fdVar = new fd(this.layerModel.f());
            this.inOutAnimation = fdVar;
            fdVar.setIsDiscrete();
            this.inOutAnimation.addUpdateListener(new BaseKeyframeAnimation.AnimationListener() { // from class: gu
                @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
                public final void onValueChanged() {
                    this.d.m748xf49bd987();
                }
            });
            setVisible(this.inOutAnimation.getValue().floatValue() == 1.0f);
            addAnimation(this.inOutAnimation);
            return;
        }
        setVisible(true);
    }

    /* JADX INFO: renamed from: lambda$setupInOutAnimations$0$com-airbnb-lottie-model-layer-BaseLayer, reason: not valid java name */
    public /* synthetic */ void m748xf49bd987() {
        setVisible(this.inOutAnimation.a() == 1.0f);
    }

    private void invalidateSelf() {
        this.lottieDrawable.invalidateSelf();
    }

    public void addAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (baseKeyframeAnimation == null) {
            return;
        }
        this.animations.add(baseKeyframeAnimation);
    }

    public void removeAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.animations.remove(baseKeyframeAnimation);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        buildParentLayerListIfNeeded();
        this.boundsMatrix.set(matrix);
        if (z) {
            List<BaseLayer> list = this.parentLayers;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.boundsMatrix.preConcat(this.parentLayers.get(size).transform.a());
                }
            } else {
                BaseLayer baseLayer = this.parentLayer;
                if (baseLayer != null) {
                    this.boundsMatrix.preConcat(baseLayer.transform.a());
                }
            }
        }
        this.boundsMatrix.preConcat(this.transform.a());
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer value;
        cv.c(this.drawTraceName);
        if (!this.visible || this.layerModel.u()) {
            cv.e(this.drawTraceName);
            return;
        }
        buildParentLayerListIfNeeded();
        if (cv.e()) {
            cv.c("Layer#parentMatrix");
        }
        this.matrix.reset();
        this.matrix.set(matrix);
        for (int size = this.parentLayers.size() - 1; size >= 0; size--) {
            this.matrix.preConcat(this.parentLayers.get(size).transform.a());
        }
        if (cv.e()) {
            cv.e("Layer#parentMatrix");
        }
        BaseKeyframeAnimation<?, Integer> baseKeyframeAnimationC = this.transform.c();
        int iIntValue = (int) ((((i / 255.0f) * ((baseKeyframeAnimationC == null || (value = baseKeyframeAnimationC.getValue()) == null) ? 100 : value.intValue())) / 100.0f) * 255.0f);
        if (!hasMatteOnThisLayer() && !hasMasksOnThisLayer()) {
            this.matrix.preConcat(this.transform.a());
            if (cv.e()) {
                cv.c("Layer#drawLayer");
            }
            drawLayer(canvas, this.matrix, iIntValue);
            if (cv.e()) {
                cv.e("Layer#drawLayer");
            }
            recordRenderTime(cv.e(this.drawTraceName));
            return;
        }
        if (cv.e()) {
            cv.c("Layer#computeBounds");
        }
        getBounds(this.rect, this.matrix, false);
        intersectBoundsWithMatte(this.rect, matrix);
        this.matrix.preConcat(this.transform.a());
        intersectBoundsWithMask(this.rect, this.matrix);
        this.canvasBounds.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.canvasMatrix);
        if (!this.canvasMatrix.isIdentity()) {
            Matrix matrix2 = this.canvasMatrix;
            matrix2.invert(matrix2);
            this.canvasMatrix.mapRect(this.canvasBounds);
        }
        if (!this.rect.intersect(this.canvasBounds)) {
            this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (cv.e()) {
            cv.e("Layer#computeBounds");
        }
        if (this.rect.width() >= 1.0f && this.rect.height() >= 1.0f) {
            if (cv.e()) {
                cv.c("Layer#saveLayer");
            }
            this.contentPaint.setAlpha(255);
            je.e(canvas, this.rect, this.contentPaint);
            if (cv.e()) {
                cv.e("Layer#saveLayer");
            }
            clearCanvas(canvas);
            if (cv.e()) {
                cv.c("Layer#drawLayer");
            }
            drawLayer(canvas, this.matrix, iIntValue);
            if (cv.e()) {
                cv.e("Layer#drawLayer");
            }
            if (hasMasksOnThisLayer()) {
                applyMasks(canvas, this.matrix);
            }
            if (hasMatteOnThisLayer()) {
                if (cv.e()) {
                    cv.c("Layer#drawMatte");
                    cv.c("Layer#saveLayer");
                }
                je.c(canvas, this.rect, this.mattePaint, 19);
                if (cv.e()) {
                    cv.e("Layer#saveLayer");
                }
                clearCanvas(canvas);
                this.matteLayer.draw(canvas, matrix, iIntValue);
                if (cv.e()) {
                    cv.c("Layer#restoreLayer");
                }
                canvas.restore();
                if (cv.e()) {
                    cv.e("Layer#restoreLayer");
                    cv.e("Layer#drawMatte");
                }
            }
            if (cv.e()) {
                cv.c("Layer#restoreLayer");
            }
            canvas.restore();
            if (cv.e()) {
                cv.e("Layer#restoreLayer");
            }
        }
        if (this.outlineMasksAndMattes && (paint = this.outlineMasksAndMattesPaint) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.outlineMasksAndMattesPaint.setColor(-251901);
            this.outlineMasksAndMattesPaint.setStrokeWidth(4.0f);
            canvas.drawRect(this.rect, this.outlineMasksAndMattesPaint);
            this.outlineMasksAndMattesPaint.setStyle(Paint.Style.FILL);
            this.outlineMasksAndMattesPaint.setColor(1357638635);
            canvas.drawRect(this.rect, this.outlineMasksAndMattesPaint);
        }
        recordRenderTime(cv.e(this.drawTraceName));
    }

    private void recordRenderTime(float f) {
        this.lottieDrawable.j().o().c(this.layerModel.g(), f);
    }

    private void clearCanvas(Canvas canvas) {
        if (cv.e()) {
            cv.c("Layer#clearLayer");
        }
        canvas.drawRect(this.rect.left - 1.0f, this.rect.top - 1.0f, this.rect.right + 1.0f, this.rect.bottom + 1.0f, this.clearPaint);
        if (cv.e()) {
            cv.e("Layer#clearLayer");
        }
    }

    private void intersectBoundsWithMask(RectF rectF, Matrix matrix) {
        this.maskBoundsRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (hasMasksOnThisLayer()) {
            int size = this.mask.b().size();
            for (int i = 0; i < size; i++) {
                Mask mask = this.mask.b().get(i);
                Path value = this.mask.e().get(i).getValue();
                if (value != null) {
                    this.path.set(value);
                    this.path.transform(matrix);
                    int i2 = AnonymousClass5.d[mask.b().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && mask.d()) {
                        return;
                    }
                    this.path.computeBounds(this.tempMaskBoundsRect, false);
                    if (i == 0) {
                        this.maskBoundsRect.set(this.tempMaskBoundsRect);
                    } else {
                        RectF rectF2 = this.maskBoundsRect;
                        rectF2.set(Math.min(rectF2.left, this.tempMaskBoundsRect.left), Math.min(this.maskBoundsRect.top, this.tempMaskBoundsRect.top), Math.max(this.maskBoundsRect.right, this.tempMaskBoundsRect.right), Math.max(this.maskBoundsRect.bottom, this.tempMaskBoundsRect.bottom));
                    }
                }
            }
            if (rectF.intersect(this.maskBoundsRect)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.BaseLayer$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f1948b;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            d = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f1948b = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1948b[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1948b[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1948b[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1948b[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1948b[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1948b[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void intersectBoundsWithMatte(RectF rectF, Matrix matrix) {
        if (hasMatteOnThisLayer() && this.layerModel.j() != Layer.MatteType.INVERT) {
            this.matteBoundsRect.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.matteLayer.getBounds(this.matteBoundsRect, matrix, true);
            if (rectF.intersect(this.matteBoundsRect)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void applyMasks(Canvas canvas, Matrix matrix) {
        if (cv.e()) {
            cv.c("Layer#saveLayer");
        }
        je.c(canvas, this.rect, this.dstInPaint, 19);
        if (Build.VERSION.SDK_INT < 28) {
            clearCanvas(canvas);
        }
        if (cv.e()) {
            cv.e("Layer#saveLayer");
        }
        for (int i = 0; i < this.mask.b().size(); i++) {
            Mask mask = this.mask.b().get(i);
            BaseKeyframeAnimation<gq, Path> baseKeyframeAnimation = this.mask.e().get(i);
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.mask.a().get(i);
            int i2 = AnonymousClass5.d[mask.b().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.contentPaint.setColor(-16777216);
                        this.contentPaint.setAlpha(255);
                        canvas.drawRect(this.rect, this.contentPaint);
                    }
                    if (mask.d()) {
                        applyInvertedSubtractMask(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                    } else {
                        applySubtractMask(canvas, matrix, baseKeyframeAnimation);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mask.d()) {
                            applyInvertedAddMask(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                        } else {
                            applyAddMask(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                        }
                    }
                } else if (mask.d()) {
                    applyInvertedIntersectMask(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                } else {
                    applyIntersectMask(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                }
            } else if (areAllMasksNone()) {
                this.contentPaint.setAlpha(255);
                canvas.drawRect(this.rect, this.contentPaint);
            }
        }
        if (cv.e()) {
            cv.c("Layer#restoreLayer");
        }
        canvas.restore();
        if (cv.e()) {
            cv.e("Layer#restoreLayer");
        }
    }

    private boolean areAllMasksNone() {
        if (this.mask.e().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.mask.b().size(); i++) {
            if (this.mask.b().get(i).b() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void applyAddMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<gq, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        this.contentPaint.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.path, this.contentPaint);
    }

    private void applyInvertedAddMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<gq, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        je.e(canvas, this.rect, this.contentPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        this.contentPaint.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    private void applySubtractMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<gq, Path> baseKeyframeAnimation) {
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        canvas.drawPath(this.path, this.dstOutPaint);
    }

    private void applyInvertedSubtractMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<gq, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        je.e(canvas, this.rect, this.dstOutPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.dstOutPaint.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    private void applyIntersectMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<gq, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        je.e(canvas, this.rect, this.dstInPaint);
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        this.contentPaint.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.path, this.contentPaint);
        canvas.restore();
    }

    private void applyInvertedIntersectMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<gq, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        je.e(canvas, this.rect, this.dstInPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.dstOutPaint.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    boolean hasMasksOnThisLayer() {
        fa faVar = this.mask;
        return (faVar == null || faVar.e().isEmpty()) ? false : true;
    }

    private void setVisible(boolean z) {
        if (z != this.visible) {
            this.visible = z;
            invalidateSelf();
        }
    }

    public void setProgress(float f) {
        if (cv.e()) {
            cv.c("BaseLayer#setProgress");
            cv.c("BaseLayer#setProgress.transform");
        }
        this.transform.b(f);
        if (cv.e()) {
            cv.e("BaseLayer#setProgress.transform");
        }
        if (this.mask != null) {
            if (cv.e()) {
                cv.c("BaseLayer#setProgress.mask");
            }
            for (int i = 0; i < this.mask.e().size(); i++) {
                this.mask.e().get(i).setProgress(f);
            }
            if (cv.e()) {
                cv.e("BaseLayer#setProgress.mask");
            }
        }
        if (this.inOutAnimation != null) {
            if (cv.e()) {
                cv.c("BaseLayer#setProgress.inout");
            }
            this.inOutAnimation.setProgress(f);
            if (cv.e()) {
                cv.e("BaseLayer#setProgress.inout");
            }
        }
        if (this.matteLayer != null) {
            if (cv.e()) {
                cv.c("BaseLayer#setProgress.matte");
            }
            this.matteLayer.setProgress(f);
            if (cv.e()) {
                cv.e("BaseLayer#setProgress.matte");
            }
        }
        if (cv.e()) {
            cv.c("BaseLayer#setProgress.animations." + this.animations.size());
        }
        for (int i2 = 0; i2 < this.animations.size(); i2++) {
            this.animations.get(i2).setProgress(f);
        }
        if (cv.e()) {
            cv.e("BaseLayer#setProgress.animations." + this.animations.size());
            cv.e("BaseLayer#setProgress");
        }
    }

    private void buildParentLayerListIfNeeded() {
        if (this.parentLayers != null) {
            return;
        }
        if (this.parentLayer == null) {
            this.parentLayers = Collections.EMPTY_LIST;
            return;
        }
        this.parentLayers = new ArrayList();
        for (BaseLayer baseLayer = this.parentLayer; baseLayer != null; baseLayer = baseLayer.parentLayer) {
            this.parentLayers.add(baseLayer);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.layerModel.g();
    }

    public ge getBlurEffect() {
        return this.layerModel.a();
    }

    public LBlendMode getBlendMode() {
        return this.layerModel.e();
    }

    public BlurMaskFilter getBlurMaskFilter(float f) {
        if (this.blurMaskFilterRadius == f) {
            return this.blurMaskFilter;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.blurMaskFilter = blurMaskFilter;
        this.blurMaskFilterRadius = f;
        return blurMaskFilter;
    }

    public ho getDropShadowEffect() {
        return this.layerModel.c();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        BaseLayer baseLayer = this.matteLayer;
        if (baseLayer != null) {
            fo foVarC = foVar2.c(baseLayer.getName());
            if (foVar.e(this.matteLayer.getName(), i)) {
                list.add(foVarC.e(this.matteLayer));
            }
            if (foVar.c(getName(), i)) {
                this.matteLayer.resolveChildKeyPath(foVar, foVar.a(this.matteLayer.getName(), i) + i, list, foVarC);
            }
        }
        if (foVar.b(getName(), i)) {
            if (!"__container".equals(getName())) {
                foVar2 = foVar2.c(getName());
                if (foVar.e(getName(), i)) {
                    list.add(foVar2.e(this));
                }
            }
            if (foVar.c(getName(), i)) {
                resolveChildKeyPath(foVar, i + foVar.a(getName(), i), list, foVar2);
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        this.transform.d(t, jfVar);
    }
}
