package com.xiaomi.hm.health.view;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.huami.chart.template.ColorTemplate;
import com.xiaomi.hm.health.R;

/* JADX INFO: loaded from: classes22.dex */
public class SwitchButton extends View implements Checkable {
    private static final int u0 = t(58.0f);
    private static final int v0 = t(36.0f);
    private int A;
    private int B;
    private float C;
    private float D;
    private float E;
    private float F;
    private int G;
    private int H;
    private float I;
    private float J;
    private Paint K;
    private Paint L;
    private d M;
    private d N;
    private d O;
    private RectF P;
    private int Q;
    private ValueAnimator R;
    private final ArgbEvaluator S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private int g;
    private int h;
    private int i;
    private float j;
    private float k;
    private float l;
    private float m;
    private boolean m0;
    private float n;
    private boolean n0;
    private float o;
    private boolean o0;
    private float p;
    private OnCheckedChangeListener p0;
    private float q;
    private long q0;
    private float r;
    private Runnable r0;
    private float s;
    private ValueAnimator.AnimatorUpdateListener s0;
    private int t;
    private Animator.AnimatorListener t0;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private float z;

    public interface OnCheckedChangeListener {
        void onCheckedChanged(SwitchButton view, boolean isChecked);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SwitchButton.this.A()) {
                return;
            }
            SwitchButton.this.I();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            float fFloatValue = ((Float) animation.getAnimatedValue()).floatValue();
            int i = SwitchButton.this.Q;
            if (i == 1 || i == 3 || i == 4) {
                SwitchButton.this.M.c = ((Integer) SwitchButton.this.S.evaluate(fFloatValue, Integer.valueOf(SwitchButton.this.N.c), Integer.valueOf(SwitchButton.this.O.c))).intValue();
                SwitchButton.this.M.d = SwitchButton.this.N.d + ((SwitchButton.this.O.d - SwitchButton.this.N.d) * fFloatValue);
                if (SwitchButton.this.Q != 1) {
                    SwitchButton.this.M.a = SwitchButton.this.N.a + ((SwitchButton.this.O.a - SwitchButton.this.N.a) * fFloatValue);
                }
                SwitchButton.this.M.b = ((Integer) SwitchButton.this.S.evaluate(fFloatValue, Integer.valueOf(SwitchButton.this.N.b), Integer.valueOf(SwitchButton.this.O.b))).intValue();
            } else if (i == 5) {
                SwitchButton.this.M.a = SwitchButton.this.N.a + ((SwitchButton.this.O.a - SwitchButton.this.N.a) * fFloatValue);
                float f = (SwitchButton.this.M.a - SwitchButton.this.I) / (SwitchButton.this.J - SwitchButton.this.I);
                SwitchButton.this.M.b = ((Integer) SwitchButton.this.S.evaluate(f, Integer.valueOf(SwitchButton.this.u), Integer.valueOf(SwitchButton.this.v))).intValue();
                SwitchButton.this.M.d = SwitchButton.this.j * f;
                SwitchButton.this.M.c = ((Integer) SwitchButton.this.S.evaluate(f, 0, Integer.valueOf(SwitchButton.this.x))).intValue();
            }
            SwitchButton.this.postInvalidate();
        }
    }

    public class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            int i = SwitchButton.this.Q;
            if (i == 1) {
                SwitchButton.this.Q = 2;
                SwitchButton.this.M.c = 0;
                SwitchButton.this.M.d = SwitchButton.this.j;
                SwitchButton.this.postInvalidate();
                return;
            }
            if (i == 3) {
                SwitchButton.this.Q = 0;
                SwitchButton.this.postInvalidate();
                return;
            }
            if (i == 4) {
                SwitchButton.this.Q = 0;
                SwitchButton.this.postInvalidate();
                SwitchButton.this.r();
            } else {
                if (i != 5) {
                    return;
                }
                SwitchButton switchButton = SwitchButton.this;
                switchButton.T = true ^ switchButton.T;
                SwitchButton.this.Q = 0;
                SwitchButton.this.postInvalidate();
                SwitchButton.this.r();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    public static class d {
        public float a;
        public int b;
        public int c;
        public float d;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(d source) {
            this.a = source.a;
            this.b = source.b;
            this.c = source.c;
            this.d = source.d;
        }
    }

    public SwitchButton(Context context) {
        super(context);
        this.a = 0;
        this.b = 1;
        this.c = 2;
        this.d = 3;
        this.e = 4;
        this.f = 5;
        this.P = new RectF();
        this.Q = 0;
        this.S = new ArgbEvaluator();
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.r0 = new a();
        this.s0 = new b();
        this.t0 = new c();
        y(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A() {
        return this.Q != 0;
    }

    private boolean B() {
        int i = this.Q;
        return i == 1 || i == 3;
    }

    private static boolean C(TypedArray typedArray, int index, boolean def) {
        return typedArray == null ? def : typedArray.getBoolean(index, def);
    }

    private static int D(TypedArray typedArray, int index, int def) {
        return typedArray == null ? def : typedArray.getColor(index, def);
    }

    private static int E(TypedArray typedArray, int index, int def) {
        return typedArray == null ? def : typedArray.getInt(index, def);
    }

    private static float F(TypedArray typedArray, int index, float def) {
        return typedArray == null ? def : typedArray.getDimension(index, def);
    }

    private static int G(TypedArray typedArray, int index, int def) {
        return typedArray == null ? def : typedArray.getDimensionPixelOffset(index, def);
    }

    private void H() {
        if (z() || B()) {
            if (this.R.isRunning()) {
                this.R.cancel();
            }
            this.Q = 3;
            this.N.b(this.M);
            if (isChecked()) {
                setCheckedViewState(this.O);
            } else {
                setUncheckViewState(this.O);
            }
            this.R.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        if (!A() && this.m0) {
            if (this.R.isRunning()) {
                this.R.cancel();
            }
            this.Q = 1;
            this.N.b(this.M);
            this.O.b(this.M);
            if (isChecked()) {
                d dVar = this.O;
                int i = this.v;
                dVar.b = i;
                dVar.a = this.J;
                dVar.c = i;
            } else {
                d dVar2 = this.O;
                dVar2.b = this.u;
                dVar2.a = this.I;
                dVar2.d = this.j;
            }
            this.R.start();
        }
    }

    private void J() {
        if (this.R.isRunning()) {
            this.R.cancel();
        }
        this.Q = 4;
        this.N.b(this.M);
        if (isChecked()) {
            setCheckedViewState(this.O);
        } else {
            setUncheckViewState(this.O);
        }
        this.R.start();
    }

    private void K(boolean animate, boolean broadcast) {
        if (isEnabled()) {
            if (this.o0) {
                throw new RuntimeException("should NOT switch the state in method: [onCheckedChanged]!");
            }
            if (!this.n0) {
                this.T = !this.T;
                if (broadcast) {
                    r();
                    return;
                }
                return;
            }
            if (this.R.isRunning()) {
                this.R.cancel();
            }
            if (this.U && animate) {
                this.Q = 5;
                this.N.b(this.M);
                if (isChecked()) {
                    setUncheckViewState(this.O);
                } else {
                    setCheckedViewState(this.O);
                }
                this.R.start();
                return;
            }
            this.T = !this.T;
            if (isChecked()) {
                setCheckedViewState(this.M);
            } else {
                setUncheckViewState(this.M);
            }
            postInvalidate();
            if (broadcast) {
                r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        OnCheckedChangeListener onCheckedChangeListener = this.p0;
        if (onCheckedChangeListener != null) {
            this.o0 = true;
            onCheckedChangeListener.onCheckedChanged(this, isChecked());
        }
        this.o0 = false;
    }

    private static float s(float dp) {
        return TypedValue.applyDimension(1, dp, Resources.getSystem().getDisplayMetrics());
    }

    private void setCheckedViewState(d viewState) {
        viewState.d = this.j;
        viewState.b = this.v;
        viewState.c = this.x;
        viewState.a = this.J;
        this.K.setColor(this.H);
    }

    private void setUncheckViewState(d viewState) {
        viewState.d = 0.0f;
        viewState.b = this.u;
        viewState.c = 0;
        viewState.a = this.I;
        this.K.setColor(this.G);
    }

    private static int t(float dp) {
        return (int) s(dp);
    }

    private void u(Canvas canvas, float left, float top, float right, float bottom, float startAngle, float sweepAngle, Paint paint) {
        canvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, true, paint);
    }

    private void v(Canvas canvas, float x, float y) {
        canvas.drawCircle(x, y, this.k, this.K);
        this.L.setStyle(Paint.Style.STROKE);
        this.L.setStrokeWidth(1.0f);
        this.L.setColor(-2236963);
        canvas.drawCircle(x, y, this.k, this.L);
    }

    private void w(Canvas canvas, float left, float top, float right, float bottom, float backgroundRadius, Paint paint) {
        canvas.drawRoundRect(left, top, right, bottom, backgroundRadius, backgroundRadius, paint);
    }

    private void x(Canvas canvas) {
        drawUncheckIndicator(canvas, this.A, this.B, this.p - this.C, this.s, this.D, this.L);
    }

    private void y(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = attrs != null ? context.obtainStyledAttributes(attrs, R.styleable.SwitchButton) : null;
        this.V = C(typedArrayObtainStyledAttributes, 11, true);
        this.A = D(typedArrayObtainStyledAttributes, 17, -5592406);
        this.B = G(typedArrayObtainStyledAttributes, 19, t(1.5f));
        this.C = s(10.0f);
        this.D = F(typedArrayObtainStyledAttributes, 18, s(4.0f));
        this.E = s(4.0f);
        this.F = s(4.0f);
        this.g = G(typedArrayObtainStyledAttributes, 13, t(0.0f));
        this.h = G(typedArrayObtainStyledAttributes, 12, t(0.0f));
        this.i = D(typedArrayObtainStyledAttributes, 10, ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR);
        this.u = D(typedArrayObtainStyledAttributes, 15, -2236963);
        this.v = D(typedArrayObtainStyledAttributes, 4, -11414681);
        this.w = G(typedArrayObtainStyledAttributes, 1, t(1.0f));
        this.x = D(typedArrayObtainStyledAttributes, 6, -1);
        this.y = G(typedArrayObtainStyledAttributes, 7, t(1.0f));
        this.z = s(6.0f);
        int iD = D(typedArrayObtainStyledAttributes, 2, -1);
        this.G = D(typedArrayObtainStyledAttributes, 16, iD);
        this.H = D(typedArrayObtainStyledAttributes, 5, iD);
        int iE = E(typedArrayObtainStyledAttributes, 8, 300);
        this.T = C(typedArrayObtainStyledAttributes, 3, false);
        this.W = C(typedArrayObtainStyledAttributes, 14, true);
        this.t = D(typedArrayObtainStyledAttributes, 0, -1);
        this.U = C(typedArrayObtainStyledAttributes, 9, true);
        if (typedArrayObtainStyledAttributes != null) {
            typedArrayObtainStyledAttributes.recycle();
        }
        this.L = new Paint(1);
        Paint paint = new Paint(1);
        this.K = paint;
        paint.setColor(iD);
        if (this.V) {
            this.K.setShadowLayer(this.g, 0.0f, this.h, this.i);
        }
        this.M = new d();
        this.N = new d();
        this.O = new d();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(iE);
        this.R.setRepeatCount(0);
        this.R.addUpdateListener(this.s0);
        this.R.addListener(this.t0);
        super.setClickable(true);
        setPadding(0, 0, 0, 0);
        setLayerType(1, null);
    }

    private boolean z() {
        return this.Q == 2;
    }

    public void drawCheckedIndicator(Canvas canvas) {
        int i = this.M.c;
        float f = this.y;
        float f2 = this.n;
        float f3 = this.j;
        float f4 = (f2 + f3) - this.E;
        float f5 = this.s;
        float f6 = this.z;
        drawCheckedIndicator(canvas, i, f, f4, f5 - f6, (f2 + f3) - this.F, f5 + f6, this.L);
    }

    public void drawUncheckIndicator(Canvas canvas, int color, float lineWidth, float centerX, float centerY, float radius, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(color);
        paint.setStrokeWidth(lineWidth);
        canvas.drawCircle(centerX, centerY, radius, paint);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.T;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.L.setStrokeWidth(this.w);
        this.L.setStyle(Paint.Style.FILL);
        this.L.setColor(this.t);
        w(canvas, this.n, this.o, this.p, this.q, this.j, this.L);
        this.L.setStyle(Paint.Style.STROKE);
        this.L.setColor(this.u);
        w(canvas, this.n, this.o, this.p, this.q, this.j, this.L);
        if (this.W) {
            x(canvas);
        }
        float f = this.M.d * 0.5f;
        this.L.setStyle(Paint.Style.STROKE);
        this.L.setColor(this.M.b);
        this.L.setStrokeWidth(this.w + (f * 2.0f));
        w(canvas, this.n + f, this.o + f, this.p - f, this.q - f, this.j, this.L);
        this.L.setStyle(Paint.Style.FILL);
        this.L.setStrokeWidth(1.0f);
        float f2 = this.n;
        float f3 = this.o;
        float f4 = this.j;
        u(canvas, f2, f3, f2 + (f4 * 2.0f), f3 + (f4 * 2.0f), 90.0f, 180.0f, this.L);
        float f5 = this.n;
        float f6 = this.j;
        float f7 = this.o;
        canvas.drawRect(f5 + f6, f7, this.M.a, f7 + (f6 * 2.0f), this.L);
        if (this.W) {
            drawCheckedIndicator(canvas);
        }
        v(canvas, this.M.a, this.s);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == 0 || mode == Integer.MIN_VALUE) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(u0, 1073741824);
        }
        if (mode2 == 0 || mode2 == Integer.MIN_VALUE) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(v0, 1073741824);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float fMax = Math.max(this.g + this.h, this.w);
        float f = h - fMax;
        float f2 = f - fMax;
        this.l = f2;
        float f3 = w - fMax;
        this.m = f3 - fMax;
        float f4 = f2 * 0.5f;
        this.j = f4;
        this.k = f4 - this.w;
        this.n = fMax;
        this.o = fMax;
        this.p = f3;
        this.q = f;
        this.r = (fMax + f3) * 0.5f;
        this.s = (f + fMax) * 0.5f;
        this.I = fMax + f4;
        this.J = f3 - f4;
        if (isChecked()) {
            setCheckedViewState(this.M);
        } else {
            setUncheckViewState(this.M);
        }
        this.n0 = true;
        postInvalidate();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.m0 = true;
            this.q0 = System.currentTimeMillis();
            removeCallbacks(this.r0);
            postDelayed(this.r0, 100L);
        } else if (actionMasked == 1) {
            this.m0 = false;
            removeCallbacks(this.r0);
            if (System.currentTimeMillis() - this.q0 <= 300) {
                toggle();
            } else if (z()) {
                boolean z = Math.max(0.0f, Math.min(1.0f, event.getX() / ((float) getWidth()))) > 0.5f;
                if (z == isChecked()) {
                    H();
                } else {
                    this.T = z;
                    J();
                }
            } else if (B()) {
                H();
            }
        } else if (actionMasked == 2) {
            float x = event.getX();
            if (B()) {
                float fMax = Math.max(0.0f, Math.min(1.0f, x / getWidth()));
                d dVar = this.M;
                float f = this.I;
                dVar.a = f + ((this.J - f) * fMax);
            } else if (z()) {
                float fMax2 = Math.max(0.0f, Math.min(1.0f, x / getWidth()));
                d dVar2 = this.M;
                float f2 = this.I;
                dVar2.a = f2 + ((this.J - f2) * fMax2);
                dVar2.b = ((Integer) this.S.evaluate(fMax2, Integer.valueOf(this.u), Integer.valueOf(this.v))).intValue();
                postInvalidate();
            }
        } else if (actionMasked == 3) {
            this.m0 = false;
            removeCallbacks(this.r0);
            if (B() || z()) {
                H();
            }
        }
        return true;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (checked == isChecked()) {
            postInvalidate();
        } else {
            K(this.U, false);
        }
    }

    public void setEnableEffect(boolean enable) {
        this.U = enable;
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener l) {
        this.p0 = l;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener l) {
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener l) {
    }

    @Override // android.view.View
    public final void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(0, 0, 0, 0);
    }

    public void setShadowEffect(boolean shadowEffect) {
        if (this.V == shadowEffect) {
            return;
        }
        this.V = shadowEffect;
        if (shadowEffect) {
            this.K.setShadowLayer(this.g, 0.0f, this.h, this.i);
        } else {
            this.K.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        toggle(true);
    }

    public void drawCheckedIndicator(Canvas canvas, int color, float lineWidth, float sx, float sy, float ex, float ey, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(color);
        paint.setStrokeWidth(lineWidth);
        canvas.drawLine(sx, sy, ex, ey, paint);
    }

    public void toggle(boolean animate) {
        K(animate, true);
    }

    public SwitchButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.a = 0;
        this.b = 1;
        this.c = 2;
        this.d = 3;
        this.e = 4;
        this.f = 5;
        this.P = new RectF();
        this.Q = 0;
        this.S = new ArgbEvaluator();
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.r0 = new a();
        this.s0 = new b();
        this.t0 = new c();
        y(context, attrs);
    }

    public SwitchButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = 0;
        this.b = 1;
        this.c = 2;
        this.d = 3;
        this.e = 4;
        this.f = 5;
        this.P = new RectF();
        this.Q = 0;
        this.S = new ArgbEvaluator();
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.r0 = new a();
        this.s0 = new b();
        this.t0 = new c();
        y(context, attrs);
    }

    @TargetApi(21)
    public SwitchButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.a = 0;
        this.b = 1;
        this.c = 2;
        this.d = 3;
        this.e = 4;
        this.f = 5;
        this.P = new RectF();
        this.Q = 0;
        this.S = new ArgbEvaluator();
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.r0 = new a();
        this.s0 = new b();
        this.t0 = new c();
        y(context, attrs);
    }
}
