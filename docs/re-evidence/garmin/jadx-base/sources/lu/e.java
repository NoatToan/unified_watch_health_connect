package lu;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 lu.e[], still in use, count: 1, list:
  (r0v1 lu.e[]) from 0x0041: CONSTRUCTOR (r0v1 lu.e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Llu/e;", "", "", FirebaseAnalytics.Param.INDEX, "labelResourceID", "descriptionLabelResourceID", "", "alertKey", "<init>", "(Ljava/lang/String;IIIILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {
    AVERAGE_POWER(0, R.string.audio_prompts_power_alert_type_average, R.string.audio_prompts_power_alert_type_average_desc, "AVERAGE"),
    NORMALIZED_POWER(1, R.string.audio_prompts_power_alert_type_normalized, R.string.audio_prompts_power_alert_type_normalized_desc, "NORMALIZED"),
    LAP_POWER(2, R.string.audio_prompts_power_alert_type_lap, R.string.audio_prompts_power_alert_type_lap_desc, "LAP");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f114944d = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f114949i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114952c;

    static {
        f114949i = new w13.c(new e[]{r0, r1, r2});
    }

    private e(int i14, int i15, int i16, String str) {
        super(str, i);
        this.f114950a = i15;
        this.f114951b = i16;
        this.f114952c = str;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f114948h.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llu/e$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static e a(String str) {
            if ("NORMALIZED".equals(str)) {
                return e.NORMALIZED_POWER;
            }
            return "LAP".equals(str) ? e.LAP_POWER : e.AVERAGE_POWER;
        }

        private a() {
        }
    }
}
