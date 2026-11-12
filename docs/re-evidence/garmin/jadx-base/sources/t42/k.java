package t42;

import e2.i0;
import java.util.List;
import p005kotlin.Unit;
import p3.x1;
import q42.y;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f162350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f162351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f162352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f162353e;

    public /* synthetic */ k(i53.c cVar, i0 i0Var, y yVar, List list, int i14) {
        this.f162349a = i14;
        this.f162350b = cVar;
        this.f162351c = i0Var;
        this.f162352d = yVar;
        this.f162353e = list;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f162349a;
        p3.m.a aVar = p3.m.f135153a;
        final List list = this.f162353e;
        final y yVar = this.f162352d;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    f82.d dVar = new f82.d();
                    boolean zR = mVar.r(yVar) | mVar.r(list);
                    Object objQ = mVar.q();
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.p() { // from class: t42.m
                            @Override // e23.p
                            public final Object invoke(Object obj3, Object obj4) {
                                int i16 = objArr2;
                                List list2 = (List) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                switch (i16) {
                                    case 0:
                                        list2.getClass();
                                        yVar.B4((l42.d) list.get(iIntValue2));
                                        break;
                                    default:
                                        list2.getClass();
                                        yVar.B4((l42.d) list.get(iIntValue2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.p() { // from class: t42.m
                                @Override // e23.p
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i16 = objArr3;
                                    List list2 = (List) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    switch (i16) {
                                        case 0:
                                            list2.getClass();
                                            yVar.B4((l42.d) list.get(iIntValue2));
                                            break;
                                        default:
                                            list2.getClass();
                                            yVar.B4((l42.d) list.get(iIntValue2));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    e82.a.b(this.f162350b, dVar, this.f162351c, null, null, (e23.p) objQ, mVar, 0, 24);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    f82.d dVar2 = new f82.d();
                    boolean zR2 = mVar2.r(yVar) | mVar2.r(list);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.p() { // from class: t42.m
                            @Override // e23.p
                            public final Object invoke(Object obj3, Object obj4) {
                                int i16 = i15;
                                List list2 = (List) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                switch (i16) {
                                    case 0:
                                        list2.getClass();
                                        yVar.B4((l42.d) list.get(iIntValue3));
                                        break;
                                    default:
                                        list2.getClass();
                                        yVar.B4((l42.d) list.get(iIntValue3));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.p() { // from class: t42.m
                                @Override // e23.p
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i16 = i15;
                                    List list2 = (List) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    switch (i16) {
                                        case 0:
                                            list2.getClass();
                                            yVar.B4((l42.d) list.get(iIntValue3));
                                            break;
                                        default:
                                            list2.getClass();
                                            yVar.B4((l42.d) list.get(iIntValue3));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    e82.a.b(this.f162350b, dVar2, this.f162351c, null, null, (e23.p) objQ2, mVar2, 0, 24);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
