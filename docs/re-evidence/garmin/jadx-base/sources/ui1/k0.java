package ui1;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ui1.k0[], still in use, count: 1, list:
  (r0v1 ui1.k0[]) from 0x0064: CONSTRUCTOR (r0v1 ui1.k0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lui1/k0;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 {
    WRSLTE_MONTHLY_P("WRSLTE_MONTHLY_P"),
    WRSLTE_ANNUAL_P("WRSLTE_ANNUAL_P"),
    INREACH_ENABLED("010-D2237-SU"),
    INREACH_ESSENTIAL("010-D2238-SU"),
    INREACH_STANDARD("010-D2239-SU"),
    INREACH_PREMIUM("010-D2240-SU"),
    INREACH_SUSPENDED_WITH_SOS("010-13011-SU"),
    INREACH_SUSPENDED("010-D2291-SU");


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f171312k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171313a;

    static {
        f171312k = new w13.c(k0VarArr);
    }

    private k0(String str) {
        super(str, i);
        this.f171313a = str;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f171311j.clone();
    }
}
