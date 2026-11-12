package q71;

import c22.c3;
import c22.i;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 q71.e[], still in use, count: 1, list:
  (r0v1 q71.e[]) from 0x004a: CONSTRUCTOR (r0v1 q71.e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lq71/e;", "", "", Action.KEY_ATTRIBUTE, "", "shortTitle", "Lc22/c3;", "longTitle", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILc22/c3;)V", "a", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {
    RUNNING("generic", R.string.lbl_vo2_max, i.b(R.string.lbl_vo2_max)),
    CYCLING("cycling", R.string.lbl_cycling, i.b(R.string.lbl_cycling_vo2_max)),
    ROWING("rowing", R.string.lbl_rowing, i.b(R.string.lbl_rowing_vo2_max));


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f143243g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f143244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f143245b;

    static {
        f143243g = new w13.c(eVarArr);
        new a(null);
    }

    private e(String str, int i14, c3 c3Var) {
        super(str, i);
        this.f143244a = i14;
        this.f143245b = c3Var;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f143242f.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq71/e$a;", "", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
