package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.model.layer.Layer;

/* JADX INFO: loaded from: classes21.dex */
public class ha extends BaseLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BaseKeyframeAnimation<Integer, Integer> f36308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f36309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f36310c;
    private final Layer d;
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> e;
    private final RectF f;
    private final float[] g;

    public ha(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f = new RectF();
        ef efVar = new ef();
        this.f36310c = efVar;
        this.g = new float[8];
        this.f36309b = new Path();
        this.d = layer;
        efVar.setAlpha(0);
        efVar.setStyle(Paint.Style.FILL);
        efVar.setColor(layer.q());
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.d.q());
        if (iAlpha == 0) {
            return;
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f36308a;
        Integer value = baseKeyframeAnimation == null ? null : baseKeyframeAnimation.getValue();
        if (value != null) {
            this.f36310c.setColor(value.intValue());
        } else {
            this.f36310c.setColor(this.d.q());
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.transform.c() == null ? 100 : this.transform.c().getValue().intValue())) / 100.0f) * 255.0f);
        this.f36310c.setAlpha(iIntValue);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation2 = this.e;
        if (baseKeyframeAnimation2 != null) {
            this.f36310c.setColorFilter(baseKeyframeAnimation2.getValue());
        }
        if (iIntValue > 0) {
            float[] fArr = this.g;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.d.p();
            float[] fArr2 = this.g;
            fArr2[3] = 0.0f;
            fArr2[4] = this.d.p();
            this.g[5] = this.d.s();
            float[] fArr3 = this.g;
            fArr3[6] = 0.0f;
            fArr3[7] = this.d.s();
            matrix.mapPoints(this.g);
            this.f36309b.reset();
            Path path = this.f36309b;
            float[] fArr4 = this.g;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f36309b;
            float[] fArr5 = this.g;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f36309b;
            float[] fArr6 = this.g;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f36309b;
            float[] fArr7 = this.g;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f36309b;
            float[] fArr8 = this.g;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f36309b.close();
            canvas.drawPath(this.f36309b, this.f36310c);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        this.f.set(0.0f, 0.0f, this.d.p(), this.d.s());
        this.boundsMatrix.mapRect(this.f);
        rectF.set(this.f);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        super.addValueCallback(t, jfVar);
        if (t == LottieProperty.COLOR_FILTER) {
            if (jfVar == null) {
                this.e = null;
                return;
            } else {
                this.e = new fm(jfVar);
                return;
            }
        }
        if (t == LottieProperty.COLOR) {
            if (jfVar == null) {
                this.f36308a = null;
                this.f36310c.setColor(this.d.q());
            } else {
                this.f36308a = new fm(jfVar);
            }
        }
    }
}
