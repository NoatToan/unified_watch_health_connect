package j90;

import com.garmin.android.apps.connectmobile.R;
import d53.u;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 j90.a[], still in use, count: 1, list:
  (r0v1 j90.a[]) from 0x01a5: CONSTRUCTOR (r0v1 j90.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lj90/a;", "", "", "sport", "subSport", "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    WALKING("WALKING", "GENERIC", R.string.activity_options_walk_title),
    /* JADX INFO: Fake field, exist only in values array */
    WALKING_INDOOR("WALKING", "INDOOR_WALKING", R.string.lbl_walk_indoor),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING("RUNNING", "GENERIC", R.string.lbl_run),
    /* JADX INFO: Fake field, exist only in values array */
    CYCLING("CYCLING", "GENERIC", R.string.activity_options_bike_title),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_TREADMILL("RUNNING", "TREADMILL", R.string.lbl_treadmill),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_INDOOR("RUNNING", "INDOOR_RUNNING", R.string.lbl_indoor_track),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_TRAINING("TRAINING", "STRENGTH_TRAINING", R.string.lbl_strength),
    /* JADX INFO: Fake field, exist only in values array */
    CARDIO_TRAINING("TRAINING", "CARDIO_TRAINING", R.string.lbl_cardio),
    /* JADX INFO: Fake field, exist only in values array */
    ELLIPTICAL("FITNESS_EQUIPMENT", "ELLIPTICAL", R.string.lbl_elliptical),
    /* JADX INFO: Fake field, exist only in values array */
    SWIMMING("SWIMMING", "LAP_SWIMMING", R.string.workout_pool_swim),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_WATER_SWIMMING("SWIMMING", "OPEN_WATER", R.string.lbl_open_water_swim),
    /* JADX INFO: Fake field, exist only in values array */
    STAIR_CLIMBING("FITNESS_EQUIPMENT", "STAIR_CLIMBING", R.string.lbl_stair_climbing),
    /* JADX INFO: Fake field, exist only in values array */
    YOGA("TRAINING", "YOGA", R.string.activity_type_yoga),
    /* JADX INFO: Fake field, exist only in values array */
    GENERIC("GENERIC", "GENERIC", R.string.lbl_other),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER("OTHER", "GENERIC", R.string.lbl_other),
    /* JADX INFO: Fake field, exist only in values array */
    CYCLING_INDOOR("CYCLING", "INDOOR_CYCLING", R.string.lbl_bike_indoor),
    /* JADX INFO: Fake field, exist only in values array */
    TOETOTOE("WALKING", "CHALLENGE", R.string.device_settings_toe_to_toe_trademarked),
    /* JADX INFO: Fake field, exist only in values array */
    PILATES("FITNESS_EQUIPMENT", "PILATES", R.string.activity_type_pilates),
    /* JADX INFO: Fake field, exist only in values array */
    BREATHWORK("TRAINING", "BREATHING", R.string.activity_type_breathwork),
    /* JADX INFO: Fake field, exist only in values array */
    HIIT("HIIT", "GENERIC", R.string.lbl_hiit),
    /* JADX INFO: Fake field, exist only in values array */
    ROW_INDOOR("ROWING", "INDOOR_ROWING", R.string.lbl_row_indoor),
    /* JADX INFO: Fake field, exist only in values array */
    DANCE("DANCE", "GENERIC", R.string.dance_fitness),
    /* JADX INFO: Fake field, exist only in values array */
    MEDITATION("MEDITATION", "GENERIC", R.string.activity_type_meditation),
    /* JADX INFO: Fake field, exist only in values array */
    JUMP_ROPE("JUMP_ROPE", "GENERIC", R.string.lbl_jump_rope_activity);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1867a f97780d = new C1867a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f97783g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97786c;

    static {
        f97783g = new w13.c(new a[]{r0, new a("WALKING", "INDOOR_WALKING", R.string.lbl_walk_indoor), new a("RUNNING", "GENERIC", R.string.lbl_run), new a("CYCLING", "GENERIC", R.string.activity_options_bike_title), new a("RUNNING", "TREADMILL", R.string.lbl_treadmill), new a("RUNNING", "INDOOR_RUNNING", R.string.lbl_indoor_track), new a("TRAINING", "STRENGTH_TRAINING", R.string.lbl_strength), new a("TRAINING", "CARDIO_TRAINING", R.string.lbl_cardio), new a("FITNESS_EQUIPMENT", "ELLIPTICAL", R.string.lbl_elliptical), new a("SWIMMING", "LAP_SWIMMING", R.string.workout_pool_swim), new a("SWIMMING", "OPEN_WATER", R.string.lbl_open_water_swim), new a("FITNESS_EQUIPMENT", "STAIR_CLIMBING", R.string.lbl_stair_climbing), new a("TRAINING", "YOGA", R.string.activity_type_yoga), new a("GENERIC", "GENERIC", R.string.lbl_other), new a("OTHER", "GENERIC", R.string.lbl_other), new a("CYCLING", "INDOOR_CYCLING", R.string.lbl_bike_indoor), new a("WALKING", "CHALLENGE", R.string.device_settings_toe_to_toe_trademarked), new a("FITNESS_EQUIPMENT", "PILATES", R.string.activity_type_pilates), new a("TRAINING", "BREATHING", R.string.activity_type_breathwork), new a("HIIT", "GENERIC", R.string.lbl_hiit), new a("ROWING", "INDOOR_ROWING", R.string.lbl_row_indoor), new a("DANCE", "GENERIC", R.string.dance_fitness), new a("MEDITATION", "GENERIC", R.string.activity_type_meditation), new a("JUMP_ROPE", "GENERIC", R.string.lbl_jump_rope_activity)});
    }

    private a(String str, String str2, int i14) {
        super(str, i);
        this.f97784a = str;
        this.f97785b = str2;
        this.f97786c = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f97782f.clone();
    }

    /* JADX INFO: renamed from: j90.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj90/a$a;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1867a {
        public /* synthetic */ C1867a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(z80.g gVar) {
            Object next;
            gVar.getClass();
            w13.c cVar = a.f97783g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                a aVar = (a) next;
                if (u.q(aVar.f97784a, gVar.getSport(), true) && u.q(aVar.f97785b, gVar.getSubSport(), true)) {
                    return (a) next;
                }
            }
            next = null;
            return (a) next;
        }

        private C1867a() {
        }
    }
}
