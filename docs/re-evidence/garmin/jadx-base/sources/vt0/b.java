package vt0;

import am.x0;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 vt0.b[], still in use, count: 1, list:
  (r0v1 vt0.b[]) from 0x006e: CONSTRUCTOR (r0v1 vt0.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB%\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lvt0/b;", "", "", "nameResId", "metricId", "Lam/x0;", "activityType", "<init>", "(Ljava/lang/String;IIILam/x0;)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    STEPS(R.string.leaderboard_menu_item_steps, 29, x0.B),
    RUNNING(R.string.leaderboard_menu_item_running, 17, x0.f4308n),
    CYCLING(R.string.leaderboard_menu_item_cycling, 17, x0.f4312o),
    SWIMMING(R.string.leaderboard_menu_item_swimming, 17, x0.f4324r),
    PUSH(R.string.lbl_pushes, 87, x0.f4271b3),
    PARASPORTS(R.string.activity_type_parasports, 17, x0.f4268a3);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f180050d = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w13.c f180058l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f180059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f180061c;

    static {
        f180058l = new w13.c(new b[]{r0, r1, r2, r3, r4, r5});
    }

    private b(int i14, int i15, x0 x0Var) {
        super(str, i);
        this.f180059a = i14;
        this.f180060b = i15;
        this.f180061c = x0Var;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f180057k.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvt0/b$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: vt0.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3359a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f180062a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.STEPS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.PUSH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.RUNNING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.CYCLING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.PARASPORTS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[b.SWIMMING.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f180062a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
