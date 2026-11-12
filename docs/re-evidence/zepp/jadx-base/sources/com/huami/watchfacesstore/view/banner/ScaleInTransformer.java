package com.huami.watchfacesstore.view.banner;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes17.dex */
public class ScaleInTransformer implements ViewPager2.PageTransformer {
    private static final float b = 0.5f;
    private float a;

    public ScaleInTransformer() {
        this.a = 0.85f;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float position) {
        int width = view.getWidth();
        view.setPivotY(view.getHeight() >> 1);
        view.setPivotX(width >> 1);
        if (position < -1.0f) {
            view.setScaleX(this.a);
            view.setScaleY(this.a);
            view.setPivotX(width);
            return;
        }
        if (position > 1.0f) {
            view.setPivotX(0.0f);
            view.setScaleX(this.a);
            view.setScaleY(this.a);
        } else {
            if (position < 0.0f) {
                float f = this.a;
                float f2 = ((position + 1.0f) * (1.0f - f)) + f;
                view.setScaleX(f2);
                view.setScaleY(f2);
                view.setPivotX(width * (((-position) * 0.5f) + 0.5f));
                return;
            }
            float f3 = 1.0f - position;
            float f4 = this.a;
            float f5 = ((1.0f - f4) * f3) + f4;
            view.setScaleX(f5);
            view.setScaleY(f5);
            view.setPivotX(width * f3 * 0.5f);
        }
    }

    public ScaleInTransformer(float minScale) {
        this.a = 0.85f;
        this.a = minScale;
    }
}
