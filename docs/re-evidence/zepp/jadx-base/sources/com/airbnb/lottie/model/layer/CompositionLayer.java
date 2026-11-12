package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CompositionLayer extends BaseLayer {

    @Nullable
    private BaseKeyframeAnimation<Float, Float> F;
    private final List<BaseLayer> G;
    private final RectF H;
    private final RectF I;
    private final Paint J;

    @Nullable
    private Boolean K;

    @Nullable
    private Boolean L;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CompositionLayer(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, LottieComposition lottieComposition) {
        int i;
        BaseLayer baseLayer;
        super(lottieDrawable, layer);
        this.G = new ArrayList();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new Paint();
        AnimatableFloatValue animatableFloatValueQ = layer.q();
        if (animatableFloatValueQ != null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = animatableFloatValueQ.createAnimation();
            this.F = baseKeyframeAnimationCreateAnimation;
            addAnimation(baseKeyframeAnimationCreateAnimation);
            this.F.addUpdateListener(this);
        } else {
            this.F = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(lottieComposition.getLayers().size());
        int size = list.size() - 1;
        BaseLayer baseLayer2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            BaseLayer baseLayerM = BaseLayer.m(this, layer2, lottieDrawable, lottieComposition);
            if (baseLayerM != null) {
                longSparseArray.put(baseLayerM.n().getId(), baseLayerM);
                if (baseLayer2 != null) {
                    baseLayer2.u(baseLayerM);
                    baseLayer2 = null;
                } else {
                    this.G.add(0, baseLayerM);
                    int i2 = a.a[layer2.d().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        baseLayer2 = baseLayerM;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            BaseLayer baseLayer3 = (BaseLayer) longSparseArray.get(longSparseArray.keyAt(i));
            if (baseLayer3 != null && (baseLayer = (BaseLayer) longSparseArray.get(baseLayer3.n().f())) != null) {
                baseLayer3.v(baseLayer);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.TIME_REMAP) {
            if (lottieValueCallback == null) {
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.F;
                if (baseKeyframeAnimation != null) {
                    baseKeyframeAnimation.setValueCallback(null);
                    return;
                }
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.F = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.F);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        L.beginSection("CompositionLayer#draw");
        this.I.set(0.0f, 0.0f, this.o.h(), this.o.g());
        matrix.mapRect(this.I);
        boolean z = this.n.isApplyingOpacityToLayersEnabled() && this.G.size() > 1 && i != 255;
        if (z) {
            this.J.setAlpha(i);
            Utils.saveLayerCompat(canvas, this.I, this.J);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.G.size() - 1; size >= 0; size--) {
            if (!this.I.isEmpty() ? canvas.clipRect(this.I) : true) {
                this.G.get(size).draw(canvas, matrix, i);
            }
        }
        canvas.restore();
        L.endSection("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        for (int size = this.G.size() - 1; size >= 0; size--) {
            this.H.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.G.get(size).getBounds(this.H, this.m, true);
            rectF.union(this.H);
        }
    }

    public boolean hasMasks() {
        if (this.L == null) {
            for (int size = this.G.size() - 1; size >= 0; size--) {
                BaseLayer baseLayer = this.G.get(size);
                if (baseLayer instanceof ShapeLayer) {
                    if (baseLayer.o()) {
                        this.L = Boolean.TRUE;
                        return true;
                    }
                } else if ((baseLayer instanceof CompositionLayer) && ((CompositionLayer) baseLayer).hasMasks()) {
                    this.L = Boolean.TRUE;
                    return true;
                }
            }
            this.L = Boolean.FALSE;
        }
        return this.L.booleanValue();
    }

    public boolean hasMatte() {
        if (this.K == null) {
            if (p()) {
                this.K = Boolean.TRUE;
                return true;
            }
            for (int size = this.G.size() - 1; size >= 0; size--) {
                if (this.G.get(size).p()) {
                    this.K = Boolean.TRUE;
                    return true;
                }
            }
            this.K = Boolean.FALSE;
        }
        return this.K.booleanValue();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void resolveChildKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        for (int i2 = 0; i2 < this.G.size(); i2++) {
            this.G.get(i2).resolveKeyPath(keyPath, i, list, keyPath2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setOutlineMasksAndMattes(boolean z) {
        super.setOutlineMasksAndMattes(z);
        Iterator<BaseLayer> it2 = this.G.iterator();
        while (it2.hasNext()) {
            it2.next().setOutlineMasksAndMattes(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        super.setProgress(f);
        if (this.F != null) {
            f = ((this.F.getValue().floatValue() * this.o.a().getFrameRate()) - this.o.a().getStartFrame()) / (this.n.getComposition().getDurationFrames() + 0.01f);
        }
        if (this.F == null) {
            f -= this.o.n();
        }
        if (this.o.r() != 0.0f && !"__container".equals(this.o.e())) {
            f /= this.o.r();
        }
        for (int size = this.G.size() - 1; size >= 0; size--) {
            this.G.get(size).setProgress(f);
        }
    }
}
