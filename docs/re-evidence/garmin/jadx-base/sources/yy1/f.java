package yy1;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f200137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f200138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f200139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f200140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1 f200141f;

    public /* synthetic */ f(List list, boolean z14, e23.a aVar, e23.l lVar, p1 p1Var, int i14) {
        this.f200136a = i14;
        this.f200137b = list;
        this.f200138c = z14;
        this.f200139d = aVar;
        this.f200140e = lVar;
        this.f200141f = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f200136a;
        p3.m.a aVar = p3.m.f135153a;
        p1 p1Var = this.f200141f;
        e23.l lVar = this.f200140e;
        e23.a aVar2 = this.f200139d;
        boolean z14 = this.f200138c;
        List list = this.f200137b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (list == null) {
                        mVar.C(-144751123);
                        mVar.f();
                    } else {
                        mVar.C(-144751122);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            q51.d.b((q51.e) it.next(), null, lVar, mVar, 432);
                        }
                        mVar.f();
                    }
                    boolean z15 = (list != null ? list.size() : 0) < 5;
                    boolean zH = mVar.h(z14) | mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zH) {
                        objQ = new ht1.r(1, aVar2, p1Var, z14);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ht1.r(1, aVar2, p1Var, z14);
                            mVar.K(objQ);
                        }
                    }
                    q51.d.a(0, 0, (e23.a) objQ, mVar, z15);
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (list == null) {
                        mVar.C(222455089);
                        mVar.f();
                    } else {
                        mVar.C(222455090);
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            q51.d.b((q51.e) it3.next(), null, lVar, mVar, 432);
                        }
                        mVar.f();
                    }
                    boolean z16 = (list != null ? list.size() : 0) < 5;
                    boolean zH2 = mVar.h(z14) | mVar.B(aVar2);
                    Object objQ2 = mVar.q();
                    if (zH2) {
                        objQ2 = new ht1.r(2, aVar2, p1Var, z14);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ht1.r(2, aVar2, p1Var, z14);
                            mVar.K(objQ2);
                        }
                    }
                    q51.d.a(0, 0, (e23.a) objQ2, mVar, z16);
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
