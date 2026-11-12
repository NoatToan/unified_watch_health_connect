package w6;

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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import i3.e5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class q extends ConstraintLayout implements androidx.core.view.x {

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static boolean f182918k1;
    public final d A;
    public w6.b B;
    public int C;
    public int D;
    public boolean E;
    public float F;
    public ArrayList<o> H0;
    public float I;
    public ArrayList<o> I0;
    public CopyOnWriteArrayList<i> J0;
    public int K0;
    public long L0;
    public float M0;
    public int N0;
    public float O0;
    public long P;
    public boolean P0;
    public int Q0;
    public int R0;
    public int S0;
    public float T;
    public int T0;
    public int U0;
    public int V0;
    public float W0;
    public final o6.d X0;
    public boolean Y0;
    public h Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f182919a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public vg1.d f182920a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f182921b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final Rect f182922b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f182923c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f182924c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f182925d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public j f182926d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f182927e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final f f182928e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f182929f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f182930f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f182931g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final RectF f182932g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f182933h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public View f182934h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f182935i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Matrix f182936i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f182937j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final ArrayList<Integer> f182938j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<View, n> f182939k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f182940k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f182941l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f182942m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f182943n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f182944o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f182945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f182946q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f182947r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f182948t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f182949v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f182950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f182951x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f182952y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final v6.b f182953z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q.this.Z0.a();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f182955a;

        public b(q qVar, View view2) {
            this.f182955a = view2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f182955a.setNestedScrollingEnabled(true);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q.this.Z0.a();
        }
    }

    public class d extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f182957a = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f182958b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f182959c;

        public d() {
        }

        @Override // w6.p
        public final float a() {
            return q.this.f182925d;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f14) {
            float f15 = this.f182957a;
            float f16 = this.f182959c;
            q qVar = q.this;
            if (f15 > 0.0f) {
                if (f15 / f16 < f14) {
                    f14 = f15 / f16;
                }
                qVar.f182925d = f15 - (f16 * f14);
                return ((f15 * f14) - (((f16 * f14) * f14) / 2.0f)) + this.f182958b;
            }
            if ((-f15) / f16 < f14) {
                f14 = (-f15) / f16;
            }
            qVar.f182925d = (f16 * f14) + f15;
            return (((f16 * f14) * f14) / 2.0f) + (f15 * f14) + this.f182958b;
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f182961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f182962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f182963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Path f182964d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Paint f182965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Paint f182966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Paint f182967g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Paint f182968h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Paint f182969i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float[] f182970j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f182971k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Rect f182972l = new Rect();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f182973m = 1;

        public e() {
            Paint paint = new Paint();
            this.f182965e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            this.f182966f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f182967g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            this.f182968h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(q.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f182970j = new float[8];
            Paint paint5 = new Paint();
            this.f182969i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f182963c = new float[100];
            this.f182962b = new int[50];
        }

        public final void a(Canvas canvas, int i14, int i15, n nVar) {
            Canvas canvas2;
            int width;
            int height;
            float f14;
            boolean z14;
            Paint paint = this.f182967g;
            int[] iArr = this.f182962b;
            boolean z15 = false;
            int i16 = 4;
            if (i14 == 4) {
                int i17 = 0;
                boolean z16 = false;
                boolean z17 = false;
                while (i17 < this.f182971k) {
                    int i18 = iArr[i17];
                    if (i18 == 1) {
                        z14 = z16;
                        z14 = true;
                    }
                    if (i18 == 0) {
                        z17 = true;
                    }
                    i17++;
                    z16 = z14;
                    z17 = z17;
                }
                if (z16) {
                    float[] fArr = this.f182961a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
                }
                if (z17) {
                    b(canvas);
                }
            }
            if (i14 == 2) {
                float[] fArr2 = this.f182961a;
                float f15 = fArr2[0];
                float f16 = fArr2[1];
                float f17 = fArr2[fArr2.length - 2];
                float f18 = fArr2[fArr2.length - 1];
                canvas2 = canvas;
                canvas2.drawLine(f15, f16, f17, f18, paint);
            } else {
                canvas2 = canvas;
            }
            if (i14 == 3) {
                b(canvas);
            }
            canvas2.drawLines(this.f182961a, this.f182965e);
            View view2 = nVar.f182889b;
            if (view2 != null) {
                width = view2.getWidth();
                height = nVar.f182889b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i19 = 1;
            while (i19 < i15 - 1) {
                if (i14 != i16 || iArr[i19 - 1] != 0) {
                    int i24 = i19 * 2;
                    float[] fArr3 = this.f182963c;
                    float f19 = fArr3[i24];
                    float f22 = fArr3[i24 + 1];
                    this.f182964d.reset();
                    this.f182964d.moveTo(f19, f22 + 10.0f);
                    this.f182964d.lineTo(f19 + 10.0f, f22);
                    this.f182964d.lineTo(f19, f22 - 10.0f);
                    this.f182964d.lineTo(f19 - 10.0f, f22);
                    this.f182964d.close();
                    int i25 = i19 - 1;
                    nVar.f182908u.get(i25);
                    Paint paint2 = this.f182969i;
                    if (i14 == i16) {
                        int i26 = iArr[i25];
                        if (i26 == 1) {
                            d(canvas2, f19 - 0.0f, f22 - 0.0f);
                        } else if (i26 == 0) {
                            c(canvas2, f19 - 0.0f, f22 - 0.0f);
                        } else {
                            if (i26 == 2) {
                                f14 = f22;
                                e(canvas2, f19 - 0.0f, f14 - 0.0f, width, height);
                            }
                            canvas2.drawPath(this.f182964d, paint2);
                        }
                        f14 = f22;
                        canvas2.drawPath(this.f182964d, paint2);
                    } else {
                        f14 = f22;
                    }
                    if (i14 == 2) {
                        d(canvas2, f19 - 0.0f, f14 - 0.0f);
                    }
                    if (i14 == 3) {
                        c(canvas2, f19 - 0.0f, f14 - 0.0f);
                    }
                    if (i14 == 6) {
                        e(canvas2, f19 - 0.0f, f14 - 0.0f, width, height);
                    }
                    canvas2.drawPath(this.f182964d, paint2);
                }
                i19++;
                z15 = z15;
                i16 = 4;
            }
            boolean z18 = z15;
            float[] fArr4 = this.f182961a;
            if (fArr4.length > 1) {
                float f24 = fArr4[z18 ? 1 : 0];
                float f25 = fArr4[1];
                Paint paint3 = this.f182966f;
                canvas2.drawCircle(f24, f25, 8.0f, paint3);
                float[] fArr5 = this.f182961a;
                canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.f182961a;
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[fArr.length - 2];
            float f17 = fArr[fArr.length - 1];
            float fMin = Math.min(f14, f16);
            float fMax = Math.max(f15, f17);
            float fMax2 = Math.max(f14, f16);
            float fMax3 = Math.max(f15, f17);
            Paint paint = this.f182967g;
            canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
            canvas.drawLine(Math.min(f14, f16), Math.min(f15, f17), Math.min(f14, f16), Math.max(f15, f17), paint);
        }

        public final void c(Canvas canvas, float f14, float f15) {
            float[] fArr = this.f182961a;
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr[fArr.length - 2];
            float f19 = fArr[fArr.length - 1];
            float fMin = Math.min(f16, f18);
            float fMax = Math.max(f17, f19);
            float fMin2 = f14 - Math.min(f16, f18);
            float fMax2 = Math.max(f17, f19) - f15;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f18 - f16))) + 0.5d)) / 100.0f);
            int length = str.length();
            Paint paint = this.f182968h;
            Rect rect = this.f182972l;
            paint.getTextBounds(str, 0, length, rect);
            canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f15 - 20.0f, paint);
            float fMin3 = Math.min(f16, f18);
            Paint paint2 = this.f182967g;
            canvas.drawLine(f14, f15, fMin3, f15, paint2);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f19 - f17))) + 0.5d)) / 100.0f);
            paint.getTextBounds(str2, 0, str2.length(), rect);
            canvas.drawText(str2, f14 + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f14, f15, f14, Math.max(f17, f19), paint2);
        }

        public final void d(Canvas canvas, float f14, float f15) {
            float[] fArr = this.f182961a;
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr[fArr.length - 2];
            float f19 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f16 - f18, f17 - f19);
            float f22 = f18 - f16;
            float f24 = f19 - f17;
            float f25 = (((f15 - f17) * f24) + ((f14 - f16) * f22)) / (fHypot * fHypot);
            float f26 = (f22 * f25) + f16;
            float f27 = (f25 * f24) + f17;
            Path path = new Path();
            path.moveTo(f14, f15);
            path.lineTo(f26, f27);
            float fHypot2 = (float) Math.hypot(f26 - f14, f27 - f15);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            int length = str.length();
            Paint paint = this.f182968h;
            Rect rect = this.f182972l;
            paint.getTextBounds(str, 0, length, rect);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
            canvas.drawLine(f14, f15, f26, f27, this.f182967g);
        }

        public final void e(Canvas canvas, float f14, float f15, int i14, int i15) {
            StringBuilder sb3 = new StringBuilder("");
            q qVar = q.this;
            sb3.append(((int) (((double) (((f14 - (i14 / 2)) * 100.0f) / (qVar.getWidth() - i14))) + 0.5d)) / 100.0f);
            String string = sb3.toString();
            int length = string.length();
            Paint paint = this.f182968h;
            Rect rect = this.f182972l;
            paint.getTextBounds(string, 0, length, rect);
            canvas.drawText(string, ((f14 / 2.0f) - (rect.width() / 2)) + 0.0f, f15 - 20.0f, paint);
            float fMin = Math.min(0.0f, 1.0f);
            Paint paint2 = this.f182967g;
            canvas.drawLine(f14, f15, fMin, f15, paint2);
            String str = "" + (((int) (((double) (((f15 - (i15 / 2)) * 100.0f) / (qVar.getHeight() - i15))) + 0.5d)) / 100.0f);
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, f14 + 5.0f, 0.0f - ((f15 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f14, f15, f14, Math.max(0.0f, 1.0f), paint2);
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t6.f f182975a = new t6.f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t6.f f182976b = new t6.f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.constraintlayout.widget.d f182977c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.d f182978d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f182979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f182980f;

        public f() {
        }

        public static void c(t6.f fVar, t6.f fVar2) {
            t6.e iVar;
            ArrayList<t6.e> arrayList = fVar.f162695w0;
            HashMap<t6.e, t6.e> map = new HashMap<>();
            map.put(fVar, fVar2);
            fVar2.f162695w0.clear();
            fVar2.h(fVar, map);
            for (t6.e eVar : arrayList) {
                if (eVar instanceof t6.a) {
                    iVar = new t6.a();
                } else if (eVar instanceof t6.h) {
                    iVar = new t6.h();
                } else if (eVar instanceof t6.g) {
                    iVar = new t6.g();
                } else if (eVar instanceof t6.k) {
                    iVar = new t6.k();
                } else {
                    iVar = eVar instanceof t6.i ? new t6.i() : new t6.e();
                }
                fVar2.W(iVar);
                map.put(eVar, iVar);
            }
            for (t6.e eVar2 : arrayList) {
                map.get(eVar2).h(eVar2, map);
            }
        }

        public static t6.e d(t6.f fVar, View view2) {
            if (fVar.f162621j0 == view2) {
                return fVar;
            }
            ArrayList<t6.e> arrayList = fVar.f162695w0;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                t6.e eVar = arrayList.get(i14);
                if (eVar.f162621j0 == view2) {
                    return eVar;
                }
            }
            return null;
        }

        public final void a() {
            HashMap<View, n> map;
            int[] iArr;
            int i14;
            Interpolator interpolatorLoadInterpolator;
            q qVar = q.this;
            int childCount = qVar.getChildCount();
            HashMap<View, n> map2 = qVar.f182939k;
            map2.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = qVar.getChildAt(i15);
                n nVar = new n(childAt);
                int id3 = childAt.getId();
                iArr2[i15] = id3;
                sparseArray.put(id3, nVar);
                map2.put(childAt, nVar);
            }
            int i16 = 0;
            while (i16 < childCount) {
                View childAt2 = qVar.getChildAt(i16);
                n nVar2 = map2.get(childAt2);
                if (nVar2 == null) {
                    map = map2;
                    iArr = iArr2;
                    i14 = i16;
                } else {
                    Rect rect = nVar2.f182888a;
                    l lVar = nVar2.f182895h;
                    r rVar = nVar2.f182893f;
                    if (this.f182977c != null) {
                        t6.e eVarD = d(this.f182975a, childAt2);
                        if (eVarD != null) {
                            Rect rectI = q.i(qVar, eVarD);
                            androidx.constraintlayout.widget.d dVar = this.f182977c;
                            int width = qVar.getWidth();
                            int height = qVar.getHeight();
                            map = map2;
                            int i17 = dVar.f6195d;
                            if (i17 != 0) {
                                n.e(rectI, rect, i17, width, height);
                            }
                            rVar.f182997c = 0.0f;
                            rVar.f182998d = 0.0f;
                            nVar2.d(rVar);
                            iArr = iArr2;
                            i14 = i16;
                            rVar.d(rectI.left, rectI.top, rectI.width(), rectI.height());
                            androidx.constraintlayout.widget.d.a aVarK = dVar.k(nVar2.f182890c);
                            rVar.a(aVarK);
                            androidx.constraintlayout.widget.d.c cVar = aVarK.f6202d;
                            nVar2.f182899l = cVar.f6269g;
                            lVar.d(rectI, dVar, i17, nVar2.f182890c);
                            nVar2.C = aVarK.f6204f.f6290i;
                            nVar2.E = cVar.f6272j;
                            nVar2.F = cVar.f6271i;
                            Context context = nVar2.f182889b.getContext();
                            int i18 = cVar.f6274l;
                            String str = cVar.f6273k;
                            int i19 = cVar.f6275m;
                            if (i18 == -2) {
                                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i19);
                            } else if (i18 == -1) {
                                interpolatorLoadInterpolator = new m(o6.c.c(str));
                            } else if (i18 == 0) {
                                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                            } else if (i18 == 1) {
                                interpolatorLoadInterpolator = new AccelerateInterpolator();
                            } else if (i18 == 2) {
                                interpolatorLoadInterpolator = new DecelerateInterpolator();
                            } else if (i18 != 4) {
                                interpolatorLoadInterpolator = i18 != 5 ? null : new OvershootInterpolator();
                            } else {
                                interpolatorLoadInterpolator = new BounceInterpolator();
                            }
                            nVar2.G = interpolatorLoadInterpolator;
                        } else {
                            map = map2;
                            iArr = iArr2;
                            i14 = i16;
                            if (qVar.f182950w != 0) {
                                w6.a.a();
                                w6.a.c(childAt2);
                                childAt2.getClass();
                            }
                        }
                    } else {
                        map = map2;
                        iArr = iArr2;
                        i14 = i16;
                    }
                    if (this.f182978d != null) {
                        t6.e eVarD2 = d(this.f182976b, childAt2);
                        if (eVarD2 != null) {
                            Rect rectI2 = q.i(qVar, eVarD2);
                            androidx.constraintlayout.widget.d dVar2 = this.f182978d;
                            int width2 = qVar.getWidth();
                            int height2 = qVar.getHeight();
                            r rVar2 = nVar2.f182894g;
                            int i24 = dVar2.f6195d;
                            if (i24 != 0) {
                                n.e(rectI2, rect, i24, width2, height2);
                            } else {
                                rect = rectI2;
                            }
                            rVar2.f182997c = 1.0f;
                            rVar2.f182998d = 1.0f;
                            nVar2.d(rVar2);
                            rVar2.d(rect.left, rect.top, rect.width(), rect.height());
                            rVar2.a(dVar2.k(nVar2.f182890c));
                            nVar2.f182896i.d(rect, dVar2, i24, nVar2.f182890c);
                        } else if (qVar.f182950w != 0) {
                            w6.a.a();
                            w6.a.c(childAt2);
                            childAt2.getClass();
                        }
                    }
                }
                i16 = i14 + 1;
                map2 = map;
                iArr2 = iArr;
            }
            int[] iArr3 = iArr2;
            for (int i25 = 0; i25 < childCount; i25++) {
                n nVar3 = (n) sparseArray.get(iArr3[i25]);
                int i26 = nVar3.f182893f.f183005k;
                if (i26 != -1) {
                    n nVar4 = (n) sparseArray.get(i26);
                    nVar3.f182893f.f(nVar4, nVar4.f182893f);
                    nVar3.f182894g.f(nVar4, nVar4.f182894g);
                }
            }
        }

        public final void b(int i14, int i15) {
            q qVar = q.this;
            int optimizationLevel = qVar.getOptimizationLevel();
            if (qVar.f182929f == qVar.getStartState()) {
                t6.f fVar = this.f182976b;
                androidx.constraintlayout.widget.d dVar = this.f182978d;
                qVar.resolveSystem(fVar, optimizationLevel, (dVar == null || dVar.f6195d == 0) ? i14 : i15, (dVar == null || dVar.f6195d == 0) ? i15 : i14);
                androidx.constraintlayout.widget.d dVar2 = this.f182977c;
                if (dVar2 != null) {
                    t6.f fVar2 = this.f182975a;
                    int i16 = dVar2.f6195d;
                    int i17 = i16 == 0 ? i14 : i15;
                    if (i16 == 0) {
                        i14 = i15;
                    }
                    qVar.resolveSystem(fVar2, optimizationLevel, i17, i14);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.d dVar3 = this.f182977c;
            if (dVar3 != null) {
                t6.f fVar3 = this.f182975a;
                int i18 = dVar3.f6195d;
                qVar.resolveSystem(fVar3, optimizationLevel, i18 == 0 ? i14 : i15, i18 == 0 ? i15 : i14);
            }
            t6.f fVar4 = this.f182976b;
            androidx.constraintlayout.widget.d dVar4 = this.f182978d;
            int i19 = (dVar4 == null || dVar4.f6195d == 0) ? i14 : i15;
            if (dVar4 == null || dVar4.f6195d == 0) {
                i14 = i15;
            }
            qVar.resolveSystem(fVar4, optimizationLevel, i19, i14);
        }

        public final void e(androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
            this.f182977c = dVar;
            this.f182978d = dVar2;
            this.f182975a = new t6.f();
            this.f182976b = new t6.f();
            t6.f fVar = this.f182975a;
            q qVar = q.this;
            u6.b.InterfaceC3163b interfaceC3163b = ((ConstraintLayout) qVar).mLayoutWidget.A0;
            fVar.A0 = interfaceC3163b;
            fVar.f162657y0.f168800f = interfaceC3163b;
            t6.f fVar2 = this.f182976b;
            u6.b.InterfaceC3163b interfaceC3163b2 = ((ConstraintLayout) qVar).mLayoutWidget.A0;
            fVar2.A0 = interfaceC3163b2;
            fVar2.f162657y0.f168800f = interfaceC3163b2;
            this.f182975a.f162695w0.clear();
            this.f182976b.f162695w0.clear();
            c(((ConstraintLayout) qVar).mLayoutWidget, this.f182975a);
            c(((ConstraintLayout) qVar).mLayoutWidget, this.f182976b);
            if (qVar.f182944o > 0.5d) {
                if (dVar != null) {
                    g(this.f182975a, dVar);
                }
                g(this.f182976b, dVar2);
            } else {
                g(this.f182976b, dVar2);
                if (dVar != null) {
                    g(this.f182975a, dVar);
                }
            }
            this.f182975a.B0 = qVar.isRtl();
            t6.f fVar3 = this.f182975a;
            fVar3.f162656x0.c(fVar3);
            this.f182976b.B0 = qVar.isRtl();
            t6.f fVar4 = this.f182976b;
            fVar4.f162656x0.c(fVar4);
            ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    t6.f fVar5 = this.f182975a;
                    t6.e.b bVar = t6.e.b.WRAP_CONTENT;
                    fVar5.P(bVar);
                    this.f182976b.P(bVar);
                }
                if (layoutParams.height == -2) {
                    t6.f fVar6 = this.f182975a;
                    t6.e.b bVar2 = t6.e.b.WRAP_CONTENT;
                    fVar6.R(bVar2);
                    this.f182976b.R(bVar2);
                }
            }
        }

        public final void f() {
            q qVar = q.this;
            int i14 = qVar.f182933h;
            int i15 = qVar.f182935i;
            int mode = View.MeasureSpec.getMode(i14);
            int mode2 = View.MeasureSpec.getMode(i15);
            qVar.U0 = mode;
            qVar.V0 = mode2;
            b(i14, i15);
            int i16 = 0;
            if (!(qVar.getParent() instanceof q) || mode != 1073741824 || mode2 != 1073741824) {
                b(i14, i15);
                qVar.Q0 = this.f182975a.s();
                qVar.R0 = this.f182975a.m();
                qVar.S0 = this.f182976b.s();
                int iM = this.f182976b.m();
                qVar.T0 = iM;
                qVar.P0 = (qVar.Q0 == qVar.S0 && qVar.R0 == iM) ? false : true;
            }
            int i17 = qVar.Q0;
            int i18 = qVar.R0;
            int i19 = qVar.U0;
            if (i19 == Integer.MIN_VALUE || i19 == 0) {
                i17 = (int) ((qVar.W0 * (qVar.S0 - i17)) + i17);
            }
            int i24 = qVar.V0;
            if (i24 == Integer.MIN_VALUE || i24 == 0) {
                i18 = (int) ((qVar.W0 * (qVar.T0 - i18)) + i18);
            }
            t6.f fVar = this.f182975a;
            qVar.resolveMeasuredDimension(i14, i15, i17, i18, fVar.L0 || this.f182976b.L0, fVar.M0 || this.f182976b.M0);
            HashMap<View, n> map = qVar.f182939k;
            int childCount = qVar.getChildCount();
            qVar.f182928e1.a();
            qVar.f182948t = true;
            SparseArray sparseArray = new SparseArray();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt = qVar.getChildAt(i25);
                sparseArray.put(childAt.getId(), map.get(childAt));
            }
            int width = qVar.getWidth();
            int height = qVar.getHeight();
            s.b bVar = qVar.f182919a.f183014c;
            int i26 = bVar != null ? bVar.f183047p : -1;
            if (i26 != -1) {
                for (int i27 = 0; i27 < childCount; i27++) {
                    n nVar = map.get(qVar.getChildAt(i27));
                    if (nVar != null) {
                        nVar.B = i26;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[map.size()];
            int i28 = 0;
            for (int i29 = 0; i29 < childCount; i29++) {
                n nVar2 = map.get(qVar.getChildAt(i29));
                int i30 = nVar2.f182893f.f183005k;
                if (i30 != -1) {
                    sparseBooleanArray.put(i30, true);
                    iArr[i28] = nVar2.f182893f.f183005k;
                    i28++;
                }
            }
            for (int i34 = 0; i34 < i28; i34++) {
                n nVar3 = map.get(qVar.findViewById(iArr[i34]));
                if (nVar3 != null) {
                    qVar.f182919a.e(nVar3);
                    nVar3.f(width, height, qVar.getNanoTime());
                }
            }
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt2 = qVar.getChildAt(i35);
                n nVar4 = map.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && nVar4 != null) {
                    qVar.f182919a.e(nVar4);
                    nVar4.f(width, height, qVar.getNanoTime());
                }
            }
            s.b bVar2 = qVar.f182919a.f183014c;
            float f14 = bVar2 != null ? bVar2.f183040i : 0.0f;
            if (f14 != 0.0f) {
                boolean z14 = ((double) f14) < 0.0d;
                float fAbs = Math.abs(f14);
                float fMax = -3.4028235E38f;
                float fMin = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                for (int i36 = 0; i36 < childCount; i36++) {
                    n nVar5 = map.get(qVar.getChildAt(i36));
                    if (!Float.isNaN(nVar5.f182899l)) {
                        for (int i37 = 0; i37 < childCount; i37++) {
                            n nVar6 = map.get(qVar.getChildAt(i37));
                            if (!Float.isNaN(nVar6.f182899l)) {
                                fMin = Math.min(fMin, nVar6.f182899l);
                                fMax = Math.max(fMax, nVar6.f182899l);
                            }
                        }
                        while (i16 < childCount) {
                            n nVar7 = map.get(qVar.getChildAt(i16));
                            if (!Float.isNaN(nVar7.f182899l)) {
                                nVar7.f182901n = 1.0f / (1.0f - fAbs);
                                float f15 = nVar7.f182899l;
                                if (z14) {
                                    nVar7.f182900m = fAbs - (((fMax - f15) / (fMax - fMin)) * fAbs);
                                } else {
                                    nVar7.f182900m = fAbs - (((f15 - fMin) * fAbs) / (fMax - fMin));
                                }
                            }
                            i16++;
                        }
                        return;
                    }
                    r rVar = nVar5.f182894g;
                    float f16 = rVar.f182999e;
                    float f17 = rVar.f183000f;
                    float f18 = z14 ? f17 - f16 : f17 + f16;
                    fMin2 = Math.min(fMin2, f18);
                    fMax2 = Math.max(fMax2, f18);
                }
                while (i16 < childCount) {
                    n nVar8 = map.get(qVar.getChildAt(i16));
                    r rVar2 = nVar8.f182894g;
                    float f19 = rVar2.f182999e;
                    float f22 = rVar2.f183000f;
                    float f24 = z14 ? f22 - f19 : f22 + f19;
                    nVar8.f182901n = 1.0f / (1.0f - fAbs);
                    nVar8.f182900m = fAbs - (((f24 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i16++;
                }
            }
        }

        public final void g(t6.f fVar, androidx.constraintlayout.widget.d dVar) {
            androidx.constraintlayout.widget.d.a aVar;
            androidx.constraintlayout.widget.d.a aVar2;
            SparseArray<t6.e> sparseArray = new SparseArray<>();
            androidx.constraintlayout.widget.e.a aVar3 = new androidx.constraintlayout.widget.e.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, fVar);
            q qVar = q.this;
            sparseArray.put(qVar.getId(), fVar);
            if (dVar != null && dVar.f6195d != 0) {
                t6.f fVar2 = this.f182976b;
                int optimizationLevel = qVar.getOptimizationLevel();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(qVar.getHeight(), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(qVar.getWidth(), 1073741824);
                boolean z14 = q.f182918k1;
                qVar.resolveSystem(fVar2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            for (t6.e eVar : fVar.f162695w0) {
                eVar.f162625l0 = true;
                sparseArray.put(((View) eVar.f162621j0).getId(), eVar);
            }
            for (t6.e eVar2 : fVar.f162695w0) {
                View view2 = (View) eVar2.f162621j0;
                int id3 = view2.getId();
                HashMap<Integer, androidx.constraintlayout.widget.d.a> map = dVar.f6198g;
                if (map.containsKey(Integer.valueOf(id3)) && (aVar2 = map.get(Integer.valueOf(id3))) != null) {
                    aVar2.a(aVar3);
                }
                eVar2.T(dVar.k(view2.getId()).f6203e.f6224c);
                eVar2.O(dVar.k(view2.getId()).f6203e.f6226d);
                if (view2 instanceof androidx.constraintlayout.widget.b) {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) view2;
                    int id4 = bVar.getId();
                    HashMap<Integer, androidx.constraintlayout.widget.d.a> map2 = dVar.f6198g;
                    if (map2.containsKey(Integer.valueOf(id4)) && (aVar = map2.get(Integer.valueOf(id4))) != null && (eVar2 instanceof t6.i)) {
                        bVar.j(aVar, (t6.i) eVar2, aVar3, sparseArray);
                    }
                    if (view2 instanceof Barrier) {
                        ((Barrier) view2).m();
                    }
                }
                aVar3.resolveLayoutDirection(qVar.getLayoutDirection());
                boolean z15 = q.f182918k1;
                q.this.applyConstraintsFromLayoutParams(false, view2, eVar2, aVar3, sparseArray);
                if (dVar.k(view2.getId()).f6201c.f6278c == 1) {
                    eVar2.f162623k0 = view2.getVisibility();
                } else {
                    eVar2.f162623k0 = dVar.k(view2.getId()).f6201c.f6277b;
                }
            }
            for (t6.e eVar3 : fVar.f162695w0) {
                if (eVar3 instanceof t6.l) {
                    androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) eVar3.f162621j0;
                    t6.i iVar = (t6.i) eVar3;
                    bVar2.getClass();
                    iVar.Y();
                    for (int i14 = 0; i14 < bVar2.f6167b; i14++) {
                        iVar.W(sparseArray.get(bVar2.f6166a[i14]));
                    }
                    t6.l lVar = (t6.l) iVar;
                    for (int i15 = 0; i15 < lVar.f162691x0; i15++) {
                        t6.e eVar4 = lVar.f162690w0[i15];
                        if (eVar4 != null) {
                            eVar4.I = true;
                        }
                    }
                }
            }
        }
    }

    public static class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f182982b = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public VelocityTracker f182983a;

        private g() {
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f182984a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f182985b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f182986c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f182987d = -1;

        public h() {
        }

        public final void a() {
            int i14 = this.f182986c;
            q qVar = q.this;
            if (i14 != -1 || this.f182987d != -1) {
                if (i14 == -1) {
                    qVar.B(this.f182987d);
                } else {
                    int i15 = this.f182987d;
                    if (i15 == -1) {
                        qVar.setState(i14, -1, -1);
                    } else {
                        qVar.y(i14, i15);
                    }
                }
                qVar.setState(j.SETUP);
            }
            if (Float.isNaN(this.f182985b)) {
                if (Float.isNaN(this.f182984a)) {
                    return;
                }
                qVar.setProgress(this.f182984a);
                return;
            }
            float f14 = this.f182984a;
            float f15 = this.f182985b;
            if (qVar.isAttachedToWindow()) {
                qVar.setProgress(f14);
                qVar.setState(j.MOVING);
                qVar.f182925d = f15;
                if (f15 != 0.0f) {
                    qVar.n(f15 > 0.0f ? 1.0f : 0.0f);
                } else if (f14 != 0.0f && f14 != 1.0f) {
                    qVar.n(f14 > 0.5f ? 1.0f : 0.0f);
                }
            } else {
                if (qVar.Z0 == null) {
                    qVar.Z0 = qVar.new h();
                }
                h hVar = qVar.Z0;
                hVar.f182984a = f14;
                hVar.f182985b = f15;
            }
            this.f182984a = Float.NaN;
            this.f182985b = Float.NaN;
            this.f182986c = -1;
            this.f182987d = -1;
        }
    }

    public interface i {
    }

    public enum j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public q(Context context) {
        super(context);
        this.f182923c = null;
        this.f182925d = 0.0f;
        this.f182927e = -1;
        this.f182929f = -1;
        this.f182931g = -1;
        this.f182933h = 0;
        this.f182935i = 0;
        this.f182937j = true;
        this.f182939k = new HashMap<>();
        this.f182941l = 0L;
        this.f182942m = 1.0f;
        this.f182943n = 0.0f;
        this.f182944o = 0.0f;
        this.f182946q = 0.0f;
        this.f182948t = false;
        this.f182950w = 0;
        this.f182952y = false;
        this.f182953z = new v6.b();
        this.A = new d();
        this.E = false;
        this.f182940k0 = false;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = 0;
        this.L0 = -1L;
        this.M0 = 0.0f;
        this.N0 = 0;
        this.O0 = 0.0f;
        this.P0 = false;
        this.X0 = new o6.d();
        this.Y0 = false;
        this.f182920a1 = null;
        new HashMap();
        this.f182922b1 = new Rect();
        this.f182924c1 = false;
        this.f182926d1 = j.UNDEFINED;
        this.f182928e1 = new f();
        this.f182930f1 = false;
        this.f182932g1 = new RectF();
        this.f182934h1 = null;
        this.f182936i1 = null;
        this.f182938j1 = new ArrayList<>();
        u(null);
    }

    public static Rect i(q qVar, t6.e eVar) {
        Rect rect = qVar.f182922b1;
        rect.top = eVar.u();
        rect.left = eVar.t();
        rect.right = eVar.s() + rect.left;
        rect.bottom = eVar.m() + rect.top;
        return rect;
    }

    public final void A() {
        n(1.0f);
        this.f182920a1 = null;
    }

    public final void B(int i14) {
        androidx.constraintlayout.widget.k kVar;
        if (!isAttachedToWindow()) {
            if (this.Z0 == null) {
                this.Z0 = new h();
            }
            this.Z0.f182987d = i14;
            return;
        }
        s sVar = this.f182919a;
        if (sVar != null && (kVar = sVar.f183013b) != null) {
            int i15 = this.f182929f;
            float f14 = -1;
            androidx.constraintlayout.widget.k.a aVar = kVar.f6337b.get(i14);
            if (aVar != null) {
                ArrayList<androidx.constraintlayout.widget.k.b> arrayList = aVar.f6339b;
                int i16 = aVar.f6340c;
                if (f14 != -1.0f && f14 != -1.0f) {
                    Iterator<androidx.constraintlayout.widget.k.b> it = arrayList.iterator();
                    androidx.constraintlayout.widget.k.b bVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (bVar != null) {
                                i15 = bVar.f6345e;
                                break;
                            } else {
                                i15 = i16;
                                break;
                            }
                        }
                        androidx.constraintlayout.widget.k.b next = it.next();
                        if (next.a(f14, f14)) {
                            if (i15 == next.f6345e) {
                                break;
                            } else {
                                bVar = next;
                            }
                        }
                    }
                } else if (i16 != i15) {
                    Iterator<androidx.constraintlayout.widget.k.b> it3 = arrayList.iterator();
                    do {
                        if (!it3.hasNext()) {
                            i15 = i16;
                            break;
                        }
                    } while (i15 != it3.next().f6345e);
                }
            } else {
                i15 = i14;
            }
            if (i15 != -1) {
                i14 = i15;
            }
        }
        int i17 = this.f182929f;
        if (i17 == i14) {
            return;
        }
        if (this.f182927e == i14) {
            n(0.0f);
            return;
        }
        if (this.f182931g == i14) {
            n(1.0f);
            return;
        }
        this.f182931g = i14;
        if (i17 != -1) {
            y(i17, i14);
            n(1.0f);
            this.f182944o = 0.0f;
            A();
            return;
        }
        this.f182952y = false;
        this.f182946q = 1.0f;
        this.f182943n = 0.0f;
        this.f182944o = 0.0f;
        this.f182945p = getNanoTime();
        this.f182941l = getNanoTime();
        this.f182947r = false;
        this.f182921b = null;
        s sVar2 = this.f182919a;
        s.b bVar2 = sVar2.f183014c;
        this.f182942m = (bVar2 != null ? bVar2.f183039h : sVar2.f183021j) / 1000.0f;
        this.f182927e = -1;
        sVar2.n(-1, this.f182931g);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap<View, n> map = this.f182939k;
        map.clear();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            map.put(childAt, new n(childAt));
            sparseArray.put(childAt.getId(), map.get(childAt));
        }
        this.f182948t = true;
        androidx.constraintlayout.widget.d dVarB = this.f182919a.b(i14);
        f fVar = this.f182928e1;
        fVar.e(null, dVarB);
        x();
        fVar.a();
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            View childAt2 = getChildAt(i19);
            n nVar = map.get(childAt2);
            if (nVar != null) {
                r rVar = nVar.f182893f;
                rVar.f182997c = 0.0f;
                rVar.f182998d = 0.0f;
                rVar.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                l lVar = nVar.f182895h;
                lVar.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                lVar.b(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i24 = 0; i24 < childCount; i24++) {
            n nVar2 = map.get(getChildAt(i24));
            if (nVar2 != null) {
                this.f182919a.e(nVar2);
                nVar2.f(width, height, getNanoTime());
            }
        }
        s.b bVar3 = this.f182919a.f183014c;
        float f15 = bVar3 != null ? bVar3.f183040i : 0.0f;
        if (f15 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i25 = 0; i25 < childCount; i25++) {
                r rVar2 = map.get(getChildAt(i25)).f182894g;
                float f16 = rVar2.f183000f + rVar2.f182999e;
                fMin = Math.min(fMin, f16);
                fMax = Math.max(fMax, f16);
            }
            for (int i26 = 0; i26 < childCount; i26++) {
                n nVar3 = map.get(getChildAt(i26));
                r rVar3 = nVar3.f182894g;
                float f17 = rVar3.f182999e;
                float f18 = rVar3.f183000f;
                nVar3.f182901n = 1.0f / (1.0f - f15);
                nVar3.f182900m = f15 - ((((f17 + f18) - fMin) * f15) / (fMax - fMin));
            }
        }
        this.f182943n = 0.0f;
        this.f182944o = 0.0f;
        this.f182948t = true;
        invalidate();
    }

    public final void C(int i14, androidx.constraintlayout.widget.d dVar) {
        s sVar = this.f182919a;
        if (sVar != null) {
            sVar.f183018g.put(i14, dVar);
        }
        this.f182928e1.e(this.f182919a.b(this.f182927e), this.f182919a.b(this.f182931g));
        x();
        if (this.f182929f == i14) {
            dVar.b(this);
        }
    }

    public final void D(int i14, View... viewArr) {
        s sVar = this.f182919a;
        if (sVar != null) {
            z zVar = sVar.f183028q;
            zVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (y yVar : zVar.f183115b) {
                if (yVar.f183080a == i14) {
                    for (View view2 : viewArr) {
                        if (yVar.b(view2)) {
                            arrayList.add(view2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        q qVar = zVar.f183114a;
                        int currentState = qVar.getCurrentState();
                        if (yVar.f183084e == 2) {
                            yVar.a(zVar, zVar.f183114a, currentState, null, viewArr2);
                        } else if (currentState == -1) {
                            qVar.toString();
                        } else {
                            s sVar2 = qVar.f182919a;
                            androidx.constraintlayout.widget.d dVarB = sVar2 == null ? null : sVar2.b(currentState);
                            if (dVarB != null) {
                                yVar.a(zVar, zVar.f183114a, currentState, dVarB, viewArr2);
                            }
                        }
                        arrayList.clear();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0314 A[PHI: r13
      0x0314: PHI (r13v16 float) = (r13v15 float), (r13v20 float) binds: [B:120:0x02f0, B:125:0x02fd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList<r> arrayList;
        int i14;
        int i15;
        int i16;
        Paint paint;
        Paint paint2;
        int i17;
        int i18;
        n nVar;
        int i19;
        Paint paint3;
        double dA;
        Paint paint4;
        z zVar;
        p(false);
        s sVar = this.f182919a;
        if (sVar != null && (zVar = sVar.f183028q) != null) {
            ArrayList<y.a> arrayList2 = zVar.f183118e;
            ArrayList<y.a> arrayList3 = zVar.f183117d;
            if (arrayList3 != null) {
                Iterator<y.a> it = arrayList3.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                zVar.f183117d.removeAll(arrayList2);
                arrayList2.clear();
                if (zVar.f183117d.isEmpty()) {
                    zVar.f183117d = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.f182919a == null) {
            return;
        }
        if ((this.f182950w & 1) == 1 && !isInEditMode()) {
            this.K0++;
            long nanoTime = getNanoTime();
            long j8 = this.L0;
            if (j8 != -1) {
                long j14 = nanoTime - j8;
                if (j14 > 200000000) {
                    this.M0 = ((int) ((this.K0 / (j14 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.K0 = 0;
                    this.L0 = nanoTime;
                }
            } else {
                this.L0 = nanoTime;
            }
            Paint paint5 = new Paint();
            paint5.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.M0);
            sb3.append(" fps ");
            int i24 = this.f182927e;
            StringBuilder sbK = e5.k(am.j.o(i24 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i24), " -> ", sb3));
            int i25 = this.f182931g;
            sbK.append(i25 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i25));
            sbK.append(" (progress: ");
            sbK.append(progress);
            sbK.append(" ) state=");
            int i26 = this.f182929f;
            sbK.append(i26 == -1 ? "undefined" : i26 != -1 ? getContext().getResources().getResourceEntryName(i26) : "UNDEFINED");
            String string = sbK.toString();
            paint5.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint5);
            paint5.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint5);
        }
        if (this.f182950w > 1) {
            if (this.f182951x == null) {
                this.f182951x = new e();
            }
            e eVar = this.f182951x;
            s sVar2 = this.f182919a;
            s.b bVar = sVar2.f183014c;
            int i27 = bVar != null ? bVar.f183039h : sVar2.f183021j;
            int i28 = this.f182950w;
            Paint paint6 = eVar.f182967g;
            Paint paint7 = eVar.f182966f;
            Paint paint8 = eVar.f182969i;
            int i29 = eVar.f182973m;
            Paint paint9 = eVar.f182965e;
            q qVar = q.this;
            HashMap<View, n> map = this.f182939k;
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!qVar.isInEditMode() && (i28 & 1) == 2) {
                String str = qVar.getContext().getResources().getResourceName(qVar.f182931g) + ":" + qVar.getProgress();
                canvas.drawText(str, 10.0f, qVar.getHeight() - 30, eVar.f182968h);
                canvas.drawText(str, 11.0f, qVar.getHeight() - 29, paint9);
            }
            Iterator<n> it3 = map.values().iterator();
            while (it3.hasNext()) {
                n next = it3.next();
                r rVar = next.f182893f;
                ArrayList<r> arrayList4 = next.f182908u;
                int iMax = rVar.f182996b;
                Iterator<r> it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    iMax = Math.max(iMax, it4.next().f182996b);
                }
                int iMax2 = Math.max(iMax, next.f182894g.f182996b);
                if (i28 > 0 && iMax2 == 0) {
                    iMax2 = 1;
                }
                if (iMax2 != 0) {
                    float[] fArr = eVar.f182963c;
                    int[] iArr = eVar.f182962b;
                    if (fArr != null) {
                        double[] dArrF = next.f182897j[0].f();
                        if (iArr != null) {
                            Iterator<r> it5 = arrayList4.iterator();
                            int i30 = 0;
                            while (it5.hasNext()) {
                                iArr[i30] = it5.next().f183009o;
                                i30++;
                                arrayList4 = arrayList4;
                            }
                        }
                        arrayList = arrayList4;
                        int i34 = 0;
                        int i35 = 0;
                        while (i34 < dArrF.length) {
                            int i36 = i34;
                            float[] fArr2 = fArr;
                            double[] dArr = dArrF;
                            next.f182897j[0].c(dArrF[i36], next.f182903p);
                            next.f182893f.c(dArr[i36], next.f182902o, next.f182903p, fArr2, i35);
                            i35 += 2;
                            i34 = i36 + 1;
                            fArr = fArr2;
                            dArrF = dArr;
                        }
                        i14 = i35 / 2;
                    } else {
                        arrayList = arrayList4;
                        i14 = 0;
                    }
                    eVar.f182971k = i14;
                    if (iMax2 >= 1) {
                        int i37 = i27 / 16;
                        float[] fArr3 = eVar.f182961a;
                        if (fArr3 == null || fArr3.length != i37 * 2) {
                            eVar.f182961a = new float[i37 * 2];
                            eVar.f182964d = new Path();
                        }
                        float f14 = i29;
                        canvas.translate(f14, f14);
                        paint9.setColor(1996488704);
                        paint8.setColor(1996488704);
                        paint7.setColor(1996488704);
                        paint6.setColor(1996488704);
                        float[] fArr4 = eVar.f182961a;
                        float f15 = 1.0f / (i37 - 1);
                        float f16 = 1.0f;
                        HashMap<String, v6.d> map2 = next.f182912y;
                        v6.d dVar = map2 == null ? null : map2.get("translationX");
                        HashMap<String, v6.d> map3 = next.f182912y;
                        i15 = i27;
                        v6.d dVar2 = map3 == null ? null : map3.get("translationY");
                        i16 = i28;
                        HashMap<String, v6.c> map4 = next.f182913z;
                        v6.c cVar = map4 == null ? null : map4.get("translationX");
                        HashMap<String, v6.c> map5 = next.f182913z;
                        v6.c cVar2 = map5 == null ? null : map5.get("translationY");
                        int i38 = 0;
                        while (true) {
                            float f17 = Float.NaN;
                            i18 = i29;
                            if (i38 >= i37) {
                                break;
                            }
                            float fMin = i38 * f15;
                            int i39 = i37;
                            float f18 = next.f182901n;
                            if (f18 != f16) {
                                float f19 = next.f182900m;
                                if (fMin < f19) {
                                    fMin = 0.0f;
                                }
                                if (fMin > f19) {
                                    i19 = i38;
                                    paint3 = paint6;
                                    if (fMin < 1.0d) {
                                        fMin = Math.min((fMin - f19) * f18, f16);
                                    }
                                } else {
                                    i19 = i38;
                                    paint3 = paint6;
                                }
                            } else {
                                i19 = i38;
                                paint3 = paint6;
                            }
                            double d14 = fMin;
                            o6.c cVar3 = rVar.f182995a;
                            float f22 = 0.0f;
                            for (r rVar2 : arrayList) {
                                double d15 = d14;
                                o6.c cVar4 = rVar2.f182995a;
                                if (cVar4 != null) {
                                    float f24 = rVar2.f182997c;
                                    if (f24 < fMin) {
                                        f22 = f24;
                                        cVar3 = cVar4;
                                    } else if (Float.isNaN(f17)) {
                                        f17 = rVar2.f182997c;
                                    }
                                }
                                d14 = d15;
                            }
                            double d16 = d14;
                            if (cVar3 != null) {
                                if (Float.isNaN(f17)) {
                                    f17 = 1.0f;
                                }
                                float f25 = f17 - f22;
                                dA = (((float) cVar3.a((fMin - f22) / f25)) * f25) + f22;
                            } else {
                                dA = d16;
                            }
                            r rVar3 = rVar;
                            next.f182897j[0].c(dA, next.f182903p);
                            o6.a aVar = next.f182898k;
                            if (aVar != null) {
                                double[] dArr2 = next.f182903p;
                                paint4 = paint8;
                                if (dArr2.length > 0) {
                                    aVar.c(dA, dArr2);
                                }
                            } else {
                                paint4 = paint8;
                            }
                            int i44 = i19 * 2;
                            next.f182893f.c(dA, next.f182902o, next.f182903p, fArr4, i44);
                            if (cVar != null) {
                                fArr4[i44] = cVar.a(fMin) + fArr4[i44];
                            } else if (dVar != null) {
                                fArr4[i44] = dVar.a(fMin) + fArr4[i44];
                            }
                            if (cVar2 != null) {
                                int i45 = i44 + 1;
                                fArr4[i45] = cVar2.a(fMin) + fArr4[i45];
                            } else if (dVar2 != null) {
                                int i46 = i44 + 1;
                                fArr4[i46] = dVar2.a(fMin) + fArr4[i46];
                            }
                            i38 = i19 + 1;
                            i29 = i18;
                            i37 = i39;
                            paint6 = paint3;
                            rVar = rVar3;
                            paint8 = paint4;
                            f16 = 1.0f;
                        }
                        r rVar4 = rVar;
                        eVar.a(canvas, iMax2, eVar.f182971k, next);
                        paint9.setColor(-21965);
                        paint7.setColor(-2067046);
                        Paint paint10 = paint8;
                        paint10.setColor(-2067046);
                        paint = paint6;
                        paint.setColor(-13391360);
                        int i47 = i18;
                        float f26 = -i47;
                        canvas.translate(f26, f26);
                        eVar.a(canvas, iMax2, eVar.f182971k, next);
                        char c14 = 5;
                        if (iMax2 == 5) {
                            float[] fArr5 = eVar.f182970j;
                            eVar.f182964d.reset();
                            int i48 = 0;
                            while (i48 <= 50) {
                                char c15 = c14;
                                int i49 = i48;
                                next.f182897j[0].c(next.a(i48 / 50, null), next.f182903p);
                                int[] iArr2 = next.f182902o;
                                double[] dArr3 = next.f182903p;
                                r rVar5 = rVar4;
                                float fSin = rVar5.f182999e;
                                float fCos = rVar5.f183000f;
                                float f27 = rVar5.f183001g;
                                float f28 = rVar5.f183002h;
                                float[] fArr6 = fArr5;
                                int i54 = i47;
                                int i55 = 0;
                                while (true) {
                                    nVar = next;
                                    if (i55 >= iArr2.length) {
                                        break;
                                    }
                                    Paint paint11 = paint10;
                                    float f29 = (float) dArr3[i55];
                                    int i56 = iArr2[i55];
                                    if (i56 == 1) {
                                        fSin = f29;
                                    } else if (i56 == 2) {
                                        fCos = f29;
                                    } else if (i56 == 3) {
                                        f27 = f29;
                                    } else if (i56 == 4) {
                                        f28 = f29;
                                    }
                                    i55++;
                                    next = nVar;
                                    paint10 = paint11;
                                }
                                Paint paint12 = paint10;
                                if (rVar5.f183007m != null) {
                                    double d17 = 0.0f;
                                    double d18 = fSin;
                                    double d19 = fCos;
                                    fSin = (float) (((Math.sin(d19) * d18) + d17) - ((double) (f27 / 2.0f)));
                                    fCos = (float) ((d17 - (Math.cos(d19) * d18)) - ((double) (f28 / 2.0f)));
                                }
                                float f34 = f27 + fSin;
                                float f35 = f28 + fCos;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f36 = fSin + 0.0f;
                                float f37 = fCos + 0.0f;
                                float f38 = f34 + 0.0f;
                                float f39 = f35 + 0.0f;
                                fArr6[0] = f36;
                                fArr6[1] = f37;
                                fArr6[2] = f38;
                                fArr6[3] = f37;
                                fArr6[4] = f38;
                                fArr6[c15] = f39;
                                fArr6[6] = f36;
                                fArr6[7] = f39;
                                eVar.f182964d.moveTo(f36, f37);
                                eVar.f182964d.lineTo(fArr6[2], fArr6[3]);
                                eVar.f182964d.lineTo(fArr6[4], fArr6[c15]);
                                eVar.f182964d.lineTo(fArr6[6], fArr6[7]);
                                eVar.f182964d.close();
                                i48 = i49 + 1;
                                eVar = eVar;
                                rVar4 = rVar5;
                                c14 = c15;
                                fArr5 = fArr6;
                                next = nVar;
                                i47 = i54;
                                paint10 = paint12;
                            }
                            i17 = i47;
                            eVar = eVar;
                            paint2 = paint10;
                            paint9.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(eVar.f182964d, paint9);
                            canvas.translate(-2.0f, -2.0f);
                            paint9.setColor(-65536);
                            canvas.drawPath(eVar.f182964d, paint9);
                        } else {
                            i17 = i47;
                            paint2 = paint10;
                        }
                        eVar = eVar;
                        paint6 = paint;
                        it3 = it3;
                        i27 = i15;
                        i28 = i16;
                        i29 = i17;
                        paint8 = paint2;
                    } else {
                        i15 = i27;
                        i16 = i28;
                        paint = paint6;
                        paint2 = paint8;
                        i17 = i29;
                    }
                    eVar = eVar;
                    paint6 = paint;
                    it3 = it3;
                    i27 = i15;
                    i28 = i16;
                    i29 = i17;
                    paint8 = paint2;
                }
            }
            canvas.restore();
        }
    }

    public int[] getConstraintSetIds() {
        s sVar = this.f182919a;
        if (sVar == null) {
            return null;
        }
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = sVar.f183018g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = sparseArray.keyAt(i14);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f182929f;
    }

    public ArrayList<s.b> getDefinedTransitions() {
        s sVar = this.f182919a;
        if (sVar == null) {
            return null;
        }
        return sVar.f183015d;
    }

    public w6.b getDesignTool() {
        if (this.B == null) {
            this.B = new w6.b(this);
        }
        return this.B;
    }

    public int getEndState() {
        return this.f182931g;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f182944o;
    }

    public s getScene() {
        return this.f182919a;
    }

    public int getStartState() {
        return this.f182927e;
    }

    public float getTargetPosition() {
        return this.f182946q;
    }

    public Bundle getTransitionState() {
        if (this.Z0 == null) {
            this.Z0 = new h();
        }
        h hVar = this.Z0;
        q qVar = q.this;
        hVar.f182987d = qVar.f182931g;
        hVar.f182986c = qVar.f182927e;
        hVar.f182985b = qVar.getVelocity();
        hVar.f182984a = qVar.getProgress();
        h hVar2 = this.Z0;
        hVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", hVar2.f182984a);
        bundle.putFloat("motion.velocity", hVar2.f182985b);
        bundle.putInt("motion.StartState", hVar2.f182986c);
        bundle.putInt("motion.EndState", hVar2.f182987d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        s sVar = this.f182919a;
        if (sVar != null) {
            s.b bVar = sVar.f183014c;
            this.f182942m = (bVar != null ? bVar.f183039h : sVar.f183021j) / 1000.0f;
        }
        return (long) (this.f182942m * 1000.0f);
    }

    public float getVelocity() {
        return this.f182925d;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i14) {
        s.b bVar;
        if (i14 == 0) {
            this.f182919a = null;
            return;
        }
        try {
            s sVar = new s(getContext(), this, i14);
            this.f182919a = sVar;
            int i15 = -1;
            if (this.f182929f == -1) {
                this.f182929f = sVar.g();
                this.f182927e = this.f182919a.g();
                s.b bVar2 = this.f182919a.f183014c;
                if (bVar2 != null) {
                    i15 = bVar2.f183034c;
                }
                this.f182931g = i15;
            }
            if (!isAttachedToWindow()) {
                this.f182919a = null;
                return;
            }
            try {
                Display display = getDisplay();
                if (display != null) {
                    display.getRotation();
                }
                s sVar2 = this.f182919a;
                if (sVar2 != null) {
                    androidx.constraintlayout.widget.d dVarB = sVar2.b(this.f182929f);
                    this.f182919a.m(this);
                    if (dVarB != null) {
                        dVarB.b(this);
                    }
                    this.f182927e = this.f182929f;
                }
                v();
                h hVar = this.Z0;
                if (hVar != null) {
                    if (this.f182924c1) {
                        post(new a());
                        return;
                    } else {
                        hVar.a();
                        return;
                    }
                }
                s sVar3 = this.f182919a;
                if (sVar3 == null || (bVar = sVar3.f183014c) == null || bVar.f183045n != 4) {
                    return;
                }
                A();
                setState(j.SETUP);
                setState(j.MOVING);
            } catch (Exception e4) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e4);
            }
        } catch (Exception e14) {
            n23.j.w("unable to parse MotionScene file", e14);
        }
    }

    public final void n(float f14) {
        s sVar = this.f182919a;
        if (sVar == null) {
            return;
        }
        float f15 = this.f182944o;
        float f16 = this.f182943n;
        if (f15 != f16 && this.f182947r) {
            this.f182944o = f16;
        }
        float f17 = this.f182944o;
        if (f17 == f14) {
            return;
        }
        this.f182952y = false;
        this.f182946q = f14;
        s.b bVar = sVar.f183014c;
        this.f182942m = (bVar != null ? bVar.f183039h : sVar.f183021j) / 1000.0f;
        setProgress(f14);
        this.f182921b = null;
        this.f182923c = this.f182919a.d();
        this.f182947r = false;
        this.f182941l = getNanoTime();
        this.f182948t = true;
        this.f182943n = f17;
        this.f182944o = f17;
        invalidate();
    }

    public final void o(boolean z14) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            n nVar = this.f182939k.get(getChildAt(i14));
            if (nVar != null && "button".equals(w6.a.c(nVar.f182889b)) && nVar.A != null) {
                int i15 = 0;
                while (true) {
                    k[] kVarArr = nVar.A;
                    if (i15 < kVarArr.length) {
                        kVarArr[i15].f(z14 ? -100.0f : 100.0f, nVar.f182889b);
                        i15++;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        s.b bVar;
        int i14;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        s sVar = this.f182919a;
        if (sVar != null && (i14 = this.f182929f) != -1) {
            androidx.constraintlayout.widget.d dVarB = sVar.b(i14);
            this.f182919a.m(this);
            if (dVarB != null) {
                dVarB.b(this);
            }
            this.f182927e = this.f182929f;
        }
        v();
        h hVar = this.Z0;
        if (hVar != null) {
            if (this.f182924c1) {
                post(new c());
                return;
            } else {
                hVar.a();
                return;
            }
        }
        s sVar2 = this.f182919a;
        if (sVar2 == null || (bVar = sVar2.f183014c) == null || bVar.f183045n != 4) {
            return;
        }
        A();
        setState(j.SETUP);
        setState(j.MOVING);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z14;
        w wVar;
        int i14;
        RectF rectFB;
        s sVar = this.f182919a;
        if (sVar == null || !this.f182937j) {
            return false;
        }
        z zVar = sVar.f183028q;
        if (zVar != null) {
            ArrayList<y> arrayList = zVar.f183115b;
            q qVar = zVar.f183114a;
            int currentState = qVar.getCurrentState();
            if (currentState == -1) {
                z14 = false;
            } else {
                if (zVar.f183116c == null) {
                    zVar.f183116c = new HashSet<>();
                    for (y yVar : arrayList) {
                        int childCount = qVar.getChildCount();
                        for (int i15 = 0; i15 < childCount; i15++) {
                            View childAt = qVar.getChildAt(i15);
                            if (yVar.c(childAt)) {
                                childAt.getId();
                                zVar.f183116c.add(childAt);
                            }
                        }
                    }
                }
                float x14 = motionEvent.getX();
                float y14 = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<y.a> arrayList2 = zVar.f183117d;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    for (y.a aVar : zVar.f183117d) {
                        Rect rect2 = aVar.f183112l;
                        if (action != 1) {
                            if (action == 2) {
                                aVar.f183103c.f182889b.getHitRect(rect2);
                                if (!rect2.contains((int) x14, (int) y14) && !aVar.f183108h) {
                                    aVar.b();
                                }
                            }
                        } else if (!aVar.f183108h) {
                            aVar.b();
                        }
                    }
                }
                z14 = false;
                if (action == 0 || action == 1) {
                    s sVar2 = qVar.f182919a;
                    androidx.constraintlayout.widget.d dVarB = sVar2 == null ? null : sVar2.b(currentState);
                    for (y yVar2 : arrayList) {
                        int i16 = yVar2.f183081b;
                        if (i16 == 1) {
                            if (action == 0) {
                                for (View view2 : zVar.f183116c) {
                                    if (yVar2.c(view2)) {
                                        view2.getHitRect(rect);
                                        if (rect.contains((int) x14, (int) y14)) {
                                            yVar2.a(zVar, zVar.f183114a, currentState, dVarB, view2);
                                        }
                                    }
                                }
                            }
                        } else if (i16 == 2) {
                            if (action == 1) {
                                while (r2.hasNext()) {
                                    if (yVar2.c(view2)) {
                                        view2.getHitRect(rect);
                                        if (rect.contains((int) x14, (int) y14)) {
                                            yVar2.a(zVar, zVar.f183114a, currentState, dVarB, view2);
                                        }
                                    }
                                }
                            }
                        } else if (i16 == 3 && action == 0) {
                            while (r2.hasNext()) {
                                if (yVar2.c(view2)) {
                                    view2.getHitRect(rect);
                                    if (rect.contains((int) x14, (int) y14)) {
                                        yVar2.a(zVar, zVar.f183114a, currentState, dVarB, view2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            z14 = false;
        }
        s.b bVar = this.f182919a.f183014c;
        if (bVar == null || bVar.f183046o || (wVar = bVar.f183043l) == null) {
            return z14;
        }
        if ((motionEvent.getAction() == 0 && (rectFB = wVar.b(this, new RectF())) != null && !rectFB.contains(motionEvent.getX(), motionEvent.getY())) || (i14 = wVar.f183057e) == -1) {
            return z14;
        }
        View view3 = this.f182934h1;
        if (view3 == null || view3.getId() != i14) {
            this.f182934h1 = findViewById(i14);
        }
        View view4 = this.f182934h1;
        if (view4 == null) {
            return z14;
        }
        float left = view4.getLeft();
        float top = this.f182934h1.getTop();
        float right = this.f182934h1.getRight();
        float bottom = this.f182934h1.getBottom();
        RectF rectF = this.f182932g1;
        rectF.set(left, top, right, bottom);
        return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || t((float) this.f182934h1.getLeft(), (float) this.f182934h1.getTop(), this.f182934h1, motionEvent)) ? z14 : onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) throws Throwable {
        q qVar;
        this.Y0 = true;
        try {
            if (this.f182919a == null) {
                super.onLayout(z14, i14, i15, i16, i17);
                this.Y0 = false;
                return;
            }
            qVar = this;
            int i18 = i16 - i14;
            int i19 = i17 - i15;
            try {
                if (qVar.C != i18 || qVar.D != i19) {
                    x();
                    p(true);
                }
                qVar.C = i18;
                qVar.D = i19;
                qVar.Y0 = false;
                return;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            qVar = this;
        }
        Throwable th5 = th;
        qVar.Y0 = false;
        throw th5;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i14, int i15) {
        boolean z14;
        if (this.f182919a == null) {
            super.onMeasure(i14, i15);
            return;
        }
        boolean z15 = true;
        boolean z16 = (this.f182933h == i14 && this.f182935i == i15) ? false : true;
        if (this.f182930f1) {
            this.f182930f1 = false;
            v();
            w();
            z16 = true;
        }
        if (this.mDirtyHierarchy) {
            z16 = true;
        }
        this.f182933h = i14;
        this.f182935i = i15;
        int iG = this.f182919a.g();
        s.b bVar = this.f182919a.f183014c;
        int i16 = bVar == null ? -1 : bVar.f183034c;
        f fVar = this.f182928e1;
        if ((!z16 && iG == fVar.f182979e && i16 == fVar.f182980f) || this.f182927e == -1) {
            if (z16) {
                super.onMeasure(i14, i15);
            }
            z14 = true;
        } else {
            super.onMeasure(i14, i15);
            fVar.e(this.f182919a.b(iG), this.f182919a.b(i16));
            fVar.f();
            fVar.f182979e = iG;
            fVar.f182980f = i16;
            z14 = false;
        }
        if (this.P0 || z14) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iS = this.mLayoutWidget.s() + getPaddingRight() + getPaddingLeft();
            int iM = this.mLayoutWidget.m() + paddingBottom;
            int i17 = this.U0;
            if (i17 == Integer.MIN_VALUE || i17 == 0) {
                int i18 = this.Q0;
                iS = (int) ((this.W0 * (this.S0 - i18)) + i18);
                requestLayout();
            }
            int i19 = this.V0;
            if (i19 == Integer.MIN_VALUE || i19 == 0) {
                int i24 = this.R0;
                iM = (int) ((this.W0 * (this.T0 - i24)) + i24);
                requestLayout();
            }
            setMeasuredDimension(iS, iM);
        }
        float fSignum = Math.signum(this.f182946q - this.f182944o);
        long nanoTime = getNanoTime();
        p pVar = this.f182921b;
        float interpolation = this.f182944o + (!(pVar instanceof v6.b) ? (((nanoTime - this.f182945p) * fSignum) * 1.0E-9f) / this.f182942m : 0.0f);
        if (this.f182947r) {
            interpolation = this.f182946q;
        }
        if ((fSignum <= 0.0f || interpolation < this.f182946q) && (fSignum > 0.0f || interpolation > this.f182946q)) {
            z15 = false;
        } else {
            interpolation = this.f182946q;
        }
        if (pVar != null && !z15) {
            interpolation = this.f182952y ? pVar.getInterpolation((nanoTime - this.f182941l) * 1.0E-9f) : pVar.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f182946q) || (fSignum <= 0.0f && interpolation <= this.f182946q)) {
            interpolation = this.f182946q;
        }
        this.W0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f182923c;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f14 = interpolation;
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt = getChildAt(i25);
            n nVar = this.f182939k.get(childAt);
            if (nVar != null) {
                nVar.c(f14, nanoTime2, childAt, this.X0);
            }
        }
        if (this.P0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view2, float f14, float f15, boolean z14) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view2, float f14, float f15) {
        return false;
    }

    @Override // androidx.core.view.w
    public final void onNestedPreScroll(View view2, int i14, int i15, int[] iArr, int i16) {
        s.b bVar;
        boolean z14;
        float f14;
        w wVar;
        float f15;
        w wVar2;
        w wVar3;
        w wVar4;
        int i17;
        s sVar = this.f182919a;
        if (sVar == null || (bVar = sVar.f183014c) == null || (z14 = bVar.f183046o)) {
            return;
        }
        int i18 = -1;
        if (z14 || (wVar4 = bVar.f183043l) == null || (i17 = wVar4.f183057e) == -1 || view2.getId() == i17) {
            s.b bVar2 = sVar.f183014c;
            if ((bVar2 == null || (wVar3 = bVar2.f183043l) == null) ? false : wVar3.f183073u) {
                w wVar5 = bVar.f183043l;
                if (wVar5 != null && (wVar5.f183075w & 4) != 0) {
                    i18 = i15;
                }
                float f16 = this.f182943n;
                if ((f16 == 1.0f || f16 == 0.0f) && view2.canScrollVertically(i18)) {
                    return;
                }
            }
            w wVar6 = bVar.f183043l;
            if (wVar6 == null || (wVar6.f183075w & 1) == 0) {
                f14 = 0.0f;
            } else {
                float f17 = i14;
                float f18 = i15;
                s.b bVar3 = sVar.f183014c;
                if (bVar3 == null || (wVar2 = bVar3.f183043l) == null) {
                    f14 = 0.0f;
                    f15 = 0.0f;
                } else {
                    float[] fArr = wVar2.f183066n;
                    f14 = 0.0f;
                    wVar2.f183070r.s(wVar2.f183056d, wVar2.f183070r.getProgress(), wVar2.f183060h, wVar2.f183059g, fArr);
                    float f19 = wVar2.f183063k;
                    if (f19 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f15 = (f17 * f19) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f15 = (f18 * wVar2.f183064l) / fArr[1];
                    }
                }
                float f22 = this.f182944o;
                if ((f22 <= f14 && f15 < f14) || (f22 >= 1.0f && f15 > f14)) {
                    view2.setNestedScrollingEnabled(false);
                    view2.post(new b(this, view2));
                    return;
                }
            }
            float f24 = this.f182943n;
            long nanoTime = getNanoTime();
            float f25 = i14;
            this.F = f25;
            float f26 = i15;
            this.I = f26;
            this.T = (float) ((nanoTime - this.P) * 1.0E-9d);
            this.P = nanoTime;
            s.b bVar4 = sVar.f183014c;
            if (bVar4 != null && (wVar = bVar4.f183043l) != null) {
                float[] fArr2 = wVar.f183066n;
                q qVar = wVar.f183070r;
                float progress = qVar.getProgress();
                if (!wVar.f183065m) {
                    wVar.f183065m = true;
                    qVar.setProgress(progress);
                }
                wVar.f183070r.s(wVar.f183056d, progress, wVar.f183060h, wVar.f183059g, fArr2);
                if (Math.abs((wVar.f183064l * fArr2[1]) + (wVar.f183063k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f27 = wVar.f183063k;
                float fMax = Math.max(Math.min(progress + (f27 != f14 ? (f25 * f27) / fArr2[0] : (f26 * wVar.f183064l) / fArr2[1]), 1.0f), f14);
                if (fMax != qVar.getProgress()) {
                    qVar.setProgress(fMax);
                }
            }
            if (f24 != this.f182943n) {
                iArr[0] = i14;
                iArr[1] = i15;
            }
            p(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.E = true;
        }
    }

    @Override // androidx.core.view.x
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18, int[] iArr) {
        if (this.E || i14 != 0 || i15 != 0) {
            iArr[0] = iArr[0] + i16;
            iArr[1] = iArr[1] + i17;
        }
        this.E = false;
    }

    @Override // androidx.core.view.w
    public final void onNestedScrollAccepted(View view2, View view3, int i14, int i15) {
        this.P = getNanoTime();
        this.T = 0.0f;
        this.F = 0.0f;
        this.I = 0.0f;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i14) {
        w wVar;
        s sVar = this.f182919a;
        if (sVar != null) {
            boolean zIsRtl = isRtl();
            sVar.f183027p = zIsRtl;
            s.b bVar = sVar.f183014c;
            if (bVar == null || (wVar = bVar.f183043l) == null) {
                return;
            }
            wVar.c(zIsRtl);
        }
    }

    @Override // androidx.core.view.w
    public final boolean onStartNestedScroll(View view2, View view3, int i14, int i15) {
        s.b bVar;
        w wVar;
        s sVar = this.f182919a;
        return (sVar == null || (bVar = sVar.f183014c) == null || (wVar = bVar.f183043l) == null || (wVar.f183075w & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.w
    public final void onStopNestedScroll(View view2, int i14) {
        w wVar;
        int i15;
        s sVar = this.f182919a;
        if (sVar != null) {
            float f14 = this.T;
            if (f14 == 0.0f) {
                return;
            }
            float f15 = this.F / f14;
            float f16 = this.I / f14;
            s.b bVar = sVar.f183014c;
            if (bVar == null || (wVar = bVar.f183043l) == null) {
                return;
            }
            float[] fArr = wVar.f183066n;
            wVar.f183065m = false;
            q qVar = wVar.f183070r;
            float progress = qVar.getProgress();
            wVar.f183070r.s(wVar.f183056d, progress, wVar.f183060h, wVar.f183059g, fArr);
            float f17 = wVar.f183063k;
            float f18 = f17 != 0.0f ? (f15 * f17) / fArr[0] : (f16 * wVar.f183064l) / fArr[1];
            if (!Float.isNaN(f18)) {
                progress += f18 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i15 = wVar.f183055c) == 3) {
                return;
            }
            qVar.z(((double) progress) >= 0.5d ? 1.0f : 0.0f, f18, i15);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: w6.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: w6.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v64 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v64 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v65 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v65 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v68 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v68 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v71 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v71 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v62 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instruction units count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.q.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view2) {
        super.onViewAdded(view2);
        if (view2 instanceof o) {
            o oVar = (o) view2;
            if (this.J0 == null) {
                this.J0 = new CopyOnWriteArrayList<>();
            }
            this.J0.add(oVar);
            if (oVar.f182914i) {
                if (this.H0 == null) {
                    this.H0 = new ArrayList<>();
                }
                this.H0.add(oVar);
            }
            if (oVar.f182915j) {
                if (this.I0 == null) {
                    this.I0 = new ArrayList<>();
                }
                this.I0.add(oVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view2) {
        super.onViewRemoved(view2);
        ArrayList<o> arrayList = this.H0;
        if (arrayList != null) {
            arrayList.remove(view2);
        }
        ArrayList<o> arrayList2 = this.I0;
        if (arrayList2 != null) {
            arrayList2.remove(view2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:127:0x01da  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:143:0x020e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00db A[PHI: r3
      0x00db: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00a9, B:58:0x00cf, B:60:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0106  */
    /* JADX WARN: Code duplicated, block: B:74:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    /* JADX WARN: Code duplicated, block: B:93:0x014d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    public final void p(boolean z14) {
        boolean z15;
        char c14;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i14;
        int i15;
        int i16;
        int i17;
        View childAt;
        n nVar;
        boolean z16;
        if (this.f182945p == -1) {
            this.f182945p = getNanoTime();
        }
        float f14 = this.f182944o;
        if (f14 > 0.0f && f14 < 1.0f) {
            this.f182929f = -1;
        }
        boolean z17 = false;
        if (this.f182940k0 || (this.f182948t && (z14 || this.f182946q != f14))) {
            float fSignum = Math.signum(this.f182946q - f14);
            long nanoTime2 = getNanoTime();
            p pVar = this.f182921b;
            float f15 = pVar == null ? (((nanoTime2 - this.f182945p) * fSignum) * 1.0E-9f) / this.f182942m : 0.0f;
            float f16 = this.f182944o + f15;
            if (this.f182947r) {
                f16 = this.f182946q;
            }
            if ((fSignum <= 0.0f || f16 < this.f182946q) && (fSignum > 0.0f || f16 > this.f182946q)) {
                z15 = false;
            } else {
                f16 = this.f182946q;
                this.f182948t = false;
                z15 = true;
            }
            this.f182944o = f16;
            this.f182943n = f16;
            this.f182945p = nanoTime2;
            if (pVar == null || z15) {
                this.f182925d = f15;
            } else {
                if (this.f182952y) {
                    float interpolation2 = pVar.getInterpolation((nanoTime2 - this.f182941l) * 1.0E-9f);
                    p pVar2 = this.f182921b;
                    v6.b bVar = this.f182953z;
                    c14 = pVar2 == bVar ? bVar.f175780c.b() ? (char) 2 : (char) 1 : (char) 0;
                    this.f182944o = interpolation2;
                    this.f182945p = nanoTime2;
                    p pVar3 = this.f182921b;
                    if (pVar3 != null) {
                        float fA = pVar3.a();
                        this.f182925d = fA;
                        if (Math.abs(fA) * this.f182942m <= 1.0E-5f && c14 == 2) {
                            this.f182948t = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.f182944o = 1.0f;
                            this.f182948t = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f16 = interpolation2;
                        } else {
                            this.f182944o = 0.0f;
                            this.f182948t = false;
                            f16 = 0.0f;
                        }
                    } else {
                        f16 = interpolation2;
                    }
                } else {
                    float interpolation3 = pVar.getInterpolation(f16);
                    p pVar4 = this.f182921b;
                    if (pVar4 != null) {
                        this.f182925d = pVar4.a();
                    } else {
                        this.f182925d = ((pVar4.getInterpolation(f16 + f15) - interpolation3) * fSignum) / f15;
                    }
                    f16 = interpolation3;
                }
                if (Math.abs(this.f182925d) > 1.0E-5f) {
                    setState(j.MOVING);
                }
                if (c14 != 1) {
                    if ((fSignum <= 0.0f && f16 >= this.f182946q) || (fSignum <= 0.0f && f16 <= this.f182946q)) {
                        f16 = this.f182946q;
                        this.f182948t = false;
                    }
                    if (f16 < 1.0f || f16 <= 0.0f) {
                        this.f182948t = false;
                        setState(j.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.f182940k0 = false;
                nanoTime = getNanoTime();
                this.W0 = f16;
                interpolator = this.f182923c;
                if (interpolator == null) {
                    interpolation = f16;
                } else {
                    interpolation = interpolator.getInterpolation(f16);
                }
                interpolator2 = this.f182923c;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f182942m) + f16);
                    this.f182925d = interpolation4;
                    this.f182925d = interpolation4 - this.f182923c.getInterpolation(f16);
                }
                for (i14 = 0; i14 < childCount; i14++) {
                    childAt = getChildAt(i14);
                    nVar = this.f182939k.get(childAt);
                    if (nVar != null) {
                        this.f182940k0 = nVar.c(interpolation, nanoTime, childAt, this.X0) | this.f182940k0;
                    }
                }
                boolean z18 = (fSignum <= 0.0f && f16 >= this.f182946q) || (fSignum <= 0.0f && f16 <= this.f182946q);
                if (!this.f182940k0 && !this.f182948t && z18) {
                    setState(j.FINISHED);
                }
                if (this.P0) {
                    requestLayout();
                }
                this.f182940k0 = (!z18) | this.f182940k0;
                if (f16 <= 0.0f && (i17 = this.f182927e) != -1 && this.f182929f != i17) {
                    this.f182929f = i17;
                    this.f182919a.b(i17).a(this);
                    setState(j.FINISHED);
                    z17 = true;
                }
                if (f16 >= 1.0d) {
                    i15 = this.f182929f;
                    i16 = this.f182931g;
                    if (i15 != i16) {
                        this.f182929f = i16;
                        this.f182919a.b(i16).a(this);
                        setState(j.FINISHED);
                        z17 = true;
                    }
                }
                if (!this.f182940k0 || this.f182948t) {
                    invalidate();
                } else if ((fSignum > 0.0f && f16 == 1.0f) || (fSignum < 0.0f && f16 == 0.0f)) {
                    setState(j.FINISHED);
                }
                if (!this.f182940k0 && !this.f182948t && ((fSignum > 0.0f && f16 == 1.0f) || (fSignum < 0.0f && f16 == 0.0f))) {
                    v();
                }
            }
            c14 = 0;
            if (Math.abs(this.f182925d) > 1.0E-5f) {
                setState(j.MOVING);
            }
            if (c14 != 1) {
                if (fSignum <= 0.0f) {
                    f16 = this.f182946q;
                    this.f182948t = false;
                } else {
                    f16 = this.f182946q;
                    this.f182948t = false;
                }
                if (f16 < 1.0f) {
                    this.f182948t = false;
                    setState(j.FINISHED);
                } else {
                    this.f182948t = false;
                    setState(j.FINISHED);
                }
            }
            childCount = getChildCount();
            this.f182940k0 = false;
            nanoTime = getNanoTime();
            this.W0 = f16;
            interpolator = this.f182923c;
            if (interpolator == null) {
                interpolation = f16;
            } else {
                interpolation = interpolator.getInterpolation(f16);
            }
            interpolator2 = this.f182923c;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f182942m) + f16);
                this.f182925d = interpolation5;
                this.f182925d = interpolation5 - this.f182923c.getInterpolation(f16);
            }
            while (i14 < childCount) {
                childAt = getChildAt(i14);
                nVar = this.f182939k.get(childAt);
                if (nVar != null) {
                    this.f182940k0 = nVar.c(interpolation, nanoTime, childAt, this.X0) | this.f182940k0;
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.f182940k0) {
                setState(j.FINISHED);
            }
            if (this.P0) {
                requestLayout();
            }
            this.f182940k0 = (!z18) | this.f182940k0;
            if (f16 <= 0.0f) {
                this.f182929f = i17;
                this.f182919a.b(i17).a(this);
                setState(j.FINISHED);
                z17 = true;
            }
            if (f16 >= 1.0d) {
                i15 = this.f182929f;
                i16 = this.f182931g;
                if (i15 != i16) {
                    this.f182929f = i16;
                    this.f182919a.b(i16).a(this);
                    setState(j.FINISHED);
                    z17 = true;
                }
            }
            if (this.f182940k0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f182940k0) {
                v();
            }
        }
        float f17 = this.f182944o;
        if (f17 < 1.0f) {
            if (f17 <= 0.0f) {
                int i18 = this.f182929f;
                int i19 = this.f182927e;
                z16 = i18 == i19 ? z17 : true;
                this.f182929f = i19;
            }
            this.f182930f1 |= z17;
            if (z17 && !this.Y0) {
                requestLayout();
            }
            this.f182943n = this.f182944o;
        }
        int i24 = this.f182929f;
        int i25 = this.f182931g;
        z16 = i24 == i25 ? z17 : true;
        this.f182929f = i25;
        z17 = z16;
        this.f182930f1 |= z17;
        if (z17) {
            requestLayout();
        }
        this.f182943n = this.f182944o;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i14) {
        this.mConstraintLayoutSpec = null;
    }

    public final void q() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        CopyOnWriteArrayList<i> copyOnWriteArrayList2;
        if ((this.f182949v == null && ((copyOnWriteArrayList2 = this.J0) == null || copyOnWriteArrayList2.isEmpty())) || this.O0 == this.f182943n) {
            return;
        }
        if (this.N0 != -1 && (copyOnWriteArrayList = this.J0) != null) {
            Iterator<i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        this.N0 = -1;
        this.O0 = this.f182943n;
        CopyOnWriteArrayList<i> copyOnWriteArrayList3 = this.J0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<i> it3 = copyOnWriteArrayList3.iterator();
            while (it3.hasNext()) {
                it3.next().getClass();
            }
        }
    }

    public final void r() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.f182949v != null || ((copyOnWriteArrayList = this.J0) != null && !copyOnWriteArrayList.isEmpty())) && this.N0 == -1) {
            this.N0 = this.f182929f;
            ArrayList<Integer> arrayList = this.f182938j1;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) am.j.f(1, arrayList)).intValue() : -1;
            int i14 = this.f182929f;
            if (iIntValue != i14 && i14 != -1) {
                arrayList.add(Integer.valueOf(i14));
            }
        }
        w();
        vg1.d dVar = this.f182920a1;
        if (dVar != null) {
            dVar.run();
            this.f182920a1 = null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        s sVar;
        s.b bVar;
        if (!this.P0 && this.f182929f == -1 && (sVar = this.f182919a) != null && (bVar = sVar.f183014c) != null) {
            int i14 = bVar.f183048q;
            if (i14 == 0) {
                return;
            }
            if (i14 == 2) {
                int childCount = getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    this.f182939k.get(getChildAt(i15)).f182891d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final void s(int i14, float f14, float f15, float f16, float[] fArr) {
        double[] dArr;
        View viewById = getViewById(i14);
        n nVar = this.f182939k.get(viewById);
        if (nVar == null) {
            if (viewById == null) {
                return;
            }
            viewById.getContext().getResources().getResourceName(i14);
            return;
        }
        r rVar = nVar.f182893f;
        float[] fArr2 = nVar.f182909v;
        float fA = nVar.a(f14, fArr2);
        o6.b[] bVarArr = nVar.f182897j;
        int i15 = 0;
        if (bVarArr != null) {
            double d14 = fA;
            bVarArr[0].e(d14, nVar.f182904q);
            nVar.f182897j[0].c(d14, nVar.f182903p);
            float f17 = fArr2[0];
            while (true) {
                dArr = nVar.f182904q;
                if (i15 >= dArr.length) {
                    break;
                }
                dArr[i15] = dArr[i15] * ((double) f17);
                i15++;
            }
            o6.a aVar = nVar.f182898k;
            if (aVar != null) {
                double[] dArr2 = nVar.f182903p;
                if (dArr2.length > 0) {
                    aVar.c(d14, dArr2);
                    nVar.f182898k.e(d14, nVar.f182904q);
                    int[] iArr = nVar.f182902o;
                    double[] dArr3 = nVar.f182904q;
                    double[] dArr4 = nVar.f182903p;
                    rVar.getClass();
                    r.e(f15, f16, fArr, iArr, dArr3, dArr4);
                }
            } else {
                int[] iArr2 = nVar.f182902o;
                double[] dArr5 = nVar.f182903p;
                rVar.getClass();
                r.e(f15, f16, fArr, iArr2, dArr, dArr5);
            }
        } else {
            r rVar2 = nVar.f182894g;
            float f18 = rVar2.f182999e - rVar.f182999e;
            float f19 = rVar2.f183000f - rVar.f183000f;
            float f22 = rVar2.f183001g - rVar.f183001g;
            float f24 = (rVar2.f183002h - rVar.f183002h) + f19;
            fArr[0] = ((f22 + f18) * f15) + ((1.0f - f15) * f18);
            fArr[1] = (f24 * f16) + ((1.0f - f16) * f19);
        }
        viewById.getY();
    }

    public void setDebugMode(int i14) {
        this.f182950w = i14;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z14) {
        this.f182924c1 = z14;
    }

    public void setInteractionEnabled(boolean z14) {
        this.f182937j = z14;
    }

    public void setInterpolatedProgress(float f14) {
        if (this.f182919a != null) {
            setState(j.MOVING);
            Interpolator interpolatorD = this.f182919a.d();
            if (interpolatorD != null) {
                setProgress(interpolatorD.getInterpolation(f14));
                return;
            }
        }
        setProgress(f14);
    }

    public void setOnHide(float f14) {
        ArrayList<o> arrayList = this.I0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                this.I0.get(i14).setProgress(f14);
            }
        }
    }

    public void setOnShow(float f14) {
        ArrayList<o> arrayList = this.H0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                this.H0.get(i14).setProgress(f14);
            }
        }
    }

    public void setProgress(float f14) {
        if (f14 >= 0.0f) {
            int i14 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.Z0 == null) {
                this.Z0 = new h();
            }
            this.Z0.f182984a = f14;
            return;
        }
        if (f14 <= 0.0f) {
            if (this.f182944o == 1.0f && this.f182929f == this.f182931g) {
                setState(j.MOVING);
            }
            this.f182929f = this.f182927e;
            if (this.f182944o == 0.0f) {
                setState(j.FINISHED);
            }
        } else if (f14 >= 1.0f) {
            if (this.f182944o == 0.0f && this.f182929f == this.f182927e) {
                setState(j.MOVING);
            }
            this.f182929f = this.f182931g;
            if (this.f182944o == 1.0f) {
                setState(j.FINISHED);
            }
        } else {
            this.f182929f = -1;
            setState(j.MOVING);
        }
        if (this.f182919a == null) {
            return;
        }
        this.f182947r = true;
        this.f182946q = f14;
        this.f182943n = f14;
        this.f182945p = -1L;
        this.f182941l = -1L;
        this.f182921b = null;
        this.f182948t = true;
        invalidate();
    }

    public void setScene(s sVar) {
        w wVar;
        this.f182919a = sVar;
        boolean zIsRtl = isRtl();
        sVar.f183027p = zIsRtl;
        s.b bVar = sVar.f183014c;
        if (bVar != null && (wVar = bVar.f183043l) != null) {
            wVar.c(zIsRtl);
        }
        x();
    }

    public void setStartState(int i14) {
        if (isAttachedToWindow()) {
            this.f182929f = i14;
            return;
        }
        if (this.Z0 == null) {
            this.Z0 = new h();
        }
        h hVar = this.Z0;
        hVar.f182986c = i14;
        hVar.f182987d = i14;
    }

    public void setState(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar == jVar2 && this.f182929f == -1) {
            return;
        }
        j jVar3 = this.f182926d1;
        this.f182926d1 = jVar;
        j jVar4 = j.MOVING;
        if (jVar3 == jVar4 && jVar == jVar4) {
            q();
        }
        int iOrdinal = jVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && jVar == jVar2) {
                r();
                return;
            }
            return;
        }
        if (jVar == jVar4) {
            q();
        }
        if (jVar == jVar2) {
            r();
        }
    }

    public void setTransition(int i14) {
        s.b next;
        float f14;
        s sVar = this.f182919a;
        if (sVar != null) {
            Iterator<s.b> it = sVar.f183015d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.f183032a != i14);
            this.f182927e = next.f183035d;
            this.f182931g = next.f183034c;
            if (!isAttachedToWindow()) {
                if (this.Z0 == null) {
                    this.Z0 = new h();
                }
                h hVar = this.Z0;
                hVar.f182986c = this.f182927e;
                hVar.f182987d = this.f182931g;
                return;
            }
            int i15 = this.f182929f;
            if (i15 == this.f182927e) {
                f14 = 0.0f;
            } else {
                f14 = i15 == this.f182931g ? 1.0f : Float.NaN;
            }
            s sVar2 = this.f182919a;
            sVar2.f183014c = next;
            w wVar = next.f183043l;
            if (wVar != null) {
                wVar.c(sVar2.f183027p);
            }
            this.f182928e1.e(this.f182919a.b(this.f182927e), this.f182919a.b(this.f182931g));
            x();
            if (this.f182944o != f14) {
                if (f14 == 0.0f) {
                    o(true);
                    this.f182919a.b(this.f182927e).b(this);
                } else if (f14 == 1.0f) {
                    o(false);
                    this.f182919a.b(this.f182931g).b(this);
                }
            }
            this.f182944o = Float.isNaN(f14) ? 0.0f : f14;
            if (!Float.isNaN(f14)) {
                setProgress(f14);
            } else {
                w6.a.a();
                n(0.0f);
            }
        }
    }

    public void setTransitionDuration(int i14) {
        s sVar = this.f182919a;
        if (sVar == null) {
            return;
        }
        s.b bVar = sVar.f183014c;
        if (bVar != null) {
            bVar.f183039h = Math.max(i14, 8);
        } else {
            sVar.f183021j = i14;
        }
    }

    public void setTransitionListener(i iVar) {
        this.f182949v = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.Z0 == null) {
            this.Z0 = new h();
        }
        h hVar = this.Z0;
        hVar.getClass();
        hVar.f182984a = bundle.getFloat("motion.progress");
        hVar.f182985b = bundle.getFloat("motion.velocity");
        hVar.f182986c = bundle.getInt("motion.StartState");
        hVar.f182987d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.Z0.a();
        }
    }

    public final boolean t(float f14, float f15, View view2, MotionEvent motionEvent) {
        boolean z14;
        boolean zOnTouchEvent;
        if (!(view2 instanceof ViewGroup)) {
            z14 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z14 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (t((childAt.getLeft() + f14) - view2.getScrollX(), (childAt.getTop() + f15) - view2.getScrollY(), childAt, motionEvent)) {
                z14 = true;
                break;
            }
            childCount--;
        }
        if (!z14) {
            float right = (view2.getRight() + f14) - view2.getLeft();
            float bottom = (view2.getBottom() + f15) - view2.getTop();
            RectF rectF = this.f182932g1;
            rectF.set(f14, f15, right, bottom);
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f16 = -f14;
                float f17 = -f15;
                Matrix matrix = view2.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f16, f17);
                    zOnTouchEvent = view2.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f16, -f17);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f16, f17);
                    if (this.f182936i1 == null) {
                        this.f182936i1 = new Matrix();
                    }
                    matrix.invert(this.f182936i1);
                    motionEventObtain.transform(this.f182936i1);
                    zOnTouchEvent = view2.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z14;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return w6.a.b(this.f182927e, context) + "->" + w6.a.b(this.f182931g, context) + " (pos:" + this.f182944o + " Dpos/Dt:" + this.f182925d;
    }

    public final void u(AttributeSet attributeSet) {
        s sVar;
        s sVar2;
        f182918k1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f6323o);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z14 = true;
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 2) {
                    this.f182919a = new s(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f182929f = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f182946q = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f182948t = true;
                } else if (index == 0) {
                    z14 = typedArrayObtainStyledAttributes.getBoolean(index, z14);
                } else if (index == 5) {
                    if (this.f182950w == 0) {
                        this.f182950w = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f182950w = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z14) {
                this.f182919a = null;
            }
        }
        if (this.f182950w != 0 && (sVar2 = this.f182919a) != null) {
            int iG = sVar2.g();
            s sVar3 = this.f182919a;
            androidx.constraintlayout.widget.d dVarB = sVar3.b(sVar3.g());
            w6.a.b(iG, getContext());
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (dVarB.l(childAt.getId()) == null) {
                    w6.a.c(childAt);
                }
            }
            Integer[] numArr = (Integer[]) dVarB.f6198g.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i16 = 0; i16 < length; i16++) {
                iArr[i16] = numArr[i16].intValue();
            }
            for (int i17 = 0; i17 < length; i17++) {
                int i18 = iArr[i17];
                w6.a.b(i18, getContext());
                findViewById(iArr[i17]);
                int i19 = dVarB.k(i18).f6203e.f6226d;
                int i24 = dVarB.k(i18).f6203e.f6224c;
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            for (s.b bVar : this.f182919a.f183015d) {
                s.b bVar2 = this.f182919a.f183014c;
                int i25 = bVar.f183035d;
                int i26 = bVar.f183034c;
                w6.a.b(i25, getContext());
                w6.a.b(i26, getContext());
                sparseIntArray.get(i25);
                sparseIntArray2.get(i26);
                sparseIntArray.put(i25, i26);
                sparseIntArray2.put(i26, i25);
                this.f182919a.b(i25);
                this.f182919a.b(i26);
            }
        }
        if (this.f182929f != -1 || (sVar = this.f182919a) == null) {
            return;
        }
        this.f182929f = sVar.g();
        this.f182927e = this.f182919a.g();
        s.b bVar3 = this.f182919a.f183014c;
        this.f182931g = bVar3 != null ? bVar3.f183034c : -1;
    }

    public final void v() {
        s.b bVar;
        w wVar;
        View viewFindViewById;
        View viewFindViewById2;
        s sVar = this.f182919a;
        if (sVar == null) {
            return;
        }
        if (sVar.a(this.f182929f, this)) {
            requestLayout();
            return;
        }
        int i14 = this.f182929f;
        View viewFindViewById3 = null;
        if (i14 != -1) {
            s sVar2 = this.f182919a;
            ArrayList<s.b> arrayList = sVar2.f183017f;
            ArrayList<s.b> arrayList2 = sVar2.f183015d;
            for (s.b bVar2 : arrayList2) {
                if (bVar2.f183044m.size() > 0) {
                    Iterator<s.b.a> it = bVar2.f183044m.iterator();
                    while (it.hasNext()) {
                        int i15 = it.next().f183051b;
                        if (i15 != -1 && (viewFindViewById2 = findViewById(i15)) != null) {
                            viewFindViewById2.setOnClickListener(null);
                        }
                    }
                }
            }
            for (s.b bVar3 : arrayList) {
                if (bVar3.f183044m.size() > 0) {
                    Iterator<s.b.a> it3 = bVar3.f183044m.iterator();
                    while (it3.hasNext()) {
                        int i16 = it3.next().f183051b;
                        if (i16 != -1 && (viewFindViewById = findViewById(i16)) != null) {
                            viewFindViewById.setOnClickListener(null);
                        }
                    }
                }
            }
            for (s.b bVar4 : arrayList2) {
                if (bVar4.f183044m.size() > 0) {
                    Iterator<s.b.a> it4 = bVar4.f183044m.iterator();
                    while (it4.hasNext()) {
                        it4.next().a(this, i14, bVar4);
                    }
                }
            }
            for (s.b bVar5 : arrayList) {
                if (bVar5.f183044m.size() > 0) {
                    Iterator<s.b.a> it5 = bVar5.f183044m.iterator();
                    while (it5.hasNext()) {
                        it5.next().a(this, i14, bVar5);
                    }
                }
            }
        }
        if (!this.f182919a.o() || (bVar = this.f182919a.f183014c) == null || (wVar = bVar.f183043l) == null) {
            return;
        }
        q qVar = wVar.f183070r;
        int i17 = wVar.f183056d;
        if (i17 != -1 && (viewFindViewById3 = qVar.findViewById(i17)) == null) {
            w6.a.b(wVar.f183056d, qVar.getContext());
        }
        if (viewFindViewById3 instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById3;
            nestedScrollView.setOnTouchListener(new u(wVar));
            nestedScrollView.setOnScrollChangeListener(new v(wVar));
        }
    }

    public final void w() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if (this.f182949v == null && ((copyOnWriteArrayList = this.J0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.f182938j1;
        for (Integer num : arrayList) {
            if (this.f182949v != null) {
                num.getClass();
            }
            CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.J0;
            if (copyOnWriteArrayList2 != null) {
                for (i iVar : copyOnWriteArrayList2) {
                    num.getClass();
                    iVar.getClass();
                }
            }
        }
        arrayList.clear();
    }

    public final void x() {
        this.f182928e1.f();
        invalidate();
    }

    public final void y(int i14, int i15) {
        if (!isAttachedToWindow()) {
            if (this.Z0 == null) {
                this.Z0 = new h();
            }
            h hVar = this.Z0;
            hVar.f182986c = i14;
            hVar.f182987d = i15;
            return;
        }
        s sVar = this.f182919a;
        if (sVar != null) {
            this.f182927e = i14;
            this.f182931g = i15;
            sVar.n(i14, i15);
            this.f182928e1.e(this.f182919a.b(i14), this.f182919a.b(i15));
            x();
            this.f182944o = 0.0f;
            n(0.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    public final void z(float f14, float f15, int i14) {
        float f16;
        w wVar;
        w wVar2;
        w wVar3;
        w wVar4;
        w wVar5;
        w wVar6;
        w wVar7;
        s.b bVar;
        float f17;
        w wVar8;
        float f18 = f14;
        if (this.f182919a == null || this.f182944o == f18) {
            return;
        }
        this.f182952y = true;
        this.f182941l = getNanoTime();
        s sVar = this.f182919a;
        s.b bVar2 = sVar.f183014c;
        float f19 = (bVar2 != null ? bVar2.f183039h : sVar.f183021j) / 1000.0f;
        this.f182942m = f19;
        this.f182946q = f18;
        this.f182948t = true;
        v6.b bVar3 = this.f182953z;
        float f22 = 0.0f;
        if (i14 != 0 && i14 != 1 && i14 != 2) {
            f16 = 1.0f;
            d dVar = this.A;
            if (i14 == 4) {
                float f24 = this.f182944o;
                float f25 = sVar.f();
                dVar.f182957a = f15;
                dVar.f182958b = f24;
                dVar.f182959c = f25;
                this.f182921b = dVar;
            } else if (i14 == 5) {
                float f26 = this.f182944o;
                float f27 = sVar.f();
                if (f15 > 0.0f) {
                    float f28 = f15 / f27;
                    if (((f15 * f28) - (((f27 * f28) * f28) / 2.0f)) + f26 > 1.0f) {
                        float f29 = this.f182944o;
                        float f34 = this.f182919a.f();
                        dVar.f182957a = f15;
                        dVar.f182958b = f29;
                        dVar.f182959c = f34;
                        this.f182921b = dVar;
                    } else {
                        float f35 = this.f182944o;
                        float f36 = this.f182942m;
                        float f37 = this.f182919a.f();
                        bVar = this.f182919a.f183014c;
                        if (bVar != null || (wVar8 = bVar.f183043l) == null) {
                            f17 = 0.0f;
                        } else {
                            f17 = wVar8.f183071s;
                        }
                        this.f182953z.b(f35, f18, f15, f36, f37, f17);
                        this.f182925d = 0.0f;
                        int i15 = this.f182929f;
                        this.f182946q = f18;
                        this.f182929f = i15;
                        this.f182921b = bVar3;
                    }
                } else {
                    float f38 = (-f15) / f27;
                    if ((((f27 * f38) * f38) / 2.0f) + (f15 * f38) + f26 < 0.0f) {
                        float f210 = this.f182944o;
                        float f39 = this.f182919a.f();
                        dVar.f182957a = f15;
                        dVar.f182958b = f210;
                        dVar.f182959c = f39;
                        this.f182921b = dVar;
                    } else {
                        float f310 = this.f182944o;
                        float f311 = this.f182942m;
                        float f312 = this.f182919a.f();
                        bVar = this.f182919a.f183014c;
                        if (bVar != null) {
                            f17 = 0.0f;
                        } else {
                            f17 = 0.0f;
                        }
                        this.f182953z.b(f310, f18, f15, f311, f312, f17);
                        this.f182925d = 0.0f;
                        int i16 = this.f182929f;
                        this.f182946q = f18;
                        this.f182929f = i16;
                        this.f182921b = bVar3;
                    }
                }
            } else if (i14 == 6 || i14 == 7) {
            }
            this.f182947r = false;
            this.f182941l = getNanoTime();
            invalidate();
        }
        f16 = 1.0f;
        if (i14 == 1 || i14 == 7) {
            f18 = 0.0f;
        } else if (i14 == 2 || i14 == 6) {
            f18 = f16;
        }
        int i17 = (bVar2 == null || (wVar7 = bVar2.f183043l) == null) ? 0 : wVar7.D;
        float f44 = this.f182944o;
        int i18 = i17;
        v6.b bVar4 = this.f182953z;
        if (i18 == 0) {
            float f45 = sVar.f();
            s.b bVar5 = this.f182919a.f183014c;
            if (bVar5 != null && (wVar6 = bVar5.f183043l) != null) {
                f22 = wVar6.f183071s;
            }
            bVar4.b(f44, f18, f15, f19, f45, f22);
        } else {
            float f46 = (bVar2 == null || (wVar5 = bVar2.f183043l) == null) ? 0.0f : wVar5.f183078z;
            float f47 = (bVar2 == null || (wVar4 = bVar2.f183043l) == null) ? 0.0f : wVar4.A;
            float f48 = (bVar2 == null || (wVar3 = bVar2.f183043l) == null) ? 0.0f : wVar3.f183077y;
            float f49 = (bVar2 == null || (wVar2 = bVar2.f183043l) == null) ? 0.0f : wVar2.B;
            int i19 = (bVar2 == null || (wVar = bVar2.f183043l) == null) ? 0 : wVar.C;
            if (bVar4.f175779b == null) {
                bVar4.f175779b = new o6.l();
            }
            o6.l lVar = bVar4.f175779b;
            bVar4.f175780c = lVar;
            lVar.f129510c = f18;
            lVar.f129508a = f48;
            lVar.f129512e = f44;
            lVar.f129509b = f47;
            lVar.f129514g = f46;
            lVar.f129515h = f49;
            lVar.f129516i = i19;
            lVar.f129511d = 0.0f;
        }
        int i24 = this.f182929f;
        this.f182946q = f18;
        this.f182929f = i24;
        this.f182921b = bVar3;
        this.f182947r = false;
        this.f182941l = getNanoTime();
        invalidate();
    }

    @Override // androidx.core.view.w
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i14, int i15, int i16) {
        setState(j.SETUP);
        this.f182929f = i14;
        this.f182927e = -1;
        this.f182931g = -1;
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.b(i15, i16, i14);
            return;
        }
        s sVar = this.f182919a;
        if (sVar != null) {
            sVar.b(i14).b(this);
        }
    }

    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f182923c = null;
        this.f182925d = 0.0f;
        this.f182927e = -1;
        this.f182929f = -1;
        this.f182931g = -1;
        this.f182933h = 0;
        this.f182935i = 0;
        this.f182937j = true;
        this.f182939k = new HashMap<>();
        this.f182941l = 0L;
        this.f182942m = 1.0f;
        this.f182943n = 0.0f;
        this.f182944o = 0.0f;
        this.f182946q = 0.0f;
        this.f182948t = false;
        this.f182950w = 0;
        this.f182952y = false;
        this.f182953z = new v6.b();
        this.A = new d();
        this.E = false;
        this.f182940k0 = false;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = 0;
        this.L0 = -1L;
        this.M0 = 0.0f;
        this.N0 = 0;
        this.O0 = 0.0f;
        this.P0 = false;
        this.X0 = new o6.d();
        this.Y0 = false;
        this.f182920a1 = null;
        new HashMap();
        this.f182922b1 = new Rect();
        this.f182924c1 = false;
        this.f182926d1 = j.UNDEFINED;
        this.f182928e1 = new f();
        this.f182930f1 = false;
        this.f182932g1 = new RectF();
        this.f182934h1 = null;
        this.f182936i1 = null;
        this.f182938j1 = new ArrayList<>();
        u(attributeSet);
    }

    public void setTransition(s.b bVar) {
        w wVar;
        s sVar = this.f182919a;
        sVar.f183014c = bVar;
        if (bVar != null && (wVar = bVar.f183043l) != null) {
            wVar.c(sVar.f183027p);
        }
        setState(j.SETUP);
        int i14 = this.f182929f;
        s.b bVar2 = this.f182919a.f183014c;
        if (i14 == (bVar2 == null ? -1 : bVar2.f183034c)) {
            this.f182944o = 1.0f;
            this.f182943n = 1.0f;
            this.f182946q = 1.0f;
        } else {
            this.f182944o = 0.0f;
            this.f182943n = 0.0f;
            this.f182946q = 0.0f;
        }
        this.f182945p = (bVar.f183049r & 1) != 0 ? -1L : getNanoTime();
        int iG = this.f182919a.g();
        s sVar2 = this.f182919a;
        s.b bVar3 = sVar2.f183014c;
        int i15 = bVar3 != null ? bVar3.f183034c : -1;
        if (iG == this.f182927e && i15 == this.f182931g) {
            return;
        }
        this.f182927e = iG;
        this.f182931g = i15;
        sVar2.n(iG, i15);
        androidx.constraintlayout.widget.d dVarB = this.f182919a.b(this.f182927e);
        androidx.constraintlayout.widget.d dVarB2 = this.f182919a.b(this.f182931g);
        f fVar = this.f182928e1;
        fVar.e(dVarB, dVarB2);
        int i16 = this.f182927e;
        int i17 = this.f182931g;
        fVar.f182979e = i16;
        fVar.f182980f = i17;
        fVar.f();
        x();
    }

    public q(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f182923c = null;
        this.f182925d = 0.0f;
        this.f182927e = -1;
        this.f182929f = -1;
        this.f182931g = -1;
        this.f182933h = 0;
        this.f182935i = 0;
        this.f182937j = true;
        this.f182939k = new HashMap<>();
        this.f182941l = 0L;
        this.f182942m = 1.0f;
        this.f182943n = 0.0f;
        this.f182944o = 0.0f;
        this.f182946q = 0.0f;
        this.f182948t = false;
        this.f182950w = 0;
        this.f182952y = false;
        this.f182953z = new v6.b();
        this.A = new d();
        this.E = false;
        this.f182940k0 = false;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = 0;
        this.L0 = -1L;
        this.M0 = 0.0f;
        this.N0 = 0;
        this.O0 = 0.0f;
        this.P0 = false;
        this.X0 = new o6.d();
        this.Y0 = false;
        this.f182920a1 = null;
        new HashMap();
        this.f182922b1 = new Rect();
        this.f182924c1 = false;
        this.f182926d1 = j.UNDEFINED;
        this.f182928e1 = new f();
        this.f182930f1 = false;
        this.f182932g1 = new RectF();
        this.f182934h1 = null;
        this.f182936i1 = null;
        this.f182938j1 = new ArrayList<>();
        u(attributeSet);
    }
}
