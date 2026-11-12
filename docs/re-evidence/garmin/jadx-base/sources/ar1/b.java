package ar1;

import j23.e;
import j23.f;
import p005kotlin.Metadata;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ar1.b[], still in use, count: 1, list:
  (r0v1 ar1.b[]) from 0x0068: CONSTRUCTOR (r0v1 ar1.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lar1/b;", "", "Lj23/f;", "", "range", "<init>", "(Ljava/lang/String;ILj23/f;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    RANGE_1(new e(0.0f, 8.2f)),
    RANGE_2(new e(8.2f, 12.1f)),
    RANGE_3(new e(12.2f, 19.7f)),
    RANGE_4(new e(19.8f, 25.9f)),
    RANGE_5(new e(25.9f, 100.0f));


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c f12557h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f<Float> f12558a;

    static {
        f12557h = new c(bVarArr);
    }

    private b(f fVar) {
        super(str, i);
        this.f12558a = fVar;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f12556g.clone();
    }
}
