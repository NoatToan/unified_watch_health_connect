package py2;

import com.google.firebase.messaging.Constants;
import lc.u0;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 py2.e[], still in use, count: 1, list:
  (r0v1 py2.e[]) from 0x0084: CONSTRUCTOR (r0v1 py2.e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpy2/e;", "", "<init>", "(Ljava/lang/String;I)V", "mobile-uac-css"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {
    PRIMARY,
    ON_PRIMARY,
    BACKGROUND,
    ON_BACKGROUND,
    SURFACE,
    SURFACE_VARIANT,
    SURFACE_VARIANT_2,
    ON_SURFACE,
    ERROR,
    ON_ERROR,
    SUCCESS,
    ON_SUCCESS;


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w13.c f141902n;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141903a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.ON_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.ON_BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.SURFACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.SURFACE_VARIANT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.SURFACE_VARIANT_2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e.ON_SURFACE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[e.ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[e.ON_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[e.SUCCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[e.ON_SUCCESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f141903a = iArr;
        }
    }

    static {
        f141902n = new w13.c(eVarArr);
    }

    private e() {
        super(str, i);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f141901m.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (a.f141903a[ordinal()]) {
            case 1:
                return "primary";
            case 2:
                return "onPrimary";
            case 3:
                return "background";
            case 4:
                return "onBackground";
            case 5:
                return "surface";
            case 6:
                return "surfaceVariant";
            case 7:
                return "surfaceVariant2";
            case 8:
                return "onSurface";
            case 9:
                return Constants.IPC_BUNDLE_KEY_SEND_ERROR;
            case 10:
                return "onError";
            case 11:
                return "success";
            case 12:
                return "onSuccess";
            default:
                u0.r();
                return null;
        }
    }
}
