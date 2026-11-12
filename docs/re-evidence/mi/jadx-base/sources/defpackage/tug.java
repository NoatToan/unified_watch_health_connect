package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class tug implements uy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static tug f35055a;

    public static synchronized tug b() {
        try {
            if (f35055a == null) {
                f35055a = new tug();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f35055a;
    }

    @Override // defpackage.uy6
    public void a(ty6 ty6Var) {
    }
}
