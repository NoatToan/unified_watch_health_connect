package ch1;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class n5 implements fb2.b0.a<DeviceSettingsDTO.q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o5 f27423a;

    public n5(o5 o5Var) {
        this.f27423a = o5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.b0.a
    public final void e(DeviceSettingsDTO.q qVar) {
        DeviceSettingsDTO.q qVar2 = qVar;
        HashMap map = o5.f27430d;
        o5 o5Var = this.f27423a;
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) o5Var.f70344b;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
            return;
        }
        deviceSettingsDTO.J1(qVar2);
        o5Var.setChanged();
        o5Var.notifyObservers(qVar2);
    }
}
