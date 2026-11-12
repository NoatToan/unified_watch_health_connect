package q03;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g<T> implements b83.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f142048a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // b83.a
    public final void a(h hVar) {
        b(hVar);
    }

    public final void b(h<? super T> hVar) {
        int i14 = w03.b.f181178a;
        try {
            c(hVar);
        } catch (NullPointerException e4) {
            throw e4;
        } catch (Throwable th3) {
            t03.a.a(th3);
            k13.a.b(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    public abstract void c(h hVar);
}
