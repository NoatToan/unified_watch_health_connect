package g21;

import c22.c3;
import c22.g2;
import c22.x0;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 g21.r[], still in use, count: 1, list:
  (r0v1 g21.r[]) from 0x008b: CONSTRUCTOR (r0v1 g21.r[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg21/r;", "", "", Action.KEY_ATTRIBUTE, "Lc22/c3;", "surplusLegendResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lc22/c3;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {
    FIBER("fiber", g2.b(x0.Zd)),
    ADDED_SUGARS("addedSugars", g2.b(x0.Bd)),
    SATURATED_FAT("saturatedFat", g2.b(x0.Fe)),
    IRON("iron", g2.b(x0.f23381de)),
    VITAMIN_A("vitaminA", g2.b(x0.Se)),
    VITAMIN_D("vitaminD", g2.b(x0.Te)),
    CALCIUM("calcium", g2.b(x0.Hd));


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f75490k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f75492b;

    static {
        x0.f23314a.getClass();
        f75490k = new w13.c(rVarArr);
    }

    private r(String str, c3 c3Var) {
        super(str, i);
        this.f75491a = str;
        this.f75492b = c3Var;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f75489j.clone();
    }
}
