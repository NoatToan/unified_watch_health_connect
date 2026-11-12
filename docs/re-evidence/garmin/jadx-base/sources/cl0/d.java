package cl0;

import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import gg1.o0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 cl0.d[], still in use, count: 1, list:
  (r0v1 cl0.d[]) from 0x003b: CONSTRUCTOR (r0v1 cl0.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcl0/d;", "", "", "jsonValue", "", "swingSpeedUnitResId", "Lc22/q3;", "unit", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILc22/q3;)V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {
    METER_PER_SEC("metric_mps", R.string.common_mps_string, q3.METERS_PER_SECOND),
    KILOMETER_PER_HOUR("metric", R.string.common_kph_string, q3.KILOMETER_PER_HOUR),
    MILE_PER_HOUR("statute_us", R.string.common_mph_string, q3.MILE_PER_HOUR);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27928c = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f27933h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3 f27935b;

    static {
        f27933h = new w13.c(new d[]{r0, r1, r2});
    }

    private d(String str, int i14, q3 q3Var) {
        super(str, i);
        this.f27934a = str;
        this.f27935b = q3Var;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f27932g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcl0/d$a;", "", "<init>", "()V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: cl0.d$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0426a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27936a;

            static {
                int[] iArr = new int[o0.values().length];
                try {
                    iArr[o0.STATUTE_US.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o0.STATUTE_UK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[o0.METRIC.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f27936a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
