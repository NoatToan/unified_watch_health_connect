package bb0;

import c2.a0;
import c2.l;
import c2.x2;
import da0.u;
import da0.v;
import e23.q;
import gl1.y;
import h4.r;
import j90.g;
import java.util.Iterator;
import java.util.List;
import k2.i;
import o4.m1;
import o4.r1;
import p005kotlin.Unit;
import p13.h0;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f17289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f17290c;

    public /* synthetic */ a(List list, p1 p1Var, int i14) {
        this.f17288a = i14;
        this.f17289b = list;
        this.f17290c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:63:0x0166  */
    /* JADX WARN: Code duplicated, block: B:94:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r1 r1VarC;
        r1 r1VarC2;
        int i14 = this.f17288a;
        m.a aVar = m.f135153a;
        boolean z14 = true;
        p1 p1Var = this.f17290c;
        List<c> list = this.f17289b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.h(aVar2, j92.b.f97899b.f97920e), mVar);
                    for (c cVar : list) {
                        if (cVar == h0.b0(list)) {
                            float f14 = u.f58858a;
                            r1VarC = i.c(f14, f14, 0.0f, 0.0f, 12);
                        } else if (cVar == h0.m0(list)) {
                            float f15 = u.f58858a;
                            r1VarC = i.c(0.0f, 0.0f, f15, f15, 3);
                        } else {
                            r1VarC = m1.f128891a;
                        }
                        r1 r1Var = r1VarC;
                        boolean z15 = ((c) p1Var.getF182175a()) == cVar;
                        String strQ = y.Q(mVar, cVar.f17294b);
                        boolean zK = mVar.k(cVar.ordinal());
                        Object objQ = mVar.q();
                        if (zK) {
                            objQ = new ao1.i(29, cVar, p1Var);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ao1.i(29, cVar, p1Var);
                                mVar.K(objQ);
                            }
                        }
                        u.a(null, z15, strQ, null, r1Var, (e23.a) objQ, mVar, 0, 9);
                    }
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    r.a aVar3 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.h(aVar3, j92.b.f97899b.f97920e), mVar2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        if (fVar == h0.b0(list)) {
                            float f16 = u.f58858a;
                            r1VarC2 = i.c(f16, f16, 0.0f, 0.0f, 12);
                        } else if (fVar == h0.m0(list)) {
                            float f17 = u.f58858a;
                            r1VarC2 = i.c(0.0f, 0.0f, f17, f17, 3);
                        } else {
                            r1VarC2 = m1.f128891a;
                        }
                        r1 r1Var2 = r1VarC2;
                        boolean z16 = ((f) p1Var.getF182175a()) == fVar ? z14 : false;
                        String strQ2 = y.Q(mVar2, fVar.f17301b);
                        boolean zK2 = mVar2.k(fVar.ordinal());
                        boolean z17 = z14;
                        Object objQ2 = mVar2.q();
                        if (zK2) {
                            objQ2 = new d(0, fVar, p1Var);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new d(0, fVar, p1Var);
                                mVar2.K(objQ2);
                            }
                        }
                        m mVar3 = mVar2;
                        u.a(null, z16, strQ2, null, r1Var2, (e23.a) objQ2, mVar3, 0, 9);
                        mVar2 = mVar3;
                        z14 = z17;
                    }
                    x1 x1Var4 = n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar4 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    r.a aVar4 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.h(aVar4, j92.b.f97899b.f97921f), mVar4);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        g gVar = (g) it3.next();
                        long j8 = gVar.f97815a;
                        Long l14 = (Long) p1Var.getF182175a();
                        boolean z18 = l14 != null && j8 == l14.longValue();
                        String str = gVar.f97817c;
                        String str2 = str == null ? "" : str;
                        String str3 = gVar.f97816b;
                        String str4 = str3 == null ? "" : str3;
                        boolean zB = mVar4.B(gVar);
                        Object objQ3 = mVar4.q();
                        if (zB) {
                            objQ3 = new o50.a(26, gVar, p1Var);
                            mVar4.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new o50.a(26, gVar, p1Var);
                                mVar4.K(objQ3);
                            }
                        }
                        v.a(null, z18, false, str2, null, str4, null, (e23.l) objQ3, mVar4, 0, 85);
                        r.a aVar5 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        l.f(x2.h(aVar5, j92.b.f97899b.f97920e), mVar4);
                    }
                    x1 x1Var6 = n.f135158a;
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
