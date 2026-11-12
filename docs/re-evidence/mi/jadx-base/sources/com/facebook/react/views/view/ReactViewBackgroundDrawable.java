package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import defpackage.ey9;
import defpackage.j0s;
import defpackage.poc;
import defpackage.y44;
import defpackage.y4n;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class ReactViewBackgroundDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y4n f7588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y4n f7589b;
    public y4n c;
    public b d;
    public PathEffect e;
    public Path f;
    public Path g;
    public Path h;
    public Path i;
    public Path j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RectF f7590k;
    public RectF l;
    public RectF m;
    public RectF n;
    public PointF o;
    public PointF p;
    public PointF q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PointF f7591r;
    public boolean s = false;
    public float t = Float.NaN;
    public final Paint u = new Paint(1);
    public int v = 0;
    public int w = 255;
    public float[] x;
    public final Context y;
    public int z;

    public enum BorderRadiusLocation {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7592a;

        static {
            int[] iArr = new int[b.values().length];
            f7592a = iArr;
            try {
                iArr[b.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7592a[b.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7592a[b.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        SOLID,
        DASHED,
        DOTTED;

        public static PathEffect a(b bVar, float f) {
            int i = a.f7592a[bVar.ordinal()];
            if (i == 2) {
                float f2 = f * 3.0f;
                return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
            }
            if (i != 3) {
                return null;
            }
            return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
        }
    }

    public ReactViewBackgroundDrawable(Context context) {
        this.y = context;
    }

    public static int a(float f, float f2) {
        return ((((int) f) << 24) & (-16777216)) | (((int) f2) & 16777215);
    }

    public static int e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i4 > 0 ? i8 : -1) & (i > 0 ? i5 : -1) & (i2 > 0 ? i6 : -1) & (i3 > 0 ? i7 : -1);
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        int i10 = i5 | i6;
        if (i3 <= 0) {
            i7 = 0;
        }
        int i11 = i10 | i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        if (i9 == (i11 | i8)) {
            return i9;
        }
        return 0;
    }

    public static void l(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double dAbs = Math.abs(d3 - d) / 2.0d;
        double dAbs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = dAbs2 * dAbs2;
        double d16 = dAbs * dAbs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = dAbs * 2.0d * dAbs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double dSqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = (d13 * dSqrt) + d14;
        double d22 = dSqrt + d9;
        double d23 = d21 + d10;
        if (Double.isNaN(d22) || Double.isNaN(d23)) {
            return;
        }
        pointF.x = (float) d22;
        pointF.y = (float) d23;
    }

    public boolean A(int i) {
        if (this.z == i) {
            return false;
        }
        this.z = i;
        return r(i);
    }

    public final void B() {
        float f;
        float f2;
        if (this.s) {
            this.s = false;
            if (this.f == null) {
                this.f = new Path();
            }
            if (this.g == null) {
                this.g = new Path();
            }
            if (this.h == null) {
                this.h = new Path();
            }
            if (this.j == null) {
                this.j = new Path();
            }
            if (this.f7590k == null) {
                this.f7590k = new RectF();
            }
            if (this.l == null) {
                this.l = new RectF();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (this.n == null) {
                this.n = new RectF();
            }
            this.f.reset();
            this.g.reset();
            this.h.reset();
            this.j.reset();
            this.f7590k.set(getBounds());
            this.l.set(getBounds());
            this.m.set(getBounds());
            this.n.set(getBounds());
            float fN = n();
            if (fN > 0.0f) {
                float f3 = fN * 0.5f;
                this.n.inset(f3, f3);
            }
            RectF rectFK = k();
            RectF rectF = this.f7590k;
            rectF.top += rectFK.top;
            rectF.bottom -= rectFK.bottom;
            rectF.left += rectFK.left;
            rectF.right -= rectFK.right;
            float fM = m();
            float fH = h(fM, BorderRadiusLocation.TOP_LEFT);
            float fH2 = h(fM, BorderRadiusLocation.TOP_RIGHT);
            float fH3 = h(fM, BorderRadiusLocation.BOTTOM_LEFT);
            float fH4 = h(fM, BorderRadiusLocation.BOTTOM_RIGHT);
            boolean z = o() == 1;
            float fG = g(BorderRadiusLocation.TOP_START);
            float fG2 = g(BorderRadiusLocation.TOP_END);
            float fG3 = g(BorderRadiusLocation.BOTTOM_START);
            float fG4 = g(BorderRadiusLocation.BOTTOM_END);
            if (poc.d().b(this.y)) {
                if (!j0s.a(fG)) {
                    fH = fG;
                }
                if (!j0s.a(fG2)) {
                    fH2 = fG2;
                }
                if (!j0s.a(fG3)) {
                    fH3 = fG3;
                }
                if (!j0s.a(fG4)) {
                    fH4 = fG4;
                }
                f = z ? fH2 : fH;
                if (!z) {
                    fH = fH2;
                }
                f2 = z ? fH4 : fH3;
                if (z) {
                    fH4 = fH3;
                }
            } else {
                float f4 = z ? fG2 : fG;
                if (!z) {
                    fG = fG2;
                }
                float f5 = z ? fG4 : fG3;
                if (!z) {
                    fG3 = fG4;
                }
                if (!j0s.a(f4)) {
                    fH = f4;
                }
                if (!j0s.a(fG)) {
                    fH2 = fG;
                }
                if (!j0s.a(f5)) {
                    fH3 = f5;
                }
                if (!j0s.a(fG3)) {
                    fH4 = fG3;
                }
                f = fH;
                fH = fH2;
                f2 = fH3;
            }
            float fMax = Math.max(f - rectFK.left, 0.0f);
            float fMax2 = Math.max(f - rectFK.top, 0.0f);
            float fMax3 = Math.max(fH - rectFK.right, 0.0f);
            float fMax4 = Math.max(fH - rectFK.top, 0.0f);
            float fMax5 = Math.max(fH4 - rectFK.right, 0.0f);
            float fMax6 = Math.max(fH4 - rectFK.bottom, 0.0f);
            float fMax7 = Math.max(f2 - rectFK.left, 0.0f);
            float fMax8 = Math.max(f2 - rectFK.bottom, 0.0f);
            float f6 = f2;
            float f7 = fH4;
            Path.Direction direction = Path.Direction.CW;
            this.f.addRoundRect(this.f7590k, new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8}, direction);
            this.g.addRoundRect(this.l, new float[]{f, f, fH, fH, f7, f7, f6, f6}, direction);
            y4n y4nVar = this.f7588a;
            float fA = y4nVar != null ? y4nVar.a(8) / 2.0f : 0.0f;
            float f8 = f + fA;
            float f9 = fH + fA;
            float f10 = f7 + fA;
            float f11 = f6 + fA;
            float f12 = fA;
            this.h.addRoundRect(this.m, new float[]{f8, f8, f9, f9, f10, f10, f11, f11}, direction);
            Path path = this.j;
            RectF rectF2 = this.n;
            float[] fArr = new float[8];
            fArr[0] = fMax + (f > 0.0f ? f12 : 0.0f);
            fArr[1] = (f > 0.0f ? f12 : 0.0f) + fMax2;
            fArr[2] = (fH > 0.0f ? f12 : 0.0f) + fMax3;
            fArr[3] = (fH > 0.0f ? f12 : 0.0f) + fMax4;
            fArr[4] = (f7 > 0.0f ? f12 : 0.0f) + fMax5;
            fArr[5] = (f7 > 0.0f ? f12 : 0.0f) + fMax6;
            fArr[6] = (f6 > 0.0f ? f12 : 0.0f) + fMax7;
            fArr[7] = (f6 > 0.0f ? f12 : 0.0f) + fMax8;
            path.addRoundRect(rectF2, fArr, direction);
            if (this.o == null) {
                this.o = new PointF();
            }
            PointF pointF = this.o;
            RectF rectF3 = this.f7590k;
            float f13 = rectF3.left;
            pointF.x = f13;
            float f14 = rectF3.top;
            pointF.y = f14;
            RectF rectF4 = this.l;
            l(f13, f14, (fMax * 2.0f) + f13, (fMax2 * 2.0f) + f14, rectF4.left, rectF4.top, f13, f14, pointF);
            if (this.f7591r == null) {
                this.f7591r = new PointF();
            }
            PointF pointF2 = this.f7591r;
            RectF rectF5 = this.f7590k;
            float f15 = rectF5.left;
            pointF2.x = f15;
            float f16 = rectF5.bottom;
            pointF2.y = f16;
            RectF rectF6 = this.l;
            l(f15, f16 - (fMax8 * 2.0f), (fMax7 * 2.0f) + f15, f16, rectF6.left, rectF6.bottom, f15, f16, pointF2);
            if (this.p == null) {
                this.p = new PointF();
            }
            PointF pointF3 = this.p;
            RectF rectF7 = this.f7590k;
            float f17 = rectF7.right;
            pointF3.x = f17;
            float f18 = rectF7.top;
            pointF3.y = f18;
            RectF rectF8 = this.l;
            l(f17 - (fMax3 * 2.0f), f18, f17, (fMax4 * 2.0f) + f18, rectF8.right, rectF8.top, f17, f18, pointF3);
            if (this.q == null) {
                this.q = new PointF();
            }
            PointF pointF4 = this.q;
            RectF rectF9 = this.f7590k;
            float f19 = rectF9.right;
            pointF4.x = f19;
            float f20 = rectF9.bottom;
            pointF4.y = f20;
            RectF rectF10 = this.l;
            l(f19 - (fMax5 * 2.0f), f20 - (fMax6 * 2.0f), f19, f20, rectF10.right, rectF10.bottom, f19, f20, pointF4);
        }
    }

    public final void C() {
        b bVar = this.d;
        PathEffect pathEffectA = bVar != null ? b.a(bVar, n()) : null;
        this.e = pathEffectA;
        this.u.setPathEffect(pathEffectA);
    }

    public final void b(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i == 0) {
            return;
        }
        if (this.i == null) {
            this.i = new Path();
        }
        this.u.setColor(i);
        this.i.reset();
        this.i.moveTo(f, f2);
        this.i.lineTo(f3, f4);
        this.i.lineTo(f5, f6);
        this.i.lineTo(f7, f8);
        this.i.lineTo(f, f2);
        canvas.drawPath(this.i, this.u);
    }

    public final void c(Canvas canvas) {
        int i;
        int i2;
        int i3;
        ReactViewBackgroundDrawable reactViewBackgroundDrawable;
        int iB = y44.b(this.v, this.w);
        if (Color.alpha(iB) != 0) {
            this.u.setColor(iB);
            this.u.setStyle(Paint.Style.FILL);
            canvas.drawRect(getBounds(), this.u);
        }
        RectF rectFK = k();
        int iRound = Math.round(rectFK.left);
        int iRound2 = Math.round(rectFK.top);
        int iRound3 = Math.round(rectFK.right);
        int iRound4 = Math.round(rectFK.bottom);
        if (iRound > 0 || iRound3 > 0 || iRound2 > 0 || iRound4 > 0) {
            Rect bounds = getBounds();
            int iF = f(0);
            int iF2 = f(1);
            int iF3 = f(2);
            int iF4 = f(3);
            boolean z = o() == 1;
            int iF5 = f(4);
            int iF6 = f(5);
            if (poc.d().b(this.y)) {
                if (q(4)) {
                    iF = iF5;
                }
                if (q(5)) {
                    iF3 = iF6;
                }
                int i4 = z ? iF3 : iF;
                if (!z) {
                    iF = iF3;
                }
                i2 = iF;
                i = i4;
            } else {
                int i5 = z ? iF6 : iF5;
                if (!z) {
                    iF5 = iF6;
                }
                boolean zQ = q(4);
                boolean zQ2 = q(5);
                boolean z2 = z ? zQ2 : zQ;
                if (!z) {
                    zQ = zQ2;
                }
                if (z2) {
                    iF = i5;
                }
                i = iF;
                i2 = zQ ? iF5 : iF3;
            }
            int i6 = bounds.left;
            int i7 = bounds.top;
            int iE = e(iRound, iRound2, iRound3, iRound4, i, iF2, i2, iF4);
            if (iE == 0) {
                this.u.setAntiAlias(false);
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                if (iRound > 0) {
                    float f = i6;
                    float f2 = i7;
                    float f3 = i6 + iRound;
                    float f4 = i7 + iRound2;
                    int i8 = i7 + iHeight;
                    i3 = i7;
                    b(canvas, i, f, f2, f3, f4, f3, i8 - iRound4, f, i8);
                } else {
                    i3 = i7;
                }
                if (iRound2 > 0) {
                    float f5 = i6;
                    float f6 = i3;
                    float f7 = i6 + iRound;
                    float f8 = i3 + iRound2;
                    int i9 = i6 + iWidth;
                    b(canvas, iF2, f5, f6, f7, f8, i9 - iRound3, f8, i9, f6);
                }
                if (iRound3 > 0) {
                    int i10 = i6 + iWidth;
                    float f9 = i10;
                    int i11 = i3 + iHeight;
                    float f10 = i10 - iRound3;
                    b(canvas, i2, f9, i3, f9, i11, f10, i11 - iRound4, f10, i3 + iRound2);
                }
                if (iRound4 > 0) {
                    float f11 = i6;
                    int i12 = i3 + iHeight;
                    float f12 = i12;
                    int i13 = i6 + iWidth;
                    float f13 = i12 - iRound4;
                    reactViewBackgroundDrawable = this;
                    reactViewBackgroundDrawable.b(canvas, iF4, f11, f12, i13, f12, i13 - iRound3, f13, i6 + iRound, f13);
                } else {
                    reactViewBackgroundDrawable = this;
                }
                reactViewBackgroundDrawable.u.setAntiAlias(true);
                return;
            }
            if (Color.alpha(iE) != 0) {
                int i14 = bounds.right;
                int i15 = bounds.bottom;
                this.u.setColor(iE);
                if (iRound > 0) {
                    canvas.drawRect(i6, i7, i6 + iRound, i15 - iRound4, this.u);
                }
                if (iRound2 > 0) {
                    canvas.drawRect(i6 + iRound, i7, i14, i7 + iRound2, this.u);
                }
                if (iRound3 > 0) {
                    canvas.drawRect(i14 - iRound3, i7 + iRound2, i14, i15, this.u);
                }
                if (iRound4 > 0) {
                    canvas.drawRect(i6, i15 - iRound4, i14 - iRound3, i15, this.u);
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        int i;
        int i2;
        float f;
        B();
        canvas.save();
        int iB = y44.b(this.v, this.w);
        if (Color.alpha(iB) != 0) {
            this.u.setColor(iB);
            this.u.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.f, this.u);
        }
        RectF rectFK = k();
        int iF = f(0);
        int iF2 = f(1);
        int iF3 = f(2);
        int iF4 = f(3);
        if (rectFK.top > 0.0f || rectFK.bottom > 0.0f || rectFK.left > 0.0f || rectFK.right > 0.0f) {
            float fN = n();
            int iF5 = f(8);
            if (rectFK.top != fN || rectFK.bottom != fN || rectFK.left != fN || rectFK.right != fN || iF != iF5 || iF2 != iF5 || iF3 != iF5 || iF4 != iF5) {
                this.u.setStyle(Paint.Style.FILL);
                canvas.clipPath(this.g, Region.Op.INTERSECT);
                canvas.clipPath(this.f, Region.Op.DIFFERENCE);
                boolean z = o() == 1;
                int iF6 = f(4);
                int iF7 = f(5);
                if (poc.d().b(this.y)) {
                    if (q(4)) {
                        iF = iF6;
                    }
                    if (q(5)) {
                        iF3 = iF7;
                    }
                    i = z ? iF3 : iF;
                    if (!z) {
                        iF = iF3;
                    }
                    i2 = iF;
                } else {
                    int i3 = z ? iF7 : iF6;
                    if (!z) {
                        iF6 = iF7;
                    }
                    boolean zQ = q(4);
                    boolean zQ2 = q(5);
                    boolean z2 = z ? zQ2 : zQ;
                    if (!z) {
                        zQ = zQ2;
                    }
                    if (z2) {
                        iF = i3;
                    }
                    if (zQ) {
                        i = iF;
                        i2 = iF6;
                    } else {
                        i = iF;
                        i2 = iF3;
                    }
                }
                RectF rectF = this.l;
                float f2 = rectF.left;
                float f3 = rectF.right;
                float f4 = rectF.top;
                float f5 = rectF.bottom;
                if (rectFK.left > 0.0f) {
                    PointF pointF = this.o;
                    float f6 = pointF.x;
                    float f7 = pointF.y;
                    PointF pointF2 = this.f7591r;
                    f = f5;
                    b(canvas, i, f2, f4, f6, f7, pointF2.x, pointF2.y, f2, f);
                } else {
                    f = f5;
                }
                if (rectFK.top > 0.0f) {
                    PointF pointF3 = this.o;
                    float f8 = pointF3.x;
                    float f9 = pointF3.y;
                    PointF pointF4 = this.p;
                    b(canvas, iF2, f2, f4, f8, f9, pointF4.x, pointF4.y, f3, f4);
                }
                if (rectFK.right > 0.0f) {
                    PointF pointF5 = this.p;
                    float f10 = pointF5.x;
                    float f11 = pointF5.y;
                    PointF pointF6 = this.q;
                    b(canvas, i2, f3, f4, f10, f11, pointF6.x, pointF6.y, f3, f);
                }
                if (rectFK.bottom > 0.0f) {
                    PointF pointF7 = this.f7591r;
                    float f12 = pointF7.x;
                    float f13 = pointF7.y;
                    PointF pointF8 = this.q;
                    b(canvas, iF4, f2, f, f12, f13, pointF8.x, pointF8.y, f3, f);
                }
            } else if (fN > 0.0f) {
                this.u.setColor(y44.b(iF5, this.w));
                this.u.setStyle(Paint.Style.STROKE);
                this.u.setStrokeWidth(fN);
                canvas.drawPath(this.j, this.u);
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C();
        if (p()) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    public final int f(int i) {
        y4n y4nVar = this.f7589b;
        float fA = y4nVar != null ? y4nVar.a(i) : 0.0f;
        y4n y4nVar2 = this.c;
        return a(y4nVar2 != null ? y4nVar2.a(i) : 255.0f, fA);
    }

    public float g(BorderRadiusLocation borderRadiusLocation) {
        return h(Float.NaN, borderRadiusLocation);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return y44.a(y44.b(this.v, this.w));
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if ((j0s.a(this.t) || this.t <= 0.0f) && this.x == null) {
            outline.setRect(getBounds());
        } else {
            B();
            outline.setConvexPath(this.h);
        }
    }

    public float h(float f, BorderRadiusLocation borderRadiusLocation) {
        float[] fArr = this.x;
        if (fArr == null) {
            return f;
        }
        float f2 = fArr[borderRadiusLocation.ordinal()];
        return j0s.a(f2) ? f : f2;
    }

    public float i(float f, int i) {
        y4n y4nVar = this.f7588a;
        if (y4nVar == null) {
            return f;
        }
        float fB = y4nVar.b(i);
        return j0s.a(fB) ? f : fB;
    }

    public int j() {
        return this.v;
    }

    public RectF k() {
        float fI = i(0.0f, 8);
        float fI2 = i(fI, 1);
        float fI3 = i(fI, 3);
        float fI4 = i(fI, 0);
        float fI5 = i(fI, 2);
        if (this.f7588a != null) {
            boolean z = o() == 1;
            float fB = this.f7588a.b(4);
            float fB2 = this.f7588a.b(5);
            if (poc.d().b(this.y)) {
                if (!j0s.a(fB)) {
                    fI4 = fB;
                }
                if (!j0s.a(fB2)) {
                    fI5 = fB2;
                }
                float f = z ? fI5 : fI4;
                if (z) {
                    fI5 = fI4;
                }
                fI4 = f;
            } else {
                float f2 = z ? fB2 : fB;
                if (!z) {
                    fB = fB2;
                }
                if (!j0s.a(f2)) {
                    fI4 = f2;
                }
                if (!j0s.a(fB)) {
                    fI5 = fB;
                }
            }
        }
        return new RectF(fI4, fI2, fI5, fI3);
    }

    public float m() {
        if (j0s.a(this.t)) {
            return 0.0f;
        }
        return this.t;
    }

    public float n() {
        y4n y4nVar = this.f7588a;
        if (y4nVar == null || j0s.a(y4nVar.b(8))) {
            return 0.0f;
        }
        return this.f7588a.b(8);
    }

    public int o() {
        return this.z;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.s = true;
    }

    public boolean p() {
        if (!j0s.a(this.t) && this.t > 0.0f) {
            return true;
        }
        float[] fArr = this.x;
        if (fArr != null) {
            for (float f : fArr) {
                if (!j0s.a(f) && f > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q(int i) {
        y4n y4nVar = this.f7589b;
        float fA = y4nVar != null ? y4nVar.a(i) : Float.NaN;
        y4n y4nVar2 = this.c;
        return (j0s.a(fA) || j0s.a(y4nVar2 != null ? y4nVar2.a(i) : Float.NaN)) ? false : true;
    }

    public boolean r(int i) {
        return false;
    }

    public final void s(int i, float f) {
        if (this.c == null) {
            this.c = new y4n(255.0f);
        }
        if (ey9.a(this.c.b(i), f)) {
            return;
        }
        this.c.d(i, f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.w) {
            this.w = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void t(int i, float f, float f2) {
        u(i, f);
        s(i, f2);
    }

    public final void u(int i, float f) {
        if (this.f7589b == null) {
            this.f7589b = new y4n(0.0f);
        }
        if (ey9.a(this.f7589b.b(i), f)) {
            return;
        }
        this.f7589b.d(i, f);
        invalidateSelf();
    }

    public void v(String str) {
        b bVarValueOf = str == null ? null : b.valueOf(str.toUpperCase(Locale.US));
        if (this.d != bVarValueOf) {
            this.d = bVarValueOf;
            this.s = true;
            invalidateSelf();
        }
    }

    public void w(int i, float f) {
        if (this.f7588a == null) {
            this.f7588a = new y4n();
        }
        if (ey9.a(this.f7588a.b(i), f)) {
            return;
        }
        this.f7588a.d(i, f);
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
            this.s = true;
        }
        invalidateSelf();
    }

    public void x(int i) {
        this.v = i;
        invalidateSelf();
    }

    public void y(float f) {
        if (ey9.a(this.t, f)) {
            return;
        }
        this.t = f;
        this.s = true;
        invalidateSelf();
    }

    public void z(float f, int i) {
        if (this.x == null) {
            float[] fArr = new float[8];
            this.x = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (ey9.a(this.x[i], f)) {
            return;
        }
        this.x[i] = f;
        this.s = true;
        invalidateSelf();
    }
}
