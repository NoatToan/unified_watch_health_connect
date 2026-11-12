package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.a;

/* JADX INFO: loaded from: classes.dex */
public class slo extends de2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f33767r;
    public final String s;
    public final boolean t;
    public final o82<Integer, Integer> u;
    public o82<ColorFilter, ColorFilter> v;

    public slo(jte jteVar, a aVar, ShapeStroke shapeStroke) {
        super(jteVar, aVar, shapeStroke.b().toPaintCap(), shapeStroke.e().toPaintJoin(), shapeStroke.g(), shapeStroke.i(), shapeStroke.j(), shapeStroke.f(), shapeStroke.d());
        this.f33767r = aVar;
        this.s = shapeStroke.h();
        this.t = shapeStroke.k();
        o82<Integer, Integer> o82VarA = shapeStroke.c().a();
        this.u = o82VarA;
        o82VarA.a(this);
        aVar.i(o82VarA);
    }

    @Override // defpackage.de2, defpackage.p57
    public void d(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        this.i.setColor(((s44) this.u).p());
        o82<ColorFilter, ColorFilter> o82Var = this.v;
        if (o82Var != null) {
            this.i.setColorFilter(o82Var.h());
        }
        super.d(canvas, matrix, i);
    }

    @Override // defpackage.hh4
    public String getName() {
        return this.s;
    }

    @Override // defpackage.de2, defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        super.h(t, yteVar);
        if (t == ste.f33969b) {
            this.u.n(yteVar);
            return;
        }
        if (t == ste.K) {
            o82<ColorFilter, ColorFilter> o82Var = this.v;
            if (o82Var != null) {
                this.f33767r.G(o82Var);
            }
            if (yteVar == null) {
                this.v = null;
                return;
            }
            inq inqVar = new inq(yteVar);
            this.v = inqVar;
            inqVar.a(this);
            this.f33767r.i(this.u);
        }
    }
}
