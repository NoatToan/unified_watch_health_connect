package l73;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f111411a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f111412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f111413c;

    public b(c cVar) {
        this.f111412b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVarB;
        while (true) {
            try {
                try {
                    j jVar = this.f111411a;
                    synchronized (jVar) {
                        try {
                            if (jVar.f111450a == null) {
                                jVar.wait(1000);
                            }
                            iVarB = jVar.b();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (iVarB == null) {
                        synchronized (this) {
                            iVarB = this.f111411a.b();
                            if (iVarB == null) {
                                this.f111413c = false;
                                this.f111413c = false;
                                return;
                            }
                        }
                    }
                    this.f111412b.d(iVarB);
                } catch (InterruptedException e4) {
                    this.f111412b.f111432p.a(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e4);
                    this.f111413c = false;
                    return;
                }
            } catch (Throwable th4) {
                this.f111413c = false;
                throw th4;
            }
        }
    }
}
