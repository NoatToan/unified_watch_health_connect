package ch1;

import android.content.Context;
import android.view.View;
import bs2.in;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lch1/e4;", "Lfb2/r;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Lbs2/in;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "hasHeader", "<init>", "(Landroid/content/Context;Z)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e4 extends fb2.r<DeviceSettingsDTO, in> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27334h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f27336g;

    static {
        new a(null);
        f27334h = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(Context context, boolean z14) {
        super(context);
        context.getClass();
        this.f27335f = z14;
        this.f27336g = p13.u0.f(new o13.p(in.OFF, Integer.valueOf(View.generateViewId())), new o13.p(in.ACTION, Integer.valueOf(View.generateViewId())), new o13.p(in.GESTURE, Integer.valueOf(View.generateViewId())));
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return true;
    }

    @Override // fb2.r
    public final Map<in, CharSequence> r(in[] inVarArr) {
        in[] inVarArr2 = inVarArr;
        inVarArr2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (in inVar : inVarArr2) {
            linkedHashMap.put(inVar, b(wg1.a.a(inVar)));
        }
        return linkedHashMap;
    }

    @Override // fb2.r
    public final in s(DeviceSettingsDTO deviceSettingsDTO) {
        in inVarA0;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        wi1.f fVar = deviceSettingsDTO2.f33865c1;
        return (fVar == null || (inVarA0 = fVar.a0()) == null) ? in.OFF : inVarA0;
    }

    @Override // fb2.r
    public final int t() {
        return f27334h;
    }

    @Override // fb2.r
    public final String u() {
        return null;
    }

    @Override // fb2.r
    public final in[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return new in[]{in.OFF, in.ACTION, in.GESTURE};
    }

    @Override // fb2.r
    public final int w() {
        if (this.f27335f) {
            return R.string.account_privacy;
        }
        return 0;
    }

    @Override // fb2.r
    public final Map<in, Integer> x() {
        return this.f27336g;
    }

    @Override // fb2.r
    public final void z(in inVar, DeviceSettingsDTO deviceSettingsDTO) {
        in inVar2 = inVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        wi1.f fVar = deviceSettingsDTO2.f33865c1;
        if (fVar != null) {
            fVar.j0(inVar2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lch1/e4$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
