package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nqh f30643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nqh f30644b;

    public synchronized void a(nqh nqhVar) {
        try {
            if (nqhVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            nqh nqhVar2 = this.f30644b;
            if (nqhVar2 != null) {
                nqhVar2.c = nqhVar;
                this.f30644b = nqhVar;
            } else {
                if (this.f30643a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f30644b = nqhVar;
                this.f30643a = nqhVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized nqh b() {
        nqh nqhVar;
        nqhVar = this.f30643a;
        if (nqhVar != null) {
            nqh nqhVar2 = nqhVar.c;
            this.f30643a = nqhVar2;
            if (nqhVar2 == null) {
                this.f30644b = null;
            }
        }
        return nqhVar;
    }

    public synchronized nqh c(int i) throws InterruptedException {
        try {
            if (this.f30643a == null) {
                wait(i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b();
    }
}
