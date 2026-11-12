package gw;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgw/k0;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "deviceUnitId", "", "json", "Lcw/k;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLjava/lang/String;Lcw/k;)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 extends com.garmin.android.library.backgroundtaskmanagement.b<DeviceSettingsDTO> {

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"gw/k0$a", "Ljw/l;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends jw.l<DeviceSettingsDTO, DeviceSettingsDTO> {
        public a(lj0.f fVar, Object[] objArr, Class<DeviceSettingsDTO> cls, d80.g gVar) {
            super(k0.this, objArr, fVar, cls, gVar);
        }

        @Override // jw.l
        public final void d(DeviceSettingsDTO deviceSettingsDTO) {
            DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
            deviceSettingsDTO2.getClass();
            k0.this.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, deviceSettingsDTO2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(long j8, String str, cw.k kVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, kVar);
        str.getClass();
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new DeviceSettingsDTO());
        lj0.f fVar = lj0.f.f112991q;
        fVar.f113007i = str;
        b(new a(fVar, new Object[]{Long.valueOf(j8)}, DeviceSettingsDTO.class, d80.g.JSON_OBJECT));
    }
}
