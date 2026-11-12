package q50;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v17 q50.a[], still in use, count: 1, list:
  (r0v17 q50.a[]) from 0x00de: CONSTRUCTOR (r0v17 q50.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lq50/a;", "", "", Action.KEY_ATTRIBUTE, "", "stringResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_WARM_AND_SHORT_RIDE("FEEDBACK_WARM_AND_SHORT_RIDE", R.string.nutrition_and_hydration_feedback_warm_and_short_ride),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_SHORT_RIDE("FEEDBACK_SHORT_RIDE", R.string.nutrition_and_hydration_feedback_short_ride),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_HOT_RIDE("FEEDBACK_HOT_RIDE", R.string.nutrition_and_hydration_feedback_hot_ride),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_WARM_RIDE("FEEDBACK_WARM_RIDE", R.string.nutrition_and_hydration_feedback_warm_ride),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_MILD_RIDE("FEEDBACK_MILD_RIDE", R.string.nutrition_and_hydration_feedback_mild_ride),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_VERY_HIGH_CARBS("FEEDBACK_VERY_HIGH_CARBS", R.string.nutrition_and_hydration_feedback_very_high_carbs),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_HIGH_CARBS_HOT_AND_INTENSE("FEEDBACK_HIGH_CARBS_HOT_AND_INTENSE", R.string.nutrition_and_hydration_feedback_high_carbs_hot_and_intense),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_HIGH_CARBS_HOT("FEEDBACK_HIGH_CARBS_HOT", R.string.nutrition_and_hydration_feedback_high_carbs_hot),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_HIGH_CARBS_LONG("FEEDBACK_HIGH_CARBS_LONG", R.string.nutrition_and_hydration_feedback_high_carbs_long),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_HIGH_CARBS_SHORT("FEEDBACK_HIGH_CARBS_SHORT", R.string.nutrition_and_hydration_feedback_high_carbs_short),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_NUTRITION_HOT("FEEDBACK_NUTRITION_HOT", R.string.nutrition_and_hydration_feedback_nutrition_hot),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_NUTRITION_WARM_AND_INTENSE("FEEDBACK_NUTRITION_WARM_AND_INTENSE", R.string.nutrition_and_hydration_feedback_nutrition_warm_and_intense),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_NUTRITION_LONG_AND_WARM("FEEDBACK_NUTRITION_LONG_AND_WARM", R.string.nutrition_and_hydration_feedback_nutrition_long_and_warm),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_NUTRITION_WARM_AND_EASY("FEEDBACK_NUTRITION_WARM_AND_EASY", R.string.nutrition_and_hydration_feedback_nutrition_warm_and_easy),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_NUTRITION_BASIC("FEEDBACK_NUTRITION_BASIC", R.string.nutrition_and_hydration_feedback_nutrition_basic),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_NUTRITION_LONG("FEEDBACK_NUTRITION_LONG", R.string.nutrition_and_hydration_feedback_nutrition_long),
    /* JADX INFO: Fake field, exist only in values array */
    FEEDBACK_NUTRITION_VERY_LONG("FEEDBACK_NUTRITION_VERY_LONG", R.string.nutrition_and_hydration_feedback_nutrition_very_long);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2686a f142868c = new C2686a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c f142870e = new c(new a[]{new a("FEEDBACK_WARM_AND_SHORT_RIDE", R.string.nutrition_and_hydration_feedback_warm_and_short_ride), new a("FEEDBACK_SHORT_RIDE", R.string.nutrition_and_hydration_feedback_short_ride), new a("FEEDBACK_HOT_RIDE", R.string.nutrition_and_hydration_feedback_hot_ride), new a("FEEDBACK_WARM_RIDE", R.string.nutrition_and_hydration_feedback_warm_ride), new a("FEEDBACK_MILD_RIDE", R.string.nutrition_and_hydration_feedback_mild_ride), new a("FEEDBACK_VERY_HIGH_CARBS", R.string.nutrition_and_hydration_feedback_very_high_carbs), new a("FEEDBACK_HIGH_CARBS_HOT_AND_INTENSE", R.string.nutrition_and_hydration_feedback_high_carbs_hot_and_intense), new a("FEEDBACK_HIGH_CARBS_HOT", R.string.nutrition_and_hydration_feedback_high_carbs_hot), new a("FEEDBACK_HIGH_CARBS_LONG", R.string.nutrition_and_hydration_feedback_high_carbs_long), new a("FEEDBACK_HIGH_CARBS_SHORT", R.string.nutrition_and_hydration_feedback_high_carbs_short), new a("FEEDBACK_NUTRITION_HOT", R.string.nutrition_and_hydration_feedback_nutrition_hot), new a("FEEDBACK_NUTRITION_WARM_AND_INTENSE", R.string.nutrition_and_hydration_feedback_nutrition_warm_and_intense), new a("FEEDBACK_NUTRITION_LONG_AND_WARM", R.string.nutrition_and_hydration_feedback_nutrition_long_and_warm), new a("FEEDBACK_NUTRITION_WARM_AND_EASY", R.string.nutrition_and_hydration_feedback_nutrition_warm_and_easy), new a("FEEDBACK_NUTRITION_BASIC", R.string.nutrition_and_hydration_feedback_nutrition_basic), new a("FEEDBACK_NUTRITION_LONG", R.string.nutrition_and_hydration_feedback_nutrition_long), new a("FEEDBACK_NUTRITION_VERY_LONG", R.string.nutrition_and_hydration_feedback_nutrition_very_long)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f142872b;

    static {
    }

    private a(String str, int i14) {
        super(str, i);
        this.f142871a = str;
        this.f142872b = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f142869d.clone();
    }

    /* JADX INFO: renamed from: q50.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq50/a$a;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2686a {
        public /* synthetic */ C2686a(j jVar) {
            this();
        }

        private C2686a() {
        }
    }
}
