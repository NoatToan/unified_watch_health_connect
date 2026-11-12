package j61;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 j61.l[], still in use, count: 1, list:
  (r0v4 j61.l[]) from 0x00e2: CONSTRUCTOR (r0v4 j61.l[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lj61/l;", "", "", Action.KEY_ATTRIBUTE, "", "stringResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", "m", JWKParameterNames.RSA_MODULUS, "o", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {
    NOT_AVAILABLE("NOT_AVAILABLE", R.string.lbl_cycling_ability_profile_type_feedback_not_available),
    ENDURANCE_SPECIALIST("ENDURANCE_SPECIALIST", R.string.lbl_cycling_ability_profile_type_feedback_endurance_specialist),
    ENDURANCE_SPECIALIST_FLAT("ENDURANCE_SPECIALIST_FLAT", R.string.lbl_cycling_ability_profile_type_feedback_endurance_specialist_flat),
    ROAD_SPRINTER("ROAD_SPRINTER", R.string.lbl_cycling_ability_profile_type_feedback_road_sprinter),
    ALL_ROUNDER("ALL_ROUNDER", R.string.lbl_cycling_ability_profile_type_feedback_all_rounder),
    ALL_ROUNDER_FLAT("ALL_ROUNDER_FLAT", R.string.lbl_cycling_ability_profile_type_feedback_all_rounder_flat),
    FLAT_SPECIALIST("FLAT_SPECIALIST", R.string.lbl_cycling_ability_profile_type_feedback_flat_specialist),
    CLIMBER("CLIMBER", R.string.lbl_cycling_ability_profile_type_feedback_climber),
    PUNCHEUR("PUNCHEUR", R.string.lbl_cycling_ability_profile_type_feedback_puncheur),
    PUNCHEUR_FLAT("PUNCHEUR_FLAT", R.string.lbl_cycling_ability_profile_type_feedback_puncheur_flat),
    SPRINTER("SPRINTER", R.string.lbl_cycling_ability_profile_type_feedback_sprinter),
    SPRINTER_FLAT("SPRINTER_FLAT", R.string.lbl_cycling_ability_profile_type_feedback_sprinter_flat),
    CHALLENGER("CHALLENGER", R.string.lbl_cycling_ability_profile_type_feedback_challenger),
    IN_PROGRESS("IN_PROGRESS", R.string.lbl_cycling_ability_profile_type_feedback_in_progress),
    INVALID("INVALID", 0);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f97377c = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ w13.c f97394v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97396b;

    static {
        f97394v = new w13.c(new l[]{r0, r1, r2, r4, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14});
    }

    private l(String str, int i14) {
        super(str, i);
        this.f97395a = str;
        this.f97396b = i14;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f97393t.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj61/l$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
