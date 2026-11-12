package gl1;

import lc.p0;
import lc.y0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f77857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.y f77858c;

    public /* synthetic */ o(boolean z14, lc.y yVar, int i14) {
        this.f77856a = i14;
        this.f77857b = z14;
        this.f77858c = yVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f77856a;
        lc.y yVar = this.f77858c;
        boolean z14 = this.f77857b;
        p0 p0Var = (p0) obj;
        switch (i14) {
            case 0:
                p0Var.getClass();
                if (z14) {
                    y0 y0VarI = kg.f.i(p0Var, yVar.f111904b.k().f111791g.f144354c);
                    y0VarI.f111914a = true;
                    Unit unit = Unit.INSTANCE;
                    p0Var.f111833f = true;
                    p0Var.f111834g = y0VarI.f111915b;
                }
                break;
            default:
                p0Var.getClass();
                if (z14) {
                    y0 y0VarI2 = kg.f.i(p0Var, yVar.f111904b.k().f111791g.f144354c);
                    y0VarI2.f111914a = true;
                    Unit unit2 = Unit.INSTANCE;
                    p0Var.f111833f = true;
                    p0Var.f111834g = y0VarI2.f111915b;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
