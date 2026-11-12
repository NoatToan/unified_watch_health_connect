package vg1;

import am.a2;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b0 implements a0<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f178073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f178074b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f178075c;

    public final void a(DeviceSettingsDTO deviceSettingsDTO) {
        this.f178073a = deviceSettingsDTO;
        if (deviceSettingsDTO != null) {
            this.f178075c = deviceSettingsDTO.Y1();
        } else {
            this.f178075c = null;
        }
        ArrayList arrayList = this.f178074b;
        arrayList.clear();
        arrayList.add("audioPromptSpeedPaceDuration");
        arrayList.add("audioPromptSpeedPaceEnabled");
        arrayList.add("audioPromptSpeedPaceFrequency");
        arrayList.add("audioPromptSpeedPaceType");
        arrayList.add("audioPromptHeartRateDuration");
        arrayList.add("audioPromptHeartRateEnabled");
        arrayList.add("audioPromptHeartRateFrequency");
        arrayList.add("audioPromptHeartRateType");
        arrayList.add("audioPromptPowerDuration");
        arrayList.add("audioPromptPowerEnabled");
        arrayList.add("audioPromptPowerFrequency");
        arrayList.add("audioPromptPowerType");
    }

    @Override // vg1.a0
    public final void b(Bundle bundle) {
        if (bundle != null) {
            DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) bundle.getParcelable("GCM_deviceSettings");
            this.f178073a = deviceSettingsDTO;
            a(deviceSettingsDTO);
        }
    }

    @Override // vg1.a0
    public final void c(dc0.a aVar) {
        if (aVar != null) {
            a(aVar.f59106a);
        }
    }

    @Override // vg1.a0
    /* JADX INFO: renamed from: d */
    public final DeviceSettingsDTO getF178111a() {
        return this.f178073a;
    }

    @Override // vg1.a0
    public final boolean e() {
        DeviceSettingsDTO deviceSettingsDTO = this.f178073a;
        if (deviceSettingsDTO == null || this.f178075c == null) {
            return false;
        }
        return c22.n0.b(deviceSettingsDTO.Y1(), this.f178075c);
    }

    @Override // vg1.a0
    public final void f(r0 r0Var) {
        DeviceSettingsDTO deviceSettingsDTO = this.f178073a;
        if (deviceSettingsDTO == null || this.f178075c == null) {
            return;
        }
        r0Var.f178151a = c22.n0.a(deviceSettingsDTO.Y1(), this.f178075c, this.f178074b);
    }

    @Override // vg1.a0
    public final int g() {
        return 2;
    }

    @Override // vg1.a0
    public final void h(Bundle bundle) {
        a2.b(bundle, "GCM_deviceSettings", this.f178073a);
    }

    @Override // vg1.a0
    public final boolean hasModel() {
        return this.f178073a != null;
    }

    @Override // vg1.a0
    public final void i(DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO != null) {
            this.f178073a = deviceSettingsDTO;
        }
    }
}
