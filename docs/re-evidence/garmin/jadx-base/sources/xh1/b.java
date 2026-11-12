package xh1;

import com.garmin.android.apps.connectmobile.settings.devices.swim.css.CriticalSwimSpeedEditActivity;
import e23.l;
import fw.m;
import fw.p;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CriticalSwimSpeedEditActivity f191045b;

    public /* synthetic */ b(CriticalSwimSpeedEditActivity criticalSwimSpeedEditActivity, int i14) {
        this.f191044a = i14;
        this.f191045b = criticalSwimSpeedEditActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f191044a) {
            case 0:
                CriticalSwimSpeedEditActivity criticalSwimSpeedEditActivity = this.f191045b;
                Logger logger = criticalSwimSpeedEditActivity.f43148a;
                m mVar = (m) obj;
                String str = CriticalSwimSpeedEditActivity.f43147h;
                p pVar = mVar.f73769b;
                fw.c cVar = mVar.f73771d;
                int i14 = CriticalSwimSpeedEditActivity.b.f43154a[pVar.ordinal()];
                if (i14 == 1) {
                    criticalSwimSpeedEditActivity.showProgressOverlay();
                } else if (i14 == 2) {
                    criticalSwimSpeedEditActivity.hideProgressOverlay();
                    g60.b bVar = (g60.b) mVar.f73770c;
                    Double dB = bVar != null ? bVar.b() : null;
                    logger.debug(str + " - Received critical swim speed -> " + dB);
                    if (criticalSwimSpeedEditActivity.f43153f != null) {
                        f12.l.f68084a.getClass();
                        f12.l.a.a().T3(true);
                        criticalSwimSpeedEditActivity.setResult(-1);
                        criticalSwimSpeedEditActivity.finish();
                    } else {
                        criticalSwimSpeedEditActivity.ca(dB);
                    }
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                    logger.error(str + " - Error " + cVar + " while receiving critical swim speed");
                    criticalSwimSpeedEditActivity.hideProgressOverlay();
                    g22.a.a(criticalSwimSpeedEditActivity, cVar);
                }
                return Unit.INSTANCE;
            default:
                Long l14 = (Long) obj;
                long jLongValue = l14.longValue();
                CriticalSwimSpeedEditActivity criticalSwimSpeedEditActivity2 = this.f191045b;
                if (criticalSwimSpeedEditActivity2.f43152e) {
                    criticalSwimSpeedEditActivity2.ca(Double.valueOf(jLongValue / ((double) 1000)));
                    criticalSwimSpeedEditActivity2.f43153f = l14;
                } else {
                    criticalSwimSpeedEditActivity2.da().x4(jLongValue);
                }
                return Unit.INSTANCE;
        }
    }
}
