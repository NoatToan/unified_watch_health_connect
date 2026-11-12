package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k3b implements p57, o82.b, h0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23384b;
    public final a c;
    public final LongSparseArray<LinearGradient> d = new LongSparseArray<>();
    public final LongSparseArray<RadialGradient> e = new LongSparseArray<>();
    public final Path f;
    public final Paint g;
    public final RectF h;
    public final List<slh> i;
    public final GradientType j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o82<f3b, f3b> f23385k;
    public final o82<Integer, Integer> l;
    public final o82<PointF, PointF> m;
    public final o82<PointF, PointF> n;
    public o82<ColorFilter, ColorFilter> o;
    public inq p;
    public final jte q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f23386r;
    public o82<Float, Float> s;
    public float t;
    public i67 u;

    public k3b(jte jteVar, lse lseVar, a aVar, j3b j3bVar) {
        Path path = new Path();
        this.f = path;
        this.g = new x1e(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = aVar;
        this.f23383a = j3bVar.f();
        this.f23384b = j3bVar.i();
        this.q = jteVar;
        this.j = j3bVar.e();
        path.setFillType(j3bVar.c());
        this.f23386r = (int) (lseVar.d() / 32.0f);
        o82<f3b, f3b> o82VarA = j3bVar.d().a();
        this.f23385k = o82VarA;
        o82VarA.a(this);
        aVar.i(o82VarA);
        o82<Integer, Integer> o82VarA2 = j3bVar.g().a();
        this.l = o82VarA2;
        o82VarA2.a(this);
        aVar.i(o82VarA2);
        o82<PointF, PointF> o82VarA3 = j3bVar.h().a();
        this.m = o82VarA3;
        o82VarA3.a(this);
        aVar.i(o82VarA3);
        o82<PointF, PointF> o82VarA4 = j3bVar.b().a();
        this.n = o82VarA4;
        o82VarA4.a(this);
        aVar.i(o82VarA4);
        if (aVar.v() != null) {
            o82<Float, Float> o82VarA5 = aVar.v().a().a();
            this.s = o82VarA5;
            o82VarA5.a(this);
            aVar.i(this.s);
        }
        if (aVar.x() != null) {
            this.u = new i67(this, aVar, aVar.x());
        }
    }

    private int[] b(int[] iArr) {
        inq inqVar = this.p;
        if (inqVar != null) {
            Integer[] numArr = (Integer[]) inqVar.h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int iRound = Math.round(this.m.f() * this.f23386r);
        int iRound2 = Math.round(this.n.f() * this.f23386r);
        int iRound3 = Math.round(this.f23385k.f() * this.f23386r);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private LinearGradient j() {
        long jI = i();
        LinearGradient linearGradient = this.d.get(jI);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFH = this.m.h();
        PointF pointFH2 = this.n.h();
        f3b f3bVarH = this.f23385k.h();
        LinearGradient linearGradient2 = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, b(f3bVarH.c()), f3bVarH.d(), Shader.TileMode.CLAMP);
        this.d.put(jI, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient k() {
        long jI = i();
        RadialGradient radialGradient = this.e.get(jI);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFH = this.m.h();
        PointF pointFH2 = this.n.h();
        f3b f3bVarH = this.f23385k.h();
        int[] iArrB = b(f3bVarH.c());
        float[] fArrD = f3bVarH.d();
        float f = pointFH.x;
        float f2 = pointFH.y;
        float fHypot = (float) Math.hypot(pointFH2.x - f, pointFH2.y - f2);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArrB, fArrD, Shader.TileMode.CLAMP);
        this.e.put(jI, radialGradient2);
        return radialGradient2;
    }

    @Override // defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(this.i.get(i).getPath(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.g0e
    public void c(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
        d5g.k(f0eVar, i, list, f0eVar2, this);
    }

    @Override // defpackage.p57
    public void d(Canvas canvas, Matrix matrix, int i) {
        if (this.f23384b) {
            return;
        }
        w1e.a("GradientFillContent#draw");
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(this.i.get(i2).getPath(), matrix);
        }
        this.f.computeBounds(this.h, false);
        Shader shaderJ = this.j == GradientType.LINEAR ? j() : k();
        shaderJ.setLocalMatrix(matrix);
        this.g.setShader(shaderJ);
        o82<ColorFilter, ColorFilter> o82Var = this.o;
        if (o82Var != null) {
            this.g.setColorFilter(o82Var.h());
        }
        o82<Float, Float> o82Var2 = this.s;
        if (o82Var2 != null) {
            float fFloatValue = o82Var2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.g.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                this.g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        i67 i67Var = this.u;
        if (i67Var != null) {
            i67Var.a(this.g);
        }
        this.g.setAlpha(d5g.c((int) ((((i / 255.0f) * this.l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f, this.g);
        w1e.b("GradientFillContent#draw");
    }

    @Override // o82.b
    public void e() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
        for (int i = 0; i < list2.size(); i++) {
            hh4 hh4Var = list2.get(i);
            if (hh4Var instanceof slh) {
                this.i.add((slh) hh4Var);
            }
        }
    }

    @Override // defpackage.hh4
    public String getName() {
        return this.f23383a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        i67 i67Var;
        i67 i67Var2;
        i67 i67Var3;
        i67 i67Var4;
        i67 i67Var5;
        if (t == ste.d) {
            this.l.n(yteVar);
            return;
        }
        if (t == ste.K) {
            o82<ColorFilter, ColorFilter> o82Var = this.o;
            if (o82Var != null) {
                this.c.G(o82Var);
            }
            if (yteVar == null) {
                this.o = null;
                return;
            }
            inq inqVar = new inq(yteVar);
            this.o = inqVar;
            inqVar.a(this);
            this.c.i(this.o);
            return;
        }
        if (t == ste.L) {
            inq inqVar2 = this.p;
            if (inqVar2 != null) {
                this.c.G(inqVar2);
            }
            if (yteVar == null) {
                this.p = null;
                return;
            }
            this.d.clear();
            this.e.clear();
            inq inqVar3 = new inq(yteVar);
            this.p = inqVar3;
            inqVar3.a(this);
            this.c.i(this.p);
            return;
        }
        if (t == ste.j) {
            o82<Float, Float> o82Var2 = this.s;
            if (o82Var2 != null) {
                o82Var2.n(yteVar);
                return;
            }
            inq inqVar4 = new inq(yteVar);
            this.s = inqVar4;
            inqVar4.a(this);
            this.c.i(this.s);
            return;
        }
        if (t == ste.e && (i67Var5 = this.u) != null) {
            i67Var5.b(yteVar);
            return;
        }
        if (t == ste.G && (i67Var4 = this.u) != null) {
            i67Var4.f(yteVar);
            return;
        }
        if (t == ste.H && (i67Var3 = this.u) != null) {
            i67Var3.c(yteVar);
            return;
        }
        if (t == ste.I && (i67Var2 = this.u) != null) {
            i67Var2.d(yteVar);
        } else {
            if (t != ste.J || (i67Var = this.u) == null) {
                return;
            }
            i67Var.g(yteVar);
        }
    }
}
