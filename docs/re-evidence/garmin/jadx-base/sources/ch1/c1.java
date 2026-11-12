package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class c1 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.u> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27309e = View.generateViewId();

    public c1(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.X != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.u, CharSequence> q(DeviceSettingsDTO.u[] uVarArr) {
        DeviceSettingsDTO.u[] uVarArr2 = uVarArr;
        HashMap map = new HashMap();
        if (uVarArr2 != null) {
            for (DeviceSettingsDTO.u uVar : uVarArr2) {
                map.put(uVar, this.f70343a.getString(uVar.f34066b));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.u r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        DeviceSettingsDTO.u.a aVar = DeviceSettingsDTO.u.f34061c;
        String str = deviceSettingsDTO2.X;
        aVar.getClass();
        if (str != null) {
            w13.c cVar = DeviceSettingsDTO.u.f34064f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                DeviceSettingsDTO.u uVar = (DeviceSettingsDTO.u) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(uVar.f34065a, str)) {
                    return uVar;
                }
            }
        }
        return DeviceSettingsDTO.u.MONDAY;
    }

    @Override // fb2.t
    public final int t() {
        return f27309e;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.lbl_first_day_of_the_week);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.u[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return DeviceSettingsDTO.u.values();
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.u uVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.u uVar2 = uVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return;
        }
        uVar2.getClass();
        deviceSettingsDTO2.X = uVar2.f34065a;
        deviceSettingsDTO2.S1("startOfWeek");
    }
}
