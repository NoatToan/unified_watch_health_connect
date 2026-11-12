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
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {
    private static final int B = 2;
    private static final int C = 16;
    private static final int D = 1;
    private static final int E = 19;

    @Nullable
    public BlurMaskFilter A;
    private final Path a = new Path();
    private final Matrix b = new Matrix();
    private final Paint c = new LPaint(1);
    private final Paint d = new LPaint(1, PorterDuff.Mode.DST_IN);
    private final Paint e = new LPaint(1, PorterDuff.Mode.DST_OUT);
    private final Paint f;
    private final Paint g;
    private final RectF h;
    private final RectF i;
    private final RectF j;
    private final RectF k;
    private final String l;
    public final Matrix m;
    public final LottieDrawable n;
    public final Layer o;

    @Nullable
    private MaskKeyframeAnimation p;

    @Nullable
    private FloatKeyframeAnimation q;

    @Nullable
    private BaseLayer r;

    @Nullable
    private BaseLayer s;
    private List<BaseLayer> t;
    private final List<BaseKeyframeAnimation<?, ?>> u;
    public final TransformKeyframeAnimation v;
    private boolean w;
    private boolean x;

    @Nullable
    private Paint y;
    public float z;

    public class a implements BaseKeyframeAnimation.AnimationListener {
        public a() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
        public void onValueChanged() {
            BaseLayer baseLayer = BaseLayer.this;
            baseLayer.w(baseLayer.q.getFloatValue() == 1.0f);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public BaseLayer(LottieDrawable lottieDrawable, Layer layer) {
        LPaint lPaint = new LPaint(1);
        this.f = lPaint;
        this.g = new LPaint(PorterDuff.Mode.CLEAR);
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.m = new Matrix();
        this.u = new ArrayList();
        this.w = true;
        this.z = 0.0f;
        this.n = lottieDrawable;
        this.o = layer;
        this.l = layer.e() + "#draw";
        if (layer.d() == Layer.MatteType.INVERT) {
            lPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            lPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        TransformKeyframeAnimation transformKeyframeAnimationCreateAnimation = layer.s().createAnimation();
        this.v = transformKeyframeAnimationCreateAnimation;
        transformKeyframeAnimationCreateAnimation.addListener(this);
        if (layer.c() != null && !layer.c().isEmpty()) {
            MaskKeyframeAnimation maskKeyframeAnimation = new MaskKeyframeAnimation(layer.c());
            this.p = maskKeyframeAnimation;
            Iterator<BaseKeyframeAnimation<ShapeData, Path>> it2 = maskKeyframeAnimation.getMaskAnimations().iterator();
            while (it2.hasNext()) {
                it2.next().addUpdateListener(this);
            }
            for (BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation : this.p.getOpacityAnimations()) {
                addAnimation(baseKeyframeAnimation);
                baseKeyframeAnimation.addUpdateListener(this);
            }
        }
        x();
    }

    private void c(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        this.a.set(baseKeyframeAnimation.getValue());
        this.a.transform(matrix);
        this.c.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.a, this.c);
    }

    private void d(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.h, this.d);
        this.a.set(baseKeyframeAnimation.getValue());
        this.a.transform(matrix);
        this.c.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.a, this.c);
        canvas.restore();
    }

    private void e(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.h, this.c);
        canvas.drawRect(this.h, this.c);
        this.a.set(baseKeyframeAnimation.getValue());
        this.a.transform(matrix);
        this.c.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void f(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.h, this.d);
        canvas.drawRect(this.h, this.c);
        this.e.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        this.a.set(baseKeyframeAnimation.getValue());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void g(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.h, this.e);
        canvas.drawRect(this.h, this.c);
        this.e.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        this.a.set(baseKeyframeAnimation.getValue());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void h(Canvas canvas, Matrix matrix) {
        L.beginSection("Layer#saveLayer");
        Utils.saveLayerCompat(canvas, this.h, this.d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            l(canvas);
        }
        L.endSection("Layer#saveLayer");
        for (int i = 0; i < this.p.getMasks().size(); i++) {
            Mask mask = this.p.getMasks().get(i);
            BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation = this.p.getMaskAnimations().get(i);
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.p.getOpacityAnimations().get(i);
            int i2 = b.b[mask.getMaskMode().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.c.setColor(-16777216);
                        this.c.setAlpha(255);
                        canvas.drawRect(this.h, this.c);
                    }
                    if (mask.isInverted()) {
                        g(canvas, matrix, mask, baseKeyframeAnimation, baseKeyframeAnimation2);
                    } else {
                        i(canvas, matrix, mask, baseKeyframeAnimation, baseKeyframeAnimation2);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mask.isInverted()) {
                            e(canvas, matrix, mask, baseKeyframeAnimation, baseKeyframeAnimation2);
                        } else {
                            c(canvas, matrix, mask, baseKeyframeAnimation, baseKeyframeAnimation2);
                        }
                    }
                } else if (mask.isInverted()) {
                    f(canvas, matrix, mask, baseKeyframeAnimation, baseKeyframeAnimation2);
                } else {
                    d(canvas, matrix, mask, baseKeyframeAnimation, baseKeyframeAnimation2);
                }
            } else if (j()) {
                this.c.setAlpha(255);
                canvas.drawRect(this.h, this.c);
            }
        }
        L.beginSection("Layer#restoreLayer");
        canvas.restore();
        L.endSection("Layer#restoreLayer");
    }

    private void i(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        this.a.set(baseKeyframeAnimation.getValue());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
    }

    private boolean j() {
        if (this.p.getMaskAnimations().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.p.getMasks().size(); i++) {
            if (this.p.getMasks().get(i).getMaskMode() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void k() {
        if (this.t != null) {
            return;
        }
        if (this.s == null) {
            this.t = Collections.emptyList();
            return;
        }
        this.t = new ArrayList();
        for (BaseLayer baseLayer = this.s; baseLayer != null; baseLayer = baseLayer.s) {
            this.t.add(baseLayer);
        }
    }

    private void l(Canvas canvas) {
        L.beginSection("Layer#clearLayer");
        RectF rectF = this.h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.g);
        L.endSection("Layer#clearLayer");
    }

    @Nullable
    public static BaseLayer m(CompositionLayer compositionLayer, Layer layer, LottieDrawable lottieDrawable, LottieComposition lottieComposition) {
        switch (b.a[layer.getLayerType().ordinal()]) {
            case 1:
                return new ShapeLayer(lottieDrawable, layer, compositionLayer);
            case 2:
                return new CompositionLayer(lottieDrawable, layer, lottieComposition.getPrecomps(layer.i()), lottieComposition);
            case 3:
                return new SolidLayer(lottieDrawable, layer);
            case 4:
                return new ImageLayer(lottieDrawable, layer);
            case 5:
                return new NullLayer(lottieDrawable, layer);
            case 6:
                return new TextLayer(lottieDrawable, layer);
            default:
                Logger.warning("Unknown layer type " + layer.getLayerType());
                return null;
        }
    }

    private void q(RectF rectF, Matrix matrix) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (o()) {
            int size = this.p.getMasks().size();
            for (int i = 0; i < size; i++) {
                Mask mask = this.p.getMasks().get(i);
                this.a.set(this.p.getMaskAnimations().get(i).getValue());
                this.a.transform(matrix);
                int i2 = b.b[mask.getMaskMode().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return;
                }
                if ((i2 == 3 || i2 == 4) && mask.isInverted()) {
                    return;
                }
                this.a.computeBounds(this.k, false);
                if (i == 0) {
                    this.i.set(this.k);
                } else {
                    RectF rectF2 = this.i;
                    rectF2.set(Math.min(rectF2.left, this.k.left), Math.min(this.i.top, this.k.top), Math.max(this.i.right, this.k.right), Math.max(this.i.bottom, this.k.bottom));
                }
            }
            if (rectF.intersect(this.i)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void r(RectF rectF, Matrix matrix) {
        if (p() && this.o.d() != Layer.MatteType.INVERT) {
            this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.r.getBounds(this.j, matrix, true);
            if (rectF.intersect(this.j)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void s() {
        this.n.invalidateSelf();
    }

    private void t(float f) {
        this.n.getComposition().getPerformanceTracker().recordRenderTime(this.o.e(), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z) {
        if (z != this.w) {
            this.w = z;
            s();
        }
    }

    private void x() {
        if (this.o.b().isEmpty()) {
            w(true);
            return;
        }
        FloatKeyframeAnimation floatKeyframeAnimation = new FloatKeyframeAnimation(this.o.b());
        this.q = floatKeyframeAnimation;
        floatKeyframeAnimation.setIsDiscrete();
        this.q.addUpdateListener(new a());
        w(this.q.getValue().floatValue() == 1.0f);
        addAnimation(this.q);
    }

    public void addAnimation(@Nullable BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (baseKeyframeAnimation == null) {
            return;
        }
        this.u.add(baseKeyframeAnimation);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    @CallSuper
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        this.v.applyValueCallback(t, lottieValueCallback);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        L.beginSection(this.l);
        if (!this.w || this.o.isHidden()) {
            L.endSection(this.l);
            return;
        }
        k();
        L.beginSection("Layer#parentMatrix");
        this.b.reset();
        this.b.set(matrix);
        for (int size = this.t.size() - 1; size >= 0; size--) {
            this.b.preConcat(this.t.get(size).v.getMatrix());
        }
        L.endSection("Layer#parentMatrix");
        int iIntValue = (int) ((((i / 255.0f) * (this.v.getOpacity() == null ? 100 : this.v.getOpacity().getValue().intValue())) / 100.0f) * 255.0f);
        if (!p() && !o()) {
            this.b.preConcat(this.v.getMatrix());
            L.beginSection("Layer#drawLayer");
            drawLayer(canvas, this.b, iIntValue);
            L.endSection("Layer#drawLayer");
            t(L.endSection(this.l));
            return;
        }
        L.beginSection("Layer#computeBounds");
        getBounds(this.h, this.b, false);
        r(this.h, matrix);
        this.b.preConcat(this.v.getMatrix());
        q(this.h, this.b);
        if (!this.h.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
            this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        L.endSection("Layer#computeBounds");
        if (this.h.width() >= 1.0f && this.h.height() >= 1.0f) {
            L.beginSection("Layer#saveLayer");
            this.c.setAlpha(255);
            Utils.saveLayerCompat(canvas, this.h, this.c);
            L.endSection("Layer#saveLayer");
            l(canvas);
            L.beginSection("Layer#drawLayer");
            drawLayer(canvas, this.b, iIntValue);
            L.endSection("Layer#drawLayer");
            if (o()) {
                h(canvas, this.b);
            }
            if (p()) {
                L.beginSection("Layer#drawMatte");
                L.beginSection("Layer#saveLayer");
                Utils.saveLayerCompat(canvas, this.h, this.f, 19);
                L.endSection("Layer#saveLayer");
                l(canvas);
                this.r.draw(canvas, matrix, iIntValue);
                L.beginSection("Layer#restoreLayer");
                canvas.restore();
                L.endSection("Layer#restoreLayer");
                L.endSection("Layer#drawMatte");
            }
            L.beginSection("Layer#restoreLayer");
            canvas.restore();
            L.endSection("Layer#restoreLayer");
        }
        if (this.x && (paint = this.y) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.y.setColor(-251901);
            this.y.setStrokeWidth(4.0f);
            canvas.drawRect(this.h, this.y);
            this.y.setStyle(Paint.Style.FILL);
            this.y.setColor(1357638635);
            canvas.drawRect(this.h, this.y);
        }
        t(L.endSection(this.l));
    }

    public abstract void drawLayer(Canvas canvas, Matrix matrix, int i);

    @Nullable
    public BlurEffect getBlurEffect() {
        return this.o.getBlurEffect();
    }

    public BlurMaskFilter getBlurMaskFilter(float f) {
        if (this.z == f) {
            return this.A;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.A = blurMaskFilter;
        this.z = f;
        return blurMaskFilter;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    @CallSuper
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        k();
        this.m.set(matrix);
        if (z) {
            List<BaseLayer> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.m.preConcat(this.t.get(size).v.getMatrix());
                }
            } else {
                BaseLayer baseLayer = this.s;
                if (baseLayer != null) {
                    this.m.preConcat(baseLayer.v.getMatrix());
                }
            }
        }
        this.m.preConcat(this.v.getMatrix());
    }

    @Nullable
    public DropShadowEffect getDropShadowEffect() {
        return this.o.getDropShadowEffect();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.o.e();
    }

    public Layer n() {
        return this.o;
    }

    public boolean o() {
        MaskKeyframeAnimation maskKeyframeAnimation = this.p;
        return (maskKeyframeAnimation == null || maskKeyframeAnimation.getMaskAnimations().isEmpty()) ? false : true;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        s();
    }

    public boolean p() {
        return this.r != null;
    }

    public void removeAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.u.remove(baseKeyframeAnimation);
    }

    public void resolveChildKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        BaseLayer baseLayer = this.r;
        if (baseLayer != null) {
            KeyPath keyPathAddKey = keyPath2.addKey(baseLayer.getName());
            if (keyPath.fullyResolvesTo(this.r.getName(), i)) {
                list.add(keyPathAddKey.resolve(this.r));
            }
            if (keyPath.propagateToChildren(getName(), i)) {
                this.r.resolveChildKeyPath(keyPath, keyPath.incrementDepthBy(this.r.getName(), i) + i, list, keyPathAddKey);
            }
        }
        if (keyPath.matches(getName(), i)) {
            if (!"__container".equals(getName())) {
                keyPath2 = keyPath2.addKey(getName());
                if (keyPath.fullyResolvesTo(getName(), i)) {
                    list.add(keyPath2.resolve(this));
                }
            }
            if (keyPath.propagateToChildren(getName(), i)) {
                resolveChildKeyPath(keyPath, i + keyPath.incrementDepthBy(getName(), i), list, keyPath2);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (z && this.y == null) {
            this.y = new LPaint();
        }
        this.x = z;
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.v.setProgress(f);
        if (this.p != null) {
            for (int i = 0; i < this.p.getMaskAnimations().size(); i++) {
                this.p.getMaskAnimations().get(i).setProgress(f);
            }
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.q;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.setProgress(f);
        }
        BaseLayer baseLayer = this.r;
        if (baseLayer != null) {
            baseLayer.setProgress(f);
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            this.u.get(i2).setProgress(f);
        }
    }

    public void u(@Nullable BaseLayer baseLayer) {
        this.r = baseLayer;
    }

    public void v(@Nullable BaseLayer baseLayer) {
        this.s = baseLayer;
    }
}
