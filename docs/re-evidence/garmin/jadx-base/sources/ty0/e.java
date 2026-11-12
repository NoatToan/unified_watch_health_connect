package ty0;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ty0.e[], still in use, count: 1, list:
  (r0v1 ty0.e[]) from 0x003c: CONSTRUCTOR (r0v1 ty0.e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lty0/e;", "Lty0/j;", "", "", Action.KEY_ATTRIBUTE, "", "labelRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements j {
    FOLLOWER("FOLLOWER", R.string.concept_followers),
    FOLLOWING("FOLLOWING", R.string.lbl_following),
    SUGGESTED("SUGGESTED", R.string.common_suggested),
    DISCOVER("DISCOVER", R.string.concept_discover_friends);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f166953h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166955b;

    static {
        f166953h = new w13.c(eVarArr);
    }

    private e(String str, int i14) {
        super(str, i);
        this.f166954a = str;
        this.f166955b = i14;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f166952g.clone();
    }

    @Override // ty0.j
    public final String b(l22.b bVar) {
        return bVar.getString(this.f166955b);
    }

    @Override // ty0.j
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getF166954a() {
        return this.f166954a;
    }
}
