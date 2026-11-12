package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o5l {
    @Deprecated
    public void a(Throwable th) {
    }

    public final String b(Object obj) {
        try {
            return c(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName() + ".errorRendering";
        } catch (Throwable th) {
            pf8.d(th);
            return obj.getClass().getName() + ".errorRendering";
        }
    }

    public String c(Object obj) throws InterruptedException {
        return null;
    }
}
