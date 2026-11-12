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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ldh1/h;", "Lfb2/r;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Llu/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends fb2.r<DeviceSettingsDTO, lu.c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f59628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f59629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f59630h;

    static {
        new a(null);
        HashMap map = new HashMap();
        f59628f = map;
        map.put(lu.c.HEART_RATE, Integer.valueOf(View.generateViewId()));
        map.put(lu.c.HEART_RATE_ZONE, Integer.valueOf(View.generateViewId()));
        map.put(lu.c.PERCENTAGE_MAX_HEART_RATE, Integer.valueOf(View.generateViewId()));
        map.put(lu.c.PERCENTAGE_HEART_RATE_RESERVE, Integer.valueOf(View.generateViewId()));
        f59629g = new HashMap();
        f59630h = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        context.getClass();
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
        return deviceSettingsDTO.R0();
    }

    @Override // fb2.r
    public final Map<lu.c, CharSequence> r(lu.c[] cVarArr) {
        cVarArr.getClass();
        HashMap map = f59629g;
        if (map.isEmpty()) {
            lu.c cVar = lu.c.HEART_RATE;
            map.put(cVar, b(cVar.f114933a));
            lu.c cVar2 = lu.c.HEART_RATE_ZONE;
            map.put(cVar2, b(cVar2.f114933a));
            lu.c cVar3 = lu.c.PERCENTAGE_MAX_HEART_RATE;
            map.put(cVar3, b(cVar3.f114933a));
            lu.c cVar4 = lu.c.PERCENTAGE_HEART_RATE_RESERVE;
            map.put(cVar4, b(cVar4.f114933a));
        }
        return map;
    }

    @Override // fb2.r
    public final lu.c s(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        lu.c.a aVar = lu.c.f114926c;
        String str = deviceSettingsDTO2.f33897s1;
        aVar.getClass();
        return lu.c.a.a(str);
    }

    @Override // fb2.r
    public final int t() {
        return f59630h;
    }

    @Override // fb2.r
    public final String u() {
        return b(R.string.audio_prompts_alert_type_footer);
    }

    @Override // fb2.r
    public final lu.c[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return new lu.c[]{lu.c.HEART_RATE, lu.c.HEART_RATE_ZONE, lu.c.PERCENTAGE_MAX_HEART_RATE, lu.c.PERCENTAGE_HEART_RATE_RESERVE};
    }

    @Override // fb2.r
    public final int w() {
        return R.string.run_mode_alerts_setting_alert_type;
    }

    @Override // fb2.r
    public final Map<lu.c, Integer> x() {
        return f59628f;
    }

    @Override // fb2.r
    public final void z(lu.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        lu.c cVar2 = cVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (cVar2 != null) {
            deviceSettingsDTO2.f33897s1 = cVar2.f114934b;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldh1/h$a;", "", "<init>", "()V", "", "Llu/c;", "", "ROW_DICTIONARY", "Ljava/util/Map;", "", "TEXT_DICTIONARY", "DEFAULT_CONTAINER_ID", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
