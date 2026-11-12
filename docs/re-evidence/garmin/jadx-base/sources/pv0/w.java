package pv0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v46 pv0.w[], still in use, count: 1, list:
  (r0v46 pv0.w[]) from 0x02e3: CONSTRUCTOR (r0v46 pv0.w[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpv0/w;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;IJ)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {
    ALCOHOL(1L),
    MORNING_CAFFEINE(2L),
    LATE_CAFFEINE(42L),
    LIGHT_EXERCISE(3L),
    MODERATE_EXERCISE(43L),
    VIGOROUS_EXERCISE(44L),
    HEALTHY_MEALS(4L),
    HEAVY_MEALS(5L),
    LATE_MEALS(6L),
    INTERMITTENT_FASTING(8L),
    COLD_SHOWERS_BATHS(7L),
    JOURNALING(9L),
    SAUNA_STEAM_ROOM(10L),
    STRETCHING(11L),
    SUNLIGHT(12L),
    ACUPUNCTURE(13L),
    CHIROPRACTOR(14L),
    COMPRESSION_THERAPY(15L),
    CUPPING(16L),
    LIGHT_THERAPY(17L),
    MASSAGE_THERAPY(18L),
    PHYSICAL_THERAPY(19L),
    CPAP_MACHINE(20L),
    EAR_PLUGS_HEADPHONES(21L),
    EYE_MASK(22L),
    LIGHT_EXERCISE_BEFORE_BED(45L),
    MODERATE_EXERCISE_BEFORE_BED(46L),
    VIGOROUS_EXERCISE_BEFORE_BED(47L),
    HUMIDIFIER_USE(23L),
    NASAL_STRIPS(24L),
    OVERSLEEPING(25L),
    PET_IN_BEDROOM(26L),
    READING_IN_BED(27L),
    SCREENS_BEFORE_BED(28L),
    SHARED_BED(29L),
    SLEEP_SOUNDS(30L),
    ALLERGY_SYMPTOMS(31L),
    BREASTFEEDING(32L),
    CAREGIVING(33L),
    HIGH_ALTITUDE(34L),
    ILLNESS(35L),
    INFANT_AT_HOME(36L),
    INJURED(37L),
    MIGRAINES(38L),
    PERIOD_DAY(39L),
    TRAVELING_VACATION(41L);

    public static final /* synthetic */ w13.c T0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f141433b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f141457a;

    static {
        T0 = new w13.c(new w[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0});
    }

    private w(long j8) {
        super(str, i);
        this.f141457a = j8;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) S0.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpv0/w$a;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static w a(Long l14) {
            Object next;
            w13.c cVar = w.T0;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                long j8 = ((w) next).f141457a;
                if (l14 != null && j8 == l14.longValue()) {
                    return (w) next;
                }
            }
            next = null;
            return (w) next;
        }

        private a() {
        }
    }
}
