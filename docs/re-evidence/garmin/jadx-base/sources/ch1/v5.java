package ch1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class v5 extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f27487d;

    public v5(Context context) {
        super(context);
        this.f27487d = new HashMap();
    }

    @Override // ch1.b0
    public void A(i.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        String str = deviceSettingsDTO.Z;
        DeviceSettingsDTO.s.f34047b.getClass();
        if (DeviceSettingsDTO.s.a.a(str).equals(DeviceSettingsDTO.s.PORTRAIT)) {
            D((ViewGroup) cVar.findViewById(R.id.watch_face_container), R.layout.gcm3_device_settings_orientation_watch_faces);
        } else {
            D((ViewGroup) cVar.findViewById(R.id.watch_face_container), R.layout.gcm3_device_settings_orientation_watch_faces_landscape);
        }
        k(deviceSettingsDTO);
    }

    @Override // ch1.w3, fb2.e
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean g(i.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        String str = deviceSettingsDTO.Z;
        DeviceSettingsDTO.s.f34047b.getClass();
        if (DeviceSettingsDTO.s.a.a(str).equals(DeviceSettingsDTO.s.PORTRAIT)) {
            D((ViewGroup) cVar.findViewById(R.id.watch_face_container), R.layout.gcm3_device_settings_orientation_watch_faces);
        } else {
            D((ViewGroup) cVar.findViewById(R.id.watch_face_container), R.layout.gcm3_device_settings_orientation_watch_faces_landscape);
        }
        return v(cVar.findViewById(R.id.device_settings_watch_face_section), cVar, deviceSettingsDTO);
    }

    public final void D(ViewGroup viewGroup, int i14) {
        viewGroup.removeAllViews();
        viewGroup.addView((ViewGroup) ((LayoutInflater) this.f70343a.getSystemService("layout_inflater")).inflate(i14, (ViewGroup) null).findViewById(R.id.device_settings_watch_face_section));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch1.w3, fb2.e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
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
            ((fb2.h) this.f70345c).k(q(deviceSettingsDTO), this.f27487d, null, null);
        }
        return zH;
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
