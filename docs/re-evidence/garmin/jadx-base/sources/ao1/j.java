package ao1;

import c2.t2;
import e23.q;
import h4.r;
import ov1.o;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import rk0.y;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f11571c;

    public /* synthetic */ j(String str, e23.a aVar) {
        this.f11569a = 0;
        this.f11571c = aVar;
        this.f11570b = str;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f11569a;
        m.a aVar = m.f135153a;
        e23.a aVar2 = this.f11571c;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    k.d(0, aVar2, this.f11570b, mVar);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                v.h.y(731852360, rVar, (Integer) obj3, mVar2);
                x1 x1Var2 = n.f135158a;
                boolean zB = mVar2.B(aVar2);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new ku1.a(aVar2, 24);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ku1.a(aVar2, 24);
                        mVar2.K(objQ);
                    }
                }
                r rVarD = w.d(rVar, false, this.f11570b, null, (e23.a) objQ, 13);
                mVar2.f();
                return rVarD;
            case 2:
                r rVar2 = (r) obj;
                m mVar3 = (m) obj2;
                v.h.y(1969068455, rVar2, (Integer) obj3, mVar3);
                x1 x1Var3 = n.f135158a;
                boolean zB2 = mVar3.B(aVar2);
                Object objQ2 = mVar3.q();
                if (zB2) {
                    objQ2 = new ku1.a(aVar2, 23);
                    mVar3.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new ku1.a(aVar2, 23);
                        mVar3.K(objQ2);
                    }
                }
                r rVarD2 = w.d(rVar2, false, this.f11570b, null, (e23.a) objQ2, 13);
                mVar3.f();
                return rVarD2;
            case 3:
                t2 t2Var = (t2) obj;
                m mVar4 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar4.B(t2Var) ? 4 : 2;
                }
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    l72.w.a aVar3 = l72.w.a.f111302a;
                    boolean zB3 = mVar4.B(aVar2);
                    Object objQ3 = mVar4.q();
                    if (zB3) {
                        objQ3 = new o(aVar2, 19);
                        mVar4.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new o(aVar2, 19);
                            mVar4.K(objQ3);
                        }
                    }
                    aVar3.b(t2Var, this.f11570b, null, (e23.a) objQ3, mVar4, iIntValue2 & 14, 2);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            default:
                r rVar3 = (r) obj;
                m mVar5 = (m) obj2;
                v.h.y(-484134945, rVar3, (Integer) obj3, mVar5);
                x1 x1Var5 = n.f135158a;
                boolean zB4 = mVar5.B(aVar2);
                Object objQ4 = mVar5.q();
                if (zB4) {
                    objQ4 = new y(aVar2, 15);
                    mVar5.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new y(aVar2, 15);
                        mVar5.K(objQ4);
                    }
                }
                r rVarD3 = w.d(rVar3, false, this.f11570b, null, (e23.a) objQ4, 13);
                mVar5.f();
                return rVarD3;
        }
    }

    public /* synthetic */ j(String str, e23.a aVar, int i14) {
        this.f11569a = i14;
        this.f11570b = str;
        this.f11571c = aVar;
    }
}
