package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lch1/k4;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lch1/k4$b;", "modelAdapter", "<init>", "(Landroid/content/Context;Lch1/k4$b;)V", "b", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k4 extends fb2.m<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27398g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f27399f;

    public interface b {
        boolean a();

        boolean b(DeviceSettingsDTO deviceSettingsDTO);

        boolean c(DeviceSettingsDTO deviceSettingsDTO);

        String d();

        wi1.h.d e(DeviceSettingsDTO deviceSettingsDTO);

        String getDescription();
    }

    static {
        new a(null);
        f27398g = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(Context context, b bVar) {
        super(context, true);
        context.getClass();
        bVar.getClass();
        this.f27399f = bVar;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return true;
    }

    @Override // fb2.m
    public final String q(DeviceSettingsDTO deviceSettingsDTO) {
        String strB;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        b bVar = this.f27399f;
        wi1.h.d dVarE = bVar.e(deviceSettingsDTO2);
        String strB2 = b(dVarE.f185531b);
        strB2.getClass();
        if (dVarE == wi1.h.d.OFF || !bVar.c(deviceSettingsDTO2)) {
            strB = null;
        } else {
            strB = bVar.b(deviceSettingsDTO2) ? b(R.string.lbl_privacy_on) : b(R.string.lbl_privacy_off);
        }
        return (strB == null || strB.length() == 0) ? strB2 : c(R.string.string_comma_string_pattern, strB2, strB);
    }

    @Override // fb2.m
    public final String s() {
        return this.f27399f.getDescription();
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return f27398g;
    }

    @Override // fb2.m
    public final String u() {
        return this.f27399f.d();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lch1/k4$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
