package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes2.dex */
public class SolidLayer extends BaseLayer {
    private final RectF F;
    private final Paint G;
    private final float[] H;
    private final Path I;
    private final Layer J;

    @Nullable
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> K;

    public SolidLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.F = new RectF();
        LPaint lPaint = new LPaint();
        this.G = lPaint;
        this.H = new float[8];
        this.I = new Path();
        this.J = layer;
        lPaint.setAlpha(0);
        lPaint.setStyle(Paint.Style.FILL);
        lPaint.setColor(layer.k());
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.COLOR_FILTER) {
            if (lottieValueCallback == null) {
                this.K = null;
            } else {
                this.K = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.J.k());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.v.getOpacity() == null ? 100 : this.v.getOpacity().getValue().intValue())) / 100.0f) * 255.0f);
        this.G.setAlpha(iIntValue);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.K;
        if (baseKeyframeAnimation != null) {
            this.G.setColorFilter(baseKeyframeAnimation.getValue());
        }
        if (iIntValue > 0) {
            float[] fArr = this.H;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.J.m();
            float[] fArr2 = this.H;
            fArr2[3] = 0.0f;
            fArr2[4] = this.J.m();
            this.H[5] = this.J.l();
            float[] fArr3 = this.H;
            fArr3[6] = 0.0f;
            fArr3[7] = this.J.l();
            matrix.mapPoints(this.H);
            this.I.reset();
            Path path = this.I;
            float[] fArr4 = this.H;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.I;
            float[] fArr5 = this.H;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.I;
            float[] fArr6 = this.H;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.I;
            float[] fArr7 = this.H;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.I;
            float[] fArr8 = this.H;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.I.close();
            canvas.drawPath(this.I, this.G);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        this.F.set(0.0f, 0.0f, this.J.m(), this.J.l());
        this.m.mapRect(this.F);
        rectF.set(this.F);
    }
}
