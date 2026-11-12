package mx1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mx1.b[], still in use, count: 1, list:
  (r0v1 mx1.b[]) from 0x012f: CONSTRUCTOR (r0v1 mx1.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lmx1/b;", "", "", Action.KEY_ATTRIBUTE, "", Constants.ScionAnalytics.PARAM_LABEL, "labelWithDay", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    PUSH_DAY("Push", R.string.lbl_stp_push, R.string.lbl_stp_push_day),
    /* JADX INFO: Fake field, exist only in values array */
    PULL_DAY("Pull", R.string.lbl_stp_pull, R.string.lbl_stp_pull_day),
    /* JADX INFO: Fake field, exist only in values array */
    LEGS_DAY("Legs", R.string.lbl_stp_legs, R.string.lbl_stp_leg_day),
    /* JADX INFO: Fake field, exist only in values array */
    BENCH_PRESS_DAY("Bench Press", R.string.lbl_benchmark_type_bench_press, R.string.lbl_stp_bench_press_day),
    /* JADX INFO: Fake field, exist only in values array */
    SQUAT_DAY("Squat", R.string.lbl_benchmark_type_squat, R.string.lbl_stp_squat_day),
    /* JADX INFO: Fake field, exist only in values array */
    ROW_DAY("Row", R.string.lbl_stp_row, R.string.lbl_stp_row_day),
    /* JADX INFO: Fake field, exist only in values array */
    DEADLIFT_DAY("Deadlift", R.string.lbl_benchmark_type_deadlift, R.string.lbl_stp_deadlift_day),
    /* JADX INFO: Fake field, exist only in values array */
    OVERHEAD_PRESS_DAY("Overhead Press", R.string.lbl_benchmark_type_overhead_press, R.string.lbl_stp_overhead_press_day),
    /* JADX INFO: Fake field, exist only in values array */
    ARMS_DAY("Arms", R.string.lbl_stp_arms, R.string.lbl_stp_arm_day),
    /* JADX INFO: Fake field, exist only in values array */
    BACK_DAY("Back", R.string.lbl_stp_back, R.string.lbl_stp_back_day),
    /* JADX INFO: Fake field, exist only in values array */
    CHEST_DAY("Chest", R.string.lbl_stp_chest, R.string.lbl_stp_chest_day),
    GENERIC_WORKOUT_1("Workout 1", R.string.lbl_generic_workout_1, R.string.lbl_generic_workout_1),
    GENERIC_WORKOUT_2("Workout 2", R.string.lbl_generic_workout_2, R.string.lbl_generic_workout_2),
    GENERIC_WORKOUT_3("Workout 3", R.string.lbl_generic_workout_3, R.string.lbl_generic_workout_3),
    GENERIC_WORKOUT_4("Workout 4", R.string.lbl_generic_workout_4, R.string.lbl_generic_workout_4),
    GENERIC_WORKOUT_5("Workout 5", R.string.lbl_generic_workout_5, R.string.lbl_generic_workout_5);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f121357d = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w13.c f121365l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f121368c;

    static {
        f121365l = new w13.c(new b[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16});
    }

    private b(String str, int i14, int i15) {
        super(str, i);
        this.f121366a = str;
        this.f121367b = i14;
        this.f121368c = i15;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f121364k.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmx1/b$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(String str) {
            Object next;
            w13.c cVar = b.f121365l;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((b) next).f121366a, str)) {
                    return (b) next;
                }
            }
            next = null;
            return (b) next;
        }

        private a() {
        }
    }
}
