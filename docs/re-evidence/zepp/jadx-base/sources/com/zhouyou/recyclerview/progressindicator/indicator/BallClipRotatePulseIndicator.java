package com.zhouyou.recyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class BallClipRotatePulseIndicator extends BaseIndicatorController {
    public float c;
    public float d;
    public float e;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BallClipRotatePulseIndicator.this.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BallClipRotatePulseIndicator.this.postInvalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BallClipRotatePulseIndicator.this.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BallClipRotatePulseIndicator.this.postInvalidate();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BallClipRotatePulseIndicator.this.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BallClipRotatePulseIndicator.this.postInvalidate();
        }
    }

    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.6f, 1.0f);
        valueAnimatorOfFloat2.setDuration(1000L);
        valueAnimatorOfFloat2.setRepeatCount(-1);
        valueAnimatorOfFloat2.addUpdateListener(new b());
        valueAnimatorOfFloat2.start();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f);
        valueAnimatorOfFloat3.setDuration(1000L);
        valueAnimatorOfFloat3.setRepeatCount(-1);
        valueAnimatorOfFloat3.addUpdateListener(new c());
        valueAnimatorOfFloat3.start();
        ArrayList arrayList = new ArrayList();
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfFloat2);
        arrayList.add(valueAnimatorOfFloat3);
        return arrayList;
    }

    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.save();
        canvas.translate(width, height);
        float f = this.c;
        canvas.scale(f, f);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0.0f, 0.0f, width / 2.5f, paint);
        canvas.restore();
        canvas.translate(width, height);
        float f2 = this.d;
        canvas.scale(f2, f2);
        canvas.rotate(this.e);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        float[] fArr = {225.0f, 45.0f};
        for (int i = 0; i < 2; i++) {
            canvas.drawArc(new RectF((-width) + 12.0f, (-height) + 12.0f, width - 12.0f, height - 12.0f), fArr[i], 90.0f, false, paint);
        }
    }
}
