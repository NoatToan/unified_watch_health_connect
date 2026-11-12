package x52;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import m52.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 x52.e[], still in use, count: 1, list:
  (r0v1 x52.e[]) from 0x0079: CONSTRUCTOR (r0v1 x52.e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lx52/e;", "", "", "stepTypeNameRes", "colorRes", "<init>", "(Ljava/lang/String;III)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {
    /* JADX INFO: Fake field, exist only in values array */
    WARM_UP(R.string.workout_step_type_warmup, R.color.gcm3_workout_warmup),
    INTERVAL(R.string.workout_step_type_interval, R.color.gcm3_workout_run_bike_go),
    /* JADX INFO: Fake field, exist only in values array */
    RECOVERY(R.string.workout_step_type_recover, R.color.gcm3_workout_recover),
    /* JADX INFO: Fake field, exist only in values array */
    REST(R.string.workout_step_type_rest, R.color.gcm3_workout_rest),
    /* JADX INFO: Fake field, exist only in values array */
    COOL_DOWN(R.string.workout_step_type_cooldown, R.color.gcm3_workout_cooldown),
    OTHER(R.string.workout_step_type_other, R.color.gcm3_workout_other),
    /* JADX INFO: Fake field, exist only in values array */
    MAIN(R.string.workout_step_type_main, R.color.gcm3_workout_run_bike_go),
    /* JADX INFO: Fake field, exist only in values array */
    WALK(R.string.activity_options_walk_title, R.color.gcm3_workout_recover);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f189070c = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f189074g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f189075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f189076b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f189077a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f116755o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f116754n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.f116758r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.f116763y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.f116759t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.f116760v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k.f116764z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k.f116762x.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k.f116761w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k.f116757q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[k.f116756p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[k.B.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f189077a = iArr;
        }
    }

    static {
        f189074g = new w13.c(new e[]{r0, r1, r2, r3, r4, r5, new e(R.string.workout_step_type_main, R.color.gcm3_workout_run_bike_go), new e(R.string.activity_options_walk_title, R.color.gcm3_workout_recover)});
    }

    private e(int i14, int i15) {
        super(str, i);
        this.f189075a = i14;
        this.f189076b = i15;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f189073f.clone();
    }

    public final int a(k kVar) {
        if (this != INTERVAL) {
            return this.f189075a;
        }
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zL0 = k1.f37122a.l0();
        switch (kVar == null ? -1 : b.f189077a[kVar.ordinal()]) {
            case 1:
                return zL0 ? R.string.activity_type_handcycling : R.string.lbl_bike;
            case 2:
                return zL0 ? R.string.activity_type_push_run_speed_v2 : R.string.lbl_run;
            case 3:
                return R.string.lbl_swim;
            case 4:
                return R.string.lbl_workout;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return R.string.title_exercise;
            case 10:
                return R.string.activity_options_walk_title;
            case 11:
            default:
                return R.string.lbl_go;
            case 12:
                return R.string.lbl_rucking;
        }
    }

    public final String b(Context context, k kVar) {
        context.getClass();
        String string = context.getString(a(kVar));
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx52/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static e a(m52.d dVar) {
            w13.c cVar = e.f189074g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                e eVar = (e) bVarN.next();
                if (s.g(eVar.name(), dVar != null ? dVar.name() : null)) {
                    return eVar;
                }
            }
            i2.f36769a.getClass();
            i2.a.f(a2.WORKOUTS, "LocalStepType", "Unhandled step type [" + dVar + "]!");
            return e.OTHER;
        }

        private a() {
        }
    }
}
