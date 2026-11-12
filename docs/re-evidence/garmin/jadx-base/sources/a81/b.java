package a81;

import am.x0;
import c22.c3;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a81.b[], still in use, count: 1, list:
  (r0v1 a81.b[]) from 0x00d5: CONSTRUCTOR (r0v1 a81.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"La81/b;", "", "", Action.KEY_ATTRIBUTE, "Lam/x0;", "activityType", "Lc22/c3;", "labelResourceId", "abbrevLabelResourceId", "<init>", "(Ljava/lang/String;IILam/x0;Lc22/c3;Lc22/c3;)V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    /* JADX INFO: Fake field, exist only in values array */
    RUN(0, x0.f4308n, c22.i.b(R.string.lbl_activity_group_run), null, 8, null),
    /* JADX INFO: Fake field, exist only in values array */
    BIKE(1, x0.f4312o, c22.i.b(R.string.lbl_activity_group_cycling), null, 8, null),
    /* JADX INFO: Fake field, exist only in values array */
    SNOWBOARD(2, x0.X1, c22.i.b(R.string.lbl_activity_group_snowboard), null, 8, null),
    /* JADX INFO: Fake field, exist only in values array */
    SKI(3, x0.W1, c22.i.b(R.string.lbl_activity_group_ski), null, 8, null),
    /* JADX INFO: Fake field, exist only in values array */
    SAIL(4, x0.T2, c22.i.b(R.string.lbl_activity_group_sailing), null, 8, null),
    /* JADX INFO: Fake field, exist only in values array */
    ROW(5, x0.S2, c22.i.b(R.string.lbl_activity_group_rowing), null, 8, null),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM(6, x0.f4324r, c22.i.b(R.string.lbl_activity_group_swim), null, 8, null),
    /* JADX INFO: Fake field, exist only in values array */
    CLIMB(7, x0.f4352y2, c22.i.b(R.string.lbl_activity_group_climb), null, 8, null),
    OTHER(8, x0.f4346x, c22.i.b(R.string.lbl_miscellaneous_activities), c22.i.b(R.string.lbl_other));


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1945e = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f1948h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f1950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f1951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3 f1952d;

    static {
        f1948h = new w13.c(new b[]{r0, r1, r2, r3, r4, r5, r6, r7, r8});
    }

    public /* synthetic */ b(int i14, x0 x0Var, c3 c3Var, c3 c3Var2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, x0Var, c3Var, (i15 & 8) != 0 ? null : c3Var2);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1947g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La81/b$a;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a(int i14) {
            Object next;
            w13.c cVar = b.f1948h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (((b) next).f1949a == i14) {
                    return (b) next;
                }
            }
            next = null;
            return (b) next;
        }

        private a() {
        }
    }

    private b(int i14, x0 x0Var, c3 c3Var, c3 c3Var2) {
        super(str, i);
        this.f1949a = i14;
        this.f1950b = x0Var;
        this.f1951c = c3Var;
        this.f1952d = c3Var2;
    }
}
