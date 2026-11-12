package t70;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f162847a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.MOVE_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.MOVE_DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.MOVE_TO_HOME_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.REMOVE_FROM_HOME_SCREEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d.REMOVE_FROM_AT_A_GLANCE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f162847a = iArr;
    }
}
