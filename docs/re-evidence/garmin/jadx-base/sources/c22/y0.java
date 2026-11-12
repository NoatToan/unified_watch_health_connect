package c22;

/* JADX INFO: loaded from: classes10.dex */
public final class y0 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23754a;

        static {
            int[] iArr = new int[lj0.c.values().length];
            f23754a = iArr;
            try {
                iArr[lj0.c.OAUTH_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23754a[lj0.c.CONNECT_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23754a[lj0.c.IO_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23754a[lj0.c.SSL_EXCEPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23754a[lj0.c.ERROR_CODE_RESPONSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23754a[lj0.c.NULL_GC_DATA_RESPONSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23754a[lj0.c.JSON_EXCEPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23754a[lj0.c.UNKNOWN_EXCEPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private y0() {
    }

    public static void a(d80.f fVar) {
        if (fVar == null || fVar.c()) {
            return;
        }
        fVar.a();
    }

    public static com.garmin.android.library.backgroundtaskmanagement.b.c b(lj0.b bVar) {
        if (bVar == null) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        switch (a.f23754a[bVar.f112957a.ordinal()]) {
            case 1:
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNAUTHORIZED;
            case 2:
                return com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE;
            case 3:
            case 4:
                return com.garmin.android.library.backgroundtaskmanagement.b.c.RECOVERABLE;
            case 5:
                int i14 = bVar.f112958b;
                if (i14 == 401) {
                    return com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHENTICATED;
                }
                if (i14 == 403) {
                    return com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHORIZED;
                }
                break;
            case 6:
            case 7:
            case 8:
                break;
            default:
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
    }
}
