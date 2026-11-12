package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class lcr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static kcr f24913a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f24914b = false;

    static {
        try {
            f24913a = (kcr) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            f24914b = true;
        } catch (Throwable unused) {
            f24914b = false;
        }
    }

    public static kcr a() {
        return f24913a;
    }
}
