package ch1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class s5 extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f27459d;

    static {
        HashMap map = new HashMap();
        f27459d = map;
        map.put(DeviceSettingsDTO.q.ANALOG_GENERIC_1, Integer.valueOf(R.id.device_settings_vvmhr_watch_face_1));
        map.put(DeviceSettingsDTO.q.ANALOG_GENERIC_2, Integer.valueOf(R.id.device_settings_vvmhr_watch_face_2));
        map.put(DeviceSettingsDTO.q.ANALOG_GENERIC_3, Integer.valueOf(R.id.device_settings_vvmhr_watch_face_3));
        map.put(DeviceSettingsDTO.q.ANALOG_GENERIC_4, Integer.valueOf(R.id.device_settings_vvmhr_watch_face_4));
    }

    public s5(Context context) {
        super(context);
    }

    @Override // ch1.b0
    public final void A(i.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        ViewGroup viewGroup = (ViewGroup) cVar.findViewById(R.id.watch_face_container);
        viewGroup.removeAllViews();
        viewGroup.addView((LinearLayout) ((LayoutInflater) this.f70343a.getSystemService("layout_inflater")).inflate(R.layout.gcm3_device_settings_orientation_watch_faces_vvmhr_landscape, (ViewGroup) null).findViewById(R.id.device_settings_watch_face_section));
        k(deviceSettingsDTO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch1.w3, fb2.e
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
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
        boolean zH = h(deviceSettingsDTO);
        if (zH) {
            ((fb2.h) this.f70345c).k(q(deviceSettingsDTO), f27459d, null, null);
        }
        return zH;
    }

    @Override // ch1.w3, fb2.e
    public final boolean g(i.c cVar, Object obj) {
        ViewGroup viewGroup = (ViewGroup) cVar.findViewById(R.id.watch_face_container);
        viewGroup.removeAllViews();
        viewGroup.addView((LinearLayout) ((LayoutInflater) this.f70343a.getSystemService("layout_inflater")).inflate(R.layout.gcm3_device_settings_orientation_watch_faces_vvmhr_landscape, (ViewGroup) null).findViewById(R.id.device_settings_watch_face_section));
        return v(cVar.findViewById(R.id.device_settings_watch_face_section), cVar, (DeviceSettingsDTO) obj);
    }

    @Override // ch1.b0, ch1.w3
    /* JADX INFO: renamed from: x */
    public final DeviceSettingsDTO.q q(DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO != null) {
            DeviceSettingsDTO.q qVarI0 = deviceSettingsDTO.i0();
            return qVarI0 == null ? DeviceSettingsDTO.q.ANALOG_GENERIC_1 : qVarI0;
        }
        vb.h.s("Model is required");
        return null;
    }
}
