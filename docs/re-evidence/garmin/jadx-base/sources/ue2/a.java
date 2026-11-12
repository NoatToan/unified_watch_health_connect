package ue2;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 ue2.a[], still in use, count: 1, list:
  (r0v3 ue2.a[]) from 0x00b0: CONSTRUCTOR (r0v3 ue2.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lue2/a;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {
    NO_ERROR(0),
    API_NOT_AVAILABLE(-1),
    PLAY_STORE_NOT_FOUND(-2),
    NETWORK_ERROR(-3),
    PLAY_SERVICES_NOT_FOUND(-4),
    CANNOT_BIND_TO_SERVICE(-5),
    PLAY_STORE_VERSION_OUTDATED(-6),
    PLAY_SERVICES_VERSION_OUTDATED(-7),
    CLIENT_TRANSIENT_ERROR(-8),
    APP_NOT_OWNED(-9),
    SDK_VERSION_OUTDATED(-10),
    INTERNAL_ERROR(-100),
    VERIFICATION_REQUIRED(900),
    APP_DOES_NOT_SUPPORT_AGE_RANGE(901);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ w13.c f170258q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f170259a;

    static {
        f170258q = new w13.c(aVarArr);
    }

    private a(int i14) {
        super(str, i);
        this.f170259a = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f170257p.clone();
    }
}
