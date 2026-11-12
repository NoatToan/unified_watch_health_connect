package zk1;

import c2.x2;
import e23.l;
import e23.p;
import h4.r;
import m4.b0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p006l2.a2;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import r82.s;
import x5.f0;
import x5.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f205085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f205086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f205087d;

    public /* synthetic */ a(String str, b0 b0Var, p1 p1Var, int i14) {
        this.f205084a = i14;
        this.f205085b = str;
        this.f205086c = b0Var;
        this.f205087d = p1Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f205084a;
        m.a aVar = m.f135153a;
        p1 p1Var = this.f205087d;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    v.f188954b.getClass();
                    a2 a2Var = new a2(0, (Boolean) null, v.f188963k, 0, (f0) null, (Boolean) null, (z5.c) null, 123, (j) null);
                    String str = this.f205085b;
                    str.getClass();
                    Object objQ = mVar.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new xq1.c(p1Var, 19);
                        mVar.K(objQ);
                    }
                    s.a(rVarF, a2Var, str, 5, this.f205086c, (l) objQ, mVar, 224310, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarF2 = x2.f(r.S, 1.0f);
                    v.f188954b.getClass();
                    a2 a2Var2 = new a2(0, (Boolean) null, v.f188957e, 0, (f0) null, (Boolean) null, (z5.c) null, 123, (j) null);
                    Object objQ2 = mVar2.q();
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new xq1.c(p1Var, 20);
                        mVar2.K(objQ2);
                    }
                    s.a(rVarF2, a2Var2, this.f205085b, 5, this.f205086c, (l) objQ2, mVar2, 224310, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
