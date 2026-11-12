package o72;

import java.util.Map;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f130506b;

    public /* synthetic */ o(Map map, int i14) {
        this.f130505a = i14;
        this.f130506b = map;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f130505a;
        ?? r14 = this.f130506b;
        switch (i14) {
            case 0:
                c2.c1 c1Var = (c2.c1) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(c1Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    for (j82.g gVar : r14.keySet()) {
                        String str = (String) r14.get(gVar);
                        j82.e.i(new j82.f(str == null ? "" : str, gVar, null, 4, null), c1Var.a(h4.r.S, 1.0f, true), mVar, 0, 0);
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                c2.c1 c1Var2 = (c2.c1) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                c1Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(c1Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    for (j82.g gVar2 : r14.keySet()) {
                        String str2 = (String) r14.get(gVar2);
                        j82.e.i(new j82.f(str2 == null ? "" : str2, gVar2, null, 4, null), c1Var2.a(h4.r.S, 1.0f, true), mVar2, 0, 0);
                    }
                    p3.x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
