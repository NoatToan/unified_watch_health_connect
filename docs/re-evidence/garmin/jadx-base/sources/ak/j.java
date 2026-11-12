package ak;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 ak.j, still in use, count: 1, list:
  (r10v2 ak.j) from 0x006b: SPUT (r10v2 ak.j) ak.j.g ak.j
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
public final class j {
    DISABLED(0),
    TWO_AND_A_HALF_SECONDS(1),
    FIVE_SECONDS(2),
    SEVEN_AND_A_HALF_SECONDS(3),
    TEN_SECONDS(4),
    /* JADX INFO: Fake field, exist only in values array */
    TWELVE_AND_A_HALF_SECONDS(5),
    /* JADX INFO: Fake field, exist only in values array */
    FIFTEEN_SECONDS(6),
    /* JADX INFO: Fake field, exist only in values array */
    SEVENTEEN_AND_A_HALF_SECONDS(7),
    /* JADX INFO: Fake field, exist only in values array */
    TWENTY_SECONDS(8),
    /* JADX INFO: Fake field, exist only in values array */
    TWENTY_TWO_AND_A_HALF_SECONDS(9),
    /* JADX INFO: Fake field, exist only in values array */
    TWENTY_FIVE_SECONDS(10);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f3553g = new j(10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j[] f3554h = values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3556a;

    static {
    }

    private j(int i14) {
        super(str, i);
        this.f3556a = i14;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f3555i.clone();
    }
}
