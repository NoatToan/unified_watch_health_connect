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
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w01.f f201998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f201999c;

    public /* synthetic */ d(w01.f fVar, l lVar) {
        this.f201997a = 1;
        this.f201998b = fVar;
        this.f201999c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f201997a;
        l lVar = this.f201999c;
        w01.f fVar = this.f201998b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                f.e(fVar, lVar, mVar, p0.t(9));
                break;
            case 1:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    mVar.C(118483894);
                    List<w01.e> list = fVar.f181052d;
                    ArrayList arrayList = new ArrayList(y.r(list, 10));
                    for (w01.e eVar : list) {
                        arrayList.add(new o13.p(gl1.y.Q(mVar, eVar.f181047a), gl1.y.Q(mVar, eVar.f181048b)));
                    }
                    mVar.f();
                    int iIndexOf = fVar.f181052d.indexOf(fVar.f181053e);
                    boolean zB = mVar.B(lVar) | mVar.r(fVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new yt.f(7, lVar, fVar);
                        mVar.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new yt.f(7, lVar, fVar);
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
                f.e(fVar, lVar, mVar, p0.t(9));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(w01.f fVar, l lVar, int i14, int i15) {
        this.f201997a = i15;
        this.f201998b = fVar;
        this.f201999c = lVar;
    }
}
