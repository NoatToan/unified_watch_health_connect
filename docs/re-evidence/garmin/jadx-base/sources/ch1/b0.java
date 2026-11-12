package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class b0 extends w3<DeviceSettingsDTO, DeviceSettingsDTO.q> {
    public b0(Context context) {
        super(context);
    }

    public void A(i.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
    }

    @Override // ch1.w3
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void w(DeviceSettingsDTO.q qVar, DeviceSettingsDTO deviceSettingsDTO) {
        fb2.f.a(deviceSettingsDTO, "Model is required!");
        deviceSettingsDTO.J1(qVar);
    }

    @Override // fb2.e
    public final View a() {
        com.garmin.android.apps.connectmobile.i2.k(com.garmin.android.apps.connectmobile.a2.SETTINGS, "BaseWatchFaceField", "inflating view");
        return f(y());
    }

    @Override // ch1.w3
    public final int r() {
        return R.id.device_settings_vivofit3_watch_face_section;
    }

    @Override // ch1.w3
    public HashMap u() {
        HashMap map = new HashMap();
        map.put(DeviceSettingsDTO.q.DIGITAL_TRADITIONAL, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_digital_traditional_image));
        map.put(DeviceSettingsDTO.q.ANALOG_TRADITIONAL, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_analog_traditional_image));
        map.put(DeviceSettingsDTO.q.DIGITAL_MODERN, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_digital_modern_image));
        map.put(DeviceSettingsDTO.q.DIGITAL_BOLD, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_digital_bold_image));
        map.put(DeviceSettingsDTO.q.ANALOG_MINIMAL, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_analog_minimal_image));
        return map;
    }

    @Override // ch1.w3
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public DeviceSettingsDTO.q q(DeviceSettingsDTO deviceSettingsDTO) {
        fb2.f.a(deviceSettingsDTO, "Model is required!");
        return deviceSettingsDTO.i0();
    }

    public int y() {
        return R.layout.gcm3_device_settings_vivofit3_watch_faces;
    }

    @Override // fb2.e
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean h(DeviceSettingsDTO deviceSettingsDTO) {
        fb2.f.a(deviceSettingsDTO, "Model is required!");
        return deviceSettingsDTO.c1() && deviceSettingsDTO.f0() == DeviceSettingsDTO.n.SINGLE_SCREEN;
    }
}
