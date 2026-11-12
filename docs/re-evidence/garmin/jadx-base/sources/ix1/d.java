package ix1;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v17 ix1.d[], still in use, count: 1, list:
  (r0v17 ix1.d[]) from 0x00a7: CONSTRUCTOR (r0v17 ix1.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lix1/d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {
    /* JADX INFO: Fake field, exist only in values array */
    BARBELL_BICEPS_CURL,
    /* JADX INFO: Fake field, exist only in values array */
    BARBELL_HIP_THRUST_WITH_BENCH,
    /* JADX INFO: Fake field, exist only in values array */
    BARBELL_SHRUG,
    /* JADX INFO: Fake field, exist only in values array */
    BARBELL_SNATCH,
    /* JADX INFO: Fake field, exist only in values array */
    BARBELL_BENCH_PRESS,
    /* JADX INFO: Fake field, exist only in values array */
    STANDING_BARBELL_CALF_RAISE,
    /* JADX INFO: Fake field, exist only in values array */
    CLEAN,
    /* JADX INFO: Fake field, exist only in values array */
    BARBELL_DEADLIFT,
    /* JADX INFO: Fake field, exist only in values array */
    OVERHEAD_BARBELL_PRESS,
    /* JADX INFO: Fake field, exist only in values array */
    BARBELL_ROW,
    /* JADX INFO: Fake field, exist only in values array */
    BARBELL_BACK_SQUAT,
    /* JADX INFO: Fake field, exist only in values array */
    DUMBBELL_SQUAT,
    /* JADX INFO: Fake field, exist only in values array */
    DUMBBELL_BENCH_PRESS,
    /* JADX INFO: Fake field, exist only in values array */
    DUMBBELL_DEADLIFT,
    /* JADX INFO: Fake field, exist only in values array */
    OVERHEAD_DUMBBELL_PRESS,
    /* JADX INFO: Fake field, exist only in values array */
    DUMBBELL_ROW,
    /* JADX INFO: Fake field, exist only in values array */
    DUMBBELL_BICEPS_CURL;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f95717a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w13.c f95719c = new w13.c(new d[]{new d(), new d(), new d(), new d(), new d(), new d(), new d(), new d(), new d(), new d(), new d(), new d(), new d(), new d(), new d(), new d(), new d()});

    static {
    }

    private d() {
        super(str, i);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f95718b.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lix1/d$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
