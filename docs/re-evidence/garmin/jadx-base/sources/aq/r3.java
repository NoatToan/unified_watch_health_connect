package aq;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 aq.r3[], still in use, count: 1, list:
  (r0v1 aq.r3[]) from 0x00c2: CONSTRUCTOR (r0v1 aq.r3[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Laq/r3;", "", "", TtmlNode.ATTR_ID, "", "", "names", "<init>", "(Ljava/lang/String;II[Ljava/lang/String;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r3 {
    POWER(0, new String[]{"POWER", "POWER_3S", "POWER_10S", "POWER_30S", "POWER_LAP", "POWER_CURVE", "OPEN"}),
    SPEED(1, new String[]{"SPEED", "SPEED_LAP", "OPEN"}),
    PACE(2, new String[]{"SPEED", "SPEED_LAP", "OPEN"}),
    CADENCE(3, new String[]{"CADENCE", "OPEN"}),
    HEART_RATE(4, new String[]{"HEART_RATE", "OPEN"}),
    STAMINA(5, new String[]{"STAMINA", "STAMINA_POTENTIAL", "OPEN"}),
    POWER_PER_KG(6, new String[]{"POWER", "POWER_3S", "POWER_10S", "POWER_30S", "POWER_LAP", "OPEN"}),
    SPLIT_AVG_POWER(7, new String[]{"POWER", "POWER_3S", "POWER_10S", "POWER_30S", "POWER_LAP", "OPEN"}),
    SPLIT_AVG_POWER_PER_KG(8, new String[]{"POWER", "POWER_3S", "POWER_10S", "POWER_30S", "POWER_LAP", "OPEN"});


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12178c = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w13.c f12189n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f12191b;

    static {
        f12189n = new w13.c(new r3[]{r0, r1, r2, r3, r4, r5, r6, r7, r8});
    }

    private r3(int i14, String[] strArr) {
        super(str, i);
        this.f12190a = i14;
        this.f12191b = strArr;
    }

    public static r3 valueOf(String str) {
        return (r3) Enum.valueOf(r3.class, str);
    }

    public static r3[] values() {
        return (r3[]) f12188m.clone();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Laq/r3$a;", "", "<init>", "()V", "", "PACE_BOTTOM_VALUE", "J", "", "NEGATIVE_BOTTOM_VALUE", "F", "", "OPEN_TARGET_TYPE", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
