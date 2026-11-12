package gv;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f79151a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.SECURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f79151a = iArr;
    }
}
