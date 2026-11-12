package da0;

import c2.x2;
import cw1.p0;
import i3.h7;
import i3.i7;
import p005kotlin.Unit;
import p3.x1;
import s70.g1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u4.d f58682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f58683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f58684d;

    public /* synthetic */ c0(u4.d dVar, String str, e23.a aVar, int i14) {
        this.f58681a = 1;
        this.f58682b = dVar;
        this.f58683c = str;
        this.f58684d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58681a;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = false;
        final int i15 = 2;
        final String str = this.f58683c;
        final u4.d dVar = this.f58682b;
        e23.a aVar2 = this.f58684d;
        final int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean zB = mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new p0(aVar2, 16);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new p0(aVar2, 16);
                            mVar.K(objQ);
                        }
                    }
                    final int i17 = z14 ? 1 : 0;
                    h7.a((e23.a) objQ, null, false, null, null, z3.f.c(1506840307, new e23.p() { // from class: da0.f0
                        @Override // e23.p
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i17) {
                                case 0:
                                    p3.m mVar2 = (p3.m) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var2 = p3.n.f135158a;
                                        long jB = ds.e0.b(d92.b.f58623a, mVar2);
                                        g6.f.a aVar3 = g6.f.f75994b;
                                        i7.b(dVar, str, x2.u(h4.r.S, 24), jB, mVar2, 384, 0);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                case 1:
                                    p3.m mVar3 = (p3.m) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        long jB2 = ds.e0.b(d92.b.f58623a, mVar3);
                                        g6.f.a aVar4 = g6.f.f75994b;
                                        i7.b(dVar, str, x2.u(h4.r.S, 24), jB2, mVar3, 384, 0);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar4 = (p3.m) obj3;
                                    int iIntValue4 = ((Integer) obj4).intValue();
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        d92.b.f58623a.getClass();
                                        long jC = o4.d0.c(0.5f, d92.b.a(mVar4).f().d(), 14);
                                        h4.r.a aVar5 = h4.r.S;
                                        d92.b.f58625c.getClass();
                                        i7.b(dVar, str, x2.u(aVar5, j92.b.f97901d.f97905d), jC, mVar4, 0, 0);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, 1572864, 62);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                i51.h.b(p3.p0.t(1), aVar2, str, (p3.m) obj, dVar);
                break;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zB2 = mVar2.B(aVar2);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new l72.t(aVar2, 15);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new l72.t(aVar2, 15);
                            mVar2.K(objQ2);
                        }
                    }
                    h7.a((e23.a) objQ2, null, false, null, null, z3.f.c(-1292068926, new e23.p() { // from class: da0.f0
                        @Override // e23.p
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i16) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        long jB = ds.e0.b(d92.b.f58623a, mVar3);
                                        g6.f.a aVar3 = g6.f.f75994b;
                                        i7.b(dVar, str, x2.u(h4.r.S, 24), jB, mVar3, 384, 0);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 1:
                                    p3.m mVar4 = (p3.m) obj3;
                                    int iIntValue4 = ((Integer) obj4).intValue();
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        long jB2 = ds.e0.b(d92.b.f58623a, mVar4);
                                        g6.f.a aVar4 = g6.f.f75994b;
                                        i7.b(dVar, str, x2.u(h4.r.S, 24), jB2, mVar4, 384, 0);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar5 = (p3.m) obj3;
                                    int iIntValue5 = ((Integer) obj4).intValue();
                                    if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        x1 x1Var5 = p3.n.f135158a;
                                        d92.b.f58623a.getClass();
                                        long jC = o4.d0.c(0.5f, d92.b.a(mVar5).f().d(), 14);
                                        h4.r.a aVar5 = h4.r.S;
                                        d92.b.f58625c.getClass();
                                        i7.b(dVar, str, x2.u(aVar5, j92.b.f97901d.f97905d), jC, mVar5, 0, 0);
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2), mVar2, 1572864, 62);
                } else {
                    mVar2.e();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                g1.a(p3.p0.t(1), aVar2, str, (p3.m) obj, dVar);
                break;
            case 4:
                ((Integer) obj2).getClass();
                g1.b(p3.p0.t(1), aVar2, str, (p3.m) obj, dVar);
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zB3 = mVar3.B(aVar2);
                    Object objQ3 = mVar3.q();
                    if (zB3) {
                        objQ3 = new w51.j(aVar2, 18);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new w51.j(aVar2, 18);
                            mVar3.K(objQ3);
                        }
                    }
                    h7.a((e23.a) objQ3, null, false, null, null, z3.f.c(1378313069, new e23.p() { // from class: da0.f0
                        @Override // e23.p
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i15) {
                                case 0:
                                    p3.m mVar4 = (p3.m) obj3;
                                    int iIntValue4 = ((Integer) obj4).intValue();
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        long jB = ds.e0.b(d92.b.f58623a, mVar4);
                                        g6.f.a aVar3 = g6.f.f75994b;
                                        i7.b(dVar, str, x2.u(h4.r.S, 24), jB, mVar4, 384, 0);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                case 1:
                                    p3.m mVar5 = (p3.m) obj3;
                                    int iIntValue5 = ((Integer) obj4).intValue();
                                    if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        x1 x1Var5 = p3.n.f135158a;
                                        long jB2 = ds.e0.b(d92.b.f58623a, mVar5);
                                        g6.f.a aVar4 = g6.f.f75994b;
                                        i7.b(dVar, str, x2.u(h4.r.S, 24), jB2, mVar5, 384, 0);
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar6 = (p3.m) obj3;
                                    int iIntValue6 = ((Integer) obj4).intValue();
                                    if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        x1 x1Var6 = p3.n.f135158a;
                                        d92.b.f58623a.getClass();
                                        long jC = o4.d0.c(0.5f, d92.b.a(mVar6).f().d(), 14);
                                        h4.r.a aVar5 = h4.r.S;
                                        d92.b.f58625c.getClass();
                                        i7.b(dVar, str, x2.u(aVar5, j92.b.f97901d.f97905d), jC, mVar6, 0, 0);
                                    } else {
                                        mVar6.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar3), mVar3, 1572864, 62);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c0(e23.a aVar, u4.d dVar, String str, int i14) {
        this.f58681a = i14;
        this.f58684d = aVar;
        this.f58682b = dVar;
        this.f58683c = str;
    }

    public /* synthetic */ c0(int i14, int i15, e23.a aVar, String str, u4.d dVar) {
        this.f58681a = i15;
        this.f58683c = str;
        this.f58682b = dVar;
        this.f58684d = aVar;
    }
}
