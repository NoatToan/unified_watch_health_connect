package w12;

import e23.p;
import m12.s;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.c f181272b;

    public /* synthetic */ e(s.c cVar, int i14) {
        this.f181271a = i14;
        this.f181272b = cVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f181271a;
        s.c cVar = this.f181272b;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    if (cVar.f115862a.f115892i) {
                        mVar.C(-932467417);
                        g.a(mVar, 0);
                    } else {
                        mVar.C(1158293640);
                    }
                    mVar.f();
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (cVar.f115862a.f115892i) {
                        mVar.C(-1855055643);
                        g.a(mVar, 0);
                    } else {
                        mVar.C(-1672137590);
                    }
                    mVar.f();
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
