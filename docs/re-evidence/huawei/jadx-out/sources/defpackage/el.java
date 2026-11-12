package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.BaseStrokeContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes21.dex */
public class el extends BaseStrokeContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f33095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BaseKeyframeAnimation<PointF, PointF> f33096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33097c;
    private fm d;
    private final BaseKeyframeAnimation<gl, gl> e;
    private final boolean f;
    private final LongSparseArray<LinearGradient> g;
    private final String h;
    private final BaseKeyframeAnimation<PointF, PointF> i;
    private final LongSparseArray<RadialGradient> j;
    private final GradientType m;

    public el(LottieDrawable lottieDrawable, BaseLayer baseLayer, gm gmVar) {
        super(lottieDrawable, baseLayer, gmVar.c().toPaintCap(), gmVar.f().toPaintJoin(), gmVar.j(), gmVar.i(), gmVar.l(), gmVar.g(), gmVar.b());
        this.g = new LongSparseArray<>();
        this.j = new LongSparseArray<>();
        this.f33095a = new RectF();
        this.h = gmVar.h();
        this.m = gmVar.a();
        this.f = gmVar.n();
        this.f33097c = (int) (lottieDrawable.j().e() / 32.0f);
        BaseKeyframeAnimation<gl, gl> baseKeyframeAnimationCreateAnimation = gmVar.d().createAnimation();
        this.e = baseKeyframeAnimationCreateAnimation;
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation2 = gmVar.k().createAnimation();
        this.i = baseKeyframeAnimationCreateAnimation2;
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation3 = gmVar.e().createAnimation();
        this.f33096b = baseKeyframeAnimationCreateAnimation3;
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        Shader shaderA;
        if (this.f) {
            return;
        }
        getBounds(this.f33095a, matrix, false);
        if (this.m == GradientType.LINEAR) {
            shaderA = d();
        } else {
            shaderA = a();
        }
        shaderA.setLocalMatrix(matrix);
        this.paint.setShader(shaderA);
        super.draw(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.h;
    }

    private LinearGradient d() {
        long jC = c();
        LinearGradient linearGradient = this.g.get(jC);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF value = this.i.getValue();
        PointF value2 = this.f33096b.getValue();
        gl value3 = this.e.getValue();
        LinearGradient linearGradient2 = new LinearGradient(value.x, value.y, value2.x, value2.y, a(value3.b()), value3.d(), Shader.TileMode.CLAMP);
        this.g.put(jC, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient a() {
        long jC = c();
        RadialGradient radialGradient = this.j.get(jC);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF value = this.i.getValue();
        PointF value2 = this.f33096b.getValue();
        gl value3 = this.e.getValue();
        int[] iArrA = a(value3.b());
        float[] fArrD = value3.d();
        float f = value.x;
        float f2 = value.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot(value2.x - f, value2.y - f2), iArrA, fArrD, Shader.TileMode.CLAMP);
        this.j.put(jC, radialGradient2);
        return radialGradient2;
    }

    private int c() {
        int iRound = Math.round(this.i.getProgress() * this.f33097c);
        int iRound2 = Math.round(this.f33096b.getProgress() * this.f33097c);
        int iRound3 = Math.round(this.e.getProgress() * this.f33097c);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private int[] a(int[] iArr) {
        fm fmVar = this.d;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        super.addValueCallback(t, jfVar);
        if (t == LottieProperty.GRADIENT_COLOR) {
            if (this.d != null) {
                this.layer.removeAnimation(this.d);
            }
            if (jfVar == null) {
                this.d = null;
                return;
            }
            fm fmVar = new fm(jfVar);
            this.d = fmVar;
            fmVar.addUpdateListener(this);
            this.layer.addAnimation(this.d);
        }
    }
}
