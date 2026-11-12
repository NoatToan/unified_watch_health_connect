package com.huawei.health.suggestion.ui.fitness.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes9.dex */
public class SwitchView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f9406b = Color.parseColor("#95AAB3");
    private static final int d = Color.parseColor("#FFFFFF");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Property<SwitchView, Float> f9407a;
    private ObjectAnimator aa;
    private int ab;
    private OnSwitchStateChangeListener ac;
    private float ad;
    private boolean ae;
    private RectF af;
    private Paint ag;
    private int ah;
    private int ai;
    private int al;
    private int am;
    private int an;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9408c;
    private int e;
    private GestureDetector.SimpleOnGestureListener f;
    private int g;
    private GestureDetector h;
    private int i;
    private float j;
    private float k;
    private float l;
    private float m;
    private RectF n;
    private ObjectAnimator o;
    private boolean p;
    private boolean q;
    private boolean r;
    private float s;
    private boolean t;
    private RectF u;
    private ObjectAnimator v;
    private Property<SwitchView, Float> w;
    private float x;
    private float y;
    private Property<SwitchView, Float> z;

    public interface OnSwitchStateChangeListener {
        void onSwitchStateChange(View view, boolean z);
    }

    private int c(float f, int i, int i2) {
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 8) & 255;
        int i5 = i & 255;
        return ((i3 + ((int) ((((i2 >> 16) & 255) - i3) * f))) << 16) | (-16777216) | ((i4 + ((int) ((((i2 >> 8) & 255) - i4) * f))) << 8) | (i5 + ((int) (((i2 & 255) - i5) * f)));
    }

    public SwitchView(Context context) {
        this(context, null);
    }

    public SwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9407a = new Property<SwitchView, Float>(Float.class, "innerBound") { // from class: com.huawei.health.suggestion.ui.fitness.module.SwitchView.4
            @Override // android.util.Property
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void set(SwitchView switchView, Float f) {
                if (switchView == null) {
                    return;
                }
                switchView.setInnerContentRate(f.floatValue());
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float get(SwitchView switchView) {
                if (switchView == null) {
                    return null;
                }
                return Float.valueOf(switchView.getInnerContentRate());
            }
        };
        this.w = new Property<SwitchView, Float>(Float.class, "knobExpand") { // from class: com.huawei.health.suggestion.ui.fitness.module.SwitchView.1
            @Override // android.util.Property
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void set(SwitchView switchView, Float f) {
                if (switchView == null) {
                    return;
                }
                switchView.setKnobExpandRate(f.floatValue());
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Float get(SwitchView switchView) {
                if (switchView == null) {
                    return Float.valueOf(0.0f);
                }
                return Float.valueOf(switchView.getKnobExpandRate());
            }
        };
        this.z = new Property<SwitchView, Float>(Float.class, "knobMove") { // from class: com.huawei.health.suggestion.ui.fitness.module.SwitchView.3
            @Override // android.util.Property
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void set(SwitchView switchView, Float f) {
                switchView.setKnobMoveRate(f.floatValue());
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Float get(SwitchView switchView) {
                return Float.valueOf(switchView.getKnobMoveRate());
            }
        };
        this.f = new GestureDetector.SimpleOnGestureListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.SwitchView.5
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                if (!SwitchView.this.isEnabled()) {
                    return false;
                }
                SwitchView switchView = SwitchView.this;
                switchView.ae = switchView.t;
                SwitchView.this.o.setFloatValues(SwitchView.this.l, 0.0f);
                SwitchView.this.o.start();
                SwitchView.this.v.setFloatValues(SwitchView.this.x, 1.0f);
                SwitchView.this.v.start();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (motionEvent == null) {
                    return false;
                }
                super.onSingleTapUp(motionEvent);
                SwitchView switchView = SwitchView.this;
                switchView.t = switchView.p;
                if (SwitchView.this.ae == SwitchView.this.t) {
                    SwitchView switchView2 = SwitchView.this;
                    switchView2.t = !switchView2.t;
                    SwitchView switchView3 = SwitchView.this;
                    switchView3.p = !switchView3.p;
                }
                SwitchView switchView4 = SwitchView.this;
                switchView4.b(switchView4.p);
                SwitchView.this.v.setFloatValues(SwitchView.this.x, 0.0f);
                SwitchView.this.v.start();
                if (SwitchView.this.ac != null && SwitchView.this.t != SwitchView.this.ae) {
                    OnSwitchStateChangeListener onSwitchStateChangeListener = SwitchView.this.ac;
                    SwitchView switchView5 = SwitchView.this;
                    onSwitchStateChangeListener.onSwitchStateChange(switchView5, switchView5.t);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (motionEvent2 == null || motionEvent2.getX() <= SwitchView.this.e) {
                    if (SwitchView.this.p) {
                        SwitchView.this.p = false;
                        SwitchView.this.aa.setFloatValues(SwitchView.this.ad, 0.0f);
                        SwitchView.this.aa.start();
                    }
                } else if (!SwitchView.this.p) {
                    SwitchView.this.p = true;
                    SwitchView.this.aa.setFloatValues(SwitchView.this.ad, 1.0f);
                    SwitchView.this.aa.start();
                    SwitchView.this.o.setFloatValues(SwitchView.this.l, 0.0f);
                    SwitchView.this.o.start();
                }
                return true;
            }
        };
        this.l = 1.0f;
        int color = Color.parseColor("#00CCFF");
        this.am = color;
        this.i = f9406b;
        this.r = true;
        this.q = false;
        this.ai = 4;
        this.al = color;
        this.ah = 0;
        this.u = new RectF();
        this.n = new RectF();
        this.af = new RectF();
        this.ag = new Paint(1);
        GestureDetector gestureDetector = new GestureDetector(context, this.f);
        this.h = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        setLayerType(1, null);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, this.f9407a, this.l, 1.0f);
        this.o = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(300L);
        this.o.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, this.w, this.x, 1.0f);
        this.v = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(300L);
        this.v.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, this.z, this.ad, 1.0f);
        this.aa = objectAnimatorOfFloat3;
        objectAnimatorOfFloat3.setDuration(300L);
        this.aa.setInterpolator(new DecelerateInterpolator());
    }

    public void setOnSwitchStateChangeListener(OnSwitchStateChangeListener onSwitchStateChangeListener) {
        this.ac = onSwitchStateChangeListener;
    }

    void setInnerContentRate(float f) {
        this.l = f;
        invalidate();
    }

    float getInnerContentRate() {
        return this.l;
    }

    void setKnobExpandRate(float f) {
        this.x = f;
        invalidate();
    }

    float getKnobExpandRate() {
        return this.x;
    }

    void setKnobMoveRate(float f) {
        this.ad = f;
        invalidate();
    }

    float getKnobMoveRate() {
        return this.ad;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        this.q = true;
        if (this.r) {
            boolean z2 = this.t;
            this.p = z2;
            b(z2);
            this.v.setFloatValues(this.x, 0.0f);
            this.v.start();
            OnSwitchStateChangeListener onSwitchStateChangeListener = this.ac;
            if (onSwitchStateChangeListener != null && (z = this.t) != this.ae) {
                onSwitchStateChangeListener.onSwitchStateChange(this, z);
            }
            this.r = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            this.aa.setFloatValues(this.ad, 1.0f);
            this.aa.start();
            this.o.setFloatValues(this.l, 0.0f);
            this.o.start();
            return;
        }
        this.aa.setFloatValues(this.ad, 0.0f);
        this.aa.start();
        this.o.setFloatValues(this.l, 1.0f);
        this.o.start();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.an = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.g = size;
        int i3 = this.an;
        float f = i3;
        if (size / f < 0.33333f) {
            this.g = (int) (f * 0.33333f);
            super.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(this.g, View.MeasureSpec.getMode(i2)));
        }
        this.e = this.an / 2;
        int i4 = this.g / 2;
        this.f9408c = i4;
        int i5 = this.ah;
        this.j = i4 - i5;
        this.n.left = this.ab + i5;
        this.n.top = this.ab + this.ah;
        this.n.right = (this.an - this.ab) - this.ah;
        this.n.bottom = (this.g - this.ab) - this.ah;
        this.k = this.n.width();
        this.m = this.n.height();
        this.u.left = this.ai + this.ah;
        this.u.top = this.ai + this.ah;
        this.u.right = (this.g - this.ai) - this.ah;
        this.u.bottom = (this.g - this.ai) - this.ah;
        this.s = this.u.height();
        float f2 = this.an * 0.7f;
        this.y = f2;
        if (f2 > this.u.width() * 1.25f) {
            this.y = this.u.width() * 1.25f;
        }
    }

    public SwitchView d(boolean z) {
        e(z, false);
        return this;
    }

    private void e(boolean z, boolean z2) {
        boolean z3;
        if (this.t == z) {
            return;
        }
        if (!this.q && z2) {
            this.r = true;
            this.t = z;
            return;
        }
        this.t = z;
        this.p = z;
        if (!z2) {
            if (z) {
                setKnobMoveRate(1.0f);
                setInnerContentRate(0.0f);
            } else {
                setKnobMoveRate(0.0f);
                setInnerContentRate(1.0f);
            }
            setKnobExpandRate(0.0f);
        } else {
            b(z);
            this.v.setFloatValues(this.x, 0.0f);
            this.v.start();
        }
        OnSwitchStateChangeListener onSwitchStateChangeListener = this.ac;
        if (onSwitchStateChangeListener == null || (z3 = this.t) == this.ae) {
            return;
        }
        onSwitchStateChangeListener.onSwitchStateChange(this, z3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            if (!this.p) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, this.f9407a, this.l, 1.0f);
                this.o = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(300L);
                this.o.setInterpolator(new DecelerateInterpolator());
                this.o.start();
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, this.w, this.x, 0.0f);
            this.v = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(300L);
            this.v.setInterpolator(new DecelerateInterpolator());
            this.v.start();
            boolean z = this.p;
            this.t = z;
            OnSwitchStateChangeListener onSwitchStateChangeListener = this.ac;
            if (onSwitchStateChangeListener != null && z != this.ae) {
                onSwitchStateChangeListener.onSwitchStateChange(this, z);
            }
        }
        return this.h.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            this.am = this.al;
        } else {
            this.am = c(0.5f, this.al, -1);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        float f = this.k / 2.0f;
        float f2 = this.l;
        float f3 = f * f2;
        float f4 = (this.m / 2.0f) * f2;
        this.n.left = this.e - f3;
        this.n.top = this.f9408c - f4;
        this.n.right = this.e + f3;
        this.n.bottom = this.f9408c + f4;
        float f5 = this.s;
        float f6 = f5 + ((this.y - f5) * this.x);
        if (this.u.left + (this.u.width() / 2.0f) > this.e) {
            RectF rectF = this.u;
            rectF.left = rectF.right - f6;
        } else {
            RectF rectF2 = this.u;
            rectF2.right = rectF2.left + f6;
        }
        float fWidth = this.u.width();
        float f7 = this.an;
        int i = this.ah + this.ai;
        float f8 = this.ad;
        this.i = this.am;
        this.u.left = i + (((f7 - fWidth) - (i * 2)) * f8);
        RectF rectF3 = this.u;
        rectF3.right = rectF3.left + fWidth;
        this.ag.setColor(this.i);
        this.ag.setStyle(Paint.Style.FILL);
        int i2 = this.ah;
        float f9 = i2;
        a(f9, f9, this.an - i2, this.g - i2, this.j, canvas, this.ag);
        this.ag.setColor(f9406b);
        RectF rectF4 = this.n;
        canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, this.n.height() / 2.0f, this.ag);
        this.ag.setShadowLayer(2.0f, 0.0f, this.ah / 2.0f, isEnabled() ? 536870912 : 268435456);
        this.ag.setColor(d);
        RectF rectF5 = this.u;
        float f10 = this.j - this.ab;
        canvas.drawRoundRect(rectF5, f10, f10, this.ag);
        this.ag.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    private void a(float f, float f2, float f3, float f4, float f5, Canvas canvas, Paint paint) {
        this.af.left = f;
        this.af.top = f2;
        this.af.right = f3;
        this.af.bottom = f4;
        canvas.drawRoundRect(this.af, f5, f5, paint);
    }
}
