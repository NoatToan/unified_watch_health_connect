package ev0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f66159a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.SAVED_ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.SAVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f66159a = iArr;
    }
}
