package dh1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ldh1/o;", "Lfb2/r;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Llu/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends fb2.r<DeviceSettingsDTO, lu.d> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f59631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f59632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f59633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f59634i;

    static {
        new a(null);
        HashMap map = new HashMap();
        f59631f = map;
        map.put(lu.d.AVERAGE_PACE_SPEED, Integer.valueOf(View.generateViewId()));
        map.put(lu.d.CURRENT_PACE_SPEED, Integer.valueOf(View.generateViewId()));
        map.put(lu.d.LAP_PACE_SPEED, Integer.valueOf(View.generateViewId()));
        f59632g = new HashMap();
        f59633h = new HashMap();
        f59634i = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        context.getClass();
        this.f70372e = true;
    }

    @Override // fb2.r, fb2.e
    public final boolean g(i.c cVar, Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        cVar.getClass();
        deviceSettingsDTO.getClass();
        return super.g(cVar, deviceSettingsDTO);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return deviceSettingsDTO.Z0();
    }

    @Override // fb2.r
    public final Map<lu.d, CharSequence> q(lu.d[] dVarArr) {
        dVarArr.getClass();
        HashMap map = f59633h;
        if (map.isEmpty()) {
            lu.d dVar = lu.d.AVERAGE_PACE_SPEED;
            map.put(dVar, b(dVar.f114942b));
            lu.d dVar2 = lu.d.CURRENT_PACE_SPEED;
            map.put(dVar2, b(dVar2.f114942b));
            lu.d dVar3 = lu.d.LAP_PACE_SPEED;
            map.put(dVar3, b(dVar3.f114942b));
        }
        return map;
    }

    @Override // fb2.r
    public final Map<lu.d, CharSequence> r(lu.d[] dVarArr) {
        dVarArr.getClass();
        HashMap map = f59632g;
        if (map.isEmpty()) {
            lu.d dVar = lu.d.AVERAGE_PACE_SPEED;
            map.put(dVar, b(dVar.f114941a));
            lu.d dVar2 = lu.d.CURRENT_PACE_SPEED;
            map.put(dVar2, b(dVar2.f114941a));
            lu.d dVar3 = lu.d.LAP_PACE_SPEED;
            map.put(dVar3, b(dVar3.f114941a));
        }
        return map;
    }

    @Override // fb2.r
    public final lu.d s(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        lu.d.a aVar = lu.d.f114935d;
        String str = deviceSettingsDTO2.f33890o1;
        aVar.getClass();
        return lu.d.a.a(str);
    }

    @Override // fb2.r
    public final int t() {
        return f59634i;
    }

    @Override // fb2.r
    public final lu.d[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return new lu.d[]{lu.d.AVERAGE_PACE_SPEED, lu.d.CURRENT_PACE_SPEED, lu.d.LAP_PACE_SPEED};
    }

    @Override // fb2.r
    public final int w() {
        return R.string.run_mode_alerts_setting_alert_type;
    }

    @Override // fb2.r
    public final Map<lu.d, Integer> x() {
        return f59631f;
    }

    @Override // fb2.r
    public final void z(lu.d dVar, DeviceSettingsDTO deviceSettingsDTO) {
        lu.d dVar2 = dVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (dVar2 != null) {
            deviceSettingsDTO2.f33890o1 = dVar2.f114943c;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldh1/o$a;", "", "<init>", "()V", "", "Llu/d;", "", "ROW_DICTIONARY", "Ljava/util/Map;", "", "TEXT_DICTIONARY", "SECONDARY_TEXT_DICTIONARY", "DEFAULT_CONTAINER_ID", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
