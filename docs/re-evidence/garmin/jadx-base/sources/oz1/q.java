package oz1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f134608a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.GOOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.VERY_GOOD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p.MODERATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p.POOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[p.VERY_POOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f134608a = iArr;
    }
}
