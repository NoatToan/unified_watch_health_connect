package vf2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v14 vf2.j[], still in use, count: 1, list:
  (r1v14 vf2.j[]) from 0x0195: CONSTRUCTOR (r1v14 vf2.j[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvf2/j;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {
    FIT_WKT_STEP_TARGET_NONE(null),
    FIT_WKT_STEP_TARGET_SPEED(0),
    FIT_WKT_STEP_TARGET_HEART_RATE(1),
    FIT_WKT_STEP_TARGET_OPEN(2),
    FIT_WKT_STEP_TARGET_CADENCE(3),
    FIT_WKT_STEP_TARGET_POWER(4),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_TARGET_GRADE(5),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_TARGET_RESISTANCE(6),
    FIT_WKT_STEP_TARGET_POWER_3S(7),
    FIT_WKT_STEP_TARGET_POWER_10S(8),
    FIT_WKT_STEP_TARGET_POWER_30S(9),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_TARGET_POWER_LAP(10),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_TARGET_SWIM_STROKE(11),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_TARGET_SPEED_LAP(12),
    FIT_WKT_STEP_TARGET_HEART_RATE_LAP(13),
    FIT_WKT_STEP_TARGET_INHALE_DURATION(14),
    FIT_WKT_STEP_TARGET_INHALE_HOLD_DURATION(15),
    FIT_WKT_STEP_TARGET_EXHALE_DURATION(16),
    FIT_WKT_STEP_TARGET_EXHALE_HOLD_DURATION(17),
    FIT_WKT_STEP_TARGET_POWER_CURVE(18),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_TARGET_SWIM_CSS_OFFSET(19),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_TARGET_SWIM_INSTRUCTION(20),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_TARGET_TIME(21),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_TARGET_DISTANCE(22),
    /* JADX INFO: Fake field, exist only in values array */
    FIT_WKT_STEP_TARGET_REPS(23);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f177974b = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ w13.c f177991t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f177992a;

    static {
        f177991t = new w13.c(new j[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r2, r0, r1, new j(19), new j(20), new j(21), new j(22), new j(23)});
    }

    private j(Integer num) {
        super(str, i);
        this.f177992a = num;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f177990r.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvf2/j$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a(Integer num) {
            Object next;
            w13.c cVar = j.f177991t;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((j) next).f177992a, num)) {
                    return (j) next;
                }
            }
            next = null;
            return (j) next;
        }

        private a() {
        }
    }
}
