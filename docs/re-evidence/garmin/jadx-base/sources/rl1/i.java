package rl1;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rl1.i[], still in use, count: 1, list:
  (r0v1 rl1.i[]) from 0x009b: CONSTRUCTOR (r0v1 rl1.i[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrl1/i;", "", "", FirebaseAnalytics.Param.INDEX, "labelResId", "<init>", "(Ljava/lang/String;III)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {
    MOVEMENT(0, R.string.lbl_movement),
    BREATHING_VARIATIONS(1, R.string.lbl_breathing_variations),
    AWAKE_RESTLESSNESS(2, R.string.lbl_awake_restlessness),
    OVERNIGHT_HEART_RATE(10, R.string.lbl_overnight_heart_rate),
    RESTING_HEART_RATE(3, R.string.resting_heart_rate),
    BODY_BATTERY(4, R.string.gcm_body_battery_lbl_body_battery),
    PULSE_OX(5, R.string.device_settings_pulse_ox),
    RESPIRATION(6, R.string.activities_respiration_title),
    RESPIRATION_AVERAGES(7, R.string.activities_respiration_title),
    OVERNIGHT_HRV(8, R.string.lbl_overnight_hrv),
    SKIN_TEMP(9, R.string.lbl_skin_temp);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w13.c f153434o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153436b;

    static {
        f153434o = new w13.c(iVarArr);
    }

    private i(int i14, int i15) {
        super(str, i);
        this.f153435a = i14;
        this.f153436b = i15;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f153433n.clone();
    }
}
