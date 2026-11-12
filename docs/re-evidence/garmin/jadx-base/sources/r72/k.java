package r72;

import e23.p;
import l72.p2;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;
import q42.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151185a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f151186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f151187c;

    public /* synthetic */ k(i iVar, m mVar) {
        this.f151186b = iVar;
        this.f151187c = mVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f151185a;
        m mVar = this.f151187c;
        i iVar = this.f151186b;
        switch (i14) {
            case 0:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = p0.n(iVar.f151181d);
                        mVar2.K(objQ);
                    }
                    p1 p1Var = (p1) objQ;
                    for (c cVar : c.f151173h) {
                        p2 p2Var = p2.f111205a;
                        String str = cVar.f151174a;
                        z3.e eVarC = z3.f.c(-1819155664, new q72.f(26, cVar, p1Var), mVar2);
                        boolean zK = mVar2.k(cVar.ordinal()) | mVar2.B(mVar);
                        Object objQ2 = mVar2.q();
                        if (zK || objQ2 == p3.m.a.f135155b) {
                            objQ2 = new v(cVar, 12, mVar, p1Var);
                            mVar2.K(objQ2);
                        }
                        p2Var.g(str, null, null, null, eVarC, false, false, (e23.a) objQ2, mVar2, 24576, 238);
                    }
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n.a(iVar, mVar, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(i iVar, m mVar, int i14) {
        this.f151186b = iVar;
        this.f151187c = mVar;
    }
}
