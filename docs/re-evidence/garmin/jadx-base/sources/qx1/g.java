package qx1;

import i3.h7;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f148429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dy1.h f148430c;

    public /* synthetic */ g(e23.l lVar, dy1.h hVar, int i14) {
        this.f148428a = i14;
        this.f148429b = lVar;
        this.f148430c = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f148428a;
        p3.m.a aVar = p3.m.f135153a;
        final dy1.h hVar = this.f148430c;
        final e23.l lVar = this.f148429b;
        boolean z14 = false;
        final int i15 = 2;
        final int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean zB = mVar.B(lVar) | mVar.B(hVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        final int i17 = z14 ? 1 : 0;
                        objQ = new e23.a() { // from class: qx1.f
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        lVar.invoke(hVar.f61556a);
                                        break;
                                    case 1:
                                        lVar.invoke(hVar.f61556a);
                                        break;
                                    default:
                                        lVar.invoke(hVar.f61556a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i18 = z14 ? 1 : 0;
                            objQ = new e23.a() { // from class: qx1.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            lVar.invoke(hVar.f61556a);
                                            break;
                                        case 1:
                                            lVar.invoke(hVar.f61556a);
                                            break;
                                        default:
                                            lVar.invoke(hVar.f61556a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    a.f148415a.getClass();
                    h7.a((e23.a) objQ, null, false, null, null, a.f148416b, mVar, 1572864, 62);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zB2 = mVar2.B(lVar) | mVar2.B(hVar);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new e23.a() { // from class: qx1.f
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        lVar.invoke(hVar.f61556a);
                                        break;
                                    case 1:
                                        lVar.invoke(hVar.f61556a);
                                        break;
                                    default:
                                        lVar.invoke(hVar.f61556a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: qx1.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            lVar.invoke(hVar.f61556a);
                                            break;
                                        case 1:
                                            lVar.invoke(hVar.f61556a);
                                            break;
                                        default:
                                            lVar.invoke(hVar.f61556a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    a.f148415a.getClass();
                    h7.a((e23.a) objQ2, null, false, null, null, a.f148417c, mVar2, 1572864, 62);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zB3 = mVar3.B(lVar) | mVar3.B(hVar);
                    Object objQ3 = mVar3.q();
                    if (zB3) {
                        objQ3 = new e23.a() { // from class: qx1.f
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        lVar.invoke(hVar.f61556a);
                                        break;
                                    case 1:
                                        lVar.invoke(hVar.f61556a);
                                        break;
                                    default:
                                        lVar.invoke(hVar.f61556a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: qx1.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            lVar.invoke(hVar.f61556a);
                                            break;
                                        case 1:
                                            lVar.invoke(hVar.f61556a);
                                            break;
                                        default:
                                            lVar.invoke(hVar.f61556a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ3);
                        }
                    }
                    c.f148420a.getClass();
                    h7.a((e23.a) objQ3, null, false, null, null, c.f148421b, mVar3, 1572864, 62);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
