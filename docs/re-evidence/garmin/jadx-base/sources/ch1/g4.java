package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lch1/g4;", "Lfb2/a;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lch1/g4$a;", "modelAdapter", "<init>", "(Landroid/content/Context;Lch1/g4$a;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g4 extends fb2.a<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f27355i;

    public interface a {
        boolean a(DeviceSettingsDTO deviceSettingsDTO);

        void b(DeviceSettingsDTO deviceSettingsDTO, boolean z14);

        boolean c(DeviceSettingsDTO deviceSettingsDTO);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(Context context, a aVar) {
        super(context);
        context.getClass();
        aVar.getClass();
        this.f27355i = aVar;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return this.f27355i.a(deviceSettingsDTO);
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        return this.f27355i.c(deviceSettingsDTO2);
    }

    @Override // fb2.a
    public final String r() {
        return b(R.string.msg_device_settings_privacy_description);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF180397i() {
        return View.generateViewId();
    }

    @Override // fb2.a
    public final String t() {
        String strB = b(R.string.account_privacy);
        strB.getClass();
        return strB;
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        this.f27355i.b(deviceSettingsDTO, z14);
    }
}
