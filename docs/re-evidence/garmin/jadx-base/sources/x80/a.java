package x80;

import ca0.o1;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import e23.p;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSetupActivity f189494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f189495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l90.d f189496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q90.d.a f189497e;

    public /* synthetic */ a(DeviceSetupActivity deviceSetupActivity, o1 o1Var, l90.d dVar, q90.d.a aVar, int i14) {
        this.f189493a = i14;
        this.f189494b = deviceSetupActivity;
        this.f189495c = o1Var;
        this.f189496d = dVar;
        this.f189497e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f189493a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                DeviceSetupActivity.a aVar = DeviceSetupActivity.f33758b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-445237397, new a(this.f189494b, this.f189495c, this.f189496d, this.f189497e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                DeviceSetupActivity.a aVar2 = DeviceSetupActivity.f33758b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    DeviceSetupActivity deviceSetupActivity = this.f189494b;
                    boolean zR = mVar2.r(deviceSetupActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new DeviceSetupActivity.b(deviceSetupActivity);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new DeviceSetupActivity.b(deviceSetupActivity);
                            mVar2.K(objQ);
                        }
                    }
                    k23.g gVar = (k23.g) objQ;
                    boolean zR2 = mVar2.r(deviceSetupActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new DeviceSetupActivity.c(deviceSetupActivity);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new DeviceSetupActivity.c(deviceSetupActivity);
                            mVar2.K(objQ2);
                        }
                    }
                    k23.g gVar2 = (k23.g) objQ2;
                    boolean zR3 = mVar2.r(deviceSetupActivity);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new DeviceSetupActivity.d(deviceSetupActivity);
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new DeviceSetupActivity.d(deviceSetupActivity);
                            mVar2.K(objQ3);
                        }
                    }
                    k23.g gVar3 = (k23.g) objQ3;
                    boolean zR4 = mVar2.r(deviceSetupActivity);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        objQ4 = new DeviceSetupActivity.e(deviceSetupActivity);
                        mVar2.K(objQ4);
                    } else {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new DeviceSetupActivity.e(deviceSetupActivity);
                            mVar2.K(objQ4);
                        }
                    }
                    k23.g gVar4 = (k23.g) objQ4;
                    boolean zR5 = mVar2.r(deviceSetupActivity);
                    Object objQ5 = mVar2.q();
                    if (zR5) {
                        objQ5 = new DeviceSetupActivity.f(deviceSetupActivity);
                        mVar2.K(objQ5);
                    } else {
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new DeviceSetupActivity.f(deviceSetupActivity);
                            mVar2.K(objQ5);
                        }
                    }
                    k23.g gVar5 = (k23.g) objQ5;
                    boolean zR6 = mVar2.r(deviceSetupActivity);
                    Object objQ6 = mVar2.q();
                    if (zR6) {
                        objQ6 = new DeviceSetupActivity.g(deviceSetupActivity);
                        mVar2.K(objQ6);
                    } else {
                        aVar3.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new DeviceSetupActivity.g(deviceSetupActivity);
                            mVar2.K(objQ6);
                        }
                    }
                    ca0.x1.a(this.f189495c, this.f189496d, this.f189497e, (e23.a) gVar, (e23.a) gVar2, (e23.a) gVar3, (p) gVar5, (e23.l) gVar4, (p) ((k23.g) objQ6), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
