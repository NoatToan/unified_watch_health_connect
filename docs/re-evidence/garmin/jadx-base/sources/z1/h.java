package z1;

import h2.b0;
import h2.g0;
import h2.j0;
import java.util.List;
import p005kotlin.Metadata;
import p3.c2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz1/h;", "Lz1/t;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f200832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.q<Float, Float, Float, Float> f200833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f200834c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(j0 j0Var, e23.q<? super Float, ? super Float, ? super Float, Float> qVar, g0 g0Var) {
        this.f200832a = j0Var;
        this.f200833b = qVar;
        this.f200834c = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z1.t
    public final float a(float f14) {
        j0 j0Var = this.f200832a;
        u f80858o = j0Var.n().getF80858o();
        List<h2.i> listG = j0Var.n().g();
        int size = listG.size();
        float f15 = Float.POSITIVE_INFINITY;
        float f16 = Float.NEGATIVE_INFINITY;
        for (int i14 = 0; i14 < size; i14++) {
            h2.i iVar = listG.get(i14);
            int iZ = gg.b.z(j0Var.n());
            int iB = j0Var.n().b();
            int f80847d = j0Var.n().getF80847d();
            int f80845b = j0Var.n().getF80845b();
            int f80918m = iVar.getF80918m();
            j0Var.o();
            float fC = f80918m - f80858o.c(iZ, f80845b, iB, f80847d);
            if (fC <= 0.0f && fC > f16) {
                f16 = fC;
            }
            if (fC >= 0.0f && fC < f15) {
                f15 = fC;
            }
        }
        if (f16 == Float.NEGATIVE_INFINITY) {
            f16 = f15;
        }
        if (f15 == Float.POSITIVE_INFINITY) {
            f15 = f16;
        }
        if (!j0Var.c()) {
            if (i.b(j0Var, f14)) {
                f16 = 0.0f;
                f15 = 0.0f;
            } else {
                f15 = 0.0f;
            }
        }
        if (!j0Var.e()) {
            f16 = 0.0f;
            if (!i.b(j0Var, f14)) {
                f15 = 0.0f;
            }
        }
        o13.p pVar = new o13.p(Float.valueOf(f16), Float.valueOf(f15));
        float fFloatValue = ((Number) pVar.f128594a).floatValue();
        float fFloatValue2 = ((Number) pVar.f128595b).floatValue();
        float fFloatValue3 = this.f200833b.invoke(Float.valueOf(f14), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            b2.e.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z1.t
    public final float b(float f14, float f15) {
        j0 j0Var = this.f200832a;
        int iP = j0Var.p();
        c2 c2Var = j0Var.f80940p;
        int i14 = ((b0) c2Var.getF182175a()).f80846c + iP;
        if (i14 == 0) {
            return 0.0f;
        }
        int i15 = j0Var.f80929e;
        if (f14 < 0.0f) {
            i15++;
        }
        int iE = j23.t.e(((int) (f15 / i14)) + i15, 0, j0Var.o());
        j0Var.p();
        int i16 = ((b0) c2Var.getF182175a()).f80846c;
        int iAbs = Math.abs((j23.t.e(this.f200834c.a(i15, iE), 0, j0Var.o()) - i15) * i14) - i14;
        int i17 = iAbs >= 0 ? iAbs : 0;
        if (i17 == 0) {
            return i17;
        }
        return Math.signum(f14) * i17;
    }
}
