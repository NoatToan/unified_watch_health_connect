package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch1/o0;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 extends fb2.m<DeviceSettingsDTO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return View.generateViewId();
    }

    @Override // fb2.m
    public final String u() {
        String string = this.f70343a.getString(R.string.lbl_device_settings_device_backup);
        string.getClass();
        return string;
    }

    @Override // fb2.e
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final boolean h(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        rd2.j jVar = rd2.f.a().f152045a;
        long j8 = deviceSettingsDTO.f33860a;
        jVar.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null) {
            return fVarI.p3();
        }
        return false;
    }
}
