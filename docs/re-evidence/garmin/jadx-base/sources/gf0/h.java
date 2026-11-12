package gf0;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gf0.h[], still in use, count: 1, list:
  (r0v1 gf0.h[]) from 0x0062: CONSTRUCTOR (r0v1 gf0.h[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgf0/h;", "", "", "symptomKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {
    /* JADX INFO: Fake field, exist only in values array */
    RAPID_HEARTBEAT("RAPID_HEARTBEAT"),
    /* JADX INFO: Fake field, exist only in values array */
    SKIPPED_HEARTBEAT("SKIPPED_HEARTBEAT"),
    /* JADX INFO: Fake field, exist only in values array */
    FATIGUE("FATIGUE"),
    /* JADX INFO: Fake field, exist only in values array */
    SHORTNESS_OF_BREATH("SHORTNESS_OF_BREATH"),
    /* JADX INFO: Fake field, exist only in values array */
    CHEST_TIGHTNESS_OR_PAIN("CHEST_TIGHTNESS"),
    /* JADX INFO: Fake field, exist only in values array */
    FAINTING("FAINTING"),
    /* JADX INFO: Fake field, exist only in values array */
    DIZZINESS("DIZZINESS"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER("OTHER"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NO_SYMPTOMS"),
    NO_SYMPTOMS_LOGGED("NO_SELECTION");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w13.c f77071d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77072a;

    static {
        f77071d = new w13.c(hVarArr);
    }

    private h(String str) {
        super(str, i);
        this.f77072a = str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f77070c.clone();
    }
}
