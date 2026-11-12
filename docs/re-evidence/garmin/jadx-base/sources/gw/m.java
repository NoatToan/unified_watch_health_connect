package gw;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgw/m;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "mDeviceUnitId", "Lcw/k;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLcw/k;)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends com.garmin.android.library.backgroundtaskmanagement.b<DeviceSettingsDTO> {

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"gw/m$a", "Ljw/l;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends jw.l<DeviceSettingsDTO, DeviceSettingsDTO> {
        public a(Object[] objArr, lj0.f fVar, Class<DeviceSettingsDTO> cls, d80.g gVar) {
            super(m.this, objArr, fVar, cls, gVar);
        }

        @Override // jw.l
        public final void d(DeviceSettingsDTO deviceSettingsDTO) {
            DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
            deviceSettingsDTO2.getClass();
            m.this.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, deviceSettingsDTO2);
        }
    }

    public m(long j8, cw.k kVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, kVar);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new DeviceSettingsDTO());
        b(new a(new Object[]{Long.valueOf(j8)}, lj0.f.f112987m, DeviceSettingsDTO.class, d80.g.JSON_OBJECT));
    }
}
