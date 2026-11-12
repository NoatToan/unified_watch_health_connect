package mx1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mx1.a[], still in use, count: 1, list:
  (r0v1 mx1.a[]) from 0x0094: CONSTRUCTOR (r0v1 mx1.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB?\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lmx1/a;", "", "", "liftTypeRes", "barbellExerciseNameRes", "dumbbellExerciseNameRes", "", "category", "barbellExerciseKey", "dumbbellExerciseKey", "<init>", "(Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    BENCH_PRESS(R.string.lbl_benchmark_type_bench_press, R.string.lbl_barbell_bench_press, R.string.lbl_dumbbell_bench_press, "BENCH_PRESS", "BARBELL_BENCH_PRESS", "DUMBBELL_BENCH_PRESS"),
    /* JADX INFO: Fake field, exist only in values array */
    OVERHEAD_PRESS(R.string.lbl_benchmark_type_overhead_press, R.string.lbl_barbell_overhead_press, R.string.lbl_dumbbell_overhead_press, "SHOULDER_PRESS", "OVERHEAD_BARBELL_PRESS", "OVERHEAD_DUMBBELL_PRESS"),
    /* JADX INFO: Fake field, exist only in values array */
    DEADLIFT(R.string.lbl_benchmark_type_deadlift, R.string.lbl_barbell_deadlift, R.string.lbl_dumbbell_deadlift, "DEADLIFT", "BARBELL_DEADLIFT", "DUMBBELL_DEADLIFT"),
    /* JADX INFO: Fake field, exist only in values array */
    BENT_OVER_ROW(R.string.lbl_benchmark_type_bent_over_row, R.string.lbl_barbell_row, R.string.lbl_dumbbell_row, "ROW", "BARBELL_ROW", "DUMBBELL_ROW"),
    /* JADX INFO: Fake field, exist only in values array */
    SQUAT(R.string.lbl_benchmark_type_squat, R.string.lbl_barbell_back_squat, R.string.lbl_dumbbell_squat, "SQUAT", "BARBELL_BACK_SQUAT", "DUMBBELL_SQUAT"),
    /* JADX INFO: Fake field, exist only in values array */
    BICEPS_CURL(R.string.lbl_benchmark_type_biceps_curl, R.string.lbl_benchmark_type_biceps_curl, R.string.lbl_benchmark_type_biceps_curl, "CURL", "BARBELL_BICEPS_CURL", "DUMBBELL_BICEPS_CURL");


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2299a f121347g = new C2299a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w13.c f121350j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f121351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f121353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f121354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f121355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f121356f;

    static {
        f121350j = new w13.c(new a[]{r0, new a(R.string.lbl_benchmark_type_overhead_press, R.string.lbl_barbell_overhead_press, R.string.lbl_dumbbell_overhead_press, "SHOULDER_PRESS", "OVERHEAD_BARBELL_PRESS", "OVERHEAD_DUMBBELL_PRESS"), new a(R.string.lbl_benchmark_type_deadlift, R.string.lbl_barbell_deadlift, R.string.lbl_dumbbell_deadlift, "DEADLIFT", "BARBELL_DEADLIFT", "DUMBBELL_DEADLIFT"), new a(R.string.lbl_benchmark_type_bent_over_row, R.string.lbl_barbell_row, R.string.lbl_dumbbell_row, "ROW", "BARBELL_ROW", "DUMBBELL_ROW"), new a(R.string.lbl_benchmark_type_squat, R.string.lbl_barbell_back_squat, R.string.lbl_dumbbell_squat, "SQUAT", "BARBELL_BACK_SQUAT", "DUMBBELL_SQUAT"), new a(R.string.lbl_benchmark_type_biceps_curl, R.string.lbl_benchmark_type_biceps_curl, R.string.lbl_benchmark_type_biceps_curl, "CURL", "BARBELL_BICEPS_CURL", "DUMBBELL_BICEPS_CURL")});
    }

    private a(int i14, int i15, int i16, String str, String str2, String str3) {
        super(str, i);
        this.f121351a = i14;
        this.f121352b = i15;
        this.f121353c = i16;
        this.f121354d = str;
        this.f121355e = str2;
        this.f121356f = str3;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f121349i.clone();
    }

    /* JADX INFO: renamed from: mx1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmx1/a$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2299a {
        public /* synthetic */ C2299a(j jVar) {
            this();
        }

        public static a a(String str) {
            Object next;
            w13.c cVar = a.f121350j;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((a) next).f121354d, str)) {
                    return (a) next;
                }
            }
            next = null;
            return (a) next;
        }

        public static a b(String str) {
            Object next;
            w13.c cVar = a.f121350j;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                a aVar = (a) next;
                if (s.g(aVar.f121355e, str) || s.g(aVar.f121356f, str)) {
                    return (a) next;
                }
            }
            next = null;
            return (a) next;
        }

        private C2299a() {
        }
    }
}
