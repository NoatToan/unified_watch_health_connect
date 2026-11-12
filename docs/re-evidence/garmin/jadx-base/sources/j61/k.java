package j61;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 j61.k[], still in use, count: 1, list:
  (r0v1 j61.k[]) from 0x009f: CONSTRUCTOR (r0v1 j61.k[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lj61/k;", "", "", Action.KEY_ATTRIBUTE, "", "stringResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", "m", JWKParameterNames.RSA_MODULUS, "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {
    NOT_AVAILABLE("NOT_AVAILABLE", R.string.lbl_cycling_ability_not_available),
    ENDURANCE_SPECIALIST("ENDURANCE_SPECIALIST", R.string.lbl_cycling_ability_endurance_specialist),
    ROAD_SPRINTER("ROAD_SPRINTER", R.string.lbl_cycling_ability_road_sprinter),
    ALL_ROUNDER("ALL_ROUNDER", R.string.lbl_cycling_ability_all_rounder),
    FLAT_SPECIALIST("FLAT_SPECIALIST", R.string.lbl_cycling_ability_flat_specialist),
    CLIMBER("CLIMBER", R.string.lbl_cycling_ability_climber),
    PUNCHEUR("PUNCHEUR", R.string.lbl_cycling_ability_puncheur),
    SPRINTER("SPRINTER", R.string.lbl_cycling_ability_sprinter),
    CHALLENGER("CHALLENGER", R.string.lbl_cycling_ability_challenger),
    IN_PROGRESS("IN_PROGRESS", R.string.lbl_cycling_ability_in_progress),
    INVALID("INVALID", 0);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f97361c = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w13.c f97374p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97376b;

    static {
        f97374p = new w13.c(new k[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10});
    }

    private k(String str, int i14) {
        super(str, i);
        this.f97375a = str;
        this.f97376b = i14;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f97373o.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj61/k$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
