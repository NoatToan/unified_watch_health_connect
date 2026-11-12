package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class p4 extends a5<DeviceSettingsDTO, xg1.n> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27435f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xg1.j f27436e;

    public p4(Context context, xg1.j jVar) {
        super(context);
        this.f27436e = jVar;
    }

    public static xg1.n y(DeviceSettingsDTO deviceSettingsDTO) {
        int iIntValue;
        int iIntValue2;
        zk0.c cVar;
        xg1.n nVar = new xg1.n();
        nr0.a aVar = deviceSettingsDTO.f33879j1;
        if (aVar != null && aVar.f127607a != null) {
            if (aVar.d() != 0) {
                iIntValue2 = aVar.d();
            } else {
                zk0.c cVar2 = aVar.f127607a;
                if (cVar2 != null) {
                    Integer deviceGoal = cVar2.getDeviceGoal();
                    deviceGoal.getClass();
                    iIntValue = deviceGoal.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue == 0 || (cVar = aVar.f127607a) == null) {
                    iIntValue2 = 0;
                } else {
                    Integer deviceGoal2 = cVar.getDeviceGoal();
                    deviceGoal2.getClass();
                    iIntValue2 = deviceGoal2.intValue();
                }
            }
            nVar.f190912a = iIntValue2;
            nVar.f190913b = aVar.d() == 0;
        }
        return nVar;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        nr0.a aVar = ((DeviceSettingsDTO) obj).f33879j1;
        return (aVar == null || aVar.f127607a == null) ? false : true;
    }

    @Override // ch1.a5
    public final /* bridge */ /* synthetic */ xg1.n s(DeviceSettingsDTO deviceSettingsDTO) {
        return y(deviceSettingsDTO);
    }

    @Override // ch1.a5
    public final int t() {
        return R.id.user_settings_daily_steps_goal;
    }

    @Override // ch1.a5
    public final String u() {
        return b(R.string.steps_step_goal_title);
    }

    @Override // ch1.a5
    public final xg1.c<xg1.n> v(DeviceSettingsDTO deviceSettingsDTO) {
        return new d1(this, deviceSettingsDTO, 2);
    }

    @Override // ch1.a5
    public final xg1.r<xg1.n> w() {
        return new o4(this);
    }

    @Override // ch1.a5
    public final void x(xg1.n nVar, DeviceSettingsDTO deviceSettingsDTO) {
        xg1.n nVar2 = nVar;
        nr0.a aVar = deviceSettingsDTO.f33879j1;
        if (aVar == null || nVar2 == null) {
            return;
        }
        int iD = aVar.d();
        boolean z14 = iD <= 0;
        int i14 = z14 ? 0 : iD;
        boolean z15 = nVar2.f190913b;
        if (z15 == z14 && (z14 || i14 == nVar2.f190912a)) {
            return;
        }
        zk0.c cVar = z15 ? new zk0.c(0, 0, false, null, null) : new zk0.c(Integer.valueOf(nVar2.f190912a), 0, false, "permanently", null);
        xg1.j jVar = this.f27436e;
        if (jVar != null) {
            aVar.f127607a = cVar;
            jVar.a(aVar);
        }
    }
}
