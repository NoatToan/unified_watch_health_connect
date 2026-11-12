package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import defpackage.d7c;
import defpackage.f7c;
import defpackage.gjg;
import defpackage.hxq;
import defpackage.ir5;
import defpackage.n8g;
import defpackage.p8g;
import defpackage.pz5;
import defpackage.szd;
import defpackage.u4j;
import defpackage.uf4;
import defpackage.yco;
import defpackage.yho;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements gjg {
    public static boolean E0;
    public yho A;
    public RectF A0;
    public e B;
    public View B0;
    public pz5 C;
    public Matrix C0;
    public boolean D;
    public ArrayList<Integer> D0;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public float J;
    public float K;
    public long L;
    public float M;
    public boolean N;
    public ArrayList<MotionHelper> O;
    public ArrayList<MotionHelper> P;
    public ArrayList<MotionHelper> Q;
    public CopyOnWriteArrayList<k> R;
    public int S;
    public long T;
    public float U;
    public int V;
    public float W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.motion.widget.a f1923a;
    public boolean a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Interpolator f1924b;
    public boolean b0;
    public Interpolator c;
    public int c0;
    public float d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public float i0;
    public boolean j;
    public szd j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap<View, n8g> f1925k;
    public boolean k0;
    public long l;
    public j l0;
    public float m;
    public Runnable m0;
    public float n;
    public int[] n0;
    public float o;
    public int o0;
    public long p;
    public boolean p0;
    public float q;
    public int q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1926r;
    public HashMap<View, hxq> r0;
    public boolean s;
    public int s0;
    public boolean t;
    public int t0;
    public k u;
    public int u0;
    public float v;
    public Rect v0;
    public float w;
    public boolean w0;
    public int x;
    public l x0;
    public f y;
    public g y0;
    public boolean z;
    public boolean z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.l0.a();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1928a;

        public b(MotionLayout motionLayout, View view) {
            this.f1928a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1928a.setNestedScrollingEnabled(true);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.l0.a();
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1930a;

        static {
            int[] iArr = new int[l.values().length];
            f1930a = iArr;
            try {
                iArr[l.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1930a[l.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1930a[l.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1930a[l.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class e extends p8g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f1931a = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f1932b = 0.0f;
        public float c;

        public e() {
        }

        @Override // defpackage.p8g
        public float a() {
            return MotionLayout.this.d;
        }

        public void b(float f, float f2, float f3) {
            this.f1931a = f;
            this.f1932b = f2;
            this.c = f3;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f1931a;
            if (f4 > 0.0f) {
                float f5 = this.c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.d = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.f1932b;
            } else {
                float f6 = this.c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.d = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.f1932b;
            }
            return f2 + f3;
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f1933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f1934b;
        public float[] c;
        public Path d;
        public Paint e;
        public Paint f;
        public Paint g;
        public Paint h;
        public Paint i;
        public float[] j;
        public DashPathEffect p;
        public int q;
        public int t;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f1935k = -21965;
        public final int l = -2067046;
        public final int m = -13391360;
        public final int n = 1996488704;
        public final int o = 10;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Rect f1936r = new Rect();
        public boolean s = false;

        public f() {
            this.t = 1;
            Paint paint = new Paint();
            this.e = paint;
            paint.setAntiAlias(true);
            this.e.setColor(-21965);
            this.e.setStrokeWidth(2.0f);
            Paint paint2 = this.e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f = paint3;
            paint3.setAntiAlias(true);
            this.f.setColor(-2067046);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(style);
            Paint paint4 = new Paint();
            this.g = paint4;
            paint4.setAntiAlias(true);
            this.g.setColor(-13391360);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(style);
            Paint paint5 = new Paint();
            this.h = paint5;
            paint5.setAntiAlias(true);
            this.h.setColor(-13391360);
            this.h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint6 = new Paint();
            this.i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.p = dashPathEffect;
            this.g.setPathEffect(dashPathEffect);
            this.c = new float[100];
            this.f1934b = new int[50];
            if (this.s) {
                this.e.setStrokeWidth(8.0f);
                this.i.setStrokeWidth(8.0f);
                this.f.setStrokeWidth(8.0f);
                this.t = 4;
            }
        }

        public void a(Canvas canvas, HashMap<View, n8g> map, int i, int i2) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.g) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.e);
            }
            for (n8g n8gVar : map.values()) {
                int iM = n8gVar.m();
                if (i2 > 0 && iM == 0) {
                    iM = 1;
                }
                if (iM != 0) {
                    this.q = n8gVar.c(this.c, this.f1934b);
                    if (iM >= 1) {
                        int i3 = i / 16;
                        float[] fArr = this.f1933a;
                        if (fArr == null || fArr.length != i3 * 2) {
                            this.f1933a = new float[i3 * 2];
                            this.d = new Path();
                        }
                        int i4 = this.t;
                        canvas.translate(i4, i4);
                        this.e.setColor(1996488704);
                        this.i.setColor(1996488704);
                        this.f.setColor(1996488704);
                        this.g.setColor(1996488704);
                        n8gVar.d(this.f1933a, i3);
                        b(canvas, iM, this.q, n8gVar);
                        this.e.setColor(-21965);
                        this.f.setColor(-2067046);
                        this.i.setColor(-2067046);
                        this.g.setColor(-13391360);
                        int i5 = this.t;
                        canvas.translate(-i5, -i5);
                        b(canvas, iM, this.q, n8gVar);
                        if (iM == 5) {
                            j(canvas, n8gVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int i, int i2, n8g n8gVar) {
            if (i == 4) {
                d(canvas);
            }
            if (i == 2) {
                g(canvas);
            }
            if (i == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i, i2, n8gVar);
        }

        public final void c(Canvas canvas) {
            canvas.drawLines(this.f1933a, this.e);
        }

        public final void d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.q; i++) {
                int i2 = this.f1934b[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                g(canvas);
            }
            if (z2) {
                e(canvas);
            }
        }

        public final void e(Canvas canvas) {
            float[] fArr = this.f1933a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.g);
        }

        public final void f(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1933a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fMin = Math.min(f3, f5);
            float fMax = Math.max(f4, f6);
            float fMin2 = f - Math.min(f3, f5);
            float fMax2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
            l(str, this.h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f1936r.width() / 2)) + fMin, f2 - 20.0f, this.h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.g);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
            l(str2, this.h);
            canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f1936r.height() / 2)), this.h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.g);
        }

        public final void g(Canvas canvas) {
            float[] fArr = this.f1933a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.g);
        }

        public final void h(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1933a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (fHypot * fHypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            l(str, this.h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f1936r.width() / 2), -20.0f, this.h);
            canvas.drawLine(f, f2, f10, f11, this.g);
        }

        public final void i(Canvas canvas, float f, float f2, int i, int i2) {
            String str = "" + (((int) (((double) (((f - (i / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i))) + 0.5d)) / 100.0f);
            l(str, this.h);
            canvas.drawText(str, ((f / 2.0f) - (this.f1936r.width() / 2)) + 0.0f, f2 - 20.0f, this.h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.g);
            String str2 = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i2))) + 0.5d)) / 100.0f);
            l(str2, this.h);
            canvas.drawText(str2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.f1936r.height() / 2)), this.h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.g);
        }

        public final void j(Canvas canvas, n8g n8gVar) {
            this.d.reset();
            for (int i = 0; i <= 50; i++) {
                n8gVar.e(i / 50, this.j, 0);
                Path path = this.d;
                float[] fArr = this.j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.d;
                float[] fArr2 = this.j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.d;
                float[] fArr3 = this.j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.d;
                float[] fArr4 = this.j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.d.close();
            }
            this.e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.d, this.e);
            canvas.translate(-2.0f, -2.0f);
            this.e.setColor(MenuBuilder.CATEGORY_MASK);
            canvas.drawPath(this.d, this.e);
        }

        public final void k(Canvas canvas, int i, int i2, n8g n8gVar) {
            int width;
            int height;
            View view = n8gVar.f27655b;
            if (view != null) {
                width = view.getWidth();
                height = n8gVar.f27655b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i3 = 1; i3 < i2 - 1; i3++) {
                if (i != 4 || this.f1934b[i3 - 1] != 0) {
                    float[] fArr = this.c;
                    int i4 = i3 * 2;
                    float f = fArr[i4];
                    float f2 = fArr[i4 + 1];
                    this.d.reset();
                    this.d.moveTo(f, f2 + 10.0f);
                    this.d.lineTo(f + 10.0f, f2);
                    this.d.lineTo(f, f2 - 10.0f);
                    this.d.lineTo(f - 10.0f, f2);
                    this.d.close();
                    int i5 = i3 - 1;
                    n8gVar.q(i5);
                    if (i == 4) {
                        int i6 = this.f1934b[i5];
                        if (i6 == 1) {
                            h(canvas, f - 0.0f, f2 - 0.0f);
                        } else if (i6 == 0) {
                            f(canvas, f - 0.0f, f2 - 0.0f);
                        } else {
                            if (i6 == 2) {
                                i(canvas, f - 0.0f, f2 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.d, this.i);
                        }
                        canvas.drawPath(this.d, this.i);
                    } else {
                        f2 = f2;
                        f = f;
                    }
                    if (i == 2) {
                        h(canvas, f - 0.0f, f2 - 0.0f);
                    }
                    if (i == 3) {
                        f(canvas, f - 0.0f, f2 - 0.0f);
                    }
                    if (i == 6) {
                        i(canvas, f - 0.0f, f2 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.d, this.i);
                }
            }
            float[] fArr2 = this.f1933a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f);
                float[] fArr3 = this.f1933a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f);
            }
        }

        public void l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f1936r);
        }
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f1937a = new androidx.constraintlayout.core.widgets.d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f1938b = new androidx.constraintlayout.core.widgets.d();
        public androidx.constraintlayout.widget.a c = null;
        public androidx.constraintlayout.widget.a d = null;
        public int e;
        public int f;

        public g() {
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:26:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:27:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:29:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:41:0x0122 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:0x0122 A[SYNTHETIC] */
        public void a() {
            ConstraintWidget constraintWidgetD;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f1925k.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                n8g n8gVar = new n8g(childAt);
                int id = childAt.getId();
                iArr[i] = id;
                sparseArray.put(id, n8gVar);
                MotionLayout.this.f1925k.put(childAt, n8gVar);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                n8g n8gVar2 = MotionLayout.this.f1925k.get(childAt2);
                if (n8gVar2 != null) {
                    if (this.c != null) {
                        ConstraintWidget constraintWidgetD2 = d(this.f1937a, childAt2);
                        if (constraintWidgetD2 != null) {
                            n8gVar2.G(MotionLayout.this.a0(constraintWidgetD2), this.c, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.x != 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(ir5.b());
                            sb.append("no widget for  ");
                            sb.append(ir5.d(childAt2));
                            sb.append(" (");
                            sb.append(childAt2.getClass().getName());
                            sb.append(")");
                        }
                    } else {
                        if (MotionLayout.this.p0) {
                            hxq hxqVar = MotionLayout.this.r0.get(childAt2);
                            MotionLayout motionLayout = MotionLayout.this;
                            n8gVar2.F(hxqVar, childAt2, motionLayout.q0, motionLayout.s0, MotionLayout.this.t0);
                        }
                        if (this.d == null) {
                            constraintWidgetD = d(this.f1938b, childAt2);
                            if (constraintWidgetD != null) {
                                n8gVar2.C(MotionLayout.this.a0(constraintWidgetD), this.d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                            } else if (MotionLayout.this.x != 0) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(ir5.b());
                                sb2.append("no widget for  ");
                                sb2.append(ir5.d(childAt2));
                                sb2.append(" (");
                                sb2.append(childAt2.getClass().getName());
                                sb2.append(")");
                            }
                        }
                    }
                    if (this.d == null) {
                        constraintWidgetD = d(this.f1938b, childAt2);
                        if (constraintWidgetD != null) {
                            n8gVar2.C(MotionLayout.this.a0(constraintWidgetD), this.d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.x != 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(ir5.b());
                            sb3.append("no widget for  ");
                            sb3.append(ir5.d(childAt2));
                            sb3.append(" (");
                            sb3.append(childAt2.getClass().getName());
                            sb3.append(")");
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                n8g n8gVar3 = (n8g) sparseArray.get(iArr[i3]);
                int iH = n8gVar3.h();
                if (iH != -1) {
                    n8gVar3.J((n8g) sparseArray.get(iH));
                }
            }
        }

        public final void b(int i, int i2) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar = this.f1938b;
                androidx.constraintlayout.widget.a aVar = this.d;
                motionLayout2.resolveSystem(dVar, optimizationLevel, (aVar == null || aVar.d == 0) ? i : i2, (aVar == null || aVar.d == 0) ? i2 : i);
                androidx.constraintlayout.widget.a aVar2 = this.c;
                if (aVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f1937a;
                    int i3 = aVar2.d;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout3.resolveSystem(dVar2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.a aVar3 = this.c;
            if (aVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar3 = this.f1937a;
                int i5 = aVar3.d;
                motionLayout4.resolveSystem(dVar3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            androidx.constraintlayout.core.widgets.d dVar4 = this.f1938b;
            androidx.constraintlayout.widget.a aVar4 = this.d;
            int i6 = (aVar4 == null || aVar4.d == 0) ? i : i2;
            if (aVar4 == null || aVar4.d == 0) {
                i = i2;
            }
            motionLayout5.resolveSystem(dVar4, optimizationLevel, i6, i);
        }

        public void c(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
            ConstraintWidget f7cVar;
            ArrayList<ConstraintWidget> arrayListV1 = dVar.v1();
            HashMap<ConstraintWidget, ConstraintWidget> map = new HashMap<>();
            map.put(dVar, dVar2);
            dVar2.v1().clear();
            dVar2.n(dVar, map);
            for (ConstraintWidget constraintWidget : arrayListV1) {
                if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
                    f7cVar = new androidx.constraintlayout.core.widgets.a();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                    f7cVar = new androidx.constraintlayout.core.widgets.f();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.e) {
                    f7cVar = new androidx.constraintlayout.core.widgets.e();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.h) {
                    f7cVar = new androidx.constraintlayout.core.widgets.h();
                } else {
                    f7cVar = constraintWidget instanceof d7c ? new f7c() : new ConstraintWidget();
                }
                dVar2.a(f7cVar);
                map.put(constraintWidget, f7cVar);
            }
            for (ConstraintWidget constraintWidget2 : arrayListV1) {
                map.get(constraintWidget2).n(constraintWidget2, map);
            }
        }

        public ConstraintWidget d(androidx.constraintlayout.core.widgets.d dVar, View view) {
            if (dVar.u() == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> arrayListV1 = dVar.v1();
            int size = arrayListV1.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = arrayListV1.get(i);
                if (constraintWidget.u() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public void e(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.a aVar, androidx.constraintlayout.widget.a aVar2) {
            this.c = aVar;
            this.d = aVar2;
            this.f1937a = new androidx.constraintlayout.core.widgets.d();
            this.f1938b = new androidx.constraintlayout.core.widgets.d();
            this.f1937a.a2(((ConstraintLayout) MotionLayout.this).mLayoutWidget.N1());
            this.f1938b.a2(((ConstraintLayout) MotionLayout.this).mLayoutWidget.N1());
            this.f1937a.y1();
            this.f1938b.y1();
            c(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f1937a);
            c(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f1938b);
            if (MotionLayout.this.o > 0.5d) {
                if (aVar != null) {
                    j(this.f1937a, aVar);
                }
                j(this.f1938b, aVar2);
            } else {
                j(this.f1938b, aVar2);
                if (aVar != null) {
                    j(this.f1937a, aVar);
                }
            }
            this.f1937a.d2(MotionLayout.this.isRtl());
            this.f1937a.f2();
            this.f1938b.d2(MotionLayout.this.isRtl());
            this.f1938b.f2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f1937a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar2.T0(dimensionBehaviour);
                    this.f1938b.T0(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.d dVar3 = this.f1937a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar3.k1(dimensionBehaviour2);
                    this.f1938b.k1(dimensionBehaviour2);
                }
            }
        }

        public boolean f(int i, int i2) {
            return (i == this.e && i2 == this.f) ? false : true;
        }

        public void g(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.g0 = mode;
            motionLayout.h0 = mode2;
            motionLayout.getOptimizationLevel();
            b(i, i2);
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i, i2);
                MotionLayout.this.c0 = this.f1937a.Y();
                MotionLayout.this.d0 = this.f1937a.z();
                MotionLayout.this.e0 = this.f1938b.Y();
                MotionLayout.this.f0 = this.f1938b.z();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.b0 = (motionLayout2.c0 == motionLayout2.e0 && motionLayout2.d0 == motionLayout2.f0) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i3 = motionLayout3.c0;
            int i4 = motionLayout3.d0;
            int i5 = motionLayout3.g0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (i3 + (motionLayout3.i0 * (motionLayout3.e0 - i3)));
            }
            int i6 = i3;
            int i7 = motionLayout3.h0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i4 = (int) (i4 + (motionLayout3.i0 * (motionLayout3.f0 - i4)));
            }
            MotionLayout.this.resolveMeasuredDimension(i, i2, i6, i4, this.f1937a.V1() || this.f1938b.V1(), this.f1937a.T1() || this.f1938b.T1());
        }

        public void h() {
            g(MotionLayout.this.h, MotionLayout.this.i);
            MotionLayout.this.Z();
        }

        public void i(int i, int i2) {
            this.e = i;
            this.f = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void j(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.a aVar) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            if (aVar != null && aVar.d != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.resolveSystem(this.f1938b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            for (ConstraintWidget constraintWidget : dVar.v1()) {
                constraintWidget.D0(true);
                sparseArray.put(((View) constraintWidget.u()).getId(), constraintWidget);
            }
            for (ConstraintWidget constraintWidget2 : dVar.v1()) {
                View view = (View) constraintWidget2.u();
                aVar.l(view.getId(), layoutParams);
                constraintWidget2.o1(aVar.K(view.getId()));
                constraintWidget2.P0(aVar.F(view.getId()));
                if (view instanceof ConstraintHelper) {
                    aVar.j((ConstraintHelper) view, constraintWidget2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).w();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, constraintWidget2, layoutParams, sparseArray);
                if (aVar.J(view.getId()) == 1) {
                    constraintWidget2.n1(view.getVisibility());
                } else {
                    constraintWidget2.n1(aVar.I(view.getId()));
                }
            }
            for (ConstraintWidget constraintWidget3 : dVar.v1()) {
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.i) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) constraintWidget3.u();
                    d7c d7cVar = (d7c) constraintWidget3;
                    constraintHelper.u(dVar, d7cVar, sparseArray);
                    ((androidx.constraintlayout.core.widgets.i) d7cVar).y1();
                }
            }
        }
    }

    public interface h {
        void a(MotionEvent motionEvent);

        float b();

        void c(int i);

        float d();

        void recycle();
    }

    public static class i implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static i f1939b = new i();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public VelocityTracker f1940a;

        public static i e() {
            f1939b.f1940a = VelocityTracker.obtain();
            return f1939b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public void a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f1940a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public float b() {
            VelocityTracker velocityTracker = this.f1940a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public void c(int i) {
            VelocityTracker velocityTracker = this.f1940a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public float d() {
            VelocityTracker velocityTracker = this.f1940a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public void recycle() {
            VelocityTracker velocityTracker = this.f1940a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1940a = null;
            }
        }
    }

    public class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f1941a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f1942b = Float.NaN;
        public int c = -1;
        public int d = -1;
        public final String e = "motion.progress";
        public final String f = "motion.velocity";
        public final String g = "motion.StartState";
        public final String h = "motion.EndState";

        public j() {
        }

        public void a() {
            int i = this.c;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    MotionLayout.this.f0(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.Y(i, i2);
                    }
                }
                MotionLayout.this.setState(l.SETUP);
            }
            if (Float.isNaN(this.f1942b)) {
                if (Float.isNaN(this.f1941a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f1941a);
            } else {
                MotionLayout.this.X(this.f1941a, this.f1942b);
                this.f1941a = Float.NaN;
                this.f1942b = Float.NaN;
                this.c = -1;
                this.d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1941a);
            bundle.putFloat("motion.velocity", this.f1942b);
            bundle.putInt("motion.StartState", this.c);
            bundle.putInt("motion.EndState", this.d);
            return bundle;
        }

        public void c() {
            this.d = MotionLayout.this.g;
            this.c = MotionLayout.this.e;
            this.f1942b = MotionLayout.this.getVelocity();
            this.f1941a = MotionLayout.this.getProgress();
        }

        public void d(int i) {
            this.d = i;
        }

        public void e(float f) {
            this.f1941a = f;
        }

        public void f(int i) {
            this.c = i;
        }

        public void g(Bundle bundle) {
            this.f1941a = bundle.getFloat("motion.progress");
            this.f1942b = bundle.getFloat("motion.velocity");
            this.c = bundle.getInt("motion.StartState");
            this.d = bundle.getInt("motion.EndState");
        }

        public void h(float f) {
            this.f1942b = f;
        }
    }

    public interface k {
        void a(MotionLayout motionLayout, int i, int i2, float f);

        void b(MotionLayout motionLayout, int i);

        void c(MotionLayout motionLayout, int i, int i2);

        void d(MotionLayout motionLayout, int i, boolean z, float f);
    }

    public enum l {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context) {
        super(context);
        this.c = null;
        this.d = 0.0f;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.f1925k = new HashMap<>();
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.t = false;
        this.x = 0;
        this.z = false;
        this.A = new yho();
        this.B = new e();
        this.D = true;
        this.I = false;
        this.N = false;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = 0;
        this.T = -1L;
        this.U = 0.0f;
        this.V = 0;
        this.W = 0.0f;
        this.a0 = false;
        this.b0 = false;
        this.j0 = new szd();
        this.k0 = false;
        this.m0 = null;
        this.n0 = null;
        this.o0 = 0;
        this.p0 = false;
        this.q0 = 0;
        this.r0 = new HashMap<>();
        this.v0 = new Rect();
        this.w0 = false;
        this.x0 = l.UNDEFINED;
        this.y0 = new g();
        this.z0 = false;
        this.A0 = new RectF();
        this.B0 = null;
        this.C0 = null;
        this.D0 = new ArrayList<>();
        R(null);
    }

    public static boolean l0(float f2, float f3, float f4) {
        if (f2 > 0.0f) {
            float f5 = f2 / f4;
            return f3 + ((f2 * f5) - (((f4 * f5) * f5) / 2.0f)) > 1.0f;
        }
        float f6 = (-f2) / f4;
        return f3 + ((f2 * f6) + (((f4 * f6) * f6) / 2.0f)) < 0.0f;
    }

    public final boolean A(View view, MotionEvent motionEvent, float f2, float f3) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f2, f3);
            boolean zOnTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f2, -f3);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(f2, f3);
        if (this.C0 == null) {
            this.C0 = new Matrix();
        }
        matrix.invert(this.C0);
        motionEventObtain.transform(this.C0);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    public final void B() {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar == null) {
            return;
        }
        int iF = aVar.F();
        androidx.constraintlayout.motion.widget.a aVar2 = this.f1923a;
        C(iF, aVar2.l(aVar2.F()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (androidx.constraintlayout.motion.widget.a.b bVar : this.f1923a.o()) {
            androidx.constraintlayout.motion.widget.a.b bVar2 = this.f1923a.c;
            D(bVar);
            int iA = bVar.A();
            int iY = bVar.y();
            String strC = ir5.c(getContext(), iA);
            String strC2 = ir5.c(getContext(), iY);
            if (sparseIntArray.get(iA) == iY) {
                StringBuilder sb = new StringBuilder();
                sb.append("CHECK: two transitions with the same start and end ");
                sb.append(strC);
                sb.append(LifecycleConstantKt.DATA_DELIMITER);
                sb.append(strC2);
            }
            if (sparseIntArray2.get(iY) == iA) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CHECK: you can't have reverse transitions");
                sb2.append(strC);
                sb2.append(LifecycleConstantKt.DATA_DELIMITER);
                sb2.append(strC2);
            }
            sparseIntArray.put(iA, iY);
            sparseIntArray2.put(iY, iA);
            if (this.f1923a.l(iA) == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" no such constraintSetStart ");
                sb3.append(strC);
            }
            if (this.f1923a.l(iY) == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" no such constraintSetEnd ");
                sb4.append(strC);
            }
        }
    }

    public final void C(int i2, androidx.constraintlayout.widget.a aVar) {
        String strC = ir5.c(getContext(), i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            if (id == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("CHECK: ");
                sb.append(strC);
                sb.append(" ALL VIEWS SHOULD HAVE ID's ");
                sb.append(childAt.getClass().getName());
                sb.append(" does not!");
            }
            if (aVar.E(id) == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CHECK: ");
                sb2.append(strC);
                sb2.append(" NO CONSTRAINTS for ");
                sb2.append(ir5.d(childAt));
            }
        }
        int[] iArrG = aVar.G();
        for (int i4 = 0; i4 < iArrG.length; i4++) {
            int i5 = iArrG[i4];
            String strC2 = ir5.c(getContext(), i5);
            if (findViewById(iArrG[i4]) == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("CHECK: ");
                sb3.append(strC);
                sb3.append(" NO View matches id ");
                sb3.append(strC2);
            }
            if (aVar.F(i5) == -1) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("CHECK: ");
                sb4.append(strC);
                sb4.append("(");
                sb4.append(strC2);
                sb4.append(") no LAYOUT_HEIGHT");
            }
            if (aVar.K(i5) == -1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("CHECK: ");
                sb5.append(strC);
                sb5.append("(");
                sb5.append(strC2);
                sb5.append(") no LAYOUT_HEIGHT");
            }
        }
    }

    public final void D(androidx.constraintlayout.motion.widget.a.b bVar) {
        bVar.A();
        bVar.y();
    }

    public final void E() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            n8g n8gVar = this.f1925k.get(childAt);
            if (n8gVar != null) {
                n8gVar.E(childAt);
            }
        }
    }

    public void F(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            n8g n8gVar = this.f1925k.get(getChildAt(i2));
            if (n8gVar != null) {
                n8gVar.f(z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01be  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:143:0x0222  */
    /* JADX WARN: Code duplicated, block: B:180:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ab, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x0138  */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0151  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    /* JADX WARN: Code duplicated, block: B:96:0x0170  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    public void G(boolean z) {
        boolean z2;
        char c2;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i2;
        int i3;
        int i4;
        int i5;
        View childAt;
        n8g n8gVar;
        boolean z3;
        if (this.p == -1) {
            this.p = getNanoTime();
        }
        float f2 = this.o;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f = -1;
        }
        boolean z4 = false;
        if (this.N || (this.s && (z || this.q != f2))) {
            float fSignum = Math.signum(this.q - f2);
            long nanoTime2 = getNanoTime();
            Interpolator interpolator3 = this.f1924b;
            float f3 = !(interpolator3 instanceof p8g) ? (((nanoTime2 - this.p) * fSignum) * 1.0E-9f) / this.m : 0.0f;
            float f4 = this.o + f3;
            if (this.f1926r) {
                f4 = this.q;
            }
            if ((fSignum <= 0.0f || f4 < this.q) && (fSignum > 0.0f || f4 > this.q)) {
                z2 = false;
            } else {
                f4 = this.q;
                this.s = false;
                z2 = true;
            }
            this.o = f4;
            this.n = f4;
            this.p = nanoTime2;
            if (interpolator3 == null || z2) {
                this.d = f3;
            } else {
                if (this.z) {
                    float interpolation2 = interpolator3.getInterpolation((nanoTime2 - this.l) * 1.0E-9f);
                    Interpolator interpolator4 = this.f1924b;
                    yho yhoVar = this.A;
                    c2 = interpolator4 == yhoVar ? yhoVar.c() ? (char) 2 : (char) 1 : (char) 0;
                    this.o = interpolation2;
                    this.p = nanoTime2;
                    Interpolator interpolator5 = this.f1924b;
                    if (interpolator5 instanceof p8g) {
                        float fA = ((p8g) interpolator5).a();
                        this.d = fA;
                        if (Math.abs(fA) * this.m <= 1.0E-5f && c2 == 2) {
                            this.s = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.o = 1.0f;
                            this.s = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f4 = interpolation2;
                        } else {
                            this.o = 0.0f;
                            this.s = false;
                            f4 = 0.0f;
                        }
                    } else {
                        f4 = interpolation2;
                    }
                } else {
                    float interpolation3 = interpolator3.getInterpolation(f4);
                    Interpolator interpolator6 = this.f1924b;
                    if (interpolator6 instanceof p8g) {
                        this.d = ((p8g) interpolator6).a();
                    } else {
                        this.d = ((interpolator6.getInterpolation(f4 + f3) - interpolation3) * fSignum) / f3;
                    }
                    f4 = interpolation3;
                }
                if (Math.abs(this.d) > 1.0E-5f) {
                    setState(l.MOVING);
                }
                if (c2 != 1) {
                    if ((fSignum <= 0.0f && f4 >= this.q) || (fSignum <= 0.0f && f4 <= this.q)) {
                        f4 = this.q;
                        this.s = false;
                    }
                    if (f4 < 1.0f || f4 <= 0.0f) {
                        this.s = false;
                        setState(l.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.N = false;
                nanoTime = getNanoTime();
                this.i0 = f4;
                interpolator = this.c;
                if (interpolator == null) {
                    interpolation = f4;
                } else {
                    interpolation = interpolator.getInterpolation(f4);
                }
                interpolator2 = this.c;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.m) + f4);
                    this.d = interpolation4;
                    this.d = interpolation4 - this.c.getInterpolation(f4);
                }
                for (i2 = 0; i2 < childCount; i2++) {
                    childAt = getChildAt(i2);
                    n8gVar = this.f1925k.get(childAt);
                    if (n8gVar != null) {
                        this.N = n8gVar.x(childAt, interpolation, nanoTime, this.j0) | this.N;
                    }
                }
                boolean z5 = (fSignum <= 0.0f && f4 >= this.q) || (fSignum <= 0.0f && f4 <= this.q);
                if (!this.N && !this.s && z5) {
                    setState(l.FINISHED);
                }
                if (this.b0) {
                    requestLayout();
                }
                this.N = (!z5) | this.N;
                if (f4 <= 0.0f && (i5 = this.e) != -1 && this.f != i5) {
                    this.f = i5;
                    this.f1923a.l(i5).g(this);
                    setState(l.FINISHED);
                    z4 = true;
                }
                if (f4 >= 1.0d) {
                    i3 = this.f;
                    i4 = this.g;
                    if (i3 != i4) {
                        this.f = i4;
                        this.f1923a.l(i4).g(this);
                        setState(l.FINISHED);
                        z4 = true;
                    }
                }
                if (!this.N || this.s) {
                    invalidate();
                } else if ((fSignum > 0.0f && f4 == 1.0f) || (fSignum < 0.0f && f4 == 0.0f)) {
                    setState(l.FINISHED);
                }
                if (!this.N && !this.s && ((fSignum > 0.0f && f4 == 1.0f) || (fSignum < 0.0f && f4 == 0.0f))) {
                    U();
                }
            }
            c2 = 0;
            if (Math.abs(this.d) > 1.0E-5f) {
                setState(l.MOVING);
            }
            if (c2 != 1) {
                if (fSignum <= 0.0f) {
                    f4 = this.q;
                    this.s = false;
                } else {
                    f4 = this.q;
                    this.s = false;
                }
                if (f4 < 1.0f) {
                    this.s = false;
                    setState(l.FINISHED);
                } else {
                    this.s = false;
                    setState(l.FINISHED);
                }
            }
            childCount = getChildCount();
            this.N = false;
            nanoTime = getNanoTime();
            this.i0 = f4;
            interpolator = this.c;
            if (interpolator == null) {
                interpolation = f4;
            } else {
                interpolation = interpolator.getInterpolation(f4);
            }
            interpolator2 = this.c;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.m) + f4);
                this.d = interpolation5;
                this.d = interpolation5 - this.c.getInterpolation(f4);
            }
            while (i2 < childCount) {
                childAt = getChildAt(i2);
                n8gVar = this.f1925k.get(childAt);
                if (n8gVar != null) {
                    this.N = n8gVar.x(childAt, interpolation, nanoTime, this.j0) | this.N;
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.N) {
                setState(l.FINISHED);
            }
            if (this.b0) {
                requestLayout();
            }
            this.N = (!z5) | this.N;
            if (f4 <= 0.0f) {
                this.f = i5;
                this.f1923a.l(i5).g(this);
                setState(l.FINISHED);
                z4 = true;
            }
            if (f4 >= 1.0d) {
                i3 = this.f;
                i4 = this.g;
                if (i3 != i4) {
                    this.f = i4;
                    this.f1923a.l(i4).g(this);
                    setState(l.FINISHED);
                    z4 = true;
                }
            }
            if (this.N) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.N) {
                U();
            }
        }
        float f5 = this.o;
        if (f5 < 1.0f) {
            if (f5 <= 0.0f) {
                int i6 = this.f;
                int i7 = this.e;
                z3 = i6 == i7 ? z4 : true;
                this.f = i7;
            }
            this.z0 |= z4;
            if (z4 && !this.k0) {
                requestLayout();
            }
            this.n = this.o;
        }
        int i8 = this.f;
        int i9 = this.g;
        z3 = i8 == i9 ? z4 : true;
        this.f = i9;
        z4 = z3;
        this.z0 |= z4;
        if (z4) {
            requestLayout();
        }
        this.n = this.o;
    }

    public final void H() {
        boolean z;
        float fSignum = Math.signum(this.q - this.o);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f1924b;
        float interpolation = this.o + (!(interpolator instanceof yho) ? (((nanoTime - this.p) * fSignum) * 1.0E-9f) / this.m : 0.0f);
        if (this.f1926r) {
            interpolation = this.q;
        }
        if ((fSignum <= 0.0f || interpolation < this.q) && (fSignum > 0.0f || interpolation > this.q)) {
            z = false;
        } else {
            interpolation = this.q;
            z = true;
        }
        if (interpolator != null && !z) {
            interpolation = this.z ? interpolator.getInterpolation((nanoTime - this.l) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.q) || (fSignum <= 0.0f && interpolation <= this.q)) {
            interpolation = this.q;
        }
        this.i0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.c;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            n8g n8gVar = this.f1925k.get(childAt);
            if (n8gVar != null) {
                n8gVar.x(childAt, interpolation, nanoTime2, this.j0);
            }
        }
        if (this.b0) {
            requestLayout();
        }
    }

    public final void I() {
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if ((this.u == null && ((copyOnWriteArrayList = this.R) == null || copyOnWriteArrayList.isEmpty())) || this.W == this.n) {
            return;
        }
        if (this.V != -1) {
            k kVar = this.u;
            if (kVar != null) {
                kVar.c(this, this.e, this.g);
            }
            CopyOnWriteArrayList<k> copyOnWriteArrayList2 = this.R;
            if (copyOnWriteArrayList2 != null) {
                Iterator<k> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(this, this.e, this.g);
                }
            }
            this.a0 = true;
        }
        this.V = -1;
        float f2 = this.n;
        this.W = f2;
        k kVar2 = this.u;
        if (kVar2 != null) {
            kVar2.a(this, this.e, this.g, f2);
        }
        CopyOnWriteArrayList<k> copyOnWriteArrayList3 = this.R;
        if (copyOnWriteArrayList3 != null) {
            Iterator<k> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.e, this.g, this.n);
            }
        }
        this.a0 = true;
    }

    public void J() {
        int iIntValue;
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if ((this.u != null || ((copyOnWriteArrayList = this.R) != null && !copyOnWriteArrayList.isEmpty())) && this.V == -1) {
            this.V = this.f;
            if (this.D0.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.D0;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i2 = this.f;
            if (iIntValue != i2 && i2 != -1) {
                this.D0.add(Integer.valueOf(i2));
            }
        }
        V();
        Runnable runnable = this.m0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.n0;
        if (iArr == null || this.o0 <= 0) {
            return;
        }
        f0(iArr[0]);
        int[] iArr2 = this.n0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.o0--;
    }

    public void K(int i2, boolean z, float f2) {
        k kVar = this.u;
        if (kVar != null) {
            kVar.d(this, i2, z, f2);
        }
        CopyOnWriteArrayList<k> copyOnWriteArrayList = this.R;
        if (copyOnWriteArrayList != null) {
            Iterator<k> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().d(this, i2, z, f2);
            }
        }
    }

    public void L(int i2, float f2, float f3, float f4, float[] fArr) {
        String resourceName;
        HashMap<View, n8g> map = this.f1925k;
        View viewById = getViewById(i2);
        n8g n8gVar = map.get(viewById);
        if (n8gVar != null) {
            n8gVar.l(f2, f3, f4, fArr);
            float y = viewById.getY();
            this.v = f2;
            this.w = y;
            return;
        }
        if (viewById == null) {
            resourceName = "" + i2;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(i2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("WARNING could not find view id ");
        sb.append(resourceName);
    }

    public androidx.constraintlayout.widget.a M(int i2) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar == null) {
            return null;
        }
        return aVar.l(i2);
    }

    public n8g N(int i2) {
        return this.f1925k.get(findViewById(i2));
    }

    public androidx.constraintlayout.motion.widget.a.b O(int i2) {
        return this.f1923a.G(i2);
    }

    public void P(View view, float f2, float f3, float[] fArr, int i2) {
        float interpolation;
        float fA = this.d;
        float f4 = this.o;
        if (this.f1924b != null) {
            float fSignum = Math.signum(this.q - f4);
            float interpolation2 = this.f1924b.getInterpolation(this.o + 1.0E-5f);
            interpolation = this.f1924b.getInterpolation(this.o);
            fA = (fSignum * ((interpolation2 - interpolation) / 1.0E-5f)) / this.m;
        } else {
            interpolation = f4;
        }
        Interpolator interpolator = this.f1924b;
        if (interpolator instanceof p8g) {
            fA = ((p8g) interpolator).a();
        }
        n8g n8gVar = this.f1925k.get(view);
        if ((i2 & 1) == 0) {
            n8gVar.r(interpolation, view.getWidth(), view.getHeight(), f2, f3, fArr);
        } else {
            n8gVar.l(interpolation, f2, f3, fArr);
        }
        if (i2 < 2) {
            fArr[0] = fArr[0] * fA;
            fArr[1] = fArr[1] * fA;
        }
    }

    public final boolean Q(float f2, float f3, View view, MotionEvent motionEvent) {
        boolean z;
        if (!(view instanceof ViewGroup)) {
            z = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (Q((childAt.getLeft() + f2) - view.getScrollX(), (childAt.getTop() + f3) - view.getScrollY(), childAt, motionEvent)) {
                z = true;
                break;
            }
            childCount--;
        }
        if (!z) {
            this.A0.set(f2, f3, (view.getRight() + f2) - view.getLeft(), (view.getBottom() + f3) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.A0.contains(motionEvent.getX(), motionEvent.getY())) && A(view, motionEvent, -f2, -f3)) {
                return true;
            }
        }
        return z;
    }

    public final void R(AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.a aVar;
        E0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.ca);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == u4j.fa) {
                    this.f1923a = new androidx.constraintlayout.motion.widget.a(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == u4j.ea) {
                    this.f = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == u4j.ha) {
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.s = true;
                } else if (index == u4j.da) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == u4j.ia) {
                    if (this.x == 0) {
                        this.x = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == u4j.ga) {
                    this.x = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                this.f1923a = null;
            }
        }
        if (this.x != 0) {
            B();
        }
        if (this.f != -1 || (aVar = this.f1923a) == null) {
            return;
        }
        this.f = aVar.F();
        this.e = this.f1923a.F();
        this.g = this.f1923a.q();
    }

    public boolean S() {
        return this.j;
    }

    public h T() {
        return i.e();
    }

    public void U() {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar == null) {
            return;
        }
        if (aVar.h(this, this.f)) {
            requestLayout();
            return;
        }
        int i2 = this.f;
        if (i2 != -1) {
            this.f1923a.f(this, i2);
        }
        if (this.f1923a.b0()) {
            this.f1923a.Z();
        }
    }

    public final void V() {
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if (this.u == null && ((copyOnWriteArrayList = this.R) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.a0 = false;
        for (Integer num : this.D0) {
            k kVar = this.u;
            if (kVar != null) {
                kVar.b(this, num.intValue());
            }
            CopyOnWriteArrayList<k> copyOnWriteArrayList2 = this.R;
            if (copyOnWriteArrayList2 != null) {
                Iterator<k> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b(this, num.intValue());
                }
            }
        }
        this.D0.clear();
    }

    public void W() {
        this.y0.h();
        invalidate();
    }

    public void X(float f2, float f3) {
        if (!isAttachedToWindow()) {
            if (this.l0 == null) {
                this.l0 = new j();
            }
            this.l0.e(f2);
            this.l0.h(f3);
            return;
        }
        setProgress(f2);
        setState(l.MOVING);
        this.d = f3;
        if (f3 != 0.0f) {
            y(f3 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f2 == 0.0f || f2 == 1.0f) {
                return;
            }
            y(f2 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void Y(int i2, int i3) {
        if (!isAttachedToWindow()) {
            if (this.l0 == null) {
                this.l0 = new j();
            }
            this.l0.f(i2);
            this.l0.d(i3);
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar != null) {
            this.e = i2;
            this.g = i3;
            aVar.X(i2, i3);
            this.y0.e(this.mLayoutWidget, this.f1923a.l(i2), this.f1923a.l(i3));
            W();
            this.o = 0.0f;
            e0();
        }
    }

    public final void Z() {
        int childCount = getChildCount();
        this.y0.a();
        this.s = true;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            sparseArray.put(childAt.getId(), this.f1925k.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int iJ = this.f1923a.j();
        if (iJ != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                n8g n8gVar = this.f1925k.get(getChildAt(i4));
                if (n8gVar != null) {
                    n8gVar.D(iJ);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f1925k.size()];
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            n8g n8gVar2 = this.f1925k.get(getChildAt(i6));
            if (n8gVar2.h() != -1) {
                sparseBooleanArray.put(n8gVar2.h(), true);
                iArr[i5] = n8gVar2.h();
                i5++;
            }
        }
        if (this.Q != null) {
            for (int i7 = 0; i7 < i5; i7++) {
                n8g n8gVar3 = this.f1925k.get(findViewById(iArr[i7]));
                if (n8gVar3 != null) {
                    this.f1923a.t(n8gVar3);
                }
            }
            Iterator<MotionHelper> it = this.Q.iterator();
            while (it.hasNext()) {
                it.next().D(this, this.f1925k);
            }
            for (int i8 = 0; i8 < i5; i8++) {
                n8g n8gVar4 = this.f1925k.get(findViewById(iArr[i8]));
                if (n8gVar4 != null) {
                    n8gVar4.I(width, height, this.m, getNanoTime());
                }
            }
        } else {
            for (int i9 = 0; i9 < i5; i9++) {
                n8g n8gVar5 = this.f1925k.get(findViewById(iArr[i9]));
                if (n8gVar5 != null) {
                    this.f1923a.t(n8gVar5);
                    n8gVar5.I(width, height, this.m, getNanoTime());
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            n8g n8gVar6 = this.f1925k.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && n8gVar6 != null) {
                this.f1923a.t(n8gVar6);
                n8gVar6.I(width, height, this.m, getNanoTime());
            }
        }
        float fE = this.f1923a.E();
        if (fE != 0.0f) {
            boolean z = ((double) fE) < 0.0d;
            float fAbs = Math.abs(fE);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i11 = 0; i11 < childCount; i11++) {
                n8g n8gVar7 = this.f1925k.get(getChildAt(i11));
                if (!Float.isNaN(n8gVar7.m)) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        n8g n8gVar8 = this.f1925k.get(getChildAt(i12));
                        if (!Float.isNaN(n8gVar8.m)) {
                            fMin = Math.min(fMin, n8gVar8.m);
                            fMax = Math.max(fMax, n8gVar8.m);
                        }
                    }
                    while (i2 < childCount) {
                        n8g n8gVar9 = this.f1925k.get(getChildAt(i2));
                        if (!Float.isNaN(n8gVar9.m)) {
                            n8gVar9.o = 1.0f / (1.0f - fAbs);
                            if (z) {
                                n8gVar9.n = fAbs - (((fMax - n8gVar9.m) / (fMax - fMin)) * fAbs);
                            } else {
                                n8gVar9.n = fAbs - (((n8gVar9.m - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i2++;
                    }
                    return;
                }
                float fN = n8gVar7.n();
                float fO = n8gVar7.o();
                float f2 = z ? fO - fN : fO + fN;
                fMin2 = Math.min(fMin2, f2);
                fMax2 = Math.max(fMax2, f2);
            }
            while (i2 < childCount) {
                n8g n8gVar10 = this.f1925k.get(getChildAt(i2));
                float fN2 = n8gVar10.n();
                float fO2 = n8gVar10.o();
                float f3 = z ? fO2 - fN2 : fO2 + fN2;
                n8gVar10.o = 1.0f / (1.0f - fAbs);
                n8gVar10.n = fAbs - (((f3 - fMin2) * fAbs) / (fMax2 - fMin2));
                i2++;
            }
        }
    }

    public final Rect a0(ConstraintWidget constraintWidget) {
        this.v0.top = constraintWidget.a0();
        this.v0.left = constraintWidget.Z();
        Rect rect = this.v0;
        int iY = constraintWidget.Y();
        Rect rect2 = this.v0;
        rect.right = iY + rect2.left;
        int iZ = constraintWidget.z();
        Rect rect3 = this.v0;
        rect2.bottom = iZ + rect3.top;
        return rect3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    public void b0(int i2, float f2, float f3) {
        if (this.f1923a == null || this.o == f2) {
            return;
        }
        this.z = true;
        this.l = getNanoTime();
        this.m = this.f1923a.p() / 1000.0f;
        this.q = f2;
        this.s = true;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (i2 != 1 || i2 == 7) {
                f2 = 0.0f;
            } else if (i2 == 2 || i2 == 6) {
                f2 = 1.0f;
            }
            if (this.f1923a.k() == 0) {
                this.A.b(this.o, f2, f3, this.m, this.f1923a.u(), this.f1923a.v());
            } else {
                this.A.d(this.o, f2, f3, this.f1923a.B(), this.f1923a.C(), this.f1923a.A(), this.f1923a.D(), this.f1923a.z());
            }
            int i3 = this.f;
            this.q = f2;
            this.f = i3;
            this.f1924b = this.A;
        } else if (i2 == 4) {
            this.B.b(f3, this.o, this.f1923a.u());
            this.f1924b = this.B;
        } else if (i2 != 5) {
            if (i2 == 6 || i2 == 7) {
                if (i2 != 1) {
                    f2 = 0.0f;
                } else {
                    f2 = 0.0f;
                }
                if (this.f1923a.k() == 0) {
                    this.A.b(this.o, f2, f3, this.m, this.f1923a.u(), this.f1923a.v());
                } else {
                    this.A.d(this.o, f2, f3, this.f1923a.B(), this.f1923a.C(), this.f1923a.A(), this.f1923a.D(), this.f1923a.z());
                }
                int i4 = this.f;
                this.q = f2;
                this.f = i4;
                this.f1924b = this.A;
            }
        } else if (l0(f3, this.o, this.f1923a.u())) {
            this.B.b(f3, this.o, this.f1923a.u());
            this.f1924b = this.B;
        } else {
            this.A.b(this.o, f2, f3, this.m, this.f1923a.u(), this.f1923a.v());
            this.d = 0.0f;
            int i5 = this.f;
            this.q = f2;
            this.f = i5;
            this.f1924b = this.A;
        }
        this.f1926r = false;
        this.l = getNanoTime();
        invalidate();
    }

    public void c0() {
        y(1.0f);
        this.m0 = null;
    }

    public void d0(Runnable runnable) {
        y(1.0f);
        this.m0 = runnable;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        androidx.constraintlayout.motion.widget.d dVar;
        ArrayList<MotionHelper> arrayList = this.Q;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().C(canvas);
            }
        }
        G(false);
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar != null && (dVar = aVar.s) != null) {
            dVar.c();
        }
        super.dispatchDraw(canvas);
        if (this.f1923a == null) {
            return;
        }
        if ((this.x & 1) == 1 && !isInEditMode()) {
            this.S++;
            long nanoTime = getNanoTime();
            long j2 = this.T;
            if (j2 != -1) {
                long j3 = nanoTime - j2;
                if (j3 > 200000000) {
                    this.U = ((int) ((this.S / (j3 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.S = 0;
                    this.T = nanoTime;
                }
            } else {
                this.T = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            String str = this.U + " fps " + ir5.e(this, this.e) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(ir5.e(this, this.g));
            sb.append(" (progress: ");
            sb.append(progress);
            sb.append(" ) state=");
            int i2 = this.f;
            sb.append(i2 == -1 ? "undefined" : ir5.e(this, i2));
            String string = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.x > 1) {
            if (this.y == null) {
                this.y = new f();
            }
            this.y.a(canvas, this.f1925k, this.f1923a.p(), this.x);
        }
        ArrayList<MotionHelper> arrayList2 = this.Q;
        if (arrayList2 != null) {
            Iterator<MotionHelper> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().B(canvas);
            }
        }
    }

    public void e0() {
        y(0.0f);
    }

    public void f0(int i2) {
        if (isAttachedToWindow()) {
            g0(i2, -1, -1);
            return;
        }
        if (this.l0 == null) {
            this.l0 = new j();
        }
        this.l0.d(i2);
    }

    public void g0(int i2, int i3, int i4) {
        h0(i2, i3, i4, -1);
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar == null) {
            return null;
        }
        return aVar.n();
    }

    public int getCurrentState() {
        return this.f;
    }

    public ArrayList<androidx.constraintlayout.motion.widget.a.b> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar == null) {
            return null;
        }
        return aVar.o();
    }

    public pz5 getDesignTool() {
        if (this.C == null) {
            this.C = new pz5(this);
        }
        return this.C;
    }

    public int getEndState() {
        return this.g;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.o;
    }

    public androidx.constraintlayout.motion.widget.a getScene() {
        return this.f1923a;
    }

    public int getStartState() {
        return this.e;
    }

    public float getTargetPosition() {
        return this.q;
    }

    public Bundle getTransitionState() {
        if (this.l0 == null) {
            this.l0 = new j();
        }
        this.l0.c();
        return this.l0.b();
    }

    public long getTransitionTimeMs() {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar != null) {
            this.m = aVar.p() / 1000.0f;
        }
        return (long) (this.m * 1000.0f);
    }

    public float getVelocity() {
        return this.d;
    }

    public void h0(int i2, int i3, int i4, int i5) {
        yco ycoVar;
        int iA;
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar != null && (ycoVar = aVar.f1946b) != null && (iA = ycoVar.a(this.f, i2, i3, i4)) != -1) {
            i2 = iA;
        }
        int i6 = this.f;
        if (i6 == i2) {
            return;
        }
        if (this.e == i2) {
            y(0.0f);
            if (i5 > 0) {
                this.m = i5 / 1000.0f;
                return;
            }
            return;
        }
        if (this.g == i2) {
            y(1.0f);
            if (i5 > 0) {
                this.m = i5 / 1000.0f;
                return;
            }
            return;
        }
        this.g = i2;
        if (i6 != -1) {
            Y(i6, i2);
            y(1.0f);
            this.o = 0.0f;
            c0();
            if (i5 > 0) {
                this.m = i5 / 1000.0f;
                return;
            }
            return;
        }
        this.z = false;
        this.q = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = getNanoTime();
        this.l = getNanoTime();
        this.f1926r = false;
        this.f1924b = null;
        if (i5 == -1) {
            this.m = this.f1923a.p() / 1000.0f;
        }
        this.e = -1;
        this.f1923a.X(-1, this.g);
        SparseArray sparseArray = new SparseArray();
        if (i5 == 0) {
            this.m = this.f1923a.p() / 1000.0f;
        } else if (i5 > 0) {
            this.m = i5 / 1000.0f;
        }
        int childCount = getChildCount();
        this.f1925k.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            this.f1925k.put(childAt, new n8g(childAt));
            sparseArray.put(childAt.getId(), this.f1925k.get(childAt));
        }
        this.s = true;
        this.y0.e(this.mLayoutWidget, null, this.f1923a.l(i2));
        W();
        this.y0.a();
        E();
        int width = getWidth();
        int height = getHeight();
        if (this.Q != null) {
            for (int i8 = 0; i8 < childCount; i8++) {
                n8g n8gVar = this.f1925k.get(getChildAt(i8));
                if (n8gVar != null) {
                    this.f1923a.t(n8gVar);
                }
            }
            Iterator<MotionHelper> it = this.Q.iterator();
            while (it.hasNext()) {
                it.next().D(this, this.f1925k);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                n8g n8gVar2 = this.f1925k.get(getChildAt(i9));
                if (n8gVar2 != null) {
                    n8gVar2.I(width, height, this.m, getNanoTime());
                }
            }
        } else {
            for (int i10 = 0; i10 < childCount; i10++) {
                n8g n8gVar3 = this.f1925k.get(getChildAt(i10));
                if (n8gVar3 != null) {
                    this.f1923a.t(n8gVar3);
                    n8gVar3.I(width, height, this.m, getNanoTime());
                }
            }
        }
        float fE = this.f1923a.E();
        if (fE != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i11 = 0; i11 < childCount; i11++) {
                n8g n8gVar4 = this.f1925k.get(getChildAt(i11));
                float fO = n8gVar4.o() + n8gVar4.n();
                fMin = Math.min(fMin, fO);
                fMax = Math.max(fMax, fO);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                n8g n8gVar5 = this.f1925k.get(getChildAt(i12));
                float fN = n8gVar5.n();
                float fO2 = n8gVar5.o();
                n8gVar5.o = 1.0f / (1.0f - fE);
                n8gVar5.n = fE - ((((fN + fO2) - fMin) * fE) / (fMax - fMin));
            }
        }
        this.n = 0.0f;
        this.o = 0.0f;
        this.s = true;
        invalidate();
    }

    public void i0() {
        this.y0.e(this.mLayoutWidget, this.f1923a.l(this.e), this.f1923a.l(this.g));
        W();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public void j0(int i2, androidx.constraintlayout.widget.a aVar) {
        androidx.constraintlayout.motion.widget.a aVar2 = this.f1923a;
        if (aVar2 != null) {
            aVar2.U(i2, aVar);
        }
        i0();
        if (this.f == i2) {
            aVar.i(this);
        }
    }

    public void k0(int i2, View... viewArr) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar != null) {
            aVar.c0(i2, viewArr);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i2) {
        androidx.constraintlayout.motion.widget.a.b bVar;
        if (i2 == 0) {
            this.f1923a = null;
            return;
        }
        try {
            androidx.constraintlayout.motion.widget.a aVar = new androidx.constraintlayout.motion.widget.a(getContext(), this, i2);
            this.f1923a = aVar;
            if (this.f == -1) {
                this.f = aVar.F();
                this.e = this.f1923a.F();
                this.g = this.f1923a.q();
            }
            if (!isAttachedToWindow()) {
                this.f1923a = null;
                return;
            }
            try {
                Display display = getDisplay();
                this.u0 = display == null ? 0 : display.getRotation();
                androidx.constraintlayout.motion.widget.a aVar2 = this.f1923a;
                if (aVar2 != null) {
                    androidx.constraintlayout.widget.a aVarL = aVar2.l(this.f);
                    this.f1923a.T(this);
                    ArrayList<MotionHelper> arrayList = this.Q;
                    if (arrayList != null) {
                        Iterator<MotionHelper> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().A(this);
                        }
                    }
                    if (aVarL != null) {
                        aVarL.i(this);
                    }
                    this.e = this.f;
                }
                U();
                j jVar = this.l0;
                if (jVar != null) {
                    if (this.w0) {
                        post(new a());
                        return;
                    } else {
                        jVar.a();
                        return;
                    }
                }
                androidx.constraintlayout.motion.widget.a aVar3 = this.f1923a;
                if (aVar3 == null || (bVar = aVar3.c) == null || bVar.x() != 4) {
                    return;
                }
                c0();
                setState(l.SETUP);
                setState(l.MOVING);
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        } catch (Exception e3) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        androidx.constraintlayout.motion.widget.a.b bVar;
        int i2;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.u0 = display.getRotation();
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar != null && (i2 = this.f) != -1) {
            androidx.constraintlayout.widget.a aVarL = aVar.l(i2);
            this.f1923a.T(this);
            ArrayList<MotionHelper> arrayList = this.Q;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().A(this);
                }
            }
            if (aVarL != null) {
                aVarL.i(this);
            }
            this.e = this.f;
        }
        U();
        j jVar = this.l0;
        if (jVar != null) {
            if (this.w0) {
                post(new c());
                return;
            } else {
                jVar.a();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.a aVar2 = this.f1923a;
        if (aVar2 == null || (bVar = aVar2.c) == null || bVar.x() != 4) {
            return;
        }
        c0();
        setState(l.SETUP);
        setState(l.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.b bVarB;
        int iQ;
        RectF rectFP;
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar != null && this.j) {
            androidx.constraintlayout.motion.widget.d dVar = aVar.s;
            if (dVar != null) {
                dVar.h(motionEvent);
            }
            androidx.constraintlayout.motion.widget.a.b bVar = this.f1923a.c;
            if (bVar != null && bVar.C() && (bVarB = bVar.B()) != null && ((motionEvent.getAction() != 0 || (rectFP = bVarB.p(this, new RectF())) == null || rectFP.contains(motionEvent.getX(), motionEvent.getY())) && (iQ = bVarB.q()) != -1)) {
                View view = this.B0;
                if (view == null || view.getId() != iQ) {
                    this.B0 = findViewById(iQ);
                }
                View view2 = this.B0;
                if (view2 != null) {
                    this.A0.set(view2.getLeft(), this.B0.getTop(), this.B0.getRight(), this.B0.getBottom());
                    if (this.A0.contains(motionEvent.getX(), motionEvent.getY()) && !Q(this.B0.getLeft(), this.B0.getTop(), this.B0, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.k0 = true;
        try {
            if (this.f1923a == null) {
                super.onLayout(z, i2, i3, i4, i5);
                return;
            }
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (this.G != i6 || this.H != i7) {
                W();
                G(true);
            }
            this.G = i6;
            this.H = i7;
            this.E = i6;
            this.F = i7;
        } finally {
            this.k0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f1923a == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z = false;
        boolean z2 = (this.h == i2 && this.i == i3) ? false : true;
        if (this.z0) {
            this.z0 = false;
            U();
            V();
            z2 = true;
        }
        if (this.mDirtyHierarchy) {
            z2 = true;
        }
        this.h = i2;
        this.i = i3;
        int iF = this.f1923a.F();
        int iQ = this.f1923a.q();
        if ((z2 || this.y0.f(iF, iQ)) && this.e != -1) {
            super.onMeasure(i2, i3);
            this.y0.e(this.mLayoutWidget, this.f1923a.l(iF), this.f1923a.l(iQ));
            this.y0.h();
            this.y0.i(iF, iQ);
        } else {
            if (z2) {
                super.onMeasure(i2, i3);
            }
            z = true;
        }
        if (this.b0 || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iY = this.mLayoutWidget.Y() + getPaddingLeft() + getPaddingRight();
            int iZ = this.mLayoutWidget.z() + paddingTop;
            int i4 = this.g0;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.c0;
                iY = (int) (i5 + (this.i0 * (this.e0 - i5)));
                requestLayout();
            }
            int i6 = this.h0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.d0;
                iZ = (int) (i7 + (this.i0 * (this.f0 - i7)));
                requestLayout();
            }
            setMeasuredDimension(iY, iZ);
        }
        H();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // defpackage.fjg
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        androidx.constraintlayout.motion.widget.a.b bVar;
        androidx.constraintlayout.motion.widget.b bVarB;
        int iQ;
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar == null || (bVar = aVar.c) == null || !bVar.C()) {
            return;
        }
        int i5 = -1;
        if (!bVar.C() || (bVarB = bVar.B()) == null || (iQ = bVarB.q()) == -1 || view.getId() == iQ) {
            if (aVar.w()) {
                androidx.constraintlayout.motion.widget.b bVarB2 = bVar.B();
                if (bVarB2 != null && (bVarB2.e() & 4) != 0) {
                    i5 = i3;
                }
                float f2 = this.n;
                if ((f2 == 1.0f || f2 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            if (bVar.B() != null && (bVar.B().e() & 1) != 0) {
                float fX = aVar.x(i2, i3);
                float f3 = this.o;
                if ((f3 <= 0.0f && fX < 0.0f) || (f3 >= 1.0f && fX > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new b(this, view));
                    return;
                }
            }
            float f4 = this.n;
            long nanoTime = getNanoTime();
            float f5 = i2;
            this.J = f5;
            float f6 = i3;
            this.K = f6;
            this.M = (float) ((nanoTime - this.L) * 1.0E-9d);
            this.L = nanoTime;
            aVar.P(f5, f6);
            if (f4 != this.n) {
                iArr[0] = i2;
                iArr[1] = i3;
            }
            G(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.I = true;
        }
    }

    @Override // defpackage.fjg
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // defpackage.fjg
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        this.L = getNanoTime();
        this.M = 0.0f;
        this.J = 0.0f;
        this.K = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar != null) {
            aVar.W(isRtl());
        }
    }

    @Override // defpackage.fjg
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        androidx.constraintlayout.motion.widget.a.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        return (aVar == null || (bVar = aVar.c) == null || bVar.B() == null || (this.f1923a.c.B().e() & 2) != 0) ? false : true;
    }

    @Override // defpackage.fjg
    public void onStopNestedScroll(View view, int i2) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar != null) {
            float f2 = this.M;
            if (f2 == 0.0f) {
                return;
            }
            aVar.Q(this.J / f2, this.K / f2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar == null || !this.j || !aVar.b0()) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.constraintlayout.motion.widget.a.b bVar = this.f1923a.c;
        if (bVar != null && !bVar.C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1923a.R(motionEvent, getCurrentState(), this);
        if (this.f1923a.c.D(4)) {
            return this.f1923a.c.B().r();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.R == null) {
                this.R = new CopyOnWriteArrayList<>();
            }
            this.R.add(motionHelper);
            if (motionHelper.z()) {
                if (this.O == null) {
                    this.O = new ArrayList<>();
                }
                this.O.add(motionHelper);
            }
            if (motionHelper.y()) {
                if (this.P == null) {
                    this.P = new ArrayList<>();
                }
                this.P.add(motionHelper);
            }
            if (motionHelper.x()) {
                if (this.Q == null) {
                    this.Q = new ArrayList<>();
                }
                this.Q.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.O;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.P;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i2) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        androidx.constraintlayout.motion.widget.a aVar;
        androidx.constraintlayout.motion.widget.a.b bVar;
        if (!this.b0 && this.f == -1 && (aVar = this.f1923a) != null && (bVar = aVar.c) != null) {
            int iZ = bVar.z();
            if (iZ == 0) {
                return;
            }
            if (iZ == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    this.f1925k.get(getChildAt(i2)).z();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i2) {
        this.x = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.w0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.j = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.f1923a != null) {
            setState(l.MOVING);
            Interpolator interpolatorS = this.f1923a.s();
            if (interpolatorS != null) {
                setProgress(interpolatorS.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<MotionHelper> arrayList = this.P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.P.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<MotionHelper> arrayList = this.O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.O.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        if (f2 >= 0.0f) {
            int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.l0 == null) {
                this.l0 = new j();
            }
            this.l0.e(f2);
            return;
        }
        if (f2 <= 0.0f) {
            if (this.o == 1.0f && this.f == this.g) {
                setState(l.MOVING);
            }
            this.f = this.e;
            if (this.o == 0.0f) {
                setState(l.FINISHED);
            }
        } else if (f2 >= 1.0f) {
            if (this.o == 0.0f && this.f == this.e) {
                setState(l.MOVING);
            }
            this.f = this.g;
            if (this.o == 1.0f) {
                setState(l.FINISHED);
            }
        } else {
            this.f = -1;
            setState(l.MOVING);
        }
        if (this.f1923a == null) {
            return;
        }
        this.f1926r = true;
        this.q = f2;
        this.n = f2;
        this.p = -1L;
        this.l = -1L;
        this.f1924b = null;
        this.s = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        this.f1923a = aVar;
        aVar.W(isRtl());
        W();
    }

    public void setStartState(int i2) {
        if (isAttachedToWindow()) {
            this.f = i2;
            return;
        }
        if (this.l0 == null) {
            this.l0 = new j();
        }
        this.l0.f(i2);
        this.l0.d(i2);
    }

    public void setState(l lVar) {
        l lVar2 = l.FINISHED;
        if (lVar == lVar2 && this.f == -1) {
            return;
        }
        l lVar3 = this.x0;
        this.x0 = lVar;
        l lVar4 = l.MOVING;
        if (lVar3 == lVar4 && lVar == lVar4) {
            I();
        }
        int i2 = d.f1930a[lVar3.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3 && lVar == lVar2) {
                J();
                return;
            }
            return;
        }
        if (lVar == lVar4) {
            I();
        }
        if (lVar == lVar2) {
            J();
        }
    }

    public void setTransition(int i2) {
        float f2;
        if (this.f1923a != null) {
            androidx.constraintlayout.motion.widget.a.b bVarO = O(i2);
            this.e = bVarO.A();
            this.g = bVarO.y();
            if (!isAttachedToWindow()) {
                if (this.l0 == null) {
                    this.l0 = new j();
                }
                this.l0.f(this.e);
                this.l0.d(this.g);
                return;
            }
            int i3 = this.f;
            if (i3 == this.e) {
                f2 = 0.0f;
            } else {
                f2 = i3 == this.g ? 1.0f : Float.NaN;
            }
            this.f1923a.Y(bVarO);
            this.y0.e(this.mLayoutWidget, this.f1923a.l(this.e), this.f1923a.l(this.g));
            W();
            if (this.o != f2) {
                if (f2 == 0.0f) {
                    F(true);
                    this.f1923a.l(this.e).i(this);
                } else if (f2 == 1.0f) {
                    F(false);
                    this.f1923a.l(this.g).i(this);
                }
            }
            this.o = Float.isNaN(f2) ? 0.0f : f2;
            if (!Float.isNaN(f2)) {
                setProgress(f2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(ir5.b());
            sb.append(" transitionToStart ");
            e0();
        }
    }

    public void setTransitionDuration(int i2) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar == null) {
            return;
        }
        aVar.V(i2);
    }

    public void setTransitionListener(k kVar) {
        this.u = kVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.l0 == null) {
            this.l0 = new j();
        }
        this.l0.g(bundle);
        if (isAttachedToWindow()) {
            this.l0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return ir5.c(context, this.e) + LifecycleConstantKt.DATA_DELIMITER + ir5.c(context, this.g) + " (pos:" + this.o + " Dpos/Dt:" + this.d;
    }

    public void y(float f2) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar == null) {
            return;
        }
        float f3 = this.o;
        float f4 = this.n;
        if (f3 != f4 && this.f1926r) {
            this.o = f4;
        }
        float f5 = this.o;
        if (f5 == f2) {
            return;
        }
        this.z = false;
        this.q = f2;
        this.m = aVar.p() / 1000.0f;
        setProgress(this.q);
        this.f1924b = null;
        this.c = this.f1923a.s();
        this.f1926r = false;
        this.l = getNanoTime();
        this.s = true;
        this.n = f5;
        this.o = f5;
        invalidate();
    }

    public boolean z(int i2, n8g n8gVar) {
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar != null) {
            return aVar.g(i2, n8gVar);
        }
        return false;
    }

    @Override // defpackage.gjg
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.I || i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.I = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i2, int i3, int i4) {
        setState(l.SETUP);
        this.f = i2;
        this.e = -1;
        this.g = -1;
        uf4 uf4Var = this.mConstraintLayoutSpec;
        if (uf4Var != null) {
            uf4Var.d(i2, i3, i4);
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f1923a;
        if (aVar != null) {
            aVar.l(i2).i(this);
        }
    }

    public void setTransition(androidx.constraintlayout.motion.widget.a.b bVar) {
        this.f1923a.Y(bVar);
        setState(l.SETUP);
        if (this.f == this.f1923a.q()) {
            this.o = 1.0f;
            this.n = 1.0f;
            this.q = 1.0f;
        } else {
            this.o = 0.0f;
            this.n = 0.0f;
            this.q = 0.0f;
        }
        this.p = bVar.D(1) ? -1L : getNanoTime();
        int iF = this.f1923a.F();
        int iQ = this.f1923a.q();
        if (iF == this.e && iQ == this.g) {
            return;
        }
        this.e = iF;
        this.g = iQ;
        this.f1923a.X(iF, iQ);
        this.y0.e(this.mLayoutWidget, this.f1923a.l(this.e), this.f1923a.l(this.g));
        this.y0.i(this.e, this.g);
        this.y0.h();
        W();
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = null;
        this.d = 0.0f;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.f1925k = new HashMap<>();
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.t = false;
        this.x = 0;
        this.z = false;
        this.A = new yho();
        this.B = new e();
        this.D = true;
        this.I = false;
        this.N = false;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = 0;
        this.T = -1L;
        this.U = 0.0f;
        this.V = 0;
        this.W = 0.0f;
        this.a0 = false;
        this.b0 = false;
        this.j0 = new szd();
        this.k0 = false;
        this.m0 = null;
        this.n0 = null;
        this.o0 = 0;
        this.p0 = false;
        this.q0 = 0;
        this.r0 = new HashMap<>();
        this.v0 = new Rect();
        this.w0 = false;
        this.x0 = l.UNDEFINED;
        this.y0 = new g();
        this.z0 = false;
        this.A0 = new RectF();
        this.B0 = null;
        this.C0 = null;
        this.D0 = new ArrayList<>();
        R(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = null;
        this.d = 0.0f;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.f1925k = new HashMap<>();
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.t = false;
        this.x = 0;
        this.z = false;
        this.A = new yho();
        this.B = new e();
        this.D = true;
        this.I = false;
        this.N = false;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = 0;
        this.T = -1L;
        this.U = 0.0f;
        this.V = 0;
        this.W = 0.0f;
        this.a0 = false;
        this.b0 = false;
        this.j0 = new szd();
        this.k0 = false;
        this.m0 = null;
        this.n0 = null;
        this.o0 = 0;
        this.p0 = false;
        this.q0 = 0;
        this.r0 = new HashMap<>();
        this.v0 = new Rect();
        this.w0 = false;
        this.x0 = l.UNDEFINED;
        this.y0 = new g();
        this.z0 = false;
        this.A0 = new RectF();
        this.B0 = null;
        this.C0 = null;
        this.D0 = new ArrayList<>();
        R(attributeSet);
    }
}
