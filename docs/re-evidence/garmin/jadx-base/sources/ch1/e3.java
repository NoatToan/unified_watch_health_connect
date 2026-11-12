package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class e3 extends fb2.a<DeviceSettingsDTO> {
    public e3(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.W0 != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.m mVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return false;
        }
        DeviceSettingsDTO.m.a aVar = DeviceSettingsDTO.m.f33991b;
        String str = deviceSettingsDTO2.W0;
        aVar.getClass();
        if (str == null) {
            mVar = DeviceSettingsDTO.m.SHOW_ALL;
            break;
        }
        w13.c cVar = DeviceSettingsDTO.m.f33995f;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                mVar = DeviceSettingsDTO.m.SHOW_ALL;
                break;
            }
            mVar = (DeviceSettingsDTO.m) bVarN.next();
        } while (!p005kotlin.jvm.internal.s.g(mVar.f33996a, str));
        return mVar != DeviceSettingsDTO.m.SHOW_NONE;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return R.id.device_settings_phone_notifications_btn;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_setting_phone_notifications);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
            return;
        }
        if (z14) {
            DeviceSettingsDTO.m mVar = DeviceSettingsDTO.m.SHOW_ALL;
            mVar.getClass();
            String str = mVar.f33996a;
            deviceSettingsDTO.W0 = str;
            deviceSettingsDTO.S1(str);
            return;
        }
        DeviceSettingsDTO.m mVar2 = DeviceSettingsDTO.m.SHOW_NONE;
        mVar2.getClass();
        String str2 = mVar2.f33996a;
        deviceSettingsDTO.W0 = str2;
        deviceSettingsDTO.S1(str2);
    }
}
