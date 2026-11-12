package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class f2 extends a5<DeviceSettingsDTO, Double> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27341f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xg1.j f27342e;

    public f2(Context context, xg1.j jVar) {
        super(context);
        this.f27342e = jVar;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        nr0.a aVar = ((DeviceSettingsDTO) obj).f33879j1;
        return aVar != null && aVar.f();
    }

    @Override // ch1.a5
    public final Double s(DeviceSettingsDTO deviceSettingsDTO) {
        nr0.a aVar = deviceSettingsDTO.f33879j1;
        return (aVar == null || !aVar.f()) ? Double.valueOf(Double.NaN) : Double.valueOf(aVar.b());
    }

    @Override // ch1.a5
    public final int t() {
        return R.id.user_settings_weekly_intensity_minutes;
    }

    @Override // ch1.a5
    public final String u() {
        return b(R.string.title_intensity_minutes);
    }

    @Override // ch1.a5
    public final xg1.c<Double> v(DeviceSettingsDTO deviceSettingsDTO) {
        return new d1(this, deviceSettingsDTO, 1);
    }

    @Override // ch1.a5
    public final xg1.r<Double> w() {
        return new e2(this);
    }

    @Override // ch1.a5
    public final void x(Double d14, DeviceSettingsDTO deviceSettingsDTO) {
        Double d15 = d14;
        nr0.a aVar = deviceSettingsDTO.f33879j1;
        if (aVar == null || !aVar.f()) {
            return;
        }
        aVar.g(d15 != null ? d15.intValue() : 0);
        xg1.j jVar = this.f27342e;
        if (jVar != null) {
            jVar.a(aVar);
        }
    }
}
