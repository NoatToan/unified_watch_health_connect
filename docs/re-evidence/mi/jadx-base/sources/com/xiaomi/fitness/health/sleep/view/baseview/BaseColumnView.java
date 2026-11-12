package com.xiaomi.fitness.health.sleep.view.baseview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import defpackage.c54;
import defpackage.iwc;
import defpackage.l9h;
import defpackage.n4j;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseColumnView<T extends iwc> extends View {
    public RectF A;
    public long B;
    public long C;
    public float D;
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public final Runnable I;
    public int J;
    public boolean K;
    public List<T> L;
    public int M;
    public List<Float> N;
    public List<String> O;
    public List<String> P;
    public float Q;
    public StringBuilder R;
    public int S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12283b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12284k;
    public int l;
    public int m;
    public Paint n;
    public Paint o;
    public Paint p;
    public Paint q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Paint f12285r;
    public Paint s;
    public Rect t;
    public Rect u;
    public Rect v;
    public Rect w;
    public Rect x;
    public Rect y;
    public Rect z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseColumnView baseColumnView = BaseColumnView.this;
            baseColumnView.G = true;
            baseColumnView.performHapticFeedback(0);
            BaseColumnView baseColumnView2 = BaseColumnView.this;
            baseColumnView2.B(baseColumnView2.E, baseColumnView2.F);
        }
    }

    public BaseColumnView(Context context) {
        this(context, null);
    }

    public void A(long j, long j2) {
        this.B = j;
        this.C = j2;
        postInvalidate();
    }

    public void B(float f, float f2) {
        Rect rect = this.w;
        int i = rect.left;
        int i2 = this.M;
        if (f >= i - i2 && f <= rect.right + i2 && f2 <= rect.bottom && f2 >= rect.top) {
            Rect rect2 = this.y;
            if (f2 <= rect2.top || f2 >= rect2.bottom) {
                int iK = k(f);
                if (!this.G || iK >= 0) {
                    this.J = iK;
                }
                postInvalidate();
                return;
            }
        }
        this.J = -1;
        postInvalidate();
    }

    public final void C() {
        this.o.setTextSize(this.f12283b);
        this.o.setColor(this.f12282a);
        this.o.getTextBounds("88:88", 0, 5, this.x);
        Rect rect = this.x;
        rect.top -= 7;
        rect.bottom += 7;
        Rect rect2 = this.v;
        Rect rect3 = this.t;
        int i = rect3.left;
        int i2 = rect3.bottom;
        rect2.set(i, i2 + 24, rect3.right, i2 + 24 + rect.height());
        this.n.setTextSize(this.d);
        this.n.setColor(this.c);
        String yAxisMaxText = getYAxisMaxText();
        if (TextUtils.isEmpty(yAxisMaxText)) {
            this.x.setEmpty();
        } else {
            this.n.getTextBounds(yAxisMaxText, 0, yAxisMaxText.length(), this.x);
            Rect rect4 = this.x;
            rect4.left -= 7;
            rect4.right += 7;
        }
        Rect rect5 = this.u;
        Rect rect6 = this.t;
        int i3 = rect6.right;
        rect5.set(i3 + 18, rect6.top - 10, i3 + 18 + this.x.width(), this.t.bottom + 10);
        this.w.set(this.t);
        this.Q = c54.d(this.w.height(), getHorizontalLineNum() + 1);
        if (this.H) {
            int iWidth = this.u.width();
            Rect rect7 = this.u;
            Rect rect8 = this.t;
            int i4 = rect8.left;
            rect7.left = i4;
            int i5 = i4 + iWidth;
            rect7.right = i5;
            Rect rect9 = this.w;
            int i6 = i5 + 10;
            rect9.left = i6;
            int i7 = rect8.right;
            rect9.right = i7;
            Rect rect10 = this.v;
            rect10.right = i7;
            rect10.left = i6;
            Rect rect11 = this.y;
            rect11.left = rect9.left;
            rect11.right = rect9.right;
        }
    }

    public boolean D(float f, float f2, float f3, float f4) {
        return !(f == f3 && f2 == f4) && Math.abs(f2 - f4) <= Math.abs(f - f3);
    }

    public abstract void a(Canvas canvas);

    public void b(Canvas canvas) {
        this.p.setStrokeWidth(this.e);
        this.p.setColor(this.f);
        this.p.setStyle(Paint.Style.STROKE);
        c(canvas);
        f(canvas);
        d(canvas);
    }

    public void c(Canvas canvas) {
        Rect rect = this.w;
        int i = rect.left;
        canvas.drawLines(new float[]{i, rect.top, i, rect.bottom}, this.p);
        Rect rect2 = this.w;
        int i2 = rect2.right;
        canvas.drawLines(new float[]{i2, rect2.top, i2, rect2.bottom}, this.p);
    }

    public void d(Canvas canvas) {
        this.N.clear();
        float f = this.Q;
        float f2 = this.t.top;
        Paint paint = this.p;
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        paint.setPathEffect(new DashPathEffect(new float[]{displayUtil.dip2pxF(4.0f), displayUtil.dip2pxF(1.5f)}, 0.0f));
        Path path = new Path();
        while (true) {
            Rect rect = this.w;
            if (f2 >= rect.bottom + (0.5f * f)) {
                this.p.setPathEffect(null);
                return;
            }
            int i = rect.left;
            int i2 = rect.right;
            path.reset();
            path.moveTo(i, f2);
            path.lineTo(i2, f2);
            canvas.drawPath(path, this.p);
            this.N.add(Float.valueOf(f2));
            f2 += f;
        }
    }

    public void e(Canvas canvas) {
        int i = this.J;
        if (i < 0 || i >= this.L.size()) {
            return;
        }
        T t = this.L.get(this.J);
        float fB = t.b();
        Rect rect = this.w;
        if (fB < rect.left || fB > rect.right) {
            return;
        }
        this.s.setTextSize(this.l);
        this.P.clear();
        i(this.P, t);
        List<String> list = this.P;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int iWidth = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            this.s.getTextBounds(str, 0, str.length(), this.x);
            iWidth += this.x.width();
            if (i2 < size - 1) {
                iWidth += 26;
            }
        }
        int iHeight = this.x.height();
        float f = this.m * 0.5f;
        float f2 = iWidth * 0.5f;
        float f3 = 13;
        int i3 = (int) (((fB - f2) - f3) - f);
        int i4 = (int) (f2 + fB + f3 + f);
        Rect rect2 = this.w;
        int i5 = rect2.left;
        if (i3 < i5) {
            i4 += i5 - i3;
            i3 = i5;
        }
        int i6 = rect2.right;
        if (i4 > i6) {
            i3 -= i4 - i6;
            i4 = i6;
        }
        this.z.set(i3, this.y.centerY() - (this.m / 2), i4, this.y.centerY() + (this.m / 2));
        int iCenterY = this.z.centerY();
        int i7 = this.w.bottom;
        int iA = (int) t.a();
        if (iA > 0) {
            i7 = iA;
        }
        this.f12285r.setStyle(Paint.Style.STROKE);
        this.f12285r.setStrokeWidth(this.j);
        this.f12285r.setColor(l(t));
        canvas.drawLine(fB, iCenterY, fB, i7, this.f12285r);
        this.f12285r.setStyle(Paint.Style.FILL);
        RectF rectF = this.A;
        Rect rect3 = this.z;
        rectF.set(rect3.left, rect3.top, rect3.right, rect3.bottom);
        canvas.drawRoundRect(this.A, f, f, this.f12285r);
        Rect rect4 = this.z;
        float f4 = rect4.left + f + f3;
        float f5 = iHeight;
        float fCenterY = rect4.centerY() + (0.35f * f5);
        for (int i8 = 0; i8 < size; i8++) {
            String str2 = list.get(i8);
            this.s.setColor(m(t));
            canvas.drawText(str2, f4, fCenterY, this.s);
            this.s.getTextBounds(str2, 0, str2.length(), this.x);
            if (i8 < size - 1) {
                float fWidth = f4 + this.x.width() + f3;
                float f6 = 2;
                this.s.setStrokeWidth(f6);
                this.s.setAlpha(153);
                float f7 = f5 / 2.0f;
                canvas.drawLine(fWidth, this.z.centerY() - f7, fWidth, this.z.centerY() + f7, this.s);
                f4 = fWidth + f3 + f6;
            }
        }
    }

    public void f(Canvas canvas) {
        if (getVerticalLineNum() <= 0) {
            return;
        }
        float fD = c54.d(this.w.width(), getVerticalLineNum() + 1);
        float f = this.w.left;
        while (true) {
            f += fD;
            Rect rect = this.w;
            if (f >= rect.right - (0.5f * fD)) {
                return;
            }
            canvas.drawLine(f, this.t.top, f, rect.bottom, this.p);
        }
    }

    public abstract void g(Canvas canvas);

    public abstract int getHorizontalLineNum();

    public abstract int getVerticalLineNum();

    public String getYAxisMaxText() {
        return "00:00";
    }

    public void h(Canvas canvas) {
        this.O.clear();
        int size = this.N.size();
        j(this.O, size);
        Paint.FontMetricsInt fontMetricsInt = this.n.getFontMetricsInt();
        int i = (int) ((fontMetricsInt.descent - fontMetricsInt.ascent) * 0.285f);
        float f = this.u.left;
        if (this.H) {
            this.n.setTextAlign(Paint.Align.RIGHT);
            f = this.u.right;
        }
        for (int i2 = 0; i2 < size && i2 < this.O.size(); i2++) {
            canvas.drawText(this.O.get(i2), f, this.N.get(i2).floatValue() + i, this.n);
        }
    }

    public abstract void i(List<String> list, T t);

    public abstract void j(List<String> list, int i);

    public int k(float f) {
        int i = -1;
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            T t = this.L.get(i2);
            float fB = t.b();
            if (fB > 0.0f) {
                Rect rect = this.w;
                if (f >= rect.left && f <= rect.right) {
                    if (t.getLeft() >= t.getRight()) {
                        float fAbs = Math.abs(fB - f);
                        if (f2 > fAbs) {
                            i = i2;
                            f2 = fAbs;
                        }
                    } else if (f >= t.getLeft() && f <= t.getRight()) {
                        return i2;
                    }
                }
            }
        }
        return i;
    }

    public int l(T t) {
        return this.i;
    }

    public int m(T t) {
        return this.f12284k;
    }

    public void n(MotionEvent motionEvent) {
        this.K = false;
        this.G = false;
        this.E = motionEvent.getX();
        float y = motionEvent.getY();
        this.F = y;
        if (!this.w.contains((int) this.E, (int) y)) {
            y(false);
            return;
        }
        y(true);
        if (this.L.isEmpty()) {
            return;
        }
        postDelayed(this.I, 400L);
    }

    public void o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (Math.abs(this.F - y) > Math.abs(this.E - x) + 100.0f) {
            y(false);
            removeCallbacks(this.I);
        } else if (D(this.E, this.F, x, y)) {
            this.K = true;
            if (this.G) {
                B(motionEvent.getX(), motionEvent.getY());
            }
            this.E = x;
            this.F = y;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        x(canvas);
        q(canvas);
        w(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.t.set(getPaddingStart(), getPaddingTop(), getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom());
        C();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(t(i, 300), t(i2, 300));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!u()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            n(motionEvent);
        } else if (action == 1) {
            y(false);
            p(motionEvent);
        } else if (action == 2) {
            o(motionEvent);
        }
        return true;
    }

    public void p(MotionEvent motionEvent) {
        removeCallbacks(this.I);
        this.G = false;
        if (!this.K) {
            B(motionEvent.getX(), motionEvent.getY());
        }
        invalidate();
    }

    public void q(Canvas canvas) {
        b(canvas);
        g(canvas);
        h(canvas);
        a(canvas);
        e(canvas);
    }

    public void r() {
        Paint paint = new Paint(1);
        this.o = paint;
        paint.setDither(true);
        this.o.setStrokeCap(Paint.Cap.ROUND);
        this.n = new Paint(this.o);
        this.p = new Paint(this.o);
        this.q = new Paint(this.o);
        this.f12285r = new Paint(this.o);
        this.s = new Paint(this.o);
        this.L = new ArrayList();
        this.t = new Rect();
        this.v = new Rect();
        this.u = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        this.y = new Rect();
        this.z = new Rect();
        this.A = new RectF();
        this.M = 16;
        this.N = new LinkedList();
        this.O = new LinkedList();
        this.P = new LinkedList();
        this.R = new StringBuilder();
        this.H = AppUtil.isRTLDirection();
        s();
    }

    public final void s() {
        this.o.setColor(this.f12282a);
        this.o.setTextSize(this.f12283b);
        this.n.setColor(this.c);
        this.n.setTextSize(this.d);
        this.p.setColor(this.f);
        this.p.setStrokeWidth(this.e);
        this.q.setColor(this.g);
        this.f12285r.setColor(this.i);
        this.s.setColor(this.f12284k);
        this.s.setTextSize(this.l);
    }

    public void setDataList(List<T> list) {
        z();
        this.L.addAll(list);
        v();
        postInvalidate();
    }

    public void setOnPromptListener(l9h l9hVar) {
    }

    public void setViewType(int i) {
        this.S = i;
    }

    public int t(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return (mode == 0 || mode == 1073741824) ? size : i2;
        }
        return Math.min(i2, size);
    }

    public abstract boolean u();

    public abstract void v();

    public void w(Canvas canvas) {
    }

    public void x(Canvas canvas) {
    }

    public void y(boolean z) {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void z() {
        this.J = -1;
        this.L.clear();
        removeCallbacks(this.I);
        this.G = false;
    }

    public BaseColumnView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseColumnView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12282a = -16777216;
        this.f12283b = 28;
        this.c = -16777216;
        this.d = 26;
        this.e = 1;
        this.f = -16777216;
        this.g = MenuBuilder.CATEGORY_MASK;
        this.h = 50;
        this.i = MenuBuilder.CATEGORY_MASK;
        this.j = 2;
        this.f12284k = -1;
        this.l = 36;
        this.m = 72;
        this.I = new a();
        this.J = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.B);
        this.f12282a = typedArrayObtainStyledAttributes.getColor(n4j.L, this.f12282a);
        this.f12283b = typedArrayObtainStyledAttributes.getDimensionPixelSize(n4j.M, this.f12283b);
        this.c = typedArrayObtainStyledAttributes.getColor(n4j.N, this.c);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(n4j.O, this.d);
        this.f = typedArrayObtainStyledAttributes.getColor(n4j.C, this.f);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(n4j.D, this.e);
        this.g = typedArrayObtainStyledAttributes.getColor(n4j.E, this.g);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(n4j.F, this.h);
        this.i = typedArrayObtainStyledAttributes.getColor(n4j.H, this.i);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(n4j.I, this.j);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(n4j.K, this.l);
        this.f12284k = typedArrayObtainStyledAttributes.getColor(n4j.J, this.f12284k);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(n4j.G, this.m);
        typedArrayObtainStyledAttributes.recycle();
        r();
    }
}
