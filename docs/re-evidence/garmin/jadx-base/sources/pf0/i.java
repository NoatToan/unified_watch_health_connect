package pf0;

import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgCompleteSetupFragment;
import f72.j0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f137485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f137486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f137487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f137488e;

    public /* synthetic */ i(int i14, int i15, int i16, int i17, e23.a aVar) {
        this.f137484a = i17;
        this.f137485b = i14;
        this.f137486c = i15;
        this.f137487d = i16;
        this.f137488e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        boolean z14 = false;
        switch (this.f137484a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i14 = EcgCompleteSetupFragment.f34851d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-960937174, new i(this.f137485b, this.f137486c, this.f137487d, 1, this.f137488e), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i15 = EcgCompleteSetupFragment.f34851d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = j0.a(t62.c.f162799a);
                    String strQ = gl1.y.Q(mVar2, this.f137485b);
                    String strQ2 = gl1.y.Q(mVar2, this.f137486c);
                    String strQ3 = gl1.y.Q(mVar2, this.f137487d);
                    e23.a aVar = this.f137488e;
                    boolean zB = mVar2.B(aVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        obj3 = objQ;
                        j jVar = new j(aVar, z14 ? 1 : 0);
                        mVar2.K(jVar);
                        obj3 = jVar;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj3 = objQ;
                            j jVar2 = new j(aVar, z14 ? 1 : 0);
                            mVar2.K(jVar2);
                            obj3 = jVar2;
                        }
                    }
                    obj3 = objQ;
                    b82.n.d(dVarA, strQ, strQ2, null, strQ3, (e23.a) obj3, null, null, mVar2, 0, 200);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
