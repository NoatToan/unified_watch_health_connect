package qs;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB'\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lqs/c0;", "Lqs/e0;", "", "", Action.KEY_ATTRIBUTE, "", "phrase", "explanation", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 implements e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f147038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c0[] f147039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f147040f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f147042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f147043c;

    /* JADX INFO: Fake field, exist only in values array */
    c0 EF0;

    static {
        Integer numValueOf = Integer.valueOf(R.string.activities_training_effect_recovery);
        Integer numValueOf2 = Integer.valueOf(R.string.activities_training_effect_recovery_description);
        c0 c0Var = new c0("LEVEL_0", 0, "MINOR_AEROBIC_BENEFIT_0", numValueOf, numValueOf2);
        Integer numValueOf3 = Integer.valueOf(R.string.workout_benefit_maintaining_health_title);
        Integer numValueOf4 = Integer.valueOf(R.string.workout_benefit_maintaining_health_desc);
        c0 c0Var2 = new c0("LEVEL_1", 1, "MAINTAINING_AEROBIC_FITNESS_1", numValueOf3, numValueOf4);
        Integer numValueOf5 = Integer.valueOf(R.string.workout_benefit_improving_fitness_title);
        Integer numValueOf6 = Integer.valueOf(R.string.workout_benefit_improving_fitness_desc);
        c0 c0Var3 = new c0("LEVEL_2", 2, "IMPROVING_AEROBIC_FITNESS_2", numValueOf5, numValueOf6);
        c0 c0Var4 = new c0("LEVEL_3", 3, "HIGHLY_IMPROVING_AEROBIC_FITNESS_3", numValueOf5, numValueOf6);
        Integer numValueOf7 = Integer.valueOf(R.string.workout_benefit_high_exertion_title);
        Integer numValueOf8 = Integer.valueOf(R.string.workout_benefit_high_exertion_desc);
        c0 c0Var5 = new c0("LEVEL_4", 4, "OVERREACHING_4", numValueOf7, numValueOf8);
        c0 c0Var6 = new c0("LEVEL_5", 5, "RECOVERY_5", numValueOf, numValueOf2);
        c0 c0Var7 = new c0("LEVEL_6", 6, "MINOR_AEROBIC_BENEFIT_6", numValueOf3, numValueOf4);
        c0 c0Var8 = new c0("LEVEL_7", 7, "MAINTAINING_AEROBIC_BASE_7", numValueOf3, numValueOf4);
        Integer numValueOf9 = Integer.valueOf(R.string.workout_benefit_improving_health_title);
        Integer numValueOf10 = Integer.valueOf(R.string.workout_benefit_improving_health_desc);
        c0 c0Var9 = new c0("LEVEL_8", 8, "IMPROVING_AEROBIC_BASE_8", numValueOf9, numValueOf10);
        c0 c0Var10 = new c0("LEVEL_9", 9, "IMPROVING_AEROBIC_ENDURANCE_9", numValueOf9, numValueOf10);
        c0 c0Var11 = new c0("LEVEL_10", 10, "HIGHLY_IMPROVING_AEROBIC_ENDURANCE_10", numValueOf9, numValueOf10);
        c0 c0Var12 = new c0("LEVEL_11", 11, "OVERREACHING_11", numValueOf7, numValueOf8);
        c0 c0Var13 = new c0("LEVEL_12", 12, "IMPROVING_LACTATE_THRESHOLD_12", numValueOf5, numValueOf6);
        c0 c0Var14 = new c0("LEVEL_13", 13, "HIGHLY_IMPROVING_LACTATE_THRESHOLD_13", numValueOf5, numValueOf6);
        c0 c0Var15 = new c0("LEVEL_14", 14, "OVERREACHING_14", numValueOf7, numValueOf8);
        Integer numValueOf11 = Integer.valueOf(R.string.workout_benefit_improving_vo2_max);
        Integer numValueOf12 = Integer.valueOf(R.string.workout_benefit_improving_vo2_max_desc);
        c0 c0Var16 = new c0("LEVEL_15", 15, "IMPROVING_VO2_MAX_15", numValueOf11, numValueOf12);
        c0 c0Var17 = new c0("LEVEL_16", 16, "HIGHLY_IMPROVING_VO2_MAX_16", numValueOf11, numValueOf12);
        c0 c0Var18 = new c0("LEVEL_17", 17, "OVERREACHING_17", numValueOf7, numValueOf8);
        c0 c0Var19 = new c0("LEVEL_18", 18, "NO_AEROBIC_BENEFIT_18", numValueOf, numValueOf2);
        Integer numValueOf13 = Integer.valueOf(R.string.workout_benefit_maintaining_fitness_title);
        Integer numValueOf14 = Integer.valueOf(R.string.workout_benefit_maintaining_fitness_desc);
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9, c0Var10, c0Var11, c0Var12, c0Var13, c0Var14, c0Var15, c0Var16, c0Var17, c0Var18, c0Var19, new c0("LEVEL_19", 19, "MAINTAINING_LACTATE_THRESHOLD_19", numValueOf13, numValueOf14), new c0("LEVEL_20", 20, "MAINTAINING_VO2_MAX_20", Integer.valueOf(R.string.workout_benefit_maintaining_vo2_max), Integer.valueOf(R.string.workout_benefit_maintaining_vo2_max_desc)), new c0("LEVEL_21", 21, "MAINTAINING_TEMPO_21", numValueOf13, numValueOf14), new c0("LEVEL_22", 22, "IMPACTING_TEMPO_22", numValueOf5, numValueOf6), new c0("LEVEL_23", 23, "HIGHLY_IMPACTING_TEMPO_23", numValueOf5, numValueOf6), new c0("LEVEL_24", 24, "OVERREACHING_TEMPO_24", numValueOf7, numValueOf8)};
        f147039e = c0VarArr;
        f147040f = new w13.c(c0VarArr);
        f147038d = new a(null);
    }

    private c0(String str, int i14, String str2, Integer num, Integer num2) {
        super(str, i14);
        this.f147041a = str2;
        this.f147042b = num;
        this.f147043c = num2;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f147039e.clone();
    }

    @Override // qs.e0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getF147042b() {
        return this.f147042b;
    }

    @Override // qs.e0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getF147043c() {
        return this.f147043c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/c0$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
