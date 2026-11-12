package ch1;

import android.content.Context;
import android.view.View;
import bs2.gf;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lch1/h1;", "Lfb2/t;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "Lbs2/gf;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h1 extends fb2.t<com.garmin.android.apps.connectmobile.devices.model.f, gf> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap<gf, CharSequence> f27360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f27361f;

    static {
        new a(null);
        f27360e = new HashMap<>();
        f27361f = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        fVar.getClass();
        return fVar.f34132b.containsKey("gpsMode");
    }

    @Override // fb2.t
    public final Map<gf, CharSequence> q(gf[] gfVarArr) {
        gfVarArr.getClass();
        HashMap<gf, CharSequence> map = f27360e;
        if (map.isEmpty()) {
            map.put(gf.OFF, b(R.string.lbl_off));
            map.put(gf.GPS, b(R.string.device_settings_gps_mode_normal));
            map.put(gf.GPS_GALILEO, b(R.string.device_settings_gps_mode_gps_galileo));
            map.put(gf.GPS_GLONASS, b(R.string.device_settings_gps_mode_gps_glonass));
        }
        return map;
    }

    @Override // fb2.t
    public final gf r(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        return fVar2.e0();
    }

    @Override // fb2.t
    public final String s() {
        return b(R.string.device_settings_gps_footer);
    }

    @Override // fb2.t
    public final int t() {
        return f27361f;
    }

    @Override // fb2.t
    public final String u() {
        String strB = b(R.string.common_gps);
        strB.getClass();
        return strB;
    }

    @Override // fb2.t
    public final gf[] v(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        fVar.getClass();
        return new gf[]{gf.OFF, gf.GPS, gf.GPS_GLONASS, gf.GPS_GALILEO};
    }

    @Override // fb2.t
    public final void w(gf gfVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        gf gfVar2 = gfVar;
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        if (gfVar2 != null) {
            fVar2.y1("gpsMode", Integer.valueOf(gfVar2.f20164a));
        } else {
            vb.h.s("Invalid value: [null].");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lch1/h1$a;", "", "<init>", "()V", "Ljava/util/HashMap;", "Lbs2/gf;", "", "TEXT_DICTIONARY", "Ljava/util/HashMap;", "", "DEFAULT_CONTAINER_ID", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
