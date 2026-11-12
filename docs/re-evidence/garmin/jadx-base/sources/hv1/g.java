package hv1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 hv1.g[], still in use, count: 1, list:
  (r0v1 hv1.g[]) from 0x0078: CONSTRUCTOR (r0v1 hv1.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lhv1/g;", "", "", "resourceID", "phraseResourceID", "<init>", "(Ljava/lang/String;III)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {
    /* JADX INFO: Fake field, exist only in values array */
    TRANSITION(R.string.plan_phase_preparation, R.string.plan_phase_transition_description),
    /* JADX INFO: Fake field, exist only in values array */
    BASE(R.string.itp_base_phase, R.string.itp_base_phase_description),
    /* JADX INFO: Fake field, exist only in values array */
    BUILD(R.string.itp_build_phase, R.string.plan_phase_build_description),
    /* JADX INFO: Fake field, exist only in values array */
    PEAK(R.string.itp_peak_phase, R.string.plan_phase_peak_description),
    /* JADX INFO: Fake field, exist only in values array */
    TAPER(R.string.plan_phase_taper, R.string.plan_phase_taper_description),
    /* JADX INFO: Fake field, exist only in values array */
    RECOVERY(R.string.activities_training_effect_recovery, R.string.plan_phase_recovery_description),
    /* JADX INFO: Fake field, exist only in values array */
    RACE(R.string.plan_phase_race_season, R.string.plan_phase_race_season_description),
    /* JADX INFO: Fake field, exist only in values array */
    TARGET_EVENT_DAY(R.string.plan_phase_target_event_day, R.string.plan_phase_target_event_day_description);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f85858c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w13.c f85860e = new w13.c(new g[]{new g(R.string.plan_phase_preparation, R.string.plan_phase_transition_description), new g(R.string.itp_base_phase, R.string.itp_base_phase_description), new g(R.string.itp_build_phase, R.string.plan_phase_build_description), new g(R.string.itp_peak_phase, R.string.plan_phase_peak_description), new g(R.string.plan_phase_taper, R.string.plan_phase_taper_description), new g(R.string.activities_training_effect_recovery, R.string.plan_phase_recovery_description), new g(R.string.plan_phase_race_season, R.string.plan_phase_race_season_description), new g(R.string.plan_phase_target_event_day, R.string.plan_phase_target_event_day_description)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85862b;

    static {
    }

    private g(int i14, int i15) {
        super(str, i);
        this.f85861a = i14;
        this.f85862b = i15;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f85859d.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhv1/g$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static g a(String str) {
            Object next;
            w13.c cVar = g.f85860e;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((g) next).toString(), str)) {
                    return (g) next;
                }
            }
            next = null;
            return (g) next;
        }

        private a() {
        }
    }
}
