package ch1;

import android.content.Context;
import android.view.View;
import bs2.yt;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lch1/i4;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i4 extends fb2.m<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f27377f;

    static {
        new a(null);
        f27377f = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(Context context) {
        super(context, true);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return deviceSettingsDTO.Y0 != null;
    }

    @Override // fb2.m
    public final String q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        String str = deviceSettingsDTO2.Y0;
        if (str != null) {
            return b(wg1.a.b(yt.valueOf(str)));
        }
        return null;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return f27377f;
    }

    @Override // fb2.m
    public final String u() {
        String strB = b(R.string.device_setting_timeout);
        strB.getClass();
        return strB;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lch1/i4$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
