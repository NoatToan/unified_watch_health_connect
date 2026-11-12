package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class n8g {
    public HashMap<String, mxq> B;
    public HashMap<String, xwq> C;
    public HashMap<String, lvq> D;
    public m0e[] E;
    public int F;
    public int G;
    public View H;
    public int I;
    public float J;
    public Interpolator K;
    public boolean L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f27655b;
    public int c;
    public String e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public hd5[] f27656k;
    public hd5 l;
    public float p;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f27657r;
    public double[] s;
    public double[] t;
    public String[] u;
    public int[] v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f27654a = new Rect();
    public boolean d = false;
    public int f = -1;
    public q8g g = new q8g();
    public q8g h = new q8g();
    public m8g i = new m8g();
    public m8g j = new m8g();
    public float m = Float.NaN;
    public float n = 0.0f;
    public float o = 1.0f;
    public int w = 4;
    public float[] x = new float[4];
    public ArrayList<q8g> y = new ArrayList<>();
    public float[] z = new float[1];
    public ArrayList<qzd> A = new ArrayList<>();

    public class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ba7 f27658a;

        public a(ba7 ba7Var) {
            this.f27658a = ba7Var;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f27658a.a(f);
        }
    }

    public n8g(View view) {
        int i = qzd.f;
        this.F = i;
        this.G = i;
        this.H = null;
        this.I = i;
        this.J = Float.NaN;
        this.K = null;
        this.L = false;
        H(view);
    }

    public static Interpolator p(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            return new a(ba7.c(str));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    public void A(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((i4 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((i6 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    public void B(View view) {
        q8g q8gVar = this.g;
        q8gVar.c = 0.0f;
        q8gVar.d = 0.0f;
        this.L = true;
        q8gVar.u(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.h.u(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.i.m(view);
        this.j.m(view);
    }

    public void C(Rect rect, androidx.constraintlayout.widget.a aVar, int i, int i2) {
        int i3 = aVar.d;
        if (i3 != 0) {
            A(rect, this.f27654a, i3, i, i2);
            rect = this.f27654a;
        }
        q8g q8gVar = this.h;
        q8gVar.c = 1.0f;
        q8gVar.d = 1.0f;
        y(q8gVar);
        this.h.u(rect.left, rect.top, rect.width(), rect.height());
        this.h.a(aVar.H(this.c));
        this.j.l(rect, aVar, i3, this.c);
    }

    public void D(int i) {
        this.F = i;
    }

    public void E(View view) {
        q8g q8gVar = this.g;
        q8gVar.c = 0.0f;
        q8gVar.d = 0.0f;
        q8gVar.u(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.i.m(view);
    }

    public void F(hxq hxqVar, View view, int i, int i2, int i3) {
        q8g q8gVar = this.g;
        q8gVar.c = 0.0f;
        q8gVar.d = 0.0f;
        Rect rect = new Rect();
        if (i == 1) {
            int i4 = hxqVar.f20584b + hxqVar.d;
            rect.left = ((hxqVar.c + hxqVar.e) - hxqVar.b()) / 2;
            rect.top = i2 - ((i4 + hxqVar.a()) / 2);
            rect.right = rect.left + hxqVar.b();
            rect.bottom = rect.top + hxqVar.a();
        } else if (i == 2) {
            int i5 = hxqVar.f20584b + hxqVar.d;
            rect.left = i3 - (((hxqVar.c + hxqVar.e) + hxqVar.b()) / 2);
            rect.top = (i5 - hxqVar.a()) / 2;
            rect.right = rect.left + hxqVar.b();
            rect.bottom = rect.top + hxqVar.a();
        }
        this.g.u(rect.left, rect.top, rect.width(), rect.height());
        this.i.k(rect, view, i, hxqVar.f20583a);
    }

    public void G(Rect rect, androidx.constraintlayout.widget.a aVar, int i, int i2) {
        int i3 = aVar.d;
        if (i3 != 0) {
            A(rect, this.f27654a, i3, i, i2);
        }
        q8g q8gVar = this.g;
        q8gVar.c = 0.0f;
        q8gVar.d = 0.0f;
        y(q8gVar);
        this.g.u(rect.left, rect.top, rect.width(), rect.height());
        androidx.constraintlayout.widget.a.C0020a c0020aH = aVar.H(this.c);
        this.g.a(c0020aH);
        this.m = c0020aH.d.g;
        this.i.l(rect, aVar, i3, this.c);
        this.G = c0020aH.f.i;
        androidx.constraintlayout.widget.a.c cVar = c0020aH.d;
        this.I = cVar.f2029k;
        this.J = cVar.j;
        Context context = this.f27655b.getContext();
        androidx.constraintlayout.widget.a.c cVar2 = c0020aH.d;
        this.K = p(context, cVar2.m, cVar2.l, cVar2.n);
    }

    public void H(View view) {
        this.f27655b = view;
        this.c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.e = ((ConstraintLayout.LayoutParams) layoutParams).a();
        }
    }

    public void I(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        ConstraintAttribute constraintAttribute;
        mxq mxqVarH;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        xwq xwqVarG;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i3 = this.F;
        if (i3 != qzd.f) {
            this.g.f31228k = i3;
        }
        this.i.h(this.j, hashSet2);
        ArrayList<qzd> arrayList2 = this.A;
        if (arrayList2 != null) {
            arrayList = null;
            for (qzd qzdVar : arrayList2) {
                if (qzdVar instanceof i0e) {
                    i0e i0eVar = (i0e) qzdVar;
                    w(new q8g(i, i2, i0eVar, this.g, this.h));
                    int i4 = i0eVar.g;
                    if (i4 != qzd.f) {
                        this.f = i4;
                    }
                } else if (qzdVar instanceof tzd) {
                    qzdVar.d(hashSet3);
                } else if (qzdVar instanceof l0e) {
                    qzdVar.d(hashSet);
                } else if (qzdVar instanceof m0e) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((m0e) qzdVar);
                } else {
                    qzdVar.h(map);
                    qzdVar.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.E = (m0e[]) arrayList.toArray(new m0e[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.C = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (qzd qzdVar2 : this.A) {
                        HashMap<String, ConstraintAttribute> map2 = qzdVar2.e;
                        if (map2 != null && (constraintAttribute3 = map2.get(str2)) != null) {
                            sparseArray.append(qzdVar2.f32023a, constraintAttribute3);
                        }
                    }
                    xwqVarG = xwq.f(str, sparseArray);
                } else {
                    xwqVarG = xwq.g(str);
                }
                if (xwqVarG != null) {
                    xwqVarG.d(str);
                    this.C.put(str, xwqVarG);
                }
            }
            ArrayList<qzd> arrayList3 = this.A;
            if (arrayList3 != null) {
                for (qzd qzdVar3 : arrayList3) {
                    if (qzdVar3 instanceof rzd) {
                        qzdVar3.a(this.C);
                    }
                }
            }
            this.i.a(this.C, 0);
            this.j.a(this.C, 100);
            for (String str3 : this.C.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                xwq xwqVar = this.C.get(str3);
                if (xwqVar != null) {
                    xwqVar.e(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.B == null) {
                this.B = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.B.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        for (qzd qzdVar4 : this.A) {
                            HashMap<String, ConstraintAttribute> map3 = qzdVar4.e;
                            if (map3 != null && (constraintAttribute2 = map3.get(str5)) != null) {
                                sparseArray2.append(qzdVar4.f32023a, constraintAttribute2);
                            }
                        }
                        mxqVarH = mxq.g(str4, sparseArray2);
                    } else {
                        mxqVarH = mxq.h(str4, j);
                    }
                    if (mxqVarH != null) {
                        mxqVarH.d(str4);
                        this.B.put(str4, mxqVarH);
                    }
                }
            }
            ArrayList<qzd> arrayList4 = this.A;
            if (arrayList4 != null) {
                for (qzd qzdVar5 : arrayList4) {
                    if (qzdVar5 instanceof l0e) {
                        ((l0e) qzdVar5).U(this.B);
                    }
                }
            }
            for (String str6 : this.B.keySet()) {
                this.B.get(str6).e(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.y.size();
        int i5 = size + 2;
        q8g[] q8gVarArr = new q8g[i5];
        q8gVarArr[0] = this.g;
        q8gVarArr[size + 1] = this.h;
        if (this.y.size() > 0 && this.f == -1) {
            this.f = 0;
        }
        Iterator<q8g> it = this.y.iterator();
        int i6 = 1;
        while (it.hasNext()) {
            q8gVarArr[i6] = it.next();
            i6++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.h.o.keySet()) {
            if (this.g.o.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.u = strArr2;
        this.v = new int[strArr2.length];
        int i7 = 0;
        while (true) {
            strArr = this.u;
            if (i7 >= strArr.length) {
                break;
            }
            String str8 = strArr[i7];
            this.v[i7] = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                if (q8gVarArr[i8].o.containsKey(str8) && (constraintAttribute = q8gVarArr[i8].o.get(str8)) != null) {
                    int[] iArr = this.v;
                    iArr[i7] = iArr[i7] + constraintAttribute.h();
                    break;
                }
            }
            i7++;
        }
        boolean z = q8gVarArr[0].f31228k != qzd.f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i9 = 1; i9 < i5; i9++) {
            q8gVarArr[i9].d(q8gVarArr[i9 - 1], zArr, this.u, z);
        }
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                i10++;
            }
        }
        this.f27657r = new int[i10];
        int iMax = Math.max(2, i10);
        this.s = new double[iMax];
        this.t = new double[iMax];
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                this.f27657r[i12] = i13;
                i12++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, this.f27657r.length);
        double[] dArr2 = new double[i5];
        for (int i14 = 0; i14 < i5; i14++) {
            q8gVarArr[i14].e(dArr[i14], this.f27657r);
            dArr2[i14] = q8gVarArr[i14].c;
        }
        int i15 = 0;
        while (true) {
            int[] iArr2 = this.f27657r;
            if (i15 >= iArr2.length) {
                break;
            }
            if (iArr2[i15] < q8g.t.length) {
                String str9 = q8g.t[this.f27657r[i15]] + " [";
                for (int i16 = 0; i16 < i5; i16++) {
                    str9 = str9 + dArr[i16][i15];
                }
            }
            i15++;
        }
        this.f27656k = new hd5[this.u.length + 1];
        int i17 = 0;
        while (true) {
            String[] strArr3 = this.u;
            if (i17 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i17];
            int i18 = 0;
            int i19 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i18 < i5) {
                if (q8gVarArr[i18].n(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i5];
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, q8gVarArr[i18].l(str10));
                    }
                    q8g q8gVar = q8gVarArr[i18];
                    dArr3[i19] = q8gVar.c;
                    q8gVar.k(str10, dArr4[i19], 0);
                    i19++;
                }
                i18++;
                dArr = dArr;
            }
            i17++;
            this.f27656k[i17] = hd5.a(this.f, Arrays.copyOf(dArr3, i19), (double[][]) Arrays.copyOf(dArr4, i19));
            dArr = dArr;
        }
        this.f27656k[0] = hd5.a(this.f, dArr2, dArr);
        if (q8gVarArr[0].f31228k != qzd.f) {
            int[] iArr3 = new int[i5];
            double[] dArr5 = new double[i5];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, 2);
            for (int i20 = 0; i20 < i5; i20++) {
                q8g q8gVar2 = q8gVarArr[i20];
                iArr3[i20] = q8gVar2.f31228k;
                dArr5[i20] = q8gVar2.c;
                double[] dArr7 = dArr6[i20];
                dArr7[0] = q8gVar2.e;
                dArr7[1] = q8gVar2.f;
            }
            this.l = hd5.b(iArr3, dArr5, dArr6);
        }
        this.D = new HashMap<>();
        if (this.A != null) {
            float fS = Float.NaN;
            for (String str11 : hashSet3) {
                lvq lvqVarI = lvq.i(str11);
                if (lvqVarI != null) {
                    if (lvqVarI.h() && Float.isNaN(fS)) {
                        fS = s();
                    }
                    lvqVarI.f(str11);
                    this.D.put(str11, lvqVarI);
                }
            }
            for (qzd qzdVar6 : this.A) {
                if (qzdVar6 instanceof tzd) {
                    ((tzd) qzdVar6).Y(this.D);
                }
            }
            Iterator<lvq> it2 = this.D.values().iterator();
            while (it2.hasNext()) {
                it2.next().g(fS);
            }
        }
    }

    public void J(n8g n8gVar) {
        this.g.y(n8gVar, n8gVar.g);
        this.h.y(n8gVar, n8gVar.h);
    }

    public void a(qzd qzdVar) {
        this.A.add(qzdVar);
    }

    public void b(ArrayList<qzd> arrayList) {
        this.A.addAll(arrayList);
    }

    public int c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrH = this.f27656k[0].h();
        if (iArr != null) {
            Iterator<q8g> it = this.y.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().p;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < dArrH.length; i3++) {
            this.f27656k[0].d(dArrH[i3], this.s);
            this.g.h(dArrH[i3], this.f27657r, this.s, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    public void d(float[] fArr, int i) {
        double dA;
        float f = 1.0f;
        float f2 = 1.0f / (i - 1);
        HashMap<String, xwq> map = this.C;
        xwq xwqVar = map == null ? null : map.get(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X);
        HashMap<String, xwq> map2 = this.C;
        xwq xwqVar2 = map2 == null ? null : map2.get(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y);
        HashMap<String, lvq> map3 = this.D;
        lvq lvqVar = map3 == null ? null : map3.get(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X);
        HashMap<String, lvq> map4 = this.D;
        lvq lvqVar2 = map4 != null ? map4.get(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y) : null;
        int i2 = 0;
        while (i2 < i) {
            float fMin = i2 * f2;
            float f3 = this.o;
            float f4 = 0.0f;
            if (f3 != f) {
                float f5 = this.n;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, f);
                }
            }
            float f6 = fMin;
            double d = f6;
            ba7 ba7Var = this.g.f31226a;
            float f7 = Float.NaN;
            for (q8g q8gVar : this.y) {
                ba7 ba7Var2 = q8gVar.f31226a;
                double d2 = d;
                if (ba7Var2 != null) {
                    float f8 = q8gVar.c;
                    if (f8 < f6) {
                        f4 = f8;
                        ba7Var = ba7Var2;
                    } else if (Float.isNaN(f7)) {
                        f7 = q8gVar.c;
                    }
                }
                d = d2;
            }
            double d3 = d;
            if (ba7Var != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                float f9 = f7 - f4;
                dA = (((float) ba7Var.a((f6 - f4) / f9)) * f9) + f4;
            } else {
                dA = d3;
            }
            this.f27656k[0].d(dA, this.s);
            hd5 hd5Var = this.l;
            if (hd5Var != null) {
                double[] dArr = this.s;
                if (dArr.length > 0) {
                    hd5Var.d(dA, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.g.h(dA, this.f27657r, this.s, fArr, i3);
            if (lvqVar != null) {
                fArr[i3] = fArr[i3] + lvqVar.a(f6);
            } else if (xwqVar != null) {
                fArr[i3] = fArr[i3] + xwqVar.a(f6);
            }
            if (lvqVar2 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + lvqVar2.a(f6);
            } else if (xwqVar2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + xwqVar2.a(f6);
            }
            i2 = i4 + 1;
            f = 1.0f;
        }
    }

    public void e(float f, float[] fArr, int i) {
        this.f27656k[0].d(g(f, null), this.s);
        this.g.m(this.f27657r, this.s, fArr, i);
    }

    public void f(boolean z) {
        if (!"button".equals(ir5.d(this.f27655b)) || this.E == null) {
            return;
        }
        int i = 0;
        while (true) {
            m0e[] m0eVarArr = this.E;
            if (i >= m0eVarArr.length) {
                return;
            }
            m0eVarArr[i].y(z ? -100.0f : 100.0f, this.f27655b);
            i++;
        }
    }

    public final float g(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.o;
            if (f3 != 1.0d) {
                float f4 = this.n;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        ba7 ba7Var = this.g.f31226a;
        float f5 = Float.NaN;
        for (q8g q8gVar : this.y) {
            ba7 ba7Var2 = q8gVar.f31226a;
            if (ba7Var2 != null) {
                float f6 = q8gVar.c;
                if (f6 < f) {
                    ba7Var = ba7Var2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = q8gVar.c;
                }
            }
        }
        if (ba7Var != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) ba7Var.a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) ba7Var.b(d);
            }
        }
        return f;
    }

    public int h() {
        return this.g.l;
    }

    public void i(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f27656k[0].d(d, dArr);
        this.f27656k[0].g(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.g.i(d, this.f27657r, dArr, fArr, dArr2, fArr2);
    }

    public float j() {
        return this.p;
    }

    public float k() {
        return this.q;
    }

    public void l(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float fG = g(f, this.z);
        hd5[] hd5VarArr = this.f27656k;
        int i = 0;
        if (hd5VarArr == null) {
            q8g q8gVar = this.h;
            float f4 = q8gVar.e;
            q8g q8gVar2 = this.g;
            float f5 = f4 - q8gVar2.e;
            float f6 = q8gVar.f - q8gVar2.f;
            float f7 = (q8gVar.g - q8gVar2.g) + f5;
            float f8 = (q8gVar.h - q8gVar2.h) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            return;
        }
        double d = fG;
        hd5VarArr[0].g(d, this.t);
        this.f27656k[0].d(d, this.s);
        float f9 = this.z[0];
        while (true) {
            dArr = this.t;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f9);
            i++;
        }
        hd5 hd5Var = this.l;
        if (hd5Var == null) {
            this.g.w(f2, f3, fArr, this.f27657r, dArr, this.s);
            return;
        }
        double[] dArr2 = this.s;
        if (dArr2.length > 0) {
            hd5Var.d(d, dArr2);
            this.l.g(d, this.t);
            this.g.w(f2, f3, fArr, this.f27657r, this.t, this.s);
        }
    }

    public int m() {
        int iMax = this.g.f31227b;
        Iterator<q8g> it = this.y.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f31227b);
        }
        return Math.max(iMax, this.h.f31227b);
    }

    public float n() {
        return this.h.e;
    }

    public float o() {
        return this.h.f;
    }

    public q8g q(int i) {
        return this.y.get(i);
    }

    public void r(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float fG = g(f, this.z);
        HashMap<String, xwq> map = this.C;
        xwq xwqVar = map == null ? null : map.get(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X);
        HashMap<String, xwq> map2 = this.C;
        xwq xwqVar2 = map2 == null ? null : map2.get(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y);
        HashMap<String, xwq> map3 = this.C;
        xwq xwqVar3 = map3 == null ? null : map3.get("rotation");
        HashMap<String, xwq> map4 = this.C;
        xwq xwqVar4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, xwq> map5 = this.C;
        xwq xwqVar5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, lvq> map6 = this.D;
        lvq lvqVar = map6 == null ? null : map6.get(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X);
        HashMap<String, lvq> map7 = this.D;
        lvq lvqVar2 = map7 == null ? null : map7.get(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y);
        HashMap<String, lvq> map8 = this.D;
        lvq lvqVar3 = map8 == null ? null : map8.get("rotation");
        HashMap<String, lvq> map9 = this.D;
        lvq lvqVar4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, lvq> map10 = this.D;
        lvq lvqVar5 = map10 != null ? map10.get("scaleY") : null;
        koq koqVar = new koq();
        koqVar.b();
        koqVar.d(xwqVar3, fG);
        koqVar.h(xwqVar, xwqVar2, fG);
        koqVar.f(xwqVar4, xwqVar5, fG);
        koqVar.c(lvqVar3, fG);
        koqVar.g(lvqVar, lvqVar2, fG);
        koqVar.e(lvqVar4, lvqVar5, fG);
        hd5 hd5Var = this.l;
        if (hd5Var != null) {
            double[] dArr = this.s;
            if (dArr.length > 0) {
                double d = fG;
                hd5Var.d(d, dArr);
                this.l.g(d, this.t);
                this.g.w(f2, f3, fArr, this.f27657r, this.t, this.s);
            }
            koqVar.a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f27656k == null) {
            q8g q8gVar = this.h;
            float f4 = q8gVar.e;
            q8g q8gVar2 = this.g;
            float f5 = f4 - q8gVar2.e;
            lvq lvqVar6 = lvqVar5;
            float f6 = q8gVar.f - q8gVar2.f;
            lvq lvqVar7 = lvqVar4;
            float f7 = (q8gVar.g - q8gVar2.g) + f5;
            float f8 = (q8gVar.h - q8gVar2.h) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            koqVar.b();
            koqVar.d(xwqVar3, fG);
            koqVar.h(xwqVar, xwqVar2, fG);
            koqVar.f(xwqVar4, xwqVar5, fG);
            koqVar.c(lvqVar3, fG);
            koqVar.g(lvqVar, lvqVar2, fG);
            koqVar.e(lvqVar7, lvqVar6, fG);
            koqVar.a(f2, f3, i, i2, fArr);
            return;
        }
        double dG = g(fG, this.z);
        this.f27656k[0].g(dG, this.t);
        this.f27656k[0].d(dG, this.s);
        float f9 = this.z[0];
        while (true) {
            double[] dArr2 = this.t;
            if (i3 >= dArr2.length) {
                this.g.w(f2, f3, fArr, this.f27657r, dArr2, this.s);
                koqVar.a(f2, f3, i, i2, fArr);
                return;
            } else {
                dArr2[i3] = dArr2[i3] * ((double) f9);
                i3++;
            }
        }
    }

    public final float s() {
        char c;
        float fHypot;
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        float f2 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f3 = i * f;
            double dA = f3;
            ba7 ba7Var = this.g.f31226a;
            float f4 = Float.NaN;
            float f5 = 0.0f;
            for (q8g q8gVar : this.y) {
                ba7 ba7Var2 = q8gVar.f31226a;
                if (ba7Var2 != null) {
                    float f6 = q8gVar.c;
                    if (f6 < f3) {
                        ba7Var = ba7Var2;
                        f5 = f6;
                    } else if (Float.isNaN(f4)) {
                        f4 = q8gVar.c;
                    }
                }
            }
            if (ba7Var != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                float f7 = f4 - f5;
                dA = (((float) ba7Var.a((f3 - f5) / f7)) * f7) + f5;
            }
            this.f27656k[0].d(dA, this.s);
            float f8 = f2;
            int i2 = i;
            this.g.h(dA, this.f27657r, this.s, fArr, 0);
            if (i2 > 0) {
                c = 0;
                fHypot = (float) (((double) f8) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            } else {
                c = 0;
                fHypot = f8;
            }
            d = fArr[c];
            i = i2 + 1;
            f2 = fHypot;
            d2 = fArr[1];
        }
        return f2;
    }

    public float t() {
        return this.g.e;
    }

    public String toString() {
        return " start: x: " + this.g.e + " y: " + this.g.f + " end: x: " + this.h.e + " y: " + this.h.f;
    }

    public float u() {
        return this.g.f;
    }

    public View v() {
        return this.f27655b;
    }

    public final void w(q8g q8gVar) {
        int iBinarySearch = Collections.binarySearch(this.y, q8gVar);
        if (iBinarySearch == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(" KeyPath position \"");
            sb.append(q8gVar.d);
            sb.append("\" outside of range");
        }
        this.y.add((-iBinarySearch) - 1, q8gVar);
    }

    public boolean x(View view, float f, long j, szd szdVar) {
        mxq.d dVar;
        boolean zJ;
        float fG = g(f, null);
        int i = this.I;
        if (i != qzd.f) {
            float f2 = 1.0f / i;
            float fFloor = ((float) Math.floor(fG / f2)) * f2;
            float f3 = (fG % f2) / f2;
            if (!Float.isNaN(this.J)) {
                f3 = (f3 + this.J) % 1.0f;
            }
            Interpolator interpolator = this.K;
            fG = ((interpolator != null ? interpolator.getInterpolation(f3) : ((double) f3) > 0.5d ? 1.0f : 0.0f) * f2) + fFloor;
        }
        float f4 = fG;
        HashMap<String, xwq> map = this.C;
        if (map != null) {
            Iterator<xwq> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().h(view, f4);
            }
        }
        HashMap<String, mxq> map2 = this.B;
        if (map2 != null) {
            mxq.d dVar2 = null;
            boolean zI = false;
            for (mxq mxqVar : map2.values()) {
                if (mxqVar instanceof mxq.d) {
                    dVar2 = (mxq.d) mxqVar;
                } else {
                    zI |= mxqVar.i(view, f4, j, szdVar);
                }
            }
            zJ = zI;
            dVar = dVar2;
        } else {
            dVar = null;
            zJ = false;
        }
        hd5[] hd5VarArr = this.f27656k;
        int i2 = 1;
        if (hd5VarArr != null) {
            double d = f4;
            hd5VarArr[0].d(d, this.s);
            this.f27656k[0].g(d, this.t);
            hd5 hd5Var = this.l;
            if (hd5Var != null) {
                double[] dArr = this.s;
                if (dArr.length > 0) {
                    hd5Var.d(d, dArr);
                    this.l.g(d, this.t);
                }
            }
            if (!this.L) {
                this.g.x(f4, view, this.f27657r, this.s, this.t, null, this.d);
                this.d = false;
            }
            if (this.G != qzd.f) {
                if (this.H == null) {
                    this.H = ((View) view.getParent()).findViewById(this.G);
                }
                View view2 = this.H;
                if (view2 != null) {
                    float top = (view2.getTop() + this.H.getBottom()) / 2.0f;
                    float left = (this.H.getLeft() + this.H.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left2 = left - view.getLeft();
                        float top2 = top - view.getTop();
                        view.setPivotX(left2);
                        view.setPivotY(top2);
                    }
                }
            }
            HashMap<String, xwq> map3 = this.C;
            if (map3 != null) {
                for (xwq xwqVar : map3.values()) {
                    if (xwqVar instanceof xwq.d) {
                        double[] dArr2 = this.t;
                        if (dArr2.length > 1) {
                            ((xwq.d) xwqVar).i(view, f4, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.t;
                zJ |= dVar.j(view, szdVar, f4, j, dArr3[0], dArr3[1]);
            }
            int i3 = i2;
            while (true) {
                hd5[] hd5VarArr2 = this.f27656k;
                if (i3 >= hd5VarArr2.length) {
                    break;
                }
                hd5VarArr2[i3].e(d, this.x);
                ke5.b(this.g.o.get(this.u[i3 - 1]), view, this.x);
                i3++;
            }
            m8g m8gVar = this.i;
            if (m8gVar.f25884b == 0) {
                if (f4 <= 0.0f) {
                    view.setVisibility(m8gVar.c);
                } else if (f4 >= 1.0f) {
                    view.setVisibility(this.j.c);
                } else if (this.j.c != m8gVar.c) {
                    view.setVisibility(0);
                }
            }
            if (this.E != null) {
                int i4 = 0;
                while (true) {
                    m0e[] m0eVarArr = this.E;
                    if (i4 >= m0eVarArr.length) {
                        break;
                    }
                    m0eVarArr[i4].y(f4, view);
                    i4++;
                }
            }
        } else {
            i2 = 1;
            q8g q8gVar = this.g;
            float f5 = q8gVar.e;
            q8g q8gVar2 = this.h;
            float f6 = f5 + ((q8gVar2.e - f5) * f4);
            float f7 = q8gVar.f;
            float f8 = f7 + ((q8gVar2.f - f7) * f4);
            float f9 = q8gVar.g;
            float f10 = q8gVar2.g;
            float f11 = q8gVar.h;
            float f12 = q8gVar2.h;
            float f13 = f6 + 0.5f;
            int i5 = (int) f13;
            float f14 = f8 + 0.5f;
            int i6 = (int) f14;
            int i7 = (int) (f13 + ((f10 - f9) * f4) + f9);
            int i8 = (int) (f14 + ((f12 - f11) * f4) + f11);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (f10 != f9 || f12 != f11 || this.d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                this.d = false;
            }
            view.layout(i5, i6, i7, i8);
        }
        HashMap<String, lvq> map4 = this.D;
        if (map4 != null) {
            for (lvq lvqVar : map4.values()) {
                if (lvqVar instanceof lvq.d) {
                    double[] dArr4 = this.t;
                    ((lvq.d) lvqVar).k(view, f4, dArr4[0], dArr4[i2]);
                } else {
                    lvqVar.j(view, f4);
                }
            }
        }
        return zJ;
    }

    public final void y(q8g q8gVar) {
        q8gVar.u((int) this.f27655b.getX(), (int) this.f27655b.getY(), this.f27655b.getWidth(), this.f27655b.getHeight());
    }

    public void z() {
        this.d = true;
    }
}
