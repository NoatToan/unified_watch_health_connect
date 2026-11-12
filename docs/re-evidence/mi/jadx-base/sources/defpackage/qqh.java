package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public oqh f31748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oqh f31749b;

    public synchronized void a(oqh oqhVar) {
        try {
            if (oqhVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            oqh oqhVar2 = this.f31749b;
            if (oqhVar2 != null) {
                oqhVar2.c = oqhVar;
                this.f31749b = oqhVar;
            } else {
                if (this.f31748a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f31749b = oqhVar;
                this.f31748a = oqhVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized oqh b() {
        oqh oqhVar;
        oqhVar = this.f31748a;
        if (oqhVar != null) {
            oqh oqhVar2 = oqhVar.c;
            this.f31748a = oqhVar2;
            if (oqhVar2 == null) {
                this.f31749b = null;
            }
        }
        return oqhVar;
    }

    public synchronized oqh c(int i) throws InterruptedException {
        try {
            if (this.f31748a == null) {
                wait(i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b();
    }
}
