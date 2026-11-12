package ch1;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d1 implements xg1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsDTO f27317b;

    public /* synthetic */ d1(a5 a5Var, DeviceSettingsDTO deviceSettingsDTO, int i14) {
        this.f27316a = i14;
        this.f27317b = deviceSettingsDTO;
    }

    @Override // xg1.c
    public final xg1.s l() {
        zk0.h hVar;
        int i14 = this.f27316a;
        DeviceSettingsDTO deviceSettingsDTO = this.f27317b;
        switch (i14) {
            case 0:
                int i15 = f1.f27339f;
                nr0.a aVar = deviceSettingsDTO.f33879j1;
                return qh0.a.u6(((aVar == null || (hVar = aVar.f127608b) == null) ? Double.valueOf(Double.NaN) : Double.valueOf(hVar.C())).intValue(), null);
            case 1:
                int i16 = f2.f27341f;
                nr0.a aVar2 = deviceSettingsDTO.f33879j1;
                return ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).S((aVar2 == null || !aVar2.f()) ? Double.valueOf(Double.NaN) : Double.valueOf(aVar2.b()));
            default:
                xg1.n nVarY = p4.y(deviceSettingsDTO);
                int i17 = nVarY.f190912a;
                boolean z14 = nVarY.f190913b;
                xg1.m.f190903g.getClass();
                xg1.m mVar = new xg1.m();
                Bundle bundle = new Bundle();
                bundle.putInt("arg1", R.string.steps_step_goal_title);
                bundle.putInt("arg2", i17);
                bundle.putBoolean("arg3", z14);
                mVar.setArguments(bundle);
                return mVar;
        }
    }
}
