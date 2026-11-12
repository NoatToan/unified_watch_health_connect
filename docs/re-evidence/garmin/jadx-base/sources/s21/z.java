package s21;

import b21.l4;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 s21.z[], still in use, count: 1, list:
  (r0v1 s21.z[]) from 0x00b2: CONSTRUCTOR (r0v1 s21.z[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ls21/z;", "", "Lb21/l4;", "route", "", "progressBarStepIndicator", "<init>", "(Ljava/lang/String;ILb21/l4;D)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z {
    Genesis(l4.m0.INSTANCE, 0.0d),
    StorageAndProcessing(l4.k0.INSTANCE, 0.0d),
    DisconnectMFP(l4.l0.INSTANCE, 0.0d),
    Location(new l4.o0(false, (l01.k) null, 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0)), 0.0d),
    Goal(l4.n0.INSTANCE, 0.0d),
    PersonalDetails(l4.q0.INSTANCE, 1.0d),
    Weight(l4.t0.INSTANCE, 1.5d),
    Recommendation(l4.r0.INSTANCE, 2.5d),
    MealSettings(l4.p0.INSTANCE, 3.0d),
    ReviewPlan(l4.s0.INSTANCE, 0.0d),
    CompletePlan(new l4.j0((l01.k) (0 == true ? 1 : 0), 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0)), 0.0d);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f156209c = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w13.c f156222p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4 f156223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f156224b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        f156222p = new w13.c(new z[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10});
    }

    private z(l4 l4Var, double d14) {
        super(str, i);
        this.f156223a = l4Var;
        this.f156224b = d14;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f156221o.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls21/z$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
