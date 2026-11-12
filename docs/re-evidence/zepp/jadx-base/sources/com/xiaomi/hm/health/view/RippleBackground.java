package com.xiaomi.hm.health.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public class RippleBackground extends RelativeLayout {
    private static final float A = 288.3f;
    private static final String B = "RippleBackground";
    private static final int s = 6;
    private static final int t = 4000;
    private static final float u = 6.0f;
    private static final int v = 0;
    private static final boolean w = true;
    private static final int x = 4;
    private static final float y = 55.0f;
    private static final float z = 243.3f;
    private boolean a;
    private int b;
    private float c;
    private float d;
    private int e;
    private int f;
    private int g;
    private float h;
    private int i;
    private float j;
    private float k;
    private int l;
    private Paint m;
    private boolean n;
    private AnimatorSet o;
    private ArrayList<Animator> p;
    private RelativeLayout.LayoutParams q;
    private ArrayList<b> r;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.a.invalidate();
        }
    }

    public class b extends View {
        private float a;

        public b(Context context) {
            super(context);
            setVisibility(4);
        }

        private float b() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(float f) {
            this.a = f;
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            canvas.drawCircle(RippleBackground.this.j, RippleBackground.this.k, b() - RippleBackground.this.c, RippleBackground.this.m);
        }
    }

    public RippleBackground(Context context) {
        super(context);
        this.n = false;
        this.r = new ArrayList<>();
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            return;
        }
        if (attributeSet == null) {
            throw new IllegalArgumentException("Attributes should be provided to this view,");
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RippleBackground);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RippleBackground_rb_enable, true);
        this.a = z2;
        if (z2) {
            this.b = typedArrayObtainStyledAttributes.getColor(R.styleable.RippleBackground_rb_color, getResources().getColor(R.color.rippelColor));
            this.c = typedArrayObtainStyledAttributes.getDimension(R.styleable.RippleBackground_rb_strokeWidth, 4.0f);
            this.d = typedArrayObtainStyledAttributes.getDimension(R.styleable.RippleBackground_rb_radius, y);
            this.e = typedArrayObtainStyledAttributes.getInt(R.styleable.RippleBackground_rb_duration, 4000);
            this.f = typedArrayObtainStyledAttributes.getInt(R.styleable.RippleBackground_rb_rippleAmount, 6);
            this.h = typedArrayObtainStyledAttributes.getFloat(R.styleable.RippleBackground_rb_scale, 6.0f);
            this.i = typedArrayObtainStyledAttributes.getInt(R.styleable.RippleBackground_rb_type, 0);
            this.j = typedArrayObtainStyledAttributes.getDimension(R.styleable.RippleBackground_rb_cx, z);
            this.k = typedArrayObtainStyledAttributes.getDimension(R.styleable.RippleBackground_rb_cy, A);
            HMLog.d(B, "cx : " + this.j + "; cy: " + this.k, new Object[0]);
            typedArrayObtainStyledAttributes.recycle();
            int i = this.e;
            int i2 = this.f;
            this.g = i / i2;
            this.l = (int) (((double) this.d) * Math.pow(1.35d, (double) i2));
            Paint paint = new Paint();
            this.m = paint;
            paint.setAntiAlias(true);
            if (this.i == 0) {
                this.c = 4.0f;
                this.m.setStyle(Paint.Style.FILL);
            } else {
                this.m.setStyle(Paint.Style.STROKE);
            }
            this.m.setColor(this.b);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(1080, 1920);
            this.q = layoutParams;
            layoutParams.addRule(13);
            AnimatorSet animatorSet = new AnimatorSet();
            this.o = animatorSet;
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.p = new ArrayList<>();
            for (int i3 = 0; i3 < this.f; i3++) {
                b bVar = new b(getContext());
                addView(bVar, this.q);
                this.r.add(bVar);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.d, this.l);
                valueAnimatorOfFloat.setDuration(this.e);
                valueAnimatorOfFloat.addUpdateListener(new a(bVar));
                valueAnimatorOfFloat.setRepeatMode(1);
                valueAnimatorOfFloat.setStartDelay(this.g * i3);
                valueAnimatorOfFloat.setRepeatCount(-1);
                this.p.add(valueAnimatorOfFloat);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(bVar, "Alpha", 0.5f, 0.0f);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setRepeatMode(1);
                objectAnimatorOfFloat.setStartDelay(this.g * i3);
                objectAnimatorOfFloat.setDuration(this.e);
                this.p.add(objectAnimatorOfFloat);
            }
            this.o.playTogether(this.p);
        }
    }

    public boolean isRippleAnimationRunning() {
        return this.n;
    }

    public void setRBEnable(boolean z2) {
        this.a = z2;
    }

    public void startRippleAnimation() {
        if (this.a && !isRippleAnimationRunning()) {
            Iterator<b> it2 = this.r.iterator();
            while (it2.hasNext()) {
                it2.next().setVisibility(0);
            }
            this.o.start();
            this.n = true;
        }
    }

    public void stopRippleAnimation() {
        if (isRippleAnimationRunning()) {
            this.o.end();
            this.n = false;
        }
    }

    public RippleBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = false;
        this.r = new ArrayList<>();
        e(context, attributeSet);
    }

    public RippleBackground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = false;
        this.r = new ArrayList<>();
        e(context, attributeSet);
    }
}
