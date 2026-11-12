package ij1;

import android.content.DialogInterface;
import androidx.lifecycle.v1;
import p005kotlin.Unit;
import p3.p0;
import w52.q1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93825a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f93826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f93827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f93828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f93829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f93830f;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a aVar, boolean z14, gj1.b bVar, boolean z15, boolean z16) {
        this.f93829e = aVar;
        this.f93826b = z14;
        this.f93830f = bVar;
        this.f93827c = z15;
        this.f93828d = z16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f93825a;
        Object obj3 = this.f93830f;
        Object obj4 = this.f93829e;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a aVar = (com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a) obj4;
                gj1.b bVar = (gj1.b) obj3;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a.C0810a c0810a = com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a.f43671l;
                dialogInterface.getClass();
                ej1.b bVar2 = aVar.u6().f93835b;
                ej1.b bVar3 = ej1.b.WEARABLE_DEVICE;
                boolean z14 = this.f93826b;
                if (bVar2 == bVar3 && !z14) {
                    Long deviceId = bVar.getDeviceId();
                    if (deviceId != null) {
                        aVar.u6().C4(deviceId.longValue(), false);
                    }
                } else if ((aVar.u6().f93835b == bVar3 && z14) || (aVar.u6().f93835b == ej1.b.TRAINING_DEVICE && this.f93827c)) {
                    Long deviceId2 = bVar.getDeviceId();
                    if (deviceId2 != null) {
                        long jLongValue = deviceId2.longValue();
                        if ((aVar.u6().f93835b != bVar3 || this.f93828d) && aVar.u6().f93835b != ej1.b.TRAINING_DEVICE) {
                            aVar.u6().C4(jLongValue, false);
                        } else {
                            aVar.u6().C4(jLongValue, true);
                        }
                    }
                } else {
                    Long deviceId3 = bVar.getDeviceId();
                    if (deviceId3 != null) {
                        gj1.d dVar = new gj1.d(Long.valueOf(deviceId3.longValue()));
                        g gVarU6 = aVar.u6();
                        ge1.b.T(v1.a(gVarU6), null, null, new n(gVarU6, dVar, false, null), 3);
                    }
                }
                dialogInterface.dismiss();
                break;
            default:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                q1.j(this.f93826b, this.f93827c, this.f93828d, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, iT);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(boolean z14, boolean z15, boolean z16, e23.a aVar, e23.a aVar2, int i14) {
        this.f93826b = z14;
        this.f93827c = z15;
        this.f93828d = z16;
        this.f93829e = aVar;
        this.f93830f = aVar2;
    }
}
