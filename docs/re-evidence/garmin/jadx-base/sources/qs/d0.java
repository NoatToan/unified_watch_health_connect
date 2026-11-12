package qs;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF1' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB'\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lqs/d0;", "Lqs/e0;", "", "", Action.KEY_ATTRIBUTE, "", "phrase", "explanation", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 implements e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f147049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d0[] f147050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f147051f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f147053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f147054c;

    /* JADX INFO: Fake field, exist only in values array */
    d0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    d0 EF1;

    static {
        d0 d0Var = new d0("LEVEL_0", 0, "NO_ANAEROBIC_BENEFIT_0", null, null);
        Integer numValueOf = Integer.valueOf(R.string.workout_benefit_high_intensity_title);
        Integer numValueOf2 = Integer.valueOf(R.string.workout_benefit_high_intensity_desc);
        d0 d0Var2 = new d0("LEVEL_1", 1, "MAINTAINING_ANAEROBIC_BASE_1", numValueOf, numValueOf2);
        d0 d0Var3 = new d0("LEVEL_2", 2, "IMPROVING_ANAEROBIC_BASE_2", numValueOf, numValueOf2);
        d0 d0Var4 = new d0("LEVEL_3", 3, "HIGHLY_IMPROVING_ANAEROBIC_CAPACITY_AND_POWER_3", numValueOf, numValueOf2);
        Integer numValueOf3 = Integer.valueOf(R.string.workout_benefit_high_exertion_title);
        Integer numValueOf4 = Integer.valueOf(R.string.workout_benefit_high_exertion_desc);
        d0 d0Var5 = new d0("LEVEL_4", 4, "OVERREACHING_4", numValueOf3, numValueOf4);
        Integer numValueOf5 = Integer.valueOf(R.string.workout_benefit_maintaining_speed);
        Integer numValueOf6 = Integer.valueOf(R.string.workout_benefit_maintaining_speed_desc);
        d0 d0Var6 = new d0("LEVEL_5", 5, "MINOR_FAST_FORCE_BENEFIT_5", numValueOf5, numValueOf6);
        d0 d0Var7 = new d0("LEVEL_6", 6, "MAINTAINING_FAST_FORCE_PRODUCTION_6", numValueOf5, numValueOf6);
        d0 d0Var8 = new d0("LEVEL_7", 7, "MAINTAINING_ANAEROBIC_POWER_7", numValueOf, numValueOf2);
        d0 d0Var9 = new d0("LEVEL_8", 8, "IMPROVING_ANAEROBIC_CAPACITY_AND_POWER_8", numValueOf, numValueOf2);
        d0 d0Var10 = new d0("LEVEL_9", 9, "MINOR_FAST_FORCE_BENEFIT_9", numValueOf5, numValueOf6);
        d0 d0Var11 = new d0("LEVEL_10", 10, "MAINTAINING_ECONOMY_AND_ANAEROBIC_BASE_10", numValueOf, numValueOf2);
        d0 d0Var12 = new d0("LEVEL_11", 11, "IMPROVING_ECONOMY_AND_ANAEROBIC_BASE_11", numValueOf, numValueOf2);
        Integer numValueOf7 = Integer.valueOf(R.string.workout_benefit_improving_speed_title);
        Integer numValueOf8 = Integer.valueOf(R.string.workout_benefit_improving_speed_desc);
        d0[] d0VarArr = {d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9, d0Var10, d0Var11, d0Var12, new d0("LEVEL_12", 12, "IMPROVING_ANAEROBIC_CAPACITY_AND_SPEED_12", numValueOf7, numValueOf8), new d0("LEVEL_13", 13, "HIGHLY_IMPROVING_ANAEROBIC_CAPACITY_AND_SPEED_13", numValueOf7, numValueOf8), new d0("LEVEL_14", 14, "HIGHLY_IMPROVING_ECONOMY_AND_ANAEROBIC_BASE_14", numValueOf, numValueOf2), new d0("LEVEL_15", 15, "MINOR_ANAEROBIC_BENEFIT_15", numValueOf, numValueOf2), new d0("LEVEL_16", 16, "OVERREACHING_SPEED_16", numValueOf3, numValueOf4)};
        f147050e = d0VarArr;
        f147051f = new w13.c(d0VarArr);
        f147049d = new a(null);
    }

    private d0(String str, int i14, String str2, Integer num, Integer num2) {
        super(str, i14);
        this.f147052a = str2;
        this.f147053b = num;
        this.f147054c = num2;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f147050e.clone();
    }

    @Override // qs.e0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getF147053b() {
        return this.f147053b;
    }

    @Override // qs.e0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getF147054c() {
        return this.f147054c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/d0$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
