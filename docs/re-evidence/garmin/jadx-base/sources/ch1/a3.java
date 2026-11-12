package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive4.NotificationPrivacyActivity;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lch1/a3;", "Lfb2/r;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/settings/devices/vivoactive4/NotificationPrivacyActivity$b;", "visibility", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/settings/devices/vivoactive4/NotificationPrivacyActivity$b;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a3 extends fb2.r<DeviceSettingsDTO, String> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap<String, Integer> f27293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap<String, CharSequence> f27294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f27295i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final NotificationPrivacyActivity.b f27296f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27297a;

        static {
            int[] iArr = new int[NotificationPrivacyActivity.b.values().length];
            try {
                iArr[NotificationPrivacyActivity.b.DURING_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationPrivacyActivity.b.NOT_DURING_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27297a = iArr;
        }
    }

    static {
        new a(null);
        HashMap<String, Integer> map = new HashMap<>();
        f27293g = map;
        map.put("SHOW_ALL", Integer.valueOf(View.generateViewId()));
        map.put("SHOW_CALLS_ONLY", Integer.valueOf(View.generateViewId()));
        map.put("SHOW_CALLS_AND_TEXTS", Integer.valueOf(View.generateViewId()));
        f27294h = new HashMap<>();
        f27295i = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Context context, NotificationPrivacyActivity.b bVar) {
        super(context);
        context.getClass();
        bVar.getClass();
        this.f27296f = bVar;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        int i14 = b.f27297a[this.f27296f.ordinal()];
        if (i14 == 1) {
            return deviceSettingsDTO.Q0();
        }
        if (i14 == 2) {
            return deviceSettingsDTO.S0();
        }
        lc.u0.r();
        return false;
    }

    @Override // fb2.r
    public final Map<String, CharSequence> r(String[] strArr) {
        strArr.getClass();
        HashMap<String, CharSequence> map = f27294h;
        if (map.isEmpty()) {
            map.put("SHOW_ALL", b(wi1.h.b.SHOW_ALL.f185514a));
            map.put("SHOW_CALLS_ONLY", b(wi1.h.b.SHOW_CALLS_ONLY.f185514a));
            map.put("SHOW_CALLS_AND_TEXTS", b(wi1.h.b.SHOW_CALLS_AND_TEXTS.f185514a));
        }
        return map;
    }

    @Override // fb2.r
    public final String s(DeviceSettingsDTO deviceSettingsDTO) {
        String str;
        String str2;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        int i14 = b.f27297a[this.f27296f.ordinal()];
        if (i14 == 1) {
            wi1.c cVar = deviceSettingsDTO2.f33863b1;
            return (cVar == null || (str = cVar.f185502a) == null) ? "SHOW_ALL" : str;
        }
        if (i14 == 2) {
            wi1.f fVar = deviceSettingsDTO2.f33865c1;
            return (fVar == null || (str2 = fVar.f185502a) == null) ? "SHOW_ALL" : str2;
        }
        lc.u0.r();
        return null;
    }

    @Override // fb2.r
    public final int t() {
        return f27295i;
    }

    @Override // fb2.r
    public final String[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return new String[]{"SHOW_ALL", "SHOW_CALLS_ONLY", "SHOW_CALLS_AND_TEXTS"};
    }

    @Override // fb2.r
    public final int w() {
        return 0;
    }

    @Override // fb2.r
    public final Map<String, Integer> x() {
        return f27293g;
    }

    @Override // fb2.r
    public final void z(String str, DeviceSettingsDTO deviceSettingsDTO) {
        String str2 = str;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (str2 == null || !p13.u.z(new String[]{"SHOW_ALL", "SHOW_CALLS_ONLY", "SHOW_CALLS_AND_TEXTS"}, str2)) {
            return;
        }
        int i14 = b.f27297a[this.f27296f.ordinal()];
        if (i14 == 1) {
            wi1.c cVar = deviceSettingsDTO2.f33863b1;
            if (cVar != null) {
                cVar.i0(str2);
                return;
            }
            return;
        }
        if (i14 != 2) {
            lc.u0.r();
            return;
        }
        wi1.f fVar = deviceSettingsDTO2.f33865c1;
        if (fVar != null) {
            fVar.i0(str2);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R0\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR0\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lch1/a3$a;", "", "<init>", "()V", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "ROW_DICTIONARY", "Ljava/util/HashMap;", "", "TEXT_DICTIONARY", "DEFAULT_CONTAINER_ID", "I", "DEFAULT_NOTIFICATION_VALUE", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
