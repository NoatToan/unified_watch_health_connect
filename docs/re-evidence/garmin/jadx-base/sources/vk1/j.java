package vk1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 vk1.j[], still in use, count: 1, list:
  (r0v1 vk1.j[]) from 0x0056: CONSTRUCTOR (r0v1 vk1.j[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvk1/j;", "", "", "mStrResourceIDAbbreviatedNo", "mStrResourceIDAbbreviatedYes", "", "mDefaultZonePercentages", "<init>", "(Ljava/lang/String;III[I)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {
    HR_MAX(R.string.hr_zones_lbl_training_method_percent_max_heart_rate, R.string.hr_zones_lbl_training_method_percent_max_heart_rate_abbreviated, new int[]{50, 60, 70, 80, 90}),
    HR_RESERVE(R.string.hr_zones_lbl_training_method_percent_heart_rate_reserve, R.string.hr_zones_lbl_training_method_percent_heart_rate_reserve_abbreviated, new int[]{50, 60, 70, 80, 90}),
    LACTATE_THRESHOLD(R.string.hr_zones_lbl_training_method_percent_lactate_threshold, R.string.hr_zones_lbl_training_method_percent_lactate_threshold_abbreviated, new int[]{65, 80, 89, 95, 100});


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f178640h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f178641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f178642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f178643c;

    static {
        f178640h = new w13.c(jVarArr);
    }

    private j(int i14, int i15, int[] iArr) {
        super(str, i);
        this.f178641a = i14;
        this.f178642b = i15;
        this.f178643c = iArr;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f178639g.clone();
    }
}
