package y12;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y12.a[], still in use, count: 1, list:
  (r0v1 y12.a[]) from 0x00ff: CONSTRUCTOR (r0v1 y12.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ly12/a;", "", "", Action.KEY_ATTRIBUTE, "", "resourceId", "nameResourceId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING("running", R.drawable.run, R.string.lbl_running),
    /* JADX INFO: Fake field, exist only in values array */
    CYCLING("cycling", R.drawable.bike, R.string.lbl_cycling),
    /* JADX INFO: Fake field, exist only in values array */
    MOUNTAIN_BIKING("mountain_biking", R.drawable.mountain_bike, R.string.lbl_mountain_biking),
    /* JADX INFO: Fake field, exist only in values array */
    SWIMMING("swimming", R.drawable.swim_pool, R.string.lbl_swimming),
    /* JADX INFO: Fake field, exist only in values array */
    TRIATHLON("triathlon", R.drawable.three_sport, R.string.lbl_triathlon),
    /* JADX INFO: Fake field, exist only in values array */
    DUATHLON("duathlon", R.drawable.two_sport, R.string.lbl_duathlon),
    /* JADX INFO: Fake field, exist only in values array */
    WALKING("walking", R.drawable.walk, R.string.lbl_walking),
    /* JADX INFO: Fake field, exist only in values array */
    HIKING("hiking", R.drawable.hike, R.string.lbl_hiking),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_TRAINING("cross_training", R.drawable.cardio, R.string.lbl_cross_training),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINING("weight_training", R.drawable.strength, R.string.lbl_strength),
    /* JADX INFO: Fake field, exist only in values array */
    SNOW_SPORTS("snow_sports", R.drawable.ski, R.string.lbl_snow_sports),
    /* JADX INFO: Fake field, exist only in values array */
    PARA_SPORTS("para_sports", R.drawable.run_para, R.string.activity_type_parasports),
    /* JADX INFO: Fake field, exist only in values array */
    WATER_SPORTS("water_sports", R.drawable.water_sports, R.string.lbl_water_sports),
    /* JADX INFO: Fake field, exist only in values array */
    GOLF("golf", R.drawable.golf, R.string.lbl_golf),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER("other", R.drawable.other_activity, R.string.lbl_other);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3619a f194022d = new C3619a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f194024f = new w13.c(new a[]{new a("running", R.drawable.run, R.string.lbl_running), new a("cycling", R.drawable.bike, R.string.lbl_cycling), new a("mountain_biking", R.drawable.mountain_bike, R.string.lbl_mountain_biking), new a("swimming", R.drawable.swim_pool, R.string.lbl_swimming), new a("triathlon", R.drawable.three_sport, R.string.lbl_triathlon), new a("duathlon", R.drawable.two_sport, R.string.lbl_duathlon), new a("walking", R.drawable.walk, R.string.lbl_walking), new a("hiking", R.drawable.hike, R.string.lbl_hiking), new a("cross_training", R.drawable.cardio, R.string.lbl_cross_training), new a("weight_training", R.drawable.strength, R.string.lbl_strength), new a("snow_sports", R.drawable.ski, R.string.lbl_snow_sports), new a("para_sports", R.drawable.run_para, R.string.activity_type_parasports), new a("water_sports", R.drawable.water_sports, R.string.lbl_water_sports), new a("golf", R.drawable.golf, R.string.lbl_golf), new a("other", R.drawable.other_activity, R.string.lbl_other)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f194026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f194027c;

    static {
    }

    private a(String str, int i14, int i15) {
        super(str, i);
        this.f194025a = str;
        this.f194026b = i14;
        this.f194027c = i15;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f194023e.clone();
    }

    /* JADX INFO: renamed from: y12.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly12/a$a;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3619a {
        public /* synthetic */ C3619a(j jVar) {
            this();
        }

        private C3619a() {
        }
    }
}
