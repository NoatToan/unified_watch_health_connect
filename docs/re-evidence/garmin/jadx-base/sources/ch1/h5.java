package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class h5 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.o> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27370a;

        static {
            int[] iArr = new int[DeviceSettingsDTO.o.values().length];
            f27370a = iArr;
            try {
                iArr[DeviceSettingsDTO.o.SHOW_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27370a[DeviceSettingsDTO.o.SHOW_CALLS_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27370a[DeviceSettingsDTO.o.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h5(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        return ((DeviceSettingsDTO) obj).f33865c1.e0();
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.o, CharSequence> q(DeviceSettingsDTO.o[] oVarArr) {
        DeviceSettingsDTO.o[] oVarArr2 = oVarArr;
        HashMap map = new HashMap();
        if (oVarArr2 != null) {
            for (DeviceSettingsDTO.o oVar : oVarArr2) {
                int i14 = a.f27370a[oVar.ordinal()];
                if (i14 == 1) {
                    map.put(oVar, this.f70343a.getString(R.string.device_settings_show_all));
                } else if (i14 == 2) {
                    map.put(oVar, this.f70343a.getString(R.string.device_settings_show_calls_only));
                } else if (i14 == 3) {
                    map.put(oVar, this.f70343a.getString(R.string.lbl_off));
                }
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.o r(DeviceSettingsDTO deviceSettingsDTO) {
        return DeviceSettingsDTO.o.a(deviceSettingsDTO.f33865c1.f185502a);
    }

    @Override // fb2.t
    public final int t() {
        return R.id.device_settings_phone_notifications_btn;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.device_setting_phone_notifications);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.o[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return DeviceSettingsDTO.o.values();
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.o oVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        wi1.f fVar = deviceSettingsDTO2.f33865c1;
        fVar.i0(oVar.name());
        deviceSettingsDTO2.f33865c1 = fVar;
    }
}
