package cn.bingoogolapple.bgabanner.transformer;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes2.dex */
public class ZoomPageTransformer extends BGAPageTransformer {
    private float a = 0.85f;
    private float b = 0.65f;

    public ZoomPageTransformer() {
    }

    @Override // cn.bingoogolapple.bgabanner.transformer.BGAPageTransformer
    public void handleInvisiblePage(View view, float f) {
        ViewCompat.setAlpha(view, 0.0f);
    }

    @Override // cn.bingoogolapple.bgabanner.transformer.BGAPageTransformer
    public void handleLeftPage(View view, float f) {
        float fMax = Math.max(this.a, f + 1.0f);
        float f2 = 1.0f - fMax;
        ViewCompat.setTranslationX(view, ((view.getWidth() * f2) / 2.0f) - (((view.getHeight() * f2) / 2.0f) / 2.0f));
        ViewCompat.setScaleX(view, fMax);
        ViewCompat.setScaleY(view, fMax);
        float f3 = this.b;
        float f4 = this.a;
        ViewCompat.setAlpha(view, f3 + (((fMax - f4) / (1.0f - f4)) * (1.0f - f3)));
    }

    @Override // cn.bingoogolapple.bgabanner.transformer.BGAPageTransformer
    public void handleRightPage(View view, float f) {
        float fMax = Math.max(this.a, 1.0f - f);
        float f2 = 1.0f - fMax;
        ViewCompat.setTranslationX(view, (-((view.getWidth() * f2) / 2.0f)) + (((view.getHeight() * f2) / 2.0f) / 2.0f));
        ViewCompat.setScaleX(view, fMax);
        ViewCompat.setScaleY(view, fMax);
        float f3 = this.b;
        float f4 = this.a;
        ViewCompat.setAlpha(view, f3 + (((fMax - f4) / (1.0f - f4)) * (1.0f - f3)));
    }

    public void setMinAlpha(float f) {
        if (f < 0.6f || f > 1.0f) {
            return;
        }
        this.b = f;
    }

    public void setMinScale(float f) {
        if (f < 0.6f || f > 1.0f) {
            return;
        }
        this.a = f;
    }

    public ZoomPageTransformer(float f, float f2) {
        setMinAlpha(f);
        setMinScale(f2);
    }
}
