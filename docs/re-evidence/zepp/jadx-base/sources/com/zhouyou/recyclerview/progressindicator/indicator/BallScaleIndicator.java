package com.zhouyou.recyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class BallScaleIndicator extends BaseIndicatorController {
    public float c = 1.0f;
    public int d = 255;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BallScaleIndicator.this.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BallScaleIndicator.this.postInvalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BallScaleIndicator.this.d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            BallScaleIndicator.this.postInvalidate();
        }
    }

    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.addUpdateListener(new b());
        valueAnimatorOfInt.start();
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfInt);
        return arrayList;
    }

    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        paint.setAlpha(this.d);
        float f = this.c;
        canvas.scale(f, f, getWidth() / 2, getHeight() / 2);
        paint.setAlpha(this.d);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - 4.0f, paint);
    }
}
