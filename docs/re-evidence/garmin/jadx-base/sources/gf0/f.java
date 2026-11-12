package gf0;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gf0.f[], still in use, count: 1, list:
  (r0v1 gf0.f[]) from 0x0054: CONSTRUCTOR (r0v1 gf0.f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgf0/f;", "", "", "", "rhythmClassificationKeys", "<init>", "(Ljava/lang/String;I[Ljava/lang/String;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    /* JADX INFO: Fake field, exist only in values array */
    SINUS_RHYTHM("SINUS_NORMAL"),
    /* JADX INFO: Fake field, exist only in values array */
    ATRIAL_FIBRILLATION("AFIB"),
    /* JADX INFO: Fake field, exist only in values array */
    HR_TOO_HIGH("INCONCLUSIVE_HR_OVER_120_50"),
    /* JADX INFO: Fake field, exist only in values array */
    HR_TOO_LOW("INCONCLUSIVE_HR_UNDER_50"),
    /* JADX INFO: Fake field, exist only in values array */
    INCONCLUSIVE("INCONCLUSIVE_POOR_SIGNAL", "INCONCLUSIVE_SR_WITH_HR_100_TO_120", "INCONCLUSIVE_OTHER", "INVALID");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w13.c f77062c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f77063a;

    static {
        f77062c = new w13.c(fVarArr);
    }

    private f(String... strArr) {
        super(str, i);
        this.f77063a = strArr;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f77061b.clone();
    }
}
