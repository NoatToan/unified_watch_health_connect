package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.model.layer.Layer;

/* JADX INFO: loaded from: classes21.dex */
public class gv extends BaseLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f36072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> f36073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f36074c;
    private BaseKeyframeAnimation<Bitmap, Bitmap> d;
    private final Rect e;
    private final Rect g;

    public gv(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f36074c = new ef(3);
        this.g = new Rect();
        this.e = new Rect();
        this.f36072a = lottieDrawable.a(layer.k());
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapE = e();
        if (bitmapE == null || bitmapE.isRecycled() || this.f36072a == null) {
            return;
        }
        float fE = je.e();
        this.f36074c.setAlpha(i);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f36073b;
        if (baseKeyframeAnimation != null) {
            this.f36074c.setColorFilter(baseKeyframeAnimation.getValue());
        }
        canvas.save();
        canvas.concat(matrix);
        this.g.set(0, 0, bitmapE.getWidth(), bitmapE.getHeight());
        if (this.lottieDrawable.m()) {
            this.e.set(0, 0, (int) (this.f36072a.c() * fE), (int) (this.f36072a.e() * fE));
        } else {
            this.e.set(0, 0, (int) (bitmapE.getWidth() * fE), (int) (bitmapE.getHeight() * fE));
        }
        canvas.drawBitmap(bitmapE, this.g, this.e, this.f36074c);
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        if (this.f36072a != null) {
            float fE = je.e();
            rectF.set(0.0f, 0.0f, this.f36072a.c() * fE, this.f36072a.e() * fE);
            this.boundsMatrix.mapRect(rectF);
        }
    }

    private Bitmap e() {
        Bitmap value;
        BaseKeyframeAnimation<Bitmap, Bitmap> baseKeyframeAnimation = this.d;
        if (baseKeyframeAnimation != null && (value = baseKeyframeAnimation.getValue()) != null) {
            return value;
        }
        Bitmap bitmapD = this.lottieDrawable.d(this.layerModel.k());
        if (bitmapD != null) {
            return bitmapD;
        }
        ed edVar = this.f36072a;
        if (edVar != null) {
            return edVar.a();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        super.addValueCallback(t, jfVar);
        if (t == LottieProperty.COLOR_FILTER) {
            if (jfVar == null) {
                this.f36073b = null;
                return;
            } else {
                this.f36073b = new fm(jfVar);
                return;
            }
        }
        if (t == LottieProperty.IMAGE) {
            if (jfVar == null) {
                this.d = null;
            } else {
                this.d = new fm(jfVar);
            }
        }
    }
}
