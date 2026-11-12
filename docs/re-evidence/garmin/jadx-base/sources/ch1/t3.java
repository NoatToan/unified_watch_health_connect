package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class t3 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.n> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27465a;

        static {
            int[] iArr = new int[DeviceSettingsDTO.n.values().length];
            f27465a = iArr;
            try {
                iArr[DeviceSettingsDTO.n.SINGLE_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27465a[DeviceSettingsDTO.n.SPLIT_SCREEN_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public t3(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            List<String> list = deviceSettingsDTO.M0;
            return (list == null || list.isEmpty()) ? false : true;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.n, CharSequence> q(DeviceSettingsDTO.n[] nVarArr) {
        DeviceSettingsDTO.n[] nVarArr2 = nVarArr;
        HashMap map = new HashMap();
        if (nVarArr2 != null) {
            for (int i14 = 0; i14 < nVarArr2.length; i14++) {
                int i15 = a.f27465a[nVarArr2[i14].ordinal()];
                int i16 = i15 != 1 ? i15 != 2 ? -1 : R.string.device_setting_split_screen : R.string.device_setting_full_screen;
                if (i16 != -1) {
                    map.put(nVarArr2[i14], this.f70343a.getString(i16));
                }
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.n r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.f0();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return R.id.device_settings_screen_mode_btn;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.device_setting_screen_mode);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.n[] v(DeviceSettingsDTO deviceSettingsDTO) {
        ArrayList arrayList;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        List<String> list = deviceSettingsDTO2.M0;
        if (list == null || list.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            List<String> list2 = deviceSettingsDTO2.M0;
            list2.getClass();
            for (String str : list2) {
                DeviceSettingsDTO.n.f33997b.getClass();
                DeviceSettingsDTO.n nVarA = DeviceSettingsDTO.n.a.a(str);
                if (nVarA != null && !arrayList.contains(nVarA)) {
                    arrayList.add(nVarA);
                }
            }
        }
        return arrayList != null ? (DeviceSettingsDTO.n[]) arrayList.toArray(new DeviceSettingsDTO.n[0]) : new DeviceSettingsDTO.n[0];
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.n nVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.n nVar2 = nVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return;
        }
        nVar2.getClass();
        String str = nVar2.f34002a;
        deviceSettingsDTO2.L0 = str;
        deviceSettingsDTO2.S1(str);
    }
}
