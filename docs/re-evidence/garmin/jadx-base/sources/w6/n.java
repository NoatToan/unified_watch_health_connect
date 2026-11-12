package w6;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.common.base.Ascii;
import i3.e5;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class n {
    public k[] A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f182889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f182890c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o6.b[] f182897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o6.a f182898k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f182902o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f182903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f182904q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f182905r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f182906s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap<String, v6.e> f182911x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap<String, v6.d> f182912y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashMap<String, v6.c> f182913z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f182888a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f182891d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f182892e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f182893f = new r();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f182894g = new r();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f182895h = new l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f182896i = new l();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f182899l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f182900m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f182901n = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f182907t = new float[4];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList<r> f182908u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f182909v = new float[1];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList<d> f182910w = new ArrayList<>();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public n(View view2) {
        this.f182889b = view2;
        this.f182890c = view2.getId();
        view2.getLayoutParams();
    }

    public static void e(Rect rect, Rect rect2, int i14, int i15, int i16) {
        if (i14 == 1) {
            int i17 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i16 - ((rect.height() + i17) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i14 == 2) {
            int i18 = rect.left + rect.right;
            rect2.left = i15 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i18 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i14 == 3) {
            int i19 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i19 / 2);
            rect2.top = i16 - ((rect.height() + i19) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i14 != 4) {
            return;
        }
        int i24 = rect.left + rect.right;
        rect2.left = i15 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i24 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float f14, float[] fArr) {
        float f15 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f16 = this.f182901n;
            if (f16 != 1.0d) {
                float f17 = this.f182900m;
                if (f14 < f17) {
                    f14 = 0.0f;
                }
                if (f14 > f17 && f14 < 1.0d) {
                    f14 = Math.min((f14 - f17) * f16, 1.0f);
                }
            }
        }
        o6.c cVar = this.f182893f.f182995a;
        float f18 = Float.NaN;
        for (r rVar : this.f182908u) {
            o6.c cVar2 = rVar.f182995a;
            if (cVar2 != null) {
                float f19 = rVar.f182997c;
                if (f19 < f14) {
                    cVar = cVar2;
                    f15 = f19;
                } else if (Float.isNaN(f18)) {
                    f18 = rVar.f182997c;
                }
            }
        }
        if (cVar != null) {
            float f22 = (Float.isNaN(f18) ? 1.0f : f18) - f15;
            double d14 = (f14 - f15) / f22;
            f14 = (((float) cVar.a(d14)) * f22) + f15;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d14);
            }
        }
        return f14;
    }

    public final void b(double d14, float[] fArr, float[] fArr2) {
        float f14;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f182897j[0].c(d14, dArr);
        this.f182897j[0].e(d14, dArr2);
        float f15 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f182902o;
        r rVar = this.f182893f;
        float f16 = rVar.f182999e;
        float f17 = rVar.f183000f;
        float f18 = rVar.f183001g;
        float f19 = rVar.f183002h;
        float f22 = 0.0f;
        float f24 = 0.0f;
        float f25 = 0.0f;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            float f26 = (float) dArr[i14];
            float f27 = (float) dArr2[i14];
            int i15 = iArr[i14];
            if (i15 == 1) {
                f16 = f26;
                f15 = f27;
            } else if (i15 == 2) {
                f17 = f26;
                f25 = f27;
            } else if (i15 == 3) {
                f18 = f26;
                f22 = f27;
            } else if (i15 == 4) {
                f19 = f26;
                f24 = f27;
            }
        }
        float fCos = (f22 / 2.0f) + f15;
        float fSin = (f24 / 2.0f) + f25;
        n nVar = rVar.f183007m;
        if (nVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            nVar.b(d14, fArr3, fArr4);
            float f28 = fArr3[0];
            float f29 = fArr3[1];
            float f34 = fArr4[0];
            float f35 = fArr4[1];
            double d15 = f16;
            double d16 = f17;
            float fSin2 = (float) (((Math.sin(d16) * d15) + ((double) f28)) - ((double) (f18 / 2.0f)));
            float fCos2 = (float) ((((double) f29) - (Math.cos(d16) * d15)) - ((double) (f19 / 2.0f)));
            double d17 = f15;
            double d18 = f25;
            f14 = 2.0f;
            f17 = fCos2;
            fCos = (float) ((Math.cos(d16) * d18) + (Math.sin(d16) * d17) + ((double) f34));
            fSin = (float) ((Math.sin(d16) * d18) + (((double) f35) - (Math.cos(d16) * d17)));
            f16 = fSin2;
        } else {
            f14 = 2.0f;
        }
        fArr[0] = (f18 / f14) + f16 + 0.0f;
        fArr[1] = (f19 / f14) + f17 + 0.0f;
        fArr2[0] = fCos;
        fArr2[1] = fSin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(float f14, long j8, View view2, o6.d dVar) {
        boolean zE;
        boolean z14;
        float f15;
        boolean z15;
        double d14;
        float f16;
        float f17;
        float f18;
        float fSin;
        float f19;
        v6.e.d dVar2 = null;
        float fA = a(f14, null);
        int i14 = this.E;
        if (i14 != -1) {
            float f22 = 1.0f / i14;
            float fFloor = ((float) Math.floor(fA / f22)) * f22;
            float f24 = (fA % f22) / f22;
            if (!Float.isNaN(this.F)) {
                f24 = (f24 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            fA = ((interpolator != null ? interpolator.getInterpolation(f24) : ((double) f24) > 0.5d ? 1.0f : 0.0f) * f22) + fFloor;
        }
        HashMap<String, v6.d> map = this.f182912y;
        if (map != null) {
            Iterator<v6.d> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().d(fA, view2);
            }
        }
        HashMap<String, v6.e> map2 = this.f182911x;
        if (map2 != null) {
            v6.e.d dVar3 = null;
            zE = false;
            for (v6.e eVar : map2.values()) {
                if (eVar instanceof v6.e.d) {
                    dVar3 = (v6.e.d) eVar;
                } else {
                    zE |= eVar.e(fA, j8, view2, dVar);
                }
            }
            dVar2 = dVar3;
        } else {
            zE = false;
        }
        o6.b[] bVarArr = this.f182897j;
        r rVar = this.f182893f;
        if (bVarArr != null) {
            double d15 = fA;
            bVarArr[0].c(d15, this.f182903p);
            this.f182897j[0].e(d15, this.f182904q);
            o6.a aVar = this.f182898k;
            if (aVar != null) {
                double[] dArr = this.f182903p;
                f15 = 0.0f;
                if (dArr.length > 0) {
                    aVar.c(d15, dArr);
                    this.f182898k.e(d15, this.f182904q);
                }
            } else {
                f15 = 0.0f;
            }
            if (this.H) {
                z15 = zE;
                d14 = d15;
                f16 = 2.0f;
            } else {
                int[] iArr = this.f182902o;
                double[] dArr2 = this.f182903p;
                f16 = 2.0f;
                double[] dArr3 = this.f182904q;
                boolean z16 = this.f182891d;
                float f25 = rVar.f182999e;
                float fCos = rVar.f183000f;
                float f26 = rVar.f183001g;
                int i15 = 1;
                float f27 = rVar.f183002h;
                if (iArr.length != 0) {
                    f17 = f26;
                    if (rVar.f183010p.length <= iArr[iArr.length - 1]) {
                        int i16 = iArr[iArr.length - 1] + 1;
                        rVar.f183010p = new double[i16];
                        rVar.f183011q = new double[i16];
                    }
                } else {
                    f17 = f26;
                }
                Arrays.fill(rVar.f183010p, Double.NaN);
                for (int i17 = 0; i17 < iArr.length; i17++) {
                    double[] dArr4 = rVar.f183010p;
                    int i18 = iArr[i17];
                    dArr4[i18] = dArr2[i17];
                    rVar.f183011q[i18] = dArr3[i17];
                }
                float f28 = Float.NaN;
                float f29 = f15;
                float f34 = f29;
                float f35 = f34;
                float f36 = f35;
                int i19 = 0;
                while (true) {
                    double[] dArr5 = rVar.f183010p;
                    f18 = f27;
                    if (i19 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i19])) {
                        f19 = f25;
                    } else {
                        f19 = f25;
                        float f37 = (float) (Double.isNaN(rVar.f183010p[i19]) ? 0.0d : rVar.f183010p[i19] + 0.0d);
                        float f38 = (float) rVar.f183011q[i19];
                        if (i19 == i15) {
                            f34 = f38;
                            f27 = f18;
                            f25 = f37;
                        } else if (i19 == 2) {
                            f29 = f38;
                            f25 = f19;
                            f27 = f18;
                            fCos = f37;
                        } else if (i19 == 3) {
                            f35 = f38;
                            f25 = f19;
                            f27 = f18;
                            f17 = f37;
                        } else if (i19 == 4) {
                            f36 = f38;
                            f25 = f19;
                            f27 = f37;
                        } else if (i19 == 5) {
                            f25 = f19;
                            f27 = f18;
                            f28 = f37;
                        }
                        i19++;
                        i15 = 1;
                    }
                    f25 = f19;
                    f27 = f18;
                    i19++;
                    i15 = 1;
                }
                float f39 = f25;
                n nVar = rVar.f183007m;
                if (nVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    nVar.b(d15, fArr, fArr2);
                    float f44 = fArr[0];
                    float f45 = fArr[1];
                    float f46 = fArr2[0];
                    float f47 = fArr2[1];
                    z15 = zE;
                    d14 = d15;
                    double d16 = f39;
                    double d17 = fCos;
                    fSin = (float) (((Math.sin(d17) * d16) + ((double) f44)) - ((double) (f17 / 2.0f)));
                    fCos = (float) ((((double) f45) - (Math.cos(d17) * d16)) - ((double) (f18 / 2.0f)));
                    double d18 = f34;
                    double d19 = f29;
                    float fCos2 = (float) ((Math.cos(d17) * d16 * d19) + (Math.sin(d17) * d18) + ((double) f46));
                    float fSin2 = (float) ((Math.sin(d17) * d16 * d19) + (((double) f47) - (Math.cos(d17) * d18)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f28)) {
                        view2.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f28)));
                    }
                } else {
                    fSin = f39;
                    z15 = zE;
                    d14 = d15;
                    if (!Float.isNaN(f28)) {
                        view2.setRotation(f28 + ((float) Math.toDegrees(Math.atan2((f36 / 2.0f) + f29, (f35 / 2.0f) + f34))) + f15);
                    }
                }
                float f48 = fSin;
                if (view2 instanceof c) {
                    ((c) view2).a();
                } else {
                    float f49 = f48 + 0.5f;
                    int i24 = (int) f49;
                    float f50 = fCos + 0.5f;
                    int i25 = (int) f50;
                    int i26 = (int) (f49 + f17);
                    int i27 = (int) (f50 + f18);
                    int i28 = i26 - i24;
                    int i29 = i27 - i25;
                    if (i28 != view2.getMeasuredWidth() || i29 != view2.getMeasuredHeight() || z16) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i28, 1073741824), View.MeasureSpec.makeMeasureSpec(i29, 1073741824));
                    }
                    view2.layout(i24, i25, i26, i27);
                }
                this.f182891d = false;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view2.getParent()).findViewById(this.C);
                }
                View view3 = this.D;
                if (view3 != null) {
                    float bottom = (this.D.getBottom() + view3.getTop()) / f16;
                    float right = (this.D.getRight() + this.D.getLeft()) / f16;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        float left = right - view2.getLeft();
                        float top = bottom - view2.getTop();
                        view2.setPivotX(left);
                        view2.setPivotY(top);
                    }
                }
            }
            HashMap<String, v6.d> map3 = this.f182912y;
            if (map3 != null) {
                for (v6.d dVar4 : map3.values()) {
                    if (dVar4 instanceof v6.d.C3281d) {
                        double[] dArr6 = this.f182904q;
                        if (dArr6.length > 1) {
                            view2.setRotation(((v6.d.C3281d) dVar4).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (dVar2 != 0) {
                double[] dArr7 = this.f182904q;
                double d24 = dArr7[0];
                double d25 = dArr7[1];
                v6.e.d dVar5 = dVar2;
                view2.setRotation(dVar5.d(fA, j8, view2, dVar) + ((float) Math.toDegrees(Math.atan2(d25, d24))));
                z14 = z15 | dVar5.f129539h;
            } else {
                z14 = z15;
            }
            int i30 = 1;
            while (true) {
                o6.b[] bVarArr2 = this.f182897j;
                if (i30 >= bVarArr2.length) {
                    break;
                }
                o6.b bVar = bVarArr2[i30];
                float[] fArr3 = this.f182907t;
                bVar.d(d14, fArr3);
                v6.a.b(rVar.f183008n.get(this.f182905r[i30 - 1]), view2, fArr3);
                i30++;
            }
            l lVar = this.f182895h;
            if (lVar.f182871b == 0) {
                if (fA <= f15) {
                    view2.setVisibility(lVar.f182872c);
                } else {
                    l lVar2 = this.f182896i;
                    if (fA >= 1065353216) {
                        view2.setVisibility(lVar2.f182872c);
                    } else if (lVar2.f182872c != lVar.f182872c) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i34 = 0;
                while (true) {
                    k[] kVarArr = this.A;
                    if (i34 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i34].f(fA, view2);
                    i34++;
                }
            }
        } else {
            boolean z17 = zE;
            float f54 = rVar.f182999e;
            r rVar2 = this.f182894g;
            float fA2 = j20.x.a(rVar2.f182999e, f54, fA, f54);
            float f55 = rVar.f183000f;
            float fA3 = j20.x.a(rVar2.f183000f, f55, fA, f55);
            float f56 = rVar.f183001g;
            float f57 = rVar2.f183001g;
            float fA4 = j20.x.a(f57, f56, fA, f56);
            float f58 = rVar.f183002h;
            float f59 = rVar2.f183002h;
            float f64 = fA2 + 0.5f;
            int i35 = (int) f64;
            float f65 = fA3 + 0.5f;
            int i36 = (int) f65;
            int i37 = (int) (f64 + fA4);
            int iA = (int) (f65 + j20.x.a(f59, f58, fA, f58));
            int i38 = i37 - i35;
            int i39 = iA - i36;
            if (f57 != f56 || f59 != f58 || this.f182891d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i38, 1073741824), View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                this.f182891d = false;
            }
            view2.layout(i35, i36, i37, iA);
            z14 = z17;
        }
        HashMap<String, v6.c> map4 = this.f182913z;
        if (map4 != null) {
            for (v6.c cVar : map4.values()) {
                if (cVar instanceof v6.c.d) {
                    double[] dArr8 = this.f182904q;
                    view2.setRotation(((v6.c.d) cVar).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    cVar.d(fA, view2);
                }
            }
        }
        return z14;
    }

    public final void d(r rVar) {
        rVar.d((int) this.f182889b.getX(), (int) this.f182889b.getY(), this.f182889b.getWidth(), this.f182889b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x025d  */
    /* JADX WARN: Code duplicated, block: B:455:0x092e  */
    /* JADX WARN: Code duplicated, block: B:456:0x0932 A[PHI: r1 r4
      0x0932: PHI (r1v164 java.lang.Object) = (r1v153 java.lang.Object), (r1v154 java.lang.Object), (r1v165 java.lang.Object) binds: [B:503:0x09d2, B:499:0x09c3, B:455:0x092e] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r4v91 java.lang.Object) = (r4v79 java.lang.Object), (r4v80 java.lang.Object), (r4v92 java.lang.Object) binds: [B:503:0x09d2, B:499:0x09c3, B:455:0x092e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:672:0x0fb8  */
    /* JADX WARN: Code duplicated, block: B:673:0x0fca A[PHI: r1 r2 r5 r6 r7 r9 r14 r15 r53
      0x0fca: PHI (r1v85 java.lang.Object) = 
      (r1v72 java.lang.Object)
      (r1v73 java.lang.Object)
      (r1v74 java.lang.Object)
      (r1v75 java.lang.Object)
      (r1v76 java.lang.Object)
      (r1v77 java.lang.Object)
      (r1v79 java.lang.Object)
      (r1v86 java.lang.Object)
     binds: [B:728:0x1132, B:724:0x1115, B:720:0x10f8, B:717:0x10d9, B:713:0x10b5, B:709:0x108f, B:705:0x1073, B:672:0x0fb8] A[DONT_GENERATE, DONT_INLINE]
      0x0fca: PHI (r2v66 java.lang.Object) = 
      (r2v54 java.lang.Object)
      (r2v55 java.lang.Object)
      (r2v56 java.lang.Object)
      (r2v57 java.lang.Object)
      (r2v58 java.lang.Object)
      (r2v59 java.lang.Object)
      (r2v61 java.lang.Object)
      (r2v67 java.lang.Object)
     binds: [B:728:0x1132, B:724:0x1115, B:720:0x10f8, B:717:0x10d9, B:713:0x10b5, B:709:0x108f, B:705:0x1073, B:672:0x0fb8] A[DONT_GENERATE, DONT_INLINE]
      0x0fca: PHI (r5v46 java.lang.String) = 
      (r5v20 java.lang.String)
      (r5v21 java.lang.String)
      (r5v22 java.lang.String)
      (r5v23 java.lang.String)
      (r5v24 java.lang.String)
      (r5v25 java.lang.String)
      (r5v27 java.lang.String)
      (r5v47 java.lang.String)
     binds: [B:728:0x1132, B:724:0x1115, B:720:0x10f8, B:717:0x10d9, B:713:0x10b5, B:709:0x108f, B:705:0x1073, B:672:0x0fb8] A[DONT_GENERATE, DONT_INLINE]
      0x0fca: PHI (r6v40 java.lang.String) = 
      (r6v26 java.lang.String)
      (r6v27 java.lang.String)
      (r6v28 java.lang.String)
      (r6v29 java.lang.String)
      (r6v30 java.lang.String)
      (r6v31 java.lang.String)
      (r6v33 java.lang.String)
      (r6v41 java.lang.String)
     binds: [B:728:0x1132, B:724:0x1115, B:720:0x10f8, B:717:0x10d9, B:713:0x10b5, B:709:0x108f, B:705:0x1073, B:672:0x0fb8] A[DONT_GENERATE, DONT_INLINE]
      0x0fca: PHI (r7v23 java.lang.String) = 
      (r7v10 java.lang.String)
      (r7v11 java.lang.String)
      (r7v12 java.lang.String)
      (r7v13 java.lang.String)
      (r7v14 java.lang.String)
      (r7v15 java.lang.String)
      (r7v18 java.lang.String)
      (r7v24 java.lang.String)
     binds: [B:728:0x1132, B:724:0x1115, B:720:0x10f8, B:717:0x10d9, B:713:0x10b5, B:709:0x108f, B:705:0x1073, B:672:0x0fb8] A[DONT_GENERATE, DONT_INLINE]
      0x0fca: PHI (r9v26 java.lang.String) = 
      (r9v11 java.lang.String)
      (r9v12 java.lang.String)
      (r9v13 java.lang.String)
      (r9v14 java.lang.String)
      (r9v15 java.lang.String)
      (r9v18 java.lang.String)
      (r9v20 java.lang.String)
      (r9v27 java.lang.String)
     binds: [B:728:0x1132, B:724:0x1115, B:720:0x10f8, B:717:0x10d9, B:713:0x10b5, B:709:0x108f, B:705:0x1073, B:672:0x0fb8] A[DONT_GENERATE, DONT_INLINE]
      0x0fca: PHI (r14v25 java.lang.String) = 
      (r14v9 java.lang.String)
      (r14v10 java.lang.String)
      (r14v11 java.lang.String)
      (r14v12 java.lang.String)
      (r14v15 java.lang.String)
      (r14v17 java.lang.String)
      (r14v19 java.lang.String)
      (r14v26 java.lang.String)
     binds: [B:728:0x1132, B:724:0x1115, B:720:0x10f8, B:717:0x10d9, B:713:0x10b5, B:709:0x108f, B:705:0x1073, B:672:0x0fb8] A[DONT_GENERATE, DONT_INLINE]
      0x0fca: PHI (r15v38 java.lang.Object) = 
      (r15v21 java.lang.Object)
      (r15v22 java.lang.Object)
      (r15v23 java.lang.Object)
      (r15v26 java.lang.Object)
      (r15v28 java.lang.Object)
      (r15v30 java.lang.Object)
      (r15v32 java.lang.Object)
      (r15v39 java.lang.Object)
     binds: [B:728:0x1132, B:724:0x1115, B:720:0x10f8, B:717:0x10d9, B:713:0x10b5, B:709:0x108f, B:705:0x1073, B:672:0x0fb8] A[DONT_GENERATE, DONT_INLINE]
      0x0fca: PHI (r53v16 java.util.Iterator<java.lang.String>) = 
      (r53v4 java.util.Iterator<java.lang.String>)
      (r53v5 java.util.Iterator<java.lang.String>)
      (r53v6 java.util.Iterator<java.lang.String>)
      (r53v7 java.util.Iterator<java.lang.String>)
      (r53v8 java.util.Iterator<java.lang.String>)
      (r53v9 java.util.Iterator<java.lang.String>)
      (r53v11 java.util.Iterator<java.lang.String>)
      (r53v17 java.util.Iterator<java.lang.String>)
     binds: [B:728:0x1132, B:724:0x1115, B:720:0x10f8, B:717:0x10d9, B:713:0x10b5, B:709:0x108f, B:705:0x1073, B:672:0x0fb8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:812:0x1395  */
    /* JADX WARN: Code duplicated, block: B:931:0x085a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:932:0x084d A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:415:0x07f6. Please report as an issue. */
    public final void f(int i14, int i15, long j8) {
        String str;
        ArrayList arrayList;
        HashSet<String> hashSet;
        ArrayList<r> arrayList2;
        String str2;
        Object obj;
        Object obj2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object obj3;
        Object obj4;
        String str7;
        Object obj5;
        r[] rVarArr;
        Iterator<d> it;
        v6.c cVar;
        String str8;
        Object obj6;
        byte b14;
        byte b15;
        float f14;
        float f15;
        Object obj7;
        Object obj8;
        Object obj9;
        String str9;
        byte b16;
        byte b17;
        v6.c gVar;
        v6.c bVar;
        String str10;
        Object obj10;
        r rVar;
        float fHypot;
        double dA;
        char c14;
        String str11;
        int i16;
        androidx.constraintlayout.widget.a aVar;
        HashSet<String> hashSet2;
        Object obj11;
        byte b18;
        Iterator<String> it3;
        HashMap<String, Integer> map;
        String str12;
        Object obj12;
        byte b19;
        v6.e gVar2;
        androidx.constraintlayout.widget.a aVar2;
        Integer num;
        String str13;
        Object obj13;
        byte b24;
        HashSet<String> hashSet3;
        String str14;
        Object obj14;
        Object obj15;
        String str15;
        String str16;
        String str17;
        byte b25;
        byte b26;
        v6.d iVar;
        v6.d dVar;
        androidx.constraintlayout.widget.a aVar3;
        String str18;
        n nVar = this;
        new HashSet();
        HashSet<String> hashSet4 = new HashSet<>();
        HashSet<String> hashSet5 = new HashSet<>();
        HashSet<String> hashSet6 = new HashSet<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int i17 = nVar.B;
        r rVar2 = nVar.f182893f;
        if (i17 != -1) {
            rVar2.f183004j = i17;
        }
        l lVar = nVar.f182895h;
        float f16 = lVar.f182874e;
        l lVar2 = nVar.f182896i;
        if (l.c(f16, lVar2.f182874e)) {
            hashSet5.add("alpha");
        }
        if (l.c(lVar.f182875f, lVar2.f182875f)) {
            hashSet5.add("elevation");
        }
        int i18 = lVar.f182872c;
        int i19 = lVar2.f182872c;
        if (i18 != i19 && lVar.f182871b == 0 && (i18 == 0 || i19 == 0)) {
            hashSet5.add("alpha");
        }
        if (l.c(lVar.f182876g, lVar2.f182876g)) {
            hashSet5.add("rotation");
        }
        if (!Float.isNaN(lVar.f182885p) || !Float.isNaN(lVar2.f182885p)) {
            hashSet5.add("transitionPathRotate");
        }
        String str19 = "progress";
        if (!Float.isNaN(lVar.f182886q) || !Float.isNaN(lVar2.f182886q)) {
            hashSet5.add("progress");
        }
        if (l.c(lVar.f182877h, lVar2.f182877h)) {
            hashSet5.add("rotationX");
        }
        if (l.c(lVar.f182870a, lVar2.f182870a)) {
            hashSet5.add("rotationY");
        }
        r rVar3 = rVar2;
        if (l.c(lVar.f182880k, lVar2.f182880k)) {
            hashSet5.add("transformPivotX");
        }
        if (l.c(lVar.f182881l, lVar2.f182881l)) {
            hashSet5.add("transformPivotY");
        }
        String str20 = "scaleX";
        if (l.c(lVar.f182878i, lVar2.f182878i)) {
            hashSet5.add("scaleX");
        }
        Object obj16 = "rotationX";
        String str21 = "scaleY";
        if (l.c(lVar.f182879j, lVar2.f182879j)) {
            hashSet5.add("scaleY");
        }
        Object obj17 = "rotationY";
        if (l.c(lVar.f182882m, lVar2.f182882m)) {
            hashSet5.add("translationX");
        }
        Object obj18 = "translationX";
        String str22 = "translationY";
        if (l.c(lVar.f182883n, lVar2.f182883n)) {
            hashSet5.add("translationY");
        }
        String str23 = "translationZ";
        if (l.c(lVar.f182884o, lVar2.f182884o)) {
            hashSet5.add("translationZ");
        }
        ArrayList<r> arrayList3 = nVar.f182908u;
        ArrayList<d> arrayList4 = nVar.f182910w;
        if (arrayList4 != null) {
            ArrayList arrayList5 = null;
            for (d dVar2 : arrayList4) {
                String str24 = str22;
                if (dVar2 instanceof h) {
                    h hVar = (h) dVar2;
                    r rVar4 = new r(i14, i15, hVar, nVar.f182893f, nVar.f182894g);
                    str18 = str23;
                    arrayList3.add((-Collections.binarySearch(arrayList3, rVar4)) - 1, rVar4);
                    int i24 = hVar.f182831e;
                    if (i24 != -1) {
                        nVar.f182892e = i24;
                    }
                } else {
                    str18 = str23;
                    if (dVar2 instanceof f) {
                        dVar2.c(hashSet6);
                    } else if (dVar2 instanceof j) {
                        dVar2.c(hashSet4);
                    } else if (dVar2 instanceof k) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        ArrayList arrayList6 = arrayList5;
                        arrayList6.add((k) dVar2);
                        arrayList5 = arrayList6;
                    } else {
                        dVar2.e(map2);
                        dVar2.c(hashSet5);
                    }
                }
                str22 = str24;
                str23 = str18;
            }
            str = str23;
            arrayList = arrayList5;
        } else {
            str = "translationZ";
            arrayList = null;
        }
        String str25 = str22;
        int i25 = 1;
        if (arrayList != null) {
            nVar.A = (k[]) arrayList.toArray(new k[0]);
        }
        String str26 = ",";
        String str27 = "CUSTOM";
        String str28 = "CUSTOM,";
        if (hashSet5.isEmpty()) {
            hashSet = hashSet5;
            arrayList2 = arrayList3;
            str2 = ",";
            obj = obj17;
            obj2 = obj18;
            str3 = str25;
            str4 = str;
            str5 = "CUSTOM,";
            str6 = "CUSTOM";
        } else {
            nVar.f182912y = new HashMap<>();
            Iterator<String> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                String next = it4.next();
                if (next.startsWith(str28)) {
                    SparseArray sparseArray = new SparseArray();
                    String str29 = next.split(str26)[1];
                    for (d dVar3 : arrayList4) {
                        HashSet<String> hashSet7 = hashSet5;
                        String str30 = str26;
                        HashMap<String, androidx.constraintlayout.widget.a> map3 = dVar3.f182781d;
                        if (map3 != null && (aVar3 = map3.get(str29)) != null) {
                            sparseArray.append(dVar3.f182778a, aVar3);
                        }
                        str26 = str30;
                        hashSet5 = hashSet7;
                    }
                    hashSet3 = hashSet5;
                    str14 = str26;
                    v6.d.b bVar2 = new v6.d.b(next, sparseArray);
                    obj14 = obj17;
                    obj15 = obj18;
                    str15 = str25;
                    str17 = str28;
                    obj16 = obj16;
                    dVar = bVar2;
                    str16 = str;
                } else {
                    hashSet3 = hashSet5;
                    str14 = str26;
                    switch (next.hashCode()) {
                        case -1249320806:
                            obj14 = obj17;
                            obj15 = obj18;
                            str15 = str25;
                            str16 = str;
                            str17 = str28;
                            obj16 = obj16;
                            b25 = next.equals(obj16) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            obj14 = obj17;
                            obj15 = obj18;
                            str15 = str25;
                            str16 = str;
                            if (next.equals(obj14)) {
                                str17 = str28;
                                obj16 = obj16;
                                b25 = 1;
                            } else {
                                str17 = str28;
                                obj16 = obj16;
                            }
                            break;
                        case -1225497657:
                            obj15 = obj18;
                            str15 = str25;
                            str16 = str;
                            if (next.equals(obj15)) {
                                obj14 = obj17;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = 2;
                            } else {
                                obj14 = obj17;
                                str17 = str28;
                                obj16 = obj16;
                            }
                            break;
                        case -1225497656:
                            str15 = str25;
                            str16 = str;
                            obj14 = obj17;
                            if (next.equals(str15)) {
                                obj15 = obj18;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = 3;
                            } else {
                                obj15 = obj18;
                                str17 = str28;
                                obj16 = obj16;
                            }
                            break;
                        case -1225497655:
                            str16 = str;
                            obj14 = obj17;
                            obj15 = obj18;
                            if (next.equals(str16)) {
                                str15 = str25;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = 4;
                            } else {
                                str15 = str25;
                                str17 = str28;
                                obj16 = obj16;
                            }
                            break;
                        case -1001078227:
                            if (next.equals("progress")) {
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str16 = str;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = 5;
                            } else {
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str16 = str;
                                str17 = str28;
                                obj16 = obj16;
                            }
                            break;
                        case -908189618:
                            if (next.equals("scaleX")) {
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str16 = str;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = 6;
                            } else {
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str16 = str;
                                str17 = str28;
                                obj16 = obj16;
                            }
                            break;
                        case -908189617:
                            if (next.equals("scaleY")) {
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str16 = str;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = 7;
                            } else {
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str16 = str;
                                str17 = str28;
                                obj16 = obj16;
                            }
                            break;
                        case -797520672:
                            if (next.equals("waveVariesBy")) {
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str16 = str;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = 8;
                            } else {
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str16 = str;
                                str17 = str28;
                                obj16 = obj16;
                            }
                            break;
                        case -760884510:
                            if (next.equals("transformPivotX")) {
                                b26 = 9;
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = b26;
                                str16 = str;
                            }
                            obj14 = obj17;
                            obj15 = obj18;
                            str15 = str25;
                            str16 = str;
                            str17 = str28;
                            obj16 = obj16;
                            break;
                        case -760884509:
                            if (next.equals("transformPivotY")) {
                                b26 = 10;
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = b26;
                                str16 = str;
                            }
                            obj14 = obj17;
                            obj15 = obj18;
                            str15 = str25;
                            str16 = str;
                            str17 = str28;
                            obj16 = obj16;
                            break;
                        case -40300674:
                            if (next.equals("rotation")) {
                                b26 = Ascii.VT;
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = b26;
                                str16 = str;
                            }
                            obj14 = obj17;
                            obj15 = obj18;
                            str15 = str25;
                            str16 = str;
                            str17 = str28;
                            obj16 = obj16;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                b26 = Ascii.FF;
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = b26;
                                str16 = str;
                            }
                            obj14 = obj17;
                            obj15 = obj18;
                            str15 = str25;
                            str16 = str;
                            str17 = str28;
                            obj16 = obj16;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                b26 = Ascii.CR;
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = b26;
                                str16 = str;
                            }
                            obj14 = obj17;
                            obj15 = obj18;
                            str15 = str25;
                            str16 = str;
                            str17 = str28;
                            obj16 = obj16;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                b26 = Ascii.SO;
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = b26;
                                str16 = str;
                            }
                            obj14 = obj17;
                            obj15 = obj18;
                            str15 = str25;
                            str16 = str;
                            str17 = str28;
                            obj16 = obj16;
                            break;
                        case 156108012:
                            if (next.equals("waveOffset")) {
                                b26 = Ascii.SI;
                                obj14 = obj17;
                                obj15 = obj18;
                                str15 = str25;
                                str17 = str28;
                                obj16 = obj16;
                                b25 = b26;
                                str16 = str;
                            }
                            obj14 = obj17;
                            obj15 = obj18;
                            str15 = str25;
                            str16 = str;
                            str17 = str28;
                            obj16 = obj16;
                            break;
                        default:
                            obj14 = obj17;
                            obj15 = obj18;
                            str15 = str25;
                            str16 = str;
                            str17 = str28;
                            obj16 = obj16;
                            break;
                    }
                    switch (b25) {
                        case 0:
                            iVar = new v6.d.i();
                            break;
                        case 1:
                            iVar = new v6.d.j();
                            break;
                        case 2:
                            iVar = new v6.d.m();
                            break;
                        case 3:
                            iVar = new v6.d.n();
                            break;
                        case 4:
                            iVar = new v6.d.o();
                            break;
                        case 5:
                            iVar = new v6.d.g();
                            break;
                        case 6:
                            iVar = new v6.d.k();
                            break;
                        case 7:
                            iVar = new v6.d.l();
                            break;
                        case 8:
                            iVar = new v6.d.a();
                            break;
                        case 9:
                            iVar = new v6.d.e();
                            break;
                        case 10:
                            iVar = new v6.d.f();
                            break;
                        case 11:
                            iVar = new v6.d.h();
                            break;
                        case 12:
                            iVar = new v6.d.c();
                            break;
                        case 13:
                            iVar = new v6.d.C3281d();
                            break;
                        case 14:
                            iVar = new v6.d.a();
                            break;
                        case 15:
                            iVar = new v6.d.a();
                            break;
                        default:
                            iVar = null;
                            break;
                    }
                    dVar = iVar;
                }
                if (dVar != null) {
                    dVar.f129507e = next;
                    nVar.f182912y.put(next, dVar);
                }
                str = str16;
                str25 = str15;
                str28 = str17;
                map2 = map2;
                arrayList3 = arrayList3;
                hashSet5 = hashSet3;
                obj18 = obj15;
                obj17 = obj14;
                it4 = it4;
                str26 = str14;
            }
            hashSet = hashSet5;
            arrayList2 = arrayList3;
            str2 = str26;
            obj = obj17;
            obj2 = obj18;
            str3 = str25;
            str4 = str;
            str5 = str28;
            HashMap<String, Integer> map4 = map2;
            if (arrayList4 != null) {
                Iterator<d> it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    d next2 = it5.next();
                    if (next2 instanceof e) {
                        HashMap<String, v6.d> map5 = nVar.f182912y;
                        e eVar = (e) next2;
                        for (String str31 : map5.keySet()) {
                            Iterator<d> it6 = it5;
                            HashMap<String, v6.d> map6 = map5;
                            v6.d dVar4 = map5.get(str31);
                            if (dVar4 != null) {
                                if (!str31.startsWith(str27)) {
                                    str13 = str27;
                                    switch (str31.hashCode()) {
                                        case -1249320806:
                                            obj13 = obj16;
                                            b24 = str31.equals(obj13) ? (byte) 0 : (byte) -1;
                                            break;
                                        case -1249320805:
                                            if (str31.equals(obj)) {
                                                obj13 = obj16;
                                                b24 = 1;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case -1225497657:
                                            if (str31.equals(obj2)) {
                                                obj13 = obj16;
                                                b24 = 2;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case -1225497656:
                                            if (str31.equals(str3)) {
                                                obj13 = obj16;
                                                b24 = 3;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case -1225497655:
                                            if (str31.equals(str4)) {
                                                obj13 = obj16;
                                                b24 = 4;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case -1001078227:
                                            if (str31.equals("progress")) {
                                                obj13 = obj16;
                                                b24 = 5;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case -908189618:
                                            if (str31.equals("scaleX")) {
                                                obj13 = obj16;
                                                b24 = 6;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case -908189617:
                                            if (str31.equals("scaleY")) {
                                                obj13 = obj16;
                                                b24 = 7;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case -760884510:
                                            if (str31.equals("transformPivotX")) {
                                                obj13 = obj16;
                                                b24 = 8;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case -760884509:
                                            if (str31.equals("transformPivotY")) {
                                                b24 = 9;
                                                obj13 = obj16;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case -40300674:
                                            if (str31.equals("rotation")) {
                                                b24 = 10;
                                                obj13 = obj16;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case -4379043:
                                            if (str31.equals("elevation")) {
                                                b24 = Ascii.VT;
                                                obj13 = obj16;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case 37232917:
                                            if (str31.equals("transitionPathRotate")) {
                                                b24 = Ascii.FF;
                                                obj13 = obj16;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        case 92909918:
                                            if (str31.equals("alpha")) {
                                                b24 = Ascii.CR;
                                                obj13 = obj16;
                                            } else {
                                                obj13 = obj16;
                                            }
                                            break;
                                        default:
                                            obj13 = obj16;
                                            break;
                                    }
                                    switch (b24) {
                                        case 0:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182786i)) {
                                                dVar4.b(eVar.f182786i, eVar.f182778a);
                                            }
                                            break;
                                        case 1:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182787j)) {
                                                dVar4.b(eVar.f182787j, eVar.f182778a);
                                            }
                                            break;
                                        case 2:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182793p)) {
                                                dVar4.b(eVar.f182793p, eVar.f182778a);
                                            }
                                            break;
                                        case 3:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182794q)) {
                                                dVar4.b(eVar.f182794q, eVar.f182778a);
                                            }
                                            break;
                                        case 4:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182795r)) {
                                                dVar4.b(eVar.f182795r, eVar.f182778a);
                                            }
                                            break;
                                        case 5:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182796s)) {
                                                dVar4.b(eVar.f182796s, eVar.f182778a);
                                            }
                                            break;
                                        case 6:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182791n)) {
                                                dVar4.b(eVar.f182791n, eVar.f182778a);
                                            }
                                            break;
                                        case 7:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182792o)) {
                                                dVar4.b(eVar.f182792o, eVar.f182778a);
                                            }
                                            break;
                                        case 8:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182786i)) {
                                                dVar4.b(eVar.f182788k, eVar.f182778a);
                                            }
                                            break;
                                        case 9:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182787j)) {
                                                dVar4.b(eVar.f182789l, eVar.f182778a);
                                            }
                                            break;
                                        case 10:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182785h)) {
                                                dVar4.b(eVar.f182785h, eVar.f182778a);
                                            }
                                            break;
                                        case 11:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182784g)) {
                                                dVar4.b(eVar.f182784g, eVar.f182778a);
                                            }
                                            break;
                                        case 12:
                                            obj16 = obj13;
                                            if (!Float.isNaN(eVar.f182790m)) {
                                                dVar4.b(eVar.f182790m, eVar.f182778a);
                                            }
                                            break;
                                        case 13:
                                            if (!Float.isNaN(eVar.f182783f)) {
                                                obj16 = obj13;
                                                dVar4.b(eVar.f182783f, eVar.f182778a);
                                                break;
                                            }
                                        default:
                                            obj16 = obj13;
                                            break;
                                    }
                                } else {
                                    str13 = str27;
                                    androidx.constraintlayout.widget.a aVar4 = eVar.f182781d.get(str31.substring(7));
                                    if (aVar4 != null) {
                                        ((v6.d.b) dVar4).f175784f.append(eVar.f182778a, aVar4);
                                    }
                                }
                                str27 = str13;
                            }
                            it5 = it6;
                            map5 = map6;
                        }
                    }
                    str27 = str27;
                    it5 = it5;
                }
            }
            str6 = str27;
            lVar.a(0, nVar.f182912y);
            lVar2.a(100, nVar.f182912y);
            Iterator<String> it7 = nVar.f182912y.keySet().iterator();
            while (it7.hasNext()) {
                String next3 = it7.next();
                HashMap<String, Integer> map7 = map4;
                int iIntValue = (!map7.containsKey(next3) || (num = map7.get(next3)) == null) ? 0 : num.intValue();
                Iterator<String> it8 = it7;
                v6.d dVar5 = nVar.f182912y.get(next3);
                if (dVar5 != null) {
                    dVar5.c(iIntValue);
                }
                it7 = it8;
                map4 = map7;
            }
            map2 = map4;
        }
        if (hashSet4.isEmpty()) {
            obj3 = obj;
            obj4 = obj16;
            str7 = str5;
        } else {
            if (nVar.f182911x == null) {
                nVar.f182911x = new HashMap<>();
            }
            Iterator<String> it9 = hashSet4.iterator();
            while (it9.hasNext()) {
                String next4 = it9.next();
                if (!nVar.f182911x.containsKey(next4)) {
                    String str32 = str5;
                    if (next4.startsWith(str32)) {
                        it3 = it9;
                        SparseArray sparseArray2 = new SparseArray();
                        str12 = str32;
                        String str33 = next4.split(str2)[1];
                        for (d dVar6 : arrayList4) {
                            HashMap<String, Integer> map8 = map2;
                            HashMap<String, androidx.constraintlayout.widget.a> map9 = dVar6.f182781d;
                            if (map9 != null && (aVar2 = map9.get(str33)) != null) {
                                sparseArray2.append(dVar6.f182778a, aVar2);
                            }
                            map2 = map8;
                        }
                        map = map2;
                        gVar2 = new v6.e.b(next4, sparseArray2);
                        obj12 = obj16;
                    } else {
                        it3 = it9;
                        map = map2;
                        str12 = str32;
                        switch (next4.hashCode()) {
                            case -1249320806:
                                obj12 = obj16;
                                b19 = next4.equals(obj12) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                if (next4.equals(obj)) {
                                    obj12 = obj16;
                                    b19 = 1;
                                } else {
                                    obj12 = obj16;
                                }
                                break;
                            case -1225497657:
                                if (next4.equals(obj2)) {
                                    obj12 = obj16;
                                    b19 = 2;
                                } else {
                                    obj12 = obj16;
                                }
                                break;
                            case -1225497656:
                                if (next4.equals(str3)) {
                                    obj12 = obj16;
                                    b19 = 3;
                                } else {
                                    obj12 = obj16;
                                }
                                break;
                            case -1225497655:
                                if (next4.equals(str4)) {
                                    obj12 = obj16;
                                    b19 = 4;
                                } else {
                                    obj12 = obj16;
                                }
                                break;
                            case -1001078227:
                                if (next4.equals("progress")) {
                                    obj12 = obj16;
                                    b19 = 5;
                                } else {
                                    obj12 = obj16;
                                }
                                break;
                            case -908189618:
                                if (next4.equals("scaleX")) {
                                    obj12 = obj16;
                                    b19 = 6;
                                } else {
                                    obj12 = obj16;
                                }
                                break;
                            case -908189617:
                                if (next4.equals("scaleY")) {
                                    obj12 = obj16;
                                    b19 = 7;
                                } else {
                                    obj12 = obj16;
                                }
                                break;
                            case -40300674:
                                if (next4.equals("rotation")) {
                                    obj12 = obj16;
                                    b19 = 8;
                                } else {
                                    obj12 = obj16;
                                }
                                break;
                            case -4379043:
                                if (next4.equals("elevation")) {
                                    b19 = 9;
                                    obj12 = obj16;
                                } else {
                                    obj12 = obj16;
                                }
                                break;
                            case 37232917:
                                if (next4.equals("transitionPathRotate")) {
                                    b19 = 10;
                                    obj12 = obj16;
                                } else {
                                    obj12 = obj16;
                                }
                                break;
                            case 92909918:
                                if (next4.equals("alpha")) {
                                    b19 = Ascii.VT;
                                    obj12 = obj16;
                                } else {
                                    obj12 = obj16;
                                }
                                break;
                            default:
                                obj12 = obj16;
                                break;
                        }
                        switch (b19) {
                            case 0:
                                gVar2 = new v6.e.g();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            case 1:
                                gVar2 = new v6.e.h();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            case 2:
                                gVar2 = new v6.e.k();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            case 3:
                                gVar2 = new v6.e.l();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            case 4:
                                gVar2 = new v6.e.m();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            case 5:
                                gVar2 = new v6.e.C3282e();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            case 6:
                                gVar2 = new v6.e.i();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            case 7:
                                gVar2 = new v6.e.j();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            case 8:
                                gVar2 = new v6.e.f();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            case 9:
                                gVar2 = new v6.e.c();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            case 10:
                                gVar2 = new v6.e.d();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            case 11:
                                gVar2 = new v6.e.a();
                                obj = obj;
                                gVar2.f129540i = j8;
                                break;
                            default:
                                gVar2 = null;
                                break;
                        }
                        if (gVar2 == null) {
                            nVar = this;
                            obj16 = obj12;
                            obj = obj;
                            it9 = it3;
                            str5 = str12;
                            map2 = map;
                        } else {
                            gVar2.f129537f = next4;
                            this.f182911x.put(next4, gVar2);
                            nVar = this;
                            obj = obj;
                            map2 = map;
                            obj16 = obj12;
                            it9 = it3;
                            str5 = str12;
                        }
                    }
                    if (gVar2 == null) {
                        nVar = this;
                        obj16 = obj12;
                        obj = obj;
                        it9 = it3;
                        str5 = str12;
                        map2 = map;
                    } else {
                        gVar2.f129537f = next4;
                        this.f182911x.put(next4, gVar2);
                        nVar = this;
                        obj = obj;
                        map2 = map;
                        obj16 = obj12;
                        it9 = it3;
                        str5 = str12;
                    }
                }
            }
            HashMap<String, Integer> map10 = map2;
            obj4 = obj16;
            str7 = str5;
            n nVar2 = nVar;
            Object obj19 = obj;
            if (arrayList4 != null) {
                Iterator<d> it10 = arrayList4.iterator();
                while (it10.hasNext()) {
                    d next5 = it10.next();
                    if (next5 instanceof j) {
                        j jVar = (j) next5;
                        HashMap<String, v6.e> map11 = nVar2.f182911x;
                        Iterator<String> it11 = map11.keySet().iterator();
                        while (it11.hasNext()) {
                            it10 = it10;
                            String next6 = it11.next();
                            v6.e eVar2 = map11.get(next6);
                            if (eVar2 != null) {
                                HashMap<String, v6.e> map12 = map11;
                                String str34 = str6;
                                if (next6.startsWith(str34)) {
                                    Iterator<String> it12 = it11;
                                    androidx.constraintlayout.widget.a aVar5 = jVar.f182781d.get(next6.substring(7));
                                    if (aVar5 != null) {
                                        v6.e.b bVar3 = (v6.e.b) eVar2;
                                        str6 = str34;
                                        int i26 = jVar.f182778a;
                                        float f17 = jVar.f182846s;
                                        int i27 = jVar.f182845r;
                                        Object obj20 = obj4;
                                        float f18 = jVar.f182847t;
                                        bVar3.f175788l.append(i26, aVar5);
                                        bVar3.f175789m.append(i26, new float[]{f17, f18});
                                        bVar3.f129533b = Math.max(bVar3.f129533b, i27);
                                        it11 = it12;
                                        map11 = map12;
                                        obj4 = obj20;
                                        jVar = jVar;
                                    } else {
                                        it11 = it12;
                                        str6 = str34;
                                        map11 = map12;
                                    }
                                } else {
                                    Object obj21 = obj4;
                                    j jVar2 = jVar;
                                    str6 = str34;
                                    Iterator<String> it13 = it11;
                                    switch (next6.hashCode()) {
                                        case -1249320806:
                                            obj11 = obj19;
                                            obj4 = obj21;
                                            if (next6.equals(obj4)) {
                                                b18 = 0;
                                            } else {
                                                b18 = -1;
                                            }
                                            break;
                                        case -1249320805:
                                            obj11 = obj19;
                                            obj4 = obj21;
                                            if (next6.equals(obj11)) {
                                                b18 = 1;
                                            } else {
                                                b18 = -1;
                                            }
                                            break;
                                        case -1225497657:
                                            if (next6.equals(obj2)) {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = 2;
                                            } else {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = -1;
                                            }
                                            break;
                                        case -1225497656:
                                            if (next6.equals(str3)) {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = 3;
                                            } else {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = -1;
                                            }
                                            break;
                                        case -1225497655:
                                            if (next6.equals(str4)) {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = 4;
                                            } else {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = -1;
                                            }
                                            break;
                                        case -1001078227:
                                            if (next6.equals("progress")) {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = 5;
                                            } else {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = -1;
                                            }
                                            break;
                                        case -908189618:
                                            if (next6.equals("scaleX")) {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = 6;
                                            } else {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = -1;
                                            }
                                            break;
                                        case -908189617:
                                            if (next6.equals("scaleY")) {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = 7;
                                            } else {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = -1;
                                            }
                                            break;
                                        case -40300674:
                                            if (next6.equals("rotation")) {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = 8;
                                            } else {
                                                obj11 = obj19;
                                                obj4 = obj21;
                                                b18 = -1;
                                            }
                                            break;
                                        case -4379043:
                                            if (next6.equals("elevation")) {
                                                b18 = 9;
                                                obj11 = obj19;
                                                obj4 = obj21;
                                            }
                                            obj11 = obj19;
                                            obj4 = obj21;
                                            b18 = -1;
                                            break;
                                        case 37232917:
                                            if (next6.equals("transitionPathRotate")) {
                                                b18 = 10;
                                                obj11 = obj19;
                                                obj4 = obj21;
                                            }
                                            obj11 = obj19;
                                            obj4 = obj21;
                                            b18 = -1;
                                            break;
                                        case 92909918:
                                            if (next6.equals("alpha")) {
                                                b18 = Ascii.VT;
                                                obj11 = obj19;
                                                obj4 = obj21;
                                            }
                                            obj11 = obj19;
                                            obj4 = obj21;
                                            b18 = -1;
                                            break;
                                        default:
                                            obj11 = obj19;
                                            obj4 = obj21;
                                            b18 = -1;
                                            break;
                                    }
                                    switch (b18) {
                                        case 0:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182836i)) {
                                                eVar2.b(jVar.f182836i, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        case 1:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182837j)) {
                                                eVar2.b(jVar.f182837j, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        case 2:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182841n)) {
                                                eVar2.b(jVar.f182841n, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        case 3:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182842o)) {
                                                eVar2.b(jVar.f182842o, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        case 4:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182843p)) {
                                                eVar2.b(jVar.f182843p, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        case 5:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182844q)) {
                                                eVar2.b(jVar.f182844q, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        case 6:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182839l)) {
                                                eVar2.b(jVar.f182839l, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        case 7:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182840m)) {
                                                eVar2.b(jVar.f182840m, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        case 8:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182835h)) {
                                                eVar2.b(jVar.f182835h, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        case 9:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182834g)) {
                                                eVar2.b(jVar.f182834g, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        case 10:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182838k)) {
                                                eVar2.b(jVar.f182838k, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        case 11:
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f182833f)) {
                                                eVar2.b(jVar.f182833f, jVar.f182846s, jVar.f182847t, jVar.f182778a, jVar.f182845r);
                                            }
                                            break;
                                        default:
                                            jVar = jVar2;
                                            break;
                                    }
                                    it11 = it13;
                                    obj19 = obj11;
                                    map11 = map12;
                                }
                            }
                        }
                    }
                    it10 = it10;
                    obj19 = obj19;
                    nVar2 = this;
                }
            }
            obj3 = obj19;
            nVar = this;
            for (Iterator<String> it14 = nVar.f182911x.keySet().iterator(); it14.hasNext(); it14 = it14) {
                String next7 = it14.next();
                HashMap<String, Integer> map13 = map10;
                map10 = map13;
                nVar.f182911x.get(next7).c(map13.containsKey(next7) ? map13.get(next7).intValue() : 0);
            }
        }
        int size = arrayList2.size();
        int i28 = size + 2;
        r[] rVarArr2 = new r[i28];
        rVarArr2[0] = rVar3;
        int i29 = size + 1;
        r rVar5 = nVar.f182894g;
        rVarArr2[i29] = rVar5;
        if (arrayList2.size() > 0) {
            rVarArr = rVarArr2;
            obj5 = obj4;
            if (nVar.f182892e == -1) {
                nVar.f182892e = 0;
            }
        } else {
            obj5 = obj4;
            rVarArr = rVarArr2;
        }
        Iterator<r> it15 = arrayList2.iterator();
        int i30 = 1;
        while (it15.hasNext()) {
            rVarArr[i30] = it15.next();
            i30++;
        }
        HashSet hashSet8 = new HashSet();
        Iterator<String> it16 = rVar5.f183008n.keySet().iterator();
        while (it16.hasNext()) {
            String next8 = it16.next();
            Iterator<String> it17 = it16;
            Object obj22 = obj3;
            r rVar6 = rVar3;
            if (rVar6.f183008n.containsKey(next8)) {
                rVar3 = rVar6;
                hashSet2 = hashSet;
                if (!hashSet2.contains(str7 + next8)) {
                    hashSet8.add(next8);
                }
            } else {
                rVar3 = rVar6;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            obj3 = obj22;
            it16 = it17;
        }
        Object obj23 = obj3;
        String[] strArr = (String[]) hashSet8.toArray(new String[0]);
        nVar.f182905r = strArr;
        nVar.f182906s = new int[strArr.length];
        int i34 = 0;
        while (true) {
            String[] strArr2 = nVar.f182905r;
            if (i34 < strArr2.length) {
                String str35 = strArr2[i34];
                nVar.f182906s[i34] = 0;
                for (int i35 = 0; i35 < i28; i35++) {
                    if (rVarArr[i35].f183008n.containsKey(str35) && (aVar = rVarArr[i35].f183008n.get(str35)) != null) {
                        int[] iArr = nVar.f182906s;
                        iArr[i34] = aVar.c() + iArr[i34];
                        break;
                    }
                }
                i34++;
            } else {
                boolean z14 = rVarArr[0].f183004j != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                int i36 = 1;
                while (i36 < i28) {
                    boolean z15 = z14;
                    r rVar7 = rVarArr[i36];
                    boolean[] zArr2 = zArr;
                    r rVar8 = rVarArr[i36 - 1];
                    int i37 = i36;
                    Object obj24 = obj2;
                    boolean zB = r.b(rVar7.f182999e, rVar8.f182999e);
                    boolean zB2 = r.b(rVar7.f183000f, rVar8.f183000f);
                    zArr2[0] = zArr2[0] | r.b(rVar7.f182998d, rVar8.f182998d);
                    boolean z16 = zB | zB2 | z15;
                    zArr2[1] = zArr2[1] | z16;
                    zArr2[2] = zArr2[2] | z16;
                    zArr2[3] = zArr2[3] | r.b(rVar7.f183001g, rVar8.f183001g);
                    zArr2[4] = r.b(rVar7.f183002h, rVar8.f183002h) | zArr2[4];
                    i36 = i37 + 1;
                    z14 = z15;
                    zArr = zArr2;
                    obj2 = obj24;
                }
                boolean[] zArr3 = zArr;
                Object obj25 = obj2;
                int i38 = 0;
                for (int i39 = 1; i39 < length; i39++) {
                    if (zArr3[i39]) {
                        i38++;
                    }
                }
                nVar.f182902o = new int[i38];
                int iMax = Math.max(2, i38);
                nVar.f182903p = new double[iMax];
                nVar.f182904q = new double[iMax];
                int i44 = 0;
                for (int i45 = 1; i45 < length; i45++) {
                    if (zArr3[i45]) {
                        nVar.f182902o[i44] = i45;
                        i44++;
                    }
                }
                int[] iArr2 = {i28, nVar.f182902o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i28];
                int i46 = 0;
                while (i46 < i28) {
                    r rVar9 = rVarArr[i46];
                    double[] dArr3 = dArr[i46];
                    int i47 = i46;
                    String str36 = str3;
                    float[] fArr = {rVar9.f182998d, rVar9.f182999e, rVar9.f183000f, rVar9.f183001g, rVar9.f183002h, rVar9.f183003i};
                    int i48 = 0;
                    int i49 = 0;
                    for (int[] iArr3 = nVar.f182902o; i48 < iArr3.length; iArr3 = iArr3) {
                        int i54 = iArr3[i48];
                        int i55 = i48;
                        if (i54 < 6) {
                            dArr3[i49] = fArr[i54];
                            i49++;
                        }
                        i48 = i55 + 1;
                    }
                    dArr2[i47] = rVarArr[i47].f182997c;
                    i46 = i47 + 1;
                    str3 = str36;
                }
                String str37 = str3;
                int i56 = 0;
                while (true) {
                    int[] iArr4 = nVar.f182902o;
                    if (i56 < iArr4.length) {
                        if (iArr4[i56] < 6) {
                            i16 = i56;
                            String strO = am.j.o(r.f182994r[nVar.f182902o[i56]], " [", new StringBuilder());
                            int i57 = 0;
                            while (i57 < i28) {
                                StringBuilder sbK = e5.k(strO);
                                sbK.append(dArr[i57][i16]);
                                strO = sbK.toString();
                                i57++;
                                str20 = str20;
                            }
                        } else {
                            i16 = i56;
                        }
                        i56 = i16 + 1;
                        str20 = str20;
                    } else {
                        String str38 = str20;
                        nVar.f182897j = new o6.b[nVar.f182905r.length + 1];
                        int i58 = 0;
                        while (true) {
                            String[] strArr3 = nVar.f182905r;
                            if (i58 >= strArr3.length) {
                                String str39 = str4;
                                String str40 = str19;
                                String str41 = str21;
                                nVar.f182897j[0] = o6.b.a(nVar.f182892e, dArr2, dArr);
                                if (rVarArr[0].f183004j != -1) {
                                    int[] iArr5 = new int[i28];
                                    double[] dArr4 = new double[i28];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i28, 2);
                                    for (int i59 = 0; i59 < i28; i59++) {
                                        r rVar10 = rVarArr[i59];
                                        iArr5[i59] = rVar10.f183004j;
                                        dArr4[i59] = rVar10.f182997c;
                                        double[] dArr6 = dArr5[i59];
                                        dArr6[0] = rVar10.f182999e;
                                        dArr6[1] = rVar10.f183000f;
                                    }
                                    nVar.f182898k = new o6.a(iArr5, dArr4, dArr5);
                                }
                                nVar.f182913z = new HashMap<>();
                                if (arrayList4 != null) {
                                    Iterator<String> it18 = hashSet6.iterator();
                                    float f19 = Float.NaN;
                                    while (it18.hasNext()) {
                                        String next9 = it18.next();
                                        str6 = str6;
                                        if (!next9.startsWith(str6)) {
                                            switch (next9.hashCode()) {
                                                case -1249320806:
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    str38 = str38;
                                                    obj8 = obj5;
                                                    obj9 = obj25;
                                                    str9 = str37;
                                                    str39 = str39;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    if (next9.equals(obj8)) {
                                                        b16 = 0;
                                                    } else {
                                                        b16 = -1;
                                                    }
                                                    break;
                                                case -1249320805:
                                                    obj7 = obj23;
                                                    str38 = str38;
                                                    obj9 = obj25;
                                                    str9 = str37;
                                                    str39 = str39;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    it18 = it18;
                                                    obj8 = obj5;
                                                    if (next9.equals(obj7)) {
                                                        b16 = 1;
                                                    } else {
                                                        b16 = -1;
                                                    }
                                                    break;
                                                case -1225497657:
                                                    str38 = str38;
                                                    obj9 = obj25;
                                                    str9 = str37;
                                                    str39 = str39;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    obj8 = obj5;
                                                    if (next9.equals(obj9)) {
                                                        b16 = 2;
                                                    } else {
                                                        b16 = -1;
                                                    }
                                                    break;
                                                case -1225497656:
                                                    str38 = str38;
                                                    str9 = str37;
                                                    str39 = str39;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    obj8 = obj5;
                                                    if (next9.equals(str9)) {
                                                        obj9 = obj25;
                                                        b16 = 3;
                                                    } else {
                                                        obj9 = obj25;
                                                        b16 = -1;
                                                    }
                                                    break;
                                                case -1225497655:
                                                    str38 = str38;
                                                    str39 = str39;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    obj8 = obj5;
                                                    if (next9.equals(str39)) {
                                                        b16 = 4;
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                    } else {
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        b16 = -1;
                                                    }
                                                    break;
                                                case -1001078227:
                                                    str38 = str38;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    obj8 = obj5;
                                                    if (next9.equals(str40)) {
                                                        b16 = 5;
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        str39 = str39;
                                                    } else {
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        str39 = str39;
                                                        b16 = -1;
                                                    }
                                                    break;
                                                case -908189618:
                                                    str38 = str38;
                                                    str41 = str41;
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    obj8 = obj5;
                                                    obj9 = obj25;
                                                    str9 = str37;
                                                    str39 = str39;
                                                    if (next9.equals(str38)) {
                                                        str40 = str40;
                                                        b16 = 6;
                                                    } else {
                                                        str40 = str40;
                                                        b16 = -1;
                                                    }
                                                    break;
                                                case -908189617:
                                                    str41 = str41;
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    if (next9.equals(str41)) {
                                                        str38 = str38;
                                                        obj8 = obj5;
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        str39 = str39;
                                                        str40 = str40;
                                                        b16 = 7;
                                                    } else {
                                                        str38 = str38;
                                                        obj8 = obj5;
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        str39 = str39;
                                                        str40 = str40;
                                                        b16 = -1;
                                                    }
                                                    break;
                                                case -797520672:
                                                    if (next9.equals("waveVariesBy")) {
                                                        it18 = it18;
                                                        obj7 = obj23;
                                                        str38 = str38;
                                                        obj8 = obj5;
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        str39 = str39;
                                                        str40 = str40;
                                                        str41 = str41;
                                                        b16 = 8;
                                                    } else {
                                                        it18 = it18;
                                                        obj7 = obj23;
                                                        str38 = str38;
                                                        obj8 = obj5;
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        str39 = str39;
                                                        str40 = str40;
                                                        str41 = str41;
                                                        b16 = -1;
                                                    }
                                                    break;
                                                case -40300674:
                                                    if (next9.equals("rotation")) {
                                                        b17 = 9;
                                                        it18 = it18;
                                                        b16 = b17;
                                                        obj7 = obj23;
                                                        str38 = str38;
                                                        obj8 = obj5;
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        str39 = str39;
                                                        str40 = str40;
                                                        str41 = str41;
                                                    }
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    str38 = str38;
                                                    obj8 = obj5;
                                                    obj9 = obj25;
                                                    str9 = str37;
                                                    str39 = str39;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    b16 = -1;
                                                    break;
                                                case -4379043:
                                                    if (next9.equals("elevation")) {
                                                        b17 = 10;
                                                        it18 = it18;
                                                        b16 = b17;
                                                        obj7 = obj23;
                                                        str38 = str38;
                                                        obj8 = obj5;
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        str39 = str39;
                                                        str40 = str40;
                                                        str41 = str41;
                                                    }
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    str38 = str38;
                                                    obj8 = obj5;
                                                    obj9 = obj25;
                                                    str9 = str37;
                                                    str39 = str39;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    b16 = -1;
                                                    break;
                                                case 37232917:
                                                    if (next9.equals("transitionPathRotate")) {
                                                        b17 = Ascii.VT;
                                                        it18 = it18;
                                                        b16 = b17;
                                                        obj7 = obj23;
                                                        str38 = str38;
                                                        obj8 = obj5;
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        str39 = str39;
                                                        str40 = str40;
                                                        str41 = str41;
                                                    }
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    str38 = str38;
                                                    obj8 = obj5;
                                                    obj9 = obj25;
                                                    str9 = str37;
                                                    str39 = str39;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    b16 = -1;
                                                    break;
                                                case 92909918:
                                                    if (next9.equals("alpha")) {
                                                        b17 = Ascii.FF;
                                                        it18 = it18;
                                                        b16 = b17;
                                                        obj7 = obj23;
                                                        str38 = str38;
                                                        obj8 = obj5;
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        str39 = str39;
                                                        str40 = str40;
                                                        str41 = str41;
                                                    }
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    str38 = str38;
                                                    obj8 = obj5;
                                                    obj9 = obj25;
                                                    str9 = str37;
                                                    str39 = str39;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    b16 = -1;
                                                    break;
                                                case 156108012:
                                                    if (next9.equals("waveOffset")) {
                                                        b17 = Ascii.CR;
                                                        it18 = it18;
                                                        b16 = b17;
                                                        obj7 = obj23;
                                                        str38 = str38;
                                                        obj8 = obj5;
                                                        obj9 = obj25;
                                                        str9 = str37;
                                                        str39 = str39;
                                                        str40 = str40;
                                                        str41 = str41;
                                                    }
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    str38 = str38;
                                                    obj8 = obj5;
                                                    obj9 = obj25;
                                                    str9 = str37;
                                                    str39 = str39;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    b16 = -1;
                                                    break;
                                                default:
                                                    it18 = it18;
                                                    obj7 = obj23;
                                                    str38 = str38;
                                                    obj8 = obj5;
                                                    obj9 = obj25;
                                                    str9 = str37;
                                                    str39 = str39;
                                                    str40 = str40;
                                                    str41 = str41;
                                                    b16 = -1;
                                                    break;
                                            }
                                            switch (b16) {
                                                case 0:
                                                    gVar = new v6.c.g();
                                                    bVar = gVar;
                                                    break;
                                                case 1:
                                                    gVar = new v6.c.h();
                                                    bVar = gVar;
                                                    break;
                                                case 2:
                                                    gVar = new v6.c.k();
                                                    bVar = gVar;
                                                    break;
                                                case 3:
                                                    gVar = new v6.c.l();
                                                    bVar = gVar;
                                                    break;
                                                case 4:
                                                    gVar = new v6.c.m();
                                                    bVar = gVar;
                                                    break;
                                                case 5:
                                                    gVar = new v6.c.e();
                                                    bVar = gVar;
                                                    break;
                                                case 6:
                                                    gVar = new v6.c.i();
                                                    bVar = gVar;
                                                    break;
                                                case 7:
                                                    gVar = new v6.c.j();
                                                    bVar = gVar;
                                                    break;
                                                case 8:
                                                    gVar = new v6.c.a();
                                                    bVar = gVar;
                                                    break;
                                                case 9:
                                                    gVar = new v6.c.f();
                                                    bVar = gVar;
                                                    break;
                                                case 10:
                                                    gVar = new v6.c.C3280c();
                                                    bVar = gVar;
                                                    break;
                                                case 11:
                                                    gVar = new v6.c.d();
                                                    bVar = gVar;
                                                    break;
                                                case 12:
                                                    gVar = new v6.c.a();
                                                    bVar = gVar;
                                                    break;
                                                case 13:
                                                    gVar = new v6.c.a();
                                                    bVar = gVar;
                                                    break;
                                                default:
                                                    bVar = null;
                                                    break;
                                            }
                                        } else {
                                            it18 = it18;
                                            obj7 = obj23;
                                            str38 = str38;
                                            obj8 = obj5;
                                            obj9 = obj25;
                                            str9 = str37;
                                            str39 = str39;
                                            str40 = str40;
                                            bVar = new v6.c.b();
                                            str41 = str41;
                                        }
                                        if (bVar == null) {
                                            obj5 = obj8;
                                            str37 = str9;
                                            obj25 = obj9;
                                            f19 = f19;
                                            obj23 = obj7;
                                        } else {
                                            Object obj26 = obj8;
                                            Object obj27 = obj7;
                                            if (bVar.f129472e == 1 && Float.isNaN(f19)) {
                                                float[] fArr2 = new float[2];
                                                float f22 = 1.0f / 99;
                                                double d14 = 0.0d;
                                                fHypot = 0.0f;
                                                double d15 = 0.0d;
                                                int i64 = 0;
                                                while (i64 < 100) {
                                                    float f24 = i64 * f22;
                                                    String str42 = str9;
                                                    Object obj28 = obj9;
                                                    double d16 = f24;
                                                    int i65 = i64;
                                                    r rVar11 = rVar3;
                                                    o6.c cVar2 = rVar11.f182995a;
                                                    float f25 = 0.0f;
                                                    float f26 = Float.NaN;
                                                    for (r rVar12 : arrayList2) {
                                                        r rVar13 = rVar11;
                                                        double d17 = d16;
                                                        o6.c cVar3 = rVar12.f182995a;
                                                        if (cVar3 != null) {
                                                            float f27 = rVar12.f182997c;
                                                            if (f27 < f24) {
                                                                cVar2 = cVar3;
                                                                f25 = f27;
                                                            } else if (Float.isNaN(f26)) {
                                                                f26 = rVar12.f182997c;
                                                            }
                                                        }
                                                        d16 = d17;
                                                        rVar11 = rVar13;
                                                    }
                                                    r rVar14 = rVar11;
                                                    double d18 = d16;
                                                    if (cVar2 != null) {
                                                        if (Float.isNaN(f26)) {
                                                            f26 = 1.0f;
                                                        }
                                                        float f28 = f26 - f25;
                                                        dA = (((float) cVar2.a((f24 - f25) / f28)) * f28) + f25;
                                                    } else {
                                                        dA = d18;
                                                    }
                                                    nVar.f182897j[0].c(dA, nVar.f182903p);
                                                    nVar.f182893f.c(dA, nVar.f182902o, nVar.f182903p, fArr2, 0);
                                                    if (i65 > 0) {
                                                        c14 = 0;
                                                        fHypot += (float) Math.hypot(d15 - ((double) fArr2[1]), d14 - ((double) fArr2[0]));
                                                    } else {
                                                        c14 = 0;
                                                    }
                                                    d14 = fArr2[c14];
                                                    d15 = fArr2[1];
                                                    i64 = i65 + 1;
                                                    str9 = str42;
                                                    obj9 = obj28;
                                                    rVar3 = rVar14;
                                                }
                                                str10 = str9;
                                                obj10 = obj9;
                                                rVar = rVar3;
                                            } else {
                                                str10 = str9;
                                                obj10 = obj9;
                                                rVar = rVar3;
                                                fHypot = f19;
                                            }
                                            bVar.f129469b = next9;
                                            nVar.f182913z.put(next9, bVar);
                                            obj5 = obj26;
                                            obj23 = obj27;
                                            f19 = fHypot;
                                            str37 = str10;
                                            obj25 = obj10;
                                            rVar3 = rVar;
                                        }
                                    }
                                    Object obj29 = obj23;
                                    String str43 = str38;
                                    Object obj30 = obj5;
                                    Object obj31 = obj25;
                                    String str44 = str6;
                                    String str45 = str37;
                                    String str46 = str39;
                                    String str47 = str40;
                                    String str48 = str41;
                                    Iterator<d> it19 = arrayList4.iterator();
                                    while (it19.hasNext()) {
                                        d next10 = it19.next();
                                        if (next10 instanceof f) {
                                            f fVar = (f) next10;
                                            HashMap<String, v6.c> map14 = nVar.f182913z;
                                            Iterator<String> it20 = map14.keySet().iterator();
                                            while (it20.hasNext()) {
                                                String next11 = it20.next();
                                                if (next11.startsWith(str44)) {
                                                    it = it19;
                                                    androidx.constraintlayout.widget.a aVar6 = fVar.f182781d.get(next11.substring(7));
                                                    if (aVar6 != null) {
                                                        Iterator<String> it21 = it20;
                                                        if (aVar6.f6151c == androidx.constraintlayout.widget.a.EnumC0083a.FLOAT_TYPE && (cVar = map14.get(next11)) != null) {
                                                            int i66 = fVar.f182778a;
                                                            int i67 = fVar.f182799f;
                                                            String str49 = fVar.f182800g;
                                                            int i68 = fVar.f182805l;
                                                            HashMap<String, v6.c> map15 = map14;
                                                            f fVar2 = fVar;
                                                            cVar.f129473f.add(new o6.f.b(i66, fVar.f182801h, fVar.f182802i, fVar.f182803j, aVar6.a()));
                                                            if (i68 != -1) {
                                                                cVar.f129472e = i68;
                                                            }
                                                            cVar.f129470c = i67;
                                                            cVar.b(aVar6);
                                                            cVar.f129471d = str49;
                                                            it19 = it;
                                                            it20 = it21;
                                                            map14 = map15;
                                                            fVar = fVar2;
                                                        } else {
                                                            it19 = it;
                                                            it20 = it21;
                                                        }
                                                    } else {
                                                        it19 = it;
                                                    }
                                                } else {
                                                    it = it19;
                                                    f fVar3 = fVar;
                                                    HashMap<String, v6.c> map16 = map14;
                                                    Iterator<String> it22 = it20;
                                                    switch (next11.hashCode()) {
                                                        case -1249320806:
                                                            obj30 = obj30;
                                                            obj29 = obj29;
                                                            str8 = str45;
                                                            obj6 = obj31;
                                                            b14 = next11.equals(obj30) ? (byte) 0 : (byte) -1;
                                                            break;
                                                        case -1249320805:
                                                            obj29 = obj29;
                                                            str8 = str45;
                                                            obj6 = obj31;
                                                            if (next11.equals(obj29)) {
                                                                obj30 = obj30;
                                                                b14 = 1;
                                                            } else {
                                                                obj30 = obj30;
                                                            }
                                                            break;
                                                        case -1225497657:
                                                            str8 = str45;
                                                            obj6 = obj31;
                                                            if (next11.equals(obj6)) {
                                                                obj30 = obj30;
                                                                obj29 = obj29;
                                                                b14 = 2;
                                                            } else {
                                                                obj30 = obj30;
                                                                obj29 = obj29;
                                                            }
                                                            break;
                                                        case -1225497656:
                                                            str8 = str45;
                                                            if (next11.equals(str8)) {
                                                                obj30 = obj30;
                                                                obj29 = obj29;
                                                                b14 = 3;
                                                                obj6 = obj31;
                                                            } else {
                                                                obj6 = obj31;
                                                            }
                                                            break;
                                                        case -1225497655:
                                                            if (next11.equals(str46)) {
                                                                b14 = 4;
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                            }
                                                            str8 = str45;
                                                            obj6 = obj31;
                                                            break;
                                                        case -1001078227:
                                                            if (next11.equals(str47)) {
                                                                b14 = 5;
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                            }
                                                            str8 = str45;
                                                            obj6 = obj31;
                                                            break;
                                                        case -908189618:
                                                            if (next11.equals(str43)) {
                                                                obj30 = obj30;
                                                                obj29 = obj29;
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                                b14 = 6;
                                                            } else {
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                            }
                                                            break;
                                                        case -908189617:
                                                            if (next11.equals(str48)) {
                                                                obj30 = obj30;
                                                                obj29 = obj29;
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                                b14 = 7;
                                                            } else {
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                            }
                                                            break;
                                                        case -40300674:
                                                            if (next11.equals("rotation")) {
                                                                obj30 = obj30;
                                                                obj29 = obj29;
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                                b14 = 8;
                                                            } else {
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                            }
                                                            break;
                                                        case -4379043:
                                                            if (next11.equals("elevation")) {
                                                                b15 = 9;
                                                                b14 = b15;
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                            }
                                                            str8 = str45;
                                                            obj6 = obj31;
                                                            break;
                                                        case 37232917:
                                                            if (next11.equals("transitionPathRotate")) {
                                                                b15 = 10;
                                                                b14 = b15;
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                            }
                                                            str8 = str45;
                                                            obj6 = obj31;
                                                            break;
                                                        case 92909918:
                                                            if (next11.equals("alpha")) {
                                                                b15 = Ascii.VT;
                                                                b14 = b15;
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                            }
                                                            str8 = str45;
                                                            obj6 = obj31;
                                                            break;
                                                        case 156108012:
                                                            if (next11.equals("waveOffset")) {
                                                                b15 = Ascii.FF;
                                                                b14 = b15;
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                            }
                                                            str8 = str45;
                                                            obj6 = obj31;
                                                            break;
                                                        case 1530034690:
                                                            if (next11.equals("wavePhase")) {
                                                                b15 = Ascii.CR;
                                                                b14 = b15;
                                                                str8 = str45;
                                                                obj6 = obj31;
                                                            }
                                                            str8 = str45;
                                                            obj6 = obj31;
                                                            break;
                                                        default:
                                                            str8 = str45;
                                                            obj6 = obj31;
                                                            break;
                                                    }
                                                    switch (b14) {
                                                        case 0:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182810q;
                                                            f15 = f14;
                                                            break;
                                                        case 1:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182811r;
                                                            f15 = f14;
                                                            break;
                                                        case 2:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182814u;
                                                            f15 = f14;
                                                            break;
                                                        case 3:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182815v;
                                                            f15 = f14;
                                                            break;
                                                        case 4:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182816w;
                                                            f15 = f14;
                                                            break;
                                                        case 5:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182804k;
                                                            f15 = f14;
                                                            break;
                                                        case 6:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182812s;
                                                            f15 = f14;
                                                            break;
                                                        case 7:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182813t;
                                                            f15 = f14;
                                                            break;
                                                        case 8:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182808o;
                                                            f15 = f14;
                                                            break;
                                                        case 9:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182807n;
                                                            f15 = f14;
                                                            break;
                                                        case 10:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182809p;
                                                            f15 = f14;
                                                            break;
                                                        case 11:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182806m;
                                                            f15 = f14;
                                                            break;
                                                        case 12:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182802i;
                                                            f15 = f14;
                                                            break;
                                                        case 13:
                                                            fVar = fVar3;
                                                            f14 = fVar.f182803j;
                                                            f15 = f14;
                                                            break;
                                                        default:
                                                            next11.startsWith(str44);
                                                            fVar = fVar3;
                                                            f15 = Float.NaN;
                                                            break;
                                                    }
                                                    if (Float.isNaN(f15)) {
                                                        str45 = str8;
                                                        obj30 = obj30;
                                                        obj29 = obj29;
                                                        obj31 = obj6;
                                                        it20 = it22;
                                                        map14 = map16;
                                                    } else {
                                                        map14 = map16;
                                                        v6.c cVar4 = map14.get(next11);
                                                        if (cVar4 == null) {
                                                            str45 = str8;
                                                            obj30 = obj30;
                                                            obj29 = obj29;
                                                            obj31 = obj6;
                                                            it20 = it22;
                                                        } else {
                                                            String str50 = str8;
                                                            int i69 = fVar.f182778a;
                                                            int i74 = fVar.f182799f;
                                                            obj30 = obj30;
                                                            String str51 = fVar.f182800g;
                                                            int i75 = fVar.f182805l;
                                                            obj29 = obj29;
                                                            f fVar4 = fVar;
                                                            cVar4.f129473f.add(new o6.f.b(i69, fVar.f182801h, fVar.f182802i, fVar.f182803j, f15));
                                                            if (i75 != -1) {
                                                                cVar4.f129472e = i75;
                                                            }
                                                            cVar4.f129470c = i74;
                                                            cVar4.f129471d = str51;
                                                            it19 = it;
                                                            obj31 = obj6;
                                                            it20 = it22;
                                                            map14 = map14;
                                                            fVar = fVar4;
                                                            str45 = str50;
                                                        }
                                                    }
                                                    it19 = it;
                                                }
                                            }
                                        }
                                        nVar = this;
                                        it19 = it19;
                                        obj31 = obj31;
                                        str45 = str45;
                                    }
                                    Iterator<v6.c> it23 = nVar.f182913z.values().iterator();
                                    while (it23.hasNext()) {
                                        it23.next().c();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str52 = strArr3[i58];
                            String str53 = str4;
                            int i76 = i58;
                            double[][] dArr7 = null;
                            double[] dArr8 = null;
                            int i77 = 0;
                            int i78 = 0;
                            while (i77 < i28) {
                                int i79 = i77;
                                if (rVarArr[i79].f183008n.containsKey(str52)) {
                                    if (dArr7 == null) {
                                        dArr8 = new double[i28];
                                        androidx.constraintlayout.widget.a aVar7 = rVarArr[i79].f183008n.get(str52);
                                        int iC = aVar7 == null ? 0 : aVar7.c();
                                        int[] iArr6 = new int[2];
                                        iArr6[i25] = iC;
                                        iArr6[0] = i28;
                                        dArr7 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
                                    }
                                    r rVar15 = rVarArr[i79];
                                    double[][] dArr9 = dArr7;
                                    dArr8[i78] = rVar15.f182997c;
                                    double[] dArr10 = dArr9[i78];
                                    androidx.constraintlayout.widget.a aVar8 = rVar15.f183008n.get(str52);
                                    if (aVar8 != null) {
                                        if (aVar8.c() == i25) {
                                            dArr10[0] = aVar8.a();
                                        } else {
                                            int iC2 = aVar8.c();
                                            float[] fArr3 = new float[iC2];
                                            aVar8.b(fArr3);
                                            int i84 = 0;
                                            int i85 = 0;
                                            while (i84 < iC2) {
                                                double[] dArr11 = dArr10;
                                                dArr11[i85] = fArr3[i84];
                                                i84++;
                                                dArr10 = dArr11;
                                                i85++;
                                                str52 = str52;
                                                dArr8 = dArr8;
                                            }
                                        }
                                    }
                                    str11 = str52;
                                    i78++;
                                    dArr7 = dArr9;
                                    dArr8 = dArr8;
                                } else {
                                    str11 = str52;
                                }
                                i77 = i79 + 1;
                                str19 = str19;
                                str21 = str21;
                                str52 = str11;
                                i25 = 1;
                            }
                            int i86 = i76 + 1;
                            nVar.f182897j[i86] = o6.b.a(nVar.f182892e, Arrays.copyOf(dArr8, i78), (double[][]) Arrays.copyOf(dArr7, i78));
                            i58 = i86;
                            str4 = str53;
                            i25 = 1;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(" start: x: ");
        r rVar = this.f182893f;
        sb3.append(rVar.f182999e);
        sb3.append(" y: ");
        sb3.append(rVar.f183000f);
        sb3.append(" end: x: ");
        r rVar2 = this.f182894g;
        sb3.append(rVar2.f182999e);
        sb3.append(" y: ");
        sb3.append(rVar2.f183000f);
        return sb3.toString();
    }
}
