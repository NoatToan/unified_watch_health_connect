package j10;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 j10.d[], still in use, count: 1, list:
  (r0v1 j10.d[]) from 0x009c: CONSTRUCTOR (r0v1 j10.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lj10/d;", "", "", "actTypeId", "metricId", "resId", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {
    TOTAL_STEPS(0, 29, R.string.user_stride_total_steps),
    WALKING_DISTANCE(9, 17, R.string.lbl_walking_distance),
    RUNNING_DISTANCE(1, 17, R.string.lbl_running_distance),
    CYCLING_DISTANCE(2, 17, R.string.lbl_cycling_distance),
    SWIMMING_DISTANCE(26, 17, R.string.lbl_swimming_distance),
    TOTAL_DISTANCE(0, 17, R.string.lbl_total_distance),
    ACTIVE_CALORIES_BURNED(0, 22, R.string.lbl_active_calories),
    TOTAL_PUSHES(0, 87, R.string.lbl_total_pushes),
    PUSHING_DISTANCE(199, 17, R.string.activity_type_parasports);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f96350d = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w13.c f96361o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f96364c;

    static {
        f96361o = new w13.c(new d[]{r0, r1, r2, r3, r4, r5, r6, r7, r8});
    }

    private d(int i14, int i15, int i16) {
        super(str, i);
        this.f96362a = i14;
        this.f96363b = i15;
        this.f96364c = i16;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f96360n.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj10/d$a;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: j10.d$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1842a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f96365a;

            static {
                int[] iArr = new int[d.values().length];
                try {
                    iArr[d.RUNNING_DISTANCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.CYCLING_DISTANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d.WALKING_DISTANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[d.PUSHING_DISTANCE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[d.TOTAL_DISTANCE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[d.TOTAL_STEPS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[d.TOTAL_PUSHES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[d.SWIMMING_DISTANCE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[d.ACTIVE_CALORIES_BURNED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                f96365a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static d a(String str) {
            if (str == null) {
                return null;
            }
            w13.c cVar = d.f96361o;
            cVar.getClass();
            int length = p005kotlin.jvm.internal.i.d(cVar, new d[0]).length;
            for (int i14 = 0; i14 < length; i14++) {
                w13.c cVar2 = d.f96361o;
                if (str.equals(((d) cVar2.get(i14)).name())) {
                    return (d) cVar2.get(i14);
                }
            }
            return null;
        }

        private a() {
        }
    }
}
