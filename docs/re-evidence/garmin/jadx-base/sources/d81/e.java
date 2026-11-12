package d81;

import c22.c3;
import h2.j0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f58310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f58311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f58312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c3 f58313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g6.c f58314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f58315g;

    public /* synthetic */ e(o53.b0 b0Var, j0 j0Var, int i14, c3 c3Var, g6.c cVar, e23.l lVar, int i15) {
        this.f58309a = i15;
        this.f58310b = b0Var;
        this.f58311c = j0Var;
        this.f58312d = i14;
        this.f58313e = c3Var;
        this.f58314f = cVar;
        this.f58315g = lVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f58309a;
        g6.c cVar = this.f58314f;
        c3 c3Var = this.f58313e;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    l02.m.a(this.f58310b, this.f58311c, this.f58312d, gl1.d.T(c3Var, mVar, 0), cVar.getF69050b(), this.f58315g, mVar, 0, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    l02.m.a(this.f58310b, this.f58311c, this.f58312d, gl1.d.T(c3Var, mVar2, 0), cVar.getF69050b(), this.f58315g, mVar2, 0, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    l02.m.a(this.f58310b, this.f58311c, this.f58312d, gl1.d.T(c3Var, mVar3, 0), cVar.getF69050b(), this.f58315g, mVar3, 0, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
