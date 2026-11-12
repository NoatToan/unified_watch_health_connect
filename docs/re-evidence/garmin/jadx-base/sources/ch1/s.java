package ch1;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class s implements fb2.b0.a<DeviceSettingsDTO.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f27448a;

    public s(t tVar) {
        this.f27448a = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.b0.a
    public final void e(DeviceSettingsDTO.h hVar) {
        DeviceSettingsDTO.h hVar2 = hVar;
        HashMap map = t.f27460d;
        t tVar = this.f27448a;
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) tVar.f70344b;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
            return;
        }
        hVar2.getClass();
        String str = hVar2.f33962a;
        deviceSettingsDTO.U0 = str;
        deviceSettingsDTO.S1(str);
        tVar.setChanged();
        tVar.notifyObservers(hVar2);
    }
}
