package z21;

import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p13.y;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w01.a f202001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f202002c;

    public /* synthetic */ e(w01.a aVar, l lVar) {
        this.f202000a = 1;
        this.f202001b = aVar;
        this.f202002c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f202000a;
        l lVar = this.f202002c;
        w01.a aVar = this.f202001b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                f.a(aVar, lVar, mVar, p0.t(9));
                break;
            case 1:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    mVar.C(817979642);
                    List<q22.b> list = aVar.f181007d;
                    ArrayList arrayList = new ArrayList(y.r(list, 10));
                    for (q22.b bVar : list) {
                        arrayList.add(new o13.p(gl1.y.Q(mVar, bVar.f142313b), gl1.y.Q(mVar, bVar.f142314c)));
                    }
                    mVar.f();
                    int iIndexOf = aVar.f181007d.indexOf(aVar.f181008e);
                    boolean zB = mVar.B(lVar) | mVar.r(aVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new yt.f(8, lVar, aVar);
                        mVar.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new yt.f(8, lVar, aVar);
                            mVar.K(objQ);
                        }
                    }
                    f.g(arrayList, iIndexOf, (l) objQ, mVar, 0);
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                f.a(aVar, lVar, mVar, p0.t(9));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(w01.a aVar, l lVar, int i14, int i15) {
        this.f202000a = i15;
        this.f202001b = aVar;
        this.f202002c = lVar;
    }
}
