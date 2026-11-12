package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class o5 extends fb2.e<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f27430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27431e;

    static {
        HashMap map = new HashMap();
        f27430d = map;
        map.put(DeviceSettingsDTO.q.DIGITAL_TRADITIONAL, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_digital_traditional_image));
        map.put(DeviceSettingsDTO.q.DIGITAL_MODERN, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_digital_modern_image));
        map.put(DeviceSettingsDTO.q.DIGITAL_BOLD, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_digital_bold_image));
        map.put(DeviceSettingsDTO.q.ANALOG_MINIMAL, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_analog_minimal_image));
        map.put(DeviceSettingsDTO.q.ANALOG_TRADITIONAL, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_analog_traditional_image));
        f27431e = R.id.device_settings_vivofit3_watch_face_section;
    }

    public o5(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final View a() {
        return f(R.layout.gcm3_device_settings_vivofit3_watch_faces);
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        this.f70345c = new fb2.h(cVar.findViewById(f27431e), cVar, new n5(this));
        return k(deviceSettingsDTO);
    }

    @Override // fb2.e
    public final boolean h(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.c1() && deviceSettingsDTO2.f0() == DeviceSettingsDTO.n.SINGLE_SCREEN;
        }
        vb.h.s("Model is required");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean k(DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO == 0) {
            vb.h.s("Model is required");
            return false;
        }
        if (!d()) {
            vb.h.s("View decorator is not found. Please call initialize() first before calling update().");
            return false;
        }
        this.f70344b = deviceSettingsDTO;
        boolean z14 = deviceSettingsDTO.c1() && deviceSettingsDTO.f0() == DeviceSettingsDTO.n.SINGLE_SCREEN;
        if (z14) {
            fb2.h hVar = (fb2.h) this.f70345c;
            DeviceSettingsDTO.q qVarI0 = deviceSettingsDTO.i0();
            HashMap map = new HashMap();
            map.put(DeviceSettingsDTO.q.DIGITAL_TRADITIONAL, c(R.string.lbl_watch_face_value, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
            map.put(DeviceSettingsDTO.q.DIGITAL_MODERN, c(R.string.lbl_watch_face_value, "2"));
            map.put(DeviceSettingsDTO.q.DIGITAL_BOLD, c(R.string.lbl_watch_face_value, "3"));
            map.put(DeviceSettingsDTO.q.ANALOG_MINIMAL, c(R.string.lbl_watch_face_value, "4"));
            map.put(DeviceSettingsDTO.q.ANALOG_TRADITIONAL, c(R.string.lbl_watch_face_value, "5"));
            hVar.k(qVarI0, f27430d, null, map);
        }
        return z14;
    }
}
