package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes2.dex */
public class ImageLayer extends BaseLayer {
    private final Paint F;
    private final Rect G;
    private final Rect H;

    @Nullable
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> I;

    @Nullable
    private BaseKeyframeAnimation<Bitmap, Bitmap> J;

    public ImageLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.F = new LPaint(3);
        this.G = new Rect();
        this.H = new Rect();
    }

    @Nullable
    private Bitmap y() {
        Bitmap value;
        BaseKeyframeAnimation<Bitmap, Bitmap> baseKeyframeAnimation = this.J;
        return (baseKeyframeAnimation == null || (value = baseKeyframeAnimation.getValue()) == null) ? this.n.getImageAsset(this.o.i()) : value;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.COLOR_FILTER) {
            if (lottieValueCallback == null) {
                this.I = null;
                return;
            } else {
                this.I = new ValueCallbackKeyframeAnimation(lottieValueCallback);
                return;
            }
        }
        if (t == LottieProperty.IMAGE) {
            if (lottieValueCallback == null) {
                this.J = null;
            } else {
                this.J = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapY = y();
        if (bitmapY == null || bitmapY.isRecycled()) {
            return;
        }
        float fDpScale = Utils.dpScale();
        this.F.setAlpha(i);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.I;
        if (baseKeyframeAnimation != null) {
            this.F.setColorFilter(baseKeyframeAnimation.getValue());
        }
        canvas.save();
        canvas.concat(matrix);
        this.G.set(0, 0, bitmapY.getWidth(), bitmapY.getHeight());
        this.H.set(0, 0, (int) (bitmapY.getWidth() * fDpScale), (int) (bitmapY.getHeight() * fDpScale));
        canvas.drawBitmap(bitmapY, this.G, this.H, this.F);
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        Bitmap bitmapY = y();
        if (bitmapY != null) {
            rectF.set(0.0f, 0.0f, bitmapY.getWidth() * Utils.dpScale(), bitmapY.getHeight() * Utils.dpScale());
            this.m.mapRect(rectF);
        }
    }
}
