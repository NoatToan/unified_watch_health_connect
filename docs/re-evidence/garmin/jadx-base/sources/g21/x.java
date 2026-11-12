package g21;

import c22.c3;
import c22.g2;
import c22.x0;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 g21.x[], still in use, count: 1, list:
  (r0v1 g21.x[]) from 0x002d: CONSTRUCTOR (r0v1 g21.x[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg21/x;", "", "Lc22/c3;", "labelResId", "<init>", "(Ljava/lang/String;ILc22/c3;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x {
    MACROS(g2.b(x0.f23447he)),
    OTHER_NUTRIENTS(g2.b(x0.f23729ye));


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w13.c f75533e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f75534a;

    static {
        x0.f23314a.getClass();
        f75533e = new w13.c(xVarArr);
    }

    private x(c3 c3Var) {
        super(str, i);
        this.f75534a = c3Var;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f75532d.clone();
    }
}
