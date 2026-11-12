package de.greenrobot.event;

/* JADX INFO: loaded from: classes22.dex */
final class e {
    private d a;
    private d b;

    public synchronized void a(d dVar) {
        try {
            if (dVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            d dVar2 = this.b;
            if (dVar2 != null) {
                dVar2.c = dVar;
                this.b = dVar;
            } else {
                if (this.a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.b = dVar;
                this.a = dVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized d b() {
        d dVar;
        dVar = this.a;
        if (dVar != null) {
            d dVar2 = dVar.c;
            this.a = dVar2;
            if (dVar2 == null) {
                this.b = null;
            }
        }
        return dVar;
    }

    public synchronized d c(int i) throws InterruptedException {
        if (this.a == null) {
            wait(i);
        }
        return b();
    }
}
