package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class q5 extends b0 {
    public q5(Context context) {
        super(context);
    }

    @Override // ch1.b0, ch1.w3
    /* JADX INFO: renamed from: B */
    public final void w(DeviceSettingsDTO.q qVar, DeviceSettingsDTO deviceSettingsDTO) {
        fb2.f.a(deviceSettingsDTO, "Model is required!");
        DeviceSettingsDTO.q qVar2 = DeviceSettingsDTO.q.DIGITAL_TRADITIONAL_SPLIT;
        DeviceSettingsDTO.n nVar = qVar == qVar2 ? DeviceSettingsDTO.n.SPLIT_SCREEN_HORIZONTAL : DeviceSettingsDTO.n.SINGLE_SCREEN;
        nVar.getClass();
        String str = nVar.f34002a;
        deviceSettingsDTO.L0 = str;
        deviceSettingsDTO.S1(str);
        if (qVar == qVar2) {
            qVar = DeviceSettingsDTO.q.DIGITAL_TRADITIONAL;
        }
        deviceSettingsDTO.J1(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch1.w3
    public final HashMap s() {
        String str;
        HashMap map = new HashMap();
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) this.f70344b;
        if (deviceSettingsDTO == null || (str = deviceSettingsDTO.R0) == null) {
            str = "DEFAULT";
        }
        DeviceSettingsDTO.q qVar = DeviceSettingsDTO.q.DIGITAL_TRADITIONAL;
        zb0.u0 u0Var = zb0.u0.H1;
        DeviceSettingsDTO.n nVar = DeviceSettingsDTO.n.SINGLE_SCREEN;
        map.put(qVar, Integer.valueOf(hv.f.a(u0Var, qVar, nVar, str)));
        DeviceSettingsDTO.q qVar2 = DeviceSettingsDTO.q.DIGITAL_MODERN;
        map.put(qVar2, Integer.valueOf(hv.f.a(u0Var, qVar2, nVar, str)));
        DeviceSettingsDTO.q qVar3 = DeviceSettingsDTO.q.DIGITAL_BOLD;
        map.put(qVar3, Integer.valueOf(hv.f.a(u0Var, qVar3, nVar, str)));
        DeviceSettingsDTO.q qVar4 = DeviceSettingsDTO.q.ANALOG_TRADITIONAL;
        map.put(qVar4, Integer.valueOf(hv.f.a(u0Var, qVar4, nVar, str)));
        map.put(DeviceSettingsDTO.q.DIGITAL_TRADITIONAL_SPLIT, Integer.valueOf(hv.f.a(u0Var, qVar, DeviceSettingsDTO.n.SPLIT_SCREEN_HORIZONTAL, str)));
        DeviceSettingsDTO.q qVar5 = DeviceSettingsDTO.q.ANALOG_MINIMAL;
        map.put(qVar5, Integer.valueOf(hv.f.a(u0Var, qVar5, nVar, str)));
        return map;
    }

    @Override // ch1.w3
    public final Map t() {
        HashMap map = new HashMap();
        map.put(DeviceSettingsDTO.q.DIGITAL_TRADITIONAL, c(R.string.lbl_watch_face_value, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        map.put(DeviceSettingsDTO.q.DIGITAL_MODERN, c(R.string.lbl_watch_face_value, "2"));
        map.put(DeviceSettingsDTO.q.DIGITAL_BOLD, c(R.string.lbl_watch_face_value, "3"));
        map.put(DeviceSettingsDTO.q.ANALOG_MINIMAL, c(R.string.lbl_watch_face_value, "4"));
        map.put(DeviceSettingsDTO.q.ANALOG_TRADITIONAL, c(R.string.lbl_watch_face_value, "5"));
        map.put(DeviceSettingsDTO.q.DIGITAL_TRADITIONAL_SPLIT, c(R.string.lbl_watch_face_value, "6"));
        return map;
    }

    @Override // ch1.b0, ch1.w3
    public final HashMap u() {
        HashMap map = new HashMap();
        map.put(DeviceSettingsDTO.q.DIGITAL_TRADITIONAL, Integer.valueOf(R.id.watch_face_button_1));
        map.put(DeviceSettingsDTO.q.DIGITAL_MODERN, Integer.valueOf(R.id.watch_face_button_2));
        map.put(DeviceSettingsDTO.q.DIGITAL_BOLD, Integer.valueOf(R.id.watch_face_button_3));
        map.put(DeviceSettingsDTO.q.ANALOG_TRADITIONAL, Integer.valueOf(R.id.watch_face_button_4));
        map.put(DeviceSettingsDTO.q.DIGITAL_TRADITIONAL_SPLIT, Integer.valueOf(R.id.watch_face_button_5));
        map.put(DeviceSettingsDTO.q.ANALOG_MINIMAL, Integer.valueOf(R.id.watch_face_button_6));
        return map;
    }

    @Override // ch1.b0, ch1.w3
    /* JADX INFO: renamed from: x */
    public final DeviceSettingsDTO.q q(DeviceSettingsDTO deviceSettingsDTO) {
        fb2.f.a(deviceSettingsDTO, "Model is required");
        return deviceSettingsDTO.f0() == DeviceSettingsDTO.n.SPLIT_SCREEN_HORIZONTAL ? DeviceSettingsDTO.q.DIGITAL_TRADITIONAL_SPLIT : deviceSettingsDTO.i0();
    }

    @Override // ch1.b0
    public final int y() {
        return R.layout.gcm3_vivofit4_watch_faces_field;
    }

    @Override // ch1.b0, fb2.e
    /* JADX INFO: renamed from: z */
    public final boolean h(DeviceSettingsDTO deviceSettingsDTO) {
        fb2.f.a(deviceSettingsDTO, "Model is required!");
        return deviceSettingsDTO.c1();
    }
}
