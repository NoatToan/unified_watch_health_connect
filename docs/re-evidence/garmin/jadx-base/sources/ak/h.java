package ak;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 ak.h, still in use, count: 1, list:
  (r2v2 ak.h) from 0x0020: SPUT (r2v2 ak.h) ak.h.c ak.h
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
public final class h {
    DISABLED(0),
    /* JADX INFO: Fake field, exist only in values array */
    TWO_AND_A_HALF_SECONDS(1),
    /* JADX INFO: Fake field, exist only in values array */
    FIVE_SECONDS(2);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f3535c = new h(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h[] f3536d = values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3538a;

    static {
    }

    private h(int i14) {
        super(str, i);
        this.f3538a = i14;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f3537e.clone();
    }
}
