package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wdp {
    public static RuntimeException a(Throwable th) throws Throwable {
        c((Throwable) b6i.g(th));
        throw new RuntimeException(th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <X extends Throwable> void b(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    public static void c(Throwable th) throws Throwable {
        b(th, Error.class);
        b(th, RuntimeException.class);
    }
}
