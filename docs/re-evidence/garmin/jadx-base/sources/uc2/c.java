package uc2;

import java.util.List;
import p005kotlin.Metadata;
import p13.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 uc2.c[], still in use, count: 1, list:
  (r0v1 uc2.c[]) from 0x0036: CONSTRUCTOR (r0v1 uc2.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luc2/c;", "", "", "", "hostKeywords", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {
    DI(x.k("connectapi", "diauth")),
    IT(x.k("sso", "security.services.garmin", "customer.services.garmin"));


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w13.c f170008e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f170009a;

    static {
        f170008e = new w13.c(cVarArr);
    }

    private c(List list) {
        super(str, i);
        this.f170009a = list;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f170007d.clone();
    }
}
