package d91;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f58610a;

    static {
        int[] iArr = new int[o70.s.values().length];
        try {
            iArr[o70.s.SYNC_END.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o70.s.PULL_TO_REFRESH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o70.s.ON_RESUME_AFTER_DAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o70.s.EXTERNAL_EVENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[o70.s.UNSPECIFIED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f58610a = iArr;
    }
}
