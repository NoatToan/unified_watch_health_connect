package vh1;

import android.content.Context;
import android.view.ViewGroup;
import bi1.n;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import i.c;
import java.util.HashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvh1/a;", "Lbi1/n;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
        HashMap map = this.f27487d;
        map.getClass();
        map.put(DeviceSettingsDTO.q.ANALOG_GENERIC_10, Integer.valueOf(R.id.watch_face_button_10));
        HashMap map2 = this.f27487d;
        map2.getClass();
        map2.put(DeviceSettingsDTO.q.ANALOG_GENERIC_11, Integer.valueOf(R.id.watch_face_button_11));
        HashMap map3 = this.f27487d;
        map3.getClass();
        map3.put(DeviceSettingsDTO.q.ANALOG_GENERIC_12, Integer.valueOf(R.id.watch_face_button_12));
    }

    @Override // bi1.n, ch1.v5, ch1.b0
    public final void A(c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        D((ViewGroup) cVar.findViewById(R.id.watch_face_container), R.layout.device_settings_watch_faces_quartz);
        k(deviceSettingsDTO);
    }

    @Override // bi1.n, ch1.v5, ch1.w3, fb2.e
    /* JADX INFO: renamed from: C */
    public final boolean g(c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        cVar.getClass();
        deviceSettingsDTO.getClass();
        D((ViewGroup) cVar.findViewById(R.id.watch_face_container), R.layout.device_settings_watch_faces_quartz);
        return v(cVar.findViewById(R.id.device_settings_watch_face_section), cVar, deviceSettingsDTO);
    }
}
