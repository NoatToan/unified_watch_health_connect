package qw0;

import java.util.ArrayList;
import jy0.h0;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f148338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f148339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f148340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f148341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f148342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h4.r f148343g;

    public /* synthetic */ p(ArrayList arrayList, p1 p1Var, p1 p1Var2, e23.l lVar, int i14, h4.r rVar, int i15) {
        this.f148337a = i15;
        this.f148338b = arrayList;
        this.f148339c = p1Var;
        this.f148340d = p1Var2;
        this.f148341e = lVar;
        this.f148342f = i14;
        this.f148343g = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0155  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f148337a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    final ArrayList arrayList = this.f148338b;
                    final int i15 = 0;
                    for (Object obj4 : arrayList) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        final o13.p pVar = (o13.p) obj4;
                        z3.e eVarC = z3.f.c(-1928009026, new kj2.g(pVar, 1, (byte) 0), mVar);
                        final p1 p1Var = this.f148339c;
                        boolean zB = mVar.B(p1Var);
                        final p1 p1Var2 = this.f148340d;
                        boolean zB2 = zB | mVar.B(p1Var2) | mVar.B(pVar);
                        final e23.l lVar = this.f148341e;
                        boolean zB3 = zB2 | mVar.B(lVar) | mVar.r(arrayList) | mVar.k(i15);
                        Object objQ = mVar.q();
                        if (zB3) {
                            final int i17 = 0;
                            e23.a aVar2 = new e23.a() { // from class: qw0.o
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            p1Var.setValue(Boolean.FALSE);
                                            p1Var2.setValue(pVar);
                                            lVar.invoke(((o13.p) arrayList.get(i15)).f128594a);
                                            break;
                                        default:
                                            p1Var.setValue(Boolean.FALSE);
                                            p1Var2.setValue(pVar);
                                            lVar.invoke(((o13.p) arrayList.get(i15)).f128595b);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(aVar2);
                            objQ = aVar2;
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final int i18 = 0;
                                e23.a aVar3 = new e23.a() { // from class: qw0.o
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i18) {
                                            case 0:
                                                p1Var.setValue(Boolean.FALSE);
                                                p1Var2.setValue(pVar);
                                                lVar.invoke(((o13.p) arrayList.get(i15)).f128594a);
                                                break;
                                            default:
                                                p1Var.setValue(Boolean.FALSE);
                                                p1Var2.setValue(pVar);
                                                lVar.invoke(((o13.p) arrayList.get(i15)).f128595b);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(aVar3);
                                objQ = aVar3;
                            }
                        }
                        i3.u.b(eVarC, (e23.a) objQ, null, null, z3.f.c(-1957530310, new h0(i15, this.f148342f, this.f148343g, 1, (byte) 0), mVar), false, null, null, mVar, 24582, 492);
                        i15 = i16;
                        arrayList = arrayList;
                    }
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    final ArrayList arrayList2 = this.f148338b;
                    final int i19 = 0;
                    for (Object obj5 : arrayList2) {
                        int i24 = i19 + 1;
                        if (i19 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        final o13.p pVar2 = (o13.p) obj5;
                        z3.e eVarC2 = z3.f.c(1353088770, new kj2.g(pVar2, 3, (byte) 0), mVar2);
                        final p1 p1Var3 = this.f148339c;
                        boolean zB4 = mVar2.B(p1Var3);
                        final p1 p1Var4 = this.f148340d;
                        boolean zB5 = zB4 | mVar2.B(p1Var4) | mVar2.B(pVar2);
                        final e23.l lVar2 = this.f148341e;
                        boolean zB6 = zB5 | mVar2.B(lVar2) | mVar2.r(arrayList2) | mVar2.k(i19);
                        Object objQ2 = mVar2.q();
                        if (zB6) {
                            final int i25 = 1;
                            e23.a aVar4 = new e23.a() { // from class: qw0.o
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            p1Var3.setValue(Boolean.FALSE);
                                            p1Var4.setValue(pVar2);
                                            lVar2.invoke(((o13.p) arrayList2.get(i19)).f128594a);
                                            break;
                                        default:
                                            p1Var3.setValue(Boolean.FALSE);
                                            p1Var4.setValue(pVar2);
                                            lVar2.invoke(((o13.p) arrayList2.get(i19)).f128595b);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar4);
                            objQ2 = aVar4;
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                final int i26 = 1;
                                e23.a aVar5 = new e23.a() { // from class: qw0.o
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                p1Var3.setValue(Boolean.FALSE);
                                                p1Var4.setValue(pVar2);
                                                lVar2.invoke(((o13.p) arrayList2.get(i19)).f128594a);
                                                break;
                                            default:
                                                p1Var3.setValue(Boolean.FALSE);
                                                p1Var4.setValue(pVar2);
                                                lVar2.invoke(((o13.p) arrayList2.get(i19)).f128595b);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(aVar5);
                                objQ2 = aVar5;
                            }
                        }
                        i3.u.b(eVarC2, (e23.a) objQ2, null, null, z3.f.c(1310875910, new h0(i19, this.f148342f, this.f148343g, 3, (byte) 0), mVar2), false, null, null, mVar2, 24582, 492);
                        i19 = i24;
                        arrayList2 = arrayList2;
                    }
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
