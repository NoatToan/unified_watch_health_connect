package ok0;

import gg1.o0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f132445b;

    public /* synthetic */ a(b bVar, int i14) {
        this.f132444a = i14;
        this.f132445b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f132444a;
        b bVar = this.f132445b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1944308004, new a(bVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    g gVar = (g) bVar.f132446a.getValue();
                    o0 o0VarG = ((bv.d) bVar.f132447b.getValue()).g();
                    boolean zR = mVar2.r(bVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new nw0.f(bVar, 14);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new nw0.f(bVar, 14);
                            mVar2.K(objQ);
                        }
                    }
                    e.a(gVar, o0VarG, (e23.l) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
