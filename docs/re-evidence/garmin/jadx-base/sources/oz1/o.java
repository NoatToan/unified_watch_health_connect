package oz1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f134596a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.GOOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.VERY_GOOD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.MODERATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.POOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[n.VERY_POOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f134596a = iArr;
    }
}
