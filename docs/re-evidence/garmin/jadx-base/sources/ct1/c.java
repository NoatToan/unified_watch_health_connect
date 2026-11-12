package ct1;

import e2.i0;
import e2.v;
import j02.d0;
import java.util.Iterator;
import lc.u0;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f55483b;

    public /* synthetic */ c(i0 i0Var, int i14) {
        this.f55482a = i14;
        this.f55483b = i0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        Object obj;
        long jA;
        Object obj2;
        switch (this.f55482a) {
            case 0:
                i0 i0Var = this.f55483b;
                Iterator<T> it = i0Var.j().e().iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        e2.n nVar = (e2.n) next;
                        int f62553m = (i0Var.j().getF62553m() + i0Var.j().getF62552l()) / 2;
                        int iMin = Math.min(Math.abs(f62553m - nVar.getF62574p()), Math.abs(f62553m - (nVar.getF62575q() + nVar.getF62574p())));
                        do {
                            Object next2 = it.next();
                            e2.n nVar2 = (e2.n) next2;
                            int f62553m2 = (i0Var.j().getF62553m() + i0Var.j().getF62552l()) / 2;
                            int iMin2 = Math.min(Math.abs(f62553m2 - nVar2.getF62574p()), Math.abs(f62553m2 - (nVar2.getF62575q() + nVar2.getF62574p())));
                            if (iMin > iMin2) {
                                next = next2;
                                iMin = iMin2;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                e2.n nVar3 = (e2.n) obj;
                return Integer.valueOf(nVar3 != null ? nVar3.getF62559a() : 0);
            case 1:
                return Integer.valueOf(this.f55483b.j().getF62554n());
            case 2:
                return Integer.valueOf(this.f55483b.i());
            case 3:
                return Integer.valueOf(this.f55483b.h());
            case 4:
                v vVarJ = this.f55483b.j();
                int i14 = d0.a.f96043a[vVarJ.getF62556p().ordinal()];
                if (i14 == 1) {
                    jA = vVarJ.a() & 4294967295L;
                } else {
                    if (i14 != 2) {
                        u0.r();
                        return null;
                    }
                    jA = vVarJ.a() >> 32;
                }
                return Float.valueOf(((int) jA) * 0.05f);
            case 5:
                return this.f55483b.j().getF62556p();
            case 6:
                i0 i0Var2 = this.f55483b;
                return Integer.valueOf(i0Var2.h() == 0 ? -i0Var2.i() : Integer.MIN_VALUE);
            case 7:
                return Integer.valueOf(this.f55483b.h());
            case 8:
                return Integer.valueOf(this.f55483b.h());
            case 9:
                return Boolean.valueOf(this.f55483b.i() == 0);
            case 10:
                return Integer.valueOf(this.f55483b.h());
            case 11:
                return Integer.valueOf(this.f55483b.i());
            case 12:
                e2.n nVar4 = (e2.n) h0.n0(this.f55483b.j().e());
                if (nVar4 != null) {
                    return Integer.valueOf(nVar4.getF62559a());
                }
                return null;
            case 13:
                return Integer.valueOf(this.f55483b.h());
            case 14:
                return this.f55483b.j().getF62556p();
            default:
                v vVarJ2 = this.f55483b.j();
                int f62553m3 = (vVarJ2.getF62553m() + vVarJ2.getF62552l()) / 2;
                Iterator<T> it3 = vVarJ2.e().iterator();
                if (it3.hasNext()) {
                    Object next3 = it3.next();
                    if (it3.hasNext()) {
                        e2.n nVar5 = (e2.n) next3;
                        int iAbs = Math.abs(((nVar5.getF62575q() / 2) + nVar5.getF62574p()) - f62553m3);
                        do {
                            Object next4 = it3.next();
                            e2.n nVar6 = (e2.n) next4;
                            int iAbs2 = Math.abs(((nVar6.getF62575q() / 2) + nVar6.getF62574p()) - f62553m3);
                            if (iAbs > iAbs2) {
                                next3 = next4;
                                iAbs = iAbs2;
                            }
                        } while (it3.hasNext());
                    }
                    obj2 = next3;
                } else {
                    obj2 = null;
                }
                e2.n nVar7 = (e2.n) obj2;
                return Integer.valueOf(nVar7 != null ? nVar7.getF62559a() : 0);
        }
    }
}
