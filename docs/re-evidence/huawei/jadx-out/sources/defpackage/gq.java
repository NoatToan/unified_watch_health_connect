package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class gq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f35878b;
    private final List<fr> e;

    public gq(PointF pointF, boolean z, List<fr> list) {
        this.f35878b = pointF;
        this.f35877a = z;
        this.e = new ArrayList(list);
    }

    public gq() {
        this.e = new ArrayList();
    }

    public void e(float f, float f2) {
        if (this.f35878b == null) {
            this.f35878b = new PointF();
        }
        this.f35878b.set(f, f2);
    }

    public PointF e() {
        return this.f35878b;
    }

    public void a(boolean z) {
        this.f35877a = z;
    }

    public boolean d() {
        return this.f35877a;
    }

    public List<fr> a() {
        return this.e;
    }

    public void d(gq gqVar, gq gqVar2, float f) {
        if (this.f35878b == null) {
            this.f35878b = new PointF();
        }
        this.f35877a = gqVar.d() || gqVar2.d();
        if (gqVar.a().size() != gqVar2.a().size()) {
            iy.d("Curves must have the same number of control points. Shape 1: " + gqVar.a().size() + "\tShape 2: " + gqVar2.a().size());
        }
        int iMin = Math.min(gqVar.a().size(), gqVar2.a().size());
        if (this.e.size() < iMin) {
            for (int size = this.e.size(); size < iMin; size++) {
                this.e.add(new fr());
            }
        } else if (this.e.size() > iMin) {
            for (int size2 = this.e.size() - 1; size2 >= iMin; size2--) {
                List<fr> list = this.e;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFE = gqVar.e();
        PointF pointFE2 = gqVar2.e();
        e(jc.a(pointFE.x, pointFE2.x, f), jc.a(pointFE.y, pointFE2.y, f));
        for (int size3 = this.e.size() - 1; size3 >= 0; size3--) {
            fr frVar = gqVar.a().get(size3);
            fr frVar2 = gqVar2.a().get(size3);
            PointF pointFA = frVar.a();
            PointF pointFB = frVar.b();
            PointF pointFC = frVar.c();
            PointF pointFA2 = frVar2.a();
            PointF pointFB2 = frVar2.b();
            PointF pointFC2 = frVar2.c();
            this.e.get(size3).e(jc.a(pointFA.x, pointFA2.x, f), jc.a(pointFA.y, pointFA2.y, f));
            this.e.get(size3).b(jc.a(pointFB.x, pointFB2.x, f), jc.a(pointFB.y, pointFB2.y, f));
            this.e.get(size3).a(jc.a(pointFC.x, pointFC2.x, f), jc.a(pointFC.y, pointFC2.y, f));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.e.size() + "closed=" + this.f35877a + '}';
    }
}
