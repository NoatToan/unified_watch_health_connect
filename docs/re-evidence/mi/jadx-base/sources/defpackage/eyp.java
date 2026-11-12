package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.model.layer.a;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class eyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f17198a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f17199b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public o82<PointF, PointF> f;
    public o82<?, PointF> g;
    public o82<pbl, pbl> h;
    public o82<Float, Float> i;
    public o82<Integer, Integer> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ox9 f17200k;
    public ox9 l;
    public o82<?, Float> m;
    public o82<?, Float> n;

    public eyp(qb1 qb1Var) {
        this.f = qb1Var.c() == null ? null : qb1Var.c().a();
        this.g = qb1Var.f() == null ? null : qb1Var.f().a();
        this.h = qb1Var.h() == null ? null : qb1Var.h().a();
        this.i = qb1Var.g() == null ? null : qb1Var.g().a();
        ox9 ox9Var = qb1Var.i() == null ? null : (ox9) qb1Var.i().a();
        this.f17200k = ox9Var;
        if (ox9Var != null) {
            this.f17199b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.f17199b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.l = qb1Var.j() == null ? null : (ox9) qb1Var.j().a();
        if (qb1Var.e() != null) {
            this.j = qb1Var.e().a();
        }
        if (qb1Var.k() != null) {
            this.m = qb1Var.k().a();
        } else {
            this.m = null;
        }
        if (qb1Var.d() != null) {
            this.n = qb1Var.d().a();
        } else {
            this.n = null;
        }
    }

    public void a(a aVar) {
        aVar.i(this.j);
        aVar.i(this.m);
        aVar.i(this.n);
        aVar.i(this.f);
        aVar.i(this.g);
        aVar.i(this.h);
        aVar.i(this.i);
        aVar.i(this.f17200k);
        aVar.i(this.l);
    }

    public void b(o82.b bVar) {
        o82<Integer, Integer> o82Var = this.j;
        if (o82Var != null) {
            o82Var.a(bVar);
        }
        o82<?, Float> o82Var2 = this.m;
        if (o82Var2 != null) {
            o82Var2.a(bVar);
        }
        o82<?, Float> o82Var3 = this.n;
        if (o82Var3 != null) {
            o82Var3.a(bVar);
        }
        o82<PointF, PointF> o82Var4 = this.f;
        if (o82Var4 != null) {
            o82Var4.a(bVar);
        }
        o82<?, PointF> o82Var5 = this.g;
        if (o82Var5 != null) {
            o82Var5.a(bVar);
        }
        o82<pbl, pbl> o82Var6 = this.h;
        if (o82Var6 != null) {
            o82Var6.a(bVar);
        }
        o82<Float, Float> o82Var7 = this.i;
        if (o82Var7 != null) {
            o82Var7.a(bVar);
        }
        ox9 ox9Var = this.f17200k;
        if (ox9Var != null) {
            ox9Var.a(bVar);
        }
        ox9 ox9Var2 = this.l;
        if (ox9Var2 != null) {
            ox9Var2.a(bVar);
        }
    }

    public <T> boolean c(T t, yte<T> yteVar) {
        if (t == ste.f) {
            o82<PointF, PointF> o82Var = this.f;
            if (o82Var == null) {
                this.f = new inq(yteVar, new PointF());
                return true;
            }
            o82Var.n(yteVar);
            return true;
        }
        if (t == ste.g) {
            o82<?, PointF> o82Var2 = this.g;
            if (o82Var2 == null) {
                this.g = new inq(yteVar, new PointF());
                return true;
            }
            o82Var2.n(yteVar);
            return true;
        }
        if (t == ste.h) {
            o82<?, PointF> o82Var3 = this.g;
            if (o82Var3 instanceof g7n) {
                ((g7n) o82Var3).r(yteVar);
                return true;
            }
        }
        if (t == ste.i) {
            o82<?, PointF> o82Var4 = this.g;
            if (o82Var4 instanceof g7n) {
                ((g7n) o82Var4).s(yteVar);
                return true;
            }
        }
        if (t == ste.o) {
            o82<pbl, pbl> o82Var5 = this.h;
            if (o82Var5 == null) {
                this.h = new inq(yteVar, new pbl());
                return true;
            }
            o82Var5.n(yteVar);
            return true;
        }
        if (t == ste.p) {
            o82<Float, Float> o82Var6 = this.i;
            if (o82Var6 == null) {
                this.i = new inq(yteVar, Float.valueOf(0.0f));
                return true;
            }
            o82Var6.n(yteVar);
            return true;
        }
        if (t == ste.c) {
            o82<Integer, Integer> o82Var7 = this.j;
            if (o82Var7 == null) {
                this.j = new inq(yteVar, 100);
                return true;
            }
            o82Var7.n(yteVar);
            return true;
        }
        if (t == ste.C) {
            o82<?, Float> o82Var8 = this.m;
            if (o82Var8 == null) {
                this.m = new inq(yteVar, Float.valueOf(100.0f));
                return true;
            }
            o82Var8.n(yteVar);
            return true;
        }
        if (t == ste.D) {
            o82<?, Float> o82Var9 = this.n;
            if (o82Var9 == null) {
                this.n = new inq(yteVar, Float.valueOf(100.0f));
                return true;
            }
            o82Var9.n(yteVar);
            return true;
        }
        if (t == ste.q) {
            if (this.f17200k == null) {
                this.f17200k = new ox9(Collections.singletonList(new e1e(Float.valueOf(0.0f))));
            }
            this.f17200k.n(yteVar);
            return true;
        }
        if (t != ste.f33971r) {
            return false;
        }
        if (this.l == null) {
            this.l = new ox9(Collections.singletonList(new e1e(Float.valueOf(0.0f))));
        }
        this.l.n(yteVar);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public o82<?, Float> e() {
        return this.n;
    }

    public Matrix f() {
        PointF pointFH;
        PointF pointFH2;
        this.f17198a.reset();
        o82<?, PointF> o82Var = this.g;
        if (o82Var != null && (pointFH2 = o82Var.h()) != null) {
            float f = pointFH2.x;
            if (f != 0.0f || pointFH2.y != 0.0f) {
                this.f17198a.preTranslate(f, pointFH2.y);
            }
        }
        o82<Float, Float> o82Var2 = this.i;
        if (o82Var2 != null) {
            float fFloatValue = o82Var2 instanceof inq ? o82Var2.h().floatValue() : ((ox9) o82Var2).p();
            if (fFloatValue != 0.0f) {
                this.f17198a.preRotate(fFloatValue);
            }
        }
        ox9 ox9Var = this.f17200k;
        if (ox9Var != null) {
            ox9 ox9Var2 = this.l;
            float fCos = ox9Var2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-ox9Var2.p()) + 90.0f));
            ox9 ox9Var3 = this.l;
            float fSin = ox9Var3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-ox9Var3.p()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(ox9Var.p()));
            d();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f17199b.setValues(fArr);
            d();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.c.setValues(fArr2);
            d();
            float[] fArr3 = this.e;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.c.preConcat(this.f17199b);
            this.d.preConcat(this.c);
            this.f17198a.preConcat(this.d);
        }
        o82<pbl, pbl> o82Var3 = this.h;
        if (o82Var3 != null) {
            pbl pblVarH = o82Var3.h();
            if (pblVarH.b() != 1.0f || pblVarH.c() != 1.0f) {
                this.f17198a.preScale(pblVarH.b(), pblVarH.c());
            }
        }
        o82<PointF, PointF> o82Var4 = this.f;
        if (o82Var4 != null && (((pointFH = o82Var4.h()) != null && pointFH.x != 0.0f) || pointFH.y != 0.0f)) {
            this.f17198a.preTranslate(-pointFH.x, -pointFH.y);
        }
        return this.f17198a;
    }

    public Matrix g(float f) {
        o82<?, PointF> o82Var = this.g;
        PointF pointFH = o82Var == null ? null : o82Var.h();
        o82<pbl, pbl> o82Var2 = this.h;
        pbl pblVarH = o82Var2 == null ? null : o82Var2.h();
        this.f17198a.reset();
        if (pointFH != null) {
            this.f17198a.preTranslate(pointFH.x * f, pointFH.y * f);
        }
        if (pblVarH != null) {
            double d = f;
            this.f17198a.preScale((float) Math.pow(pblVarH.b(), d), (float) Math.pow(pblVarH.c(), d));
        }
        o82<Float, Float> o82Var3 = this.i;
        if (o82Var3 != null) {
            float fFloatValue = o82Var3.h().floatValue();
            o82<PointF, PointF> o82Var4 = this.f;
            PointF pointFH2 = o82Var4 != null ? o82Var4.h() : null;
            this.f17198a.preRotate(fFloatValue * f, pointFH2 == null ? 0.0f : pointFH2.x, pointFH2 != null ? pointFH2.y : 0.0f);
        }
        return this.f17198a;
    }

    public o82<?, Integer> h() {
        return this.j;
    }

    public o82<?, Float> i() {
        return this.m;
    }

    public void j(float f) {
        o82<Integer, Integer> o82Var = this.j;
        if (o82Var != null) {
            o82Var.m(f);
        }
        o82<?, Float> o82Var2 = this.m;
        if (o82Var2 != null) {
            o82Var2.m(f);
        }
        o82<?, Float> o82Var3 = this.n;
        if (o82Var3 != null) {
            o82Var3.m(f);
        }
        o82<PointF, PointF> o82Var4 = this.f;
        if (o82Var4 != null) {
            o82Var4.m(f);
        }
        o82<?, PointF> o82Var5 = this.g;
        if (o82Var5 != null) {
            o82Var5.m(f);
        }
        o82<pbl, pbl> o82Var6 = this.h;
        if (o82Var6 != null) {
            o82Var6.m(f);
        }
        o82<Float, Float> o82Var7 = this.i;
        if (o82Var7 != null) {
            o82Var7.m(f);
        }
        ox9 ox9Var = this.f17200k;
        if (ox9Var != null) {
            ox9Var.m(f);
        }
        ox9 ox9Var2 = this.l;
        if (ox9Var2 != null) {
            ox9Var2.m(f);
        }
    }
}
