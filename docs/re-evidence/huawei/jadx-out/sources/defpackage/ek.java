package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.animation.content.PathContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ek implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BaseKeyframeAnimation<gl, gl> f33073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseKeyframeAnimation<Float, Float> f33075c;
    float d;
    private final RectF e;
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> f;
    private final boolean g;
    private fm h;
    private eu i;
    private final BaseKeyframeAnimation<PointF, PointF> j;
    private final BaseLayer k;
    private final String m;
    private final BaseKeyframeAnimation<Integer, Integer> n;
    private final LottieDrawable o;
    private final List<PathContent> p;
    private final Paint q;
    private final BaseKeyframeAnimation<PointF, PointF> r;
    private final Path s;
    private final GradientType u;
    private final LongSparseArray<LinearGradient> l = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> t = new LongSparseArray<>();

    public ek(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer, gk gkVar) {
        Path path = new Path();
        this.s = path;
        this.q = new ef(1);
        this.e = new RectF();
        this.p = new ArrayList();
        this.d = 0.0f;
        this.k = baseLayer;
        this.m = gkVar.c();
        this.g = gkVar.i();
        this.o = lottieDrawable;
        this.u = gkVar.d();
        path.setFillType(gkVar.b());
        this.f33074b = (int) (cxVar.e() / 32.0f);
        BaseKeyframeAnimation<gl, gl> baseKeyframeAnimationCreateAnimation = gkVar.a().createAnimation();
        this.f33073a = baseKeyframeAnimationCreateAnimation;
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation2 = gkVar.j().createAnimation();
        this.n = baseKeyframeAnimationCreateAnimation2;
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation3 = gkVar.g().createAnimation();
        this.r = baseKeyframeAnimationCreateAnimation3;
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation4 = gkVar.e().createAnimation();
        this.j = baseKeyframeAnimationCreateAnimation4;
        baseKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation4);
        if (baseLayer.getBlurEffect() != null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation5 = baseLayer.getBlurEffect().b().createAnimation();
            this.f33075c = baseKeyframeAnimationCreateAnimation5;
            baseKeyframeAnimationCreateAnimation5.addUpdateListener(this);
            baseLayer.addAnimation(this.f33075c);
        }
        if (baseLayer.getDropShadowEffect() != null) {
            this.i = new eu(this, baseLayer, baseLayer.getDropShadowEffect());
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.o.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = list2.get(i);
            if (content instanceof PathContent) {
                this.p.add((PathContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        Shader shaderA;
        if (this.g) {
            return;
        }
        if (cv.e()) {
            cv.c("GradientFillContent#draw");
        }
        this.s.reset();
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            this.s.addPath(this.p.get(i2).getPath(), matrix);
        }
        this.s.computeBounds(this.e, false);
        if (this.u == GradientType.LINEAR) {
            shaderA = e();
        } else {
            shaderA = a();
        }
        shaderA.setLocalMatrix(matrix);
        this.q.setShader(shaderA);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f;
        if (baseKeyframeAnimation != null) {
            this.q.setColorFilter(baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.f33075c;
        if (baseKeyframeAnimation2 != null) {
            float fFloatValue = baseKeyframeAnimation2.getValue().floatValue();
            if (fFloatValue == 0.0f) {
                this.q.setMaskFilter(null);
            } else if (fFloatValue != this.d) {
                this.q.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.d = fFloatValue;
        }
        eu euVar = this.i;
        if (euVar != null) {
            euVar.d(this.q);
        }
        this.q.setAlpha(jc.b((int) ((((i / 255.0f) * this.n.getValue().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.s, this.q);
        if (cv.e()) {
            cv.e("GradientFillContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.s.reset();
        for (int i = 0; i < this.p.size(); i++) {
            this.s.addPath(this.p.get(i).getPath(), matrix);
        }
        this.s.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.m;
    }

    private LinearGradient e() {
        long jB = b();
        LinearGradient linearGradient = this.l.get(jB);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF value = this.r.getValue();
        PointF value2 = this.j.getValue();
        gl value3 = this.f33073a.getValue();
        LinearGradient linearGradient2 = new LinearGradient(value.x, value.y, value2.x, value2.y, e(value3.b()), value3.d(), Shader.TileMode.CLAMP);
        this.l.put(jB, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient a() {
        long jB = b();
        RadialGradient radialGradient = this.t.get(jB);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF value = this.r.getValue();
        PointF value2 = this.j.getValue();
        gl value3 = this.f33073a.getValue();
        int[] iArrE = e(value3.b());
        float[] fArrD = value3.d();
        float f = value.x;
        float f2 = value.y;
        float fHypot = (float) Math.hypot(value2.x - f, value2.y - f2);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArrE, fArrD, Shader.TileMode.CLAMP);
        this.t.put(jB, radialGradient2);
        return radialGradient2;
    }

    private int b() {
        int iRound = Math.round(this.r.getProgress() * this.f33074b);
        int iRound2 = Math.round(this.j.getProgress() * this.f33074b);
        int iRound3 = Math.round(this.f33073a.getProgress() * this.f33074b);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private int[] e(int[] iArr) {
        fm fmVar = this.h;
        if (fmVar != null) {
            Integer[] numArr = (Integer[]) fmVar.getValue();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        jc.d(foVar, i, list, foVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        eu euVar;
        eu euVar2;
        eu euVar3;
        eu euVar4;
        eu euVar5;
        if (t == LottieProperty.OPACITY) {
            this.n.setValueCallback(jfVar);
            return;
        }
        if (t == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f;
            if (baseKeyframeAnimation != null) {
                this.k.removeAnimation(baseKeyframeAnimation);
            }
            if (jfVar == null) {
                this.f = null;
                return;
            }
            fm fmVar = new fm(jfVar);
            this.f = fmVar;
            fmVar.addUpdateListener(this);
            this.k.addAnimation(this.f);
            return;
        }
        if (t == LottieProperty.GRADIENT_COLOR) {
            fm fmVar2 = this.h;
            if (fmVar2 != null) {
                this.k.removeAnimation(fmVar2);
            }
            if (jfVar == null) {
                this.h = null;
                return;
            }
            this.l.clear();
            this.t.clear();
            fm fmVar3 = new fm(jfVar);
            this.h = fmVar3;
            fmVar3.addUpdateListener(this);
            this.k.addAnimation(this.h);
            return;
        }
        if (t == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.f33075c;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(jfVar);
                return;
            }
            fm fmVar4 = new fm(jfVar);
            this.f33075c = fmVar4;
            fmVar4.addUpdateListener(this);
            this.k.addAnimation(this.f33075c);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_COLOR && (euVar5 = this.i) != null) {
            euVar5.c(jfVar);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_OPACITY && (euVar4 = this.i) != null) {
            euVar4.d((jf<Float>) jfVar);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_DIRECTION && (euVar3 = this.i) != null) {
            euVar3.b(jfVar);
            return;
        }
        if (t == LottieProperty.DROP_SHADOW_DISTANCE && (euVar2 = this.i) != null) {
            euVar2.a(jfVar);
        } else {
            if (t != LottieProperty.DROP_SHADOW_RADIUS || (euVar = this.i) == null) {
                return;
            }
            euVar.e(jfVar);
        }
    }
}
