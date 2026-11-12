package dm0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 dm0.a[], still in use, count: 1, list:
  (r0v1 dm0.a[]) from 0x00a9: CONSTRUCTOR (r0v1 dm0.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ldm0/a;", "", "", "manifestText", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    WRITE_ACTIVE_CALORIES_BURNED("android.permission.health.WRITE_ACTIVE_CALORIES_BURNED"),
    WRITE_BODY_FAT("android.permission.health.WRITE_BODY_FAT"),
    WRITE_DISTANCE("android.permission.health.WRITE_DISTANCE"),
    WRITE_ELEVATION_GAINED("android.permission.health.WRITE_ELEVATION_GAINED"),
    WRITE_EXERCISE("android.permission.health.WRITE_EXERCISE"),
    WRITE_FLOORS_CLIMBED("android.permission.health.WRITE_FLOORS_CLIMBED"),
    WRITE_HEART_RATE("android.permission.health.WRITE_HEART_RATE"),
    WRITE_RESTING_HEART_RATE("android.permission.health.WRITE_RESTING_HEART_RATE"),
    WRITE_SLEEP("android.permission.health.WRITE_SLEEP"),
    WRITE_SPEED("android.permission.health.WRITE_SPEED"),
    WRITE_STEPS("android.permission.health.WRITE_STEPS"),
    WRITE_TOTAL_CALORIES_BURNED("android.permission.health.WRITE_TOTAL_CALORIES_BURNED"),
    WRITE_WEIGHT("android.permission.health.WRITE_WEIGHT");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1281a f60428b = new C1281a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ c f60443q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60444a;

    static {
        f60443q = new c(new a[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12});
    }

    private a(String str) {
        super(str, i);
        this.f60444a = str;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f60442p.clone();
    }

    /* JADX INFO: renamed from: dm0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldm0/a$a;", "", "<init>", "()V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1281a {
        public /* synthetic */ C1281a(j jVar) {
            this();
        }

        private C1281a() {
        }
    }
}
