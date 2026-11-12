package m30;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n30.e f116403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.i f116404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f116405d;

    public /* synthetic */ u(n30.e eVar, com.garmin.android.apps.connectmobile.courses.model.i iVar, v vVar, int i14) {
        this.f116402a = i14;
        this.f116403b = eVar;
        this.f116404c = iVar;
        this.f116405d = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f116402a;
        v vVar = this.f116405d;
        com.garmin.android.apps.connectmobile.courses.model.i iVar = this.f116404c;
        n30.e eVar = this.f116403b;
        int i15 = 1;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                v.a aVar = v.f116406k;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1235983359, new u(eVar, iVar, vVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                v.a aVar2 = v.f116406k;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zR = mVar.r(vVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new kp2.a(vVar, 21);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new kp2.a(vVar, 21);
                            mVar.K(objQ);
                        }
                    }
                    w.a(eVar, iVar, (e23.l) objQ, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
