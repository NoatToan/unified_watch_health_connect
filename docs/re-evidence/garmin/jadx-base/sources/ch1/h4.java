package ch1;

import android.content.Context;
import android.view.View;
import bs2.yt;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lch1/h4;", "Lfb2/r;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Lbs2/yt;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "hasHeader", "<init>", "(Landroid/content/Context;Z)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h4 extends fb2.r<DeviceSettingsDTO, yt> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27367h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f27369g;

    static {
        new a(null);
        f27367h = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Context context, boolean z14) {
        super(context);
        context.getClass();
        this.f27368f = z14;
        this.f27369g = p13.u0.f(new o13.p(yt.SHORT, Integer.valueOf(View.generateViewId())), new o13.p(yt.MEDIUM, Integer.valueOf(View.generateViewId())), new o13.p(yt.LONG, Integer.valueOf(View.generateViewId())));
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return deviceSettingsDTO.Y0 != null;
    }

    @Override // fb2.r
    public final Map<yt, CharSequence> r(yt[] ytVarArr) {
        yt[] ytVarArr2 = ytVarArr;
        ytVarArr2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (yt ytVar : ytVarArr2) {
            linkedHashMap.put(ytVar, b(wg1.a.b(ytVar)));
        }
        return linkedHashMap;
    }

    @Override // fb2.r
    public final yt s(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        String str = deviceSettingsDTO2.Y0;
        if (str != null) {
            return yt.valueOf(str);
        }
        vb.h.s("Required value was null.");
        return null;
    }

    @Override // fb2.r
    public final int t() {
        return f27367h;
    }

    @Override // fb2.r
    public final String u() {
        return b(R.string.lbl_timeout_description_msg);
    }

    @Override // fb2.r
    public final yt[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return new yt[]{yt.SHORT, yt.MEDIUM, yt.LONG};
    }

    @Override // fb2.r
    public final int w() {
        if (this.f27368f) {
            return R.string.device_setting_timeout;
        }
        return 0;
    }

    @Override // fb2.r
    public final Map<yt, Integer> x() {
        return this.f27369g;
    }

    @Override // fb2.r
    public final void z(yt ytVar, DeviceSettingsDTO deviceSettingsDTO) {
        yt ytVar2 = ytVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (ytVar2 != null) {
            deviceSettingsDTO2.Y0 = ytVar2.name();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lch1/h4$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
