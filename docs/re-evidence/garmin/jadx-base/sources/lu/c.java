package lu;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 lu.c[], still in use, count: 1, list:
  (r0v1 lu.c[]) from 0x0040: CONSTRUCTOR (r0v1 lu.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Llu/c;", "", "", "labelResourceID", "", "alertKey", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    HEART_RATE(R.string.activity_details_heart_rate, "HEART_RATE"),
    HEART_RATE_ZONE(R.string.audio_prompts_heart_rate_alert_type_heart_rate_zone, "HEART_RATE_ZONE"),
    PERCENTAGE_MAX_HEART_RATE(R.string.audio_prompts_heart_rate_alert_type_percent_max_heart_rate, "PERCENT_MAX_HEART_RATE"),
    PERCENTAGE_HEART_RATE_RESERVE(R.string.audio_prompts_heart_rate_alert_type_percent_heart_rate_reserve, "PERCENT_HEART_RATE_RESERVE");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f114926c = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f114932i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114934b;

    static {
        f114932i = new w13.c(new c[]{r0, r1, r2, r3});
    }

    private c(int i14, String str) {
        super(str, i);
        this.f114933a = i14;
        this.f114934b = str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f114931h.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llu/c$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a(String str) {
            if ("HEART_RATE_ZONE".equals(str)) {
                return c.HEART_RATE_ZONE;
            }
            if ("PERCENT_MAX_HEART_RATE".equals(str)) {
                return c.PERCENTAGE_MAX_HEART_RATE;
            }
            return "PERCENT_HEART_RATE_RESERVE".equals(str) ? c.PERCENTAGE_HEART_RATE_RESERVE : c.HEART_RATE;
        }

        private a() {
        }
    }
}
