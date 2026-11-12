package j62;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 j62.b[], still in use, count: 1, list:
  (r0v1 j62.b[]) from 0x005e: CONSTRUCTOR (r0v1 j62.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lj62/b;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    STRENGTH("strength_training", R.string.lbl_strength),
    CARDIO("cardio_training", R.string.lbl_cardio),
    YOGA("yoga", R.string.activity_type_yoga),
    PILATES("pilates", R.string.activity_type_pilates),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILITY("mobility", R.string.lbl_mobility),
    /* JADX INFO: Fake field, exist only in values array */
    HIIT("hiit", R.string.lbl_hiit);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f97400c = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f97406i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97408b;

    static {
        f97406i = new w13.c(new b[]{r0, r1, r2, r3, new b("mobility", R.string.lbl_mobility), new b("hiit", R.string.lbl_hiit)});
    }

    private b(String str, int i14) {
        super(str, i);
        this.f97407a = str;
        this.f97408b = i14;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f97405h.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj62/b$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
