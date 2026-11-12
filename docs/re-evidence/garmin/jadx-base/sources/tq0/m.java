package tq0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 tq0.m[], still in use, count: 1, list:
  (r0v1 tq0.m[]) from 0x006a: CONSTRUCTOR (r0v1 tq0.m[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ltq0/m;", "", "", "insightsActivityKey", "insightsPreferenceType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {
    RUNNING("RUNNING", "running"),
    SLEEP("SLEEP", "sleep"),
    STAIR_CLIMBING("FLOORS", "stair_climbing"),
    OPEN_WATER_SWIMMING("OPEN_WATER_SWIMMING", "open_water_swimming"),
    CYCLING("CYCLING", "cycling"),
    STEPS("STEPS", "steps"),
    LAP_SWIMMING("LAP_SWIMMING", "lap_swimming"),
    NONE("NONE", "none");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f166103c = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f166113m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f166115b;

    static {
        f166113m = new w13.c(new m[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    private m(String str, String str2) {
        super(str, i);
        this.f166114a = str;
        this.f166115b = str2;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f166112l.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltq0/m$a;", "", "<init>", "()V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(String str) {
            Object next;
            String str2;
            str.getClass();
            w13.c cVar = m.f166113m;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!s.g(((m) next).f166114a, str));
            m mVar = (m) next;
            return (mVar == null || (str2 = mVar.f166115b) == null) ? m.NONE.f166115b : str2;
        }

        private a() {
        }
    }
}
