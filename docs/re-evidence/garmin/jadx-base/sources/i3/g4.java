package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g4 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88179a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f88181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f88182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f88183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f88184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f88185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f88186h;

    public /* synthetic */ g4(f5.v1 v1Var, f5.v1 v1Var2, f5.b1 b1Var, int i14, int i15, Integer num, Integer num2) {
        this.f88182d = v1Var;
        this.f88183e = v1Var2;
        this.f88184f = b1Var;
        this.f88180b = i14;
        this.f88181c = i15;
        this.f88185g = num;
        this.f88186h = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f88179a;
        int i15 = this.f88181c;
        int i16 = this.f88180b;
        Object obj2 = this.f88186h;
        Object obj3 = this.f88185g;
        Object obj4 = this.f88184f;
        Object obj5 = this.f88183e;
        Object obj6 = this.f88182d;
        switch (i14) {
            case 0:
                j23.l lVar = (j23.l) obj6;
                ((f2.j0) obj).g(p13.h0.S(lVar), null, null, f2.i0.f68219a, new z3.e(674613074, true, new h4(lVar, (l3.e0) obj5, this.f88180b, this.f88181c, (e23.l) obj4, (bc) obj3, (b3) obj2)));
                break;
            case 1:
                f5.v1 v1Var = (f5.v1) obj6;
                f5.v1 v1Var2 = (f5.v1) obj5;
                f5.b1 b1Var = (f5.b1) obj4;
                Integer num = (Integer) obj3;
                Integer num2 = (Integer) obj2;
                f5.v1.a aVar = (f5.v1.a) obj;
                if (v1Var != null && v1Var2 != null) {
                    num.getClass();
                    int iIntValue = num.intValue();
                    num2.getClass();
                    int iIntValue2 = num2.intValue();
                    int iF0 = b1Var.f0(iIntValue == iIntValue2 ? uf.f89934d : uf.f89935e);
                    n3.q0.f123226a.getClass();
                    int iF1 = b1Var.f0(n3.q0.f123228c) + iF0;
                    int iV0 = (b1Var.v0(uf.f89936f) + v1Var2.f69145b) - iIntValue;
                    int i17 = (i15 - iIntValue2) - iF1;
                    f5.v1.a.B(aVar, v1Var, (i16 - v1Var.f69144a) / 2, i17);
                    f5.v1.a.B(aVar, v1Var2, (i16 - v1Var2.f69144a) / 2, i17 - iV0);
                } else if (v1Var != null) {
                    float f14 = uf.f89931a;
                    f5.v1.a.B(aVar, v1Var, 0, (i15 - v1Var.f69145b) / 2);
                } else if (v1Var2 != null) {
                    float f15 = uf.f89931a;
                    f5.v1.a.B(aVar, v1Var2, 0, (i15 - v1Var2.f69145b) / 2);
                }
                break;
            default:
                i53.c cVar = (i53.c) obj5;
                e23.l lVar2 = (e23.l) obj4;
                p3.n1 n1Var = (p3.n1) obj3;
                p3.n1 n1Var2 = (p3.n1) obj2;
                n1Var.t(((Number) ((i53.c) obj6).get(((Integer) obj).intValue())).intValue());
                if (n1Var.getIntValue() == i16 && n1Var2.getIntValue() > ((Number) p13.h0.m0(cVar)).intValue()) {
                    n1Var2.t(((Number) p13.h0.m0(cVar)).intValue());
                }
                if (n1Var.getIntValue() == i15 && n1Var2.getIntValue() < ((Number) p13.h0.b0(cVar)).intValue()) {
                    n1Var2.t(((Number) p13.h0.b0(cVar)).intValue());
                }
                lVar2.invoke(Double.valueOf((((double) n1Var2.getIntValue()) * 0.1d) + ((double) n1Var.getIntValue())));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g4(i53.c cVar, int i14, i53.c cVar2, int i15, e23.l lVar, p3.n1 n1Var, p3.n1 n1Var2) {
        this.f88182d = cVar;
        this.f88180b = i14;
        this.f88183e = cVar2;
        this.f88181c = i15;
        this.f88184f = lVar;
        this.f88185g = n1Var;
        this.f88186h = n1Var2;
    }

    public /* synthetic */ g4(j23.l lVar, l3.e0 e0Var, int i14, int i15, e23.l lVar2, bc bcVar, b3 b3Var) {
        this.f88182d = lVar;
        this.f88183e = e0Var;
        this.f88180b = i14;
        this.f88181c = i15;
        this.f88184f = lVar2;
        this.f88185g = bcVar;
        this.f88186h = b3Var;
    }
}
