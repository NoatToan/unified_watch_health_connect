package com.huami.ui.widget.sleepdial;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
class DragChangeTimeView extends View {
    private static final double A0 = 6.283185307179586d;
    private static final float B0 = 6.2831855f;
    private static final double C0 = 12.566370614359172d;
    private static final float D0 = 12.566371f;
    private static final String R = "CircleTimerView";
    private static final String S = "instance_status";
    private static final String T = "status_radian";
    private static final float U = 18.0f;
    private static final float V = 10.0f;
    private static final float W = 5.0f;
    private static final float m0 = 14.0f;
    private static final float n0 = 0.0f;
    private static final float o0 = 14.0f;
    private static final float p0 = 18.0f;
    private static final int q0 = 300;
    private static final int r0 = -1449255;
    private static final int t0 = -9910825;
    private static final int u0 = 0;
    private static final int w0 = 0;
    private float A;
    private float B;
    private float C;
    private float D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private VectorDrawableCompat I;
    private VectorDrawableCompat J;
    private OnTimeChangedListener K;
    private VibrateService L;
    private ScrollWrapper M;
    private RectF N;
    private Rect O;
    private int P;
    public boolean Q;
    private float a;
    private Paint b;
    private Paint c;
    private Paint d;
    private Paint e;
    private Paint f;
    private Paint g;
    private Paint h;
    private Paint i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private LinearGradient x;
    private float y;
    private float z;
    private static final int s0 = Color.parseColor("#CCFFFFFF");
    private static final int v0 = Color.parseColor("#CCFFFFFF");
    private static final int x0 = Color.parseColor("#CCCCCC");
    private static final int[] y0 = {Color.parseColor("#5E4EEC"), Color.parseColor("#B95BFF")};
    private static final float[] z0 = {0.0f, 1.0f};

    public class a implements Runnable {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DragChangeTimeView.this.K != null) {
                if (DragChangeTimeView.this.G) {
                    DragChangeTimeView.this.K.start(this.a * 5);
                } else {
                    DragChangeTimeView.this.K.end(this.a * 5);
                }
            }
            if ((this.a * 5) % 15 == 0) {
                int i = DragChangeTimeView.this.P;
                int i2 = this.a;
                if (i != i2) {
                    DragChangeTimeView.this.P = i2;
                    DragChangeTimeView.this.v();
                }
            }
        }
    }

    public DragChangeTimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = 0;
        this.r = 0;
        this.N = null;
        this.O = new Rect();
        this.P = 0;
        this.Q = false;
        m();
    }

    private void g(@NotNull Canvas canvas, RectF rectF) {
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.i);
    }

    private void h(float f, @NotNull Canvas canvas) {
        canvas.restore();
        canvas.save();
        double d = ((double) f) - 1.5707963267948966d;
        double d2 = this.A - this.j;
        int iCos = (int) (Math.cos(d) * d2);
        int iSin = (int) (Math.sin(d) * d2);
        VectorDrawableCompat vectorDrawableCompat = this.I;
        float f2 = this.A;
        vectorDrawableCompat.setBounds(t(iCos + f2, iSin + f2, this.m));
        this.I.draw(canvas);
    }

    private void i(float f, @NotNull Canvas canvas) {
        canvas.restore();
        canvas.save();
        double d = ((double) f) - 1.5707963267948966d;
        double d2 = this.A - this.j;
        int iCos = (int) (Math.cos(d) * d2);
        int iSin = (int) (Math.sin(d) * d2);
        VectorDrawableCompat vectorDrawableCompat = this.J;
        float f2 = this.A;
        vectorDrawableCompat.setBounds(t(iCos + f2, iSin + f2, this.m));
        this.J.draw(canvas);
    }

    private float j(@NotNull Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds("1", 0, 1, rect);
        return rect.height();
    }

    private float k(float f, float f2) {
        float fAtan = (float) Math.atan((f - this.y) / (this.z - f2));
        float f3 = this.y;
        if ((f <= f3 || f2 <= this.z) && (f >= f3 || f2 <= this.z)) {
            return (f >= f3 || f2 >= this.z) ? fAtan : (float) (((double) fAtan) + A0);
        }
        return (float) (((double) fAtan) + 3.141592653589793d);
    }

    private void l() {
        this.x = new LinearGradient(0.0f, 0.0f, this.q, this.r, y0, z0, Shader.TileMode.CLAMP);
    }

    private void m() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.a = TypedValue.applyDimension(1, 18.0f, displayMetrics) / TypedValue.applyDimension(1, 300.0f, displayMetrics);
        this.k = TypedValue.applyDimension(1, 10.0f, getContext().getResources().getDisplayMetrics());
        this.l = TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics());
        this.m = TypedValue.applyDimension(1, 14.0f, getContext().getResources().getDisplayMetrics());
        this.n = TypedValue.applyDimension(1, 0.0f, getContext().getResources().getDisplayMetrics());
        this.o = TypedValue.applyDimension(1, 14.0f, getContext().getResources().getDisplayMetrics());
        this.p = TypedValue.applyDimension(1, 18.0f, getContext().getResources().getDisplayMetrics());
        this.s = r0;
        this.t = s0;
        this.u = t0;
        this.v = 0;
        this.w = 0;
        this.b = new Paint(1);
        this.e = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.f = new Paint(1);
        this.g = new Paint(1);
        this.h = new Paint(1);
        this.b.setColor(this.s);
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setStrokeWidth(this.n);
        this.e.setColor(this.t);
        this.e.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL);
        this.d.setStrokeWidth((this.m * 2.0f) + 8.0f);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setShader(this.x);
        this.c.setColor(this.u);
        this.c.setStrokeWidth(this.l);
        this.f.setColor(this.v);
        this.f.setTextSize(this.o);
        this.f.setTextAlign(Paint.Align.CENTER);
        this.g.setColor(this.w);
        this.g.setTextSize(this.p);
        this.g.setTextAlign(Paint.Align.CENTER);
        this.h.setColor(v0);
        this.h.setTextAlign(Paint.Align.CENTER);
        this.h.setTextSize(this.o);
        this.I = VectorDrawableCompat.create(getResources(), R.drawable.ic_enter_sleep, null);
        this.J = VectorDrawableCompat.create(getResources(), R.drawable.ic_wake_up, null);
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStrokeWidth((this.m * 2.0f) + 8.0f);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setColor(x0);
    }

    private boolean n(float f, float f2) {
        double d = (this.A - (this.n / 2.0f)) - this.j;
        float fSin = f - ((float) (((double) this.y) + (Math.sin(this.C) * d)));
        float fCos = f2 - ((float) (((double) this.z) - (d * Math.cos(this.C))));
        return Math.sqrt((double) ((fSin * fSin) + (fCos * fCos))) < ((double) this.m);
    }

    private boolean o(float f, float f2) {
        double d = (this.A - (this.n / 2.0f)) - this.j;
        float fSin = f - ((float) (((double) this.y) + (Math.sin(this.B) * d)));
        float fCos = f2 - ((float) (((double) this.z) - (d * Math.cos(this.B))));
        return Math.sqrt((double) ((fSin * fSin) + (fCos * fCos))) < ((double) this.m);
    }

    private void r(int i) {
        post(new a(i));
    }

    private Rect t(float f, float f2, float f3) {
        this.O.set((int) (f - f3), (int) (f2 - f3), (int) (f + f3), (int) (f2 + f3));
        return this.O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        VibrateService vibrateService = this.L;
        if (vibrateService == null) {
            return;
        }
        vibrateService.vibrate();
    }

    public void f(ScrollWrapper scrollWrapper) {
        this.M = scrollWrapper;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VibrateService vibrateService = this.L;
        if (vibrateService != null) {
            vibrateService.clear();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.save();
        canvas.rotate(-90.0f, this.y, this.z);
        if (this.N == null) {
            float f = this.y;
            float f2 = this.A;
            float f3 = this.n;
            float f4 = this.j;
            float f5 = this.z;
            this.N = new RectF(f - ((f2 - (f3 / 2.0f)) - f4), f5 - ((f2 - (f3 / 2.0f)) - f4), f + ((f2 - (f3 / 2.0f)) - f4), f5 + ((f2 - (f3 / 2.0f)) - f4));
        }
        this.d.setShader(this.x);
        float f6 = this.C;
        float f7 = this.B;
        if (f6 > A0) {
            f6 = (float) (((double) f6) - A0);
        }
        float f8 = f6;
        if (f7 > A0) {
            f7 = (float) (((double) f7) - A0);
        }
        float f9 = f7;
        g(canvas, this.N);
        if (f8 > f9) {
            double d = f8;
            canvas.drawArc(this.N, (float) Math.toDegrees(d), (((float) Math.toDegrees(A0)) - ((float) Math.toDegrees(d))) + ((float) Math.toDegrees(f9)), false, this.d);
        } else {
            double d2 = f8;
            canvas.drawArc(this.N, (float) Math.toDegrees(d2), ((float) Math.toDegrees(f9)) - ((float) Math.toDegrees(d2)), false, this.d);
        }
        canvas.restore();
        canvas.save();
        canvas.rotate((float) Math.toDegrees(this.B), this.y, this.z);
        canvas.drawCircle(this.y, (this.z - this.A) + (this.n / 2.0f) + this.j, 0.01f, this.d);
        canvas.restore();
        canvas.save();
        canvas.rotate((float) Math.toDegrees(this.C), this.y, this.z);
        canvas.drawCircle(this.y, (this.z - this.A) + (this.n / 2.0f) + this.j, 0.01f, this.d);
        canvas.restore();
        canvas.save();
        h(f8, canvas);
        i(f9, canvas);
        canvas.restore();
        canvas.save();
        r(this.H);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.q = View.MeasureSpec.getSize(i2);
        int size = View.MeasureSpec.getSize(i);
        this.r = size;
        float f = this.a;
        int i3 = this.q;
        float f2 = f * i3;
        this.j = f2;
        this.y = i3 / 2;
        this.z = size / 2;
        float f3 = this.n;
        float f4 = f2 + f3;
        float f5 = this.m;
        if (f4 >= f5) {
            this.A = (i3 / 2) - (f3 / 2.0f);
        } else {
            this.A = (i3 / 2) - ((f5 - f2) - (f3 / 2.0f));
        }
        l();
        setMeasuredDimension(this.q, this.r);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(S));
        float f = bundle.getFloat(T);
        this.B = f;
        this.H = (int) (f * 9.549296f * 60.0f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(S, super.onSaveInstanceState());
        bundle.putFloat(T, this.B);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int action = motionEvent.getAction() & motionEvent.getActionMasked();
        if (action == 0) {
            if (o(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
                this.E = true;
                this.G = false;
                this.D = k(motionEvent.getX(), motionEvent.getY());
            } else if (n(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
                this.F = true;
                this.G = true;
                this.D = k(motionEvent.getX(), motionEvent.getY());
            }
            this.Q = false;
        } else if (action == 1) {
            if (this.E && isEnabled()) {
                this.E = false;
            } else if (this.F && isEnabled()) {
                this.F = false;
            }
            this.Q = false;
        } else if (action == 2) {
            if (this.E && isEnabled()) {
                float fK = k(motionEvent.getX(), motionEvent.getY());
                if (this.D > Math.toRadians(270.0d) && fK < Math.toRadians(90.0d)) {
                    this.D = (float) (((double) this.D) - A0);
                } else if (this.D < Math.toRadians(90.0d)) {
                    double d = fK;
                    if (d > Math.toRadians(270.0d)) {
                        this.D = (float) ((d + (d - A0)) - ((double) this.D));
                    }
                }
                float f = this.B + (fK - this.D);
                this.B = f;
                this.D = fK;
                if (f > D0) {
                    this.B = f - D0;
                }
                float f2 = this.B;
                if (f2 < 0.0f) {
                    this.B = f2 + D0;
                }
                this.H = (int) (this.B * 22.918312f);
                postInvalidate();
                this.Q = true;
            } else if (this.F && isEnabled()) {
                float fK2 = k(motionEvent.getX(), motionEvent.getY());
                if (this.D > Math.toRadians(270.0d) && fK2 < Math.toRadians(90.0d)) {
                    this.D = (float) (((double) this.D) - A0);
                } else if (this.D < Math.toRadians(90.0d)) {
                    double d2 = fK2;
                    if (d2 > Math.toRadians(270.0d)) {
                        this.D = (float) ((d2 + (d2 - A0)) - ((double) this.D));
                    }
                }
                float f3 = this.C + (fK2 - this.D);
                this.C = f3;
                this.D = fK2;
                if (f3 > D0) {
                    this.C = f3 - D0;
                }
                float f4 = this.C;
                if (f4 < 0.0f) {
                    this.C = f4 + D0;
                }
                this.H = (int) (this.C * 22.918312f);
                postInvalidate();
                this.Q = true;
            }
        }
        ScrollWrapper scrollWrapper = this.M;
        if (scrollWrapper != null) {
            scrollWrapper.requestDisallowInterceptTouchEvent(this.Q);
        }
        return true;
    }

    public void p(OnTimeChangedListener onTimeChangedListener) {
        if (onTimeChangedListener != null) {
            this.K = onTimeChangedListener;
        }
    }

    public void q(VibrateService vibrateService) {
        this.L = vibrateService;
    }

    public void s(int i) {
        this.G = true;
        if (i == 0) {
            this.C = 0.0f;
        } else {
            this.C = (float) ((((double) i) / 720.0d) * 3.141592653589793d * 2.0d);
        }
        this.H = (int) (this.C * 22.918312f);
        postInvalidate();
    }

    public void u(int i) {
        this.G = false;
        if (i == 0) {
            this.B = 0.0f;
        } else {
            this.B = (float) ((((double) i) / 720.0d) * 3.141592653589793d * 2.0d);
        }
        this.H = (int) (this.B * 22.918312f);
        postInvalidate();
    }

    public DragChangeTimeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DragChangeTimeView(Context context) {
        this(context, null);
    }
}
