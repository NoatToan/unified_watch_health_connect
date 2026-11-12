package com.scwang.smartrefresh.layout.footer.ballpulse;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class BallPulseView extends View {
    public static final int DEFAULT_SIZE = 50;
    private Paint a;
    private int b;
    private int c;
    private float d;
    private float[] e;
    private boolean f;
    private ArrayList<ValueAnimator> g;
    private Map<ValueAnimator, ValueAnimator.AnimatorUpdateListener> h;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BallPulseView.this.e[this.a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BallPulseView.this.postInvalidate();
        }
    }

    public BallPulseView(Context context) {
        this(context, null);
    }

    private void b() {
        this.g = new ArrayList<>();
        int[] iArr = {120, 240, 360};
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            valueAnimatorOfFloat.setDuration(750L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i]);
            this.h.put(valueAnimatorOfFloat, new a(i));
            this.g.add(valueAnimatorOfFloat);
        }
    }

    private boolean c() {
        return this.f;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.g != null) {
            for (int i = 0; i < this.g.size(); i++) {
                this.g.get(i).cancel();
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float fMin = (Math.min(getWidth(), getHeight()) - (this.d * 2.0f)) / 6.0f;
        float f = 2.0f * fMin;
        float width = (getWidth() / 2) - (this.d + f);
        float height = getHeight() / 2;
        for (int i = 0; i < 3; i++) {
            canvas.save();
            float f2 = i;
            canvas.translate((f * f2) + width + (this.d * f2), height);
            float[] fArr = this.e;
            canvas.scale(fArr[i], fArr[i]);
            canvas.drawCircle(0.0f, 0.0f, fMin, this.a);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iDp2px = DensityUtil.dp2px(50.0f);
        setMeasuredDimension(View.resolveSize(iDp2px, i), View.resolveSize(iDp2px, i2));
    }

    public void setAnimatingColor(@ColorInt int i) {
        this.c = i;
    }

    public void setIndicatorColor(@ColorInt int i) {
        this.a.setColor(i);
    }

    public void setNormalColor(@ColorInt int i) {
        this.b = i;
    }

    public void startAnim() {
        if (this.g == null) {
            b();
        }
        if (this.g == null || c()) {
            return;
        }
        for (int i = 0; i < this.g.size(); i++) {
            ValueAnimator valueAnimator = this.g.get(i);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.h.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
        this.f = true;
        setIndicatorColor(this.c);
    }

    public void stopAnim() {
        ArrayList<ValueAnimator> arrayList = this.g;
        if (arrayList != null && this.f) {
            this.f = false;
            for (ValueAnimator valueAnimator : arrayList) {
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.end();
                }
            }
            this.e = new float[]{1.0f, 1.0f, 1.0f};
        }
        setIndicatorColor(this.b);
    }

    public BallPulseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BallPulseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -1118482;
        this.c = -1615546;
        this.e = new float[]{1.0f, 1.0f, 1.0f};
        this.f = false;
        this.h = new HashMap();
        this.d = DensityUtil.dp2px(4.0f);
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-1);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setAntiAlias(true);
    }
}
