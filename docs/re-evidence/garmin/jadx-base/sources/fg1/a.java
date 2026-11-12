package fg1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB'\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lfg1/a;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "iconResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    NEW("NEW", R.string.full, null),
    GOOD("GOOD", R.string.lbl_good, null),
    OK("OK", R.string.lbl_ok, null),
    LOW("LOW", R.string.gcm_body_battery_lbl_low, Integer.valueOf(R.drawable.icon_battery_low_gray)),
    CRITICAL("CRITICAL", R.string.gcm_body_battery_lbl_very_low, Integer.valueOf(R.drawable.icon_battery_verylow_gray)),
    /* JADX INFO: Fake field, exist only in values array */
    CHARGING("CHARGING", R.string.sensor_indicator_charging, Integer.valueOf(R.drawable.icon_battery_charging_gray)),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("", R.string.sensor_unknown, Integer.valueOf(R.drawable.icon_battery_unknown_gray));


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1455a f71382d = new C1455a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f71391c;

    a(String str, int i14, Integer num) {
        this.f71389a = str;
        this.f71390b = i14;
        this.f71391c = num;
    }

    /* JADX INFO: renamed from: fg1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfg1/a$a;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1455a {
        public /* synthetic */ C1455a(j jVar) {
            this();
        }

        public static a a(String str) {
            for (a aVar : a.values()) {
                if (s.g(aVar.f71389a, str)) {
                    return aVar;
                }
            }
            return null;
        }

        private C1455a() {
        }
    }
}
