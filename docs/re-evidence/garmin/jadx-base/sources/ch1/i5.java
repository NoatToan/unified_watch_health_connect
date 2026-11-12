package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class i5 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.o> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27378a;

        static {
            int[] iArr = new int[DeviceSettingsDTO.o.values().length];
            f27378a = iArr;
            try {
                iArr[DeviceSettingsDTO.o.SHOW_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27378a[DeviceSettingsDTO.o.SHOW_CALLS_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27378a[DeviceSettingsDTO.o.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i5(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        return ((DeviceSettingsDTO) obj).f33863b1.e0();
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.o, CharSequence> q(DeviceSettingsDTO.o[] oVarArr) {
        HashMap map = new HashMap();
        for (DeviceSettingsDTO.o oVar : oVarArr) {
            int i14 = a.f27378a[oVar.ordinal()];
            if (i14 == 1) {
                map.put(oVar, this.f70343a.getString(R.string.device_settings_show_all));
            } else if (i14 == 2) {
                map.put(oVar, this.f70343a.getString(R.string.device_settings_show_calls_only));
            } else if (i14 == 3) {
                map.put(oVar, this.f70343a.getString(R.string.lbl_off));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.o r(DeviceSettingsDTO deviceSettingsDTO) {
        return DeviceSettingsDTO.o.a(deviceSettingsDTO.f33863b1.f185502a);
    }

    @Override // fb2.t
    public final int t() {
        return R.id.device_settings_during_activity_btn;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.device_settings_during_activity);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.o[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return DeviceSettingsDTO.o.values();
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.o oVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        wi1.c cVar = deviceSettingsDTO2.f33863b1;
        cVar.i0(oVar.name());
        deviceSettingsDTO2.f33863b1 = cVar;
        deviceSettingsDTO2.S1("autoActivityDetect");
    }
}
