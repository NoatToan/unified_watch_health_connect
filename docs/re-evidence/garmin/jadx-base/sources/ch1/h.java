package ch1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import org.slf4j.Marker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lch1/h;", "Lch1/a5;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends a5<DeviceSettingsDTO, Integer> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27357f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<String> f27358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        context.getClass();
        this.f27358e = p13.x.d("100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200+");
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return deviceSettingsDTO.f33885m != null;
    }

    @Override // ch1.a5
    /* JADX INFO: renamed from: t */
    public final int getF27326f() {
        return R.id.device_settings_high_heart_rate_threshold;
    }

    @Override // ch1.a5
    public final String u() {
        String strB = b(R.string.device_settings_high_heart_rate_threshold);
        strB.getClass();
        return strB;
    }

    @Override // ch1.a5
    public final xg1.c<Integer> v(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        return new a0.h(11, this, deviceSettingsDTO2);
    }

    @Override // ch1.a5
    public final xg1.r<Integer> w() {
        return new d(this);
    }

    @Override // ch1.a5
    public final void x(Integer num, DeviceSettingsDTO deviceSettingsDTO) {
        Integer num2 = num;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        num2.getClass();
        String str = this.f27358e.get(num2.intValue());
        str.getClass();
        String strV = d53.u.v(str, Marker.ANY_NON_NULL_MARKER, "", false);
        com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO2.f33885m;
        if (hVar != null) {
            hVar.z(Integer.parseInt(strV));
        }
    }

    @Override // ch1.a5
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final Integer s(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO.f33885m;
        if (hVar == null) {
            vb.h.s("Required value was null.");
            return null;
        }
        hVar.getClass();
        int highHrAlertThreshold = hVar.getHighHrAlertThreshold();
        ArrayList<String> arrayList = this.f27358e;
        if (highHrAlertThreshold > arrayList.size()) {
            highHrAlertThreshold = highHrAlertThreshold == 200 ? arrayList.indexOf("200+") : arrayList.indexOf(String.valueOf(highHrAlertThreshold));
            if (highHrAlertThreshold > arrayList.size()) {
                highHrAlertThreshold = 0;
            }
        }
        return Integer.valueOf(highHrAlertThreshold);
    }
}
