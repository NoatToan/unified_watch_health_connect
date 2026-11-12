package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vsk<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final prk<T> f37191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f37192b;

    public vsk(prk<T> prkVar, Throwable th) {
        this.f37191a = prkVar;
        this.f37192b = th;
    }

    public static <T> vsk<T> a(Throwable th) {
        if (th != null) {
            return new vsk<>(null, th);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> vsk<T> b(prk<T> prkVar) {
        if (prkVar != null) {
            return new vsk<>(prkVar, null);
        }
        throw new NullPointerException("response == null");
    }
}
