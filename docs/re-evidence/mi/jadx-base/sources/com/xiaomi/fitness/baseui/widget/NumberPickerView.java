package com.xiaomi.fitness.baseui.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import android.widget.OverScroller;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.n1j;
import defpackage.z4j;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class NumberPickerView extends View {
    public int A;
    public int A0;
    public int B;
    public int B0;
    public int C;
    public int C0;
    public int D;
    public int D0;
    public int E;
    public float E0;
    public int F;
    public float F0;
    public int G;
    public float G0;
    public int H;
    public boolean H0;
    public int I;
    public int I0;
    public int J;
    public int J0;
    public int K;
    public int K0;
    public String L;
    public float L0;
    public String M;
    public float M0;
    public String N;
    public float N0;
    public String O;
    public int O0;
    public float P;
    public int P0;
    public float Q;
    public int Q0;
    public float R;
    public int R0;
    public float S;
    public int S0;
    public float T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11707a;
    public boolean a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11708b;
    public boolean b0;
    public boolean c;
    public boolean c0;
    public int d;
    public boolean d0;
    public int e;
    public boolean e0;
    public int f;
    public OverScroller f0;
    public int g;
    public VelocityTracker g0;
    public String h;
    public Paint h0;
    public int i;
    public Paint i0;
    public int j;
    public TextPaint j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11709k;
    public Paint k0;
    public int l;
    public Rect l0;
    public int m;
    public String[] m0;
    public int n;
    public CharSequence[] n0;
    public int o;
    public CharSequence[] o0;
    public int p;
    public HandlerThread p0;
    public int q;
    public Handler q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11710r;
    public Handler r0;
    public int s;
    public ArgbEvaluator s0;
    public int t;
    public int t0;
    public int u;
    public int u0;
    public int v;
    public Typeface v0;
    public int w;
    public Typeface w0;
    public int x;
    public d x0;
    public int y;
    public e y0;
    public int z;
    public int z0;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int iJ;
            int i;
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                NumberPickerView.this.V(message.arg1, message.arg2, message.obj);
                return;
            }
            int i3 = 0;
            if (!NumberPickerView.this.f0.isFinished()) {
                if (NumberPickerView.this.z0 == 0) {
                    NumberPickerView.this.S(1);
                }
                NumberPickerView.this.q0.sendMessageDelayed(NumberPickerView.this.F(1, 0, 0, message.obj), 32L);
                return;
            }
            if (NumberPickerView.this.P0 != 0) {
                if (NumberPickerView.this.z0 == 0) {
                    NumberPickerView.this.S(1);
                }
                if (NumberPickerView.this.P0 < (-NumberPickerView.this.K0) / 2) {
                    i = (int) (((NumberPickerView.this.K0 + NumberPickerView.this.P0) * 300.0f) / NumberPickerView.this.K0);
                    NumberPickerView.this.f0.startScroll(0, NumberPickerView.this.Q0, 0, NumberPickerView.this.K0 + NumberPickerView.this.P0, i * 3);
                    NumberPickerView numberPickerView = NumberPickerView.this;
                    iJ = numberPickerView.J(numberPickerView.Q0 + NumberPickerView.this.K0 + NumberPickerView.this.P0);
                } else {
                    i = (int) (((-NumberPickerView.this.P0) * 300.0f) / NumberPickerView.this.K0);
                    NumberPickerView.this.f0.startScroll(0, NumberPickerView.this.Q0, 0, NumberPickerView.this.P0, i * 3);
                    NumberPickerView numberPickerView2 = NumberPickerView.this;
                    iJ = numberPickerView2.J(numberPickerView2.Q0 + NumberPickerView.this.P0);
                }
                i3 = i;
                NumberPickerView.this.postInvalidate();
            } else {
                NumberPickerView.this.S(0);
                NumberPickerView numberPickerView3 = NumberPickerView.this;
                iJ = numberPickerView3.J(numberPickerView3.Q0);
            }
            NumberPickerView numberPickerView4 = NumberPickerView.this;
            Message messageF = numberPickerView4.F(2, numberPickerView4.I, iJ, message.obj);
            if (NumberPickerView.this.e0) {
                NumberPickerView.this.r0.sendMessageDelayed(messageF, i3 * 2);
            } else {
                NumberPickerView.this.q0.sendMessageDelayed(messageF, i3 * 2);
            }
        }
    }

    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 2) {
                NumberPickerView.this.V(message.arg1, message.arg2, message.obj);
            } else {
                if (i != 3) {
                    return;
                }
                NumberPickerView.this.postInvalidate();
            }
        }
    }

    public interface c {
    }

    public interface d {
        void onValueChange(NumberPickerView numberPickerView, int i, int i2);
    }

    public interface e {
        void a(NumberPickerView numberPickerView, int i, int i2);
    }

    public interface f {
    }

    public NumberPickerView(Context context) {
        super(context);
        this.d = -13421773;
        this.e = -695533;
        this.f = 436207616;
        this.g = -695533;
        this.i = 0;
        this.j = 0;
        this.f11709k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.f11710r = 0;
        this.s = -695533;
        this.t = 2;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 3;
        this.y = 0;
        this.z = 0;
        this.A = -1;
        this.B = -1;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 150;
        this.K = 8;
        this.P = 1.0f;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        this.U = true;
        this.V = true;
        this.W = false;
        this.a0 = false;
        this.b0 = true;
        this.c0 = false;
        this.d0 = false;
        this.e0 = true;
        this.h0 = new Paint();
        this.i0 = new Paint();
        this.j0 = new TextPaint();
        this.k0 = new Paint();
        this.l0 = new Rect();
        this.t0 = 0;
        this.z0 = 0;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.G0 = 0.0f;
        this.H0 = false;
        this.O0 = 0;
        this.P0 = 0;
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = 0;
        K(context);
    }

    private TextUtils.TruncateAt getEllipsizeType() {
        String str = this.M;
        str.hashCode();
        switch (str) {
            case "middle":
                return TextUtils.TruncateAt.MIDDLE;
            case "end":
                return TextUtils.TruncateAt.END;
            case "start":
                return TextUtils.TruncateAt.START;
            default:
                throw new IllegalArgumentException("Illegal text ellipsize type.");
        }
    }

    public final int A(float f2, int i) {
        float f3 = (((i & (-16777216)) >>> 24) / 255.0f) * f2 * 255.0f;
        float f4 = f3 <= 255.0f ? f3 : 255.0f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        return (16777215 & i) | ((((int) f4) << 24) & (-16777216));
    }

    public final float B(float f2, float f3, float f4) {
        return f3 + ((f4 - f3) * f2);
    }

    public final int C(int i, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (!z) {
            return i;
        }
        int i3 = i % i2;
        return i3 < 0 ? i3 + i2 : i3;
    }

    public final int D(CharSequence[] charSequenceArr, Paint paint) {
        int iMax = 0;
        for (int i = 0; i < getRawContentSize(); i++) {
            String strI = I(i);
            if (strI != null) {
                iMax = Math.max(H(strI, paint), iMax);
            }
        }
        return iMax;
    }

    public final Message E(int i) {
        return F(i, 0, 0, null);
    }

    public final Message F(int i, int i2, int i3, Object obj) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = obj;
        return messageObtain;
    }

    public final float G(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.ascent + fontMetrics.descent) / 2.0f;
    }

    public final int H(CharSequence charSequence, Paint paint) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        return (int) (paint.measureText(charSequence.toString()) + 0.5f);
    }

    public final String I(int i) {
        int i2;
        String[] strArr = this.m0;
        if (strArr == null) {
            i2 = this.C + i;
        } else {
            String str = strArr[i];
            for (int i3 = 0; i3 < str.length(); i3++) {
                if (!Character.isDigit(str.charAt(i3))) {
                    return str;
                }
            }
            i2 = Integer.parseInt(str);
        }
        String strValueOf = String.valueOf(i2);
        if (i2 >= 10) {
            return strValueOf;
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 1; i4 < this.f11708b; i4++) {
            sb.append("0");
        }
        sb.append(strValueOf);
        return sb.toString();
    }

    public final int J(int i) {
        int i2 = this.K0;
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        int i3 = (i / i2) + (this.x / 2);
        int oneRecycleSize = getOneRecycleSize();
        if (this.V && this.b0) {
            z = true;
        }
        int iC = C(i3, oneRecycleSize, z);
        if (iC < 0 || iC >= getOneRecycleSize()) {
            return iC >= getOneRecycleSize() ? this.B : this.A;
        }
        return iC + this.A;
    }

    public final void K(Context context) {
        this.f0 = new OverScroller(context);
        this.J = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.K = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.i == 0) {
            this.i = f0(context, 14.0f);
        }
        if (this.j == 0) {
            this.j = f0(context, 12.0f);
        }
        if (this.f11709k == 0) {
            this.f11709k = f0(context, 16.0f);
        }
        if (this.l == 0) {
            this.l = f0(context, 14.0f);
        }
        if (this.p == 0) {
            this.p = s(context, 8.0f);
        }
        this.i0.setColor(this.w);
        this.i0.setAntiAlias(true);
        this.i0.setStyle(Paint.Style.FILL);
        this.h0.setColor(this.s);
        this.h0.setAntiAlias(true);
        this.h0.setStyle(Paint.Style.STROKE);
        this.h0.setStrokeWidth(this.t);
        this.j0.setColor(this.d);
        this.j0.setAntiAlias(true);
        this.j0.setTextAlign(Paint.Align.CENTER);
        this.v0 = Typeface.create("miui-bold", this.t0);
        this.w0 = Typeface.create("miui-regular", this.t0);
        this.k0.setTypeface(this.v0);
        this.j0.setTypeface(this.v0);
        this.k0.setColor(this.g);
        this.k0.setAntiAlias(true);
        this.k0.setTextSize(this.l);
        int i = this.x;
        if (i % 2 == 0) {
            this.x = i + 1;
        }
        if (this.A == -1 || this.B == -1) {
            q0();
        }
        M();
        setFocusable(true);
        setImportantForAccessibility(1);
    }

    public final void L(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.y3);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == z4j.U3) {
                this.x = typedArrayObtainStyledAttributes.getInt(index, 3);
            } else if (index == z4j.C3) {
                this.s = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == z4j.D3) {
                this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 2);
            } else if (index == z4j.E3) {
                this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == z4j.F3) {
                this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == z4j.W3) {
                this.m0 = q(typedArrayObtainStyledAttributes.getTextArray(index));
            } else if (index == z4j.Y3) {
                this.d = typedArrayObtainStyledAttributes.getColor(index, -13421773);
            } else if (index == z4j.a4) {
                this.e = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == z4j.Z3) {
                this.f = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == z4j.X3) {
                this.g = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == z4j.c4) {
                this.h = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == z4j.e4) {
                this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f0(context, 14.0f));
            } else if (index == z4j.f4) {
                this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f0(context, 12.0f));
            } else if (index == z4j.g4) {
                this.f11709k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f0(context, 16.0f));
            } else if (index == z4j.d4) {
                this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f0(context, 14.0f));
            } else if (index == z4j.O3) {
                this.A = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == z4j.N3) {
                this.B = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == z4j.i4) {
                this.V = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == z4j.T3) {
                this.w = typedArrayObtainStyledAttributes.getColor(index, 0);
            } else if (index == z4j.V3) {
                this.U = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == z4j.H3) {
                this.L = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == z4j.z3) {
                this.O = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == z4j.G3) {
                this.N = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == z4j.M3) {
                this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, s(context, 8.0f));
            } else if (index == z4j.L3) {
                this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, s(context, 8.0f));
            } else if (index == z4j.K3) {
                this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, s(context, 2.0f));
            } else if (index == z4j.J3) {
                this.f11710r = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, s(context, 5.0f));
            } else if (index == z4j.A3) {
                this.n0 = typedArrayObtainStyledAttributes.getTextArray(index);
            } else if (index == z4j.B3) {
                this.o0 = typedArrayObtainStyledAttributes.getTextArray(index);
            } else if (index == z4j.S3) {
                this.d0 = typedArrayObtainStyledAttributes.getBoolean(index, false);
            } else if (index == z4j.R3) {
                this.e0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == z4j.b4) {
                this.M = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == z4j.I3) {
                this.f11707a = typedArrayObtainStyledAttributes.getInt(index, 1);
            } else if (index == z4j.Q3) {
                this.f11708b = typedArrayObtainStyledAttributes.getInt(index, 1);
            } else if (index == z4j.P3) {
                this.c = typedArrayObtainStyledAttributes.getBoolean(index, false);
            } else if (index == z4j.h4) {
                this.t0 = typedArrayObtainStyledAttributes.getInt(index, this.t0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void M() {
        HandlerThread handlerThread = new HandlerThread("HandlerThread-For-Refreshing");
        this.p0 = handlerThread;
        handlerThread.start();
        this.q0 = new a(this.p0.getLooper());
        this.r0 = new b();
    }

    public final void N() {
        r(getPickedIndexRelativeToRaw() - this.A, false);
        this.V = false;
        postInvalidate();
    }

    public final boolean O(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public final int P(int i) {
        if (this.V && this.b0) {
            return i;
        }
        int i2 = this.D0;
        return (i >= i2 && i <= (i2 = this.C0)) ? i : i2;
    }

    public final int Q(int i) {
        int mode = View.MeasureSpec.getMode(i);
        this.S0 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom() + (this.x * (this.F + (this.q * 2)));
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public final int R(int i) {
        int mode = View.MeasureSpec.getMode(i);
        this.R0 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight() + Math.max(this.G, Math.max(this.E, this.H) + (((Math.max(this.m, this.n) != 0 ? this.o : 0) + Math.max(this.m, this.n) + (Math.max(this.m, this.n) == 0 ? 0 : this.p) + (this.f11710r * 2)) * 2));
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    public final void S(int i) {
        if (this.z0 == i) {
            return;
        }
        this.z0 = i;
    }

    public final int T(int i, int i2, int i3, boolean z) {
        if (z) {
            if (i > i3) {
                return (((i - i3) % getOneRecycleSize()) + i2) - 1;
            }
            return i < i2 ? ((i - i2) % getOneRecycleSize()) + i3 + 1 : i;
        }
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    public final void U() {
        VelocityTracker velocityTracker = this.g0;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.g0.recycle();
            this.g0 = null;
        }
    }

    public final void V(int i, int i2, Object obj) {
        d dVar;
        S(0);
        if (i != i2 && ((obj == null || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) && (dVar = this.x0) != null)) {
            int i3 = this.C;
            dVar.onValueChange(this, i + i3, i3 + i2);
        }
        this.I = i2;
        if (this.c0) {
            this.c0 = false;
            N();
        }
    }

    public final void W(int i, int i2) {
        Z(i, i2);
        this.y0.a(this, i, i2);
    }

    public final void X(int i) {
        Y(i, true);
    }

    public final void Y(int i, boolean z) {
        int pickedIndexRelativeToRaw;
        int pickedIndexRelativeToRaw2;
        int i2;
        int i3;
        if ((!this.V || !this.b0) && ((pickedIndexRelativeToRaw2 = (pickedIndexRelativeToRaw = getPickedIndexRelativeToRaw()) + i) > (i2 = this.B) || pickedIndexRelativeToRaw2 < (i2 = this.A))) {
            i = i2 - pickedIndexRelativeToRaw;
        }
        int i4 = this.P0;
        int i5 = this.K0;
        if (i4 < (-i5) / 2) {
            int i6 = i5 + i4;
            int i7 = (int) (((i4 + i5) * 300.0f) / i5);
            i3 = i < 0 ? (-i7) - (i * 300) : i7 + (i * 300);
            i4 = i6;
        } else {
            int i8 = (int) (((-i4) * 300.0f) / i5);
            i3 = i < 0 ? i8 - (i * 300) : i8 + (i * 300);
        }
        int i9 = i4 + (i * i5);
        if (i3 < 300) {
            i3 = 300;
        }
        if (i3 > 600) {
            i3 = 600;
        }
        this.f0.startScroll(0, this.Q0, 0, i9, i3);
        if (z) {
            this.q0.sendMessageDelayed(E(1), i3 / 4);
        } else {
            this.q0.sendMessageDelayed(F(1, 0, 0, new Boolean(z)), i3 / 4);
        }
        postInvalidate();
    }

    public final void Z(int i, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (i == i2 || accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        setContentDescription(y(i2));
        sendAccessibilityEvent(4);
    }

    public void a0(String[] strArr, int i, boolean z) {
        h0();
        if (strArr == null) {
            throw new IllegalArgumentException("newDisplayedValues should not be null.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("pickedIndex should not be negative, now pickedIndex is " + i);
        }
        i0(strArr);
        m0(true);
        o0();
        p0();
        this.I = this.A + i;
        r(i, this.V && this.b0);
        if (z) {
            this.q0.sendMessageDelayed(E(1), 0L);
            postInvalidate();
        }
    }

    public void b0(int i, int i2) {
        c0(i, i2, true);
    }

    public void c0(int i, int i2, boolean z) {
        if (i > i2) {
            throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + i + ", maxShowIndex is " + i2 + ".");
        }
        if (i < 0) {
            throw new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + i2);
        }
        this.A = i;
        this.B = i2;
        if (z) {
            this.I = i;
            r(0, this.V && this.b0);
            postInvalidate();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.K0 != 0 && this.f0.computeScrollOffset()) {
            this.Q0 = this.f0.getCurrY();
            n();
            postInvalidate();
        }
    }

    public void d0(int i) {
        e0(getValue(), i, true);
    }

    public void e0(int i, int i2, boolean z) {
        int oneRecycleSize;
        boolean z2 = false;
        int iT = T(i, this.C, this.D, this.V && this.b0);
        int i3 = this.C;
        int i4 = this.D;
        if (this.V && this.b0) {
            z2 = true;
        }
        int iT2 = T(i2, i3, i4, z2);
        if (this.V && this.b0) {
            oneRecycleSize = iT2 - iT;
            int oneRecycleSize2 = getOneRecycleSize() / 2;
            if (oneRecycleSize < (-oneRecycleSize2) || oneRecycleSize2 < oneRecycleSize) {
                oneRecycleSize = oneRecycleSize > 0 ? oneRecycleSize - getOneRecycleSize() : oneRecycleSize + getOneRecycleSize();
            }
        } else {
            oneRecycleSize = iT2 - iT;
        }
        setValue(iT);
        if (iT == iT2) {
            return;
        }
        Y(oneRecycleSize, z);
    }

    public final int f0(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final void g0() {
        Handler handler = this.q0;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    public String getContentByCurrValue() {
        return I(getValue() - this.C);
    }

    public String[] getDisplayedValues() {
        return this.m0;
    }

    public int getMaxValue() {
        return this.D;
    }

    public int getMinValue() {
        return this.C;
    }

    public int getOneRecycleSize() {
        return (this.B - this.A) + 1;
    }

    public int getPickedIndexRelativeToRaw() {
        int i = this.P0;
        if (i == 0) {
            return J(this.Q0);
        }
        int i2 = this.K0;
        return i < (-i2) / 2 ? J(this.Q0 + i2 + i) : J(this.Q0 + i);
    }

    public int getRawContentSize() {
        return (this.D - this.C) + 1;
    }

    public int getValue() {
        return getPickedIndexRelativeToRaw() + this.C;
    }

    public boolean getWrapSelectorWheel() {
        return this.V;
    }

    public boolean getWrapSelectorWheelAbsolutely() {
        return this.V && this.b0;
    }

    public void h0() {
        OverScroller overScroller = this.f0;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        OverScroller overScroller2 = this.f0;
        overScroller2.startScroll(0, overScroller2.getCurrY(), 0, 0, 1);
        this.f0.abortAnimation();
        postInvalidate();
    }

    public final void i0(String[] strArr) {
        this.m0 = strArr;
        r0();
    }

    public final void j0() {
        int i = this.x;
        int i2 = i / 2;
        this.y = i2;
        int i3 = i2 + 1;
        this.z = i3;
        int i4 = this.J0;
        this.L0 = (i2 * i4) / i;
        this.M0 = (i3 * i4) / i;
        if (this.u < 0) {
            this.u = 0;
        }
        if (this.v < 0) {
            this.v = 0;
        }
        if (this.u + this.v != 0 && getPaddingLeft() + this.u >= (this.I0 - getPaddingRight()) - this.v) {
            int paddingLeft = getPaddingLeft() + this.u + getPaddingRight();
            int i5 = this.v;
            int i6 = (paddingLeft + i5) - this.I0;
            int i7 = this.u;
            float f2 = i6;
            int i8 = (int) (i7 - ((i7 * f2) / (i7 + i5)));
            this.u = i8;
            this.v = (int) (i5 - ((f2 * i5) / (i8 + i5)));
        }
    }

    public final void k0() {
        int i = this.i;
        int i2 = this.K0;
        if (i > i2) {
            this.i = i2;
        }
        if (this.f11709k > i2) {
            this.f11709k = i2;
        }
        if (this.j > i2) {
            this.j = i2;
        }
        Paint paint = this.k0;
        if (paint == null) {
            throw new IllegalArgumentException("mPaintHint should not be null.");
        }
        paint.setTextSize(this.l);
        this.T = G(this.k0.getFontMetrics());
        this.m = H(this.L, this.k0);
        TextPaint textPaint = this.j0;
        if (textPaint == null) {
            throw new IllegalArgumentException("mPaintText should not be null.");
        }
        textPaint.setTextSize(this.f11709k);
        this.R = G(this.j0.getFontMetrics());
        this.j0.setTextSize(this.i);
        this.Q = G(this.j0.getFontMetrics());
        this.j0.setTextSize(this.j);
        this.S = G(this.j0.getFontMetrics());
    }

    public final void l0() {
        float textSize = this.j0.getTextSize();
        this.j0.setTextSize(this.f11709k);
        this.F = (int) ((this.j0.getFontMetrics().descent - this.j0.getFontMetrics().ascent) + 0.5f);
        this.j0.setTextSize(textSize);
    }

    public final void m0(boolean z) {
        if (this.E == 0 || z) {
            n0();
        }
        l0();
        if (z) {
            if (this.R0 == Integer.MIN_VALUE || this.S0 == Integer.MIN_VALUE) {
                this.r0.sendEmptyMessage(3);
            }
        }
    }

    public final void n() {
        int iFloor = (int) Math.floor(this.Q0 / this.K0);
        this.O0 = iFloor;
        int i = this.Q0;
        int i2 = this.K0;
        int i3 = -(i - (iFloor * i2));
        this.P0 = i3;
        if (this.y0 != null) {
            if ((-i3) > i2 / 2) {
                this.B0 = iFloor + 1 + (this.x / 2);
            } else {
                this.B0 = iFloor + (this.x / 2);
            }
            int oneRecycleSize = this.B0 % getOneRecycleSize();
            this.B0 = oneRecycleSize;
            if (oneRecycleSize < 0) {
                this.B0 = oneRecycleSize + getOneRecycleSize();
            }
            int i4 = this.A0;
            int i5 = this.B0;
            if (i4 != i5) {
                W(i4, i5);
            }
            this.A0 = this.B0;
        }
    }

    public final void n0() {
        float textSize = this.j0.getTextSize();
        this.j0.setTextSize(this.f11709k);
        int iD = D(this.m0, this.j0);
        this.E = iD;
        this.G = iD;
        this.H = iD;
        this.j0.setTextSize(this.l);
        this.n = H(this.O, this.j0);
        this.j0.setTextSize(textSize);
    }

    public final void o(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        for (int i = 0; i < this.x; i++) {
            int i2 = this.K0;
            if (i2 * i <= y && y < i2 * (i + 1)) {
                p(i);
                return;
            }
        }
    }

    public final void o0() {
        int oneRecycleSize = getOneRecycleSize();
        int i = this.x;
        int i2 = this.K0;
        this.C0 = ((oneRecycleSize - (i / 2)) - 1) * i2;
        this.D0 = (-(i / 2)) * i2;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerThread handlerThread = this.p0;
        if (handlerThread == null || !handlerThread.isAlive()) {
            M();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p0.quit();
        if (this.K0 == 0) {
            return;
        }
        if (!this.f0.isFinished()) {
            this.f0.abortAnimation();
            this.Q0 = this.f0.getCurrY();
            n();
            int i = this.P0;
            if (i != 0) {
                int i2 = this.K0;
                if (i < (-i2) / 2) {
                    this.Q0 = this.Q0 + i2 + i;
                } else {
                    this.Q0 += i;
                }
                n();
            }
            S(0);
        }
        int iJ = J(this.Q0);
        int i3 = this.I;
        if (iJ != i3 && this.d0) {
            try {
                d dVar = this.x0;
                if (dVar != null) {
                    int i4 = this.C;
                    dVar.onValueChange(this, i3 + i4, i4 + iJ);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.I = iJ;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        t(canvas);
        u(canvas);
        x(canvas);
        if (AppUtil.isRTLDirection()) {
            return;
        }
        v(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m0(false);
        setMeasuredDimension(R(i), Q(i2));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int value;
        super.onSizeChanged(i, i2, i3, i4);
        this.I0 = i;
        this.J0 = i2;
        this.K0 = i2 / this.x;
        this.N0 = ((i + getPaddingLeft()) - getPaddingRight()) / 2.0f;
        boolean z = false;
        if (getOneRecycleSize() <= 1) {
            value = 0;
        } else if (this.a0) {
            value = getValue() - this.C;
        } else if (this.W) {
            value = this.O0 + ((this.x - 1) / 2);
        } else {
            value = 0;
        }
        if (this.V && this.b0) {
            z = true;
        }
        r(value, z);
        k0();
        o0();
        j0();
        this.a0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K0 == 0) {
            return true;
        }
        if (this.g0 == null) {
            this.g0 = VelocityTracker.obtain();
        }
        this.g0.addMovement(motionEvent);
        this.G0 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.H0 = true;
            this.q0.removeMessages(1);
            h0();
            this.F0 = this.G0;
            this.E0 = this.Q0;
            S(0);
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action != 1) {
            if (action == 2) {
                float f2 = this.F0 - this.G0;
                if (this.H0) {
                    int i = this.K;
                    if ((-i) >= f2 || f2 >= i) {
                        this.H0 = false;
                        this.Q0 = P((int) (this.E0 + f2));
                        n();
                        invalidate();
                    }
                } else {
                    this.H0 = false;
                    this.Q0 = P((int) (this.E0 + f2));
                    n();
                    invalidate();
                }
                S(1);
            } else if (action == 3) {
                this.E0 = this.Q0;
                h0();
                this.q0.sendMessageDelayed(E(1), 0L);
            }
        } else if (this.H0) {
            o(motionEvent);
        } else {
            VelocityTracker velocityTracker = this.g0;
            velocityTracker.computeCurrentVelocity(1000);
            int yVelocity = (int) (velocityTracker.getYVelocity() * this.P);
            if (Math.abs(yVelocity) > this.J) {
                this.f0.fling(0, this.Q0, 0, -yVelocity, Integer.MIN_VALUE, Integer.MAX_VALUE, P(Integer.MIN_VALUE), P(Integer.MAX_VALUE));
                invalidate();
                S(2);
            }
            this.q0.sendMessageDelayed(E(1), 0L);
            U();
        }
        return true;
    }

    public final void p(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.x)) {
            return;
        }
        X(i - (i2 / 2));
    }

    public final void p0() {
        r0();
        this.A = 0;
        this.B = getRawContentSize() - 1;
    }

    public final String[] q(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            return null;
        }
        String[] strArr = new String[charSequenceArr.length];
        for (int i = 0; i < charSequenceArr.length; i++) {
            strArr[i] = charSequenceArr[i].toString();
        }
        return strArr;
    }

    public final void q0() {
        r0();
        if (this.A == -1) {
            this.A = 0;
        }
        if (this.B == -1) {
            this.B = getRawContentSize() - 1;
        }
        c0(this.A, this.B, false);
    }

    public final void r(int i, boolean z) {
        int i2 = i - ((this.x - 1) / 2);
        this.O0 = i2;
        int iC = C(i2, getOneRecycleSize(), z);
        this.O0 = iC;
        int i3 = this.K0;
        if (i3 == 0) {
            this.W = true;
            return;
        }
        this.Q0 = i3 * iC;
        int i4 = iC + (this.x / 2);
        this.A0 = i4;
        int oneRecycleSize = i4 % getOneRecycleSize();
        this.A0 = oneRecycleSize;
        if (oneRecycleSize < 0) {
            this.A0 = oneRecycleSize + getOneRecycleSize();
        }
        this.B0 = this.A0;
        n();
        setContentDescription(y(this.B0));
    }

    public final void r0() {
        this.b0 = getRawContentSize() > this.x;
    }

    public final int s(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setContentTextTypeface(Typeface typeface) {
        this.j0.setTypeface(typeface);
    }

    public void setDisplayedValues(String[] strArr) {
        g0();
        h0();
        i0(strArr);
        m0(true);
        this.I = this.A;
        r(0, this.V && this.b0);
        postInvalidate();
        this.r0.sendEmptyMessage(3);
    }

    public void setDividerColor(int i) {
        if (this.s == i) {
            return;
        }
        this.s = i;
        this.h0.setColor(i);
        postInvalidate();
    }

    public void setFriction(float f2) {
        if (f2 > 0.0f) {
            ViewConfiguration.get(getContext());
            this.P = ViewConfiguration.getScrollFriction() / f2;
        } else {
            throw new IllegalArgumentException("you should set a a positive float friction, now friction is " + f2);
        }
    }

    public void setHintText(String str) {
        if (O(this.L, str)) {
            return;
        }
        this.L = str;
        this.T = G(this.k0.getFontMetrics());
        this.m = H(this.L, this.k0);
        this.r0.sendEmptyMessage(3);
    }

    public void setHintTextColor(int i) {
        if (this.g == i) {
            return;
        }
        this.g = i;
        this.k0.setColor(i);
        postInvalidate();
    }

    public void setHintTextPosition(int i) {
        this.f11707a = i;
    }

    public void setHintTextTypeface(Typeface typeface) {
        this.k0.setTypeface(typeface);
    }

    public void setMaxValue(int i) {
        this.D = i;
        int i2 = i - this.C;
        int i3 = this.A;
        int i4 = i2 + i3;
        this.B = i4;
        b0(i3, i4);
        o0();
        r0();
        m0(true);
        postInvalidate();
        this.r0.sendEmptyMessage(3);
    }

    public void setMinValue(int i) {
        this.C = i;
        this.A = 0;
        o0();
        r0();
        m0(true);
        postInvalidate();
        this.r0.sendEmptyMessage(3);
    }

    public void setNormalTextColor(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        postInvalidate();
    }

    public void setNumberDigits(int i) {
        this.f11708b = i;
        postInvalidate();
    }

    public void setOnScrollListener(c cVar) {
    }

    public void setOnValueChangeListenerInScrolling(e eVar) {
        this.y0 = eVar;
    }

    public void setOnValueChangedListener(d dVar) {
        this.x0 = dVar;
    }

    public void setOnValueChangedListenerRelativeToRaw(f fVar) {
    }

    public void setPickedIndexRelativeToMin(int i) {
        if (i < 0 || i >= getOneRecycleSize()) {
            return;
        }
        this.I = this.A + i;
        r(i, this.V && this.b0);
        postInvalidate();
    }

    public void setPickedIndexRelativeToRaw(int i) {
        int i2 = this.A;
        if (i2 <= -1 || i2 > i || i > this.B) {
            return;
        }
        this.I = i;
        r(i - i2, this.V && this.b0);
        postInvalidate();
    }

    public void setSelectedTextColor(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        postInvalidate();
    }

    public void setValue(int i) {
        int i2 = this.C;
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "should not set a value less than mMinValue(%d), value is %d", Integer.valueOf(i2), Integer.valueOf(i)));
        }
        int i3 = this.D;
        if (i > i3) {
            throw new IllegalArgumentException(String.format(Locale.US, "should not set a value less than mMaxValue(%d), value is %d", Integer.valueOf(i3), Integer.valueOf(i)));
        }
        setPickedIndexRelativeToRaw(i - i2);
    }

    public void setWrapSelectorWheel(boolean z) {
        if (this.V != z) {
            if (z) {
                this.V = z;
                r0();
                postInvalidate();
            } else if (this.z0 == 0) {
                N();
            } else {
                this.c0 = true;
            }
        }
    }

    public final void t(Canvas canvas) {
        if (this.w != 0) {
            canvas.drawRect(getPaddingLeft() + this.u, this.L0, (this.I0 - getPaddingRight()) - this.v, this.M0, this.i0);
        }
    }

    public final void u(Canvas canvas) {
        int iZ;
        float fB;
        float fB2;
        Typeface typeface;
        float f2 = (this.L0 + this.M0) / 2.0f;
        float f3 = 0.0f;
        for (int i = 0; i < this.x + 1; i++) {
            float f4 = this.P0 + (this.K0 * i);
            int iC = C(this.O0 + i, getOneRecycleSize(), this.V && this.b0);
            int i2 = this.x;
            if (i2 == 3) {
                if (i == i2 / 2) {
                    float f5 = 1.0f - f3;
                    iZ = z(f5, this.d, this.e);
                    fB = B(f5, this.i, this.f11709k);
                    fB2 = B(f5, this.Q, this.R);
                    typeface = this.w0;
                } else {
                    iZ = this.d;
                    fB = this.i;
                    fB2 = this.Q;
                    typeface = this.w0;
                }
            } else if (i2 == 5) {
                if (i == i2 / 2) {
                    int i3 = this.K0;
                    f3 = (this.P0 + i3) / i3;
                    iZ = z(f3, this.d, this.e);
                    fB = B(f3, this.i, this.f11709k);
                    fB2 = B(f3, this.Q, this.R);
                    typeface = this.v0;
                } else if (i == (i2 / 2) + 1) {
                    float f6 = 1.0f - f3;
                    iZ = z(f6, this.d, this.e);
                    fB = B(f6, this.i, this.f11709k);
                    fB2 = B(f6, this.Q, this.R);
                    typeface = this.w0;
                } else if (i == 0 || i == i2 - 1) {
                    iZ = this.f;
                    fB = this.j;
                    fB2 = this.Q;
                    typeface = this.w0;
                } else {
                    iZ = this.d;
                    fB = this.i;
                    fB2 = this.Q;
                    typeface = this.w0;
                }
            } else if (i == i2 / 2) {
                int i4 = this.K0;
                f3 = (this.P0 + i4) / i4;
                iZ = z(f3, this.d, this.e);
                fB = B(f3, this.i, this.f11709k);
                fB2 = B(f3, this.Q, this.R);
                typeface = this.v0;
            } else if (i == (i2 / 2) + 1) {
                float f7 = 1.0f - f3;
                iZ = z(f7, this.d, this.e);
                fB = B(f7, this.i, this.f11709k);
                fB2 = B(f7, this.Q, this.R);
                typeface = this.w0;
            } else {
                iZ = this.d;
                fB = this.i;
                fB2 = this.Q;
                typeface = this.w0;
            }
            if (this.c) {
                float fAbs = Math.abs(f4 - f2) / (getHeight() * 0.5f);
                if (fAbs < 0.0f) {
                    fAbs = 0.0f;
                }
                if (fAbs > 1.0f) {
                    fAbs = 1.0f;
                }
                iZ = A((1.0f - fAbs) + 0.25f, iZ);
            }
            this.j0.setColor(iZ);
            this.j0.setTextSize(fB);
            this.j0.setTypeface(typeface);
            if (iC >= 0 && iC < getOneRecycleSize()) {
                CharSequence charSequenceI = I(iC + this.A);
                if (this.M != null) {
                    charSequenceI = TextUtils.ellipsize(charSequenceI, this.j0, getWidth() - (this.f11710r * 2), getEllipsizeType());
                }
                canvas.drawText(charSequenceI.toString(), this.N0, f4 + (this.K0 / 2) + fB2, this.j0);
                this.j0.getTextBounds(charSequenceI.toString(), 0, charSequenceI.length(), this.l0);
                this.u0 = Math.max(this.u0, this.l0.height());
                if (AppUtil.isRTLDirection() && i == this.x / 2) {
                    w(charSequenceI.toString(), canvas);
                }
            } else if (!TextUtils.isEmpty(this.N)) {
                canvas.drawText(this.N, this.N0, f4 + (this.K0 / 2) + fB2, this.j0);
            }
        }
    }

    public final void v(Canvas canvas) {
        float f2;
        if (TextUtils.isEmpty(this.L)) {
            return;
        }
        float f3 = this.N0 + (this.E / 2.0f) + this.o;
        float fG = (this.L0 + this.M0) / 2.0f;
        int i = this.f11707a;
        if (i == 2) {
            fG = (fG - (this.u0 / 2.0f)) + (G(this.k0.getFontMetrics()) * 2.0f) + 4.0f;
        } else {
            if (i == 1) {
                f2 = this.k0.getFontMetrics().ascent;
            } else if (i == 3) {
                fG = (fG + (this.u0 / 2.0f)) - this.j0.getFontMetrics().descent;
                f2 = this.k0.getFontMetrics().descent;
            }
            fG -= f2;
        }
        canvas.drawText(this.L, f3, fG, this.k0);
    }

    public final void w(String str, Canvas canvas) {
        float f2;
        if (TextUtils.isEmpty(this.L)) {
            return;
        }
        this.j0.measureText(str);
        float fMeasureText = ((this.N0 - (this.E / 2)) - this.o) - this.k0.measureText(this.L);
        float fG = (this.L0 + this.M0) / 2.0f;
        int i = this.f11707a;
        if (i == 2) {
            fG = (fG - (this.u0 / 2.0f)) + (G(this.k0.getFontMetrics()) * 2.0f) + 4.0f;
        } else {
            if (i == 1) {
                f2 = this.k0.getFontMetrics().ascent;
            } else if (i == 3) {
                fG = (fG + (this.u0 / 2.0f)) - this.j0.getFontMetrics().descent;
                f2 = this.k0.getFontMetrics().descent;
            }
            fG -= f2;
        }
        canvas.drawText(this.L, fMeasureText, fG, this.k0);
    }

    public final void x(Canvas canvas) {
        if (this.U) {
            canvas.drawLine(getPaddingLeft() + this.u, this.L0, (this.I0 - getPaddingRight()) - this.v, this.L0, this.h0);
            canvas.drawLine(getPaddingLeft() + this.u, this.M0, (this.I0 - getPaddingRight()) - this.v, this.M0, this.h0);
        }
    }

    public final String y(int i) {
        String[] strArr = this.m0;
        if (strArr == null) {
            return "";
        }
        String str = strArr[i];
        return TextUtils.isEmpty(this.L) ? getContext().getString(n1j.number_picker_view_talk_back_content_description, str) : getContext().getString(n1j.number_picker_view_talk_back_content_hint_description, str, this.L);
    }

    public final int z(float f2, int i, int i2) {
        if (this.s0 == null) {
            this.s0 = new ArgbEvaluator();
        }
        Object objEvaluate = this.s0.evaluate(f2, Integer.valueOf(i), Integer.valueOf(i2));
        if (objEvaluate != null) {
            return ((Integer) objEvaluate).intValue();
        }
        int i3 = (i & (-16777216)) >>> 24;
        int i4 = (i & 16711680) >>> 16;
        int i5 = (i & 65280) >>> 8;
        int i6 = i & 255;
        return ((int) (i6 + (((i2 & 255) - i6) * f2))) | (((int) (i3 + (((((-16777216) & i2) >>> 24) - i3) * f2))) << 24) | (((int) (i4 + ((((16711680 & i2) >>> 16) - i4) * f2))) << 16) | (((int) (i5 + ((((65280 & i2) >>> 8) - i5) * f2))) << 8);
    }

    public NumberPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -13421773;
        this.e = -695533;
        this.f = 436207616;
        this.g = -695533;
        this.i = 0;
        this.j = 0;
        this.f11709k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.f11710r = 0;
        this.s = -695533;
        this.t = 2;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 3;
        this.y = 0;
        this.z = 0;
        this.A = -1;
        this.B = -1;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 150;
        this.K = 8;
        this.P = 1.0f;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        this.U = true;
        this.V = true;
        this.W = false;
        this.a0 = false;
        this.b0 = true;
        this.c0 = false;
        this.d0 = false;
        this.e0 = true;
        this.h0 = new Paint();
        this.i0 = new Paint();
        this.j0 = new TextPaint();
        this.k0 = new Paint();
        this.l0 = new Rect();
        this.t0 = 0;
        this.z0 = 0;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.G0 = 0.0f;
        this.H0 = false;
        this.O0 = 0;
        this.P0 = 0;
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = 0;
        L(context, attributeSet);
        K(context);
    }

    public NumberPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = -13421773;
        this.e = -695533;
        this.f = 436207616;
        this.g = -695533;
        this.i = 0;
        this.j = 0;
        this.f11709k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.f11710r = 0;
        this.s = -695533;
        this.t = 2;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 3;
        this.y = 0;
        this.z = 0;
        this.A = -1;
        this.B = -1;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 150;
        this.K = 8;
        this.P = 1.0f;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        this.U = true;
        this.V = true;
        this.W = false;
        this.a0 = false;
        this.b0 = true;
        this.c0 = false;
        this.d0 = false;
        this.e0 = true;
        this.h0 = new Paint();
        this.i0 = new Paint();
        this.j0 = new TextPaint();
        this.k0 = new Paint();
        this.l0 = new Rect();
        this.t0 = 0;
        this.z0 = 0;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.G0 = 0.0f;
        this.H0 = false;
        this.O0 = 0;
        this.P0 = 0;
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = 0;
        L(context, attributeSet);
        K(context);
    }
}
