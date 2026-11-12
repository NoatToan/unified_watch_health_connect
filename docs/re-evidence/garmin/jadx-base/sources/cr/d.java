package cr;

import java.util.List;
import l72.g1;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f55258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f55259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f55260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f55261e;

    public /* synthetic */ d(List list, String str, e23.l lVar, p1 p1Var, int i14) {
        this.f55257a = i14;
        this.f55258b = list;
        this.f55259c = str;
        this.f55260d = lVar;
        this.f55261e = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f55257a;
        p3.m.a aVar = p3.m.f135153a;
        p1 p1Var = this.f55261e;
        e23.l lVar = this.f55260d;
        String str = this.f55259c;
        List<String> list = this.f55258b;
        c2.a0 a0Var = (c2.a0) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i14) {
            case 0:
                a0Var.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    for (String str2 : list) {
                        boolean zB = mVar.B(lVar) | mVar.B(str2);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new e(0, lVar, str2, p1Var);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e(0, lVar, str2, p1Var);
                                mVar.K(objQ);
                            }
                        }
                        g.b(str2, str, (e23.a) objQ, mVar, 0);
                    }
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                a0Var.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    for (String str3 : list) {
                        boolean zB2 = mVar.B(lVar) | mVar.B(str3);
                        Object objQ2 = mVar.q();
                        if (zB2) {
                            objQ2 = new e(1, lVar, str3, p1Var);
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e(1, lVar, str3, p1Var);
                                mVar.K(objQ2);
                            }
                        }
                        g1.a(str3, str, (e23.a) objQ2, mVar, 0);
                    }
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
