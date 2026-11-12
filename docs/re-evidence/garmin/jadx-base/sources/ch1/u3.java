package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class u3 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.q> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27473e = View.generateViewId();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DeviceSettingsDTO.q[] f27474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f27475g;

    static {
        DeviceSettingsDTO.q qVar = DeviceSettingsDTO.q.ANALOG_TRADITIONAL;
        DeviceSettingsDTO.q qVar2 = DeviceSettingsDTO.q.DIGITAL_TRADITIONAL;
        f27474f = new DeviceSettingsDTO.q[]{qVar, qVar2};
        HashMap map = new HashMap();
        f27475g = map;
        map.put(qVar, "Analog");
        map.put(qVar2, "Digital");
    }

    public u3(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.N0 != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.q, CharSequence> q(DeviceSettingsDTO.q[] qVarArr) {
        DeviceSettingsDTO.q[] qVarArr2 = qVarArr;
        HashMap map = new HashMap();
        if (qVarArr2 != null) {
            for (int i14 = 0; i14 < qVarArr2.length; i14++) {
                DeviceSettingsDTO.q qVar = qVarArr2[i14];
                HashMap map2 = f27475g;
                if (map2.containsKey(qVar)) {
                    DeviceSettingsDTO.q qVar2 = qVarArr2[i14];
                    map.put(qVar2, (CharSequence) map2.get(qVar2));
                }
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.q r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.i0();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return f27473e;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.connect_iq_watch_face);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.q[] v(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        ArrayList arrayListJ0 = deviceSettingsDTO2.J0();
        DeviceSettingsDTO.q[] qVarArr = f27474f;
        if (arrayListJ0 == null) {
            ArrayList arrayList = new ArrayList();
            for (DeviceSettingsDTO.q qVar : qVarArr) {
                arrayList.add(qVar);
            }
            return (DeviceSettingsDTO.q[]) arrayList.toArray(new DeviceSettingsDTO.q[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < qVarArr.length; i14++) {
            if (arrayListJ0.contains(qVarArr[i14])) {
                arrayList2.add(qVarArr[i14]);
            }
        }
        return (DeviceSettingsDTO.q[]) arrayList2.toArray(new DeviceSettingsDTO.q[0]);
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.q qVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.q qVar2 = qVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            deviceSettingsDTO2.J1(qVar2);
        } else {
            vb.h.s("Model is required");
        }
    }
}
