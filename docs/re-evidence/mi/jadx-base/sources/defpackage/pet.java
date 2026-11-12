package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class pet extends bct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fht f30338b;

    public pet(fht fhtVar) {
        this.f30338b = fhtVar;
    }

    @Override // defpackage.bct
    public final void a() {
        synchronized (this.f30338b.f) {
            try {
                if (this.f30338b.f17800k.get() > 0 && this.f30338b.f17800k.decrementAndGet() > 0) {
                    this.f30338b.f17799b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                fht fhtVar = this.f30338b;
                if (fhtVar.m != null) {
                    fhtVar.f17799b.d("Unbind from service.", new Object[0]);
                    fht fhtVar2 = this.f30338b;
                    fhtVar2.f17798a.unbindService(fhtVar2.l);
                    this.f30338b.g = false;
                    this.f30338b.m = null;
                    this.f30338b.l = null;
                }
                this.f30338b.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
