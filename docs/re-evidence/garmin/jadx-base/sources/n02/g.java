package n02;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 n02.g[], still in use, count: 1, list:
  (r0v1 n02.g[]) from 0x0022: CONSTRUCTOR (r0v1 n02.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln02/g;", "", "", "labelResId", "<init>", "(Ljava/lang/String;II)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {
    KILOMETERS(R.string.lbl_km),
    MILES(R.string.lbl_mile);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w13.c f122178e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f122179a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122180a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.KILOMETERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.MILES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f122180a = iArr;
        }
    }

    static {
        f122178e = new w13.c(gVarArr);
    }

    private g(int i14) {
        super(str, i);
        this.f122179a = i14;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f122177d.clone();
    }

    public final double a(double d14) {
        int i14 = a.f122180a[ordinal()];
        if (i14 == 1) {
            l3.f23124b.getClass();
            return d14 / 1000.0d;
        }
        if (i14 == 2) {
            l3.f23124b.getClass();
            return d14 / 1609.344d;
        }
        u0.r();
        return 0.0d;
    }

    public final double b(double d14) {
        int i14 = a.f122180a[ordinal()];
        if (i14 == 1) {
            l3.f23124b.getClass();
            return d14 * 1000.0d;
        }
        if (i14 == 2) {
            l3.f23124b.getClass();
            return d14 * 1609.344d;
        }
        u0.r();
        return 0.0d;
    }
}
