package j11;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f96411a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.INCORRECT_FOOD_NAME_OR_BRAND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.INCORRECT_NUTRITION_INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.MISSING_SERVING_SIZE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f96411a = iArr;
    }
}
