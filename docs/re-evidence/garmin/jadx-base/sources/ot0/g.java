package ot0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ot0.g[], still in use, count: 1, list:
  (r0v4 ot0.g[]) from 0x00d6: CONSTRUCTOR (r0v4 ot0.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lot0/g;", "", "", "textResId", "<init>", "(Ljava/lang/String;II)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {
    ALL_CHALLENGES(R.string.card_challenges_action_button_title),
    ADVENTURES(R.string.lbl_expeditions),
    STEPS(R.string.lbl_steps),
    WALKING(R.string.lbl_walking),
    RUNNING(R.string.lbl_running),
    CYCLING(R.string.lbl_cycling),
    STRENGTH(R.string.lbl_strength),
    SWIMMING(R.string.lbl_swimming),
    HIKING(R.string.lbl_hiking),
    YOGA(R.string.activity_type_yoga),
    /* JADX INFO: Fake field, exist only in values array */
    PUSHES(R.string.lbl_pushes),
    /* JADX INFO: Fake field, exist only in values array */
    PUSHING(R.string.activity_type_parasports),
    HEALTH_AND_WELLNESS(R.string.lbl_category_health_and_wellness),
    SOCIAL(R.string.lbl_category_social),
    GC_PLUS(R.string.lbl_garmin_connect_plus);


    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w13.c f133748p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f133749a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133750a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.ALL_CHALLENGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.ADVENTURES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.STEPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.WALKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.RUNNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g.CYCLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[g.STRENGTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[g.SWIMMING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[g.HIKING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[g.YOGA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[g.SOCIAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[g.HEALTH_AND_WELLNESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f133750a = iArr;
        }
    }

    static {
        f133748p = new w13.c(gVarArr);
    }

    private g(int i14) {
        super(str, i);
        this.f133749a = i14;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f133747o.clone();
    }
}
