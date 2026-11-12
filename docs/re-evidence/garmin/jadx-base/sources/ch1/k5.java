package ch1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageButton;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lch1/k5;", "Lch1/v5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k5 extends v5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(Context context) {
        super(context);
        context.getClass();
        HashMap map = this.f27487d;
        map.getClass();
        map.put(DeviceSettingsDTO.q.ANALOG_GENERIC_1, Integer.valueOf(R.id.device_settings_vivosmart4_watch_face_1));
        HashMap map2 = this.f27487d;
        map2.getClass();
        map2.put(DeviceSettingsDTO.q.ANALOG_GENERIC_2, Integer.valueOf(R.id.device_settings_vivosmart4_watch_face_2));
        HashMap map3 = this.f27487d;
        map3.getClass();
        map3.put(DeviceSettingsDTO.q.ANALOG_GENERIC_3, Integer.valueOf(R.id.device_settings_vivosmart4_watch_face_3));
        HashMap map4 = this.f27487d;
        map4.getClass();
        map4.put(DeviceSettingsDTO.q.ANALOG_GENERIC_4, Integer.valueOf(R.id.device_settings_vivosmart4_watch_face_4));
        HashMap map5 = this.f27487d;
        map5.getClass();
        map5.put(DeviceSettingsDTO.q.ANALOG_GENERIC_5, Integer.valueOf(R.id.device_settings_vivosmart4_watch_face_5));
        HashMap map6 = this.f27487d;
        map6.getClass();
        map6.put(DeviceSettingsDTO.q.ANALOG_GENERIC_6, Integer.valueOf(R.id.device_settings_vivosmart4_watch_face_6));
    }

    @Override // ch1.v5, ch1.b0
    public final void A(i.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        D((ViewGroup) cVar.findViewById(R.id.watch_face_container), R.layout.gcm3_device_settings_watch_faces_vivosmart4);
        ImageButton imageButton = (ImageButton) cVar.findViewById(R.id.device_settings_vivosmart4_watch_face_6);
        zp0.c cVar2 = new zp0.c((androidx.fragment.app.m) cVar);
        cVar2.f206567g = 2131231478;
        imageButton.getClass();
        cVar2.g(imageButton);
        k(deviceSettingsDTO);
    }

    @Override // ch1.v5, ch1.w3, fb2.e
    /* JADX INFO: renamed from: C */
    public final boolean g(i.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        cVar.getClass();
        deviceSettingsDTO.getClass();
        D((ViewGroup) cVar.findViewById(R.id.watch_face_container), R.layout.gcm3_device_settings_watch_faces_vivosmart4);
        ImageButton imageButton = (ImageButton) cVar.findViewById(R.id.device_settings_vivosmart4_watch_face_6);
        zp0.c cVar2 = new zp0.c((androidx.fragment.app.m) cVar);
        cVar2.f206567g = 2131231478;
        imageButton.getClass();
        cVar2.g(imageButton);
        return v(cVar.findViewById(R.id.device_settings_watch_face_section), cVar, deviceSettingsDTO);
    }
}
