package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lch1/j4;", "Lfb2/r;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Lwi1/h$d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lch1/j4$b;", "modelAdapter", "<init>", "(Landroid/content/Context;Lch1/j4$b;)V", "b", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j4 extends fb2.r<DeviceSettingsDTO, wi1.h.d> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27391h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f27392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f27393g;

    public interface b {
        boolean a(DeviceSettingsDTO deviceSettingsDTO);

        String b();

        wi1.h.d c(DeviceSettingsDTO deviceSettingsDTO);

        void d(wi1.h.d dVar, DeviceSettingsDTO deviceSettingsDTO);
    }

    static {
        new a(null);
        f27391h = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Context context, b bVar) {
        super(context);
        context.getClass();
        bVar.getClass();
        this.f27392f = bVar;
        this.f27393g = p13.u0.f(new o13.p(wi1.h.d.SHOW_ALL, Integer.valueOf(View.generateViewId())), new o13.p(wi1.h.d.SHOW_CALLS_AND_TEXTS_ONLY, Integer.valueOf(View.generateViewId())), new o13.p(wi1.h.d.SHOW_CALLS_ONLY, Integer.valueOf(View.generateViewId())));
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return this.f27392f.a(deviceSettingsDTO);
    }

    @Override // fb2.r
    public final Map<wi1.h.d, CharSequence> r(wi1.h.d[] dVarArr) {
        dVarArr.getClass();
        wi1.h.d dVar = wi1.h.d.SHOW_ALL;
        o13.p pVar = new o13.p(dVar, b(dVar.f185532c));
        wi1.h.d dVar2 = wi1.h.d.SHOW_CALLS_AND_TEXTS_ONLY;
        o13.p pVar2 = new o13.p(dVar2, b(dVar2.f185532c));
        wi1.h.d dVar3 = wi1.h.d.SHOW_CALLS_ONLY;
        return p13.u0.f(pVar, pVar2, new o13.p(dVar3, b(dVar3.f185532c)));
    }

    @Override // fb2.r
    public final wi1.h.d s(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        return this.f27392f.c(deviceSettingsDTO2);
    }

    @Override // fb2.r
    public final int t() {
        return f27391h;
    }

    @Override // fb2.r
    public final String u() {
        return this.f27392f.b();
    }

    @Override // fb2.r
    public final wi1.h.d[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return new wi1.h.d[]{wi1.h.d.SHOW_ALL, wi1.h.d.SHOW_CALLS_AND_TEXTS_ONLY, wi1.h.d.SHOW_CALLS_ONLY};
    }

    @Override // fb2.r
    public final int w() {
        return R.string.device_settings_notifications_show;
    }

    @Override // fb2.r
    public final Map<wi1.h.d, Integer> x() {
        return this.f27393g;
    }

    @Override // fb2.r
    public final void z(wi1.h.d dVar, DeviceSettingsDTO deviceSettingsDTO) {
        wi1.h.d dVar2 = dVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (dVar2 != null) {
            this.f27392f.d(dVar2, deviceSettingsDTO2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lch1/j4$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
