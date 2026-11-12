package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class wb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f37791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static vb1 f37792b;

    public static vb1 a(f0i f0iVar, bg8 bg8Var, yl4<c93, u14> yl4Var, boolean z) {
        if (!f37791a) {
            try {
                f37792b = (vb1) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(f0i.class, bg8.class, yl4.class, Boolean.TYPE).newInstance(f0iVar, bg8Var, yl4Var, Boolean.valueOf(z));
            } catch (Throwable unused) {
            }
            if (f37792b != null) {
                f37791a = true;
            }
        }
        return f37792b;
    }
}
