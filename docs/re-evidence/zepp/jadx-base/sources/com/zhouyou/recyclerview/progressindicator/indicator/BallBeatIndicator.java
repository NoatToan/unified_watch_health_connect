package com.zhouyou.recyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class BallBeatIndicator extends BaseIndicatorController {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    private float[] c = {1.0f, 1.0f, 1.0f};
    public int[] d = {255, 255, 255};

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BallBeatIndicator.this.c[this.a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BallBeatIndicator.this.postInvalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BallBeatIndicator.this.d[this.a] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            BallBeatIndicator.this.postInvalidate();
        }
    }

    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {FTPCodes.PENDING_FURTHER_INFORMATION, 0, FTPCodes.PENDING_FURTHER_INFORMATION};
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.75f, 1.0f);
            valueAnimatorOfFloat.setDuration(700L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i]);
            valueAnimatorOfFloat.addUpdateListener(new a(i));
            valueAnimatorOfFloat.start();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 51, 255);
            valueAnimatorOfInt.setDuration(700L);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr[i]);
            valueAnimatorOfInt.addUpdateListener(new b(i));
            valueAnimatorOfInt.start();
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }

    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        float width = (getWidth() - 8.0f) / 6.0f;
        float f = 2.0f * width;
        float width2 = (getWidth() / 2) - (f + 4.0f);
        float height = getHeight() / 2;
        for (int i = 0; i < 3; i++) {
            canvas.save();
            float f2 = i;
            canvas.translate((f * f2) + width2 + (f2 * 4.0f), height);
            float[] fArr = this.c;
            canvas.scale(fArr[i], fArr[i]);
            paint.setAlpha(this.d[i]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }
}
