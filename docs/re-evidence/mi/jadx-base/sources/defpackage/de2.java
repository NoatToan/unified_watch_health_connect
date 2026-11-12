package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class de2 implements o82.b, h0e, p57 {
    public final jte e;
    public final com.airbnb.lottie.model.layer.a f;
    public final float[] h;
    public final Paint i;
    public final o82<?, Float> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o82<?, Integer> f15429k;
    public final List<o82<?, Float>> l;
    public final o82<?, Float> m;
    public o82<ColorFilter, ColorFilter> n;
    public o82<Float, Float> o;
    public float p;
    public i67 q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f15427a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f15428b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final List<b> g = new ArrayList();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<slh> f15430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d2q f15431b;

        public b(d2q d2qVar) {
            this.f15430a = new ArrayList();
            this.f15431b = d2qVar;
        }
    }

    public de2(jte jteVar, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f, gb1 gb1Var, eb1 eb1Var, List<eb1> list, eb1 eb1Var2) {
        x1e x1eVar = new x1e(1);
        this.i = x1eVar;
        this.p = 0.0f;
        this.e = jteVar;
        this.f = aVar;
        x1eVar.setStyle(Paint.Style.STROKE);
        x1eVar.setStrokeCap(cap);
        x1eVar.setStrokeJoin(join);
        x1eVar.setStrokeMiter(f);
        this.f15429k = gb1Var.a();
        this.j = eb1Var.a();
        if (eb1Var2 == null) {
            this.m = null;
        } else {
            this.m = eb1Var2.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).a());
        }
        aVar.i(this.f15429k);
        aVar.i(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            aVar.i(this.l.get(i2));
        }
        o82<?, Float> o82Var = this.m;
        if (o82Var != null) {
            aVar.i(o82Var);
        }
        this.f15429k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.l.get(i3).a(this);
        }
        o82<?, Float> o82Var2 = this.m;
        if (o82Var2 != null) {
            o82Var2.a(this);
        }
        if (aVar.v() != null) {
            o82<Float, Float> o82VarA = aVar.v().a().a();
            this.o = o82VarA;
            o82VarA.a(this);
            aVar.i(this.o);
        }
        if (aVar.x() != null) {
            this.q = new i67(this, aVar, aVar.x());
        }
    }

    @Override // defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        w1e.a("StrokeContent#getBounds");
        this.f15428b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            b bVar = this.g.get(i);
            for (int i2 = 0; i2 < bVar.f15430a.size(); i2++) {
                this.f15428b.addPath(((slh) bVar.f15430a.get(i2)).getPath(), matrix);
            }
        }
        this.f15428b.computeBounds(this.d, false);
        float fP = ((ox9) this.j).p();
        RectF rectF2 = this.d;
        float f = fP / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        w1e.b("StrokeContent#getBounds");
    }

    public final void b(Matrix matrix) {
        w1e.a("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            w1e.b("StrokeContent#applyDashPattern");
            return;
        }
        float fG = emq.g(matrix);
        for (int i = 0; i < this.l.size(); i++) {
            this.h[i] = this.l.get(i).h().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.h;
            fArr3[i] = fArr3[i] * fG;
        }
        o82<?, Float> o82Var = this.m;
        this.i.setPathEffect(new DashPathEffect(this.h, o82Var == null ? 0.0f : fG * o82Var.h().floatValue()));
        w1e.b("StrokeContent#applyDashPattern");
    }

    @Override // defpackage.g0e
    public void c(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
        d5g.k(f0eVar, i, list, f0eVar2, this);
    }

    @Override // defpackage.p57
    public void d(Canvas canvas, Matrix matrix, int i) {
        w1e.a("StrokeContent#draw");
        if (emq.h(matrix)) {
            w1e.b("StrokeContent#draw");
            return;
        }
        this.i.setAlpha(d5g.c((int) ((((i / 255.0f) * ((lcd) this.f15429k).p()) / 100.0f) * 255.0f), 0, 255));
        this.i.setStrokeWidth(((ox9) this.j).p() * emq.g(matrix));
        if (this.i.getStrokeWidth() <= 0.0f) {
            w1e.b("StrokeContent#draw");
            return;
        }
        b(matrix);
        o82<ColorFilter, ColorFilter> o82Var = this.n;
        if (o82Var != null) {
            this.i.setColorFilter(o82Var.h());
        }
        o82<Float, Float> o82Var2 = this.o;
        if (o82Var2 != null) {
            float fFloatValue = o82Var2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.i.setMaskFilter(null);
            } else if (fFloatValue != this.p) {
                this.i.setMaskFilter(this.f.w(fFloatValue));
            }
            this.p = fFloatValue;
        }
        i67 i67Var = this.q;
        if (i67Var != null) {
            i67Var.a(this.i);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            if (bVar.f15431b != null) {
                i(canvas, bVar, matrix);
            } else {
                w1e.a("StrokeContent#buildPath");
                this.f15428b.reset();
                for (int size = bVar.f15430a.size() - 1; size >= 0; size--) {
                    this.f15428b.addPath(((slh) bVar.f15430a.get(size)).getPath(), matrix);
                }
                w1e.b("StrokeContent#buildPath");
                w1e.a("StrokeContent#drawPath");
                canvas.drawPath(this.f15428b, this.i);
                w1e.b("StrokeContent#drawPath");
            }
        }
        w1e.b("StrokeContent#draw");
    }

    @Override // o82.b
    public void e() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
        d2q d2qVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            hh4 hh4Var = list.get(size);
            if (hh4Var instanceof d2q) {
                d2q d2qVar2 = (d2q) hh4Var;
                if (d2qVar2.j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    d2qVar = d2qVar2;
                }
            }
        }
        if (d2qVar != null) {
            d2qVar.b(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            hh4 hh4Var2 = list2.get(size2);
            if (hh4Var2 instanceof d2q) {
                d2q d2qVar3 = (d2q) hh4Var2;
                if (d2qVar3.j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.g.add(bVar);
                    }
                    bVar = new b(d2qVar3);
                    d2qVar3.b(this);
                } else if (!(hh4Var2 instanceof slh)) {
                    if (bVar == null) {
                        bVar = new b(d2qVar);
                    }
                    bVar.f15430a.add((slh) hh4Var2);
                }
            } else if (!(hh4Var2 instanceof slh)) {
                if (bVar == null) {
                    bVar = new b(d2qVar);
                }
                bVar.f15430a.add((slh) hh4Var2);
            }
        }
        if (bVar != null) {
            this.g.add(bVar);
        }
    }

    @Override // defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        i67 i67Var;
        i67 i67Var2;
        i67 i67Var3;
        i67 i67Var4;
        i67 i67Var5;
        if (t == ste.d) {
            this.f15429k.n(yteVar);
            return;
        }
        if (t == ste.s) {
            this.j.n(yteVar);
            return;
        }
        if (t == ste.K) {
            o82<ColorFilter, ColorFilter> o82Var = this.n;
            if (o82Var != null) {
                this.f.G(o82Var);
            }
            if (yteVar == null) {
                this.n = null;
                return;
            }
            inq inqVar = new inq(yteVar);
            this.n = inqVar;
            inqVar.a(this);
            this.f.i(this.n);
            return;
        }
        if (t == ste.j) {
            o82<Float, Float> o82Var2 = this.o;
            if (o82Var2 != null) {
                o82Var2.n(yteVar);
                return;
            }
            inq inqVar2 = new inq(yteVar);
            this.o = inqVar2;
            inqVar2.a(this);
            this.f.i(this.o);
            return;
        }
        if (t == ste.e && (i67Var5 = this.q) != null) {
            i67Var5.b(yteVar);
            return;
        }
        if (t == ste.G && (i67Var4 = this.q) != null) {
            i67Var4.f(yteVar);
            return;
        }
        if (t == ste.H && (i67Var3 = this.q) != null) {
            i67Var3.c(yteVar);
            return;
        }
        if (t == ste.I && (i67Var2 = this.q) != null) {
            i67Var2.d(yteVar);
        } else {
            if (t != ste.J || (i67Var = this.q) == null) {
                return;
            }
            i67Var.g(yteVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011c  */
    public final void i(Canvas canvas, b bVar, Matrix matrix) {
        float f;
        w1e.a("StrokeContent#applyTrimPath");
        if (bVar.f15431b == null) {
            w1e.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f15428b.reset();
        for (int size = bVar.f15430a.size() - 1; size >= 0; size--) {
            this.f15428b.addPath(((slh) bVar.f15430a.get(size)).getPath(), matrix);
        }
        float fFloatValue = bVar.f15431b.i().h().floatValue() / 100.0f;
        float fFloatValue2 = bVar.f15431b.c().h().floatValue() / 100.0f;
        float fFloatValue3 = bVar.f15431b.h().h().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.f15428b, this.i);
            w1e.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f15427a.setPath(this.f15428b, false);
        float length = this.f15427a.getLength();
        while (this.f15427a.nextContour()) {
            length += this.f15427a.getLength();
        }
        float f2 = fFloatValue3 * length;
        float f3 = (fFloatValue * length) + f2;
        float fMin = Math.min((fFloatValue2 * length) + f2, (f3 + length) - 1.0f);
        float f4 = 0.0f;
        for (int size2 = bVar.f15430a.size() - 1; size2 >= 0; size2--) {
            this.c.set(((slh) bVar.f15430a.get(size2)).getPath());
            this.c.transform(matrix);
            this.f15427a.setPath(this.c, false);
            float length2 = this.f15427a.getLength();
            if (fMin > length) {
                float f5 = fMin - length;
                if (f5 >= f4 + length2 || f4 >= f5) {
                    f = f4 + length2;
                    if (f < f3 && f4 <= fMin) {
                        if (f > fMin || f3 >= f4) {
                            emq.a(this.c, f3 < f4 ? 0.0f : (f3 - f4) / length2, fMin > f ? 1.0f : (fMin - f4) / length2, 0.0f);
                            canvas.drawPath(this.c, this.i);
                        } else {
                            canvas.drawPath(this.c, this.i);
                        }
                    }
                } else {
                    emq.a(this.c, f3 > length ? (f3 - length) / length2 : 0.0f, Math.min(f5 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.c, this.i);
                }
            } else {
                f = f4 + length2;
                if (f < f3) {
                }
            }
            f4 += length2;
        }
        w1e.b("StrokeContent#applyTrimPath");
    }
}
