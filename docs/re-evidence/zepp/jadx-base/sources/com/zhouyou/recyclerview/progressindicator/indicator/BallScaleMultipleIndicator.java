package com.zhouyou.recyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class BallScaleMultipleIndicator extends BaseIndicatorController {
    public float[] c = {1.0f, 1.0f, 1.0f};
    public int[] d = {255, 255, 255};

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BallScaleMultipleIndicator.this.c[this.a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BallScaleMultipleIndicator.this.postInvalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BallScaleMultipleIndicator.this.d[this.a] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            BallScaleMultipleIndicator.this.postInvalidate();
        }
    }

    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        long[] jArr = {0, 200, 400};
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new a(i));
            valueAnimatorOfFloat.setStartDelay(jArr[i]);
            valueAnimatorOfFloat.start();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.setDuration(1000L);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.addUpdateListener(new b(i));
            valueAnimatorOfFloat.setStartDelay(jArr[i]);
            valueAnimatorOfInt.start();
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }

    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        for (int i = 0; i < 3; i++) {
            paint.setAlpha(this.d[i]);
            float[] fArr = this.c;
            canvas.scale(fArr[i], fArr[i], getWidth() / 2, getHeight() / 2);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - 4.0f, paint);
        }
    }
}
