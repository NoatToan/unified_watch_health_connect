package ch1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lch1/v3;", "Lfb2/z;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v3 extends fb2.z<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27483e;

    static {
        new a(null);
        f27483e = R.id.device_settings_alarm_btn;
    }

    public v3(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        Boolean bool = deviceSettingsDTO.f33878j;
        if (!(bool != null ? bool.booleanValue() : false)) {
            return deviceSettingsDTO.M0();
        }
        Integer num = deviceSettingsDTO.f33883l;
        if (num == null) {
            num = 0;
        }
        return num.intValue() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    @Override // fb2.z
    public final String q(DeviceSettingsDTO deviceSettingsDTO) {
        boolean zM0;
        int i14;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        Boolean bool = deviceSettingsDTO2.f33878j;
        if (bool != null ? bool.booleanValue() : false) {
            Integer num = deviceSettingsDTO2.f33883l;
            if (num == null) {
                num = 0;
            }
            zM0 = num.intValue() > 0;
        } else {
            zM0 = deviceSettingsDTO2.M0();
        }
        if (zM0 && deviceSettingsDTO2.M0()) {
            List<com.garmin.android.apps.connectmobile.devices.model.i> listD = deviceSettingsDTO2.D();
            listD.getClass();
            com.garmin.android.apps.connectmobile.devices.model.i iVar = listD.get(0);
            com.garmin.android.apps.connectmobile.devices.model.c.a aVar = com.garmin.android.apps.connectmobile.devices.model.c.f34112c;
            String str = iVar.f34181a;
            aVar.getClass();
            if (com.garmin.android.apps.connectmobile.devices.model.c.a.a(str) != com.garmin.android.apps.connectmobile.devices.model.c.OFF) {
                i14 = R.string.lbl_on;
            } else {
                i14 = R.string.lbl_off;
            }
        } else {
            i14 = R.string.lbl_off;
        }
        String string = this.f70343a.getString(i14);
        string.getClass();
        return string;
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s */
    public final int getF180417e() {
        return f27483e;
    }

    @Override // fb2.z
    public final String t() {
        String string = this.f70343a.getString(R.string.device_setting_alarm);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch1/v3$a;", "", "<init>", "()V", "", "DEFAULT_BUTTON_ID", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
