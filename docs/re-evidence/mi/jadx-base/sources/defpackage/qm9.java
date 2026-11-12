package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class qm9 implements p57, o82.b, h0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f31652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f31653b;
    public final a c;
    public final String d;
    public final boolean e;
    public final List<slh> f;
    public final o82<Integer, Integer> g;
    public final o82<Integer, Integer> h;
    public o82<ColorFilter, ColorFilter> i;
    public final jte j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o82<Float, Float> f31654k;
    public float l;
    public i67 m;

    public qm9(jte jteVar, a aVar, w2m w2mVar) {
        Path path = new Path();
        this.f31652a = path;
        this.f31653b = new x1e(1);
        this.f = new ArrayList();
        this.c = aVar;
        this.d = w2mVar.d();
        this.e = w2mVar.f();
        this.j = jteVar;
        if (aVar.v() != null) {
            o82<Float, Float> o82VarA = aVar.v().a().a();
            this.f31654k = o82VarA;
            o82VarA.a(this);
            aVar.i(this.f31654k);
        }
        if (aVar.x() != null) {
            this.m = new i67(this, aVar, aVar.x());
        }
        if (w2mVar.b() == null || w2mVar.e() == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(w2mVar.c());
        o82<Integer, Integer> o82VarA2 = w2mVar.b().a();
        this.g = o82VarA2;
        o82VarA2.a(this);
        aVar.i(o82VarA2);
        o82<Integer, Integer> o82VarA3 = w2mVar.e().a();
        this.h = o82VarA3;
        o82VarA3.a(this);
        aVar.i(o82VarA3);
    }

    @Override // defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f31652a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.f31652a.addPath(this.f.get(i).getPath(), matrix);
        }
        this.f31652a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.g0e
    public void c(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
        d5g.k(f0eVar, i, list, f0eVar2, this);
    }

    @Override // defpackage.p57
    public void d(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        w1e.a("FillContent#draw");
        this.f31653b.setColor((d5g.c((int) ((((i / 255.0f) * this.h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((s44) this.g).p() & 16777215));
        o82<ColorFilter, ColorFilter> o82Var = this.i;
        if (o82Var != null) {
            this.f31653b.setColorFilter(o82Var.h());
        }
        o82<Float, Float> o82Var2 = this.f31654k;
        if (o82Var2 != null) {
            float fFloatValue = o82Var2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f31653b.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                this.f31653b.setMaskFilter(this.c.w(fFloatValue));
            }
            this.l = fFloatValue;
        }
        i67 i67Var = this.m;
        if (i67Var != null) {
            i67Var.a(this.f31653b);
        }
        this.f31652a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.f31652a.addPath(this.f.get(i2).getPath(), matrix);
        }
        canvas.drawPath(this.f31652a, this.f31653b);
        w1e.b("FillContent#draw");
    }

    @Override // o82.b
    public void e() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
        for (int i = 0; i < list2.size(); i++) {
            hh4 hh4Var = list2.get(i);
            if (hh4Var instanceof slh) {
                this.f.add((slh) hh4Var);
            }
        }
    }

    @Override // defpackage.hh4
    public String getName() {
        return this.d;
    }

    @Override // defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        i67 i67Var;
        i67 i67Var2;
        i67 i67Var3;
        i67 i67Var4;
        i67 i67Var5;
        if (t == ste.f33968a) {
            this.g.n(yteVar);
            return;
        }
        if (t == ste.d) {
            this.h.n(yteVar);
            return;
        }
        if (t == ste.K) {
            o82<ColorFilter, ColorFilter> o82Var = this.i;
            if (o82Var != null) {
                this.c.G(o82Var);
            }
            if (yteVar == null) {
                this.i = null;
                return;
            }
            inq inqVar = new inq(yteVar);
            this.i = inqVar;
            inqVar.a(this);
            this.c.i(this.i);
            return;
        }
        if (t == ste.j) {
            o82<Float, Float> o82Var2 = this.f31654k;
            if (o82Var2 != null) {
                o82Var2.n(yteVar);
                return;
            }
            inq inqVar2 = new inq(yteVar);
            this.f31654k = inqVar2;
            inqVar2.a(this);
            this.c.i(this.f31654k);
            return;
        }
        if (t == ste.e && (i67Var5 = this.m) != null) {
            i67Var5.b(yteVar);
            return;
        }
        if (t == ste.G && (i67Var4 = this.m) != null) {
            i67Var4.f(yteVar);
            return;
        }
        if (t == ste.H && (i67Var3 = this.m) != null) {
            i67Var3.c(yteVar);
            return;
        }
        if (t == ste.I && (i67Var2 = this.m) != null) {
            i67Var2.d(yteVar);
        } else {
            if (t != ste.J || (i67Var = this.m) == null) {
                return;
            }
            i67Var.g(yteVar);
        }
    }
}
