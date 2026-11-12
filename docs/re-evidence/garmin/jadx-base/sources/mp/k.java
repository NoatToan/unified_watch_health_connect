package mp;

import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mp.k[], still in use, count: 1, list:
  (r0v1 mp.k[]) from 0x01cd: CONSTRUCTOR (r0v1 mp.k[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lmp/k;", "", "Lc22/c3;", "metricLabelResource", "", "metricKey", "", "divisionFactor", "<init>", "(Ljava/lang/String;ILc22/c3;Ljava/lang/String;D)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {
    DISTANCE(c22.i.b(R.string.lbl_distance), "distance", 1.0d),
    DISTANCE_SWIMMING(c22.i.b(R.string.lbl_distance), "distance", 1.0d),
    TIME(c22.i.b(R.string.lbl_time), "duration", 1.0d),
    TIME_INDOOR_ROWING(c22.i.b(R.string.lbl_time), "duration", 1.0d),
    ASCENT(c22.i.b(R.string.activities_ascent_label), "elevationGain", 1.0d),
    CALORIES(c22.i.b(R.string.lbl_calories), "calories", 4.19d),
    RESTING_CALORIES(c22.i.b(R.string.lbl_resting_calorie), "bmrCalories", 4.19d),
    NON_PACK_WEIGHT_CALORIES(c22.i.b(R.string.lbl_non_pack_calorie), "nonPackWeightCalories", 4.19d),
    PACK_WEIGHT_CALORIES(c22.i.b(R.string.lbl_pack), "packWeightCalories", 4.19d),
    WIN_RATE(c22.i.b(R.string.lbl_win_rate), "splitSummaries.gamesAverageWon", 1.0d),
    GAMES_AVG_WON(c22.i.b(R.string.lbl_win_rate), "splitSummaries.gamesAverageWon", 1.0d),
    GAMES_NOT_WON(c22.i.b(R.string.lbl_win_rate), "splitSummaries.gamesNotWon", 1.0d),
    GAMES_WON(c22.i.b(R.string.lbl_win_rate), "splitSummaries.gamesWon", 1.0d),
    STRESS(c22.i.b(R.string.title_stress), "avgStress", 1.0d),
    AVG_WIN_STRESS(c22.i.b(R.string.gaming_avg_win), "splitSummaries.avgStressWin", 1.0d),
    AVG_LOSS_STRESS(c22.i.b(R.string.gaming_avg_loss), "splitSummaries.avgStressLoss", 1.0d),
    AVG_DRAW_STRESS(c22.i.b(R.string.gaming_avg_tie), "splitSummaries.avgStressDraw", 1.0d),
    BODY_BATTERY(c22.i.b(R.string.gcm_body_battery_lbl_body_battery), "differenceBodyBattery", 1.0d),
    PACK_WEIGHT(c22.i.b(R.string.lbl_pack_weight), "beginPackWeight", 1.0d),
    AVG_PACK_WEIGHT(c22.i.b(R.string.lbl_avg_pack_weight), "splitSummaries.avgPackWeight", 1.0d),
    PACE(c22.i.b(R.string.lbl_pace), "pace", 1.0d);

    public static final /* synthetic */ w13.c C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f120007d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f120028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f120030c;

    static {
        C = new w13.c(new k[]{r0, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21});
    }

    private k(c3 c3Var, String str, double d14) {
        super(str, i);
        this.f120028a = c3Var;
        this.f120029b = str;
        this.f120030c = d14;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) B.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmp/k$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: mp.k$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2279a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f120031a;

            static {
                int[] iArr = new int[k.values().length];
                try {
                    iArr[k.AVG_WIN_STRESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k.AVG_LOSS_STRESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[k.AVG_DRAW_STRESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[k.PACK_WEIGHT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[k.PACE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[k.STRESS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[k.WIN_RATE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[k.CALORIES.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f120031a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static int a(k kVar) {
            int i14 = kVar == null ? -1 : C2279a.f120031a[kVar.ordinal()];
            if (i14 == 1) {
                return R.color.green_40;
            }
            if (i14 == 2) {
                return R.color.red_40;
            }
            if (i14 == 3) {
                return R.color.blue_50;
            }
            if (i14 != 4) {
                return i14 != 5 ? R.color.gcm_chart_highlight_line : R.color.blue_50;
            }
            return R.color.surface_background_hero_inverted;
        }

        private a() {
        }
    }
}
