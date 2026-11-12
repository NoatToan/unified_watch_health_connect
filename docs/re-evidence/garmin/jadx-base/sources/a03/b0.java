package a03;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f69a;

    static {
        int[] iArr = new int[y.values().length];
        try {
            iArr[y.Hidden.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y.FullyExpanded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y.IntermediatelyExpanded.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[y.SlightlyExpanded.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f69a = iArr;
    }
}
