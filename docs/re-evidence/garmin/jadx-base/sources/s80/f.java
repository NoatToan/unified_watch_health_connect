package s80;

import aa2.s;
import aa2.u;
import com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeActivity;
import e23.p;
import o13.l;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import s70.b0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DevicePasscodeActivity f157921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f157922c;

    public /* synthetic */ f(DevicePasscodeActivity devicePasscodeActivity, l lVar, int i14) {
        this.f157920a = i14;
        this.f157921b = devicePasscodeActivity;
        this.f157922c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f157920a;
        ?? r14 = this.f157922c;
        DevicePasscodeActivity devicePasscodeActivity = this.f157921b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                DevicePasscodeActivity.a aVar = DevicePasscodeActivity.f33744a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(749762011, new f(devicePasscodeActivity, r14, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                DevicePasscodeActivity.a aVar2 = DevicePasscodeActivity.f33744a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(devicePasscodeActivity.getOnBackPressedDispatcher()), z3.f.c(-1325135589, new f(devicePasscodeActivity, r14, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                DevicePasscodeActivity.a aVar3 = DevicePasscodeActivity.f33744a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    u uVar = (u) r14.getValue();
                    boolean zR = mVar3.r(devicePasscodeActivity);
                    Object objQ = mVar3.q();
                    m.a aVar4 = m.f135153a;
                    if (zR) {
                        objQ = new ro0.g(devicePasscodeActivity, 18);
                        mVar3.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ro0.g(devicePasscodeActivity, 18);
                            mVar3.K(objQ);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ;
                    boolean zR2 = mVar3.r(devicePasscodeActivity);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new b0(devicePasscodeActivity, 5);
                        mVar3.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new b0(devicePasscodeActivity, 5);
                            mVar3.K(objQ2);
                        }
                    }
                    a.f157870a.getClass();
                    s.b(uVar, aVar5, (e23.l) objQ2, null, a.f157871b, mVar3, u.f2388g | 24576);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
