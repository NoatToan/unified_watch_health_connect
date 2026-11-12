package ow1;

import c2.l;
import c2.x2;
import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import pi0.e;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.training.itp.a f134293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f134294c;

    public /* synthetic */ a(com.garmin.android.apps.connectmobile.training.itp.a aVar, e eVar, int i14) {
        this.f134292a = i14;
        this.f134293b = aVar;
        this.f134294c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f134292a;
        e eVar = this.f134294c;
        com.garmin.android.apps.connectmobile.training.itp.a aVar = this.f134293b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-2027578046, new a(aVar, eVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a2 = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97918c;
                    float f15 = eVar2.f97920e;
                    r rVarC = l.C(rVarF, f15, f14, f15, 0.0f, 8);
                    boolean zR = mVar2.r(aVar) | mVar2.r(eVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new o50.a(14, aVar, eVar);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new o50.a(14, aVar, eVar);
                            mVar2.K(objQ);
                        }
                    }
                    e2.c.b(rVarC, null, null, null, null, null, false, null, (e23.l) objQ, mVar2, 0, 510);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
