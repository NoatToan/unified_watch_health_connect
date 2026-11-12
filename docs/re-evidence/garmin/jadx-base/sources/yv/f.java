package yv;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.bikesensors.firmwareupdate.SensorsFirmwareUpdateActivity;
import e23.p;
import o13.l;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import yr.o0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f199828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SensorsFirmwareUpdateActivity f199829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f199830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f199831e;

    public /* synthetic */ f(boolean z14, SensorsFirmwareUpdateActivity sensorsFirmwareUpdateActivity, long j8, l lVar, int i14) {
        this.f199827a = i14;
        this.f199828b = z14;
        this.f199829c = sensorsFirmwareUpdateActivity;
        this.f199830d = j8;
        this.f199831e = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f199827a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                SensorsFirmwareUpdateActivity.a aVar = SensorsFirmwareUpdateActivity.f30877a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(598691412, new f(this.f199828b, this.f199829c, this.f199830d, this.f199831e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                SensorsFirmwareUpdateActivity.a aVar2 = SensorsFirmwareUpdateActivity.f30877a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    d dVar = (d) this.f199831e.getValue();
                    final boolean z14 = this.f199828b;
                    boolean zH = mVar2.h(z14);
                    final SensorsFirmwareUpdateActivity sensorsFirmwareUpdateActivity = this.f199829c;
                    boolean zR = zH | mVar2.r(sensorsFirmwareUpdateActivity);
                    final long j8 = this.f199830d;
                    boolean zL = zR | mVar2.l(j8);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zL) {
                        objQ = new e23.a() { // from class: yv.g
                            @Override // e23.a
                            public final Object invoke() {
                                SensorsFirmwareUpdateActivity.a aVar4 = SensorsFirmwareUpdateActivity.f30877a;
                                if (z14) {
                                    Intent intentPutExtras = new Intent().putExtras(h7.c.a(new o13.p("extra_device_unit_id", Long.valueOf(j8))));
                                    SensorsFirmwareUpdateActivity sensorsFirmwareUpdateActivity2 = sensorsFirmwareUpdateActivity;
                                    sensorsFirmwareUpdateActivity2.setResult(-1, intentPutExtras);
                                    sensorsFirmwareUpdateActivity2.finish();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new e23.a() { // from class: yv.g
                                @Override // e23.a
                                public final Object invoke() {
                                    SensorsFirmwareUpdateActivity.a aVar4 = SensorsFirmwareUpdateActivity.f30877a;
                                    if (z14) {
                                        Intent intentPutExtras = new Intent().putExtras(h7.c.a(new o13.p("extra_device_unit_id", Long.valueOf(j8))));
                                        SensorsFirmwareUpdateActivity sensorsFirmwareUpdateActivity2 = sensorsFirmwareUpdateActivity;
                                        sensorsFirmwareUpdateActivity2.setResult(-1, intentPutExtras);
                                        sensorsFirmwareUpdateActivity2.finish();
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(sensorsFirmwareUpdateActivity) | mVar2.h(z14);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new as2.d(sensorsFirmwareUpdateActivity, z14, 21);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new as2.d(sensorsFirmwareUpdateActivity, z14, 21);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.l lVar = (e23.l) objQ2;
                    boolean zR3 = mVar2.r(sensorsFirmwareUpdateActivity);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new o0(sensorsFirmwareUpdateActivity, 3);
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new o0(sensorsFirmwareUpdateActivity, 3);
                            mVar2.K(objQ3);
                        }
                    }
                    h.a(dVar, aVar4, lVar, (e23.a) objQ3, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
