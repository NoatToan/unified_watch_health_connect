package com.xiaomi.fitness.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import defpackage.atk;
import defpackage.b5j;
import defpackage.lki;
import defpackage.ni4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ViewfinderView extends View {
    public int A;
    public int B;
    public int C;
    public float D;
    public List<atk> E;
    public List<atk> F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f13461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextPaint f13462b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public TextLocation i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13463k;
    public float l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13464r;
    public int s;
    public LaserStyle t;
    public int u;
    public int v;
    public Rect w;
    public int x;
    public int y;
    public int z;

    public enum LaserStyle {
        NONE(0),
        LINE(1),
        GRID(2);

        private int mValue;

        LaserStyle(int i) {
            this.mValue = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static LaserStyle getFromInt(int i) {
            for (LaserStyle laserStyle : values()) {
                if (laserStyle.mValue == i) {
                    return laserStyle;
                }
            }
            return LINE;
        }
    }

    public enum TextLocation {
        TOP(0),
        BOTTOM(1);

        private int mValue;

        TextLocation(int i) {
            this.mValue = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static TextLocation getFromInt(int i) {
            for (TextLocation textLocation : values()) {
                if (textLocation.mValue == i) {
                    return textLocation;
                }
            }
            return TOP;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13465a;

        static {
            int[] iArr = new int[LaserStyle.values().length];
            f13465a = iArr;
            try {
                iArr[LaserStyle.LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13465a[LaserStyle.GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ViewfinderView(Context context) {
        this(context, null);
    }

    private DisplayMetrics getDisplayMetrics() {
        return getResources().getDisplayMetrics();
    }

    public void a(atk atkVar) {
        if (this.o) {
            List<atk> list = this.E;
            synchronized (list) {
                try {
                    list.add(atkVar);
                    int size = list.size();
                    if (size > 20) {
                        list.subList(0, size - 10).clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(Canvas canvas, Rect rect) {
        this.f13461a.setColor(this.f);
        int i = rect.left;
        int i2 = rect.top;
        canvas.drawRect(i, i2, i + this.x, i2 + this.y, this.f13461a);
        int i3 = rect.left;
        int i4 = rect.top;
        canvas.drawRect(i3, i4, i3 + this.y, i4 + this.x, this.f13461a);
        int i5 = rect.right;
        float f = i5 - this.x;
        int i6 = rect.top;
        canvas.drawRect(f, i6, i5, i6 + this.y, this.f13461a);
        int i7 = rect.right;
        float f2 = i7 - this.y;
        int i8 = rect.top;
        canvas.drawRect(f2, i8, i7, i8 + this.x, this.f13461a);
        int i9 = rect.left;
        int i10 = rect.bottom;
        canvas.drawRect(i9, i10 - this.x, i9 + this.y, i10, this.f13461a);
        int i11 = rect.left;
        int i12 = rect.bottom;
        canvas.drawRect(i11, i12 - this.y, i11 + this.x, i12, this.f13461a);
        int i13 = rect.right;
        float f3 = i13 - this.x;
        int i14 = rect.bottom;
        canvas.drawRect(f3, i14 - this.y, i13, i14, this.f13461a);
        int i15 = rect.right;
        float f4 = i15 - this.y;
        int i16 = rect.bottom;
        canvas.drawRect(f4, i16 - this.x, i15, i16, this.f13461a);
    }

    public final void c(Canvas canvas, Rect rect, int i, int i2) {
        this.f13461a.setColor(this.c);
        float f = i;
        canvas.drawRect(0.0f, 0.0f, f, rect.top, this.f13461a);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom, this.f13461a);
        canvas.drawRect(rect.right, rect.top, f, rect.bottom, this.f13461a);
        canvas.drawRect(0.0f, rect.bottom, f, i2, this.f13461a);
    }

    public final void d(Canvas canvas, Rect rect) {
        this.f13461a.setColor(this.d);
        float f = rect.left;
        int i = rect.top;
        canvas.drawRect(f, i, rect.right, i + this.B, this.f13461a);
        int i2 = rect.left;
        canvas.drawRect(i2, rect.top, i2 + this.B, rect.bottom, this.f13461a);
        int i3 = rect.right;
        canvas.drawRect(i3 - this.B, rect.top, i3, rect.bottom, this.f13461a);
        float f2 = rect.left;
        int i4 = rect.bottom;
        canvas.drawRect(f2, i4 - this.B, rect.right, i4, this.f13461a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final void e(Canvas canvas, Rect rect) {
        int i;
        this.f13461a.setStrokeWidth(2);
        int i2 = this.v;
        if (i2 > 0) {
            int i3 = this.m;
            if (i3 - rect.top > i2) {
                i = i3 - i2;
            } else {
                i = rect.top;
            }
        } else {
            i = rect.top;
        }
        float f = i;
        this.f13461a.setShader(new LinearGradient(rect.left + (rect.width() / 2), f, rect.left + (rect.width() / 2), this.m, new int[]{l(this.e), this.e}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        float fWidth = (rect.width() * 1.0f) / this.u;
        for (int i4 = 1; i4 < this.u; i4++) {
            int i5 = rect.left;
            float f2 = i4 * fWidth;
            canvas.drawLine(i5 + f2, f, i5 + f2, this.m, this.f13461a);
        }
        int i6 = this.v;
        if (i6 <= 0 || this.m - rect.top <= i6) {
            i6 = this.m - rect.top;
        }
        int i7 = 0;
        while (true) {
            float f3 = i7;
            if (f3 > i6 / fWidth) {
                break;
            }
            float f4 = rect.left;
            int i8 = this.m;
            float f5 = f3 * fWidth;
            canvas.drawLine(f4, i8 - f5, rect.right, i8 - f5, this.f13461a);
            i7++;
        }
        int i9 = this.m;
        if (i9 < this.n) {
            this.m = i9 + this.z;
        } else {
            this.m = rect.top;
        }
    }

    public final void f(Canvas canvas, Rect rect) {
        if (this.t != null) {
            this.f13461a.setColor(this.e);
            int i = a.f13465a[this.t.ordinal()];
            if (i == 1) {
                g(canvas, rect);
            } else if (i == 2) {
                e(canvas, rect);
            }
            this.f13461a.setShader(null);
        }
    }

    public final void g(Canvas canvas, Rect rect) {
        int i = rect.left;
        int i2 = this.m;
        this.f13461a.setShader(new LinearGradient(i, i2, i, i2 + this.A, l(this.e), this.e, Shader.TileMode.MIRROR));
        if (this.m > this.n) {
            this.m = rect.top;
            return;
        }
        int i3 = rect.left;
        int i4 = this.A;
        int i5 = this.m;
        canvas.drawOval(new RectF(i3 + (i4 * 2), i5, rect.right - (i4 * 2), i5 + i4), this.f13461a);
        this.m += this.z;
    }

    public final void h(Canvas canvas, Rect rect) {
        if (this.o) {
            List<atk> list = this.E;
            List<atk> list2 = this.F;
            if (list.isEmpty()) {
                this.F = null;
            } else {
                this.E = new ArrayList(5);
                this.F = list;
                this.f13461a.setAlpha(160);
                this.f13461a.setColor(this.g);
                synchronized (list) {
                    try {
                        for (atk atkVar : list) {
                            canvas.drawCircle(atkVar.c(), atkVar.d(), 10.0f, this.f13461a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (list2 != null) {
                this.f13461a.setAlpha(80);
                this.f13461a.setColor(this.g);
                synchronized (list2) {
                    try {
                        for (atk atkVar2 : list2) {
                            canvas.drawCircle(atkVar2.c(), atkVar2.d(), 10.0f, this.f13461a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public final void i(Canvas canvas, Rect rect) {
        if (TextUtils.isEmpty(this.j)) {
            return;
        }
        this.f13462b.setColor(this.f13463k);
        this.f13462b.setTextSize(this.l);
        this.f13462b.setTextAlign(Paint.Align.LEFT);
        StaticLayout staticLayout = new StaticLayout(this.j, this.f13462b, canvas.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
        if (this.i == TextLocation.BOTTOM) {
            canvas.translate(0.0f, rect.bottom + this.h);
            staticLayout.draw(canvas);
        } else {
            canvas.translate(0.0f, (rect.top - this.h) - staticLayout.getHeight());
            staticLayout.draw(canvas);
        }
    }

    public void j() {
        invalidate();
    }

    public final void k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.X5);
        this.c = typedArrayObtainStyledAttributes.getColor(b5j.p6, ni4.c(context, lki.f25176r));
        this.d = typedArrayObtainStyledAttributes.getColor(b5j.b6, ni4.c(context, lki.p));
        this.f = typedArrayObtainStyledAttributes.getColor(b5j.Y5, ni4.c(context, lki.o));
        this.e = typedArrayObtainStyledAttributes.getColor(b5j.n6, ni4.c(context, lki.q));
        this.g = typedArrayObtainStyledAttributes.getColor(b5j.q6, ni4.c(context, lki.s));
        this.j = typedArrayObtainStyledAttributes.getString(b5j.i6);
        this.f13463k = typedArrayObtainStyledAttributes.getColor(b5j.j6, ni4.c(context, lki.t));
        this.l = typedArrayObtainStyledAttributes.getDimension(b5j.m6, TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
        this.h = typedArrayObtainStyledAttributes.getDimension(b5j.l6, TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        this.i = TextLocation.getFromInt(typedArrayObtainStyledAttributes.getInt(b5j.k6, 0));
        this.o = typedArrayObtainStyledAttributes.getBoolean(b5j.u6, false);
        this.f13464r = typedArrayObtainStyledAttributes.getDimensionPixelSize(b5j.f6, 0);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(b5j.c6, 0);
        this.t = LaserStyle.getFromInt(typedArrayObtainStyledAttributes.getInt(b5j.o6, LaserStyle.LINE.mValue));
        this.u = typedArrayObtainStyledAttributes.getInt(b5j.g6, 20);
        this.v = (int) typedArrayObtainStyledAttributes.getDimension(b5j.h6, TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics()));
        this.x = (int) typedArrayObtainStyledAttributes.getDimension(b5j.a6, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
        this.y = (int) typedArrayObtainStyledAttributes.getDimension(b5j.Z5, TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.z = (int) typedArrayObtainStyledAttributes.getDimension(b5j.t6, TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.A = (int) typedArrayObtainStyledAttributes.getDimension(b5j.s6, TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()));
        this.B = (int) typedArrayObtainStyledAttributes.getDimension(b5j.d6, TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        this.C = typedArrayObtainStyledAttributes.getInteger(b5j.r6, 15);
        this.D = typedArrayObtainStyledAttributes.getFloat(b5j.e6, 0.625f);
        typedArrayObtainStyledAttributes.recycle();
        this.f13461a = new Paint(1);
        this.f13462b = new TextPaint(1);
        this.E = new ArrayList(5);
        this.F = null;
        this.p = getDisplayMetrics().widthPixels;
        int i = getDisplayMetrics().heightPixels;
        this.q = i;
        int iMin = (int) (Math.min(this.p, i) * this.D);
        int i2 = this.f13464r;
        if (i2 <= 0 || i2 > this.p) {
            this.f13464r = iMin;
        }
        int i3 = this.s;
        if (i3 <= 0 || i3 > this.q) {
            this.s = iMin;
        }
    }

    public int l(int i) {
        return Integer.valueOf("01" + Integer.toHexString(i).substring(2), 16).intValue();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect rect = this.w;
        if (rect == null) {
            return;
        }
        if (this.m == 0 || this.n == 0) {
            this.m = rect.top;
            this.n = rect.bottom - this.A;
        }
        c(canvas, this.w, canvas.getWidth(), canvas.getHeight());
        f(canvas, this.w);
        d(canvas, this.w);
        b(canvas, this.w);
        i(canvas, this.w);
        h(canvas, this.w);
        long j = this.C;
        Rect rect2 = this.w;
        postInvalidateDelayed(j, rect2.left - 20, rect2.top - 20, rect2.right + 20, rect2.bottom + 20);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = (((this.p - this.f13464r) / 2) + getPaddingLeft()) - getPaddingRight();
        int paddingTop = (((this.q - this.s) / 2) + getPaddingTop()) - getPaddingBottom();
        this.w = new Rect(paddingLeft, paddingTop, this.f13464r + paddingLeft, this.s + paddingTop);
    }

    public void setLabelText(String str) {
        this.j = str;
    }

    public void setLabelTextColor(int i) {
        this.f13463k = i;
    }

    public void setLabelTextColorResource(int i) {
        this.f13463k = ni4.c(getContext(), i);
    }

    public void setLabelTextSize(float f) {
        this.l = f;
    }

    public void setLaserStyle(LaserStyle laserStyle) {
        this.t = laserStyle;
    }

    public void setShowResultPoint(boolean z) {
        this.o = z;
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewfinderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = 0;
        this.n = 0;
        k(context, attributeSet);
    }
}
