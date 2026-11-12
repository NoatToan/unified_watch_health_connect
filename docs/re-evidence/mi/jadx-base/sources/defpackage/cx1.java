package defpackage;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class cx1 implements Runnable, z4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pqh f14815a = new pqh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ld8 f14816b;
    public volatile boolean c;

    public cx1(ld8 ld8Var) {
        this.f14816b = ld8Var;
    }

    @Override // defpackage.z4i
    public void a(ioo iooVar, Object obj) {
        nqh nqhVarA = nqh.a(iooVar, obj);
        synchronized (this) {
            try {
                this.f14815a.a(nqhVarA);
                if (!this.c) {
                    this.c = true;
                    this.f14816b.d().execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    nqh nqhVarC = this.f14815a.c(1000);
                    if (nqhVarC == null) {
                        synchronized (this) {
                            nqhVarC = this.f14815a.b();
                            if (nqhVarC == null) {
                                this.c = false;
                                this.c = false;
                                return;
                            }
                        }
                    }
                    this.f14816b.g(nqhVarC);
                } catch (InterruptedException e) {
                    this.f14816b.e().b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e);
                    this.c = false;
                    return;
                }
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }
}
