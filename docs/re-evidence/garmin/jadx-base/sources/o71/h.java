package o71;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.b0;
import p005kotlin.jvm.internal.i0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o71.h[], still in use, count: 1, list:
  (r0v1 o71.h[]) from 0x0044: CONSTRUCTOR (r0v1 o71.h[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BE\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo71/h;", "", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/performance/dto/d;", "", "getValue", "Lo71/b;", "getStrengthActivityValue", "", "textRes", "totalsRes", "<init>", "(Ljava/lang/String;ILe23/l;Le23/l;II)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {
    VOLUME(new i0() { // from class: o71.h.a
        @Override // p005kotlin.jvm.internal.i0, k23.n
        public final Object get(Object obj) {
            return Double.valueOf(((com.garmin.android.apps.connectmobile.performance.dto.d) obj).a());
        }
    }, new b0() { // from class: o71.h.b
        @Override // p005kotlin.jvm.internal.b0, k23.n
        public final Object get(Object obj) {
            return Double.valueOf(((o71.b) obj).f130158d);
        }

        @Override // p005kotlin.jvm.internal.b0, k23.j
        public final void p(Object obj, Object obj2) {
            ((o71.b) obj).f130158d = ((Number) obj2).doubleValue();
        }
    }, R.string.strength_training_volume, R.string.lbl_volume_totals),
    REPS(new i0() { // from class: o71.h.c
        @Override // p005kotlin.jvm.internal.i0, k23.n
        public final Object get(Object obj) {
            return Integer.valueOf(((com.garmin.android.apps.connectmobile.performance.dto.d) obj).getTotalReps());
        }
    }, new b0() { // from class: o71.h.d
        @Override // p005kotlin.jvm.internal.b0, k23.n
        public final Object get(Object obj) {
            return Integer.valueOf(((o71.b) obj).f130159e);
        }

        @Override // p005kotlin.jvm.internal.b0, k23.j
        public final void p(Object obj, Object obj2) {
            ((o71.b) obj).f130159e = ((Number) obj2).intValue();
        }
    }, R.string.strength_training_reps, R.string.lbl_rep_totals),
    SETS(new i0() { // from class: o71.h.e
        @Override // p005kotlin.jvm.internal.i0, k23.n
        public final Object get(Object obj) {
            return Integer.valueOf(((com.garmin.android.apps.connectmobile.performance.dto.d) obj).getTotalSets());
        }
    }, new b0() { // from class: o71.h.f
        @Override // p005kotlin.jvm.internal.b0, k23.n
        public final Object get(Object obj) {
            return Integer.valueOf(((o71.b) obj).f130160f);
        }

        @Override // p005kotlin.jvm.internal.b0, k23.j
        public final void p(Object obj, Object obj2) {
            ((o71.b) obj).f130160f = ((Number) obj2).intValue();
        }
    }, R.string.strength_training_sets, R.string.lbl_set_totals);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f130226i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<com.garmin.android.apps.connectmobile.performance.dto.d, Number> f130227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<o71.b, Number> f130228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f130229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f130230d;

    static {
        f130226i = new w13.c(hVarArr);
    }

    private h(e23.l lVar, e23.l lVar2, int i14, int i15) {
        super(str, i);
        this.f130227a = lVar;
        this.f130228b = lVar2;
        this.f130229c = i14;
        this.f130230d = i15;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f130225h.clone();
    }
}
