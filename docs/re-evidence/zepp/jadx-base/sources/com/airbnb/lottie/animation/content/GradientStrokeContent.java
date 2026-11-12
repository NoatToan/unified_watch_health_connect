package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes2.dex */
public class GradientStrokeContent extends BaseStrokeContent {
    private static final int B = 32;

    @Nullable
    private ValueCallbackKeyframeAnimation A;
    private final String q;
    private final boolean r;
    private final LongSparseArray<LinearGradient> s;
    private final LongSparseArray<RadialGradient> t;
    private final RectF u;
    private final GradientType v;
    private final int w;
    private final BaseKeyframeAnimation<GradientColor, GradientColor> x;
    private final BaseKeyframeAnimation<PointF, PointF> y;
    private final BaseKeyframeAnimation<PointF, PointF> z;

    public GradientStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, GradientStroke gradientStroke) {
        super(lottieDrawable, baseLayer, gradientStroke.getCapType().toPaintCap(), gradientStroke.getJoinType().toPaintJoin(), gradientStroke.getMiterLimit(), gradientStroke.getOpacity(), gradientStroke.getWidth(), gradientStroke.getLineDashPattern(), gradientStroke.getDashOffset());
        this.s = new LongSparseArray<>();
        this.t = new LongSparseArray<>();
        this.u = new RectF();
        this.q = gradientStroke.getName();
        this.v = gradientStroke.getGradientType();
        this.r = gradientStroke.isHidden();
        this.w = (int) (lottieDrawable.getComposition().getDuration() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> baseKeyframeAnimationCreateAnimation = gradientStroke.getGradientColor().createAnimation();
        this.x = baseKeyframeAnimationCreateAnimation;
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation2 = gradientStroke.getStartPoint().createAnimation();
        this.y = baseKeyframeAnimationCreateAnimation2;
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation3 = gradientStroke.getEndPoint().createAnimation();
        this.z = baseKeyframeAnimationCreateAnimation3;
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
    }

    private int[] c(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.A;
        if (valueCallbackKeyframeAnimation != null) {
            Integer[] numArr = (Integer[]) valueCallbackKeyframeAnimation.getValue();
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

    private int d() {
        int iRound = Math.round(this.y.getProgress() * this.w);
        int iRound2 = Math.round(this.z.getProgress() * this.w);
        int iRound3 = Math.round(this.x.getProgress() * this.w);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private LinearGradient e() {
        long jD = d();
        LinearGradient linearGradient = this.s.get(jD);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF value = this.y.getValue();
        PointF value2 = this.z.getValue();
        GradientColor value3 = this.x.getValue();
        LinearGradient linearGradient2 = new LinearGradient(value.x, value.y, value2.x, value2.y, c(value3.getColors()), value3.getPositions(), Shader.TileMode.CLAMP);
        this.s.put(jD, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient f() {
        long jD = d();
        RadialGradient radialGradient = this.t.get(jD);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF value = this.y.getValue();
        PointF value2 = this.z.getValue();
        GradientColor value3 = this.x.getValue();
        int[] iArrC = c(value3.getColors());
        float[] positions = value3.getPositions();
        float f = value.x;
        float f2 = value.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot(value2.x - f, value2.y - f2), iArrC, positions, Shader.TileMode.CLAMP);
        this.t.put(jD, radialGradient2);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.GRADIENT_COLOR) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.A;
            if (valueCallbackKeyframeAnimation != null) {
                this.layer.removeAnimation(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.A = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.A = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.layer.addAnimation(this.A);
        }
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (this.r) {
            return;
        }
        getBounds(this.u, matrix, false);
        Shader shaderE = this.v == GradientType.LINEAR ? e() : f();
        shaderE.setLocalMatrix(matrix);
        this.h.setShader(shaderE);
        super.draw(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.q;
    }
}
