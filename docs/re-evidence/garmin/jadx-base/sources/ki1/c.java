package ki1;

import com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FindMyDeviceActivity f104824b;

    public /* synthetic */ c(FindMyDeviceActivity findMyDeviceActivity, int i14) {
        this.f104823a = i14;
        this.f104824b = findMyDeviceActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f104823a;
        FindMyDeviceActivity findMyDeviceActivity = this.f104824b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                FindMyDeviceActivity.a aVar = FindMyDeviceActivity.f43421e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1238882108, new c(findMyDeviceActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                FindMyDeviceActivity.a aVar2 = FindMyDeviceActivity.f43421e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    l lVar = (l) findMyDeviceActivity.f43422a.getValue();
                    boolean zR = mVar2.r(findMyDeviceActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new FindMyDeviceActivity.c(findMyDeviceActivity);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new FindMyDeviceActivity.c(findMyDeviceActivity);
                            mVar2.K(objQ);
                        }
                    }
                    e23.l lVar2 = (e23.l) ((k23.g) objQ);
                    boolean zR2 = mVar2.r(findMyDeviceActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new FindMyDeviceActivity.d(findMyDeviceActivity);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new FindMyDeviceActivity.d(findMyDeviceActivity);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar4 = (e23.a) ((k23.g) objQ2);
                    boolean zR3 = mVar2.r(findMyDeviceActivity);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new FindMyDeviceActivity.e(findMyDeviceActivity);
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new FindMyDeviceActivity.e(findMyDeviceActivity);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a aVar5 = (e23.a) ((k23.g) objQ3);
                    boolean zR4 = mVar2.r(findMyDeviceActivity);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        objQ4 = new FindMyDeviceActivity.f(findMyDeviceActivity);
                        mVar2.K(objQ4);
                    } else {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new FindMyDeviceActivity.f(findMyDeviceActivity);
                            mVar2.K(objQ4);
                        }
                    }
                    e23.a aVar6 = (e23.a) ((k23.g) objQ4);
                    boolean zR5 = mVar2.r(findMyDeviceActivity);
                    Object objQ5 = mVar2.q();
                    if (zR5) {
                        objQ5 = new FindMyDeviceActivity.g(findMyDeviceActivity);
                        mVar2.K(objQ5);
                    } else {
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new FindMyDeviceActivity.g(findMyDeviceActivity);
                            mVar2.K(objQ5);
                        }
                    }
                    k.c(lVar, lVar2, aVar4, aVar5, aVar6, (e23.a) objQ5, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
