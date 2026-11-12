package p003ji0;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ji0.j[], still in use, count: 1, list:
  (r0v1 ji0.j[]) from 0x0022: CONSTRUCTOR (r0v1 ji0.j[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lji0/j;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;II)V", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {
    SEARCH(R.string.lbl_search),
    CONTACTS(R.string.contacts);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c f98790e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98791a;

    static {
        f98790e = new c(jVarArr);
    }

    private j(int i14) {
        super(str, i);
        this.f98791a = i14;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f98789d.clone();
    }
}
