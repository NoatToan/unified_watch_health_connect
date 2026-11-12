package tq0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 tq0.g[], still in use, count: 1, list:
  (r0v1 tq0.g[]) from 0x00be: CONSTRUCTOR (r0v1 tq0.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ltq0/g;", "", "", "jsonKey", "", "listIconResourceID", "labelResourceID", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {
    UNKNOWN("UNKNOWN", R.drawable.insights, R.string.sensor_unknown),
    SLEEP("SLEEP", R.drawable.sleep, R.string.sleep_lbl_sleep),
    STEPS("STEPS", R.drawable.steps, R.string.lbl_steps),
    WEIGHT("WEIGHT", R.drawable.weight, R.string.card_weight_title),
    CALORIES("CALORIES", R.drawable.calories, R.string.lbl_calories),
    FLOORS("FLOORS", R.drawable.floors, R.string.floors_title),
    RUNNING("RUNNING", R.drawable.run, R.string.lbl_running),
    DIVING("DIVING", R.drawable.dive, R.string.lbl_diving),
    CYCLING("CYCLING", R.drawable.bike, R.string.lbl_cycling),
    SWIMMING("SWIMMING", R.drawable.swim_open, R.string.lbl_swimming);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f166059d = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w13.c f166071p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f166074c;

    static {
        f166071p = new w13.c(new g[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9});
    }

    private g(String str, int i14, int i15) {
        super(str, i);
        this.f166072a = str;
        this.f166073b = i14;
        this.f166074c = i15;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f166070o.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltq0/g$a;", "", "<init>", "()V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: tq0.g$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3125a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f166075a;

            static {
                int[] iArr = new int[g.values().length];
                try {
                    iArr[g.UNKNOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g.SLEEP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g.STEPS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[g.WEIGHT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[g.CALORIES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[g.FLOORS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[g.RUNNING.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[g.DIVING.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[g.CYCLING.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[g.SWIMMING.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                f166075a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
