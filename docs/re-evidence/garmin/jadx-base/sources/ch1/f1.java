package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class f1 extends a5<DeviceSettingsDTO, Double> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27339f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xg1.j f27340e;

    public f1(Context context, xg1.j jVar) {
        super(context);
        this.f27340e = jVar;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        nr0.a aVar = ((DeviceSettingsDTO) obj).f33879j1;
        return (aVar == null || aVar.f127608b == null) ? false : true;
    }

    @Override // ch1.a5
    public final Double s(DeviceSettingsDTO deviceSettingsDTO) {
        zk0.h hVar;
        nr0.a aVar = deviceSettingsDTO.f33879j1;
        return (aVar == null || (hVar = aVar.f127608b) == null) ? Double.valueOf(Double.NaN) : Double.valueOf(hVar.C());
    }

    @Override // ch1.a5
    public final int t() {
        return R.id.user_settings_daily_floors_climbed_goal;
    }

    @Override // ch1.a5
    public final String u() {
        return b(R.string.user_settings_daily_floors_climbed);
    }

    @Override // ch1.a5
    public final xg1.c<Double> v(DeviceSettingsDTO deviceSettingsDTO) {
        return new d1(this, deviceSettingsDTO, 0);
    }

    @Override // ch1.a5
    public final xg1.r<Double> w() {
        return new e1(this);
    }

    @Override // ch1.a5
    public final void x(Double d14, DeviceSettingsDTO deviceSettingsDTO) {
        Double d15 = d14;
        nr0.a aVar = deviceSettingsDTO.f33879j1;
        if (aVar == null || aVar.f127608b == null) {
            return;
        }
        int iIntValue = d15 != null ? d15.intValue() : 0;
        if (aVar.f127608b == null) {
            zk0.h hVar = new zk0.h();
            aVar.f127608b = hVar;
            hVar.goalType = "FLOORS_CLIMBED";
        }
        zk0.h hVar2 = aVar.f127608b;
        hVar2.getClass();
        hVar2.D(iIntValue);
        xg1.j jVar = this.f27340e;
        if (jVar != null) {
            jVar.a(aVar);
        }
    }
}
