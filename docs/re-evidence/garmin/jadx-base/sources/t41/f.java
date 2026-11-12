package t41;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 t41.f[], still in use, count: 1, list:
  (r0v1 t41.f[]) from 0x0062: CONSTRUCTOR (r0v1 t41.f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lt41/f;", "", "", "labelResId", "", "distanceInMeters", "<init>", "(Ljava/lang/String;IID)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    FIVE_K(R.string.pacepro_lbl_distance_5k, 5000.0d),
    TEN_K(R.string.pacepro_lbl_distance_10k, 10000.0d),
    HALF_MARATHON(R.string.pacepro_lbl_distance_half_marathon, 21097.5d),
    MARATHON(R.string.pacepro_lbl_distance_marathon, 42195.0d),
    OTHER(R.string.pacepro_lbl_distance_other, 10000.0d);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f162282c = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w13.c f162289j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f162290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f162291b;

    static {
        f162289j = new w13.c(new f[]{r0, r1, r2, r3, r4});
    }

    private f(int i14, double d14) {
        super(str, i);
        this.f162290a = i14;
        this.f162291b = d14;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f162288i.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt41/f$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static int a(double d14, boolean z14) {
            if (4995.0d <= d14 && d14 <= 5005.0d) {
                return ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            }
            if (9995.0d <= d14 && d14 <= 10005.0d) {
                if (z14) {
                    return 3355;
                }
                return AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
            }
            if (21092.5d <= d14 && d14 <= 21102.5d) {
                return 7200;
            }
            if (42190.0d <= d14 && d14 <= 42200.0d) {
                return 14400;
            }
            return MathKt.b((d14 / ((double) 1000)) * ((double) 60) * 5.592340730136005d);
        }

        public static f b(double d14) {
            if (4995.0d <= d14 && d14 <= 5005.0d) {
                return f.FIVE_K;
            }
            if (9995.0d <= d14 && d14 <= 10005.0d) {
                return f.TEN_K;
            }
            if (21092.5d > d14 || d14 > 21102.5d) {
                return (42190.0d > d14 || d14 > 42200.0d) ? f.OTHER : f.MARATHON;
            }
            return f.HALF_MARATHON;
        }

        private a() {
        }
    }
}
