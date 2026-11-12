package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dx1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qqh f16018a = new qqh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd8 f16019b;
    public volatile boolean c;

    public dx1(kd8 kd8Var) {
        this.f16019b = kd8Var;
    }

    public void a(loo looVar, Object obj) {
        oqh oqhVarA = oqh.a(looVar, obj);
        synchronized (this) {
            try {
                this.f16018a.a(oqhVarA);
                if (!this.c) {
                    this.c = true;
                    this.f16019b.c().execute(this);
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
                    oqh oqhVarC = this.f16018a.c(1000);
                    if (oqhVarC == null) {
                        synchronized (this) {
                            oqhVarC = this.f16018a.b();
                            if (oqhVarC == null) {
                                this.c = false;
                                this.c = false;
                                return;
                            }
                        }
                    }
                    this.f16019b.e(oqhVarC);
                } catch (InterruptedException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Thread.currentThread().getName());
                    sb.append(" was interruppted");
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
