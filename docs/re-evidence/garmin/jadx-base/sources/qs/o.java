package qs;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qs.o[], still in use, count: 1, list:
  (r0v1 qs.o[]) from 0x0044: CONSTRUCTOR (r0v1 qs.o[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqs/o;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {
    ROWER_FITNESS_EQUIPMENT("ROWER_FITNESS_EQUIPMENT"),
    STAIR_CLIMBER_FITNESS_EQUIPMENT("STAIR_CLIMBER_FITNESS_EQUIPMENT"),
    STEP_CLIMBER_FITNESS_EQUIPMENT("STEP_CLIMBER_FITNESS_EQUIPMENT"),
    CROSS_TRAINER_FITNESS_EQUIPMENT("CROSS_TRAINER_FITNESS_EQUIPMENT"),
    TREADMILL_FITNESS_EQUIPMENT("TREADMILL_FITNESS_EQUIPMENT"),
    INDOOR_BIKE_FITNESS_EQUIPMENT("INDOOR_BIKE_FITNESS_EQUIPMENT");


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f147136i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147137a;

    static {
        f147136i = new w13.c(oVarArr);
    }

    private o(String str) {
        super(str, i);
        this.f147137a = str;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f147135h.clone();
    }
}
