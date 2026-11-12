package yr2;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199151a;

        static {
            int[] iArr = new int[qs2.f.values().length];
            try {
                iArr[qs2.f.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qs2.f.DEACTIVATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qs2.f.LOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qs2.f.ELIGIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qs2.f.PENDING_VERIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[qs2.f.PENDING_ACTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[qs2.f.ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[qs2.f.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[qs2.f.DISABLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f199151a = iArr;
        }
    }

    public static final br2.g a(qs2.f fVar) {
        switch (fVar == null ? -1 : a.f199151a[fVar.ordinal()]) {
            case 1:
                return br2.g.PAY_ENABLED;
            case 2:
                return br2.g.SUSPENDED;
            case 3:
                return br2.g.SUSPENDED_BY_ISSUER;
            case 4:
                return br2.g.ELIGIBLE;
            case 5:
                return br2.g.PENDING_VERIFICATION;
            case 6:
                return br2.g.PENDING_ACTIVE;
            case 7:
                return br2.g.ERROR;
            case 8:
                return br2.g.UNKNOWN;
            case 9:
                return br2.g.DISABLED;
            default:
                return br2.g.PAY_NOT_ENABLED;
        }
    }
}
