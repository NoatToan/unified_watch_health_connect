package ww1;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ww1.l[], still in use, count: 1, list:
  (r0v1 ww1.l[]) from 0x0068: CONSTRUCTOR (r0v1 ww1.l[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lww1/l;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {
    RUNNING_EVENT_BASED("GarminRunningCoachEventBased"),
    RUNNING_OPEN_LOOP("GarminRunningCoachOpenLoop"),
    CYCLING_EVENT_BASED("GarminCyclingCoachEventBased"),
    CYCLING_OPEN_LOOP("GarminCyclingCoachOpenLoop"),
    TRIATHLON_EVENT_BASED("GarminTriathlonCoachEventBased"),
    TRIATHLON_OPEN_LOOP("GarminTriathlonCoachOpenLoop"),
    FITNESS_OPEN_LOOP("GarminFitnessCoachOpenLoop"),
    FROG_OPEN_LOOP("GarminWalkCoachOpenLoop");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f187814b = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w13.c f187824l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187825a;

    static {
        f187824l = new w13.c(new l[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    private l(String str) {
        super(str, i);
        this.f187825a = str;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f187823k.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww1/l$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
