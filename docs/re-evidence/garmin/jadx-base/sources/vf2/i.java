package vf2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v35 vf2.i[], still in use, count: 1, list:
  (r0v35 vf2.i[]) from 0x01b5: CONSTRUCTOR (r0v35 vf2.i[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvf2/i;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;II)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {
    FIT_WKT_STEP_DURATION_TIME(0),
    FIT_WKT_STEP_DURATION_DISTANCE(1),
    FIT_WKT_STEP_DURATION_HR_LESS_THAN(2),
    FIT_WKT_STEP_DURATION_HR_GREATER_THAN(3),
    FIT_WKT_STEP_DURATION_CALORIES(4),
    FIT_WKT_STEP_DURATION_OPEN(5),
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_STEPS_CMPLT(6),
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_TIME(7),
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_DISTANCE(8),
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_CALORIES(9),
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_HR_LESS_THAN(10),
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_HR_GREATER_THAN(11),
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_POWER_LESS_THAN(12),
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_POWER_GREATER_THAN(13),
    FIT_WKT_STEP_DURATION_POWER_LESS_THAN(14),
    FIT_WKT_STEP_DURATION_POWER_GREATER_THAN(15),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_POWER_LAP_GREATER_THAN(16),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_TRAINING_PEAKS_TSS(17),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_POWER_LAP_GREATER_THAN(18),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_TRAINING_PEAKS_TSS(19),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_POWER_LAP_GREATER_THAN(20),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_TRAINING_PEAKS_TSS(21),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_POWER_LAP_GREATER_THAN(22),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_TRAINING_PEAKS_TSS(23),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_POWER_LAP_GREATER_THAN(24),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_TRAINING_PEAKS_TSS(25),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_POWER_LAP_GREATER_THAN(26),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_REPEAT_UNTIL_TRAINING_PEAKS_TSS(27),
    FIT_WKT_STEP_DURATION_REPETITION_TIME(28),
    FIT_WKT_STEP_DURATION_REPS(29),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_TIME_AT_VALID_CDA(30),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_TIME_ONLY(31),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_REPETITION_SWIM_CSS_OFFSET(32),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_DEPTH_LESS_THAN(33),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_DURATION_DEPTH_GREATER_THAN(34);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f177952b = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ w13.c f177972x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f177973a;

    static {
        f177972x = new w13.c(new i[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, new i(30), new i(31), new i(32), new i(33), new i(34)});
    }

    private i(int i14) {
        super(str, i);
        this.f177973a = i14;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f177971w.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvf2/i$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
