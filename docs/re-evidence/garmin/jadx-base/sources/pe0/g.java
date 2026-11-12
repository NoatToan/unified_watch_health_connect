package pe0;

import c22.c3;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pe0.g[], still in use, count: 1, list:
  (r0v1 pe0.g[]) from 0x0050: CONSTRUCTOR (r0v1 pe0.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpe0/g;", "", "Lc22/c3;", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;ILc22/c3;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {
    MOST_RECENT(c22.i.b(R.string.review_sort_option_most_recent)),
    LEAST_RECENT(g2.b(x0.D8)),
    A_TO_Z(c22.i.b(R.string.a_to_z)),
    Z_TO_A(c22.i.b(R.string.z_to_a));


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f137439g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f137440a;

    static {
        x0.f23314a.getClass();
        f137439g = new w13.c(gVarArr);
    }

    private g(c3 c3Var) {
        super(str, i);
        this.f137440a = c3Var;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f137438f.clone();
    }
}
