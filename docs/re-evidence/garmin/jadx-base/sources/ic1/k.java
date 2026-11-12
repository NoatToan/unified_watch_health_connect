package ic1;

import c2.t;
import e23.r;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.x1;
import rr0.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o82.a f92626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n82.f f92627c;

    public /* synthetic */ k(o82.a aVar, n82.f fVar, int i14) {
        this.f92625a = i14;
        this.f92626b = aVar;
        this.f92627c = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0220  */
    /* JADX WARN: Code duplicated, block: B:107:0x0273  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c9  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f92625a;
        p3.m.a aVar = p3.m.f135153a;
        n82.f fVar = this.f92627c;
        o82.a aVar2 = this.f92626b;
        switch (i14) {
            case 0:
                u82.f fVar2 = (u82.f) obj2;
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((t) obj).getClass();
                fVar2.getClass();
                x1 x1Var = p3.n.f135158a;
                dc1.f fVar3 = (dc1.f) fVar2.a();
                DateTime dateTimeK = vb.h.k(aVar2.f130843a);
                DateTime dateTimeK2 = vb.h.k(aVar2.f130844b);
                boolean zB = mVar.B(fVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new d52.k(fVar, 7);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new d52.k(fVar, 7);
                        mVar.K(objQ);
                    }
                }
                nc1.e.a(fVar3, dateTimeK, dateTimeK2, (e23.l) objQ, mVar, 0);
                break;
            case 1:
                u82.f fVar4 = (u82.f) obj2;
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((t) obj).getClass();
                fVar4.getClass();
                x1 x1Var2 = p3.n.f135158a;
                List list = (List) fVar4.a();
                DateTime dateTimeK3 = vb.h.k(aVar2.f130843a);
                DateTime dateTimeK4 = vb.h.k(aVar2.f130844b);
                boolean zB2 = mVar2.B(fVar);
                Object objQ2 = mVar2.q();
                if (zB2) {
                    objQ2 = new d52.k(fVar, 9);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new d52.k(fVar, 9);
                        mVar2.K(objQ2);
                    }
                }
                ux.c.a(list, dateTimeK3, dateTimeK4, (e23.l) objQ2, mVar2, 0);
                break;
            case 2:
                u82.f fVar5 = (u82.f) obj2;
                p3.m mVar3 = (p3.m) obj3;
                int iC = vb.h.c((Integer) obj4, (t) obj, fVar5);
                if ((iC & 48) == 0) {
                    iC |= (iC & 64) == 0 ? mVar3.B(fVar5) : mVar3.r(fVar5) ? 32 : 16;
                }
                if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                    x1 x1Var3 = p3.n.f135158a;
                    ir0.e eVar = (ir0.e) fVar5.a();
                    DateTime dateTimeK5 = vb.h.k(aVar2.f130843a);
                    boolean zB3 = mVar3.B(fVar);
                    Object objQ3 = mVar3.q();
                    if (zB3) {
                        objQ3 = new d52.k(fVar, 11);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new d52.k(fVar, 11);
                            mVar3.K(objQ3);
                        }
                    }
                    u.b(eVar, dateTimeK5, (e23.l) objQ3, mVar3, ir0.e.f94792c);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                u82.f fVar6 = (u82.f) obj2;
                p3.m mVar4 = (p3.m) obj3;
                int iC2 = vb.h.c((Integer) obj4, (t) obj, fVar6);
                if ((iC2 & 48) == 0) {
                    iC2 |= (iC2 & 64) == 0 ? mVar4.B(fVar6) : mVar4.r(fVar6) ? 32 : 16;
                }
                if (mVar4.n(iC2 & 1, (iC2 & 145) != 144)) {
                    x1 x1Var4 = p3.n.f135158a;
                    mm1.f fVar7 = (mm1.f) fVar6.a();
                    DateTime dateTimeK6 = vb.h.k(aVar2.f130843a);
                    DateTime dateTimeK7 = vb.h.k(aVar2.f130844b);
                    boolean zB4 = mVar4.B(fVar);
                    Object objQ4 = mVar4.q();
                    if (zB4) {
                        objQ4 = new d52.k(fVar, 22);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new d52.k(fVar, 22);
                            mVar4.K(objQ4);
                        }
                    }
                    qn1.c.c(fVar7, dateTimeK6, dateTimeK7, (e23.l) objQ4, mVar4, 8);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                u82.f fVar8 = (u82.f) obj2;
                p3.m mVar5 = (p3.m) obj3;
                int iC3 = vb.h.c((Integer) obj4, (t) obj, fVar8);
                if ((iC3 & 48) == 0) {
                    iC3 |= (iC3 & 64) == 0 ? mVar5.B(fVar8) : mVar5.r(fVar8) ? 32 : 16;
                }
                if (mVar5.n(iC3 & 1, (iC3 & 145) != 144)) {
                    x1 x1Var5 = p3.n.f135158a;
                    LocalDate localDateH = g22.l.h(aVar2.f130843a);
                    LocalDate localDateH2 = g22.l.h(aVar2.f130844b);
                    sh0.e eVar2 = (sh0.e) fVar8.a();
                    boolean zB5 = mVar5.B(fVar);
                    Object objQ5 = mVar5.q();
                    if (zB5) {
                        objQ5 = new d52.k(fVar, 26);
                        mVar5.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new d52.k(fVar, 26);
                            mVar5.K(objQ5);
                        }
                    }
                    di0.l.a(localDateH, localDateH2, eVar2, (e23.l) objQ5, mVar5, sh0.e.f159295b << 6);
                } else {
                    mVar5.e();
                }
                break;
            default:
                u82.f fVar9 = (u82.f) obj2;
                p3.m mVar6 = (p3.m) obj3;
                int iC4 = vb.h.c((Integer) obj4, (t) obj, fVar9);
                if ((iC4 & 48) == 0) {
                    iC4 |= (iC4 & 64) == 0 ? mVar6.B(fVar9) : mVar6.r(fVar9) ? 32 : 16;
                }
                if (mVar6.n(iC4 & 1, (iC4 & 145) != 144)) {
                    x1 x1Var6 = p3.n.f135158a;
                    LocalDate localDateH3 = g22.l.h(aVar2.f130843a);
                    LocalDate localDateH4 = g22.l.h(aVar2.f130844b);
                    sh0.a aVar3 = (sh0.a) fVar9.a();
                    boolean zB6 = mVar6.B(fVar);
                    Object objQ6 = mVar6.q();
                    if (zB6) {
                        objQ6 = new d52.k(fVar, 25);
                        mVar6.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new d52.k(fVar, 25);
                            mVar6.K(objQ6);
                        }
                    }
                    di0.g.a(localDateH3, localDateH4, aVar3, (e23.l) objQ6, mVar6, sh0.a.f159271b << 6);
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
