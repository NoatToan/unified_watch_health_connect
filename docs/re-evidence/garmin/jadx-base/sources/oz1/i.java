package oz1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f134560a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.GOOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.VERY_GOOD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.MODERATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.POOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h.VERY_POOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f134560a = iArr;
    }
}
