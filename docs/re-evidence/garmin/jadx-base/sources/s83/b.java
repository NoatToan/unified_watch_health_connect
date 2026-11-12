package s83;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f157954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f157955b;

    static {
        int iIntValue;
        try {
            iIntValue = ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            iIntValue = 0;
        }
        f157954a = iIntValue;
        f157955b = iIntValue != 0;
    }

    private b() {
        throw new IllegalStateException("No instances!");
    }
}
