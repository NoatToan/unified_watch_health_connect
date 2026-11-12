package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import defpackage.cv;
import defpackage.ef;
import defpackage.eu;
import defpackage.ev;
import defpackage.fb;
import defpackage.fd;
import defpackage.fm;
import defpackage.fo;
import defpackage.fu;
import defpackage.gb;
import defpackage.jc;
import defpackage.je;
import defpackage.jf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseStrokeContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, DrawingContent {
    private BaseKeyframeAnimation<Float, Float> blurAnimation;
    float blurMaskFilterRadius;
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> colorFilterAnimation;
    private final List<BaseKeyframeAnimation<?, Float>> dashPatternAnimations;
    private final BaseKeyframeAnimation<?, Float> dashPatternOffsetAnimation;
    private final float[] dashPatternValues;
    private eu dropShadowAnimation;
    protected final BaseLayer layer;
    private final LottieDrawable lottieDrawable;
    private final BaseKeyframeAnimation<?, Integer> opacityAnimation;
    protected final Paint paint;
    private final BaseKeyframeAnimation<?, Float> widthAnimation;
    private final PathMeasure pm = new PathMeasure();
    private final Path path = new Path();
    private final Path trimPathPath = new Path();
    private final RectF rect = new RectF();
    private final List<b> pathGroups = new ArrayList();

    public BaseStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Paint.Cap cap, Paint.Join join, float f, gb gbVar, fu fuVar, List<fu> list, fu fuVar2) {
        ef efVar = new ef(1);
        this.paint = efVar;
        this.blurMaskFilterRadius = 0.0f;
        this.lottieDrawable = lottieDrawable;
        this.layer = baseLayer;
        efVar.setStyle(Paint.Style.STROKE);
        efVar.setStrokeCap(cap);
        efVar.setStrokeJoin(join);
        efVar.setStrokeMiter(f);
        this.opacityAnimation = gbVar.createAnimation();
        this.widthAnimation = fuVar.createAnimation();
        if (fuVar2 == null) {
            this.dashPatternOffsetAnimation = null;
        } else {
            this.dashPatternOffsetAnimation = fuVar2.createAnimation();
        }
        this.dashPatternAnimations = new ArrayList(list.size());
        this.dashPatternValues = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.dashPatternAnimations.add(list.get(i).createAnimation());
        }
        baseLayer.addAnimation(this.opacityAnimation);
        baseLayer.addAnimation(this.widthAnimation);
        for (int i2 = 0; i2 < this.dashPatternAnimations.size(); i2++) {
            baseLayer.addAnimation(this.dashPatternAnimations.get(i2));
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.dashPatternOffsetAnimation;
        if (baseKeyframeAnimation != null) {
            baseLayer.addAnimation(baseKeyframeAnimation);
        }
        this.opacityAnimation.addUpdateListener(this);
        this.widthAnimation.addUpdateListener(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.dashPatternAnimations.get(i3).addUpdateListener(this);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.dashPatternOffsetAnimation;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(this);
        }
        if (baseLayer.getBlurEffect() != null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = baseLayer.getBlurEffect().b().createAnimation();
            this.blurAnimation = baseKeyframeAnimationCreateAnimation;
            baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.blurAnimation);
        }
        if (baseLayer.getDropShadowEffect() != null) {
            this.dropShadowAnimation = new eu(this, baseLayer, baseLayer.getDropShadowEffect());
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        ev evVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = list.get(size);
            if (content instanceof ev) {
                ev evVar2 = (ev) content;
                if (evVar2.e() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    evVar = evVar2;
                }
            }
        }
        if (evVar != null) {
            evVar.b(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            Content content2 = list2.get(size2);
            if (content2 instanceof ev) {
                ev evVar3 = (ev) content2;
                if (evVar3.e() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.pathGroups.add(bVar);
                    }
                    bVar = new b(evVar3);
                    evVar3.b(this);
                } else if (!(content2 instanceof PathContent)) {
                    if (bVar == null) {
                        bVar = new b(evVar);
                    }
                    bVar.f1923a.add((PathContent) content2);
                }
            } else if (!(content2 instanceof PathContent)) {
                if (bVar == null) {
                    bVar = new b(evVar);
                }
                bVar.f1923a.add((PathContent) content2);
            }
        }
        if (bVar != null) {
            this.pathGroups.add(bVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (cv.e()) {
            cv.c("StrokeContent#draw");
        }
        if (je.d(matrix)) {
            if (cv.e()) {
                cv.e("StrokeContent#draw");
                return;
            }
            return;
        }
        this.paint.setAlpha(jc.b((int) ((((i / 255.0f) * ((fb) this.opacityAnimation).e()) / 100.0f) * 255.0f), 0, 255));
        this.paint.setStrokeWidth(((fd) this.widthAnimation).a() * je.b(matrix));
        if (this.paint.getStrokeWidth() <= 0.0f) {
            if (cv.e()) {
                cv.e("StrokeContent#draw");
                return;
            }
            return;
        }
        applyDashPatternIfNeeded(matrix);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
        if (baseKeyframeAnimation != null) {
            this.paint.setColorFilter(baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.blurAnimation;
        if (baseKeyframeAnimation2 != null) {
            float fFloatValue = baseKeyframeAnimation2.getValue().floatValue();
            if (fFloatValue == 0.0f) {
                this.paint.setMaskFilter(null);
            } else if (fFloatValue != this.blurMaskFilterRadius) {
                this.paint.setMaskFilter(this.layer.getBlurMaskFilter(fFloatValue));
            }
            this.blurMaskFilterRadius = fFloatValue;
        }
        eu euVar = this.dropShadowAnimation;
        if (euVar != null) {
            euVar.d(this.paint);
        }
        for (int i2 = 0; i2 < this.pathGroups.size(); i2++) {
            b bVar = this.pathGroups.get(i2);
            if (bVar.f1924b != null) {
                applyTrimPath(canvas, bVar, matrix);
            } else {
                if (cv.e()) {
                    cv.c("StrokeContent#buildPath");
                }
                this.path.reset();
                for (int size = bVar.f1923a.size() - 1; size >= 0; size--) {
                    this.path.addPath(((PathContent) bVar.f1923a.get(size)).getPath(), matrix);
                }
                if (cv.e()) {
                    cv.e("StrokeContent#buildPath");
                    cv.c("StrokeContent#drawPath");
                }
                canvas.drawPath(this.path, this.paint);
                if (cv.e()) {
                    cv.e("StrokeContent#drawPath");
                }
            }
        }
        if (cv.e()) {
            cv.e("StrokeContent#draw");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x012e  */
    private void applyTrimPath(Canvas canvas, b bVar, Matrix matrix) {
        float f;
        if (cv.e()) {
            cv.c("StrokeContent#applyTrimPath");
        }
        if (bVar.f1924b == null) {
            if (cv.e()) {
                cv.e("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.path.reset();
        for (int size = bVar.f1923a.size() - 1; size >= 0; size--) {
            this.path.addPath(((PathContent) bVar.f1923a.get(size)).getPath(), matrix);
        }
        float fFloatValue = bVar.f1924b.a().getValue().floatValue() / 100.0f;
        float fFloatValue2 = bVar.f1924b.d().getValue().floatValue() / 100.0f;
        float fFloatValue3 = bVar.f1924b.c().getValue().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.path, this.paint);
            if (cv.e()) {
                cv.e("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.pm.setPath(this.path, false);
        float length = this.pm.getLength();
        while (this.pm.nextContour()) {
            length += this.pm.getLength();
        }
        float f2 = fFloatValue3 * length;
        float f3 = (fFloatValue * length) + f2;
        float fMin = Math.min((fFloatValue2 * length) + f2, (f3 + length) - 1.0f);
        float f4 = 0.0f;
        for (int size2 = bVar.f1923a.size() - 1; size2 >= 0; size2--) {
            this.trimPathPath.set(((PathContent) bVar.f1923a.get(size2)).getPath());
            this.trimPathPath.transform(matrix);
            this.pm.setPath(this.trimPathPath, false);
            float length2 = this.pm.getLength();
            if (fMin > length) {
                float f5 = fMin - length;
                if (f5 >= f4 + length2 || f4 >= f5) {
                    f = f4 + length2;
                    if (f < f3 && f4 <= fMin) {
                        if (f <= fMin && f3 < f4) {
                            canvas.drawPath(this.trimPathPath, this.paint);
                        } else {
                            je.e(this.trimPathPath, f3 < f4 ? 0.0f : (f3 - f4) / length2, fMin > f ? 1.0f : (fMin - f4) / length2, 0.0f);
                            canvas.drawPath(this.trimPathPath, this.paint);
                        }
                    }
                } else {
                    je.e(this.trimPathPath, f3 > length ? (f3 - length) / length2 : 0.0f, Math.min(f5 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.trimPathPath, this.paint);
                }
            } else {
                f = f4 + length2;
                if (f < f3) {
                }
            }
            f4 += length2;
        }
        if (cv.e()) {
            cv.e("StrokeContent#applyTrimPath");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        if (cv.e()) {
            cv.c("StrokeContent#getBounds");
        }
        this.path.reset();
        for (int i = 0; i < this.pathGroups.size(); i++) {
            b bVar = this.pathGroups.get(i);
            for (int i2 = 0; i2 < bVar.f1923a.size(); i2++) {
                this.path.addPath(((PathContent) bVar.f1923a.get(i2)).getPath(), matrix);
            }
        }
        this.path.computeBounds(this.rect, false);
        float fA = ((fd) this.widthAnimation).a();
        RectF rectF2 = this.rect;
        float f = fA / 2.0f;
        rectF2.set(rectF2.left - f, this.rect.top - f, this.rect.right + f, this.rect.bottom + f);
        rectF.set(this.rect);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (cv.e()) {
            cv.e("StrokeContent#getBounds");
        }
    }

    private void applyDashPatternIfNeeded(Matrix matrix) {
        if (cv.e()) {
            cv.c("StrokeContent#applyDashPattern");
        }
        if (this.dashPatternAnimations.isEmpty()) {
            if (cv.e()) {
                cv.e("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        float fB = je.b(matrix);
        for (int i = 0; i < this.dashPatternAnimations.size(); i++) {
            this.dashPatternValues[i] = this.dashPatternAnimations.get(i).getValue().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.dashPatternValues;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.dashPatternValues;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.dashPatternValues;
            fArr3[i] = fArr3[i] * fB;
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.dashPatternOffsetAnimation;
        this.paint.setPathEffect(new DashPathEffect(this.dashPatternValues, baseKeyframeAnimation == null ? 0.0f : fB * baseKeyframeAnimation.getValue().floatValue()));
        if (cv.e()) {
            cv.e("StrokeContent#applyDashPattern");
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        jc.d(foVar, i, list, foVar2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        eu euVar;
        eu euVar2;
        eu euVar3;
        eu euVar4;
        eu euVar5;
        if (t == LottieProperty.OPACITY) {
            this.opacityAnimation.setValueCallback(jfVar);
            return;
        }
        if (t == LottieProperty.STROKE_WIDTH) {
            this.widthAnimation.setValueCallback(jfVar);
            return;
        }
        if (t == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
            if (baseKeyframeAnimation != null) {
                this.layer.removeAnimation(baseKeyframeAnimation);
            }
            if (jfVar == null) {
                this.colorFilterAnimation = null;
                return;
            }
            fm fmVar = new fm(jfVar);
            this.colorFilterAnimation = fmVar;
            fmVar.addUpdateListener(this);
            this.layer.addAnimation(this.colorFilterAnimation);
            return;
        }
        if (t == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.blurAnimation;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(jfVar);
                return;
            }
            fm fmVar2 = new fm(jfVar);
            this.blurAnimation = fmVar2;
            fmVar2.addUpdateListener(this);
            this.layer.addAnimation(this.blurAnimation);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_COLOR && (euVar5 = this.dropShadowAnimation) != null) {
            euVar5.c(jfVar);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_OPACITY && (euVar4 = this.dropShadowAnimation) != null) {
            euVar4.d((jf<Float>) jfVar);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_DIRECTION && (euVar3 = this.dropShadowAnimation) != null) {
            euVar3.b(jfVar);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_DISTANCE && (euVar2 = this.dropShadowAnimation) != null) {
            euVar2.a(jfVar);
        } else {
            if (t != LottieProperty.DROP_SHADOW_RADIUS || (euVar = this.dropShadowAnimation) == null) {
                return;
            }
            euVar.e(jfVar);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<PathContent> f1923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ev f1924b;

        private b(ev evVar) {
            this.f1923a = new ArrayList();
            this.f1924b = evVar;
        }
    }
}
