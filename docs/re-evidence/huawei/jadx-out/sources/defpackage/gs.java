package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class gs extends BaseLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f35965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f35966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f35967c;
    private boolean d;
    private final List<BaseLayer> e;
    private BaseKeyframeAnimation<Float, Float> g;
    private final RectF i;

    public gs(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, cx cxVar) {
        int i;
        BaseLayer baseLayer;
        super(lottieDrawable, layer);
        this.e = new ArrayList();
        this.i = new RectF();
        this.f35965a = new RectF();
        this.f35966b = new Paint();
        this.d = true;
        fu fuVarV = layer.v();
        if (fuVarV != null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = fuVarV.createAnimation();
            this.g = baseKeyframeAnimationCreateAnimation;
            addAnimation(baseKeyframeAnimationCreateAnimation);
            this.g.addUpdateListener(this);
        } else {
            this.g = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(cxVar.j().size());
        int size = list.size() - 1;
        BaseLayer baseLayer2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            BaseLayer baseLayerForModel = BaseLayer.forModel(this, layer2, lottieDrawable, cxVar);
            if (baseLayerForModel != null) {
                longSparseArray.put(baseLayerForModel.getLayerModel().d(), baseLayerForModel);
                if (baseLayer2 != null) {
                    baseLayer2.setMatteLayer(baseLayerForModel);
                    baseLayer2 = null;
                } else {
                    this.e.add(0, baseLayerForModel);
                    int i2 = AnonymousClass4.f35968b[layer2.j().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        baseLayer2 = baseLayerForModel;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            BaseLayer baseLayer3 = (BaseLayer) longSparseArray.get(longSparseArray.keyAt(i));
            if (baseLayer3 != null && (baseLayer = (BaseLayer) longSparseArray.get(baseLayer3.getLayerModel().o())) != null) {
                baseLayer3.setParentLayer(baseLayer);
            }
        }
    }

    /* JADX INFO: renamed from: gs$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f35968b;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f35968b = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35968b[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void b(boolean z) {
        this.d = z;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setOutlineMasksAndMattes(boolean z) {
        super.setOutlineMasksAndMattes(z);
        Iterator<BaseLayer> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().setOutlineMasksAndMattes(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        if (cv.e()) {
            cv.c("CompositionLayer#draw");
        }
        this.f35965a.set(0.0f, 0.0f, this.layerModel.n(), this.layerModel.m());
        matrix.mapRect(this.f35965a);
        boolean z = this.lottieDrawable.v() && this.e.size() > 1 && i != 255;
        if (z) {
            this.f35966b.setAlpha(i);
            je.e(canvas, this.f35965a, this.f35966b);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if ((!this.d && "__container".equals(this.layerModel.g())) || this.f35965a.isEmpty() || canvas.clipRect(this.f35965a)) {
                this.e.get(size).draw(canvas, matrix, i);
            }
        }
        canvas.restore();
        if (cv.e()) {
            cv.e("CompositionLayer#draw");
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.e.get(size).getBounds(this.i, this.boundsMatrix, true);
            rectF.union(this.i);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setProgress(float f) {
        if (cv.e()) {
            cv.c("CompositionLayer#setProgress");
        }
        this.f35967c = f;
        super.setProgress(f);
        if (this.g != null) {
            f = ((this.g.getValue().floatValue() * this.layerModel.b().f()) - this.layerModel.b().l()) / (this.lottieDrawable.j().d() + 0.01f);
        }
        if (this.g == null) {
            f -= this.layerModel.r();
        }
        if (this.layerModel.x() != 0.0f && !"__container".equals(this.layerModel.g())) {
            f /= this.layerModel.x();
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            this.e.get(size).setProgress(f);
        }
        if (cv.e()) {
            cv.e("CompositionLayer#setProgress");
        }
    }

    public float e() {
        return this.f35967c;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void resolveChildKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            this.e.get(i2).resolveKeyPath(foVar, i, list, foVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        super.addValueCallback(t, jfVar);
        if (t == LottieProperty.TIME_REMAP) {
            if (jfVar == null) {
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.g;
                if (baseKeyframeAnimation != null) {
                    baseKeyframeAnimation.setValueCallback(null);
                    return;
                }
                return;
            }
            fm fmVar = new fm(jfVar);
            this.g = fmVar;
            fmVar.addUpdateListener(this);
            addAnimation(this.g);
        }
    }
}
