package e2;

import g2.d1;
import java.util.List;
import p005kotlin.Metadata;
import p008y1.o2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Le2/h0;", "Lg2/d1;", "Ly1/o2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h0 implements d1, o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2 f62429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f62430b;

    public h0(o2 o2Var, i0 i0Var) {
        this.f62430b = i0Var;
        this.f62429a = o2Var;
    }

    @Override // g2.d1
    public final int a() {
        return this.f62430b.i();
    }

    @Override // g2.d1
    public final int b() {
        return this.f62430b.h();
    }

    @Override // g2.d1
    public final int c() {
        n nVar = (n) p13.h0.n0(this.f62430b.j().e());
        if (nVar != null) {
            return nVar.getF68148a();
        }
        return 0;
    }

    @Override // g2.d1
    public final void d(int i14, int i15) {
        this.f62430b.m(i14, i15, true);
    }

    @Override // g2.d1
    public final int e(int i14) {
        n nVar;
        i0 i0Var = this.f62430b;
        v vVarJ = i0Var.j();
        if (!vVarJ.e().isEmpty()) {
            int iH = i0Var.h();
            if (i14 > c() || iH > i14) {
                return ((i14 - i0Var.h()) * xy2.b.P(vVarJ)) - i0Var.i();
            }
            List<n> listE = vVarJ.e();
            int size = listE.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    nVar = null;
                    break;
                }
                nVar = listE.get(i15);
                if (nVar.getF68148a() == i14) {
                    break;
                }
                i15++;
            }
            n nVar2 = nVar;
            if (nVar2 != null) {
                return nVar2.getOffset();
            }
        }
        return 0;
    }

    @Override // p008y1.o2
    public final float f(float f14) {
        return this.f62429a.f(f14);
    }

    @Override // g2.d1
    public final int getItemCount() {
        return this.f62430b.j().d();
    }
}
