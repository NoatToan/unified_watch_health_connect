package fx1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 fx1.d[], still in use, count: 1, list:
  (r0v3 fx1.d[]) from 0x008f: CONSTRUCTOR (r0v3 fx1.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lfx1/d;", "", "", "typeId", "", "jsonString", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {
    GENERIC(1, "Generic"),
    /* JADX INFO: Fake field, exist only in values array */
    SPEED(2, "Speed"),
    /* JADX INFO: Fake field, exist only in values array */
    PACE(3, "Pace"),
    HEART_RATE(4, "HeartRate"),
    /* JADX INFO: Fake field, exist only in values array */
    TIME(5, "Time"),
    /* JADX INFO: Fake field, exist only in values array */
    DISTANCE(6, "Distance"),
    /* JADX INFO: Fake field, exist only in values array */
    POWER(7, "Power"),
    /* JADX INFO: Fake field, exist only in values array */
    REP_3(8, "REP_3"),
    /* JADX INFO: Fake field, exist only in values array */
    REP_5(9, "REP_5"),
    /* JADX INFO: Fake field, exist only in values array */
    REP_8(10, "REP_8"),
    /* JADX INFO: Fake field, exist only in values array */
    REP_10(11, "REP_10"),
    /* JADX INFO: Fake field, exist only in values array */
    REP_15(12, "REP_15"),
    /* JADX INFO: Fake field, exist only in values array */
    AUTO(13, "Auto");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f73833c = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f73837g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73839b;

    static {
        f73837g = new w13.c(new d[]{r0, r1, r2, r3, new d(5, "Time"), new d(6, "Distance"), new d(7, "Power"), new d(8, "REP_3"), new d(9, "REP_5"), new d(10, "REP_8"), new d(11, "REP_10"), new d(12, "REP_15"), new d(13, "Auto")});
    }

    private d(int i14, String str) {
        super(str, i);
        this.f73838a = i14;
        this.f73839b = str;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f73836f.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfx1/d$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
