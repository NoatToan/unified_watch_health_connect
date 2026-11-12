package z1;

import e2.i0;
import e2.x;
import g2.t0;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz1/f;", "Lz1/t;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f200830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f200831b;

    public f(i0 i0Var, u uVar) {
        this.f200830a = i0Var;
        this.f200831b = uVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // z1.t
    public final float a(float f14) {
        i0 i0Var = this.f200830a;
        List<e2.n> listE = i0Var.j().e();
        int size = listE.size();
        float f15 = Float.NEGATIVE_INFINITY;
        float f16 = Float.POSITIVE_INFINITY;
        for (int i14 = 0; i14 < size; i14++) {
            e2.n nVar = listE.get(i14);
            t0 t0Var = nVar instanceof t0 ? (t0) nVar : null;
            if (t0Var == null || !t0Var.getF62579u()) {
                int iB = g.b(i0Var.j());
                int iB2 = i0Var.j().b();
                int f62557q = i0Var.j().getF62557q();
                int f62575q = nVar.getF62575q();
                int f62574p = nVar.getF62574p();
                i0Var.j().getF62554n();
                float fC = f62574p - this.f200831b.c(iB, f62575q, iB2, f62557q);
                if (fC <= 0.0f && fC > f15) {
                    f15 = fC;
                }
                if (fC >= 0.0f && fC < f16) {
                    f16 = fC;
                }
            }
        }
        int iA = g.a(f14, ((x) i0Var.f62439f.getF182175a()).f62549i);
        d.f200826b.getClass();
        if (iA == 0) {
            if (Math.abs(f16) <= Math.abs(f15)) {
                f15 = f16;
            }
        } else if (iA == d.f200827c) {
            f15 = f16;
        } else if (iA != d.f200828d) {
            f15 = 0.0f;
        }
        if (f15 == Float.POSITIVE_INFINITY || f15 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f15;
    }

    @Override // z1.t
    public final float b(float f14, float f15) {
        float fAbs = Math.abs(f15);
        e2.v vVarJ = this.f200830a.j();
        int f62575q = 0;
        if (!vVarJ.e().isEmpty()) {
            int size = vVarJ.e().size();
            Iterator<T> it = vVarJ.e().iterator();
            while (it.hasNext()) {
                f62575q += ((e2.n) it.next()).getF62575q();
            }
            f62575q /= size;
        }
        float f16 = fAbs - f62575q;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        return Math.signum(f15) * f16;
    }
}
