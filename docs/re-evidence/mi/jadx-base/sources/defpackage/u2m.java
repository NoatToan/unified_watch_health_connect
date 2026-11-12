package defpackage;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class u2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d55> f35315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f35316b;
    public boolean c;

    public u2m(PointF pointF, boolean z, List<d55> list) {
        this.f35316b = pointF;
        this.c = z;
        this.f35315a = new ArrayList(list);
    }

    public List<d55> a() {
        return this.f35315a;
    }

    public PointF b() {
        return this.f35316b;
    }

    public void c(u2m u2mVar, u2m u2mVar2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.f35316b == null) {
            this.f35316b = new PointF();
        }
        this.c = u2mVar.d() || u2mVar2.d();
        if (u2mVar.a().size() != u2mVar2.a().size()) {
            rpe.c("Curves must have the same number of control points. Shape 1: " + u2mVar.a().size() + "\tShape 2: " + u2mVar2.a().size());
        }
        int iMin = Math.min(u2mVar.a().size(), u2mVar2.a().size());
        if (this.f35315a.size() < iMin) {
            for (int size = this.f35315a.size(); size < iMin; size++) {
                this.f35315a.add(new d55());
            }
        } else if (this.f35315a.size() > iMin) {
            for (int size2 = this.f35315a.size() - 1; size2 >= iMin; size2--) {
                List<d55> list = this.f35315a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = u2mVar.b();
        PointF pointFB2 = u2mVar2.b();
        f(d5g.i(pointFB.x, pointFB2.x, f), d5g.i(pointFB.y, pointFB2.y, f));
        for (int size3 = this.f35315a.size() - 1; size3 >= 0; size3--) {
            d55 d55Var = u2mVar.a().get(size3);
            d55 d55Var2 = u2mVar2.a().get(size3);
            PointF pointFA = d55Var.a();
            PointF pointFB3 = d55Var.b();
            PointF pointFC = d55Var.c();
            PointF pointFA2 = d55Var2.a();
            PointF pointFB4 = d55Var2.b();
            PointF pointFC2 = d55Var2.c();
            this.f35315a.get(size3).d(d5g.i(pointFA.x, pointFA2.x, f), d5g.i(pointFA.y, pointFA2.y, f));
            this.f35315a.get(size3).e(d5g.i(pointFB3.x, pointFB4.x, f), d5g.i(pointFB3.y, pointFB4.y, f));
            this.f35315a.get(size3).f(d5g.i(pointFC.x, pointFC2.x, f), d5g.i(pointFC.y, pointFC2.y, f));
        }
    }

    public boolean d() {
        return this.c;
    }

    public void e(boolean z) {
        this.c = z;
    }

    public void f(float f, float f2) {
        if (this.f35316b == null) {
            this.f35316b = new PointF();
        }
        this.f35316b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f35315a.size() + "closed=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public u2m() {
        this.f35315a = new ArrayList();
    }
}
