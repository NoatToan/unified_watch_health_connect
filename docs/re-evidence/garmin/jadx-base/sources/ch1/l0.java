package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class l0 extends fb2.r<DeviceSettingsDTO, DeviceSettingsDTO.i> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f27402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f27403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27404h;

    static {
        HashMap map = new HashMap();
        f27402f = map;
        map.put(DeviceSettingsDTO.i.SMART, Integer.valueOf(View.generateViewId()));
        map.put(DeviceSettingsDTO.i.EVERY_SECOND, Integer.valueOf(View.generateViewId()));
        f27403g = new HashMap();
        f27404h = View.generateViewId();
    }

    public l0(Context context) {
        super(context);
    }

    @Override // fb2.r, fb2.e
    public final boolean g(i.c cVar, Object obj) {
        return y(cVar.findViewById(f27404h), cVar, (DeviceSettingsDTO) obj);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.f33877i1 != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.r
    public final Map<DeviceSettingsDTO.i, CharSequence> r(DeviceSettingsDTO.i[] iVarArr) {
        HashMap map = f27403g;
        if (map.isEmpty()) {
            DeviceSettingsDTO.i iVar = DeviceSettingsDTO.i.SMART;
            map.put(iVar, this.f70343a.getString(iVar.f33969b));
            DeviceSettingsDTO.i iVar2 = DeviceSettingsDTO.i.EVERY_SECOND;
            map.put(iVar2, this.f70343a.getString(iVar2.f33969b));
        }
        return map;
    }

    @Override // fb2.r
    public final DeviceSettingsDTO.i s(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        DeviceSettingsDTO.i.a aVar = DeviceSettingsDTO.i.f33963c;
        String str = deviceSettingsDTO2.f33877i1;
        aVar.getClass();
        if (str != null) {
            w13.c cVar = DeviceSettingsDTO.i.f33967g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                DeviceSettingsDTO.i iVar = (DeviceSettingsDTO.i) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(iVar.f33968a, str)) {
                    return iVar;
                }
            }
        }
        return DeviceSettingsDTO.i.SMART;
    }

    @Override // fb2.r
    public final int t() {
        return f27404h;
    }

    @Override // fb2.r
    public final DeviceSettingsDTO.i[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return new DeviceSettingsDTO.i[]{DeviceSettingsDTO.i.SMART, DeviceSettingsDTO.i.EVERY_SECOND};
    }

    @Override // fb2.r
    public final int w() {
        return R.string.device_settings_data_recording;
    }

    @Override // fb2.r
    public final Map<DeviceSettingsDTO.i, Integer> x() {
        return f27402f;
    }

    @Override // fb2.r
    public final void z(DeviceSettingsDTO.i iVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.i iVar2 = iVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return;
        }
        iVar2.getClass();
        if (deviceSettingsDTO2.f33877i1 != null) {
            deviceSettingsDTO2.f33877i1 = iVar2.f33968a;
        }
    }
}
