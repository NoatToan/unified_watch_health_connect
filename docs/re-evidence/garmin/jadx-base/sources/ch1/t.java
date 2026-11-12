package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class t extends fb2.e<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f27460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27461e;

    static {
        HashMap map = new HashMap();
        f27460d = map;
        map.put(DeviceSettingsDTO.h.ONCE_A_DAY, Integer.valueOf(R.id.device_settings_auto_sync_limited));
        map.put(DeviceSettingsDTO.h.OCCASIONALLY, Integer.valueOf(R.id.device_settings_auto_sync_occasional));
        map.put(DeviceSettingsDTO.h.FREQUENT, Integer.valueOf(R.id.device_settings_auto_sync_frequent));
        f27461e = R.id.device_settings_auto_sync_frequency_section;
    }

    public t(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final View a() {
        return f(R.layout.gcm3_device_settings_auto_sync_frequencies);
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        this.f70345c = new fb2.c(cVar.findViewById(f27461e), cVar, new s(this));
        return k(deviceSettingsDTO);
    }

    @Override // fb2.e
    public final boolean h(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.U0 != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean k(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.h hVar;
        if (deviceSettingsDTO == 0) {
            vb.h.s("Model is required");
            return false;
        }
        if (!d()) {
            vb.h.s("View decorator is not found. Please call initialize() first before calling update().");
            return false;
        }
        this.f70344b = deviceSettingsDTO;
        String str = deviceSettingsDTO.U0;
        boolean z14 = str != null;
        if (z14) {
            fb2.c cVar = (fb2.c) this.f70345c;
            DeviceSettingsDTO.h.f33956b.getClass();
            if (str != null) {
                w13.c cVar2 = DeviceSettingsDTO.h.f33961g;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
                while (bVarN.hasNext()) {
                    hVar = (DeviceSettingsDTO.h) bVarN.next();
                    if (p005kotlin.jvm.internal.s.g(hVar.f33962a, str)) {
                    }
                }
                hVar = DeviceSettingsDTO.h.ONCE_A_DAY;
            } else {
                hVar = DeviceSettingsDTO.h.ONCE_A_DAY;
            }
            cVar.k(hVar, f27460d);
        }
        return z14;
    }
}
